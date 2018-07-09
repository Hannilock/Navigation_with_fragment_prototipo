package com.example.dc.navigation.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.dc.navigation.R;

public class FragmentConfs extends Fragment {
    private ListView listView;
    private Button logBut, regBut;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_confs, container, false);
        listView = (ListView) view.findViewById(R.id.menu_list_view);
        logBut = (Button) view.findViewById(R.id.log_but);
        regBut = (Button) view.findViewById(R.id.reg_but); 
        setViews();
        logBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                Class fragmentClass = FragmentLogin.class;
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
        });
        regBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), getResources().getString(R.string.dev_toast), Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle(R.string.conf_tag);
    }

    private void setViews() {

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.menu_Items));
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Fragment fragment = null;
                Class fragmentClass = null;
                switch (position){
                    case 0:
                        fragmentClass = FragmentLanguage.class;
                        break;
                    case 1:
                        fragmentClass = FragmentHistFav.class;
                        break;
                    case 2:
                        fragmentClass = FragmentHistFav.class;
                        break;
                    case 3:
                        Toast.makeText(getContext(), getResources().getString(R.string.dev_toast), Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        fragmentClass = FragmentFeedback.class;
                        break;
                    case 5:
                        Toast.makeText(getContext(), getResources().getString(R.string.dev_toast), Toast.LENGTH_SHORT).show();
                        break;
                }
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
        });
    }

}
