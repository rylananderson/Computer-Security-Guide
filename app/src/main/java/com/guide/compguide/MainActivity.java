package com.guide.compguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {

    private ImageView virusImage;
    private ImageView blackScreen;
    private ImageView slowComp;
    private ImageView internet;
    private ImageView featRat;
    private ImageView removeRat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hooks for buttons
        virusImage = (ImageView) findViewById(R.id.virus_btn);
        blackScreen = (ImageView) findViewById(R.id.black_screen_btn);
        slowComp = (ImageView) findViewById(R.id.slow_computer_btn);
        internet = (ImageView) findViewById(R.id.internet);
        featRat = (ImageView) findViewById(R.id.featRat);
        removeRat = (ImageView) findViewById(R.id.removeRat);

        // Set Onclick listener for each different screens
        virusImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent virusHelpSc = new Intent(MainActivity.this, VirusHelpScreen.class);
                startActivity(virusHelpSc);
            }
        });

        blackScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blueHelpSc = new Intent(MainActivity.this, BlueHelpScreen.class);
                startActivity(blueHelpSc);
            }
        });
        slowComp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent slowComp = new Intent(MainActivity.this, slowComp.class);
                startActivity(slowComp);
            }
        });
        internet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent internet = new Intent(MainActivity.this, Internet.class);
                startActivity(internet);
            }
        });

        featRat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent featRatIntent = new Intent(MainActivity.this, FeatRat.class);
                startActivity(featRatIntent);
            }
        });

        removeRat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent featRatIntent = new Intent(MainActivity.this, RemoveRat.class);
                startActivity(featRatIntent);
            }
        });


    }
}
