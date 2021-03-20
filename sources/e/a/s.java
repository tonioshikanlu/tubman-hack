package e.a;

import b.q.a.a;
import e.x.c.i;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class s implements TypeVariable<GenericDeclaration>, Object {

    /* renamed from: h  reason: collision with root package name */
    public final o f7877h;

    public s(o oVar) {
        i.e(oVar, "typeParameter");
        this.f7877h = oVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !i.a(getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    public Type[] getBounds() {
        List<n> upperBounds = this.f7877h.getUpperBounds();
        ArrayList arrayList = new ArrayList(a.C(upperBounds, 10));
        for (n b2 : upperBounds) {
            arrayList.add(u.b(b2, true));
        }
        Object[] array = arrayList.toArray(new Type[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (Type[]) array;
    }

    public GenericDeclaration getGenericDeclaration() {
        StringBuilder y = b.e.a.a.a.y("getGenericDeclaration() is not yet supported for type variables created from KType: ");
        y.append(this.f7877h);
        throw new e.i(b.e.a.a.a.m("An operation is not implemented: ", y.toString()));
    }

    public String getName() {
        return this.f7877h.getName();
    }

    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    public String toString() {
        return getName();
    }
}
