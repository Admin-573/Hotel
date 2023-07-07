package com.example.hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    TextView signUp;
    Button btnSignIn;
    EditText ed1, ed2, ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signUp = findViewById(R.id.sign_up);
        btnSignIn = findViewById(R.id.btnSignIn);
        ed1 = findViewById(R.id.EdtName);
        ed2 = findViewById(R.id.EdtEmail);
        ed3 = findViewById(R.id.EdtPass);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validation()) {
                    Intent intentHome = new Intent(login.this, home.class);
                    startActivity(intentHome);
                }
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_signup = new Intent(login.this, signup.class);
                startActivity(intent_signup);
            }
        });
    }

    private boolean validation() {
        if (ed1.length()==0) {
            ed1.setError("Please Enter UserName !");
            return false;
        } else if (ed2.length()==0) {
            ed2.setError("Please Enter Email !");
            return false;
        } else if (ed3.length()==0) {
            ed3.setError("Please Enter Correct Password !");
            return false;
        }
        return true;
    }
}