package b.j.a.c.b0.a0;

import b.j.a.b.i;
import b.j.a.c.g;
import b.j.a.c.g0.k;
import b.j.a.c.g0.m;
import b.j.a.c.g0.o;
import b.j.a.c.l;
import java.util.Objects;

public class p extends d<l> {

    /* renamed from: l  reason: collision with root package name */
    public static final p f1709l = new p();

    public static final class a extends d<b.j.a.c.g0.a> {

        /* renamed from: l  reason: collision with root package name */
        public static final a f1710l = new a();

        public a() {
            super(b.j.a.c.g0.a.class, Boolean.TRUE);
        }

        public Object d(i iVar, g gVar) {
            if (iVar.O0()) {
                return g0(iVar, gVar, gVar.f1993j.u);
            }
            gVar.G(b.j.a.c.g0.a.class, iVar);
            throw null;
        }

        public Object e(i iVar, g gVar, Object obj) {
            b.j.a.c.g0.a aVar = (b.j.a.c.g0.a) obj;
            if (iVar.O0()) {
                j0(iVar, gVar, aVar);
                return aVar;
            }
            gVar.G(b.j.a.c.g0.a.class, iVar);
            throw null;
        }
    }

    public static final class b extends d<o> {

        /* renamed from: l  reason: collision with root package name */
        public static final b f1711l = new b();

        public b() {
            super(o.class, Boolean.TRUE);
        }

        public Object d(i iVar, g gVar) {
            if (iVar.P0()) {
                return h0(iVar, gVar, gVar.f1993j.u);
            }
            if (iVar.L0(b.j.a.b.l.FIELD_NAME)) {
                return i0(iVar, gVar, gVar.f1993j.u);
            }
            if (iVar.L0(b.j.a.b.l.END_OBJECT)) {
                k kVar = gVar.f1993j.u;
                Objects.requireNonNull(kVar);
                return new o(kVar);
            }
            gVar.G(o.class, iVar);
            throw null;
        }

        public Object e(i iVar, g gVar, Object obj) {
            o oVar = (o) obj;
            if (iVar.P0() || iVar.L0(b.j.a.b.l.FIELD_NAME)) {
                return (o) k0(iVar, gVar, oVar);
            }
            gVar.G(o.class, iVar);
            throw null;
        }
    }

    public p() {
        super(l.class, (Boolean) null);
    }

    public /* bridge */ /* synthetic */ Object c(g gVar) {
        return m.f2018h;
    }

    public Object d(i iVar, g gVar) {
        int k0 = iVar.k0();
        if (k0 == 1) {
            return h0(iVar, gVar, gVar.f1993j.u);
        }
        if (k0 != 3) {
            return f0(iVar, gVar, gVar.f1993j.u);
        }
        return g0(iVar, gVar, gVar.f1993j.u);
    }
}
