package com.example.apiiit_rkv.apssdc_assignment_6;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean check = intent.getBooleanExtra("state", false);
        if(check){
            Toast.makeText(context, "Airplane Mode Turn On", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Airplane ModeTurn Off", Toast.LENGTH_SHORT).show();
        }
    }
}
