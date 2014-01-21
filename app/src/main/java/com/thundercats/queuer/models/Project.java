package com.thundercats.queuer.models;

import android.content.Intent;

import java.io.Serializable;

/**
 * A view (a project) that appears in the ListView of projects.
 * Created by kmchen1 on 1/15/14.
 */
public class Project implements Serializable {

    /**
     * The key for a project's name. Called in {@link Intent#putExtra(String, String)}
     * for when a new screen/activity is expected to return an intent as a result.
     */
    public static final String INTENT_KEY_FOR_PROJECT_NAME = "name";

    /**
     * The key for a project's color. Called in {@link Intent#putExtra(String, String)}
     * for when a new screen/activity is expected to return an intent as a result.
     */
    public static final String INTENT_KEY_FOR_PROJECT_COLOR = "color";

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
     * Constructs a new Project.
     * @param id This project's ID.
     * @param title This project's title.
     * @param color This project's color.
     */
    public Project(int id, String title, int color) {
        this.id = id;
        this.title = title;
        this.color = color;
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
