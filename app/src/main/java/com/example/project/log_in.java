package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class log_in extends AppCompatActivity {

    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        button1=(Button)findViewById(R.id.sign_act_btn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(log_in.this, signup.class);
                startActivity(intent);
            }
        });

        button2=(Button)findViewById(R.id.buttonlogin);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {

                Intent intent1= new Intent(log_in.this, home.class);
                startActivity(intent1);
            }
        });

    }
}