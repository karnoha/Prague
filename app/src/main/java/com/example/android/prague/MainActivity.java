package com.example.android.prague;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //////////Buttons on main screen

        Button landmarks = (Button) findViewById(R.id.main_button_landmark);
        Button hotels = (Button) findViewById(R.id.main_button_hotels);
        Button restaurants = (Button) findViewById(R.id.main_button_restaurants);
        Button transport = (Button) findViewById(R.id.main_button_transport);

        ////////// setting onclick listeners for buttons and using intents

        landmarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent landmarksIntent = new Intent(MainActivity.this, LandmarksActivity.class);
                startActivity(landmarksIntent);
            }
        });

        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(hotelsIntent);
            }
        });

        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });

        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent transportIntent = new Intent(MainActivity.this, TransportationActivity.class);
                startActivity(transportIntent);
            }
        });
    }
}
