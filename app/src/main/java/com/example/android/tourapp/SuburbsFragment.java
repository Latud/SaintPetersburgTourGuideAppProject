package com.example.android.tourapp;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SuburbsFragment extends Fragment {

    /**
     * This listener gets triggered whenever the audio focus changes
     * (i.e., we gain or lose audio focus because of another app or device).
     */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.mainadapter_list, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(getString(R.string.peterhof),getString(R.string.peterhof_russian), R.drawable.peterhof_initialphoto));
        items.add(new Item(getString(R.string.pavlovsk),getString(R.string.pavlovsk_russian), R.drawable.pavlovsk_initialphoto));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Item openActivitySuburbs = items.get(position);
                if (position == 0){
                Intent PeterhofIntent = new Intent(getActivity(), PeterhofActivity.class);
                startActivity(PeterhofIntent);}

                if (position == 1){
                    Intent PavlovskIntent = new Intent(getActivity(), PavlovskActivity.class);
                    startActivity(PavlovskIntent);}
            }
        });

        return rootView;
    }

}

