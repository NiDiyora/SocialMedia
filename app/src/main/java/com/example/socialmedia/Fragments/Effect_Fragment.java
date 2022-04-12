package com.example.socialmedia.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialmedia.Adapter.Filter_Adapter;
import com.example.socialmedia.R;


public class Effect_Fragment extends Fragment {

    int List[] ={R.drawable.ic_bg_filter,R.drawable.ic_bg_filter,R.drawable.ic_bg_filter,R.drawable.ic_bg_filter,R.drawable.ic_bg_filter,R.drawable.ic_bg_filter,};
    public Effect_Fragment() {
        // Required empty public constructor
    }

    RecyclerView recyclerView;
    Filter_Adapter filter_adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_effect_, container, false);

        recyclerView= (RecyclerView)view.findViewById(R.id.recyclerview);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        filter_adapter = new Filter_Adapter(getActivity(),List);
        recyclerView.setAdapter(filter_adapter);
        return view;
    }
}