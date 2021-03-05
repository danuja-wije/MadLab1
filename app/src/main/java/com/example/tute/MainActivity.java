package com.example.tute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    
    private static final String TAG = "MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: I am Here. application loaded");

        int x = 5;
        if(x < 6){
            Log.d(TAG, "onCreate: x is less than 6");
        }else{
            Log.i(TAG, "onCreate: x is grater than 6");
        }
    }

    @Override
    protected void onStart() {

        super.onStart();
        Log.i(TAG, "onStart: This is invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: This is invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: This is invoked");
    }
}