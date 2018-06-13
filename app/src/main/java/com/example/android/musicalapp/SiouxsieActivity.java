package com.example.android.musicalapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by rosaperez on 6/10/18.
 */

public class SiouxsieActivity extends AppCompatActivity {


    private Object android;
    private ListAdapter adapter;
    private ListAdapter itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an array of words
        // words.add("one");
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("painted bird", "A Kiss in the Dreamhouse\n"));
        songs.add(new Song("Siousxie", "Painted Bird", R.drawable.siouxsie));
        songs.add(new Song("Mary Wells", "Two Lovers", R.drawable.mary));


        songs.add(new Song("two", "otiiko"));
        songs.add(new Song("three", "tolookosu"));
        songs.add(new Song("four", "oyyisa"));
        songs.add(new Song("five", "massokka"));
        songs.add(new Song("five", "massokka"));
        songs.add(new Song("five", "massokka"));
        songs.add(new Song("five", "massokka"));
        songs.add(new Song("five", "massokka"));
        songs.add(new Song("five", "massokka"));


        // Create a new {@link TextView}
        // adapter knows how to create
        //WordAdapter itemsAdapter = new WordAdapter(this,words);
        SongAdapter itemsAdapter = new SongAdapter(this, songs);

        //ArrayAdapter itemsAdapter = new ArrayAdapter();
        //WordAdapter itemsAdapter = new WordAdapter();

        // Find the {@link ListView} object in the
        // There should be a {@link ListView}
        // word_listyout
        ListView listView = (ListView) findViewById(R.id.list);


        // Make the {@link ListView} use the
        // {@link ListView} will display

        listView.setAdapter(itemsAdapter);

    }

}

