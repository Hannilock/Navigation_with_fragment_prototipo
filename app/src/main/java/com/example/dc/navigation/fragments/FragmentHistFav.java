package com.example.dc.navigation.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

import com.example.dc.navigation.R;
import com.example.dc.navigation.adapters.FavHistAdapter;
import com.example.dc.navigation.models.Place;

import java.util.ArrayList;
import java.util.List;

public class FragmentHistFav extends Fragment {
    private RecyclerView recyclerView;
    private FavHistAdapter adapter;
    private Context context;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hist_fav, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        context = view.getContext();
        setViews();
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
    }

    private void setViews() {
        List<Place> places = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            places.add(new Place("Nome do Lugar","Tipo de Lugar",R.drawable.miranteexampleimg));
        }

        adapter = new FavHistAdapter(places,context);
        LinearLayoutManager manager = new LinearLayoutManager(context);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                manager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
    }
}
