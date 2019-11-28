package com.example.json_from_php;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ThreeColumn_ListAdapter extends ArrayAdapter<User> {

    private LayoutInflater mInflater;
    private ArrayList<User> users;
    private int mViewResourceId;

    public ThreeColumn_ListAdapter(Context context, int textViewResourceId, ArrayList<User> users) {
        super(context, textViewResourceId, users);
        this.users = users;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        User user = users.get(position);

        if (user != null) {
            TextView value1 = (TextView) convertView.findViewById(R.id.textFirstName);
            TextView value2 = (TextView) convertView.findViewById(R.id.textLastName);
            TextView value3 = (TextView) convertView.findViewById(R.id.textFavFood);
            if (value1 != null) {
                value1.setText(user.getValue1());
            }
            if (value2 != null) {
                value2.setText((user.getValue2()));
            }
            if (value3 != null) {
                value3.setText((user.getValue3()));
            }
        }

        return convertView;
    }
}