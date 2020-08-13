package com.example.rounokm.wham;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        noise();
    }

    /** Called when the user taps the "Level 1" button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, LevelOneActivity.class);
        startActivity(intent);
    }

    public void sendMessage2(View view) {
        Intent intent = new Intent(this, LevelTwoActivity.class);
        startActivity(intent);
    }

    public void sendMessage3(View view) {
        Intent intent = new Intent(this, LevelThreeActivity.class);
        startActivity(intent);
    }

    public void noise(){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.start);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you
    }

}
