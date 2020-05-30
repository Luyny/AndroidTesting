package com.luyny.testapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class HomeFragment extends Fragment {
    Button btnGameConfirm;
    EditText editName;
    EditText editStyle;
    EditText editLaunch;
    MainActivity mainActivity;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        editName = view.findViewById(R.id.edit_game_name);
        editStyle = view.findViewById(R.id.edit_game_genre);
        editLaunch = view.findViewById(R.id.edit_game_launch);
        btnGameConfirm = view.findViewById(R.id.btn_game_confirm);

        mainActivity = (MainActivity) getActivity();


        btnGameConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.gamesArrayList.add(new Game(
                        editName.getText().toString(),
                        editLaunch.getText().toString(),
                        editStyle.getText().toString()));

                //reset input fields
                editName.setText("");
                editStyle.setText("");
                editLaunch.setText("");
            }
        });


        return view;
    }
}
