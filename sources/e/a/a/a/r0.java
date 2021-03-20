package e.a.a.a;

import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.i.c;
import e.a.a.a.y0.m.d0;
import e.t.g;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.List;

public final class r0 {
    public static final c a = c.a;

    /* renamed from: b  reason: collision with root package name */
    public static final r0 f7577b = null;

    public static final class a extends k implements l<w0, CharSequence> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f7578h = new a();

        public a() {
            super(1);
        }

        public Object invoke(Object obj) {
            w0 w0Var = (w0) obj;
            r0 r0Var = r0.f7577b;
            i.d(w0Var, "it");
            d0 d = w0Var.d();
            i.d(d, "it.type");
            return r0.e(d);
        }
    }

    public static final void a(StringBuilder sb, i0 i0Var) {
        if (i0Var != null) {
            d0 d = i0Var.d();
            i.d(d, "receiver.type");
            sb.append(e(d));
            sb.append(".");
        }
    }

    public static final void b(StringBuilder sb, e.a.a.a.y0.b.a aVar) {
        i0 g2 = v0.g(aVar);
        i0 U = aVar.U();
        a(sb, g2);
        boolean z = (g2 == null || U == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        a(sb, U);
        if (z) {
            sb.append(")");
        }
    }

    public static final String c(s sVar) {
        i.e(sVar, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        b(sb, sVar);
        c cVar = a;
        d name = sVar.getName();
        i.d(name, "descriptor.name");
        sb.append(cVar.v(name, true));
        List<w0> n2 = sVar.n();
        i.d(n2, "descriptor.valueParameters");
        g.v(n2, sb, ", ", "(", ")", 0, (CharSequence) null, a.f7578h, 48);
        sb.append(": ");
        d0 f = sVar.f();
        i.c(f);
        i.d(f, "descriptor.returnType!!");
        sb.append(e(f));
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final String d(f0 f0Var) {
        i.e(f0Var, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(f0Var.Q() ? "var " : "val ");
        b(sb, f0Var);
        c cVar = a;
        d name = f0Var.getName();
        i.d(name, "descriptor.name");
        sb.append(cVar.v(name, true));
        sb.append(": ");
        d0 d = f0Var.d();
        i.d(d, "descriptor.type");
        sb.append(e(d));
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final String e(d0 d0Var) {
        i.e(d0Var, "type");
        return a.w(d0Var);
    }
}
