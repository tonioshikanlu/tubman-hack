package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import b.l.a.d.a.b.e1;
import b.l.a.d.a.b.y;

public class AssetPackExtractionService extends Service {

    /* renamed from: h  reason: collision with root package name */
    public y f7322h;

    public final IBinder onBind(Intent intent) {
        return this.f7322h;
    }

    public final void onCreate() {
        super.onCreate();
        this.f7322h = e1.h(getApplicationContext()).z.a();
    }
}
