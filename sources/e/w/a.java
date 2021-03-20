package e.w;

import e.x.c.i;
import e.z.b;
import e.z.c;
import java.lang.reflect.Method;

public class a {

    /* renamed from: e.w.a$a  reason: collision with other inner class name */
    public static final class C0145a {
        public static final Method a;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Class[]} */
        /* JADX WARNING: type inference failed for: r6v5 */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
            if (e.x.c.i.a(r6, r0) != false) goto L_0x0040;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                e.x.c.i.d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L_0x000e:
                java.lang.String r5 = "it"
                r6 = 0
                if (r4 >= r2) goto L_0x0047
                r7 = r1[r4]
                e.x.c.i.d(r7, r5)
                java.lang.String r8 = r7.getName()
                java.lang.String r9 = "addSuppressed"
                boolean r8 = e.x.c.i.a(r8, r9)
                r9 = 1
                if (r8 == 0) goto L_0x003f
                java.lang.Class[] r8 = r7.getParameterTypes()
                java.lang.String r10 = "it.parameterTypes"
                e.x.c.i.d(r8, r10)
                java.lang.String r10 = "$this$singleOrNull"
                e.x.c.i.e(r8, r10)
                int r10 = r8.length
                if (r10 != r9) goto L_0x0038
                r6 = r8[r3]
            L_0x0038:
                boolean r6 = e.x.c.i.a(r6, r0)
                if (r6 == 0) goto L_0x003f
                goto L_0x0040
            L_0x003f:
                r9 = r3
            L_0x0040:
                if (r9 == 0) goto L_0x0044
                r6 = r7
                goto L_0x0047
            L_0x0044:
                int r4 = r4 + 1
                goto L_0x000e
            L_0x0047:
                a = r6
                int r0 = r1.length
            L_0x004a:
                if (r3 >= r0) goto L_0x0061
                r2 = r1[r3]
                e.x.c.i.d(r2, r5)
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = e.x.c.i.a(r2, r4)
                if (r2 == 0) goto L_0x005e
                goto L_0x0061
            L_0x005e:
                int r3 = r3 + 1
                goto L_0x004a
            L_0x0061:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.w.a.C0145a.<clinit>():void");
        }
    }

    public void a(Throwable th, Throwable th2) {
        i.e(th, "cause");
        i.e(th2, "exception");
        Method method = C0145a.a;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    public c b() {
        return new b();
    }
}
