package n.m0.h;

import e.c0.h;
import e.t.g;
import e.x.c.i;
import java.util.List;
import java.util.Objects;
import n.a0;
import n.b0;
import n.e0;
import n.g0;
import n.h0;
import n.j0;
import n.m0.c;
import n.o;
import n.q;
import n.y;
import o.m;

public final class a implements a0 {
    public final q a;

    public a(q qVar) {
        i.e(qVar, "cookieJar");
        this.a = qVar;
    }

    public h0 a(a0.a aVar) {
        boolean z;
        j0 j0Var;
        a0.a aVar2 = aVar;
        i.e(aVar2, "chain");
        g gVar = (g) aVar2;
        e0 e0Var = gVar.f;
        Objects.requireNonNull(e0Var);
        e0.a aVar3 = new e0.a(e0Var);
        g0 g0Var = e0Var.f10093e;
        if (g0Var != null) {
            b0 b2 = g0Var.b();
            if (b2 != null) {
                aVar3.c("Content-Type", b2.a);
            }
            long a2 = g0Var.a();
            if (a2 != -1) {
                aVar3.c("Content-Length", String.valueOf(a2));
                aVar3.f("Transfer-Encoding");
            } else {
                aVar3.c("Transfer-Encoding", "chunked");
                aVar3.f("Content-Length");
            }
        }
        int i2 = 0;
        if (e0Var.b("Host") == null) {
            aVar3.c("Host", c.x(e0Var.f10092b, false));
        }
        if (e0Var.b("Connection") == null) {
            aVar3.c("Connection", "Keep-Alive");
        }
        if (e0Var.b("Accept-Encoding") == null && e0Var.b("Range") == null) {
            aVar3.c("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        List<o> a3 = this.a.a(e0Var.f10092b);
        if (!a3.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (T next : a3) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    o oVar = (o) next;
                    if (i2 > 0) {
                        sb.append("; ");
                    }
                    sb.append(oVar.a);
                    sb.append('=');
                    sb.append(oVar.f10415b);
                    i2 = i3;
                } else {
                    g.S();
                    throw null;
                }
            }
            String sb2 = sb.toString();
            i.d(sb2, "StringBuilder().apply(builderAction).toString()");
            aVar3.c("Cookie", sb2);
        }
        if (e0Var.b("User-Agent") == null) {
            aVar3.c("User-Agent", "okhttp/4.9.0");
        }
        h0 c = gVar.c(aVar3.b());
        e.d(this.a, e0Var.f10092b, c.f10105m);
        h0.a aVar4 = new h0.a(c);
        aVar4.g(e0Var);
        if (z && h.f("gzip", h0.b(c, "Content-Encoding", (String) null, 2), true) && e.a(c) && (j0Var = c.f10106n) != null) {
            m mVar = new m(j0Var.q());
            y.a n2 = c.f10105m.n();
            n2.c("Content-Encoding");
            n2.c("Content-Length");
            aVar4.d(n2.b());
            aVar4.f10112g = new h(h0.b(c, "Content-Type", (String) null, 2), -1, e.a.a.a.y0.m.o1.c.m(mVar));
        }
        return aVar4.a();
    }
}
