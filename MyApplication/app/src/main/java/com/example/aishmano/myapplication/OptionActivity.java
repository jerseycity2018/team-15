package com.example.aishmano.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OptionActivity extends AppCompatActivity {

    private Button bMap, bQuestionaires, bDonate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        bDonate = (Button) findViewById(R.id.bDonate);
        bMap = (Button) findViewById(R.id.bMap);
        bQuestionaires = (Button) findViewById(R.id.bQuestionaires);

        bDonate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent donateIntent = new Intent
                        (OptionActivity.this, OptionActivity.class);
                OptionActivity.this.startActivity(donateIntent);
            }
        });

        bMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent
                        (OptionActivity.this, MapsActivity.class);
                OptionActivity.this.startActivity(mapIntent);
            }
        });

        bQuestionaires.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quesIntent = new Intent
                        (OptionActivity.this, OptionActivity.class);
                OptionActivity.this.startActivity(quesIntent);
            }
        });
    }
}
