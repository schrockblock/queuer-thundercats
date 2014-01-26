package com.thundercats.queuer.adapters;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.thundercats.queuer.R;
import com.thundercats.queuer.interfaces.RearrangementListener;
import com.thundercats.queuer.models.Project;

import java.util.ArrayList;

/**
 * {@code FeedAdapter} is used to manage the list of {@code Project}s
 * in {@code FeedActivity}. It maintains two lists, one of the total
 * projects ever created, and another of the projects that are visible
 * to the user. When a user chooses to hide a project,
 * {@link android.widget.BaseAdapter#notifyDataSetChanged()} filters out
 * the hidden projects from the visible ones.
 * <p/>
 * {@code FeedAdapter} implements {@code Parcelable} since it must be able to
 * get passed between activities. For instance, when the user is in
 * {@link com.thundercats.queuer.activities.FeedActivity} and wants to create a new
 * {@code Project}, {@link com.thundercats.queuer.activities.CreateProjectActivity}
 * is launched with an {@code Intent}, which has as an extra a {@code FeedAdapter}.
 * This is because projects must be given unique project IDs upon instantiation, and
 * only the {@code FeedAdapter} can dole out unique IDs since it controls the list of projects.
 * Created by kmchen1 on 1/17/14.
 */
public class FeedAdapter extends BaseAdapter implements RearrangementListener, Parcelable {

    public static final Parcelable.Creator<FeedAdapter> CREATOR =
            new Parcelable.Creator<FeedAdapter>() {
                @Override
                public FeedAdapter createFromParcel(Parcel parcel) {
                    return new FeedAdapter(parcel);
                }

                @Override
                public FeedAdapter[] newArray(int size) {
                    return new FeedAdapter[size];
                }
            };

    /**
     * The key for storing a {@code FeedAdapter} as an {@code Intent} extra.
     */
    public static final String INTENT_KEY = "feed_adapter";

    /**
     * The list of visible projects.
     */
    private ArrayList<Project> visibleProjects = new ArrayList<Project>();

    /**
     * The list of total projects.
     */
    private ArrayList<Project> projects = new ArrayList<Project>();

    /**
     * The Context (in this case, the activity) under which this adapter is constructed.
     */
    private Context context;

    /**
     * The re-creation/unmarshalling constructor.
     *
     * @param in The parcel which is used to recreate this FeedAdapter.
     *           Objects are read from the parcel in the same order in which they were written.
     */
    public FeedAdapter(Parcel in) {
        in.readTypedList(visibleProjects, Project.CREATOR);
        in.readTypedList(projects, Project.CREATOR);
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
        parcel.writeTypedList(visibleProjects);
        parcel.writeTypedList(projects);
    }

    /**
     * Constructs a new ProjectAdapter.
     *
     * @param context  The new context.
     * @param projects The list of projects.
     */
    public FeedAdapter(Context context, ArrayList<Project> projects) {
        this.context = context;
        this.projects = projects;
        // All projects are visible to begin with
        this.visibleProjects = projects;
    }

    /**
     * Returns the next available unique project ID.
     *
     * @return Since projects cannot be deleted, the next available (zero-indexed)
     * unique project ID will be the number of total projects.
     */
    public int getNextID() {
        return projects.size();
    }

    /**
     * Removes all hidden projects from the list of visible projects.
     */
    private void refreshVisibleProjects() {
        for (Project project : projects) {
            if (project.isHidden()) {
                visibleProjects.remove(project);
            }
        }
    }

    /**
     * Refreshes the visible projects.
     */
    @Override
    public void notifyDataSetChanged() {
        refreshVisibleProjects();
        super.notifyDataSetChanged();
    }

    /**
     * Removes a project from the list of visible projects.
     * <p/>
     * For now, projects cannot be removed from the list of total projects.
     *
     * @param position The project to remove will be at index {@code position}
     *                 in the list of visible projects.
     */
    public void remove(int position) {
        visibleProjects.remove(position);
        notifyDataSetChanged();
    }

