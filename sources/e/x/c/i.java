package e.x.c;

import b.e.a.a.a;
import e.d;
import e.q;
import java.util.Arrays;

public class i {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(a.m(str, " must not be null"));
            j(illegalStateException, i.class.getName());
            throw illegalStateException;
        }
    }

    public static void c(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            j(nullPointerException, i.class.getName());
            throw nullPointerException;
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(a.m(str, " must not be null"));
            j(nullPointerException, i.class.getName());
            throw nullPointerException;
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(h(str));
            j(nullPointerException, i.class.getName());
            throw nullPointerException;
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(h(str));
            j(illegalArgumentException, i.class.getName());
            throw illegalArgumentException;
        }
    }

    public static int g(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static String h(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static void i() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static <T extends Throwable> T j(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
        return t;
    }

    public static String k(String str, Object obj) {
        return str + obj;
    }

    public static void l() {
        d dVar = new d();
        j(dVar, i.class.getName());
        throw dVar;
    }

    public static void m(String str) {
        q qVar = new q(a.n("lateinit property ", str, " has not been initialized"));
        j(qVar, i.class.getName());
        throw qVar;
    }
}
