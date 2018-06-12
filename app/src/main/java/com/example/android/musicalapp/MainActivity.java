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
        TextView numbers = (TextView) findViewById(R.id.siouxsie);

        //Set a clickListener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
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
    }

}







//package com.example.android.musicalapp;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.TextView;
//
//
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        // Set the content of the activity to use the activity_main.xml layout file
//        setContentView(R.layout.activity_main);
//
//        //Find the View that shows the numbers category
//        TextView songs = (TextView) findViewById(R.id.siouxsie);
//
//        //Set a clickListener on that View
//        songs.setOnClickListener(new OnClickListener() {
//            // The code in this method will be executed when the numbers category View is clicked on.
//
//            @Override
//            public void onClick(View view) {
//                // Create a new intent to open the {@link NumbersActivity}
//                Intent siouxsieIntent = new Intent(MainActivity.this,
//                        SiouxsieActivity.class);
//                //Start the new activity
//                startActivity(siouxsieIntent);
//
//            }
//        });
//    }
//
//}
