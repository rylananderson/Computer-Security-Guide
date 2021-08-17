package com.guide.compguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class VirusHelpScreen extends AppCompatActivity {

    private ImageView backBut;
    private Button fireBtn;
    private Button malBtn;
    private Button avastBtn;
    private Button sysRestoreBtn;
    private AdView mAdView;
    private Button websiteBtn;
    private Button websiteAvastBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virus_help_screen);

        // Ad Banner
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
        mAdView.loadAd(adRequest);

        // End of Ad banner


        fireBtn = (Button) findViewById(R.id.fireBtn);
        fireBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open new screen code goes here
                Intent fireVidScreen = new Intent(VirusHelpScreen.this, fireVidScreen.class);
                startActivity(fireVidScreen);
            }
        });

        malBtn = (Button) findViewById(R.id.malBtn);
        malBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent malVidScreen = new Intent(VirusHelpScreen.this, malScreen.class);
                startActivity(malVidScreen);
            }
        });

        avastBtn = (Button) findViewById(R.id.avastBtn);
        avastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent avastVidScreen = new Intent(VirusHelpScreen.this, avastScreen.class);
                startActivity(avastVidScreen);

            }
        });

        sysRestoreBtn = (Button) findViewById(R.id.sysRestoreBtn);
        sysRestoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sysRestoreScreen = new Intent(VirusHelpScreen.this, sysRestoreScreen.class);
                startActivity(sysRestoreScreen);

            }
        });


        backBut = (ImageView) findViewById(R.id.back_btn);
        backBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenu = new Intent(VirusHelpScreen.this, MainActivity.class);
                startActivity(mainMenu);
            }
        });


        websiteBtn = (Button) findViewById(R.id.websiteBtn);
        websiteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.malwarebytes.com/pricing"));
                startActivity(browserIntent);
            }
        });

        websiteAvastBtn = (Button) findViewById(R.id.websiteAvastBtn);
        websiteAvastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.avast.com/en-us/premium-security#pc"));
                startActivity(browserIntent);
            }
        });



    }
}
