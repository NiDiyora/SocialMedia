package com.example.socialmedia.Activity.Ad_line;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.socialmedia.Activity.Ad_line.View_Ads.View_ADs_Activity;
import com.example.socialmedia.R;

public class Text_Advertise_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_advertise);
        RelativeLayout viewads=findViewById(R.id.viewads);
        viewads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Text_Advertise_Activity.this, View_ADs_Activity.class);
                startActivity(intent);
            }
        });
    }
}