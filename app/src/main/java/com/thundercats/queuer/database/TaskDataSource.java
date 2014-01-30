package com.thundercats.queuer.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.thundercats.queuer.models.Task;

import java.util.ArrayList;
import java.util.Date;

/**
 * The class responsible for saving {@link com.thundercats.queuer.models.Task}s locally.
 *
 * @author Kevin Chen
 */
public class TaskDataSource {
    // Database fields
    private SQLiteDatabase database;
    private TaskOpenHelper dbHelper;
    private String[] allColumns = {TaskOpenHelper.COLUMN_ID,
            TaskOpenHelper.COLUMN_SERVER_ID,
            TaskOpenHelper.COLUMN_PROJECT_SERVER_ID,
            TaskOpenHelper.COLUMN_TEXT,
            TaskOpenHelper.COLUMN_COMPLETED,
            TaskOpenHelper.COLUMN_POSITION,
            TaskOpenHelper.COLUMN_CREATED,
            TaskOpenHelper.COLUMN_UPDATED};

    /**
     * Initializes the {@link com.thundercats.queuer.database.TaskOpenHelper}.
     */
    public TaskDataSource(Context context) {
        dbHelper = new TaskOpenHelper(context);
    }

    /**
     * Initializes the {@code SQLiteDatabase}.
     */
    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    /**
     * Closes the {@link com.thundercats.queuer.database.TaskOpenHelper}.
     */
    public void close() {
        dbHelper.close();
    }

    /**
     * Deletes all {@code Task}s in the database.
     */
    public void deleteAllTasks() {
        database.delete(TaskOpenHelper.TABLE_TASKS, "1", null);
    }

    /**
     * Returns a row of cells that defines a particular {@code Task}
     *
     * @param text      The name of the {@code Task}.
     * @param projectId The server ID of the {@code Project} to which the {@code Task} belongs.
     * @param serverId  The server ID of the {@code Task}.
     * @param position  The position of the {@code Task}.
     * @param completed Whether or not the {@code Task} is finished.
     * @return The {@code ContentValues} object that maps column names ({@code Task} fields)
     * to new column values.
     */
    private ContentValues createContentValues(String text, int projectId, int serverId,
                                              int position, boolean completed) {
        ContentValues values = new ContentValues();
        values.put(TaskOpenHelper.COLUMN_SERVER_ID, serverId);
        values.put(TaskOpenHelper.COLUMN_PROJECT_SERVER_ID, projectId);
        values.put(TaskOpenHelper.COLUMN_POSITION, position);
        values.put(TaskOpenHelper.COLUMN_COMPLETED, completed ? 1 : 0);
        values.put(TaskOpenHelper.COLUMN_TEXT, text);
        return values;
    }

    /**
     * Writes a {@code Task} to database, given {@code Task} parameters.
     *
     * @param text      The name of the {@code Task}.
     * @param projectId The server ID of the {@code Project} to which the {@code Task} belongs.
     * @param serverId  The server ID of the {@code Task}.
     * @param position  The position of the {@code Task}.
     * @param completed Whether or not the {@code Task} is finished.
     * @return The {@code Task} that was just inserted into the database.
     */
    public Task createTask(String text, int projectId, int serverId, int position, boolean completed) {
        // create the row of cells
        ContentValues taskRow = createContentValues(text, projectId, serverId, position, completed);
        // insert the row of cells
        long insertId = database.insert(TaskOpenHelper.TABLE_TASKS, null, taskRow);
        // get a cursor over the inserted row
        Cursor cursor = database.query(
                // the table name to compile the query against
                TaskOpenHelper.TABLE_TASKS,
                // a list of which columns to return
                allColumns,
                // WHERE clause - filter declaring which rows to return
                TaskOpenHelper.COLUMN_ID + " = " + insertId,
                null, null, null, null);
        cursor.moveToFirst();
        Task newTask = cursorToTask(cursor);
        cursor.close();
        return newTask;
    }

