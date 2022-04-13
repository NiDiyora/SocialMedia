package com.example.socialmedia.Activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.widget.PopupMenu;

import com.example.socialmedia.Activity.Ad_line.Image_Advertise_Activity;
import com.example.socialmedia.Activity.Ad_line.Text_Advertise_Activity;
import com.example.socialmedia.Activity.Ad_line.Video_Advertise_Activity;
import com.example.socialmedia.CapturePhotoActivity;
import com.example.socialmedia.R;
import com.example.socialmedia.databinding.ActivityMainBinding;
import com.google.android.material.card.MaterialCardView;

public class MiMapActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.textAds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiMapActivity.this, Text_Advertise_Activity.class);
                startActivity(intent);
            }
        });
        binding.imageAds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiMapActivity.this, Image_Advertise_Activity.class);
                startActivity(intent);
            }
        });
        binding.videoAds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiMapActivity.this, Video_Advertise_Activity.class);
                startActivity(intent);
            }
        });

        binding.menu.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("RestrictedApi")
            @Override
            public void onClick(View view) {

                Context wrapper = new ContextThemeWrapper(MiMapActivity.this, R.style.MyPopupMenu);
                PopupMenu popupMenu = new PopupMenu(wrapper, binding.menu);
                popupMenu.getMenuInflater().inflate(R.menu.option_menu,popupMenu.getMenu());
                popupMenu.setGravity(Gravity.RIGHT);

                MenuPopupHelper menuHelper = new MenuPopupHelper(MiMapActivity.this, (MenuBuilder) popupMenu.getMenu(), binding.menu);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        // Toast message on menu menuItem clicked

                        switch (menuItem.getItemId()) {
                            case R.id.moment:
                                return true;
                            case R.id.new_event:
                                Intent intent = new Intent(MiMapActivity.this,Activity_AddText.class);
                                startActivity(intent);
                                return true;
                            case R.id.organize:
                                if (menuItem.isChecked()) menuItem.setChecked(false);
                                else menuItem.setChecked(true);
                                return true;
                            case R.id.live:
                                if (menuItem.isChecked()) menuItem.setChecked(false);
                                else menuItem.setChecked(true);
                                return true;
                            case R.id.share_location:
                                return true;
                            case R.id.selfi:
                                if (menuItem.isChecked()) menuItem.setChecked(false);
                                else menuItem.setChecked(true);
                                return true;
                            case R.id.camera:
                                if (menuItem.isChecked()) menuItem.setChecked(false);
                                else menuItem.setChecked(true);
                                startActivity(new Intent(MiMapActivity.this, CapturePhotoActivity.class));
                                return true;
                            case R.id.Gallery:
                                menuItem.setChecked(!menuItem.isChecked());
                                return true;
                            default:
                        }
                        return true;
                    }
                });
                menuHelper.setForceShowIcon(true);
                menuHelper.show();
            }
        });
    }



   }