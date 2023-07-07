package com.example.hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("MissingInflatedId")
public class signup extends AppCompatActivity {

    TextView txt1;
    Button btn1;
    EditText edt1,edt2,edt3,edt4,edt5,edt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        txt1 = findViewById(R.id.sign_in);
        btn1 = findViewById(R.id.btnSignUp);

        edt1 = findViewById(R.id.FirstName);
        edt2 = findViewById(R.id.LastName);
        edt3 = findViewById(R.id.PhoneNo);
        edt4 = findViewById(R.id.UpEmail);
        edt5 = findViewById(R.id.UpPass);
        edt6 = findViewById(R.id.UpCnfPass);

        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_to_signin = new Intent(signup.this, login.class);
                startActivity(intent_to_signin);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validation())
                {
                    Intent intent_to_home = new Intent(signup.this, home.class);
                    startActivity(intent_to_home);
                }
            }
        });

    }
    private boolean validation()
    {
        if (edt1.length()==0) {
            edt1.setError("First Name Required !");
            return false;
        } else if (edt2.length()==0) {
            edt2.setError("Last Name Required !");
            return false;
        } else if (edt3.length()==0) {
            edt3.setError("Phone No Required !");
            return false;
        } else if (edt4.length()==0) {
            edt4.setError("Email Required !");
            return false;
        } else if (edt5.length()==0) {
            edt5.setError("Must Create Password !");
            return false;
        } else if (edt6.length()==0) {
            edt6.setError("Password Must Match Above !");
            return false;
        } else if (!edt5.getText().toString().matches(edt6.getText().toString())) {
            Toast.makeText(this, "Password Must Be Same !", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}