package com.example.dc.navigation.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.dc.navigation.R;
import com.example.dc.navigation.adapters.eventsAdapter;
import com.example.dc.navigation.adapters.tagsAdapter;
import com.example.dc.navigation.models.Event;

import java.util.ArrayList;

public class FragmentEvents extends Fragment {
     private RecyclerView eventsRecycler, tagsRecycler;
     private String[] tags;
     private ArrayList<Event> events;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_events, container, false);

        eventsRecycler = (RecyclerView) v.findViewById(R.id.event_recycler);
        tagsRecycler = (RecyclerView) v.findViewById(R.id.tags_recycler);
        fillTagsRecycler();
        fillEventsRecycler();

        return v;
    }

    private void fillEventsRecycler() {
        events = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            events.add(new Event("Feira do Livro Municipal","31/01","Praça da Matriz","Literário",R.drawable.feiralivroimg));
        }
        eventsAdapter eAdapter = new eventsAdapter(events);
        eventsRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        eventsRecycler.setAdapter(eAdapter);
    }

    private void fillTagsRecycler(){
        tags = new String[] {"#tag","#tag2","tag3","tag4"};
        tagsAdapter tAdapter = new tagsAdapter(tags);
        tagsRecycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        tagsRecycler.setAdapter(tAdapter);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle(R.string.events_label);
    }
}
