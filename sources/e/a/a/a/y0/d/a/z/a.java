package e.a.a.a.y0.d.a.z;

import e.a.a.a.y0.b.b;
import e.a.a.a.y0.j.j;
import e.a.a.a.y0.k.b.p;
import e.r;
import e.x.b.l;
import java.util.Collection;
import java.util.Set;

public final class a extends j {
    public final /* synthetic */ p a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Set f8597b;
    public final /* synthetic */ boolean c;

    /* renamed from: e.a.a.a.y0.d.a.z.a$a  reason: collision with other inner class name */
    public class C0179a implements l<b, r> {
        public C0179a() {
        }

        public Object invoke(Object obj) {
            b bVar = (b) obj;
            if (bVar != null) {
                a.this.a.b(bVar);
                return r.a;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"}));
        }
    }

    public a(p pVar, Set set, boolean z) {
        this.a = pVar;
        this.f8597b = set;
        this.c = z;
    }

    public static /* synthetic */ void f(int i2) {
        Object[] objArr = new Object[3];
        if (i2 == 1) {
            objArr[0] = "fromSuper";
        } else if (i2 == 2) {
            objArr[0] = "fromCurrent";
        } else if (i2 == 3) {
            objArr[0] = "member";
        } else if (i2 != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i2 == 1 || i2 == 2) {
            objArr[2] = "conflict";
        } else if (i2 == 3 || i2 == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void a(b bVar) {
        if (bVar != null) {
            e.a.a.a.y0.j.l.r(bVar, new C0179a());
            this.f8597b.add(bVar);
            return;
        }
        f(0);
        throw null;
    }

    public void d(b bVar, Collection<? extends b> collection) {
        if (bVar == null) {
            f(3);
            throw null;
        } else if (!this.c || bVar.i() == b.a.FAKE_OVERRIDE) {
            super.d(bVar, collection);
        }
    }

    public void e(b bVar, b bVar2) {
    }
}
