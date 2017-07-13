package com.example.android.prague;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Karnoha on 12.07.2017.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_layout, parent, false);
        }

        Item currentItem = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.layout_name);
        nameTextView.setText(currentItem.getName());

        TextView descTextView = (TextView) listItemView.findViewById(R.id.layout_desc);
        descTextView.setText(currentItem.getDesc());

        TextView priceTextView = (TextView) listItemView.findViewById(R.id.layout_price);
        priceTextView.setText(currentItem.getPrice());

        TextView contactTextView = (TextView) listItemView.findViewById(R.id.layout_contact);
        contactTextView.setText(currentItem.getContact());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.layout_image);
        imageView.setImageResource(currentItem.getImageID());


        return listItemView;
    }


    public ItemAdapter(Activity context, ArrayList<Item> Item) {
        super(context, 0, Item);
    }
}
