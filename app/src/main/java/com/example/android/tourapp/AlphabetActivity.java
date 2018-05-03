package com.example.android.tourapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by latud on 19.04.2018.
 */

public class AlphabetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new AlphabetFragment())
                .commit();
    }
}
