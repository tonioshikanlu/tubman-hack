package b.l.e.e0.z;

import b.l.e.b0;
import b.l.e.c0;
import b.l.e.e0.s;
import b.l.e.g0.c;
import b.l.e.k;
import java.util.ArrayList;

public final class h extends b0<Object> {

    /* renamed from: b  reason: collision with root package name */
    public static final c0 f5469b = new a();
    public final k a;

    public class a implements c0 {
        public <T> b0<T> a(k kVar, b.l.e.f0.a<T> aVar) {
            if (aVar.a == Object.class) {
                return new h(kVar);
            }
            return null;
        }
    }

    public h(k kVar) {
        this.a = kVar;
    }

    public Object a(b.l.e.g0.a aVar) {
        int ordinal = aVar.v0().ordinal();
        if (ordinal == 0) {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.Y()) {
                arrayList.add(a(aVar));
            }
            aVar.H();
            return arrayList;
        } else if (ordinal == 2) {
            s sVar = new s();
            aVar.e();
            while (aVar.Y()) {
                sVar.put(aVar.p0(), a(aVar));
            }
            aVar.N();
            return sVar;
        } else if (ordinal == 5) {
            return aVar.t0();
        } else {
            if (ordinal == 6) {
                return Double.valueOf(aVar.m0());
            }
            if (ordinal == 7) {
                return Boolean.valueOf(aVar.k0());
            }
            if (ordinal == 8) {
                aVar.r0();
                return null;
            }
            throw new IllegalStateException();
        }
    }

    public void b(c cVar, Object obj) {
        if (obj == null) {
            cVar.Y();
            return;
        }
        b0<?> f = this.a.f(obj.getClass());
        if (f instanceof h) {
            cVar.q();
            cVar.N();
            return;
        }
        f.b(cVar, obj);
    }
}
