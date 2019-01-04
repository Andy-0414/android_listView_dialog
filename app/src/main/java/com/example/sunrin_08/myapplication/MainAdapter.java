package com.example.sunrin_08.myapplication;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<Item> al;
    public MainAdapter(Context context){
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        al = new ArrayList<Item>();
    }
    @Override
    public int getCount() {
        return al.size();
    }

    @Override
    public Item getItem(int position) {
        return al.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null) {
            convertView = inflater.inflate(R.layout.content_main, null);
        }
        TextView name = convertView.findViewById(R.id.name);
        TextView num = convertView.findViewById(R.id.num);
        TextView birth = convertView.findViewById(R.id.birth);

        name.setText(this.getItem(position).getName());
        num.setText(this.getItem(position).getNum());
        birth.setText(this.getItem(position).getBirth());

        return convertView;
    }

    public void putItem(String name,String num, String birth){
        Item i = new Item(name,num,birth);
        al.add(i);
    }
}
