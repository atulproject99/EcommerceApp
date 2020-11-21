package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.style.TypefaceSpan;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashFile extends AppCompatActivity {

    private TextView titleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.spalash_layout);

        titleText=findViewById(R.id.my_text);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"regular.ttf");
        titleText.setTypeface(typeface);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashFile.this,MainActivity.class));
                finish();
            }
        },3000);
    }

}
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//        titleText=findViewById(R.id.my_text);
//        Typeface typeface=Typeface.createFromAsset(getAssets(),"my_font.otf");
//        titleText.setTypeface(typeface);
//        Animation animation= AnimationUtils.loadAnimation(this,R.anim.slide_left);
//        animation.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//                startActivity(new Intent(SplashFile.this, MainActivity.class));
//                finish();
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//        });
//        titleText.setAnimation(animation);
//
//    }
