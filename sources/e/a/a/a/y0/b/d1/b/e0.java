package e.a.a.a.y0.b.d1.b;

import e.a.a.a.y0.d.a.d0.a;
import e.a.a.a.y0.d.a.d0.w;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.d;
import e.t.g;
import e.t.o;
import e.x.c.i;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;

public final class e0 extends u implements f, w {
    public final TypeVariable<?> a;

    public e0(TypeVariable<?> typeVariable) {
        i.e(typeVariable, "typeVariable");
        this.a = typeVariable;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e0) && i.a(this.a, ((e0) obj).a);
    }

    public d getName() {
        d l2 = d.l(this.a.getName());
        i.d(l2, "Name.identifier(typeVariable.name)");
        return l2;
    }

    public Collection getUpperBounds() {
        Type[] bounds = this.a.getBounds();
        i.d(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type sVar : bounds) {
            arrayList.add(new s(sVar));
        }
        s sVar2 = (s) g.Q(arrayList);
        return i.a(sVar2 != null ? sVar2.f8305b : null, Object.class) ? o.f7934h : arrayList;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public a i(b bVar) {
        i.e(bVar, "fqName");
        return b.q.a.a.j0(this, bVar);
    }

    public Collection k() {
        return b.q.a.a.v0(this);
    }

    public AnnotatedElement m() {
        TypeVariable<?> typeVariable = this.a;
        if (!(typeVariable instanceof AnnotatedElement)) {
            typeVariable = null;
        }
        return (AnnotatedElement) typeVariable;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        b.e.a.a.a.I(e0.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }

    public boolean u() {
        return false;
    }
}
