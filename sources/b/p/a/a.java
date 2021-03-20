package b.p.a;

import b.l.f.x.a.g;
import b.p.a.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

public final class a extends l<Object> {
    public static final l.a c = new C0112a();
    public final Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    public final l<Object> f6370b;

    /* renamed from: b.p.a.a$a  reason: collision with other inner class name */
    public class C0112a implements l.a {
        public l<?> a(Type type, Set<? extends Annotation> set, x xVar) {
            Type genericComponentType = type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : type instanceof Class ? ((Class) type).getComponentType() : null;
            if (genericComponentType != null && set.isEmpty()) {
                return new a(g.B(genericComponentType), xVar.b(genericComponentType)).c();
            }
            return null;
        }
    }

    public a(Class<?> cls, l<Object> lVar) {
        this.a = cls;
        this.f6370b = lVar;
    }

    public Object a(q qVar) {
        ArrayList arrayList = new ArrayList();
        qVar.b();
        while (qVar.N()) {
            arrayList.add(this.f6370b.a(qVar));
        }
        qVar.q();
        Object newInstance = Array.newInstance(this.a, arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Array.set(newInstance, i2, arrayList.get(i2));
        }
        return newInstance;
    }

    public void e(u uVar, Object obj) {
        uVar.b();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f6370b.e(uVar, Array.get(obj, i2));
        }
        uVar.z();
    }

    public String toString() {
        return this.f6370b + ".array()";
    }
}
