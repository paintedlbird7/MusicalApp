package com.example.android.musicalapp;

/**
 * Created by rosaperez on 6/13/18.
 */


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

//**
//        *{
//
//@link MainActivity} shows a list of Siousxie and the Banshees songs.
public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = (ListView) findViewById(R.id.listview_flavor);


        SongListAdapter flavorAdapter = null;
        listView.setAdapter(flavorAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, SiousxieActivity.class);
                startActivity(intent);

            }

        });


        // Create an ArrayList of SongList objects
        ArrayList<SongList> androidFlavors = new ArrayList<SongList>();
        androidFlavors.add(new SongList("Siouxsie", "Cascade", R.drawable.siouxsie));
        androidFlavors.add(new SongList("Siouxsie", "Green Fingers", R.drawable.siouxsie));
        androidFlavors.add(new SongList("Siouxsie", "Obsession", R.drawable.siouxsie));
        androidFlavors.add(new SongList("Siouxsie", "She's a Carnival", R.drawable.siouxsie));
        androidFlavors.add(new SongList("Siouxsie", "Circle", R.drawable.siouxsie));
        androidFlavors.add(new SongList("Siouxsie", "Melt!", R.drawable.siouxsie));
        androidFlavors.add(new SongList("Siouxsie", "Painted Bird", R.drawable.siouxsie));
        androidFlavors.add(new SongList("Siouxsie", "Cocoon", R.drawable.siouxsie));
        androidFlavors.add(new SongList("Siouxsie", "Slowdive", R.drawable.siouxsie));


        // Create an {@link SongListAdapter}, whose data source is a list of
        // {@link SongList}s. The adapter knows how to create list item views for each item
        // in the list.
        flavorAdapter = new SongListAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_flavor);
        listView.setAdapter(flavorAdapter);

    }

}