package com.example.fragments.app;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by mamanzan on 5/19/2014.
 */
public class Titles extends ListFragment {

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        OnCourseSelectionChangeListener listener = (OnCourseSelectionChangeListener) getActivity(); //get the parent activity.
        listener.onCourseSelectionChanged(position);
        //super.onListItemClick(l, v, position, id);
    }

    //all the displayable parts are created, now show list array of titles
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        String[] titles = getResources().getStringArray(R.array.course_titles);

        ArrayAdapter<String> titleAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, titles);
        setListAdapter(titleAdapter);
    }
}
