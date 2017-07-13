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
        items.add(new Item("Prague Apartments", "In the centre, but still in a quiet location", "2323 CZK", "www.booking.com", R.drawable.apartment));
        items.add(new Item("Hotel Kampa", "City center, next to Charles Bridge", "3106", "www.booking.com", R.drawable.kampa));
        items.add(new Item("Kolej Strahov", "Cheap solution at college dormitory", "418 CZK", "www.suz.cvut.cz/koleje/", R.drawable.strahov));
        items.add(new Item("Airbnb flats", "Choose from many flats in Prague, price varies.", "from 776 CZK", "www.airbnb.cz", R.drawable.airbnb));
        items.add(new Item("Aquapalace hotel", "At the edge of Prague in a giant aqualand", "3887 CZK", "www.aquapalacehotel.cz", R.drawable.aquapalace));



        ItemAdapter adapter = new ItemAdapter(this, items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
