package com.example.android.prague;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Karnoha on 12.07.2017.
 */

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);


        // Create a list of words
        // order: name, desc, price, contact, imageID
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.H1_1), getString(R.string.H1_2), getString(R.string.H1_3), getString(R.string.H1_4), R.drawable.apartment));
        items.add(new Item(getString(R.string.H2_1), getString(R.string.H2_2), getString(R.string.H2_3), getString(R.string.H2_4), R.drawable.kampa));
        items.add(new Item(getString(R.string.H3_1), getString(R.string.H3_2), getString(R.string.H3_3), getString(R.string.H3_4), R.drawable.strahov));
        items.add(new Item(getString(R.string.H4_1), getString(R.string.H4_2), getString(R.string.H4_3), getString(R.string.H4_4), R.drawable.airbnb));
        items.add(new Item(getString(R.string.H5_1), getString(R.string.H5_2), getString(R.string.H5_3), getString(R.string.H5_4), R.drawable.aquapalace));



        ItemAdapter adapter = new ItemAdapter(this, items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
