package com.thundercats.queuer.adapters;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.thundercats.queuer.R;
import com.thundercats.queuer.interfaces.RearrangementListener;
import com.thundercats.queuer.models.Project;
import com.thundercats.queuer.models.Task;

import java.util.ArrayList;

/**
 * A {@link com.thundercats.queuer.interfaces.RearrangementListener} that controls the list of
 * {@link com.thundercats.queuer.models.Task}s in the current
 * {@link com.thundercats.queuer.models.Project}.
 * Created by kmchen1 on 1/15/14.
 */
public class ProjectAdapter extends BaseAdapter implements RearrangementListener {

    /** The list of {@code Task}s. */
    private ArrayList<Task> tasks = new ArrayList<Task>();

    /** */
    private Context context;

    /**
     * Constructs a new ProjectAdapter.
     * @param context The new context.
     */
    public ProjectAdapter(Context context) {
        this.context = context;
    }

    /**
     * Constructs a new ProjectAdapter.
     * @param context The new context.
     * @param tasks The list of tasks.
     */
    public ProjectAdapter(Context context, ArrayList<Task> tasks) {
        this.context = context;
        this.tasks = tasks;
    }

    public void remove(int position) {
        tasks.remove(position);
        notifyDataSetChanged();
    }

    public void insert(Task task, int position) {
        tasks.add(position, task);
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
        return tasks.size();
    }

    @Override
    public Task getItem(int i) {
        return tasks.get(i);
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
            convertView = LayoutInflater.from(context).inflate(R.layout.list_task, null);
        }
        ((TextView) convertView.findViewById(R.id.tv_title)).setText(getItem(i).getName());
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
        return tasks.isEmpty();
    }


    @Override
    public void onStartedRearranging() {

    }

    @Override
    public void swapElements(int indexOne, int indexTwo) {
        Task temp1 = getItem(indexOne);
        Task temp2 = getItem(indexTwo);
        tasks.remove(indexOne);
        tasks.add(indexOne, temp2);
        tasks.remove(indexTwo);
        tasks.add(indexTwo, temp1);
    }

    @Override
    public void onFinishedRearranging() {

    }
}
