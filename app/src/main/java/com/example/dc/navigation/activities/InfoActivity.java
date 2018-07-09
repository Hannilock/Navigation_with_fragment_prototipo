package com.example.dc.navigation.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.example.dc.navigation.R;
import com.example.dc.navigation.models.Info;
import com.example.dc.navigation.adapters.InfoAdapter;



public class InfoActivity extends AppCompatActivity {
    private List<Info> infos;
    private RecyclerView recycler;
    private InfoAdapter adapter;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        populateLists();
        setViews();
    }

    private void populateLists() {
        infos = new ArrayList<>();
        infos.add(new Info("Endereço", R.drawable.locationicon));
        infos.add(new Info("Taxa",R.drawable.coinicon));
        infos.add(new Info("Telefone",R.drawable.phoneicon));
        infos.add(new Info("Horário de Funcionamento",R.drawable.clockicon));
        infos.add(new Info("html do site aqui",R.drawable.urlicon));
    }

    private void setViews() {
       // toolbar = (Toolbar) findViewById(R.id.toolbar_view);
       // toolbar.setTitleTextColor(getResources().getColor(R.color.lesser_white));
       // setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        recycler = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new InfoAdapter(infos);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        fab = (FloatingActionButton) findViewById(R.id.gps_fab);

        fab.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String coordinatesHolder = String.format(Locale.ENGLISH, "geo:%f,%f", -29.8818, -50.2875);
               Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(coordinatesHolder));
               intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
               startActivity(intent);
           }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;

    }
}
