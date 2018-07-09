package com.example.dc.navigation.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

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
    private ImageButton eventsButr, whatDoBut,accomBut, eatBut, servicesBut;
    private Fragment fragment = null;
    private Class fragmentClass = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_test_two, container, false);

        eventsButr = (ImageButton) view.findViewById(R.id.events_but);
        whatDoBut = (ImageButton) view.findViewById(R.id.whatdo_but);
        accomBut = (ImageButton) view.findViewById(R.id.accom_but);
        eatBut = (ImageButton) view.findViewById(R.id.eat_but);
        servicesBut = (ImageButton) view.findViewById(R.id.services_but);

        eventsButr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "In development", Toast.LENGTH_SHORT).show();
            }
        });
        whatDoBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentClass = FragmentWhaToDo.class;
                onClickButton();
            }
        });
        accomBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentClass = FragmentAccommodation.class;
                onClickButton();
            }
        });
        eatBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentClass = FragmentWhereToEat.class;
                onClickButton();
            }
        });
        servicesBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentClass = FragmentPublicService.class;
                onClickButton();
            }
        });


        return view;
    }

    public void onClickButton(){
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (fragment != null) {
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.main_content_fragment, fragment);
            ft.addToBackStack(null);
            ft.commit();
        }
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
