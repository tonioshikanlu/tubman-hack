package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.RecentlyNonNull;
import androidx.legacy.content.WakefulBroadcastReceiver;
import b.l.a.c.f.i.zb;
import b.l.a.c.i.b.c4;
import b.l.a.c.i.b.d4;
import b.l.a.c.i.b.i3;
import b.l.a.c.i.b.k3;
import b.l.a.c.i.b.l4;
import java.util.Objects;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements c4 {
    public d4 a;

    @MainThread
    public void onReceive(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent) {
        String str;
        i3 i3Var;
        if (this.a == null) {
            this.a = new d4(this);
        }
        d4 d4Var = this.a;
        Objects.requireNonNull(d4Var);
        k3 a2 = l4.h(context, (zb) null, (Long) null).a();
        if (intent == null) {
            i3Var = a2.f4091i;
            str = "Receiver called with null intent";
        } else {
            String action = intent.getAction();
            a2.f4096n.b("Local receiver got", action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
                className.setAction("com.google.android.gms.measurement.UPLOAD");
                a2.f4096n.a("Starting wakeful intent.");
                Objects.requireNonNull((AppMeasurementReceiver) d4Var.a);
                WakefulBroadcastReceiver.startWakefulService(context, className);
                return;
            } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                i3Var = a2.f4091i;
                str = "Install Referrer Broadcasts are deprecated";
            } else {
                return;
            }
        }
        i3Var.a(str);
    }
}
