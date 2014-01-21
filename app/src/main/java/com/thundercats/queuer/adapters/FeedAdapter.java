package com.thundercats.queuer.adapters;

import android.content.Context;
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
 * Created by kmchen1 on 1/17/14.
 */
public class FeedAdapter extends BaseAdapter implements RearrangementListener {

    /** The list of visible projects. */
    private ArrayList<Project> visibleProjects = new ArrayList<Project>();

    /** The list of total projects. */
    private ArrayList<Project> projects = new ArrayList<Project>();

    /** */
    private Context context;

    /**
     * Constructs a new ProjectAdapter.
     * @param context The new context.
     */
    public FeedAdapter(Context context) {
        this.context = context;
    }

    /**
     * Constructs a new ProjectAdapter.
     * @param context The new context.
     * @param projects The list of projects.
     */
    public FeedAdapter(Context context, ArrayList<Project> projects) {
        this.context = context;
        this.projects = projects;
        // All projects are visible to begin with
        this.visibleProjects = projects;
    }

    /**
     * The data set has changed. Rebuild the view with new data set.
     */
    @Override
    public void notifyDataSetChanged() {
        for (Project project : projects) {
            if (project.isHidden()) {
                visibleProjects.remove(project);
            }
        }
        super.notifyDataSetChanged();
    }

    public void remove(int position) {
        visibleProjects.remove(position);
        notifyDataSetChanged();
    }

    public void insert(Project project, int position) {
        visibleProjects.add(position, project);
        notifyDataSetChanged();
    }

    @Override
    public boolean areAllItemsEnabled() {
        // all items are enabled. no dividers.
        return true;
    }

    @Override
    public boolean isEnabled(int i) {
        return false;
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
        return getItem(i).getId();
    }

    @Override
    public boolean hasStableIds() {
        // has stable ids, since we can move projects/views around
        return true;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_project, null);
        }
        ((TextView) convertView.findViewById(R.id.tv_title)).setText(getItem(i).getTitle());
        convertView.findViewById(R.id.ll_project).setBackgroundColor(getItem(i).getColor());
        return convertView;
    }

    @Override
    public int getItemViewType(int i) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        // no dividers. only 1 type of view.
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return visibleProjects.isEmpty();
    }


    @Override
    public void onStartedRearranging() {

    }

    @Override
    public void swapElements(int indexOne, int indexTwo) {
        Project temp1 = getItem(indexOne);
        Project temp2 = getItem(indexTwo);
        visibleProjects.remove(indexOne);
        visibleProjects.add(indexOne, temp2);
        visibleProjects.remove(indexTwo);
        visibleProjects.add(indexTwo, temp1);
    }

    @Override
    public void onFinishedRearranging() {

    }

}
