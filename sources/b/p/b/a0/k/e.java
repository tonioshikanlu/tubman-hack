package b.p.b.a0.k;

import b.l.f.x.a.g;
import b.p.b.a0.i;
import b.p.b.a0.j.d;
import b.p.b.a0.j.k;
import b.p.b.a0.j.l;
import b.p.b.n;
import b.p.b.s;
import b.p.b.t;
import b.p.b.w;
import e.a.a.a.y0.m.o1.c;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.h;
import o.x;
import o.z;

public final class e implements i {

    /* renamed from: e  reason: collision with root package name */
    public static final h f6623e;
    public static final h f;

    /* renamed from: g  reason: collision with root package name */
    public static final h f6624g;

    /* renamed from: h  reason: collision with root package name */
    public static final h f6625h;

    /* renamed from: i  reason: collision with root package name */
    public static final h f6626i;

    /* renamed from: j  reason: collision with root package name */
    public static final h f6627j;

    /* renamed from: k  reason: collision with root package name */
    public static final h f6628k;

    /* renamed from: l  reason: collision with root package name */
    public static final h f6629l;

    /* renamed from: m  reason: collision with root package name */
    public static final List<h> f6630m;

    /* renamed from: n  reason: collision with root package name */
    public static final List<h> f6631n;

    /* renamed from: o  reason: collision with root package name */
    public static final List<h> f6632o;

    /* renamed from: p  reason: collision with root package name */
    public static final List<h> f6633p;
    public final p a;

    /* renamed from: b  reason: collision with root package name */
    public final d f6634b;
    public g c;
    public k d;

    public class a extends o.k {
        public a(z zVar) {
            super(zVar);
        }

        public void close() {
            e eVar = e.this;
            eVar.a.h(eVar);
            this.f10464h.close();
        }
    }

    static {
        h j2 = h.j("connection");
        f6623e = j2;
        h j3 = h.j("host");
        f = j3;
        h j4 = h.j("keep-alive");
        f6624g = j4;
        h j5 = h.j("proxy-connection");
        f6625h = j5;
        h j6 = h.j("transfer-encoding");
        f6626i = j6;
        h j7 = h.j("te");
        f6627j = j7;
        h j8 = h.j("encoding");
        f6628k = j8;
        h j9 = h.j("upgrade");
        f6629l = j9;
        h hVar = l.f6555e;
        h hVar2 = l.f;
        h hVar3 = l.f6556g;
        h hVar4 = l.f6557h;
        h hVar5 = l.f6558i;
        h hVar6 = l.f6559j;
        f6630m = i.i(j2, j3, j4, j5, j6, hVar, hVar2, hVar3, hVar4, hVar5, hVar6);
        f6631n = i.i(j2, j3, j4, j5, j6);
        f6632o = i.i(j2, j3, j4, j5, j7, j6, j8, j9, hVar, hVar2, hVar3, hVar4, hVar5, hVar6);
        f6633p = i.i(j2, j3, j4, j5, j7, j6, j8, j9);
    }

    public e(p pVar, d dVar) {
        this.a = pVar;
        this.f6634b = dVar;
    }

    public void a() {
        ((k.b) this.d.g()).close();
    }

    public x b(t tVar, long j2) {
        return this.d.g();
    }

