package e.a.a.a;

import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.k.b.g0.f;
import e.a.a.a.y0.k.b.g0.g;
import e.a.a.a.y0.m.d0;
import e.a.l;
import e.a.n;
import e.a.o;
import e.h;
import e.r;
import e.x.c.i;
import e.x.c.k;
import e.x.c.q;
import e.x.c.v;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class j0 implements o {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ l[] f7553k = {v.c(new q(v.a(j0.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: h  reason: collision with root package name */
    public final n0 f7554h = b.q.a.a.k2(new a(this));

    /* renamed from: i  reason: collision with root package name */
    public final k0 f7555i;

    /* renamed from: j  reason: collision with root package name */
    public final r0 f7556j;

    public static final class a extends k implements e.x.b.a<List<? extends i0>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ j0 f7557h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var) {
            super(0);
            this.f7557h = j0Var;
        }

        public Object e() {
            List<d0> upperBounds = this.f7557h.f7556j.getUpperBounds();
            i.d(upperBounds, "descriptor.upperBounds");
            ArrayList arrayList = new ArrayList(b.q.a.a.C(upperBounds, 10));
            for (d0 i0Var : upperBounds) {
                arrayList.add(new i0(i0Var, (e.x.b.a<? extends Type>) null));
            }
            return arrayList;
        }
    }

    public j0(k0 k0Var, r0 r0Var) {
        Object obj;
        a<?> aVar;
        Class<?> cls;
        i.e(r0Var, "descriptor");
        this.f7556j = r0Var;
        if (k0Var == null) {
            e.a.a.a.y0.b.k b2 = r0Var.b();
            i.d(b2, "descriptor.containingDeclaration");
            if (b2 instanceof e) {
                obj = a((e) b2);
            } else if (b2 instanceof b) {
                e.a.a.a.y0.b.k b3 = ((b) b2).b();
                i.d(b3, "declaration.containingDeclaration");
                if (b3 instanceof e) {
                    aVar = a((e) b3);
                } else {
                    e.a.a.a.y0.d.b.l lVar = null;
                    g gVar = (g) (!(b2 instanceof g) ? null : b2);
                    if (gVar != null) {
                        f F = gVar.F();
                        e.a.a.a.y0.d.b.g gVar2 = (e.a.a.a.y0.d.b.g) (!(F instanceof e.a.a.a.y0.d.b.g) ? null : F);
                        e.a.a.a.y0.d.b.l lVar2 = gVar2 != null ? gVar2.d : null;
                        e.a.a.a.y0.b.d1.a.e eVar = (e.a.a.a.y0.b.d1.a.e) (lVar2 instanceof e.a.a.a.y0.b.d1.a.e ? lVar2 : lVar);
                        if (eVar == null || (cls = eVar.a) == null) {
                            throw new l0("Container of deserialized member is not resolved: " + gVar);
                        }
                        e.a.e<?> U0 = b.q.a.a.U0(cls);
                        Objects.requireNonNull(U0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                        aVar = (a) U0;
                    } else {
                        throw new l0("Non-class callable descriptor must be deserialized: " + b2);
                    }
                }
                obj = b2.l0(new c(aVar), r.a);
                i.d(obj, "declaration.accept(Creat…bleContainerClass), Unit)");
            } else {
                throw new l0("Unknown type parameter container: " + b2);
            }
            k0Var = (k0) obj;
        }
        this.f7555i = k0Var;
    }

    public final a<?> a(e eVar) {
        Class<?> j2 = v0.j(eVar);
        a<?> aVar = (a) (j2 != null ? b.q.a.a.U0(j2) : null);
        if (aVar != null) {
            return aVar;
        }
        StringBuilder y = b.e.a.a.a.y("Type parameter container is not resolved: ");
        y.append(eVar.b());
        throw new l0(y.toString());
    }

    public boolean equals(Object obj) {
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            return i.a(this.f7555i, j0Var.f7555i) && i.a(getName(), j0Var.getName());
        }
    }

    public String getName() {
        String e2 = this.f7556j.getName().e();
        i.d(e2, "descriptor.name.asString()");
        return e2;
    }

    public List<n> getUpperBounds() {
        n0 n0Var = this.f7554h;
        l lVar = f7553k[0];
        return (List) n0Var.e();
    }

    public int hashCode() {
        return getName().hashCode() + (this.f7555i.hashCode() * 31);
    }

    public String toString() {
        String str;
        i.e(this, "typeParameter");
        StringBuilder sb = new StringBuilder();
        int ordinal = u().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                str = "out ";
            }
            sb.append(getName());
            String sb2 = sb.toString();
            i.d(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        str = "in ";
        sb.append(str);
        sb.append(getName());
        String sb22 = sb.toString();
        i.d(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public e.a.q u() {
        int ordinal = this.f7556j.u().ordinal();
        if (ordinal == 0) {
            return e.a.q.INVARIANT;
        }
        if (ordinal == 1) {
            return e.a.q.IN;
        }
        if (ordinal == 2) {
            return e.a.q.OUT;
        }
        throw new h();
    }
}
