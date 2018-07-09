package com.example.dc.navigation.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import com.example.dc.navigation.activities.EventsActivity;
import com.example.dc.navigation.activities.PlacesActivity;
import com.example.dc.navigation.models.Category;
import com.example.dc.navigation.R;
import com.squareup.picasso.Picasso;

/**
 * Created by Vih on 06/05/2018.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.myHolder>{
    private List<Category> categories;
    private Context context;

    public CategoryAdapter(List<Category> categories, Context context) {
        this.categories = categories;
        this.context = context;
    }

    @Override
    public CategoryAdapter.myHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_recycler_categories, parent, false);
        myHolder holder = new myHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(CategoryAdapter.myHolder holder, int position) {
        holder.title.setText(categories.get(position).getName());
        Picasso.with(context)
            .load(categories.get(position).getUrl())
            .into(holder.img);
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    class myHolder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView img;

        public myHolder(View itemView) {
            super(itemView);
            title =  itemView.findViewById(R.id.title_label);
            img = itemView.findViewById(R.id.background_img_view);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(categories.size() == 8 && title.getText().toString().equalsIgnoreCase(categories.get(7).getName())){
                        context.startActivity(new Intent(context, EventsActivity.class));
                    }
                    else{
                        context.startActivity(new Intent(context, PlacesActivity.class));
                    }
                }
            });
        }
    }


    private Bitmap loadImage(URL imgURL){
        try {
            return BitmapFactory.decodeStream(imgURL.openConnection() .getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
