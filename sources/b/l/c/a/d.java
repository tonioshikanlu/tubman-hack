package b.l.c.a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class d {
    public static final Object a;

    static {
        Object a2 = a();
        a = a2;
        if (a2 != null) {
            b("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (a2 != null) {
            try {
                Method b2 = b("getStackTraceDepth", Throwable.class);
                if (b2 != null) {
                    b2.invoke(a(), new Object[]{new Throwable()});
                }
            } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            }
        }
    }

    public static Object a() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method b(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }
}
