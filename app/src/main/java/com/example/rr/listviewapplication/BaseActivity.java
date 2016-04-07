package com.example.rr.listviewapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 若冰RR on 2016/4/7.
 */
public class BaseActivity extends BaseAdapter {
    private List<String> list;
    private Context mcontext;

    public BaseActivity(List<String> list, Context mcontext) {
        this.list = list;
        this.mcontext = mcontext;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(mcontext).inflate(R.layout.layout,null);
        TextView textView= (TextView) convertView.findViewById(R.id.textview1);
//        TextView textView1= (TextView) convertView.findViewById(R.id.textview2);
//        ImageView imageView= (ImageView) convertView.findViewById(R.id.imageview);

        textView.setText(list.get(position));
        return convertView;
    }
}
