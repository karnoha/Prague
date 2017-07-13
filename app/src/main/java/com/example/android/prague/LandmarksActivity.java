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
        items.add(new Item("Karlův most", "historic bridge that crosses the Vltava river", "free", "www.karluvmostpraha.eu", R.drawable.karluv_most));
        items.add(new Item("Vyšehrad", "historic fort built in the 10th century", "free", "www.praha-vysehrad.cz", R.drawable.vysehrad));
        items.add(new Item("Staroměstský orloj", "medieval astronomical clock installed in 1410", "free\n250 CZK to tower", "-", R.drawable.orloj));
        items.add(new Item("Katedrála svatého Víta", "historic fort built in the 10th century", "free", "www.praha-vysehrad.cz", R.drawable.vysehrad));
        items.add(new Item("Vyšehrad", "historic fort built in the 10th century", "free", "www.praha-vysehrad.cz", R.drawable.vysehrad));

        ItemAdapter adapter = new ItemAdapter(this, items);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
