package com.example.socialmedia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.socialmedia.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_AddText extends AppCompatActivity {
    Spinner spinner;
    ImageView image_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_text);

        spinner = findViewById(R.id.spinner);
        image_edit = findViewById(R.id.image_edit);

        List<String> list = new ArrayList<>();
        list.add(0, "Everyone");
        list.add("Friend");
        list.add("Close Friend");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("Choose")) {
                } else {
                    String item = parent.getItemAtPosition(position).toString();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        image_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_AddText.this, Activity_Edit_Image.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent  intent = new Intent(Activity_AddText.this,MiMapActivity.class);
        startActivity(intent);
    }
}