package e.a.a.a.y0.d.a;

import e.a.a.a.y0.b.s;
import e.a.a.a.y0.d.b.r;
import e.a.a.a.y0.f.d;
import e.j;
import e.t.g;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class e {
    public static final List<v> a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f8483b;
    public static final Map<v, b> c;
    public static final Map<String, b> d;

    /* renamed from: e  reason: collision with root package name */
    public static final Set<d> f8484e;
    public static final Set<String> f;

    /* renamed from: g  reason: collision with root package name */
    public static final e f8485g = new e();

    public enum a {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC((String) null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

        /* access modifiers changed from: public */
        a(String str, boolean z) {
        }
    }

    public enum b {
        NULL((String) null),
        INDEX(-1),
        FALSE(Boolean.FALSE);
        

        /* renamed from: h  reason: collision with root package name */
        public final Object f8495h;

        public static final class a extends b {
            public a(String str, int i2) {
                super(str, i2, (Object) null, (DefaultConstructorMarker) null);
            }
        }

        /* access modifiers changed from: public */
        b(Object obj) {
            this.f8495h = obj;
        }

        /* access modifiers changed from: public */
        b(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class c extends k implements l<e.a.a.a.y0.b.b, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public static final c f8496h = new c();

        public c() {
            super(1);
        }

        public Object invoke(Object obj) {
            e.a.a.a.y0.b.b bVar = (e.a.a.a.y0.b.b) obj;
            i.e(bVar, "it");
            e eVar = e.f8485g;
            return Boolean.valueOf(g.e(e.f, b.q.a.a.I(bVar)));
        }
    }

    static {
        Set<String> M = g.M("containsAll", "removeAll", "retainAll");
        ArrayList<v> arrayList = new ArrayList<>(b.q.a.a.C(M, 10));
        for (String j2 : M) {
            String j3 = e.a.a.a.y0.j.w.c.BOOLEAN.j();
            i.d(j3, "JvmPrimitiveType.BOOLEAN.desc");
            arrayList.add(b.q.a.a.j("java/util/Collection", j2, "Ljava/util/Collection;", j3));
        }
        a = arrayList;
        ArrayList arrayList2 = new ArrayList(b.q.a.a.C(arrayList, 10));
        for (v vVar : arrayList) {
            arrayList2.add(vVar.f8593b);
        }
        f8483b = arrayList2;
        List<v> list = a;
        ArrayList arrayList3 = new ArrayList(b.q.a.a.C(list, 10));
        for (v vVar2 : list) {
            arrayList3.add(vVar2.a.e());
        }
        r rVar = r.a;
        String g2 = rVar.g("Collection");
        e.a.a.a.y0.j.w.c cVar = e.a.a.a.y0.j.w.c.BOOLEAN;
        String j4 = cVar.j();
        i.d(j4, "JvmPrimitiveType.BOOLEAN.desc");
        v j5 = b.q.a.a.j(g2, "contains", "Ljava/lang/Object;", j4);
        b bVar = b.FALSE;
        String g3 = rVar.g("Collection");
        String j6 = cVar.j();
        i.d(j6, "JvmPrimitiveType.BOOLEAN.desc");
        String g4 = rVar.g("Map");
        String j7 = cVar.j();
        i.d(j7, "JvmPrimitiveType.BOOLEAN.desc");
        String g5 = rVar.g("Map");
        String j8 = cVar.j();
        i.d(j8, "JvmPrimitiveType.BOOLEAN.desc");
        String g6 = rVar.g("Map");
        String j9 = cVar.j();
        i.d(j9, "JvmPrimitiveType.BOOLEAN.desc");
        v j10 = b.q.a.a.j(rVar.g("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        b bVar2 = b.NULL;
        String g7 = rVar.g("List");
        e.a.a.a.y0.j.w.c cVar2 = e.a.a.a.y0.j.w.c.INT;
        String j11 = cVar2.j();
        i.d(j11, "JvmPrimitiveType.INT.desc");
        v j12 = b.q.a.a.j(g7, "indexOf", "Ljava/lang/Object;", j11);
        b bVar3 = b.INDEX;
        String g8 = rVar.g("List");
        String j13 = cVar2.j();
        i.d(j13, "JvmPrimitiveType.INT.desc");
        Map<v, b> E = g.E(new j(j5, bVar), new j(b.q.a.a.j(g3, "remove", "Ljava/lang/Object;", j6), bVar), new j(b.q.a.a.j(g4, "containsKey", "Ljava/lang/Object;", j7), bVar), new j(b.q.a.a.j(g5, "containsValue", "Ljava/lang/Object;", j8), bVar), new j(b.q.a.a.j(g6, "remove", "Ljava/lang/Object;Ljava/lang/Object;", j9), bVar), new j(b.q.a.a.j(rVar.g("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), b.f8493l), new j(j10, bVar2), new j(b.q.a.a.j(rVar.g("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), bVar2), new j(j12, bVar3), new j(b.q.a.a.j(g8, "lastIndexOf", "Ljava/lang/Object;", j13), bVar3));
        c = E;
        LinkedHashMap linkedHashMap = new LinkedHashMap(b.q.a.a.q2(E.size()));
        for (Map.Entry entry : E.entrySet()) {
            linkedHashMap.put(((v) entry.getKey()).f8593b, entry.getValue());
        }
        d = linkedHashMap;
        Set<T> K = g.K(c.keySet(), a);
        ArrayList arrayList4 = new ArrayList(b.q.a.a.C(K, 10));
        for (T t : K) {
            arrayList4.add(t.a);
        }
        f8484e = g.d0(arrayList4);
        ArrayList arrayList5 = new ArrayList(b.q.a.a.C(K, 10));
        for (T t2 : K) {
            arrayList5.add(t2.f8593b);
        }
        f = g.d0(arrayList5);
    }

    public static final s a(s sVar) {
        i.e(sVar, "functionDescriptor");
        d name = sVar.getName();
        i.d(name, "functionDescriptor.name");
        i.e(name, "$this$sameAsBuiltinMethodWithErasedValueParameters");
        if (!f8484e.contains(name)) {
            return null;
        }
        return (s) e.a.a.a.y0.j.v.b.c(sVar, false, c.f8496h, 1);
    }

    public final boolean b(d dVar) {
        i.e(dVar, "$this$sameAsBuiltinMethodWithErasedValueParameters");
        return f8484e.contains(dVar);
    }
}
