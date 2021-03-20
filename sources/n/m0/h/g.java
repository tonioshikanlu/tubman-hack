package n.m0.h;

import androidx.core.app.NotificationCompat;
import b.e.a.a.a;
import e.x.c.i;
import java.util.List;
import n.a0;
import n.e0;
import n.h0;
import n.l;
import n.m0.g.c;
import n.m0.g.e;

public final class g implements a0.a {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public final e f10232b;
    public final List<a0> c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final c f10233e;
    public final e0 f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10234g;

    /* renamed from: h  reason: collision with root package name */
    public final int f10235h;

    /* renamed from: i  reason: collision with root package name */
    public final int f10236i;

    public g(e eVar, List<? extends a0> list, int i2, c cVar, e0 e0Var, int i3, int i4, int i5) {
        i.e(eVar, NotificationCompat.CATEGORY_CALL);
        i.e(list, "interceptors");
        i.e(e0Var, "request");
        this.f10232b = eVar;
        this.c = list;
        this.d = i2;
        this.f10233e = cVar;
        this.f = e0Var;
        this.f10234g = i3;
        this.f10235h = i4;
        this.f10236i = i5;
    }

    public static g b(g gVar, int i2, c cVar, e0 e0Var, int i3, int i4, int i5, int i6) {
        g gVar2 = gVar;
        int i7 = (i6 & 1) != 0 ? gVar2.d : i2;
        c cVar2 = (i6 & 2) != 0 ? gVar2.f10233e : cVar;
        e0 e0Var2 = (i6 & 4) != 0 ? gVar2.f : e0Var;
        int i8 = (i6 & 8) != 0 ? gVar2.f10234g : i3;
        int i9 = (i6 & 16) != 0 ? gVar2.f10235h : i4;
        int i10 = (i6 & 32) != 0 ? gVar2.f10236i : i5;
        i.e(e0Var2, "request");
        return new g(gVar2.f10232b, gVar2.c, i7, cVar2, e0Var2, i8, i9, i10);
    }

    public l a() {
        c cVar = this.f10233e;
        if (cVar != null) {
            return cVar.f10167b;
        }
        return null;
    }

    public h0 c(e0 e0Var) {
        i.e(e0Var, "request");
        boolean z = false;
        if (this.d < this.c.size()) {
            this.a++;
            c cVar = this.f10233e;
            if (cVar != null) {
                if (cVar.f10168e.b(e0Var.f10092b)) {
                    if (!(this.a == 1)) {
                        StringBuilder y = a.y("network interceptor ");
                        y.append(this.c.get(this.d - 1));
                        y.append(" must call proceed() exactly once");
                        throw new IllegalStateException(y.toString().toString());
                    }
                } else {
                    StringBuilder y2 = a.y("network interceptor ");
                    y2.append(this.c.get(this.d - 1));
                    y2.append(" must retain the same host and port");
                    throw new IllegalStateException(y2.toString().toString());
                }
            }
            g b2 = b(this, this.d + 1, (c) null, e0Var, 0, 0, 0, 58);
            a0 a0Var = this.c.get(this.d);
            h0 a2 = a0Var.a(b2);
            if (a2 != null) {
                if (this.f10233e != null) {
                    if (!(this.d + 1 >= this.c.size() || b2.a == 1)) {
                        throw new IllegalStateException(("network interceptor " + a0Var + " must call proceed() exactly once").toString());
                    }
                }
                if (a2.f10106n != null) {
                    z = true;
                }
                if (z) {
                    return a2;
                }
                throw new IllegalStateException(("interceptor " + a0Var + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + a0Var + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
