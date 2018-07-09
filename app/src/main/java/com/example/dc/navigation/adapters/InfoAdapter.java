package com.example.dc.navigation.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dc.navigation.R;
import com.example.dc.navigation.models.Info;

import java.util.List;


/**
 * Created by Vih on 10/05/2018.
 */

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.myHolder> {
    private List<Info> infos;

    public InfoAdapter(List<Info> infos) {
        this.infos = infos;
    }

    @Override
    public InfoAdapter.myHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_recycler_infos, parent, false);
        InfoAdapter.myHolder holder = new InfoAdapter.myHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(InfoAdapter.myHolder holder, int position) {
        holder.title.setText(infos.get(position).getType());
        holder.img.setImageResource(infos.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return infos.size();
    }

    class myHolder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView img;

        public myHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title_label);
            img = (ImageView) itemView.findViewById(R.id.image_view);
        }
    }
}
