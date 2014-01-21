package com.thundercats.queuer.models;

import java.io.Serializable;

/**
 * A view (a project) that appears in the ListView of projects.
 * Created by kmchen1 on 1/15/14.
 */
public class Project implements Serializable {

    /**
     * Whether this project is hidden.
     */
    private boolean isHidden;

    /**
     * This project's unique ID. Useful since users can move projects around.
     */
    private int id;

    /**
     * This project's title.
     */
    private String title;

    /**
     * This project's color.
     */
    private int color;

    /**
     * Constructs a new Project.
     * @param id This project's ID.
     * @param title This project's title.
     */
    public Project(int id, String title) {
        this.id = id;
        this.title = title;
    }

    /**
     * Returns this project's ID.
     * @return This project's ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets this project's ID.
     * @param id The new ID.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns this project's title.
     * @return This project's title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets this project's title.
     * @param title The new title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns this project's color.
     * @return This project's color.
     */
    public int getColor() {
        return color;
    }

    /**
     * Sets this project's color.
     * @param color The new color.
     */
    public void setColor(int color) {
        this.color = color;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }

    /**
     * Returns true if the projects are equal (i.e., if their unique IDs are equal).
     * @param otherProject The other project
     * @return True if the projects have equal IDs.
     */
    @Override
    public boolean equals(Object otherProject) {
        return ((Project) otherProject).getId() == getId();
    }
}
