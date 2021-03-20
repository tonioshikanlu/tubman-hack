package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import b.l.a.a.f.b;
import b.l.a.a.f.h;
import b.l.a.a.f.k;
import b.l.a.a.f.q.h.g;
import b.l.a.a.f.q.h.l;
import b.l.a.a.f.t.a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE);
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i2 = intent.getExtras().getInt("attemptNumber");
        k.b(context);
        h.a a2 = h.a();
        a2.b(queryParameter);
        a2.c(a.b(intValue));
        if (queryParameter2 != null) {
            ((b.C0054b) a2).f2471b = Base64.decode(queryParameter2, 0);
        }
        l lVar = k.a().d;
        lVar.f2534e.execute(new g(lVar, a2.a(), i2, b.l.a.a.f.q.h.a.f2514h));
    }
}
