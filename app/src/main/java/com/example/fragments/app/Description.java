package com.example.fragments.app;



import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class Description extends Fragment {

    String[] mCourseDescriptions;
    TextView mCourseDescriptionTextView;

    public Description() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {

        mCourseDescriptions = getResources().getStringArray(R.array.course_descriptions);
        super.onCreate(savedInstanceState);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View theView = inflater.inflate(R.layout.fragment_description, container, false); //false doesn't immediately attach
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_description, container, false);

        mCourseDescriptionTextView = (TextView) theView.findViewById(R.id.textViewCourseDescription);
        return theView;
    }

    public void setCourse(int courseIndex){
        mCourseDescriptionTextView.setText(mCourseDescriptions[courseIndex]);
    }

}
