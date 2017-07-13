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
        items.add(new Item(getString(R.string.T1_1), getString(R.string.T1_2), getString(R.string.T1_3), getString(R.string.T1_4), R.drawable.tick_tack));
        items.add(new Item(getString(R.string.T2_1), getString(R.string.T2_2), getString(R.string.T2_3), getString(R.string.T2_4), R.drawable.aaa));
        items.add(new Item(getString(R.string.T3_1), getString(R.string.T3_2), getString(R.string.T3_3), getString(R.string.T3_4), R.drawable.hopon));
        items.add(new Item(getString(R.string.T4_1), getString(R.string.T4_2), getString(R.string.T4_3), getString(R.string.T4_4), R.drawable.liftago));
        items.add(new Item(getString(R.string.T5_1), getString(R.string.T5_2), getString(R.string.T5_3), getString(R.string.T5_4), R.drawable.uber));
        items.add(new Item(getString(R.string.T6_1), getString(R.string.T6_2), getString(R.string.T6_3), getString(R.string.T6_4), R.drawable.dpp));

        ItemAdapter adapter = new ItemAdapter(this, items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
