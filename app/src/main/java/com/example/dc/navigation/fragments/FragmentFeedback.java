package com.example.dc.navigation.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.dc.navigation.R;

public class FragmentFeedback extends Fragment {
    private Button sendBut;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_feedback, container, false);
        sendBut = (Button) view.findViewById(R.id.send_but);
        sendBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), getResources().getString(R.string.feedback_toast), Toast.LENGTH_SHORT).show();
                Fragment fragment = null;
                Class fragmentClass = FragmentConfs.class;
                try {
                    fragment = (Fragment) fragmentClass.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (fragment != null) {
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.main_content_fragment, fragment);
                    ft.commit();
                }
            }
        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(R.string.feedback_title);
    }
}
