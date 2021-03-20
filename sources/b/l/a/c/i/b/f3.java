package b.l.a.c.i.b;

import android.os.Bundle;
import android.util.Log;
import b.l.a.c.b.a;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class f3 extends g5 {
    public static final AtomicReference<String[]> c = new AtomicReference<>();
    public static final AtomicReference<String[]> d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReference<String[]> f4000e = new AtomicReference<>();

    public f3(l4 l4Var) {
        super(l4Var);
    }

    public static final String u(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Objects.requireNonNull(atomicReference, "null reference");
        a.j(strArr.length == strArr2.length);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (k9.G(str, strArr[i2])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i2];
                    if (str2 == null) {
                        str2 = strArr2[i2] + "(" + strArr[i2] + ")";
                        strArr3[i2] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final boolean i() {
        return false;
    }

    public final boolean o() {
        l4 l4Var = this.a;
        y9 y9Var = l4Var.f;
        return l4Var.x() && Log.isLoggable(this.a.a().v(), 3);
    }

    public final String p(String str) {
        if (str == null) {
            return null;
        }
        return !o() ? str : u(str, i5.c, i5.a, c);
    }

    public final String q(String str) {
        if (str == null) {
            return null;
        }
        return !o() ? str : u(str, j5.f4075b, j5.a, d);
    }

    public final String r(String str) {
        if (str == null) {
            return null;
        }
        return !o() ? str : str.startsWith("_exp_") ? b.e.a.a.a.n("experiment_id(", str, ")") : u(str, k5.f4099b, k5.a, f4000e);
    }

    public final String s(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!o()) {
            return bundle.toString();
        }
        StringBuilder y = b.e.a.a.a.y("Bundle[{");
        for (String str : bundle.keySet()) {
            if (y.length() != 8) {
                y.append(", ");
            }
            y.append(q(str));
            y.append("=");
            Object obj = bundle.get(str);
            y.append(obj instanceof Bundle ? t(new Object[]{obj}) : obj instanceof Object[] ? t((Object[]) obj) : obj instanceof ArrayList ? t(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        y.append("}]");
        return y.toString();
    }

    public final String t(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder y = b.e.a.a.a.y("[");
        for (Bundle bundle : objArr) {
            String s = bundle instanceof Bundle ? s(bundle) : String.valueOf(bundle);
            if (s != null) {
                if (y.length() != 1) {
                    y.append(", ");
                }
                y.append(s);
            }
        }
        y.append("]");
        return y.toString();
    }
}
