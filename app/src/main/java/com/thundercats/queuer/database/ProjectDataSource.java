package com.thundercats.queuer.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.thundercats.queuer.models.Project;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by eschrock on 1/21/14.
 */
public class ProjectDataSource {
    // Database fields
    private SQLiteDatabase database;
    private ProjectOpenHelper dbHelper;
    private String[] allColumns = {ProjectOpenHelper.COLUMN_LOCAL_ID,
            ProjectOpenHelper.COLUMN_SERVER_ID,
            ProjectOpenHelper.COLUMN_COLOR,
            ProjectOpenHelper.COLUMN_CREATED,
            ProjectOpenHelper.COLUMN_UPDATED,
            ProjectOpenHelper.COLUMN_HIDDEN,
            ProjectOpenHelper.COLUMN_TITLE};
    // the symbol for whereArgs
    private final String WHERE_ARGS = "?";

    /**
     * Initializes the {@link com.thundercats.queuer.database.ProjectOpenHelper}.
     */
    public ProjectDataSource(Context context) {
        dbHelper = new ProjectOpenHelper(context);
    }

    /**
     * Initializes the {@code SQLiteDatabase}.
     */
    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    /**
     * Closes the {@link com.thundercats.queuer.database.ProjectOpenHelper}.
     */
    public void close() {
        dbHelper.close();
    }

    /**
     * Returns a row of cells that defines a particular {@code Project}.
     *
     * @param title    The title of the {@code Project}.
     * @param color    The color of the {@code Project}.
     * @param serverId The server ID of the {@code Project}.
     * @param created  When the {@code Project} was created.
     * @param updated  When the {@code Project} was last updated.
     * @return The {@code ContentValues} object that maps column names ({@code Project} fields)
     * to new column values.
     */
    private ContentValues createContentValues(String title, int color, int serverId, Date created, Date updated) {
        ContentValues values = new ContentValues();
        values.put(ProjectOpenHelper.COLUMN_SERVER_ID, serverId);
        values.put(ProjectOpenHelper.COLUMN_COLOR, color);
        values.put(ProjectOpenHelper.COLUMN_TITLE, title);
        values.put(ProjectOpenHelper.COLUMN_UPDATED, updated.getTime());
        values.put(ProjectOpenHelper.COLUMN_CREATED, created.getTime());
        // Projects are not hidden by default.
        int hidden = 0;
        values.put(ProjectOpenHelper.COLUMN_HIDDEN, hidden);
        return values;
    }

    /**
     * Creates a project from ContentValues and a Cursor.
     *
     * @param title    The title of the {@code Project}.
     * @param color    The color of the {@code Project}.
     * @param serverId The server ID of the {@code Project}.
     * @param created  When the {@code Project} was created.
     * @param updated  When the {@code Project} was last updated.
     * @return A project from ContentValues and a Cursor.
     */
    public Project createProject(String title, int color, int serverId, Date created, Date updated) {

        // Create the content values given all the passed in parameters
        ContentValues values = createContentValues(title, color, serverId, created, updated);

        // Get the insert ID for the content values
        long insertId = database.insert(ProjectOpenHelper.TABLE_PROJECTS, null,
                values);

        // Create a Cursor object over all rows whose local IDs match insertId
        Cursor cursor = database.query(
                // the table to compile the query against
                ProjectOpenHelper.TABLE_PROJECTS,
                // a list of which columns to return
                allColumns,
                // whereClause for row filtering - query rows that match insertId
                ProjectOpenHelper.COLUMN_LOCAL_ID + " = " + insertId,
                // whereArgs - there are none...
                null,
                // groupBy filter declaring how to group rows
                null,
                // SQL HAVING filter - which rows to include in the cursor
                null,
                // SQL ORDER BY filter
                null);
        // move the cursor to the first row
        cursor.moveToFirst();
        // Create a project from the cursor
        Project newProject = cursorToProject(cursor);
        cursor.close();
        return newProject;
    }

    /**
     * Updates the {@link com.thundercats.queuer.models.Project}'s fields.
     *
     * @param project The project to update.
     */
    public void updateProject(Project project) {
        // TODO may not be necessary to overwrite all fields...
        ContentValues values = createContentValues(
                project.getTitle(),
                project.getColor(),
                project.getId(),
                project.getCreated_at(),
                project.getUpdated_at()
        );

        database.update(
                // the table to update in
                ProjectOpenHelper.TABLE_PROJECTS,
                // a map from column names to new column values
                values,
                // whereClause - overwrite where a the ID column is whereArgs
                ProjectOpenHelper.COLUMN_LOCAL_ID + " = " + WHERE_ARGS,
                // whereArgs - overwrite the row that corresponds to a project's local ID
                new String[]{String.valueOf(project.getLocalId())});
    }

    /**
     * Deletes all rows whose local IDs match that of project's.
     * In theory, only one project should be deleted since
     * no two projects should have the same local ID.
     *
     * @param project The tasks associated with project are not deleted.
     */
    public void deleteProject(Project project) {
        long id = project.getLocalId();
        Log.d(this.getClass().getName(), "Deleting Project w/ Local ID: " + id);
        database.delete(ProjectOpenHelper.TABLE_PROJECTS,
                ProjectOpenHelper.COLUMN_LOCAL_ID + " = " + id,
                null);
    }

    /**
     * Returns a list of all {@link Project}s in the database.
     *
     * @return A list of all {@link Project}s in the database.
     */
    public ArrayList<Project> getAllProjects() {

        // Initialize an empty list of projects
        ArrayList<Project> projects = new ArrayList<Project>();

        // Get a cursor over the entire database
        Cursor cursor = database.query(ProjectOpenHelper.TABLE_PROJECTS,
                allColumns, null, null, null, null, null);

        // Move the cursor to the first row
        cursor.moveToFirst();

        // While there are still rows left for the cursor to scan...
        while (!cursor.isAfterLast()) {
            // Read the current row as a Project and add it to list
            projects.add(cursorToProject(cursor));
            // Move cursor to next row and repeat
            cursor.moveToNext();
        }
        // Close the cursor
        cursor.close();
        return projects;
    }

    /**
     * Returns a {@link Project} parsed from the given {@code Cursor}.
     *
     * @param cursor Reads the cells in the current row and writes
     *               them into a new {@code Project}'s fields.
     * @return A {@link Project} parsed from the given {@code Cursor}.
     */
    private Project cursorToProject(Cursor cursor) {
        Project project = new Project();
        project.setLocalId(cursor.getInt(cursor.getColumnIndex(ProjectOpenHelper.COLUMN_LOCAL_ID)));
        project.setId(cursor.getInt(cursor.getColumnIndex(ProjectOpenHelper.COLUMN_SERVER_ID)));
        project.setColor(cursor.getInt(cursor.getColumnIndex(ProjectOpenHelper.COLUMN_COLOR)));
        project.setTitle(cursor.getString(cursor.getColumnIndex(ProjectOpenHelper.COLUMN_TITLE)));
        return project;
    }
}
