package b.j.a.c.j0;

import java.io.Serializable;

public class c0 implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final c0 f2205h = new c0();

    public static final class a extends c0 implements Serializable {

        /* renamed from: i  reason: collision with root package name */
        public final Class<?>[] f2206i;

        public a(Class<?>[] clsArr) {
            this.f2206i = clsArr;
        }

        public boolean a(Class<?> cls) {
            for (Class<?> cls2 : this.f2206i) {
                if (cls == cls2 || cls2.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class b extends c0 {

        /* renamed from: i  reason: collision with root package name */
        public final Class<?> f2207i;

        public b(Class<?> cls) {
            this.f2207i = cls;
        }

        public boolean a(Class<?> cls) {
            Class<?> cls2 = this.f2207i;
            return cls == cls2 || cls2.isAssignableFrom(cls);
        }
    }

    public boolean a(Class<?> cls) {
        return false;
    }
}
