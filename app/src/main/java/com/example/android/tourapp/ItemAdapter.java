package com.example.android.tourapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by latud on 19.04.2018.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    private int mColorResourceId;

    public ItemAdapter(Activity context, ArrayList<Item> words, int ColorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = ColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.main_list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Item currentItem = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView string1TextView = (TextView) listItemView.findViewById(R.id.string1_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        string1TextView.setText(currentItem.getString1());

        /** currentWord potomu chto so stranici Word.java
         *
         */

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView string2TextView = (TextView) listItemView.findViewById(R.id.string2_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        string2TextView.setText(currentItem.getString2());

        // Return the whole list item layout
        // so that it can be shown in the ListView

        TextView string3TextView = (TextView) listItemView.findViewById(R.id.string3_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView

        if (currentItem.hasString()){
            string3TextView.setText(currentItem.getString3());
            string3TextView.setVisibility(View.VISIBLE);
        }
                else {
            string3TextView.setVisibility(View.GONE);
        }

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentItem.hasImage()) {

            // Get the version number from the current AndroidFlavor object and
            // set this text on the number TextView
            iconView.setImageResource(currentItem.getImageResourceId());

            iconView.setVisibility(View.VISIBLE);
        }
        else {
            iconView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

