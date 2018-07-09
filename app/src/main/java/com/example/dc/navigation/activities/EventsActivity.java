package com.example.dc.navigation.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.dc.navigation.R;
import com.example.dc.navigation.adapters.EventsAdapter;
import com.example.dc.navigation.models.Place;

import java.util.ArrayList;
import java.util.List;



public class EventsActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView recycler;
    private EventsAdapter adapter;
    private List<Place> events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        populateLists();
        setViews();
    }

    private void populateLists() {
        events = new ArrayList<>();
        for(int i  = 0; i < 20; i++){
            events.add(new Place("Nome do Evento","Data do evento",R.drawable.miranteexampleimg));
        }
    }

    private void setViews() {
        //toolbar = (Toolbar) findViewById(R.id.toolbar_view);
        //toolbar.setTitleTextColor(getResources().getColor(R.color.lesser_white));
       // setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        recycler = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new EventsAdapter(events, this);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new GridLayoutManager(this, 2));
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
