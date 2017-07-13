package com.example.android.prague;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Karnoha on 12.07.2017.
 */

public class LandmarksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);


        // Create a list of words
        // order: name, desc, price, contact, imageID
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.L1_1), getString(R.string.L1_2), getString(R.string.L1_3), getString(R.string.L1_4), R.drawable.karluv_most));
        items.add(new Item(getString(R.string.L2_1), getString(R.string.L2_2), getString(R.string.L2_3), getString(R.string.L2_4), R.drawable.vysehrad));
        items.add(new Item(getString(R.string.L3_1), getString(R.string.L3_2), getString(R.string.L3_3), getString(R.string.L3_4), R.drawable.orloj));
        items.add(new Item(getString(R.string.L4_1), getString(R.string.L4_2), getString(R.string.L4_3), getString(R.string.L4_4), R.drawable.vit));
        items.add(new Item(getString(R.string.L5_1), getString(R.string.L5_2), getString(R.string.L5_3), getString(R.string.L5_4), R.drawable.petrin));

        ItemAdapter adapter = new ItemAdapter(this, items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
