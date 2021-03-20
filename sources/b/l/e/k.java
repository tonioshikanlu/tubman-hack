package b.l.e;

import b.l.e.e0.g;
import b.l.e.e0.o;
import b.l.e.e0.z.b;
import b.l.e.e0.z.d;
import b.l.e.e0.z.h;
import b.l.e.e0.z.j;
import b.l.e.e0.z.l;
import b.l.e.e0.z.q;
import b.l.e.e0.z.r;
import b.l.e.g0.c;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class k {

    /* renamed from: n  reason: collision with root package name */
    public static final b.l.e.f0.a<?> f5550n = new b.l.e.f0.a<>(Object.class);
    public final ThreadLocal<Map<b.l.e.f0.a<?>, a<?>>> a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<b.l.e.f0.a<?>, b0<?>> f5551b;
    public final g c;
    public final d d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c0> f5552e;
    public final Map<Type, m<?>> f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5553g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5554h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f5555i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f5556j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f5557k;

    /* renamed from: l  reason: collision with root package name */
    public final List<c0> f5558l;

    /* renamed from: m  reason: collision with root package name */
    public final List<c0> f5559m;

    public static class a<T> extends b0<T> {
        public b0<T> a;

        public T a(b.l.e.g0.a aVar) {
            b0<T> b0Var = this.a;
            if (b0Var != null) {
                return b0Var.a(aVar);
            }
            throw new IllegalStateException();
        }

        public void b(c cVar, T t) {
            b0<T> b0Var = this.a;
            if (b0Var != null) {
                b0Var.b(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public k() {
        this(o.f5431j, d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, z.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public k(o oVar, e eVar, Map<Type, m<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, z zVar, String str, int i2, int i3, List<c0> list, List<c0> list2, List<c0> list3) {
        o oVar2 = oVar;
        this.a = new ThreadLocal<>();
        this.f5551b = new ConcurrentHashMap();
        this.f = map;
        g gVar = new g(map);
        this.c = gVar;
        this.f5553g = z;
        this.f5554h = z3;
        this.f5555i = z4;
        this.f5556j = z5;
        this.f5557k = z6;
        this.f5558l = list;
        this.f5559m = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(b.l.e.e0.z.o.Y);
        arrayList.add(h.f5469b);
        arrayList.add(oVar);
        arrayList.addAll(list3);
        arrayList.add(b.l.e.e0.z.o.D);
        arrayList.add(b.l.e.e0.z.o.f5500m);
        arrayList.add(b.l.e.e0.z.o.f5494g);
        arrayList.add(b.l.e.e0.z.o.f5496i);
        arrayList.add(b.l.e.e0.z.o.f5498k);
        b0 hVar = zVar == z.DEFAULT ? b.l.e.e0.z.o.t : new h();
        arrayList.add(new r(Long.TYPE, Long.class, hVar));
        arrayList.add(new r(Double.TYPE, Double.class, z7 ? b.l.e.e0.z.o.v : new f(this)));
        arrayList.add(new r(Float.TYPE, Float.class, z7 ? b.l.e.e0.z.o.u : new g(this)));
        arrayList.add(b.l.e.e0.z.o.x);
        arrayList.add(b.l.e.e0.z.o.f5502o);
        arrayList.add(b.l.e.e0.z.o.f5504q);
        arrayList.add(new q(AtomicLong.class, new a0(new i(hVar))));
        arrayList.add(new q(AtomicLongArray.class, new a0(new j(hVar))));
        arrayList.add(b.l.e.e0.z.o.s);
        arrayList.add(b.l.e.e0.z.o.z);
        arrayList.add(b.l.e.e0.z.o.F);
        arrayList.add(b.l.e.e0.z.o.H);
        arrayList.add(new q(BigDecimal.class, b.l.e.e0.z.o.B));
        arrayList.add(new q(BigInteger.class, b.l.e.e0.z.o.C));
        arrayList.add(b.l.e.e0.z.o.J);
        arrayList.add(b.l.e.e0.z.o.L);
        arrayList.add(b.l.e.e0.z.o.P);
        arrayList.add(b.l.e.e0.z.o.R);
        arrayList.add(b.l.e.e0.z.o.W);
        arrayList.add(b.l.e.e0.z.o.N);
        arrayList.add(b.l.e.e0.z.o.d);
        arrayList.add(b.l.e.e0.z.c.f5464b);
        arrayList.add(b.l.e.e0.z.o.U);
        arrayList.add(l.f5482b);
        arrayList.add(b.l.e.e0.z.k.f5481b);
        arrayList.add(b.l.e.e0.z.o.S);
        arrayList.add(b.l.e.e0.z.a.c);
        arrayList.add(b.l.e.e0.z.o.f5492b);
        arrayList.add(new b(gVar));
        boolean z8 = z2;
        arrayList.add(new b.l.e.e0.z.g(gVar, z2));
        d dVar = new d(gVar);
        this.d = dVar;
        arrayList.add(dVar);
        arrayList.add(b.l.e.e0.z.o.Z);
        e eVar2 = eVar;
        arrayList.add(new j(gVar, eVar, oVar, dVar));
        this.f5552e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public <T> T b(b.l.e.g0.a aVar, Type type) {
        boolean z = aVar.f5521i;
        aVar.f5521i = true;
        try {
            aVar.v0();
            T a2 = e(new b.l.e.f0.a(type)).a(aVar);
            aVar.f5521i = z;
            return a2;
        } catch (EOFException e2) {
            if (1 != 0) {
                aVar.f5521i = z;
                return null;
            }
            throw new y((Throwable) e2);
        } catch (IllegalStateException e3) {
            throw new y((Throwable) e3);
        } catch (IOException e4) {
            throw new y((Throwable) e4);
        } catch (AssertionError e5) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e5.getMessage());
            assertionError.initCause(e5);
            throw assertionError;
        } catch (Throwable th) {
            aVar.f5521i = z;
            throw th;
        }
    }

    public <T> T c(String str, Class<T> cls) {
        Class<Integer> cls2;
        T d2 = d(str, cls);
        if (cls == Integer.TYPE) {
            cls2 = Integer.class;
        } else if (cls == Float.TYPE) {
            cls2 = Float.class;
        } else if (cls == Byte.TYPE) {
            cls2 = Byte.class;
        } else if (cls == Double.TYPE) {
            cls2 = Double.class;
        } else if (cls == Long.TYPE) {
            cls2 = Long.class;
        } else if (cls == Character.TYPE) {
            cls2 = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls2 = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls2 = Short.class;
        } else {
            cls2 = cls;
            if (cls == Void.TYPE) {
                cls2 = Void.class;
            }
        }
        return cls2.cast(d2);
    }

    public <T> T d(String str, Type type) {
        if (str == null) {
            return null;
        }
        b.l.e.g0.a aVar = new b.l.e.g0.a(new StringReader(str));
        aVar.f5521i = this.f5557k;
        T b2 = b(aVar, type);
        if (b2 != null) {
            try {
                if (aVar.v0() != b.l.e.g0.b.END_DOCUMENT) {
                    throw new r("JSON document was not fully consumed.");
                }
            } catch (b.l.e.g0.d e2) {
                throw new y((Throwable) e2);
            } catch (IOException e3) {
                throw new r((Throwable) e3);
            }
        }
        return b2;
    }

    public <T> b0<T> e(b.l.e.f0.a<T> aVar) {
        b0<T> b0Var = this.f5551b.get(aVar == null ? f5550n : aVar);
        if (b0Var != null) {
            return b0Var;
        }
        Map map = this.a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap();
            this.a.set(map);
            z = true;
        }
        a aVar2 = (a) map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a aVar3 = new a();
            map.put(aVar, aVar3);
            for (c0 a2 : this.f5552e) {
                b0<T> a3 = a2.a(this, aVar);
                if (a3 != null) {
                    if (aVar3.a == null) {
                        aVar3.a = a3;
                        this.f5551b.put(aVar, a3);
                        return a3;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.a.remove();
            }
        }
    }

    public <T> b0<T> f(Class<T> cls) {
        return e(new b.l.e.f0.a(cls));
    }

    public <T> b0<T> g(c0 c0Var, b.l.e.f0.a<T> aVar) {
        if (!this.f5552e.contains(c0Var)) {
            c0Var = this.d;
        }
        boolean z = false;
        for (c0 next : this.f5552e) {
            if (z) {
                b0<T> a2 = next.a(this, aVar);
                if (a2 != null) {
                    return a2;
                }
            } else if (next == c0Var) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public c h(Writer writer) {
        if (this.f5554h) {
            writer.write(")]}'\n");
        }
        c cVar = new c(writer);
        if (this.f5556j) {
            cVar.f5544k = "  ";
            cVar.f5545l = ": ";
        }
        cVar.f5549p = this.f5553g;
        return cVar;
    }

    public String i(Object obj) {
        if (obj == null) {
            s sVar = s.a;
            StringWriter stringWriter = new StringWriter();
            try {
                j(sVar, h(stringWriter));
                return stringWriter.toString();
            } catch (IOException e2) {
                throw new r((Throwable) e2);
            }
        } else {
            Class<?> cls = obj.getClass();
            StringWriter stringWriter2 = new StringWriter();
            try {
                k(obj, cls, h(stringWriter2));
                return stringWriter2.toString();
            } catch (IOException e3) {
                throw new r((Throwable) e3);
            }
        }
    }

    public void j(q qVar, c cVar) {
        boolean z = cVar.f5546m;
        cVar.f5546m = true;
        boolean z2 = cVar.f5547n;
        cVar.f5547n = this.f5555i;
        boolean z3 = cVar.f5549p;
        cVar.f5549p = this.f5553g;
        try {
            b.l.e.e0.z.o.X.b(cVar, qVar);
            cVar.f5546m = z;
            cVar.f5547n = z2;
            cVar.f5549p = z3;
        } catch (IOException e2) {
            throw new r((Throwable) e2);
        } catch (AssertionError e3) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
            assertionError.initCause(e3);
            throw assertionError;
        } catch (Throwable th) {
            cVar.f5546m = z;
            cVar.f5547n = z2;
            cVar.f5549p = z3;
            throw th;
        }
    }

    public void k(Object obj, Type type, c cVar) {
        b0 e2 = e(new b.l.e.f0.a(type));
        boolean z = cVar.f5546m;
        cVar.f5546m = true;
        boolean z2 = cVar.f5547n;
        cVar.f5547n = this.f5555i;
        boolean z3 = cVar.f5549p;
        cVar.f5549p = this.f5553g;
        try {
            e2.b(cVar, obj);
            cVar.f5546m = z;
            cVar.f5547n = z2;
            cVar.f5549p = z3;
        } catch (IOException e3) {
            throw new r((Throwable) e3);
        } catch (AssertionError e4) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e4.getMessage());
            assertionError.initCause(e4);
            throw assertionError;
        } catch (Throwable th) {
            cVar.f5546m = z;
            cVar.f5547n = z2;
            cVar.f5549p = z3;
            throw th;
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f5553g + ",factories:" + this.f5552e + ",instanceCreators:" + this.c + "}";
    }
}
