package b.l.e.e0;

import b.l.e.b;
import b.l.e.b0;
import b.l.e.c0;
import b.l.e.g0.c;
import b.l.e.k;
import java.util.Collections;
import java.util.List;

public final class o implements c0, Cloneable {

    /* renamed from: j  reason: collision with root package name */
    public static final o f5431j = new o();

    /* renamed from: h  reason: collision with root package name */
    public List<b> f5432h = Collections.emptyList();

    /* renamed from: i  reason: collision with root package name */
    public List<b> f5433i = Collections.emptyList();

    public class a extends b0<T> {
        public b0<T> a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f5434b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ k d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ b.l.e.f0.a f5435e;

        public a(boolean z, boolean z2, k kVar, b.l.e.f0.a aVar) {
            this.f5434b = z;
            this.c = z2;
            this.d = kVar;
            this.f5435e = aVar;
        }

        public T a(b.l.e.g0.a aVar) {
            if (this.f5434b) {
                aVar.A0();
                return null;
            }
            b0<T> b0Var = this.a;
            if (b0Var == null) {
                b0Var = this.d.g(o.this, this.f5435e);
                this.a = b0Var;
            }
            return b0Var.a(aVar);
        }

        public void b(c cVar, T t) {
            if (this.c) {
                cVar.Y();
                return;
            }
            b0<T> b0Var = this.a;
            if (b0Var == null) {
                b0Var = this.d.g(o.this, this.f5435e);
                this.a = b0Var;
            }
            b0Var.b(cVar, t);
        }
    }

    public <T> b0<T> a(k kVar, b.l.e.f0.a<T> aVar) {
        Class<? super T> cls = aVar.a;
        boolean c = c(cls);
        boolean z = c || b(cls, true);
        boolean z2 = c || b(cls, false);
        if (z || z2) {
            return new a(z2, z, kVar, aVar);
        }
        return null;
    }

    public final boolean b(Class<?> cls, boolean z) {
        for (b a2 : z ? this.f5432h : this.f5433i) {
            if (a2.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public Object clone() {
        try {
            return (o) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }
}
