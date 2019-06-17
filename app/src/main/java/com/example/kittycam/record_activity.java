package com.example.kittycam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class record_activity extends AppCompatActivity {
    Button btn;
    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8record_activity);
        btn = (Button)findViewById(R.id.button22);
        btn1 = (Button)findViewById(R.id.button14);
        btn2 = (Button)findViewById(R.id.button16);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profile();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                picture();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                video();
            }
        });
    }
    public void profile(){
        Intent i = new Intent(this,Profile_activity.class);
        startActivity(i);
    }
    public void picture(){
        Intent i = new Intent(this,picture_activity.class);
        startActivity(i);
    }
    public void video(){
        Intent i = new Intent(this,recordedvideo_activity.class);
        startActivity(i);
    }
}
