package com.example.dc.navigation.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.transition.Slide;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.dc.navigation.R;
import com.example.dc.navigation.views.LabeledImageButton;


public class FragmentMain extends Fragment {
    private LabeledImageButton eventsButr, whatDoBut,accomBut, eatBut, servicesBut;
    private Fragment fragment = null;
    private Class fragmentClass = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        eventsButr = (LabeledImageButton) view.findViewById(R.id.events_but);
        whatDoBut = (LabeledImageButton) view.findViewById(R.id.whatdo_but);
        accomBut = (LabeledImageButton) view.findViewById(R.id.accom_but);
        eatBut = (LabeledImageButton) view.findViewById(R.id.eat_but);
        servicesBut = (LabeledImageButton) view.findViewById(R.id.services_but);

        eventsButr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentClass = FragmentEvents.class;
                onClickButton();
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
            fragment.setEnterTransition(new Slide(Gravity.RIGHT));
            fragment.setExitTransition(new Slide(Gravity.LEFT));
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.main_content_fragment, fragment);
            ft.addToBackStack(null);
            ft.commit();
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle(R.string.app_name);
    }


}
