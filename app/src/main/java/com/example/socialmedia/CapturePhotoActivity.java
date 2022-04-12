package com.example.socialmedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.socialmedia.Activity.Activity_AddText;
import com.example.socialmedia.databinding.ActivityCapturePhotoBinding;

public class CapturePhotoActivity extends AppCompatActivity {

    ActivityCapturePhotoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCapturePhotoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.relativeLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CapturePhotoActivity.this, Activity_AddText.class));
            }
        });
    }
}