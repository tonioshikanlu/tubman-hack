package e.a.a.a.y0.m;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.p0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.j.g;
import e.a.a.a.y0.l.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class n extends b implements v0 {
    public final e c;
    public final List<r0> d;

    /* renamed from: e  reason: collision with root package name */
    public final Collection<d0> f9733e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(e eVar, List<? extends r0> list, Collection<d0> collection, m mVar) {
        super(mVar);
        if (list == null) {
            n(1);
            throw null;
        } else if (collection == null) {
            n(2);
            throw null;
        } else if (mVar != null) {
            this.c = eVar;
            this.d = Collections.unmodifiableList(new ArrayList(list));
            this.f9733e = Collections.unmodifiableCollection(collection);
        } else {
            n(3);
            throw null;
        }
    }

    public static /* synthetic */ void n(int i2) {
        String str = (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : 3)];
        switch (i2) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i2 == 4) {
            objArr[1] = "getParameters";
        } else if (i2 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i2 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i2 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (!(i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public boolean b() {
        return true;
    }

    public Collection<d0> f() {
        Collection<d0> collection = this.f9733e;
        if (collection != null) {
            return collection;
        }
        n(6);
        throw null;
    }

    public List<r0> g() {
        List<r0> list = this.d;
        if (list != null) {
            return list;
        }
        n(4);
        throw null;
    }

    public p0 k() {
        return p0.a.a;
    }

    public e o() {
        e eVar = this.c;
        if (eVar != null) {
            return eVar;
        }
        n(5);
        throw null;
    }

    public String toString() {
        return g.g(this.c).b();
    }
}
