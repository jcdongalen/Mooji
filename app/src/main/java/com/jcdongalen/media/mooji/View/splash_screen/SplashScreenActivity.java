package com.jcdongalen.media.mooji.View.splash_screen;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.jcdongalen.media.mooji.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashScreenActivity extends AppCompatActivity {

    @BindView(R.id.imgLogo)
    ImageView imgLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Animation pulse = AnimationUtils.loadAnimation(this, R.anim.anim_pulse);
        imgLogo.startAnimation(pulse);

        new Handler().postDelayed(() -> {
            Toast.makeText(this, "Success", Toast.LENGTH_LONG).show();
        }, 3000);
    }
}