    /**
     * Adds/appends a given project to the lists of visible projects and of projects,
     * provided the given project is not contained in said lists.
     *
     * @param project The project to add.
     */
    public void add(Project project) {
        if (!visibleProjects.contains(project)) visibleProjects.add(project);
        if (!projects.contains(project)) projects.add(project);
        notifyDataSetChanged();
    }

    /**
     * Inserts a given project at a given position.
     *
     * @param project  The project to insert.
     * @param position The position where the project will be inserted.
     *                 All projects to the right of position will be
     *                 shifted to the right.
     *                 <p/>
     *                 Since the ordering of the list of total projects
     *                 is preserved, {@code project} is simply appended
     *                 to the list of total projects.
     */
    public void insert(Project project, int position) {
        if (position < 0 || position > visibleProjects.size())
            throw new IndexOutOfBoundsException("Cannot insert position " + position
                    + " when size is " + visibleProjects.size());
        if (!visibleProjects.contains(project)) visibleProjects.add(position, project);
        // ArrayList#add(int) is called (to preserve order) instead of ArrayList#add(int,int)
        if (!projects.contains(project)) projects.add(project);
        notifyDataSetChanged();
    }

    @Override
    public boolean areAllItemsEnabled() {
        // all items are enabled. no dividers.
        return true;
    }

    /**
     * @param i The project's position.
     * @return True, since all project's are enabled (i.e., clickable).
     */
    @Override
    public boolean isEnabled(int i) {
        return true;
    }

    @Override
    public int getCount() {
        return visibleProjects.size();
    }

    @Override
    public Project getItem(int i) {
        return visibleProjects.get(i);
    }

    @Override
    public long getItemId(int i) {
        return getItem(i).getServerId();
    }

    /**
     * Returns true since IDs are stable (i.e., the user can move projecs around).
     *
     * @return True since IDs are stable (i.e., the user can move projecs around).
     */
    @Override
    public boolean hasStableIds() {
        return true;
    }

    /**
     * Returns the TextView widget containing text and a background color.
     *
     * @param position    The position of the project whose view we want to create.
     * @param convertView The view that will hold the list of projects.
     * @param viewGroup   Never used.
     * @return The TextView widget containing text and a background color.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_project, null);
        }
        // set the text of the TextView widget
        ((TextView) convertView.findViewById(R.id.tv_title)).setText(getItem(position).getTitle());
        // set the background color of the LinearLayout
        convertView.findViewById(R.id.ll_project).setBackgroundColor(getItem(position).getColor());
        return convertView;
    }

    @Override
    public int getItemViewType(int i) {
        return 0;
    }

    /**
     * Returns 1 since there are no dividers (i.e., there is only 1 type of view).
     *
     * @return 1 since there are no dividers (i.e., there is only 1 type of view).
     */
    @Override
    public int getViewTypeCount() {
        return 1;
    }

    /**
     * Returns true if there are no visible projects.
     *
     * @return True if the list of visible projects is empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return visibleProjects.isEmpty();
    }


    /**
     * @see com.thundercats.queuer.interfaces.RearrangementListener#onStartedRearranging()
     */
    @Override
    public void onStartedRearranging() {

    }

    /**
     * Swapping elements only affects the list of visible projects.
     * <p/>
     * The list of total projects is unaffected, as it preserves the order of project IDs.
     *
     * @param indexOne The index of the first element.
     * @param indexTwo The index of the second element.
     * @see com.thundercats.queuer.interfaces.RearrangementListener#swapElements(int, int)
     */
    @Override
    public void swapElements(int indexOne, int indexTwo) {
        Project temp1 = getItem(indexOne);
        Project temp2 = getItem(indexTwo);
        visibleProjects.remove(indexOne);
        visibleProjects.add(indexOne, temp2);
        visibleProjects.remove(indexTwo);
        visibleProjects.add(indexTwo, temp1);
    }

    /**
     * @see com.thundercats.queuer.interfaces.RearrangementListener#onFinishedRearranging()
     */
    @Override
    public void onFinishedRearranging() {

    }

}
