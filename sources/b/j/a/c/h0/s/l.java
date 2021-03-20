package b.j.a.c.h0.s;

import b.j.a.c.i;
import b.j.a.c.n;
import b.j.a.c.y;
import java.util.Arrays;

public abstract class l {
    public final boolean a;

    public static final class a extends l {

        /* renamed from: b  reason: collision with root package name */
        public final Class<?> f2065b;
        public final Class<?> c;
        public final n<Object> d;

        /* renamed from: e  reason: collision with root package name */
        public final n<Object> f2066e;

        public a(l lVar, Class<?> cls, n<Object> nVar, Class<?> cls2, n<Object> nVar2) {
            super(lVar);
            this.f2065b = cls;
            this.d = nVar;
            this.c = cls2;
            this.f2066e = nVar2;
        }

        public l b(Class<?> cls, n<Object> nVar) {
            return new c(this, new f[]{new f(this.f2065b, this.d), new f(this.c, this.f2066e), new f(cls, nVar)});
        }

        public n<Object> c(Class<?> cls) {
            if (cls == this.f2065b) {
                return this.d;
            }
            if (cls == this.c) {
                return this.f2066e;
            }
            return null;
        }
    }

    public static final class b extends l {

        /* renamed from: b  reason: collision with root package name */
        public static final b f2067b = new b(false);

        public b(boolean z) {
            super(z);
        }

        public l b(Class<?> cls, n<Object> nVar) {
            return new e(this, cls, nVar);
        }

        public n<Object> c(Class<?> cls) {
            return null;
        }
    }

    public static final class c extends l {

        /* renamed from: b  reason: collision with root package name */
        public final f[] f2068b;

        public c(l lVar, f[] fVarArr) {
            super(lVar);
            this.f2068b = fVarArr;
        }

        public l b(Class<?> cls, n<Object> nVar) {
            f[] fVarArr = this.f2068b;
            int length = fVarArr.length;
            if (length == 8) {
                return this.a ? new e(this, cls, nVar) : this;
            }
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, length + 1);
            fVarArr2[length] = new f(cls, nVar);
            return new c(this, fVarArr2);
        }

        public n<Object> c(Class<?> cls) {
            for (f fVar : this.f2068b) {
                if (fVar.a == cls) {
                    return fVar.f2071b;
                }
            }
            return null;
        }
    }

    public static final class d {
        public final n<Object> a;

        /* renamed from: b  reason: collision with root package name */
        public final l f2069b;

        public d(n<Object> nVar, l lVar) {
            this.a = nVar;
            this.f2069b = lVar;
        }
    }

    public static final class e extends l {

        /* renamed from: b  reason: collision with root package name */
        public final Class<?> f2070b;
        public final n<Object> c;

        public e(l lVar, Class<?> cls, n<Object> nVar) {
            super(lVar);
            this.f2070b = cls;
            this.c = nVar;
        }

        public l b(Class<?> cls, n<Object> nVar) {
            return new a(this, this.f2070b, this.c, cls, nVar);
        }

        public n<Object> c(Class<?> cls) {
            if (cls == this.f2070b) {
                return this.c;
            }
            return null;
        }
    }

    public static final class f {
        public final Class<?> a;

        /* renamed from: b  reason: collision with root package name */
        public final n<Object> f2071b;

        public f(Class<?> cls, n<Object> nVar) {
            this.a = cls;
            this.f2071b = nVar;
        }
    }

    public l(l lVar) {
        this.a = lVar.a;
    }

    public l(boolean z) {
        this.a = z;
    }

    public final d a(i iVar, y yVar, b.j.a.c.d dVar) {
        n<Object> z = yVar.z(iVar, dVar);
        return new d(z, b(iVar.f2152h, z));
    }

    public abstract l b(Class<?> cls, n<Object> nVar);

    public abstract n<Object> c(Class<?> cls);
}
