package com.example.admin.lunchbox;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by A7718 on 3/8/2018.
 */

public class SplashScreen extends Activity{

    private int  SPLASH_TIME_OUT=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {

                Intent i = new Intent(SplashScreen.this, Categories.class);
                startActivity(i);

                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
