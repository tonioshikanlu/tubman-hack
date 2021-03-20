package b.l.a.c.f.i;

import b.l.a.c.f.i.g5;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class h5<T extends g5<T>> {
    public static final h5 d = new h5(true);
    public final k7<T, Object> a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3588b;
    public boolean c;

    public h5() {
        this.a = new d7(16);
    }

    public h5(boolean z) {
        d7 d7Var = new d7(0);
        this.a = d7Var;
        if (!this.f3588b) {
            d7Var.a();
            this.f3588b = true;
        }
        if (!this.f3588b) {
            d7Var.a();
            this.f3588b = true;
        }
    }

    public static final void b(T t, Object obj) {
        boolean z;
        e8 b2 = t.b();
        Charset charset = w5.a;
        Objects.requireNonNull(obj);
        e8 e8Var = e8.DOUBLE;
        f8 f8Var = f8.INT;
        switch (b2.f3537h.ordinal()) {
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
                if ((obj instanceof t4) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof r5)) {
                    return;
                }
            case 8:
                if (obj instanceof q6) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.a()), t.b().f3537h, obj.getClass().getName()}));
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
        h5 h5Var = new h5();
        for (int i2 = 0; i2 < this.a.b(); i2++) {
            Map.Entry<T, Object> c2 = this.a.c(i2);
            h5Var.a((g5) c2.getKey(), c2.getValue());
        }
        k7<T, Object> k7Var = this.a;
        for (Map.Entry entry : k7Var.f3636j.isEmpty() ? g7.f3571b : k7Var.f3636j.entrySet()) {
            h5Var.a((g5) entry.getKey(), entry.getValue());
        }
        h5Var.c = this.c;
        return h5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5)) {
            return false;
        }
        return this.a.equals(((h5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
