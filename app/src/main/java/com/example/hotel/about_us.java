package com.example.hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class about_us extends AppCompatActivity {

    Button btn_go_back;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        btn_go_back = findViewById(R.id.button_back);

        btn_go_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_back = new Intent(about_us.this, MainActivity.class);
                startActivity(intent_back);
            }
        });
    }
}