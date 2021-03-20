package e.a.a.a;

import e.x.c.i;
import java.lang.ref.WeakReference;

public final class w0 {
    public final WeakReference<ClassLoader> a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7608b;

    public w0(ClassLoader classLoader) {
        i.e(classLoader, "classLoader");
        this.a = new WeakReference<>(classLoader);
        this.f7608b = System.identityHashCode(classLoader);
    }

    public boolean equals(Object obj) {
        return (obj instanceof w0) && ((ClassLoader) this.a.get()) == ((ClassLoader) ((w0) obj).a.get());
    }

    public int hashCode() {
        return this.f7608b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r1 = this;
            java.lang.ref.WeakReference<java.lang.ClassLoader> r0 = r1.a
            java.lang.Object r0 = r0.get()
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            java.lang.String r0 = "<null>"
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.w0.toString():java.lang.String");
    }
}
