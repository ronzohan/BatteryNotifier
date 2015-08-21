package com.batterychargenotify.ronzo_000.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.batterychargenotify.ronzo_000.myapplication.utils.Sounds;


public class PowerConnectionReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        if (action.equals(Intent.ACTION_POWER_DISCONNECTED)) {
            Sounds.playSound(context);
        }
        else if (action.equals(Intent.ACTION_POWER_CONNECTED)){

        }
    }
}
