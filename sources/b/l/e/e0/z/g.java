package b.l.e.e0.z;

import b.l.e.b0;
import b.l.e.c0;
import b.l.e.e0.q;
import b.l.e.e0.t;
import b.l.e.g0.a;
import b.l.e.g0.b;
import b.l.e.g0.c;
import b.l.e.k;
import b.l.e.n;
import b.l.e.r;
import b.l.e.s;
import b.l.e.v;
import b.l.e.y;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class g implements c0 {

    /* renamed from: h  reason: collision with root package name */
    public final b.l.e.e0.g f5466h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f5467i;

    public final class a<K, V> extends b0<Map<K, V>> {
        public final b0<K> a;

        /* renamed from: b  reason: collision with root package name */
        public final b0<V> f5468b;
        public final t<? extends Map<K, V>> c;

        public a(k kVar, Type type, b0<K> b0Var, Type type2, b0<V> b0Var2, t<? extends Map<K, V>> tVar) {
            this.a = new n(kVar, b0Var, type);
            this.f5468b = new n(kVar, b0Var2, type2);
            this.c = tVar;
        }

        public Object a(b.l.e.g0.a aVar) {
            int i2;
            b v0 = aVar.v0();
            if (v0 == b.NULL) {
                aVar.r0();
                return null;
            }
            Map map = (Map) this.c.a();
            if (v0 == b.BEGIN_ARRAY) {
                aVar.b();
                while (aVar.Y()) {
                    aVar.b();
                    K a2 = this.a.a(aVar);
                    if (map.put(a2, this.f5468b.a(aVar)) == null) {
                        aVar.H();
                    } else {
                        throw new y("duplicate key: " + a2);
                    }
                }
                aVar.H();
            } else {
                aVar.e();
                while (aVar.Y()) {
                    Objects.requireNonNull((a.C0096a) q.a);
                    if (aVar instanceof e) {
                        e eVar = (e) aVar;
                        eVar.C0(b.NAME);
                        Map.Entry entry = (Map.Entry) ((Iterator) eVar.D0()).next();
                        eVar.F0(entry.getValue());
                        eVar.F0(new v((String) entry.getKey()));
                    } else {
                        int i3 = aVar.f5527o;
                        if (i3 == 0) {
                            i3 = aVar.z();
                        }
                        if (i3 == 13) {
                            i2 = 9;
                        } else if (i3 == 12) {
                            i2 = 8;
                        } else if (i3 == 14) {
                            i2 = 10;
                        } else {
                            StringBuilder y = b.e.a.a.a.y("Expected a name but was ");
                            y.append(aVar.v0());
                            y.append(aVar.g0());
                            throw new IllegalStateException(y.toString());
                        }
                        aVar.f5527o = i2;
                    }
                    K a3 = this.a.a(aVar);
                    if (map.put(a3, this.f5468b.a(aVar)) != null) {
                        throw new y("duplicate key: " + a3);
                    }
                }
                aVar.N();
            }
            return map;
        }

        public void b(c cVar, Object obj) {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                cVar.Y();
                return;
            }
            if (!g.this.f5467i) {
                cVar.q();
                for (Map.Entry entry : map.entrySet()) {
                    cVar.O(String.valueOf(entry.getKey()));
                    this.f5468b.b(cVar, entry.getValue());
                }
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i2 = 0;
                boolean z = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    b0<K> b0Var = this.a;
                    Object key = entry2.getKey();
                    Objects.requireNonNull(b0Var);
                    try {
                        f fVar = new f();
                        b0Var.b(fVar, key);
                        if (fVar.s.isEmpty()) {
                            b.l.e.q qVar = fVar.u;
                            arrayList.add(qVar);
                            arrayList2.add(entry2.getValue());
                            Objects.requireNonNull(qVar);
                            z |= (qVar instanceof n) || (qVar instanceof b.l.e.t);
                        } else {
                            throw new IllegalStateException("Expected one JSON element but was " + fVar.s);
                        }
                    } catch (IOException e2) {
                        throw new r((Throwable) e2);
                    }
                }
                if (z) {
                    cVar.e();
                    int size = arrayList.size();
                    while (i2 < size) {
                        cVar.e();
                        o.X.b(cVar, (b.l.e.q) arrayList.get(i2));
                        this.f5468b.b(cVar, arrayList2.get(i2));
                        cVar.H();
                        i2++;
                    }
                    cVar.H();
                    return;
                }
                cVar.q();
                int size2 = arrayList.size();
                while (i2 < size2) {
                    b.l.e.q qVar2 = (b.l.e.q) arrayList.get(i2);
                    Objects.requireNonNull(qVar2);
                    if (qVar2 instanceof v) {
                        v l2 = qVar2.l();
                        Object obj2 = l2.a;
                        if (obj2 instanceof Number) {
                            str = String.valueOf(l2.v());
                        } else if (obj2 instanceof Boolean) {
                            str = Boolean.toString(l2.s());
                        } else if (obj2 instanceof String) {
                            str = l2.p();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (qVar2 instanceof s) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    cVar.O(str);
                    this.f5468b.b(cVar, arrayList2.get(i2));
                    i2++;
                }
            }
            cVar.N();
        }
    }

    public g(b.l.e.e0.g gVar, boolean z) {
        this.f5466h = gVar;
        this.f5467i = z;
    }

    public <T> b0<T> a(k kVar, b.l.e.f0.a<T> aVar) {
        Type[] typeArr;
        Type type = aVar.f5519b;
        if (!Map.class.isAssignableFrom(aVar.a)) {
            return null;
        }
        Class<?> e2 = b.l.e.e0.a.e(type);
        Class<Object> cls = Object.class;
        Class<String> cls2 = String.class;
        if (type == Properties.class) {
            typeArr = new Type[]{cls2, cls2};
        } else {
            Type f = b.l.e.e0.a.f(type, e2, Map.class);
            typeArr = f instanceof ParameterizedType ? ((ParameterizedType) f).getActualTypeArguments() : new Type[]{cls, cls};
        }
        Type type2 = typeArr[0];
        return new a(kVar, typeArr[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? o.f : kVar.e(new b.l.e.f0.a(type2)), typeArr[1], kVar.e(new b.l.e.f0.a(typeArr[1])), this.f5466h.a(aVar));
    }
}
