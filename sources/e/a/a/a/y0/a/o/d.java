package e.a.a.a.y0.a.o;

import androidx.exifinterface.media.ExifInterface;
import b.q.a.a;
import e.a.a.a.y0.a.f;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.c1.i0;
import e.a.a.a.y0.b.c1.n0;
import e.a.a.a.y0.b.c1.r;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.v;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.b.y0;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.d1;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.n.l;
import e.t.g;
import e.t.o;
import e.t.r;
import e.t.s;
import e.t.t;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class d extends i0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(k kVar, d dVar, b.a aVar, boolean z) {
        super(kVar, dVar, h.a.a, l.f9788g, aVar, m0.a);
        Objects.requireNonNull(h.f7785e);
        this.s = true;
        this.B = z;
        this.C = false;
    }

    public static final d g1(b bVar, boolean z) {
        String str;
        b bVar2 = bVar;
        i.e(bVar2, "functionClass");
        List<r0> list = bVar2.f7695n;
        d dVar = new d(bVar2, (d) null, b.a.DECLARATION, z);
        e.a.a.a.y0.b.i0 U0 = bVar.U0();
        o oVar = o.f7934h;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((r0) next).u() != j1.IN_VARIANCE) {
                z2 = false;
            }
            if (!z2) {
                break;
            }
            arrayList.add(next);
        }
        Iterable e0 = g.e0(arrayList);
        ArrayList arrayList2 = new ArrayList(a.C(e0, 10));
        Iterator it2 = ((s) e0).iterator();
        while (true) {
            t tVar = (t) it2;
            if (tVar.hasNext()) {
                r rVar = (r) tVar.next();
                int i2 = rVar.a;
                r0 r0Var = (r0) rVar.f7937b;
                String e2 = r0Var.getName().e();
                i.d(e2, "typeParameter.name.asString()");
                int hashCode = e2.hashCode();
                if (hashCode != 69) {
                    if (hashCode == 84 && e2.equals(ExifInterface.GPS_DIRECTION_TRUE)) {
                        str = "instance";
                        Objects.requireNonNull(h.f7785e);
                        h hVar = h.a.a;
                        e.a.a.a.y0.f.d l2 = e.a.a.a.y0.f.d.l(str);
                        i.d(l2, "Name.identifier(name)");
                        k0 s = r0Var.s();
                        i.d(s, "typeParameter.defaultType");
                        m0 m0Var = m0.a;
                        i.d(m0Var, "SourceElement.NO_SOURCE");
                        n0 n0Var = r2;
                        o oVar2 = oVar;
                        ArrayList arrayList3 = arrayList2;
                        n0 n0Var2 = new n0(dVar, (w0) null, i2, hVar, l2, s, false, false, false, (d0) null, m0Var);
                        arrayList3.add(n0Var);
                        arrayList2 = arrayList3;
                        oVar = oVar2;
                    }
                } else if (e2.equals(ExifInterface.LONGITUDE_EAST)) {
                    str = "receiver";
                    Objects.requireNonNull(h.f7785e);
                    h hVar2 = h.a.a;
                    e.a.a.a.y0.f.d l22 = e.a.a.a.y0.f.d.l(str);
                    i.d(l22, "Name.identifier(name)");
                    k0 s2 = r0Var.s();
                    i.d(s2, "typeParameter.defaultType");
                    m0 m0Var2 = m0.a;
                    i.d(m0Var2, "SourceElement.NO_SOURCE");
                    n0 n0Var3 = n0Var2;
                    o oVar22 = oVar;
                    ArrayList arrayList32 = arrayList2;
                    n0 n0Var22 = new n0(dVar, (w0) null, i2, hVar2, l22, s2, false, false, false, (d0) null, m0Var2);
                    arrayList32.add(n0Var3);
                    arrayList2 = arrayList32;
                    oVar = oVar22;
                }
                str = e2.toLowerCase();
                i.d(str, "(this as java.lang.String).toLowerCase()");
                Objects.requireNonNull(h.f7785e);
                h hVar22 = h.a.a;
                e.a.a.a.y0.f.d l222 = e.a.a.a.y0.f.d.l(str);
                i.d(l222, "Name.identifier(name)");
                k0 s22 = r0Var.s();
                i.d(s22, "typeParameter.defaultType");
                m0 m0Var22 = m0.a;
                i.d(m0Var22, "SourceElement.NO_SOURCE");
                n0 n0Var32 = n0Var22;
                o oVar222 = oVar;
                ArrayList arrayList322 = arrayList2;
                n0 n0Var222 = new n0(dVar, (w0) null, i2, hVar22, l222, s22, false, false, false, (d0) null, m0Var22);
                arrayList322.add(n0Var32);
                arrayList2 = arrayList322;
                oVar = oVar222;
            } else {
                dVar.V0((e.a.a.a.y0.b.i0) null, U0, oVar, arrayList2, ((r0) g.z(list)).s(), v.ABSTRACT, y0.f7850e);
                dVar.D = true;
                return dVar;
            }
        }
    }

    public boolean J() {
        return false;
    }

    public e.a.a.a.y0.b.c1.r K0(k kVar, e.a.a.a.y0.b.s sVar, b.a aVar, e.a.a.a.y0.f.d dVar, h hVar, m0 m0Var) {
        i.e(kVar, "newOwner");
        i.e(aVar, "kind");
        i.e(hVar, "annotations");
        i.e(m0Var, "source");
        return new d(kVar, (d) sVar, aVar, this.B);
    }

    public e.a.a.a.y0.b.s P0(r.c cVar) {
        boolean z;
        boolean z2;
        e.a.a.a.y0.f.d dVar;
        boolean z3;
        i.e(cVar, "configuration");
        d dVar2 = (d) super.P0(cVar);
        if (dVar2 == null) {
            return null;
        }
        List<w0> n2 = dVar2.n();
        i.d(n2, "substituted.valueParameters");
        boolean z4 = false;
        if (!n2.isEmpty()) {
            Iterator<T> it = n2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                w0 w0Var = (w0) it.next();
                i.d(w0Var, "it");
                d0 d = w0Var.d();
                i.d(d, "it.type");
                if (f.b(d) != null) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return dVar2;
        }
        List<w0> n3 = dVar2.n();
        i.d(n3, "substituted.valueParameters");
        ArrayList arrayList = new ArrayList(a.C(n3, 10));
        for (w0 w0Var2 : n3) {
            i.d(w0Var2, "it");
            d0 d2 = w0Var2.d();
            i.d(d2, "it.type");
            arrayList.add(f.b(d2));
        }
        int size = dVar2.n().size() - arrayList.size();
        List<w0> n4 = dVar2.n();
        i.d(n4, "valueParameters");
        ArrayList arrayList2 = new ArrayList(a.C(n4, 10));
        for (w0 w0Var3 : n4) {
            i.d(w0Var3, "it");
            e.a.a.a.y0.f.d name = w0Var3.getName();
            i.d(name, "it.name");
            int h2 = w0Var3.h();
            int i2 = h2 - size;
            if (i2 >= 0 && (dVar = (e.a.a.a.y0.f.d) arrayList.get(i2)) != null) {
                name = dVar;
            }
            arrayList2.add(w0Var3.M0(dVar2, name, h2));
        }
        r.c W0 = dVar2.W0(d1.f9651b);
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((e.a.a.a.y0.f.d) it2.next()) == null) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        z4 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        W0.u = Boolean.valueOf(z4);
        W0.f8252g = arrayList2;
        W0.f8251e = dVar2.j0();
        i.d(W0, "newCopyBuilder(TypeSubst…   .setOriginal(original)");
        e.a.a.a.y0.b.s P0 = super.P0(W0);
        i.c(P0);
        return P0;
    }

    public boolean l() {
        return false;
    }

    public boolean t0() {
        return false;
    }
}
