package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout mConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mConstraintLayout = findViewById(R.id.cl);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onYellowButtonClick(View view) {
        getWindow().setBackgroundDrawableResource(R.color.yellowColor);
    }

    public void onRedButtonClick(View view) {
        getWindow().setBackgroundDrawableResource(R.color.redColor);
    }

    public void onGreenButtonClick(View view) {
        getWindow().setBackgroundDrawableResource(R.color.greenColor);
    }
}