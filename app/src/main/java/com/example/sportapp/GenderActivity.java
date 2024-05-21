package com.example.sportapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sportapp.Stacks.Stacks;

public class GenderActivity extends AppCompatActivity
{
    VideoView videoView;
    Button btn_male;
    Button btn_female;
    Button btn_back;
    Button btn_next;
    Button btn_skip;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        getSupportActionBar().hide();
        videoView = findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.gender_background_video);
        videoView.setVideoURI(uri);
        videoView.start();
        btn_next=findViewById(R.id.button_next);
        btn_skip=findViewById(R.id.button_skip);
        btn_male = findViewById(R.id.button_gender_male);
        btn_female = findViewById(R.id.button_gender_female);
        btn_male.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String gender_male = "Male";
                Stacks.pushToGenderStack(gender_male);
            }
        });
        btn_female.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String gender_female = "Female";
                Stacks.pushToGenderStack(gender_female);
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
               // startActivity(new Intent(getApplicationContext(), LoseGainActivity.class));
            }
        });
        btn_skip.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
               // startActivity(new Intent(getApplicationContext(), HomeActivity.class));
            }
        });



        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
    }

    @Override
    protected void onResume()
    {
        videoView.resume();
        super.onResume();
    }

    @Override
    protected void onStart()
    {
        videoView.start();
        super.onStart();
    }

    @Override
    protected void onPause()
    {
        videoView.suspend();
        super.onPause();
    }

    @Override
    protected void onDestroy()
    {
        videoView.stopPlayback();
        super.onDestroy();
    }
}
