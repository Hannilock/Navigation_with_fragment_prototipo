package com.example.dc.navigation.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.dc.navigation.R;
import com.example.dc.navigation.models.Contact;
import com.example.dc.navigation.models.Place;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import cn.bingoogolapple.bgabanner.BGABanner;


public class FragmentMain extends Fragment {
//    private BGABanner placesBanner, eventsBanner;
//    ArrayList<String> places_imgs, places_names, events_imgs, events_names;
    ImageButton eventsBanner;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_test_two, container, false);
        setButtons(view);
        return view;
    }

    private void setButtons(View view){
        eventsBanner = (ImageButton) view.findViewById(R.id.events_but);
    }

//    private void setBanners(View view){
//        placesBanner = (BGABanner) view.findViewById(R.id.places_banner);
//        eventsBanner = (BGABanner) view.findViewById(R.id.events_banner);
//        placesBanner.setAdapter(new BGABanner.Adapter<ImageView, String>() {
//            @Override
//            public void fillBannerItem(BGABanner banner, ImageView itemView, String model, int position) {
//                Picasso.with(getContext())
//                        .load(model)
//                        .into(itemView);
//            }
//        });
//
//        eventsBanner.setAdapter(new BGABanner.Adapter<ImageView, String>() {
//            @Override
//            public void fillBannerItem(BGABanner banner, ImageView itemView, String model, int position) {
//                Picasso.with(getContext())
//                        .load(model)
//                        .into(itemView);
//            }
//        });
//
//        fillData();
//        placesBanner.setData(places_imgs,places_names);
//        eventsBanner.setData(events_imgs, events_names);
//    }

//    private void fillData(){
//        places_imgs = new ArrayList<>();
//        places_names = new ArrayList<>();
//        events_imgs = new ArrayList<>();
//        events_names = new ArrayList<>();
//        for(int i = 0; i <5; i++) {
//            places_names.add("Lugares em Alta");
//            places_imgs.add("https://78.media.tumblr.com/99610c4913801ba13556898d5433d401/tumblr_pbkamvylLa1r2132xo1_540.jpg");
//            events_names.add("Eventos em Alta");
//            events_imgs.add("http://4.bp.blogspot.com/-BBkvduuqZsc/UKOz_r5BxxI/AAAAAAAAAq8/WFygL-_4X1E/s1600/DSC05988.jpg");
//        }
//    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle(R.string.app_name);
    }


}
