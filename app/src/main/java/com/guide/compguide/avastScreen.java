package com.guide.compguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class avastScreen extends AppCompatActivity {

    private ImageView backBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avast_screen);

        //Video Stuff
        VideoView videoViewer = findViewById(R.id.video_view);
        String videoPath = "android.resource://" + getPackageName() +"/" + R.raw.download_avast;
        Uri uri = Uri.parse(videoPath);
        videoViewer.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoViewer.setMediaController(mediaController);
        mediaController.setAnchorView(videoViewer);
        // End of video stuff

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){

        }else if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){ // checks orientation

            DisplayMetrics metrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(metrics);
            android.widget.RelativeLayout.LayoutParams params = (android.widget.RelativeLayout.LayoutParams) videoViewer.getLayoutParams();
            params.width = metrics.widthPixels;
            params.height = metrics.heightPixels;
            params.leftMargin = 0;
            params.topMargin = 0; // Changes the margin from 100dp to 0
            videoViewer.setLayoutParams(params);

        }


        backBut = (ImageView) findViewById(R.id.back_btn);
        backBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent virusHelpScreen = new Intent(avastScreen.this, VirusHelpScreen.class);
                startActivity(virusHelpScreen);
            }
        });
    }
}
