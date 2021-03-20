package b.o;

import android.location.Location;
import b.o.i2;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationServices;

public class u extends c0 {

    /* renamed from: j  reason: collision with root package name */
    public static FusedLocationProviderClient f6296j;

    /* renamed from: k  reason: collision with root package name */
    public static c f6297k;

    public static class a implements OnFailureListener {
    }

    public static class b implements OnSuccessListener<Location> {
    }

    public static class c extends LocationCallback {
        public FusedLocationProviderClient a;

        public c(FusedLocationProviderClient fusedLocationProviderClient) {
            this.a = fusedLocationProviderClient;
            a();
        }

        public final void a() {
            long j2 = i2.f6120h ? 270000 : 570000;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j2).setInterval(j2).setMaxWaitTime((long) (((double) j2) * 1.5d)).setPriority(102);
            i2.a(i2.k.DEBUG, "HMSLocationController Huawei LocationServices requestLocationUpdates!", (Throwable) null);
            this.a.requestLocationUpdates(priority, this, c0.f6031e.getLooper());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g() {
        /*
            java.lang.Object r0 = b.o.c0.d
            monitor-enter(r0)
            b.o.i2$k r1 = b.o.i2.k.DEBUG     // Catch:{ all -> 0x002d }
            java.lang.String r2 = "HMSLocationController onFocusChange!"
            r3 = 0
            b.o.i2.a(r1, r2, r3)     // Catch:{ all -> 0x002d }
            boolean r1 = b.o.c0.f()     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0017
            com.huawei.hms.location.FusedLocationProviderClient r1 = f6296j     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x0017:
            com.huawei.hms.location.FusedLocationProviderClient r1 = f6296j     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x002b
            b.o.u$c r2 = f6297k     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0022
            r1.removeLocationUpdates(r2)     // Catch:{ all -> 0x002d }
        L_0x0022:
            b.o.u$c r1 = new b.o.u$c     // Catch:{ all -> 0x002d }
            com.huawei.hms.location.FusedLocationProviderClient r2 = f6296j     // Catch:{ all -> 0x002d }
            r1.<init>(r2)     // Catch:{ all -> 0x002d }
            f6297k = r1     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x002d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.u.g():void");
    }

    public static void k() {
        synchronized (c0.d) {
            if (f6296j == null) {
                try {
                    f6296j = LocationServices.getFusedLocationProviderClient(c0.f6032g);
                } catch (Exception e2) {
                    i2.k kVar = i2.k.ERROR;
                    i2.a(kVar, "Huawei LocationServices getFusedLocationProviderClient failed! " + e2, (Throwable) null);
                    synchronized (c0.d) {
                        f6296j = null;
                        return;
                    }
                }
            }
            Location location = c0.f6033h;
            if (location != null) {
                c0.b(location);
            } else {
                f6296j.getLastLocation().addOnSuccessListener(new b()).addOnFailureListener(new a());
            }
        }
    }
}
