package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import b.l.a.c.c.a;
import b.l.a.c.c.f;
import b.l.a.c.c.g;
import b.l.a.c.f.a.b;
import b.l.a.c.f.a.c;
import b.l.a.c.f.a.d;
import com.amplitude.api.Constants;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AdvertisingIdClient {
    private final Context mContext;
    @Nullable
    private a zze;
    @Nullable
    private b zzf;
    private boolean zzg;
    private final Object zzh;
    @Nullable
    private zza zzi;
    private final boolean zzj;
    private final long zzk;

    public static final class Info {
        private final String zzq;
        private final boolean zzr;

        public Info(String str, boolean z) {
            this.zzq = str;
            this.zzr = z;
        }

        public final String getId() {
            return this.zzq;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.zzr;
        }

        public final String toString() {
            String str = this.zzq;
            boolean z = this.zzr;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public static class zza extends Thread {
        private WeakReference<AdvertisingIdClient> zzm;
        private long zzn;
        public CountDownLatch zzo = new CountDownLatch(1);
        public boolean zzp = false;

        public zza(AdvertisingIdClient advertisingIdClient, long j2) {
            this.zzm = new WeakReference<>(advertisingIdClient);
            this.zzn = j2;
            start();
        }

        private final void disconnect() {
            AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.zzm.get();
            if (advertisingIdClient != null) {
                advertisingIdClient.finish();
                this.zzp = true;
            }
        }

        public final void run() {
            try {
                if (!this.zzo.await(this.zzn, TimeUnit.MILLISECONDS)) {
                    disconnect();
                }
            } catch (InterruptedException unused) {
                disconnect();
            }
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, Constants.EVENT_UPLOAD_PERIOD_MILLIS, false, false);
    }

    private AdvertisingIdClient(Context context, long j2, boolean z, boolean z2) {
        Context applicationContext;
        this.zzh = new Object();
        Objects.requireNonNull(context, "null reference");
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.mContext = context;
        this.zzg = false;
        this.zzk = j2;
        this.zzj = z2;
    }

    public static Info getAdvertisingIdInfo(Context context) {
        zzb zzb = new zzb(context);
        boolean z = zzb.getBoolean("gads:ad_id_app_context:enabled", false);
        float f = zzb.getFloat("gads:ad_id_app_context:ping_ratio", 0.0f);
        String string = zzb.getString("gads:ad_id_use_shared_preference:experiment_id", "");
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, z, zzb.getBoolean("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zza(false);
            Info info = advertisingIdClient.getInfo();
            advertisingIdClient.zza(info, z, f, SystemClock.elapsedRealtime() - elapsedRealtime, string, (Throwable) null);
            advertisingIdClient.finish();
            return info;
        } catch (Throwable th) {
            advertisingIdClient.finish();
            throw th;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        zzb zzb = new zzb(context);
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, zzb.getBoolean("gads:ad_id_app_context:enabled", false), zzb.getBoolean("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            advertisingIdClient.zza(false);
            return advertisingIdClient.zzb();
        } finally {
            advertisingIdClient.finish();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private static a zza(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int b2 = f.f2599b.b(context, 12451000);
            if (b2 == 0 || b2 == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                a aVar = new a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    b.l.a.c.c.o.a b3 = b.l.a.c.c.o.a.b();
                    Objects.requireNonNull(b3);
                    context.getClass().getName();
                    if (b3.c(context, intent, aVar, 1)) {
                        return aVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new g(9);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.zzh
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = r5.zzi     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.zzo     // Catch:{ all -> 0x0024 }
            r1.countDown()     // Catch:{ all -> 0x0024 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = r5.zzi     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r5.zzk     // Catch:{ all -> 0x0024 }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0022
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = new com.google.android.gms.ads.identifier.AdvertisingIdClient$zza     // Catch:{ all -> 0x0024 }
            long r2 = r5.zzk     // Catch:{ all -> 0x0024 }
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0024 }
            r5.zzi = r1     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return
        L_0x0024:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.zza():void");
    }

    private final void zza(boolean z) {
        b.l.a.c.b.a.z("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg) {
                finish();
            }
            a zza2 = zza(this.mContext, this.zzj);
            this.zze = zza2;
            this.zzf = zza(this.mContext, zza2);
            this.zzg = true;
            if (z) {
                zza();
            }
        }
    }

    private final boolean zza(Info info, boolean z, float f, long j2, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", z ? str2 : "0");
        if (info != null) {
            if (!info.isLimitAdTrackingEnabled()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (!(info == null || info.getId() == null)) {
            hashMap.put("ad_id_size", Integer.toString(info.getId().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j2));
        new zza(this, hashMap).start();
        return true;
    }

    private final boolean zzb() {
        boolean c;
        b.l.a.c.b.a.z("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzg) {
                synchronized (this.zzh) {
                    zza zza2 = this.zzi;
                    if (zza2 == null || !zza2.zzp) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zza(false);
                    if (!this.zzg) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                } catch (Exception e3) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                }
            }
            Objects.requireNonNull(this.zze, "null reference");
            Objects.requireNonNull(this.zzf, "null reference");
            c = this.zzf.c();
        }
        zza();
        return c;
    }

    public void finalize() {
        finish();
        super.finalize();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void finish() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            b.l.a.c.b.a.z(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.mContext     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0034
            b.l.a.c.c.a r0 = r3.zze     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0034
        L_0x000f:
            boolean r0 = r3.zzg     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x002a
            b.l.a.c.c.o.a r0 = b.l.a.c.c.o.a.b()     // Catch:{ all -> 0x0022 }
            android.content.Context r1 = r3.mContext     // Catch:{ all -> 0x0022 }
            b.l.a.c.c.a r2 = r3.zze     // Catch:{ all -> 0x0022 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0022 }
            r1.unbindService(r2)     // Catch:{ all -> 0x0022 }
            goto L_0x002a
        L_0x0022:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0036 }
        L_0x002a:
            r0 = 0
            r3.zzg = r0     // Catch:{ all -> 0x0036 }
            r0 = 0
            r3.zzf = r0     // Catch:{ all -> 0x0036 }
            r3.zze = r0     // Catch:{ all -> 0x0036 }
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            return
        L_0x0034:
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            return
        L_0x0036:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.finish():void");
    }

    public Info getInfo() {
        Info info;
        b.l.a.c.b.a.z("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzg) {
                synchronized (this.zzh) {
                    zza zza2 = this.zzi;
                    if (zza2 == null || !zza2.zzp) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zza(false);
                    if (!this.zzg) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                } catch (Exception e3) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                }
            }
            Objects.requireNonNull(this.zze, "null reference");
            Objects.requireNonNull(this.zzf, "null reference");
            info = new Info(this.zzf.getId(), this.zzf.A0(true));
        }
        zza();
        return info;
    }

    public void start() {
        zza(true);
    }

    private static b zza(Context context, a aVar) {
        try {
            IBinder a = aVar.a(10000, TimeUnit.MILLISECONDS);
            int i2 = c.a;
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            return queryLocalInterface instanceof b ? (b) queryLocalInterface : new d(a);
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
