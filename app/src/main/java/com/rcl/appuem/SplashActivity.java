package com.rcl.appuem;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();


        View myImage = findViewById(R.id.imageView);
        TextView titulo = (TextView) findViewById(R.id.Title);

        Animation animaImagen = AnimationUtils.loadAnimation(this, R.anim.fadein);
        Animation animaTitulo = AnimationUtils.loadAnimation(this, R.anim.leftin);

        // ESTABLECER UNA FUENTE
        Typeface myFont = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        titulo.setTypeface(myFont);

        myImage.startAnimation(animaImagen);
        titulo.startAnimation(animaTitulo);
        animaTitulo.setAnimationListener(this);

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }


    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
