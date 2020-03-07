package com.timkontrakan.submission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation app_logo_splash, bottom_to_top;
    ImageView appLogo;
    TextView subTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app_logo_splash = AnimationUtils.loadAnimation(this, R.anim.app_logo_splash);
        bottom_to_top = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top);
        appLogo = findViewById(R.id.appLogo);
        subTitle = findViewById(R.id.subTitle);
        appLogo.startAnimation(app_logo_splash);
        subTitle.startAnimation(bottom_to_top);
        move();
    }

    public void move(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, HomeActivity.class));
                finish();
            }
        },2000);
    }
}
