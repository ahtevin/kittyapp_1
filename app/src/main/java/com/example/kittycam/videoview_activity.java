package com.example.kittycam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class videoview_activity extends AppCompatActivity {
Button btn1;
Button btn2;
Button btn3;
Button play;
String url="http://192.168.59.249:3005/";
WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4videoview_activity);
        btn1 = (Button) findViewById(R.id.button13);
        btn2 = (Button) findViewById(R.id.button10);
        btn3 = (Button) findViewById(R.id.button11);
        webView = (WebView)findViewById(R.id.view);
        play =(Button)findViewById(R.id.button20);
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
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               webView.loadUrl(url);


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
