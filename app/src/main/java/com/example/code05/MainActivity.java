package com.example.code05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TextView bg= findViewById(R.id.bg);//找到你想要设置透明背景的layou的id

        //bg.getBackground().setAlpha(255);//0--255为透明度值

    }
}