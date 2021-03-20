package b.o;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;

public class b4 {
    public static Class<?> c;
    public static AtomicLong d;

    /* renamed from: e  reason: collision with root package name */
    public static AtomicLong f6025e;
    public static n1 f;
    public Object a;

    /* renamed from: b  reason: collision with root package name */
    public Context f6026b;

    public b4(Context context) {
        this.f6026b = context;
    }

    public static Method c(Class cls) {
        try {
            return cls.getMethod("logEvent", new Class[]{String.class, Bundle.class});
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final String a(n1 n1Var) {
        if (n1Var.f6209b.isEmpty() || n1Var.c.isEmpty()) {
            String str = n1Var.d;
            return str != null ? str.substring(0, Math.min(10, str.length())) : "";
        }
        return n1Var.f6209b + " - " + n1Var.c;
    }

    public final Object b(Context context) {
        Method method;
        if (this.a == null) {
            try {
                method = c.getMethod("getInstance", new Class[]{Context.class});
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
                method = null;
            }
            try {
                this.a = method.invoke((Object) null, new Object[]{context});
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return this.a;
    }
}
