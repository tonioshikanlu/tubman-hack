package com.onesignal;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import b.o.i2;
import b.o.p3;

public class SyncService extends Service {
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        p3.a aVar = new p3.a(this);
        Long l2 = p3.a;
        i2.E(this);
        Thread thread = new Thread(aVar, "OS_SYNCSRV_BG_SYNC");
        p3.c = thread;
        thread.start();
        return 1;
    }
}
