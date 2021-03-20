package b.h.a.m.v.c0;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;

public final class i implements b {
    public final g<a, Object> a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    public final b f635b = new b();
    public final Map<Class<?>, NavigableMap<Integer, Integer>> c = new HashMap();
    public final Map<Class<?>, a<?>> d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final int f636e;
    public int f;

    public static final class a implements l {
        public final b a;

        /* renamed from: b  reason: collision with root package name */
        public int f637b;
        public Class<?> c;

        public a(b bVar) {
            this.a = bVar;
        }

        public void a() {
            this.a.c(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f637b == aVar.f637b && this.c == aVar.c;
        }

        public int hashCode() {
            int i2 = this.f637b * 31;
            Class<?> cls = this.c;
            return i2 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("Key{size=");
            y.append(this.f637b);
            y.append("array=");
            y.append(this.c);
            y.append('}');
            return y.toString();
        }
    }

    public static final class b extends c<a> {
        public l a() {
            return new a(this);
        }

        public a d(int i2, Class<?> cls) {
            a aVar = (a) b();
            aVar.f637b = i2;
            aVar.c = cls;
            return aVar;
        }
    }

    public i(int i2) {
        this.f636e = i2;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void a(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 40
            if (r2 < r0) goto L_0x000f
            monitor-enter(r1)     // Catch:{ all -> 0x0020 }
            r2 = 0
            r1.g(r2)     // Catch:{ all -> 0x000c }
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            goto L_0x001e
        L_0x000c:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            throw r2     // Catch:{ all -> 0x0020 }
        L_0x000f:
            r0 = 20
            if (r2 >= r0) goto L_0x0017
            r0 = 15
            if (r2 != r0) goto L_0x001e
        L_0x0017:
            int r2 = r1.f636e     // Catch:{ all -> 0x0020 }
            int r2 = r2 / 2
            r1.g(r2)     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r1)
            return
        L_0x0020:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.m.v.c0.i.a(int):void");
    }

    public synchronized void b() {
        g(0);
    }

    public synchronized <T> T c(int i2, Class<T> cls) {
        a aVar;
        aVar = (a) this.f635b.b();
        aVar.f637b = i2;
        aVar.c = cls;
        return i(aVar, cls);
    }

    public synchronized <T> void d(T t) {
        Class<?> cls = t.getClass();
        a<?> h2 = h(cls);
        int b2 = h2.b(t);
        int c2 = h2.c() * b2;
        int i2 = 1;
        if (c2 <= this.f636e / 2) {
            a d2 = this.f635b.d(b2, cls);
            this.a.b(d2, t);
            NavigableMap<Integer, Integer> j2 = j(cls);
            Integer num = (Integer) j2.get(Integer.valueOf(d2.f637b));
            Integer valueOf = Integer.valueOf(d2.f637b);
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            j2.put(valueOf, Integer.valueOf(i2));
            this.f += c2;
            g(this.f636e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> T e(int r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.j(r7)     // Catch:{ all -> 0x004d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x004d }
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch:{ all -> 0x004d }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x004d }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002c
            int r3 = r5.f     // Catch:{ all -> 0x004d }
            if (r3 == 0) goto L_0x0020
            int r4 = r5.f636e     // Catch:{ all -> 0x004d }
            int r4 = r4 / r3
            r3 = 2
            if (r4 < r3) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r3 = r2
            goto L_0x0021
        L_0x0020:
            r3 = r1
        L_0x0021:
            if (r3 != 0) goto L_0x002d
            int r3 = r0.intValue()     // Catch:{ all -> 0x004d }
            int r4 = r6 * 8
            if (r3 > r4) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            if (r1 == 0) goto L_0x003a
            b.h.a.m.v.c0.i$b r6 = r5.f635b     // Catch:{ all -> 0x004d }
            int r0 = r0.intValue()     // Catch:{ all -> 0x004d }
            b.h.a.m.v.c0.i$a r6 = r6.d(r0, r7)     // Catch:{ all -> 0x004d }
            goto L_0x0047
        L_0x003a:
            b.h.a.m.v.c0.i$b r0 = r5.f635b     // Catch:{ all -> 0x004d }
            b.h.a.m.v.c0.l r0 = r0.b()     // Catch:{ all -> 0x004d }
            b.h.a.m.v.c0.i$a r0 = (b.h.a.m.v.c0.i.a) r0     // Catch:{ all -> 0x004d }
            r0.f637b = r6     // Catch:{ all -> 0x004d }
            r0.c = r7     // Catch:{ all -> 0x004d }
            r6 = r0
        L_0x0047:
            java.lang.Object r6 = r5.i(r6, r7)     // Catch:{ all -> 0x004d }
            monitor-exit(r5)
            return r6
        L_0x004d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.m.v.c0.i.e(int, java.lang.Class):java.lang.Object");
    }

    public final void f(int i2, Class<?> cls) {
        NavigableMap<Integer, Integer> j2 = j(cls);
        Integer num = (Integer) j2.get(Integer.valueOf(i2));
        if (num != null) {
            int intValue = num.intValue();
            Integer valueOf = Integer.valueOf(i2);
            if (intValue == 1) {
                j2.remove(valueOf);
            } else {
                j2.put(valueOf, Integer.valueOf(num.intValue() - 1));
            }
        } else {
            throw new NullPointerException("Tried to decrement empty size, size: " + i2 + ", this: " + this);
        }
    }

    public final void g(int i2) {
        while (this.f > i2) {
            Object c2 = this.a.c();
            Objects.requireNonNull(c2, "Argument must not be null");
            a<?> h2 = h(c2.getClass());
            this.f -= h2.c() * h2.b(c2);
            f(h2.b(c2), c2.getClass());
            if (Log.isLoggable(h2.a(), 2)) {
                String a2 = h2.a();
                StringBuilder y = b.e.a.a.a.y("evicted: ");
                y.append(h2.b(c2));
                Log.v(a2, y.toString());
            }
        }
    }

    public final <T> a<T> h(Class<T> cls) {
        a<T> aVar = this.d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new h();
            } else if (cls.equals(byte[].class)) {
                aVar = new f();
            } else {
                StringBuilder y = b.e.a.a.a.y("No array pool found for: ");
                y.append(cls.getSimpleName());
                throw new IllegalArgumentException(y.toString());
            }
            this.d.put(cls, aVar);
        }
        return aVar;
    }

    public final <T> T i(a aVar, Class<T> cls) {
        a<T> h2 = h(cls);
        T a2 = this.a.a(aVar);
        if (a2 != null) {
            this.f -= h2.c() * h2.b(a2);
            f(h2.b(a2), cls);
        }
        if (a2 != null) {
            return a2;
        }
        if (Log.isLoggable(h2.a(), 2)) {
            String a3 = h2.a();
            StringBuilder y = b.e.a.a.a.y("Allocated ");
            y.append(aVar.f637b);
            y.append(" bytes");
            Log.v(a3, y.toString());
        }
        return h2.newArray(aVar.f637b);
    }

    public final NavigableMap<Integer, Integer> j(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(cls, treeMap);
        return treeMap;
    }
}
