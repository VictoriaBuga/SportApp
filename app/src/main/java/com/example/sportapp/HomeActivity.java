package com.example.sportapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeActivity extends AppCompatActivity
{
    ImageButton btn_beginner_abs;
    ImageButton btn_beginner_arm;
    ImageButton btn_beginner_leg;
    ImageButton btn_beginner_back;
    ImageButton btn_beginner_chest;
    ImageButton btn_mid_abs;
    ImageButton btn_mid_arm;
    ImageButton btn_mid_leg;
    ImageButton btn_mid_back;
    ImageButton btn_mid_chest;
    ImageButton btn_adv_abs;
    ImageButton btn_adv_arm;
    ImageButton btn_adv_leg;
    ImageButton btn_adv_back;
    ImageButton btn_adv_chest;

    BottomNavigationView nav;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
        btn_beginner_abs=findViewById(R.id.beginner_abs);
        btn_beginner_arm=findViewById(R.id.beginner_arm);
        btn_beginner_leg=findViewById(R.id.beginner_leg);
        btn_beginner_back=findViewById(R.id.beginner_back_shoulders);
        btn_beginner_chest=findViewById(R.id.beginner_chest);
        btn_mid_abs=findViewById(R.id.int_abs);
        btn_mid_arm=findViewById(R.id.int_arm);
        btn_mid_leg=findViewById(R.id.int_leg);
        btn_mid_back=findViewById(R.id.int_back_shoulders);
        btn_mid_chest=findViewById(R.id.int_chest);
        btn_adv_abs=findViewById(R.id.adv_abs);
        btn_adv_arm=findViewById(R.id.adv_arm);
        btn_adv_leg=findViewById(R.id.adv_leg);
        btn_adv_back=findViewById(R.id.adv_back_shoulders);
        btn_adv_chest=findViewById(R.id.adv_chest);
        nav=findViewById(R.id.bottomNavigationView);
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.menu:
                       // Toast.makeText(HomeActivity.this, "Menu", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(getApplicationContext(), MenuActivity.class));
                        break;

                }
                return true;
            }
        });
        btn_beginner_abs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), AbsBeginnerActivity.class));
            }
        });
        btn_beginner_arm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), ArmBeginnerActivity.class));
            }
        });
        btn_beginner_leg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), LegBeginnerActivity.class));
            }
        });
        btn_beginner_back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), BackBeginnerActivity.class));
            }
        });
        btn_beginner_chest.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), ChestBeginnerActivity.class));
            }
        });
        btn_mid_abs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), AbsMidActivity.class));
            }
        });
        btn_mid_arm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), ArmMidActivity.class));
            }
        });
        btn_mid_leg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), LegMidActivity.class));
            }
        });
        btn_mid_back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), BackMidActivity.class));
            }
        });
        btn_mid_chest.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), ChestMidActivity.class));
            }
        });
        btn_adv_abs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), AbsAdvActivity.class));
            }
        });
        btn_adv_arm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), ArmAdvActivity.class));
            }
        });
        btn_adv_leg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), LegAdvActivity.class));
            }
        });
        btn_adv_back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), BackAdvActivity.class));
            }
        });
        btn_adv_chest.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), ChestAdvActivity.class));
            }
        });
    }
}