package b.j.a.c.h0;

import b.j.a.a.r;
import b.j.a.c.a0.i;
import b.j.a.c.c;
import b.j.a.c.e0.p;
import b.j.a.c.f0.a;
import b.j.a.c.f0.f;
import b.j.a.c.f0.g.l;
import b.j.a.c.h0.t.a0;
import b.j.a.c.h0.t.b0;
import b.j.a.c.h0.t.c0;
import b.j.a.c.h0.t.e;
import b.j.a.c.h0.t.g0;
import b.j.a.c.h0.t.h;
import b.j.a.c.h0.t.h0;
import b.j.a.c.h0.t.i0;
import b.j.a.c.h0.t.k;
import b.j.a.c.h0.t.l0;
import b.j.a.c.h0.t.m0;
import b.j.a.c.h0.t.n0;
import b.j.a.c.h0.t.o;
import b.j.a.c.h0.t.o0;
import b.j.a.c.h0.t.s;
import b.j.a.c.h0.t.t0;
import b.j.a.c.h0.t.u;
import b.j.a.c.h0.t.v;
import b.j.a.c.h0.t.v0;
import b.j.a.c.h0.t.w0;
import b.j.a.c.h0.t.x;
import b.j.a.c.h0.t.x0;
import b.j.a.c.h0.t.y;
import b.j.a.c.h0.t.z;
import b.j.a.c.j0.g;
import b.j.a.c.j0.j;
import b.j.a.c.m;
import b.j.a.c.n;
import b.j.a.c.w;
import b.j.a.c.z.f;
import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public abstract class b extends p implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    public static final HashMap<String, n<?>> f2034i;

    /* renamed from: j  reason: collision with root package name */
    public static final HashMap<String, Class<? extends n<?>>> f2035j;

    /* renamed from: h  reason: collision with root package name */
    public final i f2036h;

    static {
        HashMap<String, Class<? extends n<?>>> hashMap = new HashMap<>();
        HashMap<String, n<?>> hashMap2 = new HashMap<>();
        hashMap2.put(String.class.getName(), new t0());
        v0 v0Var = v0.f2148j;
        hashMap2.put(StringBuffer.class.getName(), v0Var);
        hashMap2.put(StringBuilder.class.getName(), v0Var);
        hashMap2.put(Character.class.getName(), v0Var);
        hashMap2.put(Character.TYPE.getName(), v0Var);
        Class<Double> cls = Double.class;
        Class<Long> cls2 = Long.class;
        Class<Integer> cls3 = Integer.class;
        hashMap2.put(cls3.getName(), new a0(cls3));
        Class cls4 = Integer.TYPE;
        hashMap2.put(cls4.getName(), new a0(cls4));
        hashMap2.put(cls2.getName(), new b0(cls2));
        Class cls5 = Long.TYPE;
        hashMap2.put(cls5.getName(), new b0(cls5));
        String name = Byte.class.getName();
        z zVar = z.f2151j;
        hashMap2.put(name, zVar);
        hashMap2.put(Byte.TYPE.getName(), zVar);
        String name2 = Short.class.getName();
        c0 c0Var = c0.f2090j;
        hashMap2.put(name2, c0Var);
        hashMap2.put(Short.TYPE.getName(), c0Var);
        hashMap2.put(cls.getName(), new x(cls));
        hashMap2.put(Double.TYPE.getName(), new x(Double.TYPE));
        String name3 = Float.class.getName();
        y yVar = y.f2150j;
        hashMap2.put(name3, yVar);
        hashMap2.put(Float.TYPE.getName(), yVar);
        hashMap2.put(Boolean.TYPE.getName(), new e(true));
        hashMap2.put(Boolean.class.getName(), new e(false));
        hashMap2.put(BigInteger.class.getName(), new v(BigInteger.class));
        hashMap2.put(BigDecimal.class.getName(), new v(BigDecimal.class));
        hashMap2.put(Calendar.class.getName(), h.f2115m);
        String name4 = Date.class.getName();
        k kVar = k.f2117m;
        hashMap2.put(name4, kVar);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(URL.class, new v0(URL.class));
        hashMap3.put(URI.class, new v0(URI.class));
        hashMap3.put(Currency.class, new v0(Currency.class));
        hashMap3.put(UUID.class, new x0());
        hashMap3.put(Pattern.class, new v0(Pattern.class));
        hashMap3.put(Locale.class, new v0(Locale.class));
        hashMap3.put(AtomicBoolean.class, m0.class);
        hashMap3.put(AtomicInteger.class, n0.class);
        hashMap3.put(AtomicLong.class, o0.class);
        hashMap3.put(File.class, o.class);
        hashMap3.put(Class.class, b.j.a.c.h0.t.i.class);
        u uVar = u.f2146j;
        hashMap3.put(Void.class, uVar);
        hashMap3.put(Void.TYPE, uVar);
        try {
            hashMap3.put(Timestamp.class, kVar);
            hashMap3.put(java.sql.Date.class, h0.class);
            hashMap3.put(Time.class, i0.class);
        } catch (NoClassDefFoundError unused) {
        }
        for (Map.Entry entry : hashMap3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof n) {
                hashMap2.put(((Class) entry.getKey()).getName(), (n) value);
            } else {
                hashMap.put(((Class) entry.getKey()).getName(), (Class) value);
            }
        }
        hashMap.put(b.j.a.c.j0.z.class.getName(), w0.class);
        f2034i = hashMap2;
        f2035j = hashMap;
    }

    public b(i iVar) {
        this.f2036h = iVar == null ? new i() : iVar;
    }

    public f b(w wVar, b.j.a.c.i iVar) {
        ArrayList arrayList;
        b.j.a.c.e0.b bVar = ((p) wVar.m(iVar.f2152h)).f1937e;
        b.j.a.c.f0.e<?> Y = wVar.e().Y(wVar, bVar, iVar);
        if (Y == null) {
            Y = wVar.f1609i.f1590l;
            arrayList = null;
        } else {
            l lVar = (l) wVar.f1611l;
            Objects.requireNonNull(lVar);
            b.j.a.c.b e2 = wVar.e();
            HashMap hashMap = new HashMap();
            lVar.d(bVar, new a(bVar.f1887i, (String) null), wVar, e2, hashMap);
            arrayList = new ArrayList(hashMap.values());
        }
        if (Y == null) {
            return null;
        }
        return Y.c(wVar, iVar, arrayList);
    }

    public r.b c(b.j.a.c.y yVar, c cVar, b.j.a.c.i iVar, Class<?> cls) {
        w wVar = yVar.f2320h;
        r.b e2 = cVar.e(wVar.f1616q.f1595h);
        wVar.j(cls, e2);
        wVar.j(iVar.f2152h, (r.b) null);
        return e2;
    }

    public final n<?> d(b.j.a.c.y yVar, b.j.a.c.i iVar, c cVar) {
        if (m.class.isAssignableFrom(iVar.f2152h)) {
            return g0.f2114j;
        }
        b.j.a.c.e0.h c = cVar.c();
        if (c == null) {
            return null;
        }
        if (yVar.f2320h.b()) {
            g.e(c.j(), yVar.J(b.j.a.c.p.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new s(c, e(yVar, c));
    }

    public n<Object> e(b.j.a.c.y yVar, b.j.a.c.e0.a aVar) {
        Object U = yVar.B().U(aVar);
        j<Object, Object> jVar = null;
        if (U == null) {
            return null;
        }
        n<Object> N = yVar.N(aVar, U);
        Object Q = yVar.B().Q(aVar);
        if (Q != null) {
            jVar = yVar.f(aVar, Q);
        }
        return jVar == null ? N : new l0(jVar, jVar.c(yVar.h()), N);
    }

    public boolean f(w wVar, c cVar, f fVar) {
        f.b T = wVar.e().T(((p) cVar).f1937e);
        if (T == null || T == f.b.DEFAULT_TYPING) {
            return wVar.o(b.j.a.c.p.USE_STATIC_TYPING);
        }
        return T == f.b.STATIC;
    }
}
