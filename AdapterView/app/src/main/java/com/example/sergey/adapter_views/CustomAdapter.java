package com.example.sergey.adapter_views;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sergey.adapter_views.entity.Model;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Model> {

    private Context context;

    public CustomAdapter(Context context, int resource, List<Model> objects) {
        super(context, resource, objects);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        Model model = getItem(position);
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.my_item_list, null);

            holder = new ViewHolder();
            holder.imageId = (ImageView) convertView.findViewById(R.id.imageView);
            holder.text1 = (TextView) convertView.findViewById(R.id.textView1);
            holder.text2 = (TextView) convertView.findViewById(R.id.textView2);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

       //можно и без ViewHolder ========================================
        /*  TextView text1, text2;
       imageId = (ImageView) convertView.findViewById(R.id.imageView);
        text1 = (TextView) convertView.findViewById(R.id.textView1);
        text2 = (TextView) convertView.findViewById(R.id.textView2);

        if (model!=null){
            imageId.setImageResource(model.getImageId());
            text1.setText(model.getMarka());
            text2.setText(model.getModel());
        }*/// =============================================================
            holder.imageId.setImageResource(model.getImageId());
            holder.text1.setText(model.getMarka());
            holder.text2.setText(model.getModel());


        return convertView;
    }



    private class ViewHolder {
        ImageView imageId;
        TextView text1;
        TextView text2;

    }
}
