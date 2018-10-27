package com.example.aishmano.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO make a unique logo later
        logo = (ImageView) findViewById(R.id.logo);

        Thread welcomeThread = new Thread() {

            @Override
            public void run() {
                try {
                    super.run();
                    sleep(5000);  //Delay of 5 seconds
                } catch (Exception e) {

                } finally {

                    Intent mainIntent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(mainIntent);
                    finish();
                }
            }
        };
        welcomeThread.start();
    }
}