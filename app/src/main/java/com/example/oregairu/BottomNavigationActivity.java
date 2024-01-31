package com.example.oregairu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class BottomNavigationActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        bottomNavigationView = findViewById(R.id.bottom);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.first)
                    load(FirstFragment.getInstance("Dobariya Rixit", 6),true);
                if(item.getItemId()==R.id.second)
                    load(new SecondFragment(),true);
                if(item.getItemId()==R.id.third)
                    load(new ThirdFragment(),true);
                return true;
            }
        });
        load(new ThirdFragment(),false);
    }
    void load(Fragment fragment, boolean flag)
    {
        FragmentManager fm =getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();



        if(flag == false)
        {
            ft.add(R.id.frame, fragment);
        }
        else {
            ft.replace(R.id.frame, fragment);
        }

        ft.commit();
    }
}