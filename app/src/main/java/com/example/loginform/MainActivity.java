package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;

import

public class MainActivity extends AppCompatActivity {
    RadioGroup radiogp

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radiogp = findViewById(R.id.radio);


        radiogp.setOnCheckedChangeListener();
    }





}