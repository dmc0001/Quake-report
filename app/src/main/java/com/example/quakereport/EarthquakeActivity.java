package com.example.quakereport;


import android.os.Bundle;

import android.widget.ListView;
import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;


public class EarthquakeActivity extends AppCompatActivity {


    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = QueryUtils.extractEarthquakes();


        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        EarthquakeAdapter flavorAdapter = new EarthquakeAdapter(this, earthquakes);
        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(flavorAdapter);
    }
}