package com.thundercats.queuer.models;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

import com.thundercats.queuer.database.ProjectDataSource;

import java.util.Date;

/**
 * A view (a project) that appears in the ListView of projects.
 * Created by kmchen1 on 1/15/14.
 */
public class Project implements Parcelable {

    /** The Creator creates Project arrays and Projects from Parcels. */
    public static final Parcelable.Creator<Project> CREATOR =
            new Parcelable.Creator<Project>() {
                @Override
                public Project createFromParcel(Parcel parcel) {
                    return new Project(parcel);
                }

                @Override
                public Project[] newArray(int size) {
                    return new Project[size];
                }
            };

    /** The key for storing {@code Project}s as {@code Intent} extras. */
    public static final String INTENT_KEY = "project";


    //////////////////////
    /// PROJECT FIELDS ///
    //////////////////////

    /** Whether this project is hidden. */
    private boolean isHidden;

    /** This project's unique server ID. */
    private int id;

    /** This project's unique local ID. */
    private int localId;

    /** This project's title. */
    private String title;

    /** This project's color. */
    private int color;

    /** When the project was created. */
    private Date created_at;

    /** When the project was last updated. */
    private Date updated_at;

    /** Constructor for setting project fields. */
    public Project() {}

    /**
     * Constructs a new Project.
     *
     * @param title This project's title.
     * @param color This project's color.
     */
    public Project(Context context, String title, int color) {
        this.title = title;
        this.color = color;

        ProjectDataSource projectDataSource = new ProjectDataSource(context);
        projectDataSource.open();
        localId = projectDataSource.createProject(title, 0, id, new Date(), new Date()).localId;
        projectDataSource.close();
    }

    /**
     * Returns the {@code Date} when this {@code Project} was created.
     * @return The {@code Date} when this {@code Project} was created.
     */
    public Date getCreated_at() {
        return created_at;
    }

    /**
     * Sets the {@code Date} when this {@code Project} was created.
     * @param created_at The {@code Date} when this {@code Project} was created.
     */
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    /**
     * Returns the {@code Date} when this {@code Project} was last updated.
     * @return The {@code Date} when this {@code Project} was last updated.
     */
    public Date getUpdated_at() {
        return updated_at;
    }

    /**
     * Sets the {@code Date} when this {@code Project} was last updated.
     * @param updated_at The {@code Date} when this {@code Project} was last updated.
     */
    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    /**
     * Returns this {@code Project}'s local ID.
     * @return This {@code Project}'s local ID.
     */
    public int getLocalId() {
        return localId;
    }

    /**
     * Sets this {@code Project}'s local ID.
     * @param localId This {@code Project}'s local ID.
     */
    public void setLocalId(int localId) {
        this.localId = localId;
    }

    /**
     * Returns this project's server ID.
     *
     * @return This project's server ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets this project's server ID.
     *
     * @param id The new server ID.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns this project's title.
     *
     * @return This project's title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets this project's title.
     *
     * @param title The new title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns this project's color.
     *
     * @return This project's color.
     */
    public int getColor() {
        return color;
    }

    /**
     * Sets this project's color.
     *
     * @param color The new color.
     */
    public void setColor(int color) {
        this.color = color;
    }

    /**
     * Returns whether or not this {@code Project} is hidden.
     * @return Whether or not this {@code Project} is hidden.
     */
    public boolean isHidden() {
        return isHidden;
    }

    /**
     * Sets whether or not this {@code Project} is hidden.
     * @param isHidden Whether or not this {@code Project} is hidden.
     */
    public void setHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }

    /**
     * Returns true if the projects are equal (i.e., if their unique IDs are equal).
     *
     * @param otherProject The other project
     * @return True if the projects have equal IDs.
     */
    @Override
    public boolean equals(Object otherProject) {
        return ((Project) otherProject).getId() == getId();
    }

    /**
     * Describe the kinds of special objects contained
     * in this Parcelable's marshalled representation.
     *
     * @return a bitmask indicating the set of special
     * object types marshalled by the Parcelable.
     */
    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * Flatten this object in to a Parcel.
     *
     * @param parcel The Parcel in which the object should be written.
     * @param i      Additional flags about how the object should be written.
     */
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(title);
        parcel.writeInt(color);
        parcel.writeInt(isHidden ? 1 : 0);
    }

    /**
     * The constructor used to create a Project from a Parcel.
     * Reads back fields IN THE ORDER they were written.
     *
     * @param in The Parcel to create this Project from.
     * @see com.thundercats.queuer.models.Project#CREATOR
     */
    public Project(Parcel in) {
        id = in.readInt();
        title = in.readString();
        color = in.readInt();
        isHidden = (in.readInt() == 1);
    }

}
