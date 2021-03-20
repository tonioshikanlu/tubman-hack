package b.l.a.c.f.e;

public final class nn implements d0 {
    public static final nn a = new nn();

    public final boolean a(Class<?> cls) {
        return e.class.isAssignableFrom(cls);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.a.c.f.e.c0 b(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<b.l.a.c.f.e.e> r0 = b.l.a.c.f.e.e.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L_0x0024
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.getName()
            java.lang.String r1 = "Unsupported message type: "
            int r2 = r5.length()
            if (r2 == 0) goto L_0x001b
            java.lang.String r5 = r1.concat(r5)
            goto L_0x0020
        L_0x001b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L_0x0020:
            r0.<init>(r5)
            throw r0
        L_0x0024:
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x0035 }
            b.l.a.c.f.e.e r0 = b.l.a.c.f.e.e.l(r0)     // Catch:{ Exception -> 0x0035 }
            r1 = 3
            r2 = 0
            java.lang.Object r0 = r0.h(r1, r2, r2)     // Catch:{ Exception -> 0x0035 }
            b.l.a.c.f.e.c0 r0 = (b.l.a.c.f.e.c0) r0     // Catch:{ Exception -> 0x0035 }
            return r0
        L_0x0035:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r5 = r5.getName()
            java.lang.String r2 = "Unable to get message info for "
            int r3 = r5.length()
            if (r3 == 0) goto L_0x0049
            java.lang.String r5 = r2.concat(r5)
            goto L_0x004e
        L_0x0049:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x004e:
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.nn.b(java.lang.Class):b.l.a.c.f.e.c0");
    }
}
