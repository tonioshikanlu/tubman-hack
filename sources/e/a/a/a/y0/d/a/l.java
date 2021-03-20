package e.a.a.a.y0.d.a;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.f.b;
import e.x.c.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class l {
    public static final HashMap<b, b> a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final l f8574b = null;

    static {
        g.d dVar = g.f7647k;
        b bVar = dVar.R;
        i.d(bVar, "FQ_NAMES.mutableList");
        b(bVar, a("java.util.ArrayList", "java.util.LinkedList"));
        b bVar2 = dVar.T;
        i.d(bVar2, "FQ_NAMES.mutableSet");
        b(bVar2, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b bVar3 = dVar.U;
        i.d(bVar3, "FQ_NAMES.mutableMap");
        b(bVar3, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b(new b("java.util.function.Function"), a("java.util.function.UnaryOperator"));
        b(new b("java.util.function.BiFunction"), a("java.util.function.BinaryOperator"));
    }

    public static final List<b> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String bVar : strArr) {
            arrayList.add(new b(bVar));
        }
        return arrayList;
    }

    public static final void b(b bVar, List<b> list) {
        HashMap<b, b> hashMap = a;
        for (T next : list) {
            b bVar2 = (b) next;
            hashMap.put(next, bVar);
        }
    }
}
