package com.example.android.prague;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Karnoha on 12.07.2017.
 */

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);


        // Create a list of words
        // order: name, desc, price, contact, imageID
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.R1_1), getString(R.string.R1_2), getString(R.string.R1_3), getString(R.string.R1_4), R.drawable.ambiente));
        items.add(new Item(getString(R.string.R2_1), getString(R.string.R2_2), getString(R.string.R2_3), getString(R.string.R2_4), R.drawable.bejzment));
        items.add(new Item(getString(R.string.R3_1), getString(R.string.R3_2), getString(R.string.R3_3), getString(R.string.R3_4), R.drawable.pub));
        items.add(new Item(getString(R.string.R4_1), getString(R.string.R4_2), getString(R.string.R4_3), getString(R.string.R4_4), R.drawable.neklid));


        ItemAdapter adapter = new ItemAdapter(this, items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
