package com.example.adminpc.app_ui;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

//define your custom adapter
public class CustomAdapter extends ArrayAdapter<DataItem>{

        DataItem[] dataItems = null;
        Context context;

        public CustomAdapter(Context context, DataItem[] objects) {
                super(context, R.layout.list_item, objects);
                // TODO Auto-generated constructor stub
                this.context = context;
                this.dataItems = objects;

        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
                // TODO Auto-generated method stub

                LayoutInflater inflater = ((Activity)context).getLayoutInflater();
                convertView = inflater.inflate(R.layout.list_item, parent, false);

                TextView name = (TextView) convertView.findViewById(R.id.name);
                TextView price = (TextView) convertView.findViewById(R.id.price);
                CheckBox cb = (CheckBox) convertView.findViewById(R.id.checkBox);
                name.setText(dataItems[position].getName());
                price.setText(String.valueOf(dataItems[position].getPrice()));
                /*if(dataItems[position].getValue() == 1)
                        cb.setChecked(true);
                else
                        cb.setChecked(false);*/
                return convertView;

        }


}