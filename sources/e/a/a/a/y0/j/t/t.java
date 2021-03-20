package e.a.a.a.y0.j.t;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.m.a1;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.e0;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.o1.c;
import e.x.c.i;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class t extends g<a> {

    public static abstract class a {

        /* renamed from: e.a.a.a.y0.j.t.t$a$a  reason: collision with other inner class name */
        public static final class C0211a extends a {
            public final d0 a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0211a(d0 d0Var) {
                super((DefaultConstructorMarker) null);
                i.e(d0Var, "type");
                this.a = d0Var;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C0211a) && i.a(this.a, ((C0211a) obj).a);
                }
                return true;
            }

            public int hashCode() {
                d0 d0Var = this.a;
                if (d0Var != null) {
                    return d0Var.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder y = b.e.a.a.a.y("LocalClass(type=");
                y.append(this.a);
                y.append(")");
                return y.toString();
            }
        }

        public static final class b extends a {
            public final f a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(f fVar) {
                super((DefaultConstructorMarker) null);
                i.e(fVar, "value");
                this.a = fVar;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof b) && i.a(this.a, ((b) obj).a);
                }
                return true;
            }

            public int hashCode() {
                f fVar = this.a;
                if (fVar != null) {
                    return fVar.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder y = b.e.a.a.a.y("NormalClass(value=");
                y.append(this.a);
                y.append(")");
                return y.toString();
            }
        }

        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public t(e.a.a.a.y0.f.a aVar, int i2) {
        this(new f(aVar, i2));
        i.e(aVar, "classId");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t(e.a.a.a.y0.j.t.f r3) {
        /*
            r2 = this;
            java.lang.String r0 = "value"
            e.x.c.i.e(r3, r0)
            e.a.a.a.y0.j.t.t$a$b r1 = new e.a.a.a.y0.j.t.t$a$b
            r1.<init>(r3)
            e.x.c.i.e(r1, r0)
            r2.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.j.t.t.<init>(e.a.a.a.y0.j.t.f):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(a aVar) {
        super(aVar);
        i.e(aVar, "value");
    }

    public d0 a(w wVar) {
        d0 d0Var;
        i.e(wVar, "module");
        Objects.requireNonNull(h.f7785e);
        h hVar = h.a.a;
        g v = wVar.v();
        Objects.requireNonNull(v);
        e i2 = v.i(g.f7647k.W.i());
        if (i2 != null) {
            i.d(i2, "module.builtIns.kClass");
            i.e(wVar, "module");
            T t = this.a;
            a aVar = (a) t;
            if (aVar instanceof a.C0211a) {
                d0Var = ((a.C0211a) t).a;
            } else if (aVar instanceof a.b) {
                f fVar = ((a.b) t).a;
                e.a.a.a.y0.f.a aVar2 = fVar.a;
                int i3 = fVar.f9411b;
                e l0 = b.q.a.a.l0(wVar, aVar2);
                if (l0 != null) {
                    k0 s = l0.s();
                    i.d(s, "descriptor.defaultType");
                    d0 Z = c.Z(s);
                    for (int i4 = 0; i4 < i3; i4++) {
                        Z = wVar.v().h(j1.INVARIANT, Z);
                        i.d(Z, "module.builtIns.getArray…Variance.INVARIANT, type)");
                    }
                    d0Var = Z;
                } else {
                    d0Var = e.a.a.a.y0.m.w.d("Unresolved type: " + aVar2 + " (arrayDimensions=" + i3 + ')');
                    i.d(d0Var, "ErrorUtils.createErrorTy…sions=$arrayDimensions)\")");
                }
            } else {
                throw new e.h();
            }
            return e0.e(hVar, i2, b.q.a.a.l2(new a1(d0Var)));
        }
        g.a(23);
        throw null;
    }
}
