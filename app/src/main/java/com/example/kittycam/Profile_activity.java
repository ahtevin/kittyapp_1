package com.example.kittycam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile_activity extends AppCompatActivity {
Button btn1;
Button btn2;
Button btn3;
Button btn4;
Button btn5;
Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6profile_activity);
        btn1 = (Button) findViewById(R.id.home);
        btn2 = (Button) findViewById(R.id.person);
        btn3 = (Button) findViewById(R.id.profile);
        btn4 = (Button)findViewById(R.id.button8);
        btn5 = (Button)findViewById(R.id.button4);
        btn6 = (Button)findViewById(R.id.button9);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home1();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logs1();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profile1();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logs2();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                record();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notification();
            }
        });

    }
    public  void home1(){
        Intent i = new Intent(this,videoview_activity.class);
        startActivity(i);
    }
    public  void logs1(){
        Intent i = new Intent(this,entry_activity.class);
        startActivity(i);
    }
    public  void profile1(){
        Intent i = new Intent(this,Profile_activity.class);
        startActivity(i);
    }
    public  void logs2(){
        Intent i = new Intent(this,entry_activity.class);
        startActivity(i);
    }
    public  void record(){
        Intent i = new Intent(this,record_activity.class);
        startActivity(i);
    }
    public  void notification(){
        Intent i = new Intent(this,notification_activity.class);
        startActivity(i);
    }
}
