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
        items.add(new Item("Brasileiro Ambiente", "All you can eat, meat meat meat...", "785 CZK", "brasileiro-slovanskydum.ambi.cz", R.drawable.ambiente));
        items.add(new Item("Bejzment", "Finest american burgers in Prague", "250 CZK", "www.bejzment.cz", R.drawable.bejzment));
        items.add(new Item("The PUB", "Czech restaurant with beer taps on each table", "200 CZK", "www.thepub.cz", R.drawable.pub));
        items.add(new Item("Neklid", "Little restaurant for locals", "150 CZK", "www.neklid.com", R.drawable.neklid));


        ItemAdapter adapter = new ItemAdapter(this, items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
