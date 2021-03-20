package e.x.c;

import e.x.b.l;
import e.x.c.z.a;
import java.util.Set;

public class y {
    public static Set a(Object obj) {
        if (!(obj instanceof a)) {
            try {
                return (Set) obj;
            } catch (ClassCastException e2) {
                i.j(e2, y.class.getName());
                throw e2;
            }
        } else {
            c(obj, "kotlin.collections.MutableSet");
            throw null;
        }
    }

    public static Object b(Object obj, int i2) {
        boolean z = true;
        if ((obj instanceof f ? ((f) obj).getArity() : obj instanceof e.x.b.a ? 0 : obj instanceof l ? 1 : 2) != i2) {
            z = false;
        }
        if (z) {
            return obj;
        }
        c(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static void c(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(b.e.a.a.a.n(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        i.j(classCastException, y.class.getName());
        throw classCastException;
    }
}
