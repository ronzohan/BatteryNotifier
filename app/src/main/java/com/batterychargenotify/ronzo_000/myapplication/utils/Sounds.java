package com.batterychargenotify.ronzo_000.myapplication.utils;

import android.app.Activity;
import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;

public class Sounds {
    public static void playSound(Context context) {
        try {
            Uri notification =
                    RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            Ringtone ringtone = RingtoneManager.getRingtone(context, notification);
            ringtone.play();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
