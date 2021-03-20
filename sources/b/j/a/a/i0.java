package b.j.a.a;

import java.io.Serializable;

public abstract class i0<T> implements Serializable {

    public static final class a implements Serializable {

        /* renamed from: h  reason: collision with root package name */
        public final Class<?> f1302h;

        /* renamed from: i  reason: collision with root package name */
        public final Class<?> f1303i;

        /* renamed from: j  reason: collision with root package name */
        public final Object f1304j;

        /* renamed from: k  reason: collision with root package name */
        public final int f1305k;

        public a(Class<?> cls, Class<?> cls2, Object obj) {
            this.f1302h = cls;
            this.f1303i = cls2;
            this.f1304j = obj;
            int hashCode = cls.getName().hashCode() + obj.hashCode();
            this.f1305k = cls2 != null ? hashCode ^ cls2.getName().hashCode() : hashCode;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.f1304j.equals(this.f1304j) && aVar.f1302h == this.f1302h && aVar.f1303i == this.f1303i;
        }

        public int hashCode() {
            return this.f1305k;
        }

        public String toString() {
            Object[] objArr = new Object[3];
            objArr[0] = this.f1304j;
            Class<?> cls = this.f1302h;
            String str = "NONE";
            objArr[1] = cls == null ? str : cls.getName();
            Class<?> cls2 = this.f1303i;
            if (cls2 != null) {
                str = cls2.getName();
            }
            objArr[2] = str;
            return String.format("[ObjectId: key=%s, type=%s, scope=%s]", objArr);
        }
    }

    public abstract boolean a(i0<?> i0Var);

    public abstract i0<T> b(Class<?> cls);

    public abstract T c(Object obj);

    public abstract Class<?> d();

    public abstract a e(Object obj);

    public abstract i0<T> f(Object obj);
}
