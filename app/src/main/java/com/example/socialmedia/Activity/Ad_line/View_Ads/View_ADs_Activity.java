package com.example.socialmedia.Activity.Ad_line.View_Ads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.socialmedia.Adapter.Filter_Adapter;
import com.example.socialmedia.R;

import org.w3c.dom.Text;

public class View_ADs_Activity extends AppCompatActivity {

    TextView txt_rateus;
    LinearLayout viewrate;
    int List[] ={R.drawable.ic_ractangle,R.drawable.ic_ractangle,R.drawable.ic_ractangle,R.drawable.ic_ractangle,R.drawable.ic_ractangle,R.drawable.ic_ractangle};
    RecyclerView recyclerView;
    Filter_Adapter filter_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_ads);
        recyclerView= (RecyclerView)findViewById(R.id.recyclerview);

        txt_rateus= findViewById(R.id.txt_rateus);
        viewrate=findViewById(R.id.viewrate);
        viewrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(View_ADs_Activity.this,All_View_Activity.class);
                startActivity(intent);
            }
        });
        txt_rateus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(View_ADs_Activity.this);
                dialog.setContentView(R.layout.dialog_rateus);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                TextView dialogButton =  dialog.findViewById(R.id.click);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(getApplicationContext(),"Rate us Submitted.",Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();

            }
        });

        filter_adapter = new Filter_Adapter(this,List);
        recyclerView.setAdapter(filter_adapter);
    }
}