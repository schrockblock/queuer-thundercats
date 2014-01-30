package com.demo.queuer.models;

import android.content.Context;

import com.demo.queuer.database.ProjectDataSource;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by eschrock on 1/15/14.
 */
public class Project {
    private int id;
    private int localId;
    private String name;
    private int color;
    private ArrayList<Task> tasks;
    private Date created_at;
    private Date updated_at;

    public Project(Context context, int id, String name) {
        this.id = id;
        this.name = name;

        ProjectDataSource projectDataSource = new ProjectDataSource(context);
        projectDataSource.open();
        localId = projectDataSource.createProject(name, 0, id, new Date(), new Date()).localId;
        projectDataSource.close();
    }

    public Project(){

    }

    public static Project syncProject(Project serverProject, Project localProject){

        //THIS IS A VERY NAIVE WAY TO DO THIS,
        //DO NOT JUST COPY IT!!!
        if (serverProject.getUpdated_at().after(localProject.getUpdated_at())){
            serverProject.setLocalId(localProject.localId);
            return serverProject;
        }

        return localProject;
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

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
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

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
