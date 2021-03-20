package b.h.a.m.v;

import b.h.a.e;
import b.h.a.f;
import b.h.a.g;
import b.h.a.m.d;
import b.h.a.m.m;
import b.h.a.m.p;
import b.h.a.m.t;
import b.h.a.m.v.d0.a;
import b.h.a.m.v.i;
import b.h.a.m.v.l;
import b.h.a.m.w.n;
import b.h.a.m.x.b;
import b.h.a.m.x.h.f;
import b.h.a.p.a;
import b.h.a.p.c;
import b.h.a.p.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class h<Transcode> {
    public final List<n.a<?>> a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<m> f678b = new ArrayList();
    public e c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public int f679e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public Class<?> f680g;

    /* renamed from: h  reason: collision with root package name */
    public i.d f681h;

    /* renamed from: i  reason: collision with root package name */
    public p f682i;

    /* renamed from: j  reason: collision with root package name */
    public Map<Class<?>, t<?>> f683j;

    /* renamed from: k  reason: collision with root package name */
    public Class<Transcode> f684k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f685l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f686m;

    /* renamed from: n  reason: collision with root package name */
    public m f687n;

    /* renamed from: o  reason: collision with root package name */
    public f f688o;

    /* renamed from: p  reason: collision with root package name */
    public k f689p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f690q;
    public boolean r;

    public List<m> a() {
        if (!this.f686m) {
            this.f686m = true;
            this.f678b.clear();
            List<n.a<?>> c2 = c();
            int size = c2.size();
            for (int i2 = 0; i2 < size; i2++) {
                n.a aVar = c2.get(i2);
                if (!this.f678b.contains(aVar.a)) {
                    this.f678b.add(aVar.a);
                }
                for (int i3 = 0; i3 < aVar.f810b.size(); i3++) {
                    if (!this.f678b.contains(aVar.f810b.get(i3))) {
                        this.f678b.add(aVar.f810b.get(i3));
                    }
                }
            }
        }
        return this.f678b;
    }

    public a b() {
        return ((l.c) this.f681h).a();
    }

    public List<n.a<?>> c() {
        if (!this.f685l) {
            this.f685l = true;
            this.a.clear();
            List f2 = this.c.f487b.f(this.d);
            int size = f2.size();
            for (int i2 = 0; i2 < size; i2++) {
                n.a a2 = ((n) f2.get(i2)).a(this.d, this.f679e, this.f, this.f682i);
                if (a2 != null) {
                    this.a.add(a2);
                }
            }
        }
        return this.a;
    }

    public <Data> u<Data, ?, Transcode> d(Class<Data> cls) {
        u<Data, ?, Transcode> uVar;
        ArrayList arrayList;
        b.h.a.m.x.h.e eVar;
        b.h.a.m.x.h.e eVar2;
        Class<Data> cls2 = cls;
        g gVar = this.c.f487b;
        Class<?> cls3 = this.f680g;
        Class<Transcode> cls4 = this.f684k;
        c cVar = gVar.f502i;
        b.h.a.s.i andSet = cVar.f955b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new b.h.a.s.i();
        }
        andSet.a = cls2;
        andSet.f1017b = cls3;
        andSet.c = cls4;
        synchronized (cVar.a) {
            uVar = cVar.a.get(andSet);
        }
        cVar.f955b.set(andSet);
        Objects.requireNonNull(gVar.f502i);
        if (c.c.equals(uVar)) {
            return null;
        }
        if (uVar != null) {
            return uVar;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((ArrayList) gVar.c.b(cls2, cls3)).iterator();
        while (it.hasNext()) {
            Class cls5 = (Class) it.next();
            Iterator it2 = ((ArrayList) gVar.f.a(cls5, cls4)).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls6 = (Class) it2.next();
                    b.h.a.p.e eVar3 = gVar.c;
                    synchronized (eVar3) {
                        arrayList = new ArrayList();
                        for (String str : eVar3.a) {
                            List<e.a> list = eVar3.f957b.get(str);
                            if (list != null) {
                                for (e.a aVar : list) {
                                    if (aVar.a(cls2, cls5)) {
                                        arrayList.add(aVar.c);
                                    }
                                }
                            }
                        }
                    }
                    b.h.a.m.x.h.f fVar = gVar.f;
                    synchronized (fVar) {
                        if (cls6.isAssignableFrom(cls5)) {
                            eVar = b.h.a.m.x.h.g.a;
                        } else {
                            for (f.a next : fVar.a) {
                                if (next.a(cls5, cls6)) {
                                    eVar = next.c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls5 + " to " + cls6);
                        }
                        eVar2 = eVar;
                    }
                    j jVar = r2;
                    j jVar2 = new j(cls, cls5, cls6, arrayList, eVar2, gVar.f503j);
                    arrayList2.add(jVar);
                }
            }
        }
        u<Data, ?, Transcode> uVar2 = arrayList2.isEmpty() ? null : new u<>(cls, cls3, cls4, arrayList2, gVar.f503j);
        c cVar2 = gVar.f502i;
        synchronized (cVar2.a) {
            cVar2.a.put(new b.h.a.s.i(cls2, cls3, cls4), uVar2 != null ? uVar2 : c.c);
        }
        return uVar2;
    }

    public <X> d<X> e(X x) {
        d<T> dVar;
        b.h.a.p.a aVar = this.c.f487b.f498b;
        Class<?> cls = x.getClass();
        synchronized (aVar) {
            Iterator<a.C0037a<?>> it = aVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVar = null;
                    break;
                }
                a.C0037a next = it.next();
                if (next.a.isAssignableFrom(cls)) {
                    dVar = next.f954b;
                    break;
                }
            }
        }
        if (dVar != null) {
            return dVar;
        }
        throw new g.e(x.getClass());
    }

    public <Z> t<Z> f(Class<Z> cls) {
        t<Z> tVar = this.f683j.get(cls);
        if (tVar == null) {
            Iterator<Map.Entry<Class<?>, t<?>>> it = this.f683j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    tVar = (t) next.getValue();
                    break;
                }
            }
        }
        if (tVar != null) {
            return tVar;
        }
        if (!this.f683j.isEmpty() || !this.f690q) {
            return (b) b.f844b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    public boolean g(Class<?> cls) {
        return d(cls) != null;
    }
}
