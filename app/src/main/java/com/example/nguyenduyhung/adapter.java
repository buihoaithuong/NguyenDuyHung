package com.example.nguyenduyhung;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class adapter extends BaseAdapter {
    private Context context;
    private int layout;
    List<Nuoc> nuocList;

    public adapter(Context context, int layout, List<Nuoc> nuocList) {
        this.context = context;
        this.layout = layout;
        this.nuocList = nuocList;
    }

    @Override
    public int getCount() {
        return nuocList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);

        ImageView img = (ImageView)convertView.findViewById(R.id.imageView);
        TextView txt1 = (TextView) convertView.findViewById(R.id.tv1);
        TextView txt2 = (TextView) convertView.findViewById(R.id.tv2);

        return convertView;
    }
}