    /**
     * Updates a {@code Task}'s name.
     *
     * @param task The {@code Task} to update; its local ID is used to find its row in the database.
     * @param name The {@code Task}'s new name.
     */
    public void updateTaskName(Task task, String name) {
        ContentValues values = new ContentValues();
        values.put(TaskOpenHelper.COLUMN_TEXT, name);
        update(task, values);
    }

    /**
     * Updates a {@code Task}'s position.
     *
     * @param task     The {@code Task} to update; its local ID is used to find its row in the database.
     * @param position The {@code Task}'s new position.
     */
    public void updateTaskPosition(Task task, int position) {
        ContentValues values = new ContentValues();
        values.put(TaskOpenHelper.COLUMN_POSITION, position);
        update(task, values);
    }

    /**
     * Updates a {@code Task}'s finished status.
     *
     * @param task     The {@code Task} to update; its local ID is used to find its row in the database.
     * @param finished Whether or not the {@code Task} is finished.
     */
    public void updateTaskFinished(Task task, boolean finished) {
        ContentValues values = new ContentValues();
        values.put(TaskOpenHelper.COLUMN_COMPLETED, finished ? 1 : 0);
        update(task, values);
    }

    /**
     * Updates the date when the {@code Task} was last updated.
     *
     * @param task        The {@code Task} to update;
     *                    its local ID is used to find its row in the database.
     * @param lastUpdated When the {@code Task} was last updated.
     *                    The date is stored as a string.
     */
    public void updateTaskLastUpdated(Task task, Date lastUpdated) {
        ContentValues values = new ContentValues();
        values.put(TaskOpenHelper.COLUMN_UPDATED, lastUpdated.getTime());
        update(task, values);
    }

    /**
     * Updates a task.
     *
     * @param task Uses getters to update a {@code Task}'s row in the database.
     */
    public void updateTask(Task task) {
        ContentValues values = new ContentValues();
        values.put(TaskOpenHelper.COLUMN_SERVER_ID, task.getLocalId());
        values.put(TaskOpenHelper.COLUMN_PROJECT_SERVER_ID, task.getProject_id());
        values.put(TaskOpenHelper.COLUMN_TEXT, task.getName());
        values.put(TaskOpenHelper.COLUMN_COMPLETED, task.isFinished() ? 1 : 0);
        values.put(TaskOpenHelper.COLUMN_POSITION, task.getPosition());
        values.put(TaskOpenHelper.COLUMN_CREATED, task.getCreated_at().getTime());
        values.put(TaskOpenHelper.COLUMN_UPDATED, task.getUpdated_at().getTime());

        update(task, values);
    }

    /**
     * Deletes a {@code Task} from the SQL database.
     *
     * @param task The {@code Task} to delete.
     */
    public void deleteTask(Task task) {
        String[] whereArgs = new String[]{Integer.toString(task.getLocalId())};
        database.delete(TaskOpenHelper.TABLE_TASKS,
                TaskOpenHelper.COLUMN_ID + " = ?",
                whereArgs);
    }

    /**
     * Returns a list of all {@code Task}s that belong to a certain {@code Project}.
     *
     * @param projectServerID Returns tasks that all share the same project server ID.
     * @return A list
     */
    public ArrayList<Task> getUnfinishedTasks(int projectServerID) {
        ArrayList<Task> unfinishedTasks = new ArrayList<Task>();
        // Cursor over rows whose projectServerIDs match the param
        Cursor cursor = query(TaskOpenHelper.COLUMN_PROJECT_SERVER_ID + " = ?",
                new String[]{String.valueOf(projectServerID)});
        // Look at the first Task
        if (cursor.moveToFirst()) {
            Task firstTask = cursorToTask(cursor);
            if (!firstTask.isFinished())
                unfinishedTasks.add(firstTask);
            // Look at all subsequent Tasks
            while (cursor.moveToNext()) {
                Task nextTask = cursorToTask(cursor);
                if (!nextTask.isFinished())
                    unfinishedTasks.add(nextTask);
            }
        }
        cursor.close();
        return unfinishedTasks;
    }

