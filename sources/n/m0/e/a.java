package n.m0.e;

import androidx.core.app.NotificationCompat;
import e.c0.h;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.a0;
import n.d0;
import n.e0;
import n.h0;
import n.j0;
import n.m0.g.c;
import n.m0.g.e;
import n.m0.h.g;
import n.x;
import n.y;

public final class a implements a0 {
    public static final C0232a a = new C0232a((DefaultConstructorMarker) null);

    /* renamed from: n.m0.e.a$a  reason: collision with other inner class name */
    public static final class C0232a {
        public C0232a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final h0 a(C0232a aVar, h0 h0Var) {
            h0 h0Var2 = h0Var;
            if ((h0Var2 != null ? h0Var2.f10106n : null) == null) {
                return h0Var2;
            }
            Objects.requireNonNull(h0Var);
            i.e(h0Var2, "response");
            e0 e0Var = h0Var2.f10100h;
            d0 d0Var = h0Var2.f10101i;
            int i2 = h0Var2.f10103k;
            String str = h0Var2.f10102j;
            x xVar = h0Var2.f10104l;
            y.a n2 = h0Var2.f10105m.n();
            h0 h0Var3 = h0Var2.f10107o;
            h0 h0Var4 = h0Var2.f10108p;
            h0 h0Var5 = h0Var2.f10109q;
            long j2 = h0Var2.r;
            long j3 = h0Var2.s;
            c cVar = h0Var2.t;
            if (!(i2 >= 0)) {
                throw new IllegalStateException(b.e.a.a.a.g("code < 0: ", i2).toString());
            } else if (e0Var == null) {
                throw new IllegalStateException("request == null".toString());
            } else if (d0Var == null) {
                throw new IllegalStateException("protocol == null".toString());
            } else if (str != null) {
                return new h0(e0Var, d0Var, str, i2, xVar, n2.b(), (j0) null, h0Var3, h0Var4, h0Var5, j2, j3, cVar);
            } else {
                throw new IllegalStateException("message == null".toString());
            }
        }

        public final boolean b(String str) {
            return h.f("Content-Length", str, true) || h.f("Content-Encoding", str, true) || h.f("Content-Type", str, true);
        }

        public final boolean c(String str) {
            return !h.f("Connection", str, true) && !h.f("Keep-Alive", str, true) && !h.f("Proxy-Authenticate", str, true) && !h.f("Proxy-Authorization", str, true) && !h.f("TE", str, true) && !h.f("Trailers", str, true) && !h.f("Transfer-Encoding", str, true) && !h.f("Upgrade", str, true);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Throwable, n.d, java.lang.Object] */
    public h0 a(a0.a aVar) {
        y yVar;
        a0.a aVar2 = aVar;
        C0232a aVar3 = a;
        i.e(aVar2, "chain");
        g gVar = (g) aVar2;
        e eVar = gVar.f10232b;
        System.currentTimeMillis();
        e0 e0Var = gVar.f;
        i.e(e0Var, "request");
        b bVar = new b(e0Var, (h0) null);
        if (e0Var != null && e0Var.a().f10088j) {
            bVar = new b((e0) null, (h0) null);
        }
        e0 e0Var2 = bVar.a;
        h0 h0Var = bVar.f10154b;
        if (eVar instanceof e) {
            e eVar2 = eVar;
        }
        if (e0Var2 == null && h0Var == null) {
            h0.a aVar4 = new h0.a();
            aVar4.g(gVar.f);
            aVar4.f(d0.HTTP_1_1);
            aVar4.c = 504;
            aVar4.e("Unsatisfiable Request (only-if-cached)");
            aVar4.f10112g = n.m0.c.c;
            aVar4.f10116k = -1;
            aVar4.f10117l = System.currentTimeMillis();
            h0 a2 = aVar4.a();
            i.e(eVar, NotificationCompat.CATEGORY_CALL);
            i.e(a2, "response");
            return a2;
        } else if (e0Var2 == null) {
            i.c(h0Var);
            h0.a aVar5 = new h0.a(h0Var);
            aVar5.b(C0232a.a(aVar3, h0Var));
            h0 a3 = aVar5.a();
            i.e(eVar, NotificationCompat.CATEGORY_CALL);
            i.e(a3, "response");
            return a3;
        } else {
            if (h0Var != null) {
                i.e(eVar, NotificationCompat.CATEGORY_CALL);
                i.e(h0Var, "cachedResponse");
            }
            try {
                h0 c = gVar.c(e0Var2);
                if (h0Var != null) {
                    if (c.f10103k == 304) {
                        h0.a aVar6 = new h0.a(h0Var);
                        y yVar2 = h0Var.f10105m;
                        y yVar3 = c.f10105m;
                        ArrayList arrayList = new ArrayList(20);
                        int size = yVar2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            String e2 = yVar2.e(i2);
                            String p2 = yVar2.p(i2);
                            if (h.f("Warning", e2, true)) {
                                yVar = yVar2;
                                if (h.C(p2, "1", false, 2)) {
                                    i2++;
                                    yVar2 = yVar;
                                }
                            } else {
                                yVar = yVar2;
                            }
                            if (aVar3.b(e2) || !aVar3.c(e2) || yVar3.d(e2) == null) {
                                i.e(e2, "name");
                                i.e(p2, "value");
                                arrayList.add(e2);
                                arrayList.add(h.N(p2).toString());
                                i2++;
                                yVar2 = yVar;
                            } else {
                                i2++;
                                yVar2 = yVar;
                            }
                        }
                        int size2 = yVar3.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            String e3 = yVar3.e(i3);
                            if (!aVar3.b(e3) && aVar3.c(e3)) {
                                String p3 = yVar3.p(i3);
                                i.e(e3, "name");
                                i.e(p3, "value");
                                arrayList.add(e3);
                                arrayList.add(h.N(p3).toString());
                            }
                        }
                        Object[] array = arrayList.toArray(new String[0]);
                        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                        aVar6.d(new y((String[]) array, (DefaultConstructorMarker) null));
                        aVar6.f10116k = c.r;
                        aVar6.f10117l = c.s;
                        aVar6.b(C0232a.a(aVar3, h0Var));
                        h0 a4 = C0232a.a(aVar3, c);
                        aVar6.c("networkResponse", a4);
                        aVar6.f10113h = a4;
                        aVar6.a();
                        j0 j0Var = c.f10106n;
                        i.c(j0Var);
                        j0Var.close();
                        ? r0 = 0;
                        i.c(r0);
                        r0.b();
                        throw r0;
                    }
                    j0 j0Var2 = h0Var.f10106n;
                    if (j0Var2 != null) {
                        n.m0.c.d(j0Var2);
                    }
                }
                i.c(c);
                h0.a aVar7 = new h0.a(c);
                aVar7.b(C0232a.a(aVar3, h0Var));
                h0 a5 = C0232a.a(aVar3, c);
                aVar7.c("networkResponse", a5);
                aVar7.f10113h = a5;
                return aVar7.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
