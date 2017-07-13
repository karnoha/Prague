package com.example.android.prague;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Karnoha on 12.07.2017.
 */

public class TransportationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);


        // Create a list of words
        // order: name, desc, price, contact, imageID
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("TICK TACK", "White Audi A6 cars", "25 CZK / km", "www.ticktack.cz", R.drawable.tick_tack));
        items.add(new Item("AAA taxi", "Yellow cars, usualy Skoda Octavia / Superb", "19 CZK / km", "www.aaataxi.cz", R.drawable.aaa));
        items.add(new Item("Hop-On Hop-Off", "Bus tour rides around city with stops", "550 CZK / tour", "city-sightseeing.com", R.drawable.hopon));
        items.add(new Item("Liftago", "An app you can download and search for any taxi in the city", "depends on taxi", "www.liftago.com", R.drawable.liftago));
        items.add(new Item("UBER", "Cheapest taxi you can find. Drives anyone with car, no taxis.", "depends on driver", "www.uber.com", R.drawable.uber));
        items.add(new Item("DPP", "Public transportation - trams, buses, subway.", "32 CZK / 90 min \n110 CZK / 24 h", "www.dpp.cz", R.drawable.dpp));

        ItemAdapter adapter = new ItemAdapter(this, items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
