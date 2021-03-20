package b.p.a.a0.a;

import b.p.a.l;
import b.p.a.n;
import b.p.a.q;
import b.p.a.u;
import e.a.h;
import e.a.j;
import e.a.k;
import e.a.m;
import e.t.c;
import e.x.c.i;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

public final class a<T> extends l<T> {
    public final h<T> a;

    /* renamed from: b  reason: collision with root package name */
    public final List<C0113a<T, Object>> f6371b;
    public final List<C0113a<T, Object>> c;
    public final q.a d;

    /* renamed from: b.p.a.a0.a.a$a  reason: collision with other inner class name */
    public static final class C0113a<K, P> {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final String f6372b;
        public final l<P> c;
        public final m<K, P> d;

        /* renamed from: e  reason: collision with root package name */
        public final k f6373e;
        public final int f;

        public C0113a(String str, String str2, l<P> lVar, m<K, ? extends P> mVar, k kVar, int i2) {
            i.e(str, "name");
            i.e(lVar, "adapter");
            i.e(mVar, "property");
            this.a = str;
            this.f6372b = str2;
            this.c = lVar;
            this.d = mVar;
            this.f6373e = kVar;
            this.f = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0113a)) {
                return false;
            }
            C0113a aVar = (C0113a) obj;
            return i.a(this.a, aVar.a) && i.a(this.f6372b, aVar.f6372b) && i.a(this.c, aVar.c) && i.a(this.d, aVar.d) && i.a(this.f6373e, aVar.f6373e) && this.f == aVar.f;
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f6372b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            l<P> lVar = this.c;
            int hashCode3 = (hashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31;
            m<K, P> mVar = this.d;
            int hashCode4 = (hashCode3 + (mVar != null ? mVar.hashCode() : 0)) * 31;
            k kVar = this.f6373e;
            if (kVar != null) {
                i2 = kVar.hashCode();
            }
            return ((hashCode4 + i2) * 31) + this.f;
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("Binding(name=");
            y.append(this.a);
            y.append(", jsonName=");
            y.append(this.f6372b);
            y.append(", adapter=");
            y.append(this.c);
            y.append(", property=");
            y.append(this.d);
            y.append(", parameter=");
            y.append(this.f6373e);
            y.append(", propertyIndex=");
            return b.e.a.a.a.o(y, this.f, ")");
        }
    }

    public static final class b extends c<k, Object> {

        /* renamed from: h  reason: collision with root package name */
        public final List<k> f6374h;

        /* renamed from: i  reason: collision with root package name */
        public final Object[] f6375i;

        public b(List<? extends k> list, Object[] objArr) {
            i.e(list, "parameterKeys");
            i.e(objArr, "parameterValues");
            this.f6374h = list;
            this.f6375i = objArr;
        }

        public final boolean containsKey(Object obj) {
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            i.e(kVar, "key");
            Object obj2 = this.f6375i[kVar.h()];
            Class<Metadata> cls = c.a;
            return obj2 != c.f6376b;
        }

        public final Object get(Object obj) {
            if (!(obj instanceof k)) {
                return null;
            }
            k kVar = (k) obj;
            i.e(kVar, "key");
            Object obj2 = this.f6375i[kVar.h()];
            Class<Metadata> cls = c.a;
            if (obj2 != c.f6376b) {
                return obj2;
            }
            return null;
        }

        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return obj instanceof k ? super.getOrDefault((k) obj, obj2) : obj2;
        }

        public Object put(Object obj, Object obj2) {
            i.e((k) obj, "key");
            return null;
        }

        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof k) {
                return super.remove((k) obj);
            }
            return null;
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj instanceof k) {
                return super.remove((k) obj, obj2);
            }
            return false;
        }
    }

    public a(h<? extends T> hVar, List<C0113a<T, Object>> list, List<C0113a<T, Object>> list2, q.a aVar) {
        i.e(hVar, "constructor");
        i.e(list, "allBindings");
        i.e(list2, "nonTransientBindings");
        i.e(aVar, "options");
        this.a = hVar;
        this.f6371b = list;
        this.c = list2;
        this.d = aVar;
    }

    public T a(q qVar) {
        i.e(qVar, "reader");
        int size = this.a.g().size();
        int size2 = this.f6371b.size();
        Object[] objArr = new Object[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            Class<Metadata> cls = c.a;
            objArr[i2] = c.f6376b;
        }
        qVar.e();
        while (qVar.N()) {
            int m0 = qVar.m0(this.d);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else {
                C0113a aVar = this.c.get(m0);
                int i3 = aVar.f;
                Object obj = objArr[i3];
                Class<Metadata> cls2 = c.a;
                if (obj == c.f6376b) {
                    objArr[i3] = aVar.c.a(qVar);
                    if (objArr[i3] == null && !aVar.d.f().x()) {
                        n m2 = b.p.a.z.b.m(aVar.d.getName(), aVar.f6372b, qVar);
                        i.d(m2, "Util.unexpectedNull(\n   …         reader\n        )");
                        throw m2;
                    }
                } else {
                    StringBuilder y = b.e.a.a.a.y("Multiple values for '");
                    y.append(aVar.d.getName());
                    y.append("' at ");
                    y.append(qVar.H());
                    throw new n(y.toString());
                }
            }
        }
        qVar.z();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj2 = objArr[i4];
            Class<Metadata> cls3 = c.a;
            if (obj2 == c.f6376b && !this.a.g().get(i4).z()) {
                String str = null;
                if (!this.a.g().get(i4).d().x()) {
                    String name = this.a.g().get(i4).getName();
                    C0113a aVar2 = this.f6371b.get(i4);
                    if (aVar2 != null) {
                        str = aVar2.f6372b;
                    }
                    n g2 = b.p.a.z.b.g(name, str, qVar);
                    i.d(g2, "Util.missingProperty(\n  …       reader\n          )");
                    throw g2;
                }
                objArr[i4] = null;
            }
        }
        T o2 = this.a.o(new b(this.a.g(), objArr));
        int size3 = this.f6371b.size();
        while (size < size3) {
            C0113a<T, Object> aVar3 = this.f6371b.get(size);
            i.c(aVar3);
            C0113a aVar4 = aVar3;
            Object obj3 = objArr[size];
            Class<Metadata> cls4 = c.a;
            if (obj3 != c.f6376b) {
                m<K, P> mVar = aVar4.d;
                Objects.requireNonNull(mVar, "null cannot be cast to non-null type kotlin.reflect.KMutableProperty1<K, P>");
                ((j) mVar).q(o2, obj3);
            }
            size++;
        }
        return o2;
    }

    public void e(u uVar, T t) {
        i.e(uVar, "writer");
        Objects.requireNonNull(t, "value == null");
        uVar.e();
        for (C0113a next : this.f6371b) {
            if (next != null) {
                uVar.O(next.a);
                next.c.e(uVar, next.d.get(t));
            }
        }
        uVar.H();
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("KotlinJsonAdapter(");
        y.append(this.a.f());
        y.append(')');
        return y.toString();
    }
}
