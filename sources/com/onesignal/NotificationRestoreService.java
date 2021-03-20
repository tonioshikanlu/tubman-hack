package com.onesignal;

import android.app.IntentService;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import b.o.i2;
import b.o.n0;

public class NotificationRestoreService extends IntentService {
    public NotificationRestoreService() {
        super("NotificationRestoreService");
    }

    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            Thread.currentThread().setPriority(10);
            i2.E(this);
            n0.b(this);
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
    }
}
