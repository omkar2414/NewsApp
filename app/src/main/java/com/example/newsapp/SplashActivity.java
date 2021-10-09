package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import static java.lang.Thread.sleep;

public class SplashActivity extends AppCompatActivity {

    public SplashActivity() {
    }

    public SplashActivity(int contentLayoutId) {
        super(contentLayoutId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread() {

            public void run() {

                try {
                    sleep(4000);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                }


            }
        };thread.start();

    }
}