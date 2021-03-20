package b.p.b.a0;

import b.e.a.a.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class e<T> {
    public final Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6473b;
    public final Class[] c;

    public e(Class<?> cls, String str, Class... clsArr) {
        this.a = cls;
        this.f6473b = str;
        this.c = clsArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        if ((r4.getModifiers() & 1) == 0) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method a(java.lang.Class<?> r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.f6473b
            r1 = 0
            if (r0 == 0) goto L_0x0026
            java.lang.Class[] r2 = r3.c
            java.lang.reflect.Method r4 = r4.getMethod(r0, r2)     // Catch:{ NoSuchMethodException -> 0x0013 }
            int r0 = r4.getModifiers()     // Catch:{ NoSuchMethodException -> 0x0014 }
            r0 = r0 & 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r4 = r1
        L_0x0014:
            if (r4 == 0) goto L_0x0025
            java.lang.Class<?> r0 = r3.a
            if (r0 == 0) goto L_0x0025
            java.lang.Class r2 = r4.getReturnType()
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = r4
        L_0x0026:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.e.a(java.lang.Class):java.lang.reflect.Method");
    }

    public Object b(T t, Object... objArr) {
        Method a2 = a(t.getClass());
        if (a2 != null) {
            try {
                return a2.invoke(t, objArr);
            } catch (IllegalAccessException e2) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a2);
                assertionError.initCause(e2);
                throw assertionError;
            }
        } else {
            StringBuilder y = a.y("Method ");
            y.append(this.f6473b);
            y.append(" not supported for object ");
            y.append(t);
            throw new AssertionError(y.toString());
        }
    }

    public Object c(T t, Object... objArr) {
        try {
            Method a2 = a(t.getClass());
            if (a2 == null) {
                return null;
            }
            try {
                return a2.invoke(t, objArr);
            } catch (IllegalAccessException unused) {
                return null;
            }
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object d(T t, Object... objArr) {
        try {
            return b(t, objArr);
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
