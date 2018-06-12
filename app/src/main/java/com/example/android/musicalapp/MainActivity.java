package com.example.android.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the View that shows the numbers category
        TextView siouxsie = (TextView) findViewById(R.id.siouxsie);

        //Set a clickListener on that View
        siouxsie.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category View is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent siouxsieIntent = new Intent(MainActivity.this,
                        SiouxsieActivity.class);
                //Start the new activity
                startActivity(siouxsieIntent);

            }
        });


        //Find the View that shows the numbers category
        TextView mary = (TextView) findViewById(R.id.mary);

        //Set a clickListener on that View
        mary.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category View is clicked on.

            //@Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent maryIntent = new Intent(MainActivity.this,
                        MaryActivity.class);
                //Start the new activity
                startActivity(maryIntent);

            }
        });
    }
}

