package com.thundercats.queuer.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.appcompat.R;
import android.widget.Toast;

import com.thundercats.queuer.models.Task;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by eschrock on 1/21/14.
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
    // the symbol for whereArgs
    private final String WHERE_ARGS = "?";

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
     * Creates a row of cells from the given {@code Task} parameters.
     * Inserts the row into the database.
     * Get a {@code Cursor} over the inserted row.
     *
     * @param text      The name of the {@code Task}.
     * @param projectId The server ID of the {@code Project} to which the {@code Task} belongs.
     * @param serverId  The server ID of the {@code Task}.
     * @param position  The position of the {@code Task}.
     * @param completed Whether or not the {@code Task} is finished.
     * @return
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
        database.update(TaskOpenHelper.TABLE_TASKS,
                values,
                // TODO shouldn't this be .COLUMN_ID????
                TaskOpenHelper.COLUMN_SERVER_ID + " = " + WHERE_ARGS,
                new String[]{String.valueOf(task.getLocalId())}
        );
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
        database.update(TaskOpenHelper.TABLE_TASKS,
                values,
                // TODO shouldn't this be .COLUMN_ID????
                TaskOpenHelper.COLUMN_SERVER_ID + " = " + WHERE_ARGS,
                new String[]{String.valueOf(task.getLocalId())}
        );
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
        database.update(TaskOpenHelper.TABLE_TASKS,
                values,
                // TODO shouldn't this be .COLUMN_ID????
                TaskOpenHelper.COLUMN_SERVER_ID + " = " + WHERE_ARGS,
                new String[]{String.valueOf(task.getLocalId())}
        );
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
        database.update(TaskOpenHelper.TABLE_TASKS,
                values,
                // TODO shouldn't this be .COLUMN_ID????
                TaskOpenHelper.COLUMN_SERVER_ID + " = " + WHERE_ARGS,
                new String[]{String.valueOf(task.getLocalId())}
        );
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

        database.update(TaskOpenHelper.TABLE_TASKS,
                values,
                // TODO shouldn't this be .COLUMN_ID????
                TaskOpenHelper.COLUMN_SERVER_ID + " = " + WHERE_ARGS,
                new String[]{String.valueOf(task.getLocalId())}
        );
    }

    /**
     * Deletes a {@code Task} from the SQL database.
     *
     * @param task The {@code Task} to delete.
     */
    public void deleteTask(Task task) {
        String[] whereArgs = new String[]{Integer.toString(task.getLocalId())};
        database.delete(TaskOpenHelper.TABLE_TASKS,
                TaskOpenHelper.COLUMN_ID + " = " + WHERE_ARGS,
                whereArgs);
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
        Cursor cursor = database.query(TaskOpenHelper.TABLE_TASKS,
                allColumns,
                TaskOpenHelper.COLUMN_PROJECT_SERVER_ID + " = " + WHERE_ARGS,
                new String[]{String.valueOf(projectServerID)},
                null, null, null);
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
        Cursor cursor = database.query(TaskOpenHelper.TABLE_TASKS,
                allColumns, null, null, null, null, null);
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

}
