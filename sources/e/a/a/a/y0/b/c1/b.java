package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.j.y.g;
import e.a.a.a.y0.l.i;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.m.b1;
import e.a.a.a.y0.m.d1;
import e.a.a.a.y0.m.f1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.l1.f;

public abstract class b extends v {

    /* renamed from: h  reason: collision with root package name */
    public final d f8163h;

    /* renamed from: i  reason: collision with root package name */
    public final i<k0> f8164i;

    /* renamed from: j  reason: collision with root package name */
    public final i<e.a.a.a.y0.j.y.i> f8165j;

    /* renamed from: k  reason: collision with root package name */
    public final i<i0> f8166k;

    public class a implements e.x.b.a<k0> {
        public a() {
        }

        public Object e() {
            b bVar = b.this;
            return f1.o(bVar, bVar.G0(), new a(this));
        }
    }

    /* renamed from: e.a.a.a.y0.b.c1.b$b  reason: collision with other inner class name */
    public class C0165b implements e.x.b.a<e.a.a.a.y0.j.y.i> {
        public C0165b() {
        }

        public Object e() {
            return new g(b.this.G0());
        }
    }

    public class c implements e.x.b.a<i0> {
        public c() {
        }

        public Object e() {
            return new s(b.this);
        }
    }

    public b(m mVar, d dVar) {
        if (mVar == null) {
            j0(0);
            throw null;
        } else if (dVar != null) {
            this.f8163h = dVar;
            this.f8164i = mVar.a(new a());
            this.f8165j = mVar.a(new C0165b());
            this.f8166k = mVar.a(new c());
        } else {
            j0(1);
            throw null;
        }
    }

    public static /* synthetic */ void j0(int i2) {
        int i3 = i2;
        String str = (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5 || i3 == 8 || i3 == 11 || i3 == 13 || i3 == 15 || i3 == 16 || i3 == 18 || i3 == 19) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5 || i3 == 8 || i3 == 11 || i3 == 13 || i3 == 15 || i3 == 16 || i3 == 18 || i3 == 19) ? 2 : 3)];
        switch (i3) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 6:
            case 12:
                objArr[0] = "typeArguments";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 9:
            case 14:
                objArr[0] = "typeSubstitution";
                break;
            case 17:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i3 == 2) {
            objArr[1] = "getName";
        } else if (i3 == 3) {
            objArr[1] = "getOriginal";
        } else if (i3 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i3 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i3 == 8 || i3 == 11 || i3 == 13 || i3 == 15) {
            objArr[1] = "getMemberScope";
        } else if (i3 == 16) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i3 == 18) {
            objArr[1] = "substitute";
        } else if (i3 != 19) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i3) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 19:
                break;
            case 6:
            case 7:
            case 9:
            case 10:
            case 12:
            case 14:
                objArr[2] = "getMemberScope";
                break;
            case 17:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5 || i3 == 8 || i3 == 11 || i3 == 13 || i3 == 15 || i3 == 16 || i3 == 18 || i3 == 19) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public e.a.a.a.y0.j.y.i C(b1 b1Var) {
        e.a.a.a.y0.j.y.i c0 = c0(b1Var, e.a.a.a.y0.j.v.b.j(e.a.a.a.y0.j.g.d(this)));
        if (c0 != null) {
            return c0;
        }
        j0(15);
        throw null;
    }

    public e.a.a.a.y0.j.y.i G0() {
        e.a.a.a.y0.j.y.i e0 = e0(e.a.a.a.y0.j.v.b.j(e.a.a.a.y0.j.g.d(this)));
        if (e0 != null) {
            return e0;
        }
        j0(16);
        throw null;
    }

    public i0 U0() {
        i0 i0Var = (i0) this.f8166k.e();
        if (i0Var != null) {
            return i0Var;
        }
        j0(5);
        throw null;
    }

    public e a() {
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public h m23a() {
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public k m24a() {
        return this;
    }

    public e.a.a.a.y0.j.y.i c0(b1 b1Var, f fVar) {
        if (b1Var == null) {
            j0(9);
            throw null;
        } else if (fVar == null) {
            j0(10);
            throw null;
        } else if (b1Var.f()) {
            e.a.a.a.y0.j.y.i e0 = e0(fVar);
            if (e0 != null) {
                return e0;
            }
            j0(11);
            throw null;
        } else {
            return new e.a.a.a.y0.j.y.m(e0(fVar), d1.e(b1Var));
        }
    }

    public d getName() {
        d dVar = this.f8163h;
        if (dVar != null) {
            return dVar;
        }
        j0(2);
        throw null;
    }

    public <R, D> R l0(e.a.a.a.y0.b.m<R, D> mVar, D d) {
        return mVar.a(this, d);
    }

    public k0 s() {
        k0 k0Var = (k0) this.f8164i.e();
        if (k0Var != null) {
            return k0Var;
        }
        j0(19);
        throw null;
    }

    public e.a.a.a.y0.j.y.i v0() {
        e.a.a.a.y0.j.y.i iVar = (e.a.a.a.y0.j.y.i) this.f8165j.e();
        if (iVar != null) {
            return iVar;
        }
        j0(4);
        throw null;
    }

    /* renamed from: w0 */
    public e c(d1 d1Var) {
        if (d1Var != null) {
            return d1Var.h() ? this : new u(this, d1Var);
        }
        j0(17);
        throw null;
    }
}
