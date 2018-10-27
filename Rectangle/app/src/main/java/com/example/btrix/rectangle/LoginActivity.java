package com.example.btrix.rectangle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {

    private TextView register;
    private EditText etEmail, etPassword;
    private String email, password;
    private Button bSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        register = (TextView) findViewById(R.id.register);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bSignIn = (Button) findViewById(R.id.bSignIn);

        // call signIn()
        bSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIn();

            }
        });

        // link to sign up
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regIntent = new Intent(LoginActivity.this, SignUp.class);
                LoginActivity.this.startActivity(regIntent);
            }
        });
    }

    // Register account
    public void signIn() {
        init();
        if (!validate()) {
            Toast.makeText(this,"Sign in failed", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent regIntent = new Intent(LoginActivity.this, LoginActivity.class);
            LoginActivity.this.startActivity(regIntent);
        }
    }

    // initialize string value
    public void init() {
        email = etEmail.getText().toString().trim();
        password = etPassword.getText().toString().trim();
    }
    // Validate info
    public boolean validate() {
        boolean valid = true;
        if(email.isEmpty()||!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            etEmail.setError("Please enter a valid email address");
            valid = false;
        }
        if(password.isEmpty()) {
            etPassword.setError("Please enter Password");
            valid = false;
        }

        return valid;
    }

}


