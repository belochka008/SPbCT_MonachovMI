package com.example.mainapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = (ImageView)findViewById(R.id.animationView);
        // определим для ImageView какое-нибудь изображение
        img.setImageResource(R.drawable.black_balls);
        // создаем анимацию
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation);
        // запуск анимации
        img.startAnimation(animation);
    }
}