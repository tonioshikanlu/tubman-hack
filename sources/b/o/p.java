package b.o;

import android.location.Location;
import android.os.Looper;
import androidx.annotation.NonNull;
import b.l.a.c.f.g.d0;
import b.o.i2;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import java.util.Objects;

public class p extends c0 {

    /* renamed from: j  reason: collision with root package name */
    public static s f6223j;

    /* renamed from: k  reason: collision with root package name */
    public static b f6224k;

    public static class a implements GoogleApiClient.b, GoogleApiClient.c {
        public a(o oVar) {
        }

        public void g(int i2) {
            p.c();
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
            	at java.util.ArrayList.get(ArrayList.java:435)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public void k(android.os.Bundle r5) {
            /*
                r4 = this;
                java.lang.Object r5 = b.o.c0.d
                monitor-enter(r5)
                r0 = 0
                com.onesignal.PermissionsActivity.f7396j = r0     // Catch:{ all -> 0x0073 }
                b.o.s r0 = b.o.p.f6223j     // Catch:{ all -> 0x0073 }
                if (r0 == 0) goto L_0x0071
                com.google.android.gms.common.api.GoogleApiClient r0 = r0.a     // Catch:{ all -> 0x0073 }
                if (r0 != 0) goto L_0x000f
                goto L_0x0071
            L_0x000f:
                b.o.i2$k r0 = b.o.i2.k.DEBUG     // Catch:{ all -> 0x0073 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
                r1.<init>()     // Catch:{ all -> 0x0073 }
                java.lang.String r2 = "LocationController GoogleApiClientListener onConnected lastLocation: "
                r1.append(r2)     // Catch:{ all -> 0x0073 }
                android.location.Location r2 = b.o.c0.f6033h     // Catch:{ all -> 0x0073 }
                r1.append(r2)     // Catch:{ all -> 0x0073 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0073 }
                r2 = 0
                b.o.i2.a(r0, r1, r2)     // Catch:{ all -> 0x0073 }
                android.location.Location r1 = b.o.c0.f6033h     // Catch:{ all -> 0x0073 }
                if (r1 != 0) goto L_0x0064
                b.o.s r1 = b.o.p.f6223j     // Catch:{ all -> 0x0073 }
                com.google.android.gms.common.api.GoogleApiClient r1 = r1.a     // Catch:{ all -> 0x0073 }
                monitor-enter(r5)     // Catch:{ all -> 0x0073 }
                boolean r3 = r1.g()     // Catch:{ all -> 0x0061 }
                if (r3 == 0) goto L_0x003f
                b.l.a.c.f.g.c0 r3 = b.l.a.c.g.b.d     // Catch:{ all -> 0x0061 }
                android.location.Location r1 = r3.a(r1)     // Catch:{ all -> 0x0061 }
                monitor-exit(r5)     // Catch:{ all -> 0x0061 }
                goto L_0x0041
            L_0x003f:
                monitor-exit(r5)     // Catch:{ all -> 0x0061 }
                r1 = r2
            L_0x0041:
                b.o.c0.f6033h = r1     // Catch:{ all -> 0x0073 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
                r1.<init>()     // Catch:{ all -> 0x0073 }
                java.lang.String r3 = "LocationController GoogleApiClientListener lastLocation: "
                r1.append(r3)     // Catch:{ all -> 0x0073 }
                android.location.Location r3 = b.o.c0.f6033h     // Catch:{ all -> 0x0073 }
                r1.append(r3)     // Catch:{ all -> 0x0073 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0073 }
                b.o.i2.a(r0, r1, r2)     // Catch:{ all -> 0x0073 }
                android.location.Location r0 = b.o.c0.f6033h     // Catch:{ all -> 0x0073 }
                if (r0 == 0) goto L_0x0064
                b.o.c0.b(r0)     // Catch:{ all -> 0x0073 }
                goto L_0x0064
            L_0x0061:
                r0 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0061 }
                throw r0     // Catch:{ all -> 0x0073 }
            L_0x0064:
                b.o.p$b r0 = new b.o.p$b     // Catch:{ all -> 0x0073 }
                b.o.s r1 = b.o.p.f6223j     // Catch:{ all -> 0x0073 }
                com.google.android.gms.common.api.GoogleApiClient r1 = r1.a     // Catch:{ all -> 0x0073 }
                r0.<init>(r1)     // Catch:{ all -> 0x0073 }
                b.o.p.f6224k = r0     // Catch:{ all -> 0x0073 }
                monitor-exit(r5)     // Catch:{ all -> 0x0073 }
                return
            L_0x0071:
                monitor-exit(r5)     // Catch:{ all -> 0x0073 }
                return
            L_0x0073:
                r0 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0073 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b.o.p.a.k(android.os.Bundle):void");
        }

        public void n(@NonNull b.l.a.c.c.b bVar) {
            p.c();
        }
    }

    public static class b implements b.l.a.c.g.a {
        public GoogleApiClient a;

        public b(GoogleApiClient googleApiClient) {
            this.a = googleApiClient;
            long j2 = i2.f6120h ? 270000 : 570000;
            if (googleApiClient != null) {
                LocationRequest locationRequest = new LocationRequest();
                LocationRequest.V(j2);
                locationRequest.f7293k = true;
                locationRequest.f7292j = j2;
                LocationRequest.V(j2);
                locationRequest.f7291i = j2;
                if (!locationRequest.f7293k) {
                    locationRequest.f7292j = (long) (((double) j2) / 6.0d);
                }
                long j3 = (long) (((double) j2) * 1.5d);
                LocationRequest.V(j3);
                locationRequest.f7297o = j3;
                locationRequest.f7290h = 102;
                i2.a(i2.k.DEBUG, "GMSLocationController GoogleApiClient requestLocationUpdates!", (Throwable) null);
                GoogleApiClient googleApiClient2 = this.a;
                try {
                    synchronized (c0.d) {
                        if (googleApiClient2.g()) {
                            Objects.requireNonNull(b.l.a.c.g.b.d);
                            b.l.a.c.b.a.B(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
                            googleApiClient2.d(new d0(googleApiClient2, locationRequest, this));
                        }
                    }
                } catch (Throwable th) {
                    i2.a(i2.k.WARN, "FusedLocationApi.requestLocationUpdates failed!", th);
                }
            }
        }

        public void a(Location location) {
            i2.k kVar = i2.k.DEBUG;
            i2.a(kVar, "GMSLocationController onLocationChanged: " + location, (Throwable) null);
            c0.f6033h = location;
        }
    }

    public static void c() {
        synchronized (c0.d) {
            s sVar = f6223j;
            if (sVar != null) {
                Objects.requireNonNull(sVar);
                try {
                    sVar.f6271b.getMethod("disconnect", new Class[0]).invoke(sVar.a, new Object[0]);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            f6223j = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g() {
        /*
            java.lang.Object r0 = b.o.c0.d
            monitor-enter(r0)
            b.o.i2$k r1 = b.o.i2.k.DEBUG     // Catch:{ all -> 0x003c }
            java.lang.String r2 = "GMSLocationController onFocusChange!"
            r3 = 0
            b.o.i2.a(r1, r2, r3)     // Catch:{ all -> 0x003c }
            b.o.s r1 = f6223j     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003a
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.a     // Catch:{ all -> 0x003c }
            boolean r1 = r1.g()     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x0018
            goto L_0x003a
        L_0x0018:
            b.o.s r1 = f6223j     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0038
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.a     // Catch:{ all -> 0x003c }
            b.o.p$b r2 = f6224k     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x0031
            b.l.a.c.f.g.c0 r2 = b.l.a.c.g.b.d     // Catch:{ all -> 0x003c }
            b.o.p$b r3 = f6224k     // Catch:{ all -> 0x003c }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x003c }
            b.l.a.c.f.g.e0 r2 = new b.l.a.c.f.g.e0     // Catch:{ all -> 0x003c }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x003c }
            r1.d(r2)     // Catch:{ all -> 0x003c }
        L_0x0031:
            b.o.p$b r2 = new b.o.p$b     // Catch:{ all -> 0x003c }
            r2.<init>(r1)     // Catch:{ all -> 0x003c }
            f6224k = r2     // Catch:{ all -> 0x003c }
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x003c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.p.g():void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void j() {
        /*
            java.lang.Thread r0 = b.o.c0.f
            if (r0 == 0) goto L_0x0006
            goto L_0x0099
        L_0x0006:
            java.lang.Object r0 = b.o.c0.d
            monitor-enter(r0)
            java.lang.Thread r1 = new java.lang.Thread     // Catch:{ all -> 0x009a }
            b.o.o r2 = new b.o.o     // Catch:{ all -> 0x009a }
            r2.<init>()     // Catch:{ all -> 0x009a }
            java.lang.String r3 = "OS_GMS_LOCATION_FALLBACK"
            r1.<init>(r2, r3)     // Catch:{ all -> 0x009a }
            b.o.c0.f = r1     // Catch:{ all -> 0x009a }
            r1.start()     // Catch:{ all -> 0x009a }
            b.o.s r1 = f6223j     // Catch:{ all -> 0x009a }
            if (r1 == 0) goto L_0x0027
            android.location.Location r1 = b.o.c0.f6033h     // Catch:{ all -> 0x009a }
            if (r1 != 0) goto L_0x0023
            goto L_0x0027
        L_0x0023:
            b.o.c0.b(r1)     // Catch:{ all -> 0x009a }
            goto L_0x0098
        L_0x0027:
            b.o.p$a r1 = new b.o.p$a     // Catch:{ all -> 0x009a }
            r2 = 0
            r1.<init>(r2)     // Catch:{ all -> 0x009a }
            com.google.android.gms.common.api.GoogleApiClient$a r3 = new com.google.android.gms.common.api.GoogleApiClient$a     // Catch:{ all -> 0x009a }
            android.content.Context r4 = b.o.c0.f6032g     // Catch:{ all -> 0x009a }
            r3.<init>(r4)     // Catch:{ all -> 0x009a }
            b.l.a.c.c.l.a<b.l.a.c.c.l.a$d$c> r4 = b.l.a.c.g.b.c     // Catch:{ all -> 0x009a }
            java.lang.String r5 = "Api must not be null"
            b.l.a.c.b.a.B(r4, r5)     // Catch:{ all -> 0x009a }
            java.util.Map<b.l.a.c.c.l.a<?>, b.l.a.c.c.l.a$d> r5 = r3.f7249g     // Catch:{ all -> 0x009a }
            r5.put(r4, r2)     // Catch:{ all -> 0x009a }
            b.l.a.c.c.l.a$a<?, O> r2 = r4.a     // Catch:{ all -> 0x009a }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x009a }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x009a }
            java.util.Set<com.google.android.gms.common.api.Scope> r4 = r3.f7247b     // Catch:{ all -> 0x009a }
            r4.addAll(r2)     // Catch:{ all -> 0x009a }
            java.util.Set<com.google.android.gms.common.api.Scope> r4 = r3.a     // Catch:{ all -> 0x009a }
            r4.addAll(r2)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "Listener must not be null"
            b.l.a.c.b.a.B(r1, r2)     // Catch:{ all -> 0x009a }
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$b> r2 = r3.f7254l     // Catch:{ all -> 0x009a }
            r2.add(r1)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "Listener must not be null"
            b.l.a.c.b.a.B(r1, r2)     // Catch:{ all -> 0x009a }
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$c> r2 = r3.f7255m     // Catch:{ all -> 0x009a }
            r2.add(r1)     // Catch:{ all -> 0x009a }
            b.o.c0$c r1 = b.o.c0.f6031e     // Catch:{ all -> 0x009a }
            android.os.Handler r1 = r1.f6035h     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "Handler must not be null"
            b.l.a.c.b.a.B(r1, r2)     // Catch:{ all -> 0x009a }
            android.os.Looper r1 = r1.getLooper()     // Catch:{ all -> 0x009a }
            r3.f7251i = r1     // Catch:{ all -> 0x009a }
            com.google.android.gms.common.api.GoogleApiClient r1 = r3.a()     // Catch:{ all -> 0x009a }
            b.o.s r2 = new b.o.s     // Catch:{ all -> 0x009a }
            r2.<init>(r1)     // Catch:{ all -> 0x009a }
            f6223j = r2     // Catch:{ all -> 0x009a }
            java.lang.Class r1 = r2.f6271b     // Catch:{ all -> 0x0094 }
            java.lang.String r3 = "connect"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x0094 }
            java.lang.reflect.Method r1 = r1.getMethod(r3, r5)     // Catch:{ all -> 0x0094 }
            com.google.android.gms.common.api.GoogleApiClient r2 = r2.a     // Catch:{ all -> 0x0094 }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x0094 }
            r1.invoke(r2, r3)     // Catch:{ all -> 0x0094 }
            goto L_0x0098
        L_0x0094:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x009a }
        L_0x0098:
            monitor-exit(r0)     // Catch:{ all -> 0x009a }
        L_0x0099:
            return
        L_0x009a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.p.j():void");
    }
}
