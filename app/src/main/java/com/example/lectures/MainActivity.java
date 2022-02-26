package com.example.lectures;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private int count;

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = 10;

        Log.d("MainActivity",""+count);
        Log.d("MainActivity", String.valueOf(count));

        Log.d(TAG, "count: "+String.valueOf(count));
        Log.d(TAG, "second count: "+String.valueOf(count));

        Log.d(TAG, "count: "+String.valueOf(count));
    }
}