package com.example.clonelistonic;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;





public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        // Delay for 3 seconds before moving to the main activity
        // Step 1: Initialize ImageView
        ImageView logo = findViewById(R.id.logo);

        // Step 2: Load the animation
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        // Step 3: Apply animation to ImageView
        logo.startAnimation(fadeIn);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish(); // Close SplashActivity so it doesn't return when pressing back
            }
        }, 3000); // 3000ms = 3 seconds
    }
}