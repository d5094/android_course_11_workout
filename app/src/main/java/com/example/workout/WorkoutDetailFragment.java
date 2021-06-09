package com.example.workout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WorkoutDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WorkoutDetailFragment extends Fragment {

    int id;

    TextView tvName;
    TextView tvDescription;

    public WorkoutDetailFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static WorkoutDetailFragment newInstance() {
        WorkoutDetailFragment fragment = new WorkoutDetailFragment();
        return fragment;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_workout_detail, container, false);

        tvName = rootView.findViewById(R.id.tvName);
        tvDescription = rootView.findViewById(R.id.tvDescription);

        Workout workout = Workout.arrWorkouts[id];

        tvName.setText(workout.name);
        tvDescription.setText(workout.description);


        return rootView;
    }
}