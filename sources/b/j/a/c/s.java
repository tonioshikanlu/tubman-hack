package b.j.a.c;

import b.j.a.a.h0;
import b.j.a.c.e0.h;
import java.io.Serializable;

public class s implements Serializable {

    /* renamed from: o  reason: collision with root package name */
    public static final s f2292o = new s(Boolean.TRUE, (String) null, (Integer) null, (String) null, (a) null, (h0) null, (h0) null);

    /* renamed from: p  reason: collision with root package name */
    public static final s f2293p = new s(Boolean.FALSE, (String) null, (Integer) null, (String) null, (a) null, (h0) null, (h0) null);

    /* renamed from: q  reason: collision with root package name */
    public static final s f2294q = new s((Boolean) null, (String) null, (Integer) null, (String) null, (a) null, (h0) null, (h0) null);

    /* renamed from: h  reason: collision with root package name */
    public final Boolean f2295h;

    /* renamed from: i  reason: collision with root package name */
    public final String f2296i;

    /* renamed from: j  reason: collision with root package name */
    public final Integer f2297j;

    /* renamed from: k  reason: collision with root package name */
    public final String f2298k;

    /* renamed from: l  reason: collision with root package name */
    public final transient a f2299l;

    /* renamed from: m  reason: collision with root package name */
    public h0 f2300m;

    /* renamed from: n  reason: collision with root package name */
    public h0 f2301n;

    public static final class a {
        public final h a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2302b;

        public a(h hVar, boolean z) {
            this.a = hVar;
            this.f2302b = z;
        }
    }

    public s(Boolean bool, String str, Integer num, String str2, a aVar, h0 h0Var, h0 h0Var2) {
        this.f2295h = bool;
        this.f2296i = str;
        this.f2297j = num;
        this.f2298k = (str2 == null || str2.isEmpty()) ? null : str2;
        this.f2299l = aVar;
        this.f2300m = h0Var;
        this.f2301n = h0Var2;
    }

    public static s a(Boolean bool, String str, Integer num, String str2) {
        return (str == null && num == null && str2 == null) ? bool == null ? f2294q : bool.booleanValue() ? f2292o : f2293p : new s(bool, str, num, str2, (a) null, (h0) null, (h0) null);
    }

    public s b(a aVar) {
        return new s(this.f2295h, this.f2296i, this.f2297j, this.f2298k, aVar, this.f2300m, this.f2301n);
    }
}
