package com.example.aishmano.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Demongraphics extends AppCompatActivity {
    private TextView tvAge, tvResidency, tvGender, tvIncome;
    private EditText etDOB;
    private String dob;
    private Spinner sResidency, sIncome, sGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demongraphics);

        tvAge = (TextView) findViewById(R.id.tvAge);
        tvResidency = (TextView) findViewById(R.id.tvResidency);
        tvGender = (TextView) findViewById(R.id.tvGender);
        tvIncome = (TextView) findViewById(R.id.tvIncome);
        etDOB = (EditText) findViewById(R.id.etDOB);
        sResidency = (Spinner) findViewById(R.id.sResidency);
        sGender = (Spinner) findViewById(R.id.sGender);
        sIncome = (Spinner) findViewById(R.id.sIncome);

        states();
        setIncome();
        setGender();
    }

    // array of states
    public void states() {
        String[] states = {"Alabama", "Alaska", "American Samoa", "Arizona", "Arkansas", "California",
                "Colorado", "Connecticut", "Delaware", "District of Columbia",
                "Federated States of Micronesia", "Florida", "Georgia", "Guam", "Hawaii", "Idaho",
                "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine",
                "Marshall Islands", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi",
                "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico",
                "New York", "North Carolina", "North Dakota", "Northern Mariana Islands", "Ohio",
                "Oklahoma", "Oregon", "Palau", "Pennsylvania", "Puerto Rico", "Rhode Island",
                "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont",
                "Virgin Island", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_dropdown_item, states);
        sResidency.setAdapter(adapter);
    }

    //set ages
    public void setAge() {
        dob = etDOB.getText().toString();
    }

    //set incomes
    public void setIncome() {
        String[] income =  {"Below 69000","69000 - 73000","Above 73000"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_dropdown_item, income);
        sIncome.setAdapter(adapter);
    }

    //set genders
    public void setGender() {
        String[] genders = {"Female", "Male", "Others"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_dropdown_item, genders);
        sGender.setAdapter(adapter);
    }
}



