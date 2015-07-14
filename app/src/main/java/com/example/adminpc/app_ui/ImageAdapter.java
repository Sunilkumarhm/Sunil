package com.example.adminpc.app_ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Admin PC on 6/3/2015.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mcontext;

    public ImageAdapter(Context c){
        mcontext =c;
    }

    public int getCount(){
        return mThumbIds.length;
    }

    public Object getItem(int position){
        return null;
    }

    public long getItemId(int position){
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mcontext);
            imageView.setLayoutParams(new GridView.LayoutParams(250, 200));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(2, 2, 2, 2);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.beautician, R.drawable.housekeeping,
            R.drawable.laundry, R.drawable.img1,
           // R.drawable.twittericon, R.drawable.download,
           // R.drawable.gmail, R.drawable.yah,
           // R.drawable.twittericon, R.drawable.download,
            //R.drawable.gmail, R.drawable.yah,
           // R.drawable.twittericon, R.drawable.download,
            //R.drawable.gmail, R.drawable.yah
            //R.drawable.sample_6, R.drawable.sample_7,
            //R.drawable.sample_0, R.drawable.sample_1,
            //R.drawable.sample_2, R.drawable.sample_3,
            // R.drawable.sample_4, R.drawable.sample_5,
            // R.drawable.sample_6, R.drawable.sample_7,
            // R.drawable.sample_0, R.drawable.sample_1,
            //R.drawable.sample_2, R.drawable.sample_3,
            //R.drawable.sample_4, R.drawable.sample_5,
            //R.drawable.sample_6, R.drawable.sample_7
    };
}
