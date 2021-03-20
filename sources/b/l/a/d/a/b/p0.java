package b.l.a.d.a.b;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final /* synthetic */ class p0 implements u0 {
    public final v0 a;

    /* renamed from: b  reason: collision with root package name */
    public final List f4596b;

    public p0(v0 v0Var, List list) {
        this.a = v0Var;
        this.f4596b = list;
    }

    public final Object a() {
        v0 v0Var = this.a;
        List list = this.f4596b;
        Objects.requireNonNull(v0Var);
        HashMap hashMap = new HashMap();
        for (s0 next : v0Var.f4639e.values()) {
            String str = next.c.a;
            if (list.contains(str)) {
                s0 s0Var = (s0) hashMap.get(str);
                if ((s0Var == null ? -1 : s0Var.a) < next.a) {
                    hashMap.put(str, next);
                }
            }
        }
        return hashMap;
    }
}
