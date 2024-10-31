package com.example.pickaplan.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.pickaplan.R;

import java.util.List;

public class gridAdapter extends BaseAdapter {

    private Context context;
    private List<Integer> photouri;

    public gridAdapter(Context context, List<Integer> photouri)
    {
        this.context = context;
        this.photouri = photouri;
    }

    @Override
    public int getCount() {
        return photouri.size();
    }

    @Override
    public Object getItem(int position) {
        return photouri.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(R.layout.items,parent,false);

            ImageView imageView = convertView.findViewById(R.id.image_view);


            imageView.setImageResource(photouri.get(position));


        }
        return convertView;
    }
}
