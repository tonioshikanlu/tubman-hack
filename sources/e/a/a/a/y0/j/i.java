package e.a.a.a.y0.j;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.j;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.q0;
import e.a.a.a.y0.b.s;
import java.util.Comparator;

public class i implements Comparator<k> {

    /* renamed from: h  reason: collision with root package name */
    public static final i f9391h = new i();

    public static int a(k kVar) {
        if (g.r(kVar)) {
            return 8;
        }
        if (kVar instanceof j) {
            return 7;
        }
        if (kVar instanceof f0) {
            return ((f0) kVar).U() == null ? 6 : 5;
        }
        if (kVar instanceof s) {
            return ((s) kVar).U() == null ? 4 : 3;
        }
        if (kVar instanceof e) {
            return 2;
        }
        return kVar instanceof q0 ? 1 : 0;
    }

    public int compare(Object obj, Object obj2) {
        Integer num;
        k kVar = (k) obj;
        k kVar2 = (k) obj2;
        int a = a(kVar2) - a(kVar);
        if (a != 0) {
            num = Integer.valueOf(a);
        } else if (!g.r(kVar) || !g.r(kVar2)) {
            int compareTo = kVar.getName().f9210h.compareTo(kVar2.getName().f9210h);
            num = compareTo != 0 ? Integer.valueOf(compareTo) : null;
        } else {
            num = 0;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
