package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread dela = new Thread(){

            public void run(){
                try {
                    sleep(4000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent next = new Intent(MainActivity.this, log_in.class);
                            startActivity(next);

                }

            }

        };dela.start();
    }
}