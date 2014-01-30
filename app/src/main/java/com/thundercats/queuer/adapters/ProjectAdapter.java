package com.thundercats.queuer.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.thundercats.queuer.R;
import com.thundercats.queuer.database.TaskDataSource;
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
     * @param tasks   The list of tasks.
     */
    public ProjectAdapter(Context context, ArrayList<Task> unfinishedTasks, ArrayList<Task> tasks) {
        this.context = context;
        this.unfinishedTasks = unfinishedTasks;
        this.tasks = tasks;
    }

    /**
     * Removes all finished {@code Task}s from the list of unfinished {@code Task}s.
     * Updates {@code Task} positions.
     * Called every time the data set changes.
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
        final Task removedTask = unfinishedTasks.remove(position);

        // Remove first task
        TaskDataSource dataSource = new TaskDataSource(context);
        dataSource.open();
        removedTask.setFinished(true);
        dataSource.updateTaskFinished(removedTask, true);

        // decrement positions of subsequent tasks
        for (int i = position; i < unfinishedTasks.size(); i++) {
            final Task task = unfinishedTasks.get(i);
            final int newPosition = task.getPosition() - 1;
            task.setPosition(newPosition);
            dataSource.updateTaskPosition(task, newPosition);
        }
        notifyDataSetChanged();
    }

    /**
     * Inserts a {@code Task}.
     *
     * @param task     The {@code Task} to insert.
     * @param position The index where the {@code Task} will be inserted.
     */
    public void insert(Task task, int position) {
        if (!unfinishedTasks.contains(task)) {

            // put task in list
            unfinishedTasks.add(position, task);

            // write task's new position to DB
            TaskDataSource dataSource = new TaskDataSource(context);
            dataSource.open();
            dataSource.updateTaskPosition(task, position);
            task.setPosition(position);

            // increment all positions of subsequent tasks
            for (int i = position + 1; i < unfinishedTasks.size(); i++) {
                final Task currTask = unfinishedTasks.get(i);
                currTask.setPosition(i);
                dataSource.updateTaskPosition(currTask, i);
            }
            dataSource.close();
        }
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
        final Task task = getItem(i);
        ((TextView) convertView.findViewById(R.id.tv_title)).setText(task.getPosition() + ": " + task.getName());
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
