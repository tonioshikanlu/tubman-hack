package b.l.a.c.f.i;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import b.l.a.c.d.b;

public final class sa extends a implements qb {
    public sa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j2) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeLong(j2);
        k(23, g2);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeString(str2);
        o0.b(g2, bundle);
        k(9, g2);
    }

    public final void endAdUnitExposure(String str, long j2) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeLong(j2);
        k(24, g2);
    }

    public final void generateEventId(tb tbVar) {
        Parcel g2 = g();
        o0.c(g2, tbVar);
        k(22, g2);
    }

    public final void getCachedAppInstanceId(tb tbVar) {
        Parcel g2 = g();
        o0.c(g2, tbVar);
        k(19, g2);
    }

    public final void getConditionalUserProperties(String str, String str2, tb tbVar) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeString(str2);
        o0.c(g2, tbVar);
        k(10, g2);
    }

    public final void getCurrentScreenClass(tb tbVar) {
        Parcel g2 = g();
        o0.c(g2, tbVar);
        k(17, g2);
    }

    public final void getCurrentScreenName(tb tbVar) {
        Parcel g2 = g();
        o0.c(g2, tbVar);
        k(16, g2);
    }

    public final void getGmpAppId(tb tbVar) {
        Parcel g2 = g();
        o0.c(g2, tbVar);
        k(21, g2);
    }

    public final void getMaxUserProperties(String str, tb tbVar) {
        Parcel g2 = g();
        g2.writeString(str);
        o0.c(g2, tbVar);
        k(6, g2);
    }

    public final void getUserProperties(String str, String str2, boolean z, tb tbVar) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeString(str2);
        ClassLoader classLoader = o0.a;
        g2.writeInt(z ? 1 : 0);
        o0.c(g2, tbVar);
        k(5, g2);
    }

    public final void initialize(b bVar, zb zbVar, long j2) {
        Parcel g2 = g();
        o0.c(g2, bVar);
        o0.b(g2, zbVar);
        g2.writeLong(j2);
        k(1, g2);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeString(str2);
        o0.b(g2, bundle);
        g2.writeInt(z ? 1 : 0);
        g2.writeInt(z2 ? 1 : 0);
        g2.writeLong(j2);
        k(2, g2);
    }

    public final void logHealthData(int i2, String str, b bVar, b bVar2, b bVar3) {
        Parcel g2 = g();
        g2.writeInt(5);
        g2.writeString(str);
        o0.c(g2, bVar);
        o0.c(g2, bVar2);
        o0.c(g2, bVar3);
        k(33, g2);
    }

    public final void onActivityCreated(b bVar, Bundle bundle, long j2) {
        Parcel g2 = g();
        o0.c(g2, bVar);
        o0.b(g2, bundle);
        g2.writeLong(j2);
        k(27, g2);
    }

    public final void onActivityDestroyed(b bVar, long j2) {
        Parcel g2 = g();
        o0.c(g2, bVar);
        g2.writeLong(j2);
        k(28, g2);
    }

    public final void onActivityPaused(b bVar, long j2) {
        Parcel g2 = g();
        o0.c(g2, bVar);
        g2.writeLong(j2);
        k(29, g2);
    }

    public final void onActivityResumed(b bVar, long j2) {
        Parcel g2 = g();
        o0.c(g2, bVar);
        g2.writeLong(j2);
        k(30, g2);
    }

    public final void onActivitySaveInstanceState(b bVar, tb tbVar, long j2) {
        Parcel g2 = g();
        o0.c(g2, bVar);
        o0.c(g2, tbVar);
        g2.writeLong(j2);
        k(31, g2);
    }

    public final void onActivityStarted(b bVar, long j2) {
        Parcel g2 = g();
        o0.c(g2, bVar);
        g2.writeLong(j2);
        k(25, g2);
    }

    public final void onActivityStopped(b bVar, long j2) {
        Parcel g2 = g();
        o0.c(g2, bVar);
        g2.writeLong(j2);
        k(26, g2);
    }

    public final void registerOnMeasurementEventListener(wb wbVar) {
        Parcel g2 = g();
        o0.c(g2, wbVar);
        k(35, g2);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j2) {
        Parcel g2 = g();
        o0.b(g2, bundle);
        g2.writeLong(j2);
        k(8, g2);
    }

    public final void setCurrentScreen(b bVar, String str, String str2, long j2) {
        Parcel g2 = g();
        o0.c(g2, bVar);
        g2.writeString(str);
        g2.writeString(str2);
        g2.writeLong(j2);
        k(15, g2);
    }

    public final void setDataCollectionEnabled(boolean z) {
        Parcel g2 = g();
        ClassLoader classLoader = o0.a;
        g2.writeInt(z ? 1 : 0);
        k(39, g2);
    }

    public final void setUserProperty(String str, String str2, b bVar, boolean z, long j2) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeString(str2);
        o0.c(g2, bVar);
        g2.writeInt(z ? 1 : 0);
        g2.writeLong(j2);
        k(4, g2);
    }
}
