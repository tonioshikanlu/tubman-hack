package b.h.a.m.v;

import androidx.annotation.NonNull;
import b.e.a.a.a;
import b.h.a.m.m;
import b.h.a.m.t;
import b.h.a.m.u.d;
import b.h.a.m.v.g;
import b.h.a.m.w.n;
import b.h.a.m.w.p;
import b.h.a.s.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class x implements g, d.a<Object> {

    /* renamed from: h  reason: collision with root package name */
    public final g.a f773h;

    /* renamed from: i  reason: collision with root package name */
    public final h<?> f774i;

    /* renamed from: j  reason: collision with root package name */
    public int f775j;

    /* renamed from: k  reason: collision with root package name */
    public int f776k = -1;

    /* renamed from: l  reason: collision with root package name */
    public m f777l;

    /* renamed from: m  reason: collision with root package name */
    public List<n<File, ?>> f778m;

    /* renamed from: n  reason: collision with root package name */
    public int f779n;

    /* renamed from: o  reason: collision with root package name */
    public volatile n.a<?> f780o;

    /* renamed from: p  reason: collision with root package name */
    public File f781p;

    /* renamed from: q  reason: collision with root package name */
    public y f782q;

    public x(h<?> hVar, g.a aVar) {
        this.f774i = hVar;
        this.f773h = aVar;
    }

    public boolean a() {
        List list;
        List<Class<?>> d;
        List<m> a = this.f774i.a();
        if (a.isEmpty()) {
            return false;
        }
        h<?> hVar = this.f774i;
        b.h.a.g gVar = hVar.c.f487b;
        Class<?> cls = hVar.d.getClass();
        Class<?> cls2 = hVar.f680g;
        Class<Transcode> cls3 = hVar.f684k;
        b.h.a.p.d dVar = gVar.f501h;
        i andSet = dVar.a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new i(cls, cls2, cls3);
        } else {
            andSet.a = cls;
            andSet.f1017b = cls2;
            andSet.c = cls3;
        }
        synchronized (dVar.f956b) {
            list = dVar.f956b.get(andSet);
        }
        dVar.a.set(andSet);
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            p pVar = gVar.a;
            synchronized (pVar) {
                d = pVar.a.d(cls);
            }
            Iterator it = ((ArrayList) d).iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) gVar.c.b((Class) it.next(), cls2)).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!((ArrayList) gVar.f.a(cls4, cls3)).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            b.h.a.p.d dVar2 = gVar.f501h;
            List unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (dVar2.f956b) {
                dVar2.f956b.put(new i(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            while (true) {
                List<n<File, ?>> list2 = this.f778m;
                if (list2 != null) {
                    if (this.f779n < list2.size()) {
                        this.f780o = null;
                        boolean z = false;
                        while (!z) {
                            if (!(this.f779n < this.f778m.size())) {
                                break;
                            }
                            List<n<File, ?>> list3 = this.f778m;
                            int i2 = this.f779n;
                            this.f779n = i2 + 1;
                            File file = this.f781p;
                            h<?> hVar2 = this.f774i;
                            this.f780o = list3.get(i2).a(file, hVar2.f679e, hVar2.f, hVar2.f682i);
                            if (this.f780o != null && this.f774i.g(this.f780o.c.a())) {
                                this.f780o.c.f(this.f774i.f688o, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                }
                int i3 = this.f776k + 1;
                this.f776k = i3;
                if (i3 >= arrayList.size()) {
                    int i4 = this.f775j + 1;
                    this.f775j = i4;
                    if (i4 >= a.size()) {
                        return false;
                    }
                    this.f776k = 0;
                }
                m mVar = a.get(this.f775j);
                Class cls5 = (Class) arrayList.get(this.f776k);
                t<Z> f = this.f774i.f(cls5);
                h<?> hVar3 = this.f774i;
                this.f782q = new y(hVar3.c.a, mVar, hVar3.f687n, hVar3.f679e, hVar3.f, f, cls5, hVar3.f682i);
                File b2 = hVar3.b().b(this.f782q);
                this.f781p = b2;
                if (b2 != null) {
                    this.f777l = mVar;
                    this.f778m = this.f774i.c.f487b.f(b2);
                    this.f779n = 0;
                }
            }
        } else if (File.class.equals(this.f774i.f684k)) {
            return false;
        } else {
            StringBuilder y = a.y("Failed to find any load path from ");
            y.append(this.f774i.d.getClass());
            y.append(" to ");
            y.append(this.f774i.f684k);
            throw new IllegalStateException(y.toString());
        }
    }

    public void c(@NonNull Exception exc) {
        this.f773h.e(this.f782q, exc, this.f780o.c, b.h.a.m.a.RESOURCE_DISK_CACHE);
    }

    public void cancel() {
        n.a<?> aVar = this.f780o;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    public void d(Object obj) {
        this.f773h.h(this.f777l, obj, this.f780o.c, b.h.a.m.a.RESOURCE_DISK_CACHE, this.f782q);
    }
}
