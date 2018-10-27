package com.example.btrix.rectangle;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    private  EditText etName, etEmail, etCreatePass, etConfirmPass;
    private String name, email, createPass, confirmPass;
    private Button bSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


    etName = (EditText) findViewById(R.id.etName);
    etEmail = (EditText) findViewById(R.id.etEmail);
    etCreatePass = (EditText) findViewById(R.id.etCreatePass);
    etConfirmPass = (EditText) findViewById(R.id.etConfirmPass);
    bSignUp = (Button) findViewById(R.id.bSignUp);

    /* Link to the QuestionsActivity Page
        bAddClasses.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent addClassIntent = new Intent(RegisterActivity.this, QuestionsActivity.class);
            RegisterActivity.this.startActivity(addClassIntent);
        }
    });
*/
    // call register()
        bSignUp.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            register();

        }
    });
}
    // Register account
    public void register() {
        init();
        if (!validate()) {
            Toast.makeText(this,"Signup failed", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent regIntent = new Intent(SignUp.this, SignUp.class);
            SignUp.this.startActivity(regIntent);
        }
    }

    // initialize string value
    public void init() {
        name = etName.getText().toString().trim();email = etEmail.getText().toString().trim();
        createPass = etCreatePass.getText().toString().trim();
        confirmPass = etConfirmPass.getText().toString().trim();
    }
    // Validate info
    public boolean validate() {
        boolean valid = true;
        if(email.isEmpty()||!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            etEmail.setError("Please enter a valid email address");
            valid = false;
        }
        if(createPass.isEmpty()) {
            etCreatePass.setError("Please enter Password");
            valid = false;
        }
        if(!confirmPass.equals(createPass)){
            etConfirmPass.setError("The password you enter does not match");
            valid = false;
        }
        return valid;
    }

}

