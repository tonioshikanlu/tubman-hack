package b.j.a.c.j0;

import java.lang.reflect.Array;

public final class c {
    public b a = null;

    /* renamed from: b  reason: collision with root package name */
    public C0050c f2201b = null;
    public h c = null;
    public f d = null;

    /* renamed from: e  reason: collision with root package name */
    public g f2202e = null;
    public e f = null;

    /* renamed from: g  reason: collision with root package name */
    public d f2203g = null;

    public static class a {
        public final /* synthetic */ Class a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f2204b;
        public final /* synthetic */ Object c;

        public a(Class cls, int i2, Object obj) {
            this.a = cls;
            this.f2204b = i2;
            this.c = obj;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!g.s(obj, this.a) || Array.getLength(obj) != this.f2204b) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2204b; i2++) {
                Object obj2 = Array.get(this.c, i2);
                Object obj3 = Array.get(obj, i2);
                if (obj2 != obj3 && obj2 != null && !obj2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class b extends u<boolean[]> {
        public Object a(int i2) {
            return new boolean[i2];
        }
    }

    /* renamed from: b.j.a.c.j0.c$c  reason: collision with other inner class name */
    public static final class C0050c extends u<byte[]> {
        public Object a(int i2) {
            return new byte[i2];
        }
    }

    public static final class d extends u<double[]> {
        public Object a(int i2) {
            return new double[i2];
        }
    }

    public static final class e extends u<float[]> {
        public Object a(int i2) {
            return new float[i2];
        }
    }

    public static final class f extends u<int[]> {
        public Object a(int i2) {
            return new int[i2];
        }
    }

    public static final class g extends u<long[]> {
        public Object a(int i2) {
            return new long[i2];
        }
    }

    public static final class h extends u<short[]> {
        public Object a(int i2) {
            return new short[i2];
        }
    }

    public static Object a(Object obj) {
        return new a(obj.getClass(), Array.getLength(obj), obj);
    }
}
