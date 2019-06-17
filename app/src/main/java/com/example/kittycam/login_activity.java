package com.example.kittycam;


import android.content.Intent;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;


import android.widget.TextView;

public class login_activity extends AppCompatActivity {

    Button btn1;
    Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2login_activity);



        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button7);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forget();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open1();
            }
        });


    }
    public void open1(){
        Intent i = new Intent(this,videoview_activity.class);
        startActivity(i);
    }
    public void forget(){
        Intent i = new Intent(this,forgotpassword_activity.class);
       startActivity(i);
    }
}




