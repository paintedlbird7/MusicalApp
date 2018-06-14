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
//@link MainActivity} shows a list of Android platform releases.
//        * For each release, display the name, version number, and image.
//        */
public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] listviewitems = new String[]{"Siouxsie", "Mary", "Painted Bird", "Two Lovers"};


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

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });



        // Create an ArrayList of SongList objects
        ArrayList<SongList> androidFlavors = new ArrayList<SongList>();
        androidFlavors.add(new SongList("Siousxie", "Painted Bird", R.drawable.siouxsie));
        androidFlavors.add(new SongList("Mary Wells", "Two Lovers", R.drawable.mary));

        androidFlavors.add(new SongList("Donut", "2.2-2.2.3", R.drawable.donut));
        androidFlavors.add(new SongList("Eclair", "2.3-2.3.7", R.drawable.eclair));


        // Create an {@link SongListAdapter}, whose data source is a list of
        // {@link SongList}s. The adapter knows how to create list item views for each item
        // in the list.
        flavorAdapter = new SongListAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_flavor);
        listView.setAdapter(flavorAdapter);
    }
}
