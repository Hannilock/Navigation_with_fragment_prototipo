package com.example.dc.navigation.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dc.navigation.R;
import com.example.dc.navigation.models.Event;

import java.util.ArrayList;

public class eventsAdapter extends  RecyclerView.Adapter<eventsAdapter.myHolder> {
    private ArrayList<Event> events;

    public eventsAdapter(ArrayList<Event> events) {
        this.events = events;
    }

    @NonNull
    @Override
    public eventsAdapter.myHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_recycler_events, parent, false);
        eventsAdapter.myHolder holder = new eventsAdapter.myHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull eventsAdapter.myHolder holder, int position) {
        holder.headerImg.setImageResource(events.get(position).getImg());
        holder.titleLabel.setText(events.get(position).getName());
        holder.dateLabel.setText(events.get(position).getDate()+" - "+events.get(position).getPlace());
        holder.genreLabel.setText(events.get(position).getGenre());
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    public class myHolder extends RecyclerView.ViewHolder{
        protected ImageView headerImg;
        protected TextView titleLabel, dateLabel, genreLabel;

        public myHolder(View itemView) {
            super(itemView);
            headerImg = (ImageView) itemView.findViewById(R.id.header_img);
            titleLabel = (TextView) itemView.findViewById(R.id.title_label);
            dateLabel = (TextView) itemView.findViewById(R.id.date_label);
            genreLabel = (TextView) itemView.findViewById(R.id.genre_label);
        }
    }
}
