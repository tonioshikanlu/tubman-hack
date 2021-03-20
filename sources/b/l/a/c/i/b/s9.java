package b.l.a.c.i.b;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import b.l.a.c.f.i.b2;
import b.l.a.c.f.i.c2;
import b.l.a.c.f.i.d2;
import b.l.a.c.f.i.e2;
import b.l.a.c.f.i.f9;
import b.l.a.c.f.i.i1;
import b.l.a.c.f.i.j1;
import b.l.a.c.f.i.k1;
import b.l.a.c.f.i.l1;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class s9 {
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4270b;
    public c2 c;
    public BitSet d;

    /* renamed from: e  reason: collision with root package name */
    public BitSet f4271e;
    public Map<Integer, Long> f;

    /* renamed from: g  reason: collision with root package name */
    public Map<Integer, List<Long>> f4272g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ x9 f4273h;

    public /* synthetic */ s9(x9 x9Var, String str) {
        this.f4273h = x9Var;
        this.a = str;
        this.f4270b = true;
        this.d = new BitSet();
        this.f4271e = new BitSet();
        this.f = new ArrayMap();
        this.f4272g = new ArrayMap();
    }

    public /* synthetic */ s9(x9 x9Var, String str, c2 c2Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.f4273h = x9Var;
        this.a = str;
        this.d = bitSet;
        this.f4271e = bitSet2;
        this.f = map;
        this.f4272g = new ArrayMap();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f4272g.put(num, arrayList);
        }
        this.f4270b = false;
        this.c = c2Var;
    }

    public final void a(@NonNull v9 v9Var) {
        int a2 = v9Var.a();
        Boolean bool = v9Var.c;
        if (bool != null) {
            this.f4271e.set(a2, bool.booleanValue());
        }
        Boolean bool2 = v9Var.d;
        if (bool2 != null) {
            this.d.set(a2, bool2.booleanValue());
        }
        if (v9Var.f4324e != null) {
            Map<Integer, Long> map = this.f;
            Integer valueOf = Integer.valueOf(a2);
            Long l2 = map.get(valueOf);
            long longValue = v9Var.f4324e.longValue() / 1000;
            if (l2 == null || longValue > l2.longValue()) {
                this.f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (v9Var.f != null) {
            Map<Integer, List<Long>> map2 = this.f4272g;
            Integer valueOf2 = Integer.valueOf(a2);
            List list = map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f4272g.put(valueOf2, list);
            }
            if (v9Var.b()) {
                list.clear();
            }
            f9.b();
            f fVar = this.f4273h.a.f4114g;
            String str = this.a;
            w2<Boolean> w2Var = x2.b0;
            if (fVar.r(str, w2Var) && v9Var.c()) {
                list.clear();
            }
            f9.b();
            boolean r = this.f4273h.a.f4114g.r(this.a, w2Var);
            Long valueOf3 = Long.valueOf(v9Var.f.longValue() / 1000);
            if (!r) {
                list.add(valueOf3);
            } else if (!list.contains(valueOf3)) {
                list.add(valueOf3);
            }
        }
    }

    @NonNull
    public final j1 b(int i2) {
        ArrayList arrayList;
        List list;
        i1 z = j1.z();
        if (z.f3655j) {
            z.j();
            z.f3655j = false;
        }
        j1.B((j1) z.f3654i, i2);
        boolean z2 = this.f4270b;
        if (z.f3655j) {
            z.j();
            z.f3655j = false;
        }
        j1.E((j1) z.f3654i, z2);
        c2 c2Var = this.c;
        if (c2Var != null) {
            if (z.f3655j) {
                z.j();
                z.f3655j = false;
            }
            j1.D((j1) z.f3654i, c2Var);
        }
        b2 C = c2.C();
        List<Long> B = f9.B(this.d);
        if (C.f3655j) {
            C.j();
            C.f3655j = false;
        }
        c2.H((c2) C.f3654i, B);
        List<Long> B2 = f9.B(this.f4271e);
        if (C.f3655j) {
            C.j();
            C.f3655j = false;
        }
        c2.F((c2) C.f3654i, B2);
        Map<Integer, Long> map = this.f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.f.keySet()) {
                int intValue2 = intValue.intValue();
                Long l2 = this.f.get(Integer.valueOf(intValue2));
                if (l2 != null) {
                    k1 w = l1.w();
                    if (w.f3655j) {
                        w.j();
                        w.f3655j = false;
                    }
                    l1.y((l1) w.f3654i, intValue2);
                    long longValue = l2.longValue();
                    if (w.f3655j) {
                        w.j();
                        w.f3655j = false;
                    }
                    l1.z((l1) w.f3654i, longValue);
                    arrayList2.add((l1) w.g());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            if (C.f3655j) {
                C.j();
                C.f3655j = false;
            }
            c2.J((c2) C.f3654i, arrayList);
        }
        Map<Integer, List<Long>> map2 = this.f4272g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer next : this.f4272g.keySet()) {
                d2 x = e2.x();
                int intValue3 = next.intValue();
                if (x.f3655j) {
                    x.j();
                    x.f3655j = false;
                }
                e2.z((e2) x.f3654i, intValue3);
                List list2 = this.f4272g.get(next);
                if (list2 != null) {
                    Collections.sort(list2);
                    if (x.f3655j) {
                        x.j();
                        x.f3655j = false;
                    }
                    e2.A((e2) x.f3654i, list2);
                }
                arrayList3.add((e2) x.g());
            }
            list = arrayList3;
        }
        if (C.f3655j) {
            C.j();
            C.f3655j = false;
        }
        c2.L((c2) C.f3654i, list);
        if (z.f3655j) {
            z.j();
            z.f3655j = false;
        }
        j1.C((j1) z.f3654i, (c2) C.g());
        return (j1) z.g();
    }
}
