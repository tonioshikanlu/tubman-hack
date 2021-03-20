package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.n;
import e.a.a.a.y0.b.p0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.l.e;
import e.a.a.a.y0.l.i;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.e0;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.v0;
import e.a.a.a.y0.m.w;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public abstract class g extends n implements r0 {

    /* renamed from: l  reason: collision with root package name */
    public final j1 f8196l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f8197m;

    /* renamed from: n  reason: collision with root package name */
    public final int f8198n;

    /* renamed from: o  reason: collision with root package name */
    public final i<v0> f8199o;

    /* renamed from: p  reason: collision with root package name */
    public final i<k0> f8200p;

    /* renamed from: q  reason: collision with root package name */
    public final m f8201q;

    public class a implements e.x.b.a<v0> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ m f8202h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ p0 f8203i;

        public a(m mVar, p0 p0Var) {
            this.f8202h = mVar;
            this.f8203i = p0Var;
        }

        public Object e() {
            return new c(g.this, this.f8202h, this.f8203i);
        }
    }

    public class b implements e.x.b.a<k0> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ d f8205h;

        public b(d dVar) {
            this.f8205h = dVar;
        }

        public Object e() {
            Objects.requireNonNull(h.f7785e);
            h hVar = h.a.a;
            v0 p2 = g.this.p();
            List emptyList = Collections.emptyList();
            h hVar2 = new h(this);
            m mVar = e.f9624e;
            e.x.c.i.d(mVar, "LockBasedStorageManager.NO_LOCKS");
            return e0.h(hVar, p2, emptyList, false, new e.a.a.a.y0.j.y.h(mVar, hVar2));
        }
    }

    public class c extends e.a.a.a.y0.m.h {

        /* renamed from: b  reason: collision with root package name */
        public final p0 f8207b;
        public final /* synthetic */ g c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(g gVar, m mVar, p0 p0Var) {
            super(mVar);
            if (mVar != null) {
                this.c = gVar;
                this.f8207b = p0Var;
                return;
            }
            n(0);
            throw null;
        }

        public static /* synthetic */ void n(int i2) {
            String str = (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 2 : 3)];
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i2 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i2 == 2) {
                objArr[1] = "getParameters";
            } else if (i2 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i2 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i2 != 5) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "getSupertypeLoopChecker";
            }
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public boolean b() {
            return true;
        }

        public e.a.a.a.y0.b.h d() {
            g gVar = this.c;
            if (gVar != null) {
                return gVar;
            }
            n(3);
            throw null;
        }

        public Collection<d0> f() {
            List<d0> K0 = this.c.K0();
            if (K0 != null) {
                return K0;
            }
            n(1);
            throw null;
        }

        public List<r0> g() {
            List<r0> emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            n(2);
            throw null;
        }

        public d0 i() {
            return w.d("Cyclic upper bounds");
        }

        public p0 k() {
            p0 p0Var = this.f8207b;
            if (p0Var != null) {
                return p0Var;
            }
            n(5);
            throw null;
        }

        public void m(d0 d0Var) {
            this.c.w0(d0Var);
        }

        public String toString() {
            return this.c.getName().f9210h;
        }

        public e.a.a.a.y0.a.g v() {
            e.a.a.a.y0.a.g f = e.a.a.a.y0.j.v.b.f(this.c);
            if (f != null) {
                return f;
            }
            n(4);
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(m mVar, k kVar, h hVar, d dVar, j1 j1Var, boolean z, int i2, m0 m0Var, p0 p0Var) {
        super(kVar, hVar, dVar, m0Var);
        if (mVar == null) {
            c0(0);
            throw null;
        } else if (kVar == null) {
            c0(1);
            throw null;
        } else if (hVar == null) {
            c0(2);
            throw null;
        } else if (dVar == null) {
            c0(3);
            throw null;
        } else if (j1Var == null) {
            c0(4);
            throw null;
        } else if (m0Var == null) {
            c0(5);
            throw null;
        } else if (p0Var != null) {
            this.f8196l = j1Var;
            this.f8197m = z;
            this.f8198n = i2;
            this.f8199o = mVar.a(new a(mVar, p0Var));
            this.f8200p = mVar.a(new b(dVar));
            this.f8201q = mVar;
        } else {
            c0(6);
            throw null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        String str;
        int i3;
        Throwable th;
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i2) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
                objArr[1] = "getStorageManager";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public abstract List<d0> K0();

    public m M() {
        m mVar = this.f8201q;
        if (mVar != null) {
            return mVar;
        }
        c0(12);
        throw null;
    }

    public boolean Y() {
        return false;
    }

    public boolean Z() {
        return this.f8197m;
    }

    public e.a.a.a.y0.b.h a() {
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public k m27a() {
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public r0 m28a() {
        return this;
    }

    public List<d0> getUpperBounds() {
        List<d0> l2 = ((c) p()).h();
        if (l2 != null) {
            return l2;
        }
        c0(8);
        throw null;
    }

    public int h() {
        return this.f8198n;
    }

    public n j0() {
        return this;
    }

    public <R, D> R l0(e.a.a.a.y0.b.m<R, D> mVar, D d) {
        return mVar.l(this, d);
    }

    public final v0 p() {
        v0 v0Var = (v0) this.f8199o.e();
        if (v0Var != null) {
            return v0Var;
        }
        c0(9);
        throw null;
    }

    public k0 s() {
        k0 k0Var = (k0) this.f8200p.e();
        if (k0Var != null) {
            return k0Var;
        }
        c0(10);
        throw null;
    }

    public j1 u() {
        j1 j1Var = this.f8196l;
        if (j1Var != null) {
            return j1Var;
        }
        c0(7);
        throw null;
    }

    public abstract void w0(d0 d0Var);
}
