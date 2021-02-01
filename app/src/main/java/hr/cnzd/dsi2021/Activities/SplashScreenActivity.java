package hr.cnzd.dsi2021.Activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import hr.cnzd.dsi2021.R;

public class SplashScreenActivity extends AppCompatActivity {

    private ImageView logo, logo2, logo3;
    private static int splashTimeOut = 3500;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash_screen);
            logo = findViewById(R.id.logo);
            logo2 = findViewById(R.id.logo2);
            logo3 = findViewById(R.id.logo3);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }, splashTimeOut);

            Animation animation = AnimationUtils.loadAnimation(this, R.anim.splash_animation);
            logo.startAnimation(animation);
            logo2.startAnimation(animation);
            logo3.startAnimation(animation);

        } catch (Exception e) {
            if (e.getMessage() != null && e.getMessage().toLowerCase().contains("webview")) {
                Log.d("Splashcreen", "Ne radi, preskačemo");
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }

    }
}