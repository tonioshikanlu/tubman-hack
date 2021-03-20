package p.a.a;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import p.a.a.h;

public class c {

    /* renamed from: q  reason: collision with root package name */
    public static volatile c f10505q;
    public static final d r = new d();
    public static final Map<Class<?>, List<Class<?>>> s = new HashMap();
    public final Map<Class<?>, CopyOnWriteArrayList<q>> a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Object, List<Class<?>>> f10506b;
    public final Map<Class<?>, Object> c;
    public final ThreadLocal<b> d = new a(this);

    /* renamed from: e  reason: collision with root package name */
    public final h f10507e;
    public final l f;

    /* renamed from: g  reason: collision with root package name */
    public final b f10508g;

    /* renamed from: h  reason: collision with root package name */
    public final a f10509h;

    /* renamed from: i  reason: collision with root package name */
    public final p f10510i;

    /* renamed from: j  reason: collision with root package name */
    public final ExecutorService f10511j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f10512k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f10513l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f10514m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f10515n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f10516o;

    /* renamed from: p  reason: collision with root package name */
    public final g f10517p;

    public class a extends ThreadLocal<b> {
        public a(c cVar) {
        }

        public Object initialValue() {
            return new b();
        }
    }

    public static final class b {
        public final List<Object> a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public boolean f10518b;
        public boolean c;
        public Object d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0044 A[SYNTHETIC, Splitter:B:11:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c() {
        /*
            r5 = this;
            p.a.a.d r0 = r
            r5.<init>()
            p.a.a.c$a r1 = new p.a.a.c$a
            r1.<init>(r5)
            r5.d = r1
            java.util.Objects.requireNonNull(r0)
            boolean r1 = p.a.a.g.a.a
            r2 = 0
            if (r1 == 0) goto L_0x0024
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ RuntimeException -> 0x0019 }
            goto L_0x001a
        L_0x0019:
            r1 = r2
        L_0x001a:
            if (r1 == 0) goto L_0x0024
            p.a.a.g$a r1 = new p.a.a.g$a
            java.lang.String r3 = "EventBus"
            r1.<init>(r3)
            goto L_0x0029
        L_0x0024:
            p.a.a.g$b r1 = new p.a.a.g$b
            r1.<init>()
        L_0x0029:
            r5.f10517p = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r5.a = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r5.f10506b = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r5.c = r1
            boolean r1 = p.a.a.g.a.a
            if (r1 == 0) goto L_0x0053
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ RuntimeException -> 0x0049 }
            goto L_0x004a
        L_0x0049:
            r1 = r2
        L_0x004a:
            if (r1 != 0) goto L_0x004d
            goto L_0x0053
        L_0x004d:
            p.a.a.h$a r3 = new p.a.a.h$a
            r3.<init>(r1)
            goto L_0x0054
        L_0x0053:
            r3 = r2
        L_0x0054:
            r5.f10507e = r3
            if (r3 == 0) goto L_0x0062
            p.a.a.f r1 = new p.a.a.f
            android.os.Looper r3 = r3.a
            r4 = 10
            r1.<init>(r5, r3, r4)
            goto L_0x0063
        L_0x0062:
            r1 = r2
        L_0x0063:
            r5.f = r1
            p.a.a.b r1 = new p.a.a.b
            r1.<init>(r5)
            r5.f10508g = r1
            p.a.a.a r1 = new p.a.a.a
            r1.<init>(r5)
            r5.f10509h = r1
            r1 = 0
            p.a.a.p r3 = new p.a.a.p
            r3.<init>(r2, r1, r1)
            r5.f10510i = r3
            r1 = 1
            r5.f10512k = r1
            r5.f10513l = r1
            r5.f10514m = r1
            r5.f10515n = r1
            r5.f10516o = r1
            java.util.concurrent.ExecutorService r0 = r0.a
            r5.f10511j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a.a.c.<init>():void");
    }

    public static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public static c b() {
        if (f10505q == null) {
            synchronized (c.class) {
                if (f10505q == null) {
                    f10505q = new c();
                }
            }
        }
        return f10505q;
    }

    public void c(j jVar) {
        Object obj = jVar.a;
        q qVar = jVar.f10524b;
        jVar.a = null;
        jVar.f10524b = null;
        jVar.c = null;
        List<j> list = j.d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(jVar);
            }
        }
        if (qVar.c) {
            d(qVar, obj);
        }
    }

    public void d(q qVar, Object obj) {
        try {
            qVar.f10533b.a.invoke(qVar.a, new Object[]{obj});
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(obj instanceof n)) {
                if (this.f10512k) {
                    g gVar = this.f10517p;
                    Level level = Level.SEVERE;
                    StringBuilder y = b.e.a.a.a.y("Could not dispatch event: ");
                    y.append(obj.getClass());
                    y.append(" to subscribing class ");
                    y.append(qVar.a.getClass());
                    gVar.b(level, y.toString(), cause);
                }
                if (this.f10514m) {
                    g(new n(this, cause, obj, qVar.a));
                }
            } else if (this.f10512k) {
                g gVar2 = this.f10517p;
                Level level2 = Level.SEVERE;
                StringBuilder y2 = b.e.a.a.a.y("SubscriberExceptionEvent subscriber ");
                y2.append(qVar.a.getClass());
                y2.append(" threw an exception");
                gVar2.b(level2, y2.toString(), cause);
                n nVar = (n) obj;
                g gVar3 = this.f10517p;
                StringBuilder y3 = b.e.a.a.a.y("Initial event ");
                y3.append(nVar.f10526b);
                y3.append(" caused exception in ");
                y3.append(nVar.c);
                gVar3.b(level2, y3.toString(), nVar.a);
            }
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException("Unexpected exception", e3);
        }
    }

    public final boolean e() {
        h hVar = this.f10507e;
        return hVar == null || ((h.a) hVar).a == Looper.myLooper();
    }

    public synchronized boolean f(Object obj) {
        return this.f10506b.containsKey(obj);
    }

    public void g(Object obj) {
        b bVar = this.d.get();
        List<Object> list = bVar.a;
        list.add(obj);
        if (!bVar.f10518b) {
            bVar.c = e();
            bVar.f10518b = true;
            while (!list.isEmpty()) {
                try {
                    h(list.remove(0), bVar);
                } finally {
                    bVar.f10518b = false;
                    bVar.c = false;
                }
            }
        }
    }

    public final void h(Object obj, b bVar) {
        boolean z;
        ArrayList arrayList;
        Class<?> cls = obj.getClass();
        if (this.f10516o) {
            Map<Class<?>, List<Class<?>>> map = s;
            synchronized (map) {
                List list = map.get(cls);
                arrayList = list;
                if (list == null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                        arrayList2.add(cls2);
                        a(arrayList2, cls2.getInterfaces());
                    }
                    s.put(cls, arrayList2);
                    arrayList = arrayList2;
                }
            }
            int size = arrayList.size();
            z = false;
            for (int i2 = 0; i2 < size; i2++) {
                z |= i(obj, bVar, (Class) arrayList.get(i2));
            }
        } else {
            z = i(obj, bVar, cls);
        }
        if (!z) {
            if (this.f10513l) {
                this.f10517p.a(Level.FINE, "No subscribers registered for event " + cls);
            }
            if (this.f10515n && cls != i.class && cls != n.class) {
                g(new i(this, obj));
            }
        }
    }

    public final boolean i(Object obj, b bVar, Class<?> cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            bVar.d = obj;
            j(qVar, obj, bVar.c);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r5 != null) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(p.a.a.q r3, java.lang.Object r4, boolean r5) {
        /*
            r2 = this;
            p.a.a.o r0 = r3.f10533b
            org.greenrobot.eventbus.ThreadMode r0 = r0.f10527b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0049
            r1 = 1
            if (r0 == r1) goto L_0x0040
            r1 = 2
            if (r0 == r1) goto L_0x003b
            r1 = 3
            if (r0 == r1) goto L_0x0033
            r5 = 4
            if (r0 != r5) goto L_0x001c
            p.a.a.a r5 = r2.f10509h
            r5.a(r3, r4)
            goto L_0x004c
        L_0x001c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Unknown thread mode: "
            java.lang.StringBuilder r5 = b.e.a.a.a.y(r5)
            p.a.a.o r3 = r3.f10533b
            org.greenrobot.eventbus.ThreadMode r3 = r3.f10527b
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x0033:
            if (r5 == 0) goto L_0x0049
            p.a.a.b r5 = r2.f10508g
            r5.a(r3, r4)
            goto L_0x004c
        L_0x003b:
            p.a.a.l r5 = r2.f
            if (r5 == 0) goto L_0x0049
            goto L_0x0045
        L_0x0040:
            if (r5 == 0) goto L_0x0043
            goto L_0x0049
        L_0x0043:
            p.a.a.l r5 = r2.f
        L_0x0045:
            r5.a(r3, r4)
            goto L_0x004c
        L_0x0049:
            r2.d(r3, r4)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a.a.c.j(p.a.a.q, java.lang.Object, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r2.f10531e == r5.b()) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Class r0 = r12.getClass()
            p.a.a.p r1 = r11.f10510i
            java.util.Objects.requireNonNull(r1)
            java.util.Map<java.lang.Class<?>, java.util.List<p.a.a.o>> r2 = p.a.a.p.a
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0014
            goto L_0x0077
        L_0x0014:
            p.a.a.p$a r2 = r1.c()
            r2.f10531e = r0
            r3 = 0
            r2.f = r3
            r4 = 0
            r2.f10532g = r4
        L_0x0020:
            java.lang.Class<?> r5 = r2.f10531e
            if (r5 == 0) goto L_0x0065
            p.a.a.r.a r5 = r2.f10532g
            if (r5 == 0) goto L_0x003d
            p.a.a.r.a r5 = r5.c()
            if (r5 == 0) goto L_0x003d
            p.a.a.r.a r5 = r2.f10532g
            p.a.a.r.a r5 = r5.c()
            java.lang.Class<?> r6 = r2.f10531e
            java.lang.Class r7 = r5.b()
            if (r6 != r7) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r5 = r4
        L_0x003e:
            r2.f10532g = r5
            if (r5 == 0) goto L_0x005e
            p.a.a.o[] r5 = r5.a()
            int r6 = r5.length
            r7 = r3
        L_0x0048:
            if (r7 >= r6) goto L_0x0061
            r8 = r5[r7]
            java.lang.reflect.Method r9 = r8.a
            java.lang.Class<?> r10 = r8.c
            boolean r9 = r2.a(r9, r10)
            if (r9 == 0) goto L_0x005b
            java.util.List<p.a.a.o> r9 = r2.a
            r9.add(r8)
        L_0x005b:
            int r7 = r7 + 1
            goto L_0x0048
        L_0x005e:
            r1.a(r2)
        L_0x0061:
            r2.c()
            goto L_0x0020
        L_0x0065:
            java.util.List r2 = r1.b(r2)
            r1 = r2
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0091
            java.util.Map<java.lang.Class<?>, java.util.List<p.a.a.o>> r1 = p.a.a.p.a
            r1.put(r0, r2)
        L_0x0077:
            monitor-enter(r11)
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x008e }
        L_0x007c:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x008e }
            p.a.a.o r1 = (p.a.a.o) r1     // Catch:{ all -> 0x008e }
            r11.l(r12, r1)     // Catch:{ all -> 0x008e }
            goto L_0x007c
        L_0x008c:
            monitor-exit(r11)     // Catch:{ all -> 0x008e }
            return
        L_0x008e:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x008e }
            throw r12
        L_0x0091:
            p.a.a.e r12 = new p.a.a.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Subscriber "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " and its super classes have no public methods with the @Subscribe annotation"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a.a.c.k(java.lang.Object):void");
    }

    public final void l(Object obj, o oVar) {
        Object value;
        Class<?> cls = oVar.c;
        q qVar = new q(obj, oVar);
        CopyOnWriteArrayList copyOnWriteArrayList = this.a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(qVar)) {
            StringBuilder y = b.e.a.a.a.y("Subscriber ");
            y.append(obj.getClass());
            y.append(" already registered to event ");
            y.append(cls);
            throw new e(y.toString());
        }
        int size = copyOnWriteArrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 > size) {
                break;
            } else if (i2 == size || oVar.d > ((q) copyOnWriteArrayList.get(i2)).f10533b.d) {
                copyOnWriteArrayList.add(i2, qVar);
            } else {
                i2++;
            }
        }
        copyOnWriteArrayList.add(i2, qVar);
        List list = this.f10506b.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.f10506b.put(obj, list);
        }
        list.add(cls);
        if (!oVar.f10528e) {
            return;
        }
        if (this.f10516o) {
            for (Map.Entry next : this.c.entrySet()) {
                if (cls.isAssignableFrom((Class) next.getKey()) && (value = next.getValue()) != null) {
                    j(qVar, value, e());
                }
            }
            return;
        }
        Object obj2 = this.c.get(cls);
        if (obj2 != null) {
            j(qVar, obj2, e());
        }
    }

    public synchronized void m(Object obj) {
        List<Class> list = this.f10506b.get(obj);
        if (list != null) {
            for (Class cls : list) {
                List list2 = this.a.get(cls);
                if (list2 != null) {
                    int size = list2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        q qVar = (q) list2.get(i2);
                        if (qVar.a == obj) {
                            qVar.c = false;
                            list2.remove(i2);
                            i2--;
                            size--;
                        }
                        i2++;
                    }
                }
            }
            this.f10506b.remove(obj);
        } else {
            this.f10517p.a(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public String toString() {
        return b.e.a.a.a.s(b.e.a.a.a.z("EventBus[indexCount=", 0, ", eventInheritance="), this.f10516o, "]");
    }
}
