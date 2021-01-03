package com.nicolasrose.agentimmobilier.agentimmobilier.app;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

import androidx.multidex.MultiDexApplication;

import com.nicolasrose.agentimmobilier.agentimmobilier.utils.Constants.NotificationsChannels;

public class ApplicationClass extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        createNotificationChannels();
    }

    private void createNotificationChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel1 = new NotificationChannel(
                    NotificationsChannels.DEFAULT_CHANNEL_ID,
                    NotificationsChannels.DEFAULT_CHANNEL_ID,
                    NotificationManager.IMPORTANCE_HIGH
            );
            channel1.setDescription(NotificationsChannels.DEFAULT_CHANNEL_ID);

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel1);
        }
    }
}
