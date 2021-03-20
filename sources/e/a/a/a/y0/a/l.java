package e.a.a.a.y0.a;

import androidx.exifinterface.media.ExifInterface;
import b.q.a.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.c1.b0;
import e.a.a.a.y0.b.c1.o;
import e.a.a.a.y0.b.f;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.v;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.y0;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.j.g;
import e.a.a.a.y0.l.e;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.m.j1;
import e.x.c.i;
import java.util.Objects;

public final class l {
    public static final b0 a;

    /* renamed from: b  reason: collision with root package name */
    public static final b0 f7684b;

    static {
        w i2 = e.a.a.a.y0.m.w.i();
        i.d(i2, "ErrorUtils.getErrorModule()");
        b bVar = g.d;
        i.d(bVar, "DescriptorUtils.COROUTIN…KAGE_FQ_NAME_EXPERIMENTAL");
        o oVar = new o(i2, bVar);
        f fVar = f.INTERFACE;
        d g2 = g.f9380e.g();
        m0 m0Var = m0.a;
        m mVar = e.f9624e;
        b0 b0Var = new b0(oVar, fVar, false, false, g2, m0Var, mVar);
        v vVar = v.ABSTRACT;
        b0Var.f8172q = vVar;
        z0 z0Var = y0.f7850e;
        if (z0Var != null) {
            b0Var.r = z0Var;
            Objects.requireNonNull(h.f7785e);
            h hVar = h.a.a;
            j1 j1Var = j1.IN_VARIANCE;
            b0Var.P0(a.l2(e.a.a.a.y0.b.c1.m0.W0(b0Var, hVar, false, j1Var, d.l(ExifInterface.GPS_DIRECTION_TRUE), 0, mVar)));
            b0Var.K0();
            a = b0Var;
            w i3 = e.a.a.a.y0.m.w.i();
            i.d(i3, "ErrorUtils.getErrorModule()");
            b bVar2 = g.c;
            i.d(bVar2, "DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE");
            o oVar2 = new o(i3, bVar2);
            b0 b0Var2 = new b0(oVar2, fVar, false, false, g.f.g(), m0Var, mVar);
            b0Var2.f8172q = vVar;
            b0Var2.r = z0Var;
            b0Var2.P0(a.l2(e.a.a.a.y0.b.c1.m0.W0(b0Var2, hVar, false, j1Var, d.l(ExifInterface.GPS_DIRECTION_TRUE), 0, mVar)));
            b0Var2.K0();
            f7684b = b0Var2;
            return;
        }
        b0.j0(9);
        throw null;
    }

    public static final boolean a(b bVar, boolean z) {
        return i.a(bVar, z ? g.f : g.f9380e);
    }
}
