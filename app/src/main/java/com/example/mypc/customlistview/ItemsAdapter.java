package com.example.mypc.customlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by MyPC on 1/17/2017.
 */

public class ItemsAdapter extends BaseAdapter {

    ArrayList<Items> listData;
    LayoutInflater inflater;
    public ItemsAdapter(Context context,ArrayList<Items> listData){
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.listData = listData;
    }
    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Items item = listData.get(position);
        TextView txtName, txtPhone,txtId;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.items, parent, false);
        }
        txtName = (TextView) convertView.findViewById(R.id.textViewItems2);
        txtPhone = (TextView) convertView.findViewById(R.id.textViewItems3);
        txtId = (TextView) convertView.findViewById(R.id.textViewItems1);
        // Set dữ liệu vào item của list view
        txtName.setText(item.getName());
        txtPhone.setText(item.getPhone());
        String id = String.valueOf(item.getId());
        txtId.setText(id);
        return convertView;
    }
}
