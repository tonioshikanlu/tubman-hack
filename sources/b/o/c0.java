package b.o;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import b.l.f.x.a.g;
import b.o.i2;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class c0 {
    public static final List<e> a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public static ConcurrentHashMap<f, b> f6030b = new ConcurrentHashMap<>();
    public static boolean c;
    public static final Object d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static c f6031e;
    public static Thread f;

    /* renamed from: g  reason: collision with root package name */
    public static Context f6032g;

    /* renamed from: h  reason: collision with root package name */
    public static Location f6033h;

    /* renamed from: i  reason: collision with root package name */
    public static String f6034i;

    public static class a {
    }

    public interface b {
        void a(d dVar);

        f d();
    }

    public static class c extends HandlerThread {

        /* renamed from: h  reason: collision with root package name */
        public Handler f6035h = new Handler(getLooper());

        public c() {
            super("OSH_LocationHandlerThread");
            start();
        }
    }

    public static class d {
        public Double a;

        /* renamed from: b  reason: collision with root package name */
        public Double f6036b;
        public Float c;
        public Integer d;

        /* renamed from: e  reason: collision with root package name */
        public Boolean f6037e;
        public Long f;

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("LocationPoint{lat=");
            y.append(this.a);
            y.append(", log=");
            y.append(this.f6036b);
            y.append(", accuracy=");
            y.append(this.c);
            y.append(", type=");
            y.append(this.d);
            y.append(", bg=");
            y.append(this.f6037e);
            y.append(", timeStamp=");
            y.append(this.f);
            y.append('}');
            return y.toString();
        }
    }

    public static abstract class e implements b {
        public void b(i2.s sVar) {
        }
    }

    public enum f {
        STARTUP,
        PROMPT_LOCATION,
        SYNC_SERVICE
    }

    public static void a(d dVar) {
        Thread thread;
        Class<c0> cls = c0.class;
        HashMap hashMap = new HashMap();
        synchronized (cls) {
            hashMap.putAll(f6030b);
            f6030b.clear();
            thread = f;
        }
        for (f fVar : hashMap.keySet()) {
            ((b) hashMap.get(fVar)).a(dVar);
        }
        if (thread != null && !Thread.currentThread().equals(thread)) {
            thread.interrupt();
        }
        if (thread == f) {
            synchronized (cls) {
                if (thread == f) {
                    f = null;
                }
            }
        }
        b3.j(b3.a, "OS_LAST_LOCATION_TIME", System.currentTimeMillis());
    }

    public static void b(Location location) {
        double d2;
        i2.k kVar = i2.k.DEBUG;
        i2.a(kVar, "LocationController fireCompleteForLocation with location: " + location, (Throwable) null);
        d dVar = new d();
        dVar.c = Float.valueOf(location.getAccuracy());
        dVar.f6037e = Boolean.valueOf(i2.f6120h ^ true);
        dVar.d = Integer.valueOf(c ^ true ? 1 : 0);
        dVar.f = Long.valueOf(location.getTime());
        if (c) {
            dVar.a = Double.valueOf(new BigDecimal(location.getLatitude()).setScale(7, RoundingMode.HALF_UP).doubleValue());
            d2 = new BigDecimal(location.getLongitude()).setScale(7, RoundingMode.HALF_UP).doubleValue();
        } else {
            dVar.a = Double.valueOf(location.getLatitude());
            d2 = location.getLongitude();
        }
        dVar.f6036b = Double.valueOf(d2);
        a(dVar);
        h(f6032g);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static void c() {
        /*
            r0 = 0
            com.onesignal.PermissionsActivity.f7396j = r0
            java.lang.Object r0 = d
            monitor-enter(r0)
            boolean r1 = e()     // Catch:{ all -> 0x0024 }
            r2 = 0
            if (r1 == 0) goto L_0x0011
            b.o.p.c()     // Catch:{ all -> 0x0024 }
            goto L_0x001f
        L_0x0011:
            boolean r1 = f()     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x001f
            monitor-enter(r0)     // Catch:{ all -> 0x0024 }
            b.o.u.f6296j = r2     // Catch:{ all -> 0x001c }
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            goto L_0x001f
        L_0x001c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r1     // Catch:{ all -> 0x0024 }
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            a(r2)
            return
        L_0x0024:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.c0.c():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a0 A[Catch:{ NameNotFoundException -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a7 A[Catch:{ NameNotFoundException -> 0x00ae }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(android.content.Context r4, boolean r5, boolean r6, b.o.c0.b r7) {
        /*
            b.o.i2$s r0 = b.o.i2.s.PERMISSION_GRANTED
            b.o.i2$s r1 = b.o.i2.s.ERROR
            boolean r2 = r7 instanceof b.o.c0.e
            if (r2 == 0) goto L_0x0016
            java.util.List<b.o.c0$e> r2 = a
            monitor-enter(r2)
            r3 = r7
            b.o.c0$e r3 = (b.o.c0.e) r3     // Catch:{ all -> 0x0013 }
            r2.add(r3)     // Catch:{ all -> 0x0013 }
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            goto L_0x0016
        L_0x0013:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            throw r4
        L_0x0016:
            f6032g = r4
            java.util.concurrent.ConcurrentHashMap<b.o.c0$f, b.o.c0$b> r2 = f6030b
            b.o.c0$f r3 = r7.d()
            r2.put(r3, r7)
            boolean r7 = b.o.i2.G
            if (r7 != 0) goto L_0x002c
            i(r5, r1)
            c()
            return
        L_0x002c:
            java.lang.String r7 = "android.permission.ACCESS_FINE_LOCATION"
            int r7 = b.l.f.x.a.g.i(r4, r7)
            r2 = -1
            if (r7 != r2) goto L_0x003e
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            int r2 = b.l.f.x.a.g.i(r4, r2)
            r3 = 1
            c = r3
        L_0x003e:
            if (r7 == 0) goto L_0x00b6
            android.content.pm.PackageManager r7 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00ae }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x00ae }
            r3 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r4 = r7.getPackageInfo(r4, r3)     // Catch:{ NameNotFoundException -> 0x00ae }
            java.lang.String[] r4 = r4.requestedPermissions     // Catch:{ NameNotFoundException -> 0x00ae }
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NameNotFoundException -> 0x00ae }
            b.o.i2$s r7 = b.o.i2.s.PERMISSION_DENIED     // Catch:{ NameNotFoundException -> 0x00ae }
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r3 = r4.contains(r3)     // Catch:{ NameNotFoundException -> 0x00ae }
            if (r3 == 0) goto L_0x0061
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            goto L_0x006d
        L_0x0061:
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r4 = r4.contains(r3)     // Catch:{ NameNotFoundException -> 0x00ae }
            if (r4 == 0) goto L_0x0070
            if (r2 == 0) goto L_0x007a
            java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
        L_0x006d:
            f6034i = r4     // Catch:{ NameNotFoundException -> 0x00ae }
            goto L_0x007a
        L_0x0070:
            b.o.i2$k r4 = b.o.i2.k.INFO     // Catch:{ NameNotFoundException -> 0x00ae }
            java.lang.String r7 = "Location permissions not added on AndroidManifest file"
            r3 = 0
            b.o.i2.a(r4, r7, r3)     // Catch:{ NameNotFoundException -> 0x00ae }
            b.o.i2$s r7 = b.o.i2.s.LOCATION_PERMISSIONS_MISSING_MANIFEST     // Catch:{ NameNotFoundException -> 0x00ae }
        L_0x007a:
            java.lang.String r4 = f6034i     // Catch:{ NameNotFoundException -> 0x00ae }
            if (r4 == 0) goto L_0x009e
            if (r5 == 0) goto L_0x009e
            boolean r4 = com.onesignal.PermissionsActivity.f7395i     // Catch:{ NameNotFoundException -> 0x00ae }
            if (r4 != 0) goto L_0x00bc
            boolean r4 = com.onesignal.PermissionsActivity.f7396j     // Catch:{ NameNotFoundException -> 0x00ae }
            if (r4 == 0) goto L_0x0089
            goto L_0x00bc
        L_0x0089:
            com.onesignal.PermissionsActivity.f7397k = r6     // Catch:{ NameNotFoundException -> 0x00ae }
            b.o.t3 r4 = new b.o.t3     // Catch:{ NameNotFoundException -> 0x00ae }
            r4.<init>()     // Catch:{ NameNotFoundException -> 0x00ae }
            com.onesignal.PermissionsActivity.f7399m = r4     // Catch:{ NameNotFoundException -> 0x00ae }
            b.o.a r4 = b.o.c.f6028i     // Catch:{ NameNotFoundException -> 0x00ae }
            if (r4 == 0) goto L_0x00bc
            java.lang.String r6 = com.onesignal.PermissionsActivity.f7394h     // Catch:{ NameNotFoundException -> 0x00ae }
            b.o.a$b r7 = com.onesignal.PermissionsActivity.f7399m     // Catch:{ NameNotFoundException -> 0x00ae }
            r4.a(r6, r7)     // Catch:{ NameNotFoundException -> 0x00ae }
            goto L_0x00bc
        L_0x009e:
            if (r2 != 0) goto L_0x00a7
            i(r5, r0)     // Catch:{ NameNotFoundException -> 0x00ae }
            j()     // Catch:{ NameNotFoundException -> 0x00ae }
            goto L_0x00bc
        L_0x00a7:
            i(r5, r7)     // Catch:{ NameNotFoundException -> 0x00ae }
            c()     // Catch:{ NameNotFoundException -> 0x00ae }
            goto L_0x00bc
        L_0x00ae:
            r4 = move-exception
            i(r5, r1)
            r4.printStackTrace()
            goto L_0x00bc
        L_0x00b6:
            i(r5, r0)
            j()
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.c0.d(android.content.Context, boolean, boolean, b.o.c0$b):void");
    }

    public static boolean e() {
        return f2.m();
    }

    public static boolean f() {
        boolean z;
        char c2;
        boolean z2;
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        if (z) {
            c2 = 2;
        } else {
            if (!f2.n()) {
                if (f2.j()) {
                    if (f2.i() && f2.l()) {
                        z2 = f2.o();
                        if (z2 || (!f2.n() && f2.s("com.huawei.hwid"))) {
                            c2 = 13;
                        }
                    }
                }
                z2 = false;
                c2 = 13;
            }
            c2 = 1;
        }
        if (!(c2 == 13) || !f2.k()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g() {
        /*
            java.lang.Object r0 = d
            monitor-enter(r0)
            boolean r1 = e()     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x000e
            b.o.p.g()     // Catch:{ all -> 0x0019 }
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x000e:
            boolean r1 = f()     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0017
            b.o.u.g()     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.c0.g():void");
    }

    public static boolean h(Context context) {
        if (!(g.i(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || g.i(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) || !i2.G) {
            return false;
        }
        long currentTimeMillis = ((i2.f6120h ? 300 : 600) * 1000) - (System.currentTimeMillis() - b3.d(b3.a, "OS_LAST_LOCATION_TIME", -600000));
        Long l2 = p3.a;
        i2.k kVar = i2.k.VERBOSE;
        i2.a(kVar, "scheduleLocationUpdateTask:delayMs: " + currentTimeMillis, (Throwable) null);
        p3.c(context, currentTimeMillis);
        return true;
    }

    public static void i(boolean z, i2.s sVar) {
        i2.k kVar = i2.k.DEBUG;
        if (!z) {
            i2.a(kVar, "LocationController sendAndClearPromptHandlers from non prompt flow", (Throwable) null);
            return;
        }
        List<e> list = a;
        synchronized (list) {
            i2.a(kVar, "LocationController calling prompt handlers", (Throwable) null);
            for (e b2 : list) {
                b2.b(sVar);
            }
            a.clear();
        }
    }

    public static void j() {
        i2.k kVar = i2.k.DEBUG;
        StringBuilder y = b.e.a.a.a.y("LocationController startGetLocation with lastLocation: ");
        y.append(f6033h);
        i2.a(kVar, y.toString(), (Throwable) null);
        if (f6031e == null) {
            f6031e = new c();
        }
        try {
            if (e()) {
                p.j();
            } else if (f()) {
                u.k();
            } else {
                c();
            }
        } catch (Throwable th) {
            i2.a(i2.k.WARN, "Location permission exists but there was an error initializing: ", th);
            c();
        }
    }
}
