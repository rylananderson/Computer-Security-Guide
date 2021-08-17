package com.guide.compguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LoadScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_screen);

        Thread thread = new Thread(){
            @Override
            public void run() {
                try{

                    sleep(3000);
                }catch (Exception e){e.printStackTrace();}
                finally {
                    Intent mainIntent = new Intent(LoadScreen.this,MainActivity.class);
                    startActivity(mainIntent);
                }
            }
        };
        thread.start();
    }
    protected void onPause() {
        super.onPause();

        finish();
    }
    }

