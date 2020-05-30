package com.luyny.testapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class InfoFragment extends Fragment {
    ListView gameList;
    public InfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        gameList = view.findViewById(R.id.game_list);

        MainActivity mainActivity = (MainActivity) getActivity();


        CustomListAdapter adapter = new CustomListAdapter(getContext(), mainActivity.gamesArrayList);
        gameList.setAdapter(adapter);

        return view;
    }
}
