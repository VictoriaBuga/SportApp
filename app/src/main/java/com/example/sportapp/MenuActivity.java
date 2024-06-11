package com.example.sportapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MenuActivity extends AppCompatActivity {
    BottomNavigationView nav;
    Button btn_logout;
    Button btn_insert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        nav = findViewById(R.id.bottomNavigationView);
        getSupportActionBar().hide();
        btn_insert=findViewById(R.id.button_add_data);
        btn_logout=findViewById(R.id.button_logout);
        btn_insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, GenderActivity.class));
            }
        });
        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                    // Toast.makeText(HomeActivity.this, "Home", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                     break;
                }
                return true;
            }
        });
    }
}
/* case R.id.menu:
                        // Toast.makeText(HomeActivity.this, "Menu", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(getApplicationContext(), MenuActivity.class));
                        break;*/