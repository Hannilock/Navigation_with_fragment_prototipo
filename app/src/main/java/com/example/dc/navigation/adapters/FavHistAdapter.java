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
import com.example.dc.navigation.R;
import com.example.dc.navigation.models.Place;

import java.util.List;



public class FavHistAdapter extends RecyclerView.Adapter<FavHistAdapter.myHolder> {
    private List<Place> places;
    private Context context;

    public FavHistAdapter(List<Place> places, Context context) {
        this.places = places;
        this.context = context;
    }

    @Override
    public FavHistAdapter.myHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_recycler_fav_hist, parent, false);
        FavHistAdapter.myHolder holder = new FavHistAdapter.myHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(FavHistAdapter.myHolder holder, int position) {
        holder.title.setText(places.get(position).getTitle());
        holder.subtitle.setText(places.get(position).getSubtitle());
        holder.img.setImageResource(places.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    class myHolder extends RecyclerView.ViewHolder{
        TextView title, subtitle;
        ImageView img;

        public myHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title_view);
            subtitle = (TextView) itemView.findViewById(R.id.subtitle_view);
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
