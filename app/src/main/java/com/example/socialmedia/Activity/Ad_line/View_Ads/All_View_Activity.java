package com.example.socialmedia.Activity.Ad_line.View_Ads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.socialmedia.Activity.Ad_line.Adapter.All_View_Adapter;
import com.example.socialmedia.Adapter.Tag_Friend_Adapter;
import com.example.socialmedia.R;

public class All_View_Activity extends AppCompatActivity {

    RecyclerView recyclerview;
    All_View_Adapter all_view_adapter;
    String name[] ={"John Smith","John Smith","John Smith","John Smith","John Smith","John Smith","John Smith","John Smith","John Smith","John Smith","John Smith","John Smith","John Smith"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_view);

        recyclerview = findViewById(R.id.recyclerview);

        all_view_adapter= new All_View_Adapter(this,name);
        recyclerview.setAdapter(all_view_adapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
    }
}