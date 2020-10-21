package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showCalculator (View view) {
        Intent intent = new Intent(this,CalculatorActivity.class);
        startActivity(intent);


    }
    public void showAbout (View view) {
        Intent intent = new Intent(this,AboutActivity.class);
        startActivity(intent);
    }
}