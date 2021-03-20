package b.l.a.c.f.e;

import b.l.a.c.f.e.jn;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class kn<T extends jn<T>> {
    public static final kn d = new kn(true);
    public final z0<T, Object> a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3116b;
    public boolean c;

    public kn() {
        this.a = new r0(16);
    }

    public kn(boolean z) {
        r0 r0Var = new r0(0);
        this.a = r0Var;
        if (!this.f3116b) {
            r0Var.a();
            this.f3116b = true;
        }
        if (!this.f3116b) {
            r0Var.a();
            this.f3116b = true;
        }
    }

    public static final void b(T t, Object obj) {
        boolean z;
        t1 b2 = t.b();
        Charset charset = j.a;
        Objects.requireNonNull(obj);
        t1 t1Var = t1.DOUBLE;
        u1 u1Var = u1.INT;
        switch (b2.f3301h.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof um) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof g)) {
                    return;
                }
            case 8:
                if (obj instanceof e0) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.a()), t.b().f3301h, obj.getClass().getName()}));
    }

    public final void a(T t, Object obj) {
        if (!t.c()) {
            b(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                b(t, arrayList.get(i2));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.a.put(t, obj);
    }

    public final Object clone() {
        kn knVar = new kn();
        for (int i2 = 0; i2 < this.a.b(); i2++) {
            Map.Entry<T, Object> c2 = this.a.c(i2);
            knVar.a((jn) c2.getKey(), c2.getValue());
        }
        z0<T, Object> z0Var = this.a;
        for (Map.Entry entry : z0Var.f3432j.isEmpty() ? u0.f3317b : z0Var.f3432j.entrySet()) {
            knVar.a((jn) entry.getKey(), entry.getValue());
        }
        knVar.c = this.c;
        return knVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn)) {
            return false;
        }
        return this.a.equals(((kn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
