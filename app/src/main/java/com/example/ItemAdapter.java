package com.example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends BaseAdapter {

    private List<Item> Data;
    private final LayoutInflater mInflater;
    private final int mResource;
    private Context mContext;

    public ItemAdapter(Context context, int resId, List<Item> data)
    {
        mContext = context;
        Data = data;
        mInflater = LayoutInflater.from(context);
        mResource = resId;
    }

    @Override
    public int getCount() {
        return Data != null ? Data.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return Data != null ? Data.get(position): null ;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = mInflater.inflate(mResource, parent, false);
        }

        Item item = Data.get(position);

        TextView name = convertView.findViewById(R.id.music_title);
        name.setText(item.name);

        TextView desc = convertView.findViewById(R.id.music_artist);
        desc.setText(item.desc);

        ImageView picture = convertView.findViewById(R.id.music_thumb);
        picture.setImageResource(item.pic);

        return convertView;
    }

}
