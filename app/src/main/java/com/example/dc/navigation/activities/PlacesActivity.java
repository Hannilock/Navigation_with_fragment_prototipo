package com.example.dc.navigation.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.dc.navigation.R;
import com.example.dc.navigation.adapters.PlacesAdapter;
import com.example.dc.navigation.models.Place;

import java.util.ArrayList;
import java.util.List;



public class PlacesActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView recycler;
    private PlacesAdapter adapter;
    public List<Place> places;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        populateList();
        setViews();

    }

    private void populateList() {
        places = new ArrayList<>();
        for(int i = 0; i < 8; i++){
            places.add(new Place("Mirante","Pontos Turisticos",R.drawable.miranteexampleimg));
        }

    }

    private void setViews() {
       // toolbar = (Toolbar) findViewById(R.id.toolbar_view);
       // toolbar.setTitleTextColor(getResources().getColor(R.color.lesser_white));
       // setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        recycler = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new PlacesAdapter(places, PlacesActivity.this);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
