package b.l.a.c.f.e;

import b.e.a.a.a;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class a3 {
    public static final Logger a = Logger.getLogger(a3.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentMap<String, z2> f2840b = new ConcurrentHashMap();
    public static final ConcurrentMap<String, y2> c = new ConcurrentHashMap();
    public static final ConcurrentMap<String, Boolean> d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentMap<Class<?>, t2<?, ?>> f2841e = new ConcurrentHashMap();

    static {
        new ConcurrentHashMap();
    }

    public static synchronized <KeyProtoT extends e0> void a(i2<KeyProtoT> i2Var, boolean z) {
        synchronized (a3.class) {
            String a2 = i2Var.a();
            h(a2, i2Var.getClass(), true);
            ConcurrentMap<String, z2> concurrentMap = f2840b;
            if (!concurrentMap.containsKey(a2)) {
                concurrentMap.put(a2, new w2(i2Var));
                c.put(a2, new y2(i2Var));
            }
            d.put(a2, Boolean.TRUE);
        }
    }

    public static synchronized <B, P> void b(t2<B, P> t2Var) {
        synchronized (a3.class) {
            Class<P> b2 = t2Var.b();
            ConcurrentMap<Class<?>, t2<?, ?>> concurrentMap = f2841e;
            if (concurrentMap.containsKey(b2)) {
                t2 t2Var2 = (t2) concurrentMap.get(b2);
                if (!t2Var.getClass().equals(t2Var2.getClass())) {
                    Logger logger = a;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(b2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 56);
                    sb.append("Attempted overwrite of a registered SetWrapper for type ");
                    sb.append(valueOf);
                    logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", sb.toString());
                    throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{b2.getName(), t2Var2.getClass().getName(), t2Var.getClass().getName()}));
                }
            }
            concurrentMap.put(b2, t2Var);
        }
    }

    public static synchronized h9 c(l9 l9Var) {
        h9 c2;
        synchronized (a3.class) {
            d2<?> b2 = g(l9Var.s()).b();
            if (((Boolean) d.get(l9Var.s())).booleanValue()) {
                c2 = ((e2) b2).c(l9Var.t());
            } else {
                String valueOf = String.valueOf(l9Var.s());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return c2;
    }

    public static synchronized e0 d(l9 l9Var) {
        e0 b2;
        synchronized (a3.class) {
            d2<?> b3 = g(l9Var.s()).b();
            if (((Boolean) d.get(l9Var.s())).booleanValue()) {
                b2 = ((e2) b3).b(l9Var.t());
            } else {
                String valueOf = String.valueOf(l9Var.s());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return b2;
    }

    public static <P> P e(String str, e0 e0Var, Class<P> cls) {
        e2 e2Var = (e2) i(str, cls);
        String name = e2Var.a.a.getName();
        String concat = name.length() != 0 ? "Expected proto of type ".concat(name) : new String("Expected proto of type ");
        if (e2Var.a.a.isInstance(e0Var)) {
            return e2Var.d(e0Var);
        }
        throw new GeneralSecurityException(concat);
    }

    public static <P> P f(String str, byte[] bArr, Class<P> cls) {
        um umVar = um.f3344i;
        return j(str, um.J(bArr, 0, bArr.length), cls);
    }

    public static synchronized z2 g(String str) {
        z2 z2Var;
        synchronized (a3.class) {
            ConcurrentMap<String, z2> concurrentMap = f2840b;
            if (!concurrentMap.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            z2Var = (z2) concurrentMap.get(str);
        }
        return z2Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0088, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void h(java.lang.String r6, java.lang.Class<?> r7, boolean r8) {
        /*
            java.lang.Class<b.l.a.c.f.e.a3> r0 = b.l.a.c.f.e.a3.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, b.l.a.c.f.e.z2> r1 = f2840b     // Catch:{ all -> 0x0089 }
            boolean r2 = r1.containsKey(r6)     // Catch:{ all -> 0x0089 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0089 }
            b.l.a.c.f.e.z2 r1 = (b.l.a.c.f.e.z2) r1     // Catch:{ all -> 0x0089 }
            java.lang.Class r2 = r1.c()     // Catch:{ all -> 0x0089 }
            boolean r2 = r2.equals(r7)     // Catch:{ all -> 0x0089 }
            if (r2 != 0) goto L_0x005f
            java.util.logging.Logger r8 = a     // Catch:{ all -> 0x0089 }
            java.util.logging.Level r2 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = "Attempted overwrite of a registered key manager for key type "
            int r4 = r6.length()     // Catch:{ all -> 0x0089 }
            if (r4 == 0) goto L_0x002e
            java.lang.String r3 = r3.concat(r6)     // Catch:{ all -> 0x0089 }
            goto L_0x0034
        L_0x002e:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x0089 }
            r4.<init>(r3)     // Catch:{ all -> 0x0089 }
            r3 = r4
        L_0x0034:
            java.lang.String r4 = "com.google.crypto.tink.Registry"
            java.lang.String r5 = "ensureKeyManagerInsertable"
            r8.logp(r2, r4, r5, r3)     // Catch:{ all -> 0x0089 }
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0089 }
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0089 }
            r3 = 0
            r2[r3] = r6     // Catch:{ all -> 0x0089 }
            r6 = 1
            java.lang.Class r1 = r1.c()     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0089 }
            r2[r6] = r1     // Catch:{ all -> 0x0089 }
            r6 = 2
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x0089 }
            r2[r6] = r7     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            java.lang.String r6 = java.lang.String.format(r6, r2)     // Catch:{ all -> 0x0089 }
            r8.<init>(r6)     // Catch:{ all -> 0x0089 }
            throw r8     // Catch:{ all -> 0x0089 }
        L_0x005f:
            if (r8 == 0) goto L_0x0087
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r7 = d     // Catch:{ all -> 0x0089 }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ all -> 0x0089 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0089 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0089 }
            if (r7 != 0) goto L_0x0087
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0089 }
            java.lang.String r8 = "New keys are already disallowed for key type "
            int r1 = r6.length()     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x007e
            java.lang.String r6 = r8.concat(r6)     // Catch:{ all -> 0x0089 }
            goto L_0x0083
        L_0x007e:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0089 }
            r6.<init>(r8)     // Catch:{ all -> 0x0089 }
        L_0x0083:
            r7.<init>(r6)     // Catch:{ all -> 0x0089 }
            throw r7     // Catch:{ all -> 0x0089 }
        L_0x0087:
            monitor-exit(r0)
            return
        L_0x0089:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.a3.h(java.lang.String, java.lang.Class, boolean):void");
    }

    public static <P> d2<P> i(String str, Class<P> cls) {
        z2 g2 = g(str);
        if (cls == null) {
            return g2.b();
        }
        if (g2.d().contains(cls)) {
            return g2.f(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(g2.c());
        Set<Class<?>> d2 = g2.d();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class next : d2) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(next.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(a.b(name.length(), 77, valueOf.length(), String.valueOf(sb2).length()));
        a.L(sb3, "Primitive type ", name, " not supported by key manager of type ", valueOf);
        throw new GeneralSecurityException(a.q(sb3, ", supported primitives: ", sb2));
    }

    public static <P> P j(String str, um umVar, Class<P> cls) {
        return ((e2) i(str, cls)).a(umVar);
    }
}
