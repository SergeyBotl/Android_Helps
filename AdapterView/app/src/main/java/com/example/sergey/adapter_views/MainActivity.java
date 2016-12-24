package com.example.sergey.adapter_views;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import com.example.sergey.adapter_views.entity.Model;

public class MainActivity extends AppCompatActivity {
    String[] marka = {"HTC", "LG", "Samsung", "Lenovo"};
    String[] model = {"M8", "L90", "3S", "S9000"};
    ArrayAdapter<Model> adapter;
    CustomAdapter customAdapter;
     ListView mListView=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         mListView = (ListView) findViewById(R.id.listView);
        final ArrayList<Model> list = new ArrayList<>();

        for (int i = 0; i < marka.length; i++) {
            list.add(new Model(R.mipmap.ic_launcher, marka[i], model[i]));
        }
        //adapter = new ArrayAdapter<Model>(this, android.R.layout.simple_list_item_1, list);

        customAdapter = new CustomAdapter(this, R.layout.my_item_list, list);

        View header = createHeader("header 1");

        mListView.addHeaderView(header);

        mListView.setAdapter(customAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }


    View createHeader(String text) {
        View v = getLayoutInflater().inflate(R.layout.header, null);
        ((TextView) v.findViewById(R.id.textView)).setText(text);
        return v;
    }


}
