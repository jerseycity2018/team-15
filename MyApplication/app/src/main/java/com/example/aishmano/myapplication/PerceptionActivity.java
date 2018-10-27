package com.example.aishmano.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class PerceptionActivity extends AppCompatActivity {
    private Button bFinish;
    private Spinner sSafety, sMaintain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perception);

        bFinish = (Button) findViewById(R.id.bFinish);
        sSafety = (Spinner) findViewById(R.id.sSafety);
        sMaintain = (Spinner) findViewById(R.id.sMaintain);

        bFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent finIntent = new Intent
                        (PerceptionActivity.this, OptionActivity.class);
                PerceptionActivity.this.startActivity(finIntent);
            }
        });

        setMaintain();
        setSafety();
    }

    public void setMaintain() {
        String[] maintain = {"","Very well maintained","Moderately maintained","Poorly maintained"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_dropdown_item, maintain);
        sMaintain.setAdapter(adapter);
    }

    public void setSafety() {
        String[] safety = {"","Very Safe","Moderately Safe","Not safe at all"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_dropdown_item, safety);
        sSafety.setAdapter(adapter);
    }
}
