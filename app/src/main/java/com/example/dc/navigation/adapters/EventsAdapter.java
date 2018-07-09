package com.example.dc.navigation.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dc.navigation.activities.InfoActivity;
import com.example.dc.navigation.models.Place;

import java.util.List;

import com.example.dc.navigation.R;
/**
 * Created by Vih on 10/05/2018.
 */

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.myHolder>  {
    private List<Place> events;
    private Context context;

    public EventsAdapter(List<Place> events, Context context) {
        this.events = events;
        this.context = context;
    }

    @Override
    public EventsAdapter.myHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_recycler_events, parent, false);
        EventsAdapter.myHolder holder = new EventsAdapter.myHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(EventsAdapter.myHolder holder, int position) {
        holder.title.setText(events.get(position).getTitle());
        holder.date.setText(events.get(position).getSubtitle());
        holder.img.setImageResource(events.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    class myHolder extends RecyclerView.ViewHolder{
        TextView title, date;
        ImageView img;

        public myHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title_label);
            date = (TextView) itemView.findViewById(R.id.date_label);
            img = (ImageView) itemView.findViewById(R.id.image_view);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    context.startActivity(new Intent(context, InfoActivity.class));
                }
            });
        }

    }
}
