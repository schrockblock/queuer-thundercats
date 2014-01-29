package com.thundercats.queuer.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.thundercats.queuer.R;
import com.thundercats.queuer.interfaces.RearrangementListener;
import com.thundercats.queuer.models.Task;

import java.util.ArrayList;

/**
 * A {@link com.thundercats.queuer.interfaces.RearrangementListener} that controls the list of
 * {@link com.thundercats.queuer.models.Task}s in the current
 * {@link com.thundercats.queuer.models.Project}.
 * Created by kmchen1 on 1/15/14.
 */
public class ProjectAdapter extends BaseAdapter implements RearrangementListener {

    /**
     * The list of {@code Task}s.
     */
    private ArrayList<Task> tasks = new ArrayList<Task>();

    /**
     * The list of visible (unfinished) {@code Task}s.
     */
    private ArrayList<Task> unfinishedTasks = new ArrayList<Task>();

    /**
     * The Context under which this adapter is constructed.
     */
    private Context context;

    /**
     * Constructs a new ProjectAdapter.
     *
     * @param context The new context.
     */
    public ProjectAdapter(Context context) {
        this.context = context;
    }

    /**
     * Constructs a new ProjectAdapter.
     *
     * @param context The new context.
     * @param tasks   The list of tasks.
     */
    public ProjectAdapter(Context context, ArrayList<Task> tasks) {
        this.context = context;
        this.tasks = tasks;
        this.unfinishedTasks = tasks;
    }

    /**
     * Removes all finished {@code Task}s from the list of unfinished {@code Task}s.
     */
    private void refreshUnfinishedTasks() {
        for (Task task : tasks) {
            if (task.isFinished()) {
                unfinishedTasks.remove(task);
            }
        }
    }

    /**
     * Causes views to refresh themselves (i.e., getView is called).
     */
    @Override
    public void notifyDataSetChanged() {
        refreshUnfinishedTasks();
        super.notifyDataSetChanged();
    }

    /**
     * Removes a {@code Task}.
     *
     * @param position The index of the {@code Task} to be removed.
     */
    public void remove(int position) {
        unfinishedTasks.remove(position);
        notifyDataSetChanged();
    }

    /**
     * Adds a {@code Task}.
     *
     * @param task The {@code Task} to append.
     */
    public void add(Task task) {
        if (!unfinishedTasks.contains(task)) unfinishedTasks.add(task);
        if (!tasks.contains(task)) tasks.add(task);
        notifyDataSetChanged();
    }

    /**
     * Inserts a {@code Task}.
     *
     * @param task     The {@code Task} to insert.
     * @param position The index where the {@code Task} will be inserted.
     */
    public void insert(Task task, int position) {
        if (position < 0 || position > unfinishedTasks.size())
            throw new IndexOutOfBoundsException("Cannot insert position " + position
            + " when size is " + unfinishedTasks.size());
        if (!unfinishedTasks.contains(task)) unfinishedTasks.add(position, task);
        if (!tasks.contains(task)) tasks.add(position, task);
        notifyDataSetChanged();
    }

    /**
     * Returns true since all items are enabled (i.e., there are no dividers).
     *
     * @return True - all items are enabled.
     */
    @Override
    public boolean areAllItemsEnabled() {
        return true;
    }

    /**
     * Returns true since all {@code Task}s are enabled.
     *
     * @param i The index of the {@code Task} in question.
     * @return True - all {@code Task}s are enabled.
     */
    @Override
    public boolean isEnabled(int i) {
        return true;
    }

    @Override
    public int getCount() {
        return unfinishedTasks.size();
    }

    @Override
    public Task getItem(int i) {
        return unfinishedTasks.get(i);
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
        return unfinishedTasks.isEmpty();
    }


    @Override
    public void onStartedRearranging() {

    }

    @Override
    public void swapElements(int indexOne, int indexTwo) {
        Task temp1 = getItem(indexOne);
        Task temp2 = getItem(indexTwo);
        unfinishedTasks.remove(indexOne);
        unfinishedTasks.add(indexOne, temp2);
        unfinishedTasks.remove(indexTwo);
        unfinishedTasks.add(indexTwo, temp1);
    }

    @Override
    public void onFinishedRearranging() {

    }
}
