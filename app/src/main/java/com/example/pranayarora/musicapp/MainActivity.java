package com.example.pranayarora.musicapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    MediaPlayer mp;
    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(getApplicationContext(), R.raw.abc);
        mp.start();

        b1 = (Button) findViewById(R.id.button4);
        b2 = (Button) findViewById(R.id.button5);
        b3 = (Button) findViewById(R.id.button6);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==b1.getId())
         {
           mp.start();
         }

        if(v.getId() == b2.getId())
        {
            mp.pause();
        }
        if(v.getId() == b3.getId())
        {
           mp.start();
        }
    }

}