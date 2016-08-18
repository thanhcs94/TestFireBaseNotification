package com.the360lifechange.service;

/**
 * Created by thanhcs94 on 8/1/2016.
 */

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.the360lifechange.Pref;

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIIDService";

    @Override
    public void onTokenRefresh() {
        //Getting registration token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        //Displaying token on logcat
        Log.d(TAG, "Refreshed token: " + refreshedToken);
        Pref mpPref = new Pref(getApplicationContext());
        mpPref.setFCM_KEY(refreshedToken);
    }

    private void sendRegistrationToServer(String token) {
        //You can implement this method to store the token on your server
        //Not required for current project
    }

    //token temp : cdgf-Lkyozs:APA91bFLx5t_cCI_pXQLDTfGTjrjKySAbe36NOl0NwwAXbft3PondZeO5zEy2RlnXqRTbARua-1F0xhDDQEqdCFL8U1X66PzDVwV1m_MNiJn-a-HfuKfukwpnwF83Ds4uTX1oVlml7vv
}