    public void c(t tVar) {
        ArrayList arrayList;
        int i2;
        k kVar;
        if (this.d == null) {
            this.c.m();
            boolean c2 = this.c.c(tVar);
            if (this.f6634b.f6492h == s.HTTP_2) {
                n nVar = tVar.c;
                arrayList = new ArrayList(nVar.d() + 4);
                arrayList.add(new l(l.f6555e, tVar.f6756b));
                arrayList.add(new l(l.f, g.e0(tVar.a)));
                arrayList.add(new l(l.f6557h, i.g(tVar.a)));
                arrayList.add(new l(l.f6556g, tVar.a.a));
                int d2 = nVar.d();
                for (int i3 = 0; i3 < d2; i3++) {
                    h j2 = h.j(nVar.b(i3).toLowerCase(Locale.US));
                    if (!f6632o.contains(j2)) {
                        arrayList.add(new l(j2, nVar.e(i3)));
                    }
                }
            } else {
                n nVar2 = tVar.c;
                arrayList = new ArrayList(nVar2.d() + 5);
                arrayList.add(new l(l.f6555e, tVar.f6756b));
                arrayList.add(new l(l.f, g.e0(tVar.a)));
                arrayList.add(new l(l.f6559j, "HTTP/1.1"));
                arrayList.add(new l(l.f6558i, i.g(tVar.a)));
                arrayList.add(new l(l.f6556g, tVar.a.a));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int d3 = nVar2.d();
                for (int i4 = 0; i4 < d3; i4++) {
                    h j3 = h.j(nVar2.b(i4).toLowerCase(Locale.US));
                    if (!f6630m.contains(j3)) {
                        String e2 = nVar2.e(i4);
                        if (linkedHashSet.add(j3)) {
                            arrayList.add(new l(j3, e2));
                        } else {
                            int i5 = 0;
                            while (true) {
                                if (i5 >= arrayList.size()) {
                                    break;
                                } else if (((l) arrayList.get(i5)).a.equals(j3)) {
                                    arrayList.set(i5, new l(j3, ((l) arrayList.get(i5)).f6560b.y() + 0 + e2));
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                    }
                }
            }
            d dVar = this.f6634b;
            boolean z = !c2;
            synchronized (dVar.y) {
                synchronized (dVar) {
                    if (!dVar.f6499o) {
                        i2 = dVar.f6498n;
                        dVar.f6498n = i2 + 2;
                        kVar = new k(i2, dVar, z, false, arrayList);
                        if (kVar.i()) {
                            dVar.f6495k.put(Integer.valueOf(i2), kVar);
                            dVar.H(false);
                        }
                    } else {
                        throw new IOException("shutdown");
                    }
                }
                dVar.y.b0(z, false, i2, 0, arrayList);
            }
            if (!c2) {
                dVar.y.flush();
            }
            this.d = kVar;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            kVar.f6541i.g((long) this.c.a.C, timeUnit);
            this.d.f6542j.g((long) this.c.a.D, timeUnit);
        }
    }

    public void d(g gVar) {
        this.c = gVar;
    }

    public void e(l lVar) {
        x g2 = this.d.g();
        o.e eVar = new o.e();
        o.e eVar2 = lVar.f6660j;
        eVar2.z(eVar, 0, eVar2.f10453i);
        ((k.b) g2).j(eVar, eVar.f10453i);
    }

    public w.b f() {
        s sVar = s.HTTP_2;
        String str = null;
        if (this.f6634b.f6492h == sVar) {
            List<l> f2 = this.d.f();
            n.b bVar = new n.b();
            int size = f2.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = f2.get(i2).a;
                String y = f2.get(i2).f6560b.y();
                if (hVar.equals(l.d)) {
                    str = y;
                } else if (!f6633p.contains(hVar)) {
                    bVar.a(hVar.y(), y);
                }
            }
            if (str != null) {
                o a2 = o.a("HTTP/1.1 " + str);
                w.b bVar2 = new w.b();
                bVar2.f6769b = sVar;
                bVar2.c = a2.f6668b;
                bVar2.d = a2.c;
                bVar2.d(bVar.c());
                return bVar2;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        List<l> f3 = this.d.f();
        n.b bVar3 = new n.b();
        int size2 = f3.size();
        String str2 = "HTTP/1.1";
        for (int i3 = 0; i3 < size2; i3++) {
            h hVar2 = f3.get(i3).a;
            String y2 = f3.get(i3).f6560b.y();
            int i4 = 0;
            while (i4 < y2.length()) {
                int indexOf = y2.indexOf(0, i4);
                if (indexOf == -1) {
                    indexOf = y2.length();
                }
                String substring = y2.substring(i4, indexOf);
                if (hVar2.equals(l.d)) {
                    str = substring;
                } else if (hVar2.equals(l.f6559j)) {
                    str2 = substring;
                } else if (!f6631n.contains(hVar2)) {
                    bVar3.a(hVar2.y(), substring);
                }
                i4 = indexOf + 1;
            }
        }
        if (str != null) {
            o a3 = o.a(str2 + " " + str);
            w.b bVar4 = new w.b();
            bVar4.f6769b = s.SPDY_3;
            bVar4.c = a3.f6668b;
            bVar4.d = a3.c;
            bVar4.d(bVar3.c());
            return bVar4;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public b.p.b.x g(w wVar) {
        return new k(wVar.f, c.m(new a(this.d.f6539g)));
    }
}
