package com.example.android.musicalapp;

/**
 * Created by rosaperez on 6/13/18.
 */


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.attr.name;

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

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context:
        this, android.R.id.layout.simple_list_item_2,
                android.R.id.text1, listviewitems)

        View.setAdapter(adapter);

        View.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            !Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String Templistview = listviewitems[position].toString();

                Context packageContext;
                Intent intent = new Intent(packageContext:MainActivity.this, secondactivity.class)

                intent.putExtra(name:"Listviewclickvalue", Templistview);
                startActivity();
            }
        });
    





        // Create an ArrayList of SongList objects
        ArrayList<SongList> androidFlavors = new ArrayList<SongList>();
        androidFlavors.add(new SongList("Siousxie", "Painted Bird", R.drawable.siouxsie));
        androidFlavors.add(new SongList("Mary Wells", "Two Lovers", R.drawable.mary));

        androidFlavors.add(new SongList("Donut", "2.2-2.2.3", R.drawable.donut));
        androidFlavors.add(new SongList("Eclair", "2.3-2.3.7", R.drawable.eclair));
//        androidFlavors.add(new SongList("Honeycomb", "3.0-3.2.6", R.drawable.honeycomb));
//        androidFlavors.add(new SongList("Ice Cream Sandwich", "4.0-4.0.4", R.drawable.icecream));
//        androidFlavors.add(new SongList("Jelly Bean", "4.1-4.3.1", R.drawable.jellybean));
//        androidFlavors.add(new SongList("KitKat", "4.4-4.4.4", R.drawable.kitkat));
//        androidFlavors.add(new SongList("Lollipop", "5.0-5.1.1", R.drawable.lollipop));
//        androidFlavors.add(new SongList("Marshmallow", "6.0-6.0.1", R.drawable.marshmallow));

        // Create an {@link SongListAdapter}, whose data source is a list of
        // {@link SongList}s. The adapter knows how to create list item views for each item
        // in the list.
        SongListAdapter flavorAdapter = new SongListAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_flavor);
        listView.setAdapter(flavorAdapter);
    }

    private void startActivity() {
    }
}
