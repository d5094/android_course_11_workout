package com.example.workout;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

public class WorkoutListFragment extends ListFragment {

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    OnItemClickListener listener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        if(getActivity() instanceof OnItemClickListener) {
            listener = (OnItemClickListener) getActivity();
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        String[] arrNames = new String[Workout.arrWorkouts.length];

        for(int i=0; i<arrNames.length; i++) {
            arrNames[i] = Workout.arrWorkouts[i].name;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(), android.R.layout.simple_list_item_1, arrNames);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        if(listener != null) {
            listener.onItemClick(position);
        }
    }
}
