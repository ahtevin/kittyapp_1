package com.example.kittycam;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class recordedvideo_activity extends AppCompatActivity {
    VideoView videoView;
    String url="https://www.youtube.com/watch?v=ERSAaQrUpbc";
    ProgressDialog pd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10recordedvideo_activity);


        pd = new ProgressDialog(recordedvideo_activity.this);
        pd.setMessage("Please wait");
        pd.show();

        Uri uri =Uri.parse(url);
        videoView.setVideoURI(uri);
        videoView.start();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                pd.dismiss();
            }
        });



    }
}

