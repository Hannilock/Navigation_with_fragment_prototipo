package com.example.dc.navigation.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dc.navigation.R;

public class tagsAdapter extends RecyclerView.Adapter<tagsAdapter.myHolder> {
    private String[] tags;

    public tagsAdapter(String[] tags) {
        this.tags = tags;
    }

    @NonNull
    @Override
    public tagsAdapter.myHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_simple_text, parent, false);
        myHolder holder = new myHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull tagsAdapter.myHolder holder, int position) {
        holder.tagTitle.setText(tags[position]);
    }

    @Override
    public int getItemCount() {
        return tags.length;
    }

    public class myHolder extends RecyclerView.ViewHolder{
        protected TextView tagTitle;

        public myHolder(View itemView) {
            super(itemView);
            tagTitle = (TextView) itemView.findViewById(R.id.title_label);
        }
    }

}
