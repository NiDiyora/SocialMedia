package com.example.socialmedia.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import com.example.socialmedia.Fragments.Add_Text_Fragment;
import com.example.socialmedia.Fragments.Crop_Fragment;
import com.example.socialmedia.Fragments.Effect_Fragment;
import com.example.socialmedia.Fragments.Loaction_Fragment;
import com.example.socialmedia.Fragments.Profile_Fragment;
import com.example.socialmedia.R;
import com.example.socialmedia.databinding.ActivityEditImageBinding;

public class Activity_Edit_Image extends AppCompatActivity {

    FrameLayout framelayout;
    ActivityEditImageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityEditImageBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        framelayout = findViewById(R.id.framelayout);
        replcaeFragment(new Crop_Fragment());
        binding.icCrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replcaeFragment(new Crop_Fragment());
            }
        });
        binding.icAddText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replcaeFragment(new Add_Text_Fragment());
            }
        });
        binding.icLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replcaeFragment(new Loaction_Fragment());
            }
        });
        binding.icProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replcaeFragment(new Profile_Fragment());
            }
        });
        binding.icMagics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replcaeFragment(new Effect_Fragment());
            }
        });


    }

    public void replcaeFragment(Fragment fragment) {


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.framelayout, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}