package com.example.socialmedia.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialmedia.Adapter.Tag_Friend_Adapter;
import com.example.socialmedia.R;

import java.util.ArrayList;
import java.util.List;


public class Profile_Fragment extends Fragment {

    RecyclerView recyclerView;
    Tag_Friend_Adapter tag_friend_adapter ;
    String name[] ={"John Smith","John Smith","John Smith","John Smith","John Smith","John Smith","John Smith","John Smith","John Smith","John Smith","John Smith","John Smith","John Smith"};
    public Profile_Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile_, container, false);

        recyclerView = view.findViewById(R.id.recyclerview);

        tag_friend_adapter= new Tag_Friend_Adapter(name,getActivity());
        recyclerView.setAdapter(tag_friend_adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

}