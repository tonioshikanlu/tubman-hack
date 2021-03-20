package e.a;

import b.q.a.a;
import e.a.a.a.y0.m.o1.c;
import e.b0.h;
import e.b0.s;
import e.t.g;
import e.x.c.i;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class u {
    public static final String a(Type type) {
        String str;
        Object next;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            h B = c.B(type, t.f7878q);
            StringBuilder sb = new StringBuilder();
            i.e(B, "$this$last");
            Iterator it = B.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                sb.append(((Class) next).getName());
                sb.append(e.c0.h.u("[]", s.a(B)));
                str = sb.toString();
            } else {
                throw new NoSuchElementException("Sequence is empty.");
            }
        } else {
            str = cls.getName();
        }
        i.d(str, "if (type.isArray) {\n    …\n        } else type.name");
        return str;
    }

    public static final Type b(n nVar, boolean z) {
        f b2 = nVar.b();
        if (b2 instanceof o) {
            return new s((o) b2);
        }
        if (b2 instanceof e) {
            e eVar = (e) b2;
            Class O0 = z ? a.O0(eVar) : a.L0(eVar);
            List<p> a = nVar.a();
            if (a.isEmpty()) {
                return O0;
            }
            if (!O0.isArray()) {
                return d(O0, a);
            }
            if (O0.getComponentType().isPrimitive()) {
                return O0;
            }
            p pVar = (p) g.Q(a);
            if (pVar != null) {
                q qVar = pVar.a;
                n nVar2 = pVar.f7868b;
                if (qVar == null) {
                    return O0;
                }
                int ordinal = qVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        return O0;
                    }
                    if (ordinal != 2) {
                        throw new e.h();
                    }
                }
                i.c(nVar2);
                Type c = c(nVar2, false, 1);
                return c instanceof Class ? O0 : new b(c);
            }
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + nVar);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + nVar);
    }

    public static /* synthetic */ Type c(n nVar, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return b(nVar, z);
    }

    public static final Type d(Class<?> cls, List<p> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(a.C(list, 10));
            for (p e2 : list) {
                arrayList.add(e(e2));
            }
            return new r(cls, (Type) null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(a.C(list, 10));
            for (p e3 : list) {
                arrayList2.add(e(e3));
            }
            return new r(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type d = d(declaringClass, list.subList(length, list.size()));
            List<p> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(a.C(subList, 10));
            for (p e4 : subList) {
                arrayList3.add(e(e4));
            }
            return new r(cls, d, arrayList3);
        }
    }

    public static final Type e(p pVar) {
        q qVar = pVar.a;
        if (qVar == null) {
            return v.f7879j;
        }
        n nVar = pVar.f7868b;
        i.c(nVar);
        int ordinal = qVar.ordinal();
        if (ordinal == 0) {
            return b(nVar, true);
        }
        if (ordinal == 1) {
            return new v((Type) null, b(nVar, true));
        }
        if (ordinal == 2) {
            return new v(b(nVar, true), (Type) null);
        }
        throw new e.h();
    }
}
