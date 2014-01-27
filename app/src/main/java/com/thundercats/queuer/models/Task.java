package com.thundercats.queuer.models;

import android.content.Context;

import com.thundercats.queuer.database.TaskDataSource;

import java.util.Date;

/**
 * Created by kmchen1 on 1/17/14.
 */
public class Task {

    private int project_id;
    private int localId;
    private int id;
    private String name;
    private int position;
    private boolean finished;
    private Date created_at;
    private Date updated_at;

    public Task() {}

    public Task(Context context, int id, String name, int project_id, int position,
                boolean finished, Date created_at, Date updated_at) {
        this.id = id;
        this.name = name;
        this.project_id = project_id;
        this.position = position;
        this.finished = finished;
        this.created_at = created_at;
        this.updated_at = updated_at;

        TaskDataSource dataSource = new TaskDataSource(context);
        dataSource.open();
        setLocalId(dataSource.createTask(name, project_id, id, position, finished).localId);
        dataSource.close();
    }

    public int getLocalId() {
        return localId;
    }

    public void setLocalId(int localId) {
        this.localId = localId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    /**
     * Tasks are equal if they have the same server IDs.
     * @param o The {@code Task} being compared to this {@code Task}.
     * @return True if the two {@code Task}s have the same server IDs.
     */
    @Override
    public boolean equals(Object o) {
        return ((Task)o).getId() == getId();
    }
}
