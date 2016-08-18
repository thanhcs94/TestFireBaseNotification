package com.the360lifechange;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by thanhcs94 on 8/18/2016.
 */
public class Pref {
    private String MyPREFERENCES = "myPref";
    private  String FCM_KEY = "fcm_key";
    private Context activity;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor ;
    public Pref(Context activity){
        this.activity = activity;
        sharedPreferences = activity.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }
    public void setFCM_KEY(String fcm) {
        editor.putString(FCM_KEY , fcm);
        editor.commit();
    }
    public String getFCM_KEY() {
        return sharedPreferences.getString(FCM_KEY, "null");
    }

}
