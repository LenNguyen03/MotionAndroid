package com.se.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnAnimation;
    ImageView imgLifeCycle, imgAirplane;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAnimation = findViewById(R.id.btn_Animation);
        imgLifeCycle = findViewById(R.id.img_banhxe);
        imgAirplane = findViewById(R.id.img_airplane);
        Animation animation =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.cycle_interpolator);
        Animation animation2 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);

        btnAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgLifeCycle.startAnimation(animation);
                imgAirplane.startAnimation(animation2);
            }
        });
    }

}