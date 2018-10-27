package com.example.aishmano.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import static com.example.aishmano.myapplication.Insert.pushInfo;


public class PerceptionActivity extends AppCompatActivity {
    private Button bFinish;
    private Spinner sSafety, sMaintain;
    public static final String[] MAINTAIN =
            {"","Very well maintained","Moderately maintained","Poorly maintained"};
    public static final String[] SAFETY = {"","Very Safe","Moderately Safe","Not safe at all"};
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

        /*
        //push maintain to database
        for(int i = 0; i < MAINTAIN.length; i++) {
            pushInfo(MAINTAIN[i], "file name");
        }


        //push safety to database
        for(int i = 0; i < SAFETY.length; i++) {
            pushInfo(SAFETY[i], "file name");
        }
    */

    }

    public void setMaintain() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_dropdown_item, MAINTAIN);
        sMaintain.setAdapter(adapter);
    }

    public void setSafety() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_dropdown_item, SAFETY);
        sSafety.setAdapter(adapter);
    }
}
