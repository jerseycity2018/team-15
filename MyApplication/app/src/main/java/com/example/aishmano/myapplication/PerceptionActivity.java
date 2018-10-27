package com.example.aishmano.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PerceptionActivity extends AppCompatActivity {
    private Button bFinish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perception);

        bFinish = (Button) findViewById(R.id.bFinish);

        bFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent finIntent = new Intent
                        (PerceptionActivity.this, MapsActivity.class);
                PerceptionActivity.this.startActivity(finIntent);
            }
        });
    }
}
