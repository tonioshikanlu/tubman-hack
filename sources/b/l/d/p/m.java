package b.l.d.p;

import android.util.Log;
import b.l.d.t.c;
import b.l.d.t.d;
import b.l.d.w.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public class m extends a implements b.l.d.r.a {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f5041g = 0;
    public final Map<d<?>, b<?>> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, b<?>> f5042b = new HashMap();
    public final Map<Class<?>, y<?>> c = new HashMap();
    public final List<b<h>> d;

    /* renamed from: e  reason: collision with root package name */
    public final v f5043e;
    public final AtomicReference<Boolean> f = new AtomicReference<>();

    public m(Executor executor, Iterable iterable, Collection collection, a aVar) {
        v vVar = new v(executor);
        this.f5043e = vVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.c(vVar, v.class, d.class, c.class));
        arrayList.add(d.c(this, b.l.d.r.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object add : iterable) {
            arrayList2.add(add);
        }
        this.d = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    h hVar = (h) ((b) it2.next()).get();
                    if (hVar != null) {
                        arrayList.addAll(hVar.getComponents());
                        it2.remove();
                    }
                } catch (w e2) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            if (this.a.isEmpty()) {
                b.l.a.c.b.a.Q(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.a.keySet());
                arrayList4.addAll(arrayList);
                b.l.a.c.b.a.Q(arrayList4);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                d dVar2 = (d) it3.next();
                this.a.put(dVar2, new x(new i(this, dVar2)));
            }
            arrayList3.addAll(g(arrayList));
            arrayList3.addAll(h());
            f();
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        Boolean bool = this.f.get();
        if (bool != null) {
            e(this.a, bool.booleanValue());
        }
    }

    public synchronized <T> b<T> c(Class<T> cls) {
        Objects.requireNonNull(cls, "Null interface requested.");
        return this.f5042b.get(cls);
    }

    public synchronized <T> b<Set<T>> d(Class<T> cls) {
        y yVar = this.c.get(cls);
        if (yVar != null) {
            return yVar;
        }
        return l.a;
    }

    public final void e(Map<d<?>, b<?>> map, boolean z) {
        Queue<b.l.d.t.a<?>> queue;
        Set<Map.Entry> emptySet;
        for (Map.Entry next : map.entrySet()) {
            b bVar = (b) next.getValue();
            int i2 = ((d) next.getKey()).c;
            boolean z2 = false;
            if (!(i2 == 1)) {
                if (i2 == 2) {
                    z2 = true;
                }
                if (z2) {
                    if (!z) {
                    }
                }
            }
            bVar.get();
        }
        v vVar = this.f5043e;
        synchronized (vVar) {
            queue = vVar.f5050b;
            if (queue != null) {
                vVar.f5050b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (b.l.d.t.a aVar : queue) {
                Objects.requireNonNull(aVar);
                synchronized (vVar) {
                    Queue<b.l.d.t.a<?>> queue2 = vVar.f5050b;
                    if (queue2 != null) {
                        queue2.add(aVar);
                    } else {
                        synchronized (vVar) {
                            Map map2 = vVar.a.get((Object) null);
                            emptySet = map2 == null ? Collections.emptySet() : map2.entrySet();
                        }
                        for (Map.Entry entry : emptySet) {
                            ((Executor) entry.getValue()).execute(new u(entry, aVar));
                        }
                    }
                }
            }
        }
    }

    public final void f() {
        for (d next : this.a.keySet()) {
            Iterator<r> it = next.f5030b.iterator();
            while (true) {
                if (it.hasNext()) {
                    r next2 = it.next();
                    if (next2.a() && !this.c.containsKey(next2.a)) {
                        this.c.put(next2.a, new y(Collections.emptySet()));
                    } else if (this.f5042b.containsKey(next2.a)) {
                        continue;
                    } else {
                        if (next2.f5046b == 1) {
                            throw new z(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.a}));
                        } else if (!next2.a()) {
                            this.f5042b.put(next2.a, new c0(a0.a, b0.a));
                        }
                    }
                }
            }
        }
    }

    public final List<Runnable> g(List<d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (d next : list) {
            if (next.b()) {
                b bVar = this.a.get(next);
                for (Class next2 : next.a) {
                    if (!this.f5042b.containsKey(next2)) {
                        this.f5042b.put(next2, bVar);
                    } else {
                        arrayList.add(new j((c0) this.f5042b.get(next2), bVar));
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<Runnable> h() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.a.entrySet()) {
            d dVar = (d) next.getKey();
            if (!dVar.b()) {
                b bVar = (b) next.getValue();
                for (Class next2 : dVar.a) {
                    if (!hashMap.containsKey(next2)) {
                        hashMap.put(next2, new HashSet());
                    }
                    ((Set) hashMap.get(next2)).add(bVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.c.containsKey(entry.getKey())) {
                this.c.put((Class) entry.getKey(), new y((Set) ((Collection) entry.getValue())));
            } else {
                y yVar = this.c.get(entry.getKey());
                for (b kVar : (Set) entry.getValue()) {
                    arrayList.add(new k(yVar, kVar));
                }
            }
        }
        return arrayList;
    }
}
