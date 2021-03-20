package q.a;

import java.util.ArrayList;
import java.util.List;

public final class a {
    public static final b[] a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<b> f10534b = new ArrayList();
    public static volatile b[] c;
    public static final b d = new C0241a();

    /* renamed from: q.a.a$a  reason: collision with other inner class name */
    public static class C0241a extends b {
        public void a(String str, Object... objArr) {
            for (b a : a.c) {
                a.a(str, objArr);
            }
        }

        public void b(String str, Object... objArr) {
            for (b b2 : a.c) {
                b2.b(str, objArr);
            }
        }

        public void c(int i2, String str, String str2, Throwable th) {
            throw new AssertionError("Missing override for log method.");
        }
    }

    public static abstract class b {
        public final ThreadLocal<String> a = new ThreadLocal<>();

        public void a(String str, Object... objArr) {
            d(3, (Throwable) null, str, objArr);
        }

        public void b(String str, Object... objArr) {
            d(6, (Throwable) null, str, objArr);
        }

        public abstract void c(int i2, String str, String str2, Throwable th);

        public final void d(int i2, Throwable th, String str, Object... objArr) {
            String str2 = this.a.get();
            if (str2 != null) {
                this.a.remove();
            }
            if (str != null && str.length() == 0) {
                str = null;
            }
            if (str != null) {
                if (objArr != null && objArr.length > 0) {
                    str = String.format(str, objArr);
                }
                c(i2, str2, str, (Throwable) null);
            }
        }
    }

    static {
        b[] bVarArr = new b[0];
        a = bVarArr;
        c = bVarArr;
    }
}
