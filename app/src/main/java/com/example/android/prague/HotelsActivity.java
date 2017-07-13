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
        items.add(new Item("Jmeno super veci", "tahle super vec tady bude popsana", "$20-$40", "www.praha.cz", R.drawable.kaktus));
        items.add(new Item("Jmeno super veci", "tahle super vec tady bude popsana", "$20-$40", "www.praha.cz", R.drawable.kaktus));
        items.add(new Item("Jmeno super veci", "tahle super vec tady bude popsana", "$20-$40", "www.praha.cz", R.drawable.kaktus));

        ItemAdapter adapter = new ItemAdapter(this, items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