    /**
     * Returns a list of all {@code Task}s that belong to a certain project.
     *
     * @param projectServerID Returns tasks that all share the same project server ID.
     * @return A list of all {@code Task}s in the SQL database that belong to a certain project.
     */
    public ArrayList<Task> getTasks(int projectServerID) {
        ArrayList<Task> tasks = new ArrayList<Task>();
        // Cursor over rows whose projectServerIDs match the param
        Cursor cursor = query(TaskOpenHelper.COLUMN_PROJECT_SERVER_ID + " = ?",
                new String[]{String.valueOf(projectServerID)});
        // Add the tasks to the list, scanning row by row
        if (cursor.moveToFirst()) {
            tasks.add(cursorToTask(cursor));
            while (cursor.moveToNext()) {
                tasks.add(cursorToTask(cursor));
            }
        }
        cursor.close();
        return tasks;
    }

    /**
     * Returns all {@code Task}s in the database.
     *
     * @return All {@code Task}s in the database.
     */
    public ArrayList<Task> getAllTasks() {
        ArrayList<Task> tasks = new ArrayList<Task>();
        // A cursor over the entire database
        Cursor cursor = query(null);
        // Add the tasks to the list, scanning row by row
        if (cursor.moveToFirst()) {
            tasks.add(cursorToTask(cursor));
            while (cursor.moveToNext()) {
                tasks.add(cursorToTask(cursor));
            }
        }
        cursor.close();
        return tasks;
    }

    /**
     * A {@code Task} built from a single row in the SQL database.
     *
     * @param cursor The cursor over the result set must have all of the right columns.
     * @return A {@code Task} built from a single row in the SQL database.
     */
    private Task cursorToTask(Cursor cursor) {
        int localID = cursor.getInt(cursor.getColumnIndex(TaskOpenHelper.COLUMN_ID));
        int serverID = cursor.getInt(cursor.getColumnIndex(TaskOpenHelper.COLUMN_SERVER_ID));
        int projectID = cursor.getInt(cursor.getColumnIndex(TaskOpenHelper.COLUMN_PROJECT_SERVER_ID));
        String name = cursor.getString(cursor.getColumnIndex(TaskOpenHelper.COLUMN_TEXT));
        boolean finished = 1 == cursor.getInt(cursor.getColumnIndex(TaskOpenHelper.COLUMN_COMPLETED));
        int position = cursor.getInt(cursor.getColumnIndex(TaskOpenHelper.COLUMN_POSITION));
        String created = cursor.getString(cursor.getColumnIndex(TaskOpenHelper.COLUMN_CREATED));
        String updated = cursor.getString(cursor.getColumnIndex(TaskOpenHelper.COLUMN_UPDATED));
        Date created_at = (created == null) ? null : new Date(Long.valueOf(created));
        Date updated_at = (updated == null) ? null : new Date(Long.valueOf(updated));
        return new Task(localID, serverID, projectID, name, finished, position, created_at, updated_at);
    }

    /**
     * Return a cursor over the entire database.
     *
     * @param selection Specifies which rows should be filtered.
     * @return A cursor of rows selected from the database.
     */
    private Cursor query(String selection) {
        return database.query(TaskOpenHelper.TABLE_TASKS,
                allColumns, selection, null, null, null, null);
    }

    /**
     * Return a cursor over the entire database.
     *
     * @param selection     Specifies which rows should be filtered.
     *                      Must have "?" for selectionArgs.
     * @param selectionArgs Specifies what the "?" is in selection.
     * @return A cursor of rows selected from the database.
     */
    private Cursor query(String selection, String[] selectionArgs) {
        return database.query(TaskOpenHelper.TABLE_TASKS,
                allColumns, selection, selectionArgs, null, null, null);
    }

    /**
     * Writes a {@code Task} to the database with new values.
     *
     * @param task   The {@code Task} to update.
     * @param values The new values of the {@code Task} that will be written.
     */
    private void update(Task task, ContentValues values) {
        database.update(TaskOpenHelper.TABLE_TASKS,
                values,
                TaskOpenHelper.COLUMN_ID + " = ?",
                new String[]{String.valueOf(task.getLocalId())}
        );
    }

}
