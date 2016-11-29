package com.example.sergey.adapter_views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import com.example.sergey.adapter_views.entity.Model;

public class MainActivity extends AppCompatActivity {
    String[] marka = {"HTC", "LG", "Samsung","Lenovo"};
    String[] model = {"M8", "L90", "3S","S9000"};
    ArrayAdapter<Model> adapter;
     CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView mListView = (ListView) findViewById(R.id.listView);
        final ArrayList<Model> list = new ArrayList<>();


        for (int i = 0; i < marka.length; i++) {
            list.add(new Model(R.mipmap.ic_launcher, marka[i], model[i]));
        }
        /*adapter = new ArrayAdapter<Model>(this, android.R.layout.simple_list_item_activated_1, list);*/

        customAdapter=new CustomAdapter(this,R.layout.my_item_list,list);

        mListView.setAdapter(customAdapter);

    }



}
