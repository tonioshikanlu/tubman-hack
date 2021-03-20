package b.l.e.e0.z;

import b.l.e.b0;
import b.l.e.c0;
import b.l.e.g0.b;
import b.l.e.g0.c;
import b.l.e.k;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class a<E> extends b0<Object> {
    public static final c0 c = new C0094a();
    public final Class<E> a;

    /* renamed from: b  reason: collision with root package name */
    public final b0<E> f5461b;

    /* renamed from: b.l.e.e0.z.a$a  reason: collision with other inner class name */
    public class C0094a implements c0 {
        public <T> b0<T> a(k kVar, b.l.e.f0.a<T> aVar) {
            Type type = aVar.f5519b;
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new a(kVar, kVar.e(new b.l.e.f0.a(genericComponentType)), b.l.e.e0.a.e(genericComponentType));
        }
    }

    public a(k kVar, b0<E> b0Var, Class<E> cls) {
        this.f5461b = new n(kVar, b0Var, cls);
        this.a = cls;
    }

    public Object a(b.l.e.g0.a aVar) {
        if (aVar.v0() == b.NULL) {
            aVar.r0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.Y()) {
            arrayList.add(this.f5461b.a(aVar));
        }
        aVar.H();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.a, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(newInstance, i2, arrayList.get(i2));
        }
        return newInstance;
    }

    public void b(c cVar, Object obj) {
        if (obj == null) {
            cVar.Y();
            return;
        }
        cVar.e();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f5461b.b(cVar, Array.get(obj, i2));
        }
        cVar.H();
    }
}
