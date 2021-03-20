package n.n0;

import androidx.recyclerview.widget.RecyclerView;
import e.a.a.a.y0.m.o1.c;
import e.c0.h;
import e.t.q;
import e.x.c.i;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import n.a0;
import n.b0;
import n.d0;
import n.e0;
import n.g0;
import n.h0;
import n.j0;
import n.l;
import n.m0.h.g;
import n.y;
import o.e;
import o.m;

public final class a implements a0 {
    public volatile Set<String> a;

    /* renamed from: b  reason: collision with root package name */
    public volatile C0238a f10405b;
    public final b c;

    /* renamed from: n.n0.a$a  reason: collision with other inner class name */
    public enum C0238a {
        NONE,
        HEADERS,
        BODY
    }

    public interface b {
        public static final b a = new b();

        void a(String str);
    }

    public a(b bVar, int i2) {
        b bVar2 = (i2 & 1) != 0 ? b.a : null;
        i.e(bVar2, "logger");
        this.c = bVar2;
        this.a = q.f7936h;
        this.f10405b = C0238a.NONE;
    }

    public h0 a(a0.a aVar) {
        String str;
        String str2;
        String str3;
        char c2;
        String str4;
        String str5;
        String str6;
        b bVar;
        Charset charset;
        String str7;
        Throwable th;
        b bVar2;
        String str8;
        String str9;
        StringBuilder sb;
        b bVar3;
        Charset charset2;
        StringBuilder sb2;
        a0.a aVar2 = aVar;
        i.e(aVar2, "chain");
        C0238a aVar3 = this.f10405b;
        g gVar = (g) aVar2;
        e0 e0Var = gVar.f;
        if (aVar3 == C0238a.NONE) {
            return gVar.c(e0Var);
        }
        boolean z = aVar3 == C0238a.BODY;
        boolean z2 = z || aVar3 == C0238a.HEADERS;
        g0 g0Var = e0Var.f10093e;
        l a2 = gVar.a();
        StringBuilder y = b.e.a.a.a.y("--> ");
        y.append(e0Var.c);
        y.append(' ');
        y.append(e0Var.f10092b);
        if (a2 != null) {
            StringBuilder y2 = b.e.a.a.a.y(" ");
            d0 d0Var = ((n.m0.g.i) a2).f10205e;
            i.c(d0Var);
            y2.append(d0Var);
            str = y2.toString();
        } else {
            str = "";
        }
        y.append(str);
        String sb3 = y.toString();
        if (!z2 && g0Var != null) {
            StringBuilder B = b.e.a.a.a.B(sb3, " (");
            B.append(g0Var.a());
            B.append("-byte body)");
            sb3 = B.toString();
        }
        this.c.a(sb3);
        if (z2) {
            y yVar = e0Var.d;
            if (g0Var != null) {
                b0 b2 = g0Var.b();
                if (b2 != null && yVar.d("Content-Type") == null) {
                    this.c.a("Content-Type: " + b2);
                }
                if (g0Var.a() != -1 && yVar.d("Content-Length") == null) {
                    b bVar4 = this.c;
                    StringBuilder y3 = b.e.a.a.a.y("Content-Length: ");
                    y3.append(g0Var.a());
                    bVar4.a(y3.toString());
                }
            }
            int size = yVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                c(yVar, i2);
            }
            if (!z || g0Var == null) {
                bVar3 = this.c;
                sb = b.e.a.a.a.y("--> END ");
                str9 = e0Var.c;
            } else if (b(e0Var.d)) {
                bVar3 = this.c;
                sb = b.e.a.a.a.y("--> END ");
                sb.append(e0Var.c);
                str9 = " (encoded body omitted)";
            } else {
                e eVar = new e();
                g0Var.c(eVar);
                b0 b3 = g0Var.b();
                if (b3 == null || (charset2 = b3.a(StandardCharsets.UTF_8)) == null) {
                    charset2 = StandardCharsets.UTF_8;
                    i.d(charset2, "UTF_8");
                }
                this.c.a("");
                if (c.N(eVar)) {
                    this.c.a(eVar.i0(charset2));
                    bVar2 = this.c;
                    sb2 = b.e.a.a.a.y("--> END ");
                    sb2.append(e0Var.c);
                    sb2.append(" (");
                    sb2.append(g0Var.a());
                    sb2.append("-byte body)");
                } else {
                    bVar2 = this.c;
                    sb2 = b.e.a.a.a.y("--> END ");
                    sb2.append(e0Var.c);
                    sb2.append(" (binary ");
                    sb2.append(g0Var.a());
                    sb2.append("-byte body omitted)");
                }
                str8 = sb2.toString();
                bVar2.a(str8);
            }
            sb.append(str9);
            bVar2 = bVar3;
            str8 = sb.toString();
            bVar2.a(str8);
        }
        long nanoTime = System.nanoTime();
        try {
            h0 c3 = gVar.c(e0Var);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            j0 j0Var = c3.f10106n;
            i.c(j0Var);
            long b4 = j0Var.b();
            if (b4 != -1) {
                str2 = b4 + "-byte";
            } else {
                str2 = "unknown-length";
            }
            b bVar5 = this.c;
            String str10 = "-byte body)";
            StringBuilder y4 = b.e.a.a.a.y("<-- ");
            long j2 = b4;
            y4.append(c3.f10103k);
            if (c3.f10102j.length() == 0) {
                c2 = ' ';
                str3 = "-byte body omitted)";
                str4 = "";
            } else {
                String str11 = c3.f10102j;
                StringBuilder sb4 = new StringBuilder();
                str3 = "-byte body omitted)";
                sb4.append(String.valueOf(' '));
                sb4.append(str11);
                str4 = sb4.toString();
                c2 = ' ';
            }
            y4.append(str4);
            y4.append(c2);
            y4.append(c3.f10100h.f10092b);
            y4.append(" (");
            y4.append(millis);
            y4.append("ms");
            if (!z2) {
                str5 = b.e.a.a.a.n(", ", str2, " body");
            } else {
                str5 = "";
            }
            y4.append(str5);
            y4.append(')');
            bVar5.a(y4.toString());
            if (z2) {
                y yVar2 = c3.f10105m;
                int size2 = yVar2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    c(yVar2, i3);
                }
                if (!z || !n.m0.h.e.a(c3)) {
                    bVar = this.c;
                    str6 = "<-- END HTTP";
                } else if (b(c3.f10105m)) {
                    bVar = this.c;
                    str6 = "<-- END HTTP (encoded body omitted)";
                } else {
                    o.g q2 = j0Var.q();
                    q2.t(RecyclerView.FOREVER_NS);
                    e d = q2.d();
                    Long l2 = null;
                    if (h.f("gzip", yVar2.d("Content-Encoding"), true)) {
                        Long valueOf = Long.valueOf(d.f10453i);
                        m mVar = new m(d.clone());
                        try {
                            d = new e();
                            d.n(mVar);
                            b.q.a.a.A(mVar, (Throwable) null);
                            l2 = valueOf;
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            b.q.a.a.A(mVar, th);
                            throw th3;
                        }
                    }
                    b0 e2 = j0Var.e();
                    if (e2 == null || (charset = e2.a(StandardCharsets.UTF_8)) == null) {
                        charset = StandardCharsets.UTF_8;
                        i.d(charset, "UTF_8");
                    }
                    if (!c.N(d)) {
                        this.c.a("");
                        b bVar6 = this.c;
                        StringBuilder y5 = b.e.a.a.a.y("<-- END HTTP (binary ");
                        y5.append(d.f10453i);
                        y5.append(str3);
                        bVar6.a(y5.toString());
                        return c3;
                    }
                    if (j2 != 0) {
                        this.c.a("");
                        this.c.a(d.clone().i0(charset));
                    }
                    b bVar7 = this.c;
                    StringBuilder y6 = b.e.a.a.a.y("<-- END HTTP (");
                    if (l2 != null) {
                        y6.append(d.f10453i);
                        y6.append("-byte, ");
                        y6.append(l2);
                        str7 = "-gzipped-byte body)";
                    } else {
                        y6.append(d.f10453i);
                        str7 = str10;
                    }
                    y6.append(str7);
                    bVar7.a(y6.toString());
                }
                bVar.a(str6);
            }
            return c3;
        } catch (Exception e3) {
            Exception exc = e3;
            this.c.a("<-- HTTP FAILED: " + exc);
            throw exc;
        }
    }

    public final boolean b(y yVar) {
        String d = yVar.d("Content-Encoding");
        return d != null && !h.f(d, "identity", true) && !h.f(d, "gzip", true);
    }

    public final void c(y yVar, int i2) {
        String str;
        int i3 = i2 * 2;
        if (this.a.contains(yVar.f10427h[i3])) {
            str = "██";
        } else {
            str = yVar.f10427h[i3 + 1];
        }
        b bVar = this.c;
        bVar.a(yVar.f10427h[i3] + ": " + str);
    }
}
