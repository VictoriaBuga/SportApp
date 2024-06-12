package com.example.sportapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class AbsAdvActivity extends AppCompatActivity
{
    VideoView videoView1;
    VideoView videoView2;
    VideoView videoView3;
    VideoView videoView4;
    VideoView videoView5;
    VideoView videoView6;
    BottomNavigationView nav;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_adv);
        getSupportActionBar().hide();
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

                    case R.id.home:
                        // Toast.makeText(HomeActivity.this, "Home", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        break;

                }
                return true;
            }
        });

        //video 1
        videoView1 = findViewById(R.id.videoView1);
        Uri uri1 = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.abs_adv1);
        videoView1.setVideoURI(uri1);
        videoView1.start();
        videoView1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        //video 2
        videoView2 = findViewById(R.id.videoView2);
        Uri uri2 = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.abs_adv2);
        videoView2.setVideoURI(uri2);
        videoView2.start();
        videoView2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        //video 3
        videoView3 = findViewById(R.id.videoView3);
        Uri uri3 = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.abs_adv3);
        videoView3.setVideoURI(uri3);
        videoView3.start();
        videoView3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        //video 4
        videoView4 = findViewById(R.id.videoView4);
        Uri uri4 = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.abs_adv4);
        videoView4.setVideoURI(uri4);
        videoView4.start();
        videoView4.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        //video 5
        videoView5 = findViewById(R.id.videoView5);
        Uri uri5 = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.abs_adv5);
        videoView5.setVideoURI(uri5);
        videoView5.start();
        videoView5.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });


        //video 6
        videoView6 = findViewById(R.id.videoView6);
        Uri uri6 = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.abs_adv6);
        videoView6.setVideoURI(uri6);
        videoView6.start();
        videoView6.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
    }
    //video 1
    @Override
    protected void onResume()
    {
        videoView1.resume();
        videoView2.resume();
        videoView3.resume();
        videoView4.resume();
        videoView5.resume();
        videoView6.resume();
        super.onResume();
    }

    @Override
    protected void onStart()
    {
        videoView1.start();
        videoView2.start();
        videoView3.start();
        videoView4.start();
        videoView5.start();
        videoView6.start();
        super.onStart();
    }

    @Override
    protected void onPause()
    {
        videoView1.suspend();
        videoView2.suspend();
        videoView3.suspend();
        videoView4.suspend();
        videoView5.suspend();
        videoView6.suspend();
        super.onPause();
    }

    @Override
    protected void onDestroy()
    {
        videoView1.stopPlayback();
        videoView2.stopPlayback();
        videoView3.stopPlayback();
        videoView4.stopPlayback();
        videoView5.stopPlayback();
        videoView6.stopPlayback();
        super.onDestroy();
    }



}