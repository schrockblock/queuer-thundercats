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

    /** The list of projects/models. */
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
    }

    public void remove(int position) {
        projects.remove(position);
        notifyDataSetChanged();
    }

    public void insert(Project project, int position) {
        projects.add(position, project);
        notifyDataSetChanged();
    }

    @Override
    public boolean areAllItemsEnabled() {
        // all items are enabled. no dividers.
        return true;
    }

    @Override
    public boolean isEnabled(int i) {
        return true;
    }

    @Override
    public int getCount() {
        return projects.size();
    }

    @Override
    public Project getItem(int i) {
        return projects.get(i);
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
        return projects.isEmpty();
    }


    @Override
    public void onStartedRearranging() {

    }

    @Override
    public void swapElements(int indexOne, int indexTwo) {
        Project temp1 = getItem(indexOne);
        Project temp2 = getItem(indexTwo);
        projects.remove(indexOne);
        projects.add(indexOne, temp2);
        projects.remove(indexTwo);
        projects.add(indexTwo, temp1);
        notifyDataSetChanged();
    }

    @Override
    public void onFinishedRearranging() {

    }

}
