package b.l.e.e0.z;

import b.l.e.b0;
import b.l.e.c0;
import b.l.e.g0.c;
import b.l.e.k;
import b.l.e.y;

public class t implements c0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Class f5516h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b0 f5517i;

    public class a extends b0<T1> {
        public final /* synthetic */ Class a;

        public a(Class cls) {
            this.a = cls;
        }

        public T1 a(b.l.e.g0.a aVar) {
            T1 a2 = t.this.f5517i.a(aVar);
            if (a2 == null || this.a.isInstance(a2)) {
                return a2;
            }
            StringBuilder y = b.e.a.a.a.y("Expected a ");
            y.append(this.a.getName());
            y.append(" but was ");
            y.append(a2.getClass().getName());
            throw new y(y.toString());
        }

        public void b(c cVar, T1 t1) {
            t.this.f5517i.b(cVar, t1);
        }
    }

    public t(Class cls, b0 b0Var) {
        this.f5516h = cls;
        this.f5517i = b0Var;
    }

    public <T2> b0<T2> a(k kVar, b.l.e.f0.a<T2> aVar) {
        Class<? super T> cls = aVar.a;
        if (!this.f5516h.isAssignableFrom(cls)) {
            return null;
        }
        return new a(cls);
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Factory[typeHierarchy=");
        b.e.a.a.a.I(this.f5516h, y, ",adapter=");
        y.append(this.f5517i);
        y.append("]");
        return y.toString();
    }
}
