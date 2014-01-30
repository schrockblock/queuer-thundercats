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
 * The class responsible for saving {@link com.thundercats.queuer.models.Project}s locally.
 *
 * @author Kevin Chen
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
     * Deletes all {@code Project}s in the database.
     */
    public void deleteAllProjects() {
        database.delete(ProjectOpenHelper.TABLE_PROJECTS, "1", null);
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
    private ContentValues createContentValues(String title, int color, boolean isHidden, int serverId, Date created, Date updated) {
        ContentValues values = new ContentValues();
        values.put(ProjectOpenHelper.COLUMN_SERVER_ID, serverId);
        values.put(ProjectOpenHelper.COLUMN_COLOR, color);
        values.put(ProjectOpenHelper.COLUMN_CREATED, created.getTime());
        values.put(ProjectOpenHelper.COLUMN_UPDATED, updated.getTime());
        values.put(ProjectOpenHelper.COLUMN_HIDDEN, isHidden ? 1 : 0);
        values.put(ProjectOpenHelper.COLUMN_TITLE, title);
        return values;
    }

    /**
     * Writes a {@code Project} to the database.
     * Creates a {@code Project} from ContentValues and a Cursor.
     *
     * @param title    The title of the {@code Project}.
     * @param color    The color of the {@code Project}.
     * @param serverId The server ID of the {@code Project}.
     * @param created  When the {@code Project} was created.
     * @param updated  When the {@code Project} was last updated.
     * @return A project from ContentValues and a Cursor.
     */
    public Project createProject(String title, int color, boolean isHidden, int serverId, Date created, Date updated) {

        // Create the content values given all the passed in parameters
        ContentValues values = createContentValues(title, color, isHidden, serverId, created, updated);

        // Get the insert ID for the content values
        long insertId = database.insert(ProjectOpenHelper.TABLE_PROJECTS, null,
                values);

        // Get a Cursor over the row that was just inserted
        Cursor cursor = query(ProjectOpenHelper.COLUMN_LOCAL_ID + " = " + insertId);
        // move the cursor to the first row
        cursor.moveToFirst();
        // Create a project from the cursor
        Project newProject = cursorToProject(cursor);
        cursor.close();
        return newProject;
    }

    /**
     * Queries all the columns in the database, given a whereClause.
     *
     * @param selection Formatted as a SQL WHERE clause. Will crash if this contains "?"
     */
    public Cursor query(String selection) {
        return database.query(
                // the table to compile the query against
                ProjectOpenHelper.TABLE_PROJECTS,
                // a list of which columns to return
                allColumns,
                // whereClause for row filtering - query rows that match insertId
                selection,
                // whereArgs - there are none...
                null,
                // groupBy filter declaring how to group rows
                null,
                // SQL HAVING filter - which rows to include in the cursor
                null,
                // SQL ORDER BY filter
                null);
    }

    /**
     * Deletes all rows whose local IDs match that of {@code Project}'s.
     * In theory, only one {@code Project} should be deleted since
     * no two {@code Project}s should have the same local ID.
     *
     * @param project The {@code Task}s associated with {@code project} are not deleted.
     */
    public void deleteProject(Project project) {
        long id = project.getLocalId();
        Log.d(this.getClass().getName(), "Deleting Project w/ Local ID: " + id);
        database.delete(ProjectOpenHelper.TABLE_PROJECTS,
                ProjectOpenHelper.COLUMN_LOCAL_ID + " = " + id,
                null);
    }

    /**
     * Returns a list of all {@code Project}s in the database.
     *
     * @return A list of all {@code Project}s in the database.
     */
    public ArrayList<Project> getAllProjects() {

        // Initialize an empty list of projects
        ArrayList<Project> projects = new ArrayList<Project>();

        // Get a cursor over the entire database
        Cursor cursor = query(null);

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
     * Returns a {@code Project} parsed from the given {@code Cursor}.
     *
     * @param cursor Reads the cells in the current row and writes
     *               them into a new {@code Project}'s fields.
     * @return A {@code Project} parsed from the given {@code Cursor}.
     */
    private Project cursorToProject(Cursor cursor) {
        int localID = cursor.getInt(cursor.getColumnIndex(ProjectOpenHelper.COLUMN_LOCAL_ID));
        int serverID = cursor.getInt(cursor.getColumnIndex(ProjectOpenHelper.COLUMN_SERVER_ID));
        String title = cursor.getString(cursor.getColumnIndex(ProjectOpenHelper.COLUMN_TITLE));
        int color = cursor.getInt(cursor.getColumnIndex(ProjectOpenHelper.COLUMN_COLOR));
        boolean isHidden = cursor.getInt(cursor.getColumnIndex(ProjectOpenHelper.COLUMN_HIDDEN)) == 1;
        Date created = new Date(cursor.getLong(cursor.getColumnIndex(ProjectOpenHelper.COLUMN_CREATED)));
        Date updated = new Date(cursor.getLong(cursor.getColumnIndex(ProjectOpenHelper.COLUMN_UPDATED)));
        return new Project(localID, serverID, title, color, isHidden, created, updated);
    }

    /**
     * Rewrites a project to database with a new title.
     *
     * @param project The {@code Project} to update.
     * @param title   The {@code Project}'s new title.
     */
    public void updateProjectTitle(Project project, String title) {
        ContentValues values = new ContentValues();
        values.put(ProjectOpenHelper.COLUMN_TITLE, title);
        update(project, values);
    }

    /**
     * Rewrites a project to database with a new color.
     *
     * @param project The {@code Project} to update.
     * @param color   The {@code Project}'s new color.
     */
    public void updateProjectColor(Project project, int color) {
        ContentValues values = new ContentValues();
        values.put(ProjectOpenHelper.COLUMN_COLOR, color);
        update(project, values);
    }

    /**
     * Rewrites a project to database with a new hidden status.
     *
     * @param project  The {@code Project} to update.
     * @param isHidden Whether or not this {@code Project} is hidden now.
     */
    public void updateProjectHidden(Project project, boolean isHidden) {
        ContentValues values = new ContentValues();
        values.put(ProjectOpenHelper.COLUMN_HIDDEN, isHidden ? 1 : 0);
        update(project, values);
    }

    /**
     * Updates a {@code Project}'s values.
     *
     * @param project The {@code Project} to update.
     * @param values  The content values (map) to write.
     */
    private void update(Project project, ContentValues values) {
        database.update(ProjectOpenHelper.TABLE_PROJECTS, values,
                // whereClause - overwrite where a the ID column is whereArgs
                ProjectOpenHelper.COLUMN_LOCAL_ID + " = ?",
                // whereArgs - overwrite the row that corresponds to a project's local ID
                new String[]{String.valueOf(project.getLocalId())});
    }

    /**
     * Updates the {@code Project}'s fields.
     *
     * @param project The {@code Project} to update.
     */
    public void updateProject(Project project) {
        ContentValues values = createContentValues(
                project.getTitle(),
                project.getColor(),
                project.isHidden(),
                project.getId(),
                project.getCreated_at(),
                project.getUpdated_at()
        );
        update(project, values);
    }

}
