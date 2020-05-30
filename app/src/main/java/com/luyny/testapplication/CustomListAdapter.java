package com.luyny.testapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Game> games; //data source of the list adapter

    public CustomListAdapter(Context context, ArrayList<Game> games) {
        this.context = context;
        this.games = games;
    }

    @Override
    public int getCount() {
        return games.size(); //returns total of items in the list
    }

    @Override
    public Object getItem(int position) {
        return games.get(position); //returns list item at the specified position
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // inflate the layout for each list row
        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.layout_list_view_row_items, parent, false);
        }

        // get current item to be displayed
        Game currentItem = (Game) getItem(position);

        // get the TextView for item name and item description
        TextView textViewGameName = convertView.findViewById(R.id.text_name);
        TextView textViewGameStyle = convertView.findViewById(R.id.text_genre);
        TextView textViewGameLaunch = convertView.findViewById(R.id.text_launch);

        //sets the text for item name and item description from the current item object
        textViewGameName.setText(currentItem.getName());
        textViewGameStyle.setText(currentItem.getGenre());
        textViewGameLaunch.setText(currentItem.getLaunchDate());
        // returns the view for the current row
        return convertView;
    }
}
