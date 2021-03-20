package b.j.a.c.h0.s;

import b.j.a.c.i;
import b.j.a.c.j0.b0;
import b.j.a.c.n;
import java.util.Map;

public final class m {
    public final a[] a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2072b;

    public static final class a {
        public final n<Object> a;

        /* renamed from: b  reason: collision with root package name */
        public final a f2073b;
        public final Class<?> c;
        public final i d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f2074e;

        public a(a aVar, b0 b0Var, n<Object> nVar) {
            this.f2073b = aVar;
            this.a = nVar;
            this.f2074e = b0Var.d;
            this.c = b0Var.f2200b;
            this.d = b0Var.c;
        }
    }

    public m(Map<b0, n<Object>> map) {
        int size = map.size();
        int i2 = 8;
        while (i2 < (size <= 64 ? size + size : size + (size >> 2))) {
            i2 += i2;
        }
        this.f2072b = i2 - 1;
        a[] aVarArr = new a[i2];
        for (Map.Entry next : map.entrySet()) {
            b0 b0Var = (b0) next.getKey();
            int i3 = b0Var.a & this.f2072b;
            aVarArr[i3] = new a(aVarArr[i3], b0Var, (n) next.getValue());
        }
        this.a = aVarArr;
    }

    public n<Object> a(i iVar) {
        boolean z;
        a aVar = this.a[(iVar.f2153i - 1) & this.f2072b];
        if (aVar == null) {
            return null;
        }
        if (!aVar.f2074e && iVar.equals(aVar.d)) {
            return aVar.a;
        }
        do {
            aVar = aVar.f2073b;
            if (aVar == null) {
                return null;
            }
            if (aVar.f2074e || !iVar.equals(aVar.d)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
        } while (!z);
        return aVar.a;
    }

    public n<Object> b(Class<?> cls) {
        boolean z;
        a aVar = this.a[cls.getName().hashCode() & this.f2072b];
        if (aVar == null) {
            return null;
        }
        if (aVar.c == cls && !aVar.f2074e) {
            return aVar.a;
        }
        do {
            aVar = aVar.f2073b;
            if (aVar == null) {
                return null;
            }
            if (aVar.c != cls || aVar.f2074e) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
        } while (!z);
        return aVar.a;
    }
}
