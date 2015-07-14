package com.example.adminpc.app_ui;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends ArrayAdapter<WaxItems> {

    WaxItems[] waxItems = null;
    Context context;

    public ListAdapter(Context context, WaxItems[] objects) {
        super(context, R.layout.list_wax, objects);
        // TODO Auto-generated constructor stub
        this.context = context;
        this.waxItems = objects;

    }

    @Override
    public View getView(int position, View convertView1, ViewGroup parent) {
        // TODO Auto-generated method stub

        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        convertView1 = inflater.inflate(R.layout.list_wax, parent, false);

        TextView name = (TextView) convertView1.findViewById(R.id.name1);
        TextView price = (TextView) convertView1.findViewById(R.id.price1);
        CheckBox cb = (CheckBox) convertView1.findViewById(R.id.checkBox1);
        name.setText(waxItems[position].getName());
        price.setText(String.valueOf(waxItems[position].getPrice()));
                /*if(dataItems[position].getValue() == 1)
                        cb.setChecked(true);
                else
                        cb.setChecked(false);*/
        return convertView1;

    }


}