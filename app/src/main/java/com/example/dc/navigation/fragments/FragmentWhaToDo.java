package com.example.dc.navigation.fragments;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dc.navigation.R;
import com.example.dc.navigation.adapters.CategoryAdapter;
import com.example.dc.navigation.models.Category;

import java.net.MalformedURLException;
import java.util.List;


public class FragmentWhaToDo extends Fragment {

    private RecyclerView recycler;
    private CategoryAdapter adapter;
    private List<Category> categories;
    private FakeData fakeData;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_menu2, container, false);
        recycler = view.findViewById(R.id.recycler_row_categories);

        try {
            fakeData = new FakeData(getContext());
            categories = fakeData.selectType("0");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        adapter = new CategoryAdapter(categories, getContext());
        recycler.setAdapter(adapter);
        recycler.canScrollVertically(0);
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));


        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle(R.string.places_label);
    }
}
