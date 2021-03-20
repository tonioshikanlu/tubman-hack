package b.j.a.c.e0;

import b.j.a.c.j0.b;
import java.lang.annotation.Annotation;
import java.util.HashMap;

public final class o implements b {

    /* renamed from: h  reason: collision with root package name */
    public HashMap<Class<?>, Annotation> f1934h;

    public o() {
    }

    public o(HashMap<Class<?>, Annotation> hashMap) {
        this.f1934h = hashMap;
    }

    public static o c(o oVar, o oVar2) {
        HashMap<Class<?>, Annotation> hashMap;
        HashMap<Class<?>, Annotation> hashMap2;
        if (oVar == null || (hashMap = oVar.f1934h) == null || hashMap.isEmpty()) {
            return oVar2;
        }
        if (oVar2 == null || (hashMap2 = oVar2.f1934h) == null || hashMap2.isEmpty()) {
            return oVar;
        }
        HashMap hashMap3 = new HashMap();
        for (Annotation next : oVar2.f1934h.values()) {
            hashMap3.put(next.annotationType(), next);
        }
        for (Annotation next2 : oVar.f1934h.values()) {
            hashMap3.put(next2.annotationType(), next2);
        }
        return new o(hashMap3);
    }

    public <A extends Annotation> A a(Class<A> cls) {
        HashMap<Class<?>, Annotation> hashMap = this.f1934h;
        if (hashMap == null) {
            return null;
        }
        return (Annotation) hashMap.get(cls);
    }

    public boolean b(Class<? extends Annotation>[] clsArr) {
        if (this.f1934h != null) {
            for (Class<? extends Annotation> containsKey : clsArr) {
                if (this.f1934h.containsKey(containsKey)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int size() {
        HashMap<Class<?>, Annotation> hashMap = this.f1934h;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.size();
    }

    public String toString() {
        HashMap<Class<?>, Annotation> hashMap = this.f1934h;
        return hashMap == null ? "[null]" : hashMap.toString();
    }
}
