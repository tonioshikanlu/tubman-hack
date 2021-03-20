package com.onesignal;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import androidx.legacy.content.WakefulBroadcastReceiver;
import b.l.f.x.a.g;
import b.o.g0;
import b.o.i;

public class GcmIntentService extends IntentService {
    public GcmIntentService() {
        super("GcmIntentService");
        setIntentRedelivery(true);
    }

    public void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            g.b(this, new i(extras), (g0.a) null);
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
    }
}
