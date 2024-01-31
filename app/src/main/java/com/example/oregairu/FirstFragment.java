package com.example.oregairu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FirstFragment extends Fragment {

    private static final String ARG1 = "Name";
    private static final String ARG2 = "Roll no";

    public FirstFragment() {
        // Required empty public constructor
    }

    public static FirstFragment getInstance(String value1, int value2)
    {
        FirstFragment fragment = new FirstFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG1,"Rixit");
        bundle.putInt(ARG2,6);

        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(getArguments()!=null){
            String name = getArguments().getString(ARG1);
            int rollNo = getArguments().getInt(ARG2);

            Log.d("Values","Name: "+name+" Roll no: "+rollNo);
        }
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
}