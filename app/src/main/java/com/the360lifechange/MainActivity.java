package com.the360lifechange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static String TAG = MainActivity.class.getSimpleName().toUpperCase();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pref mpPref = new Pref(getApplicationContext());
        Log.wtf(TAG , "FCM KEY : "+ mpPref.getFCM_KEY());
    }
}
