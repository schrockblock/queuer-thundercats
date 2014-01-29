package com.thundercats.queuer.models;

import android.content.Context;

import com.thundercats.queuer.database.TaskDataSource;

import java.util.Date;

/**
 * Created by kmchen1 on 1/17/14.
 */
public class Task implements Comparable<Task> {

    /**
     * The server ID of the {@code Project} to which this {@code Task} belongs.
     */
    private int project_id;

    /**
     * The local ID of this {@code Task}.
     */
    private final int localId;

    /**
     * The server ID of this {@code Task}.
     */
    private int id;

    /**
     * The name of this {@code Task}.
     */
    private String name;

    /**
     * The position of this {@code Task}.
     */
    private int position;

    /**
     * Whether this {@code Task} is finished.
     */
    private boolean finished;

    /**
     * When this {@code Task} was created.
     */
    private Date created_at;

    /**
     * When this {@code Task} was last updated.
     */
    private Date updated_at;

    /**
     * Constructs a {@code Task} will all fields specified.
     *
     * @param name       The name of this {@code Task}.
     * @param project_id The ID of the {@code Project} to which this {@code Task} belongs.
     * @param position   The position where this {@code Task} will be inserted.
     * @param id         The new server ID of this {@code Task}.
     * @param localId    The new local ID of this {@code Task}.
     * @param finished   Whether or not this {@code Task} is finished.
     * @see com.thundercats.queuer.database.TaskDataSource#cursorToTask(android.database.Cursor)
     */
    public Task(int localId, int id, int project_id, String name, boolean finished,
                int position, Date created_at, Date updated_at) {
        this.localId = localId;
        this.id = id;
        this.project_id = project_id;
        this.name = name;
        this.finished = finished;
        this.position = position;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    /**
     * Constructs a {@code Task}. The primary constructor. Used when user adds a task.
     *
     * @param context    The context under which this {@code Task} was created.
     *                   Context is needed to write to the database.
     * @param name       The name of this {@code Task}.
     * @param project_id The ID of the {@code Project} to which this {@code Task} belongs.
     * @param position   The position where this {@code Task} will be inserted.
     */
    public Task(Context context, String name, int project_id, int position) {
        this.name = name;
        this.project_id = project_id;
        this.position = position;
        this.finished = false;
        this.created_at = new Date();
        this.updated_at = created_at;

        // TODO id (aka serverID) is never defined

        TaskDataSource dataSource = new TaskDataSource(context);
        dataSource.open();
        // TODO localId is private, id is uninitialized... this wouldn't work...
        localId = (dataSource.createTask(name, project_id, id, position, finished).localId);
        dataSource.close();
    }

    /**
     * Returns this {@code Task}'s local ID.
     *
     * @return This {@code Task}'s local ID.
     */
    public int getLocalId() {
        return localId;
    }

    /**
     * Returns this {@code Task}'s server ID.
     *
     * @return This {@code Task}'s server ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns this {@code Task}'s name.
     *
     * @return This {@code Task}'s name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets this {@code Task}'s name.
     *
     * @param name    The new name of this {@code Task}.
     * @param context Used to open up the database.
     */
    public void setName(String name, Context context) {
        this.name = name;
        TaskDataSource dataSource = new TaskDataSource(context);
        dataSource.open();
        dataSource.updateTaskName(this, name);
        dataSource.close();
    }

    /**
     * Returns the server ID of the {@code Project} to which this {@code Task} belongs.
     *
     * @return The server ID of the {@code Project} to which this {@code Task} belongs.
     */
    public int getProject_id() {
        return project_id;
    }

    /**
     * Sets the server ID of the {@code Project} to which this {@code Task} belongs.
     * This should rarely (never?) be called.
     *
     * @param project_id The new server ID of {@code Project} to which this {@code Task} belongs.
     */
    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    /**
     * Returns the position of this {@code Task}.
     *
     * @return The position of this {@code Task}.
     */
    public int getPosition() {
        return position;
    }

    /**
     * Sets the position of this {@code Task}.
     *
     * @param position The new position of this {@code Task}.
     * @param context  Used to open up the database.
     */
    public void setPosition(int position, Context context) {
        this.position = position;
        TaskDataSource dataSource = new TaskDataSource(context);
        dataSource.open();
        dataSource.updateTaskPosition(this, position);
        dataSource.close();
    }

    /**
     * Returns true if this {@code Task} is finished, false otherwise.
     *
     * @return True if this {@code Task} is finished, false otherwise.
     */
    public boolean isFinished() {
        return finished;
    }

    /**
     * Sets whether or not this {@code Task} is finished.
     *
     * @param finished Whether or not this {@code Task} is finished.
     * @param context  Used to open up the database.
     */
    public void setFinished(boolean finished, Context context) {
        this.finished = finished;
        TaskDataSource dataSource = new TaskDataSource(context);
        dataSource.open();
        dataSource.updateTaskFinished(this, finished);
        dataSource.close();
    }

    /**
     * Returns when this {@code Task} was created.
     *
     * @return When this {@code Task} was created.
     */
    public Date getCreated_at() {
        return created_at;
    }

    /**
     * Sets when this {@code Task} was created.
     *
     * @param created_at When this {@code Task} was created.
     */
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    /**
     * Returns when this {@code Task} was last updated.
     *
     * @return When this {@code Task} was last updated.
     */
    public Date getUpdated_at() {
        return updated_at;
    }

    /**
     * Sets when this {@code Task} was last updated.
     *
     * @param updated_at When this {@code Task} was last updated.
     * @param context    Used to open up the database.
     */
    public void setUpdated_at(Date updated_at, Context context) {
        this.updated_at = updated_at;
        TaskDataSource dataSource = new TaskDataSource(context);
        dataSource.open();
        dataSource.updateTaskLastUpdated(this, updated_at);
        dataSource.close();
    }

    /**
     * Tasks are equal if they have the same server IDs.
     *
     * @param o The {@code Task} being compared to this {@code Task}.
     * @return True if the two {@code Task}s have the same server IDs.
     */
    @Override
    public boolean equals(Object o) {
        return ((Task) o).getId() == getId();
    }

    /**
     * Compares two {@code Task}s.
     *
     * @param task The {@code Task} being compared.
     * @return negative if this {@code Task} has a server ID
     * that is less than that of the argument {@code Task},
     * and positive if the opposite is true.
     * Returns 0 if the server IDs are the same; however, this
     * should never happen.
     */
    @Override
    public int compareTo(Task task) {
        return Integer.valueOf(getPosition()).compareTo(Integer.valueOf(task.getPosition()));
    }
}
