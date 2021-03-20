package b.l.d.p;

import b.l.d.t.c;
import b.l.d.w.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class d0 extends a {
    public final Set<Class<?>> a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Class<?>> f5034b;
    public final Set<Class<?>> c;
    public final Set<Class<?>> d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<Class<?>> f5035e;
    public final e f;

    public static class a implements c {
        public final c a;

        public a(Set<Class<?>> set, c cVar) {
            this.a = cVar;
        }
    }

    public d0(d<?> dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r next : dVar.f5030b) {
            int i2 = next.c;
            boolean z = true;
            if (!(i2 == 0)) {
                if (i2 != 2 ? false : z) {
                    hashSet3.add(next.a);
                } else if (next.a()) {
                    hashSet5.add(next.a);
                } else {
                    hashSet2.add(next.a);
                }
            } else if (next.a()) {
                hashSet4.add(next.a);
            } else {
                hashSet.add(next.a);
            }
        }
        if (!dVar.f.isEmpty()) {
            hashSet.add(c.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.f5034b = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.c = Collections.unmodifiableSet(hashSet4);
        this.d = Collections.unmodifiableSet(hashSet5);
        this.f5035e = dVar.f;
        this.f = eVar;
    }

    public <T> T a(Class<T> cls) {
        if (this.a.contains(cls)) {
            T a2 = this.f.a(cls);
            return !cls.equals(c.class) ? a2 : new a(this.f5035e, (c) a2);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public <T> Set<T> b(Class<T> cls) {
        if (this.c.contains(cls)) {
            return this.f.b(cls);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    public <T> b<T> c(Class<T> cls) {
        if (this.f5034b.contains(cls)) {
            return this.f.c(cls);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public <T> b<Set<T>> d(Class<T> cls) {
        if (this.d.contains(cls)) {
            return this.f.d(cls);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }
}
