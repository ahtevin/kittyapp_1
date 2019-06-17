package com.example.kittycam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class entry_activity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5entry_activity);
        btn1 = (Button) findViewById(R.id.button17);
        btn2 = (Button) findViewById(R.id.button18);
        btn3 = (Button) findViewById(R.id.button19);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logs();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profile();
            }
        });
    }
    public void home(){
        Intent i = new Intent(this,videoview_activity.class);
        startActivity(i);
    }
    public void logs(){
        Intent i = new Intent(this,entry_activity.class);
        startActivity(i);
    }
    public void profile(){
        Intent i = new Intent(this,Profile_activity.class);
        startActivity(i);
    }
}
