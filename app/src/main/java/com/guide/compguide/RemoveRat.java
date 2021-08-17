package com.guide.compguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RemoveRat extends AppCompatActivity {

    private ImageView back_btn;
    private Button malwarebytesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove_rat);

        // get hooks
        back_btn = (ImageView) findViewById(R.id.back_btn);
        malwarebytesBtn = (Button) findViewById(R.id.malwarebytesBtn);



        // Listen for click
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(RemoveRat.this, MainActivity.class);
                startActivity(back);
            }
        });


        malwarebytesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.malwarebytes.com/premium"));
                startActivity(browserIntent);
            }
        });

    }
}