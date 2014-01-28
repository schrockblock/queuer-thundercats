package com.thundercats.queuer.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by eschrock on 1/21/14.
 */
public class TaskOpenHelper extends SQLiteOpenHelper {

    /**
     * The name of the table.
     */
    public static final String TABLE_TASKS = "tasks";

    /**
     * The column name for {@code Task}s' local IDs.
     */
    public static final String COLUMN_ID = "_id";

    /**
     * The column name for {@code Task}s' server IDs.
     */
    public static final String COLUMN_SERVER_ID = "id";

    /**
     * The column name for the server IDs of the {@code Projects} to which {@code Task}s belong.
     */
    public static final String COLUMN_PROJECT_SERVER_ID = "project_id";

    /**
     * The column name for {@code Task}s' titles.
     */
    public static final String COLUMN_TEXT = "text";

    /**
     * The column name for whether or not {@code Task}s are finished.
     */
    public static final String COLUMN_COMPLETED = "completed";

    /**
     * The column name for {@code Task}s' positions.
     */
    public static final String COLUMN_POSITION = "position";

    /**
     * The column name for {@code Task}s' creation dates.
     */
    public static final String COLUMN_CREATED = "created_at";

    /**
     * The column name for {@code Task}s' last-updated dates.
     */
    public static final String COLUMN_UPDATED = "updated_at";

    private static final String DATABASE_NAME = "tasks.db";
    private static final int DATABASE_VERSION = 1;

    // Database creation sql statement
    private static final String DATABASE_CREATE = "create table "
            + TABLE_TASKS + "("
            + COLUMN_ID + " integer primary key autoincrement, "
            + COLUMN_SERVER_ID + " integer, "
            + COLUMN_PROJECT_SERVER_ID + " integer, "
            + COLUMN_TEXT + " text not null, "
            + COLUMN_POSITION + " integer, "
            + COLUMN_CREATED + " integer, "
            + COLUMN_UPDATED + " integer, "
            + COLUMN_COMPLETED + " integer"
            + ");";

    public TaskOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(TaskOpenHelper.class.getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TASKS);
        onCreate(db);
    }
}
