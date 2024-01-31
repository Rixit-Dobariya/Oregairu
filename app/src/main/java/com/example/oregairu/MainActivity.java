package com.example.oregairu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnFragments,btnNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragments = findViewById(R.id.btnFragments);
        btnFragments.setOnClickListener(v -> {startActivity(new Intent(MainActivity.this,FragmentsActivity.class));});

        btnNavigation = findViewById(R.id.btnBottomNavigation);
        btnNavigation.setOnClickListener(v -> {startActivity(new Intent(MainActivity.this,BottomNavigationActivity.class));});


    }
}