package e.a.a.a.y0.d.a;

import b.q.a.a;
import e.a.a.a.y0.d.b.r;
import e.a.a.a.y0.j.w.c;
import e.j;
import e.t.g;
import e.x.c.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class d {
    public static final v a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<v, e.a.a.a.y0.f.d> f8478b;
    public static final Map<String, e.a.a.a.y0.f.d> c;
    public static final List<e.a.a.a.y0.f.d> d;

    /* renamed from: e  reason: collision with root package name */
    public static final Map<e.a.a.a.y0.f.d, List<e.a.a.a.y0.f.d>> f8479e;
    public static final d f = new d();

    static {
        c cVar = c.INT;
        String j2 = cVar.j();
        i.d(j2, "JvmPrimitiveType.INT.desc");
        v j3 = a.j("java/util/List", "removeAt", j2, "Ljava/lang/Object;");
        a = j3;
        r rVar = r.a;
        String f2 = rVar.f("Number");
        String j4 = c.BYTE.j();
        i.d(j4, "JvmPrimitiveType.BYTE.desc");
        String f3 = rVar.f("Number");
        String j5 = c.SHORT.j();
        i.d(j5, "JvmPrimitiveType.SHORT.desc");
        String f4 = rVar.f("Number");
        String j6 = cVar.j();
        i.d(j6, "JvmPrimitiveType.INT.desc");
        String f5 = rVar.f("Number");
        String j7 = c.LONG.j();
        i.d(j7, "JvmPrimitiveType.LONG.desc");
        String f6 = rVar.f("Number");
        String j8 = c.FLOAT.j();
        i.d(j8, "JvmPrimitiveType.FLOAT.desc");
        String f7 = rVar.f("Number");
        String j9 = c.DOUBLE.j();
        i.d(j9, "JvmPrimitiveType.DOUBLE.desc");
        String f8 = rVar.f("CharSequence");
        String j10 = cVar.j();
        i.d(j10, "JvmPrimitiveType.INT.desc");
        String j11 = c.CHAR.j();
        i.d(j11, "JvmPrimitiveType.CHAR.desc");
        Map<v, e.a.a.a.y0.f.d> E = g.E(new j(a.j(f2, "toByte", "", j4), e.a.a.a.y0.f.d.l("byteValue")), new j(a.j(f3, "toShort", "", j5), e.a.a.a.y0.f.d.l("shortValue")), new j(a.j(f4, "toInt", "", j6), e.a.a.a.y0.f.d.l("intValue")), new j(a.j(f5, "toLong", "", j7), e.a.a.a.y0.f.d.l("longValue")), new j(a.j(f6, "toFloat", "", j8), e.a.a.a.y0.f.d.l("floatValue")), new j(a.j(f7, "toDouble", "", j9), e.a.a.a.y0.f.d.l("doubleValue")), new j(j3, e.a.a.a.y0.f.d.l("remove")), new j(a.j(f8, "get", j10, j11), e.a.a.a.y0.f.d.l("charAt")));
        f8478b = E;
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.q2(E.size()));
        for (Map.Entry entry : E.entrySet()) {
            linkedHashMap.put(((v) entry.getKey()).f8593b, entry.getValue());
        }
        c = linkedHashMap;
        Set<v> keySet = f8478b.keySet();
        ArrayList arrayList = new ArrayList(a.C(keySet, 10));
        for (v vVar : keySet) {
            arrayList.add(vVar.a);
        }
        d = arrayList;
        Set<Map.Entry<v, e.a.a.a.y0.f.d>> entrySet = f8478b.entrySet();
        ArrayList<j> arrayList2 = new ArrayList<>(a.C(entrySet, 10));
        for (Map.Entry entry2 : entrySet) {
            arrayList2.add(new j(((v) entry2.getKey()).a, entry2.getValue()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (j jVar : arrayList2) {
            e.a.a.a.y0.f.d dVar = (e.a.a.a.y0.f.d) jVar.f7907i;
            Object obj = linkedHashMap2.get(dVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap2.put(dVar, obj);
            }
            ((List) obj).add((e.a.a.a.y0.f.d) jVar.f7906h);
        }
        f8479e = linkedHashMap2;
    }
}
