package b.l.b.a.d;

import b.l.c.a.a;

public final class m {
    public final a a;

    public m(a aVar) {
        this.a = aVar;
    }

    public static m b(char c) {
        return new m(new a(String.valueOf(c)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030 A[Catch:{ IOException -> 0x004f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.Iterable<?> r7) {
        /*
            r6 = this;
            b.l.c.a.a r0 = r6.a
            java.util.Objects.requireNonNull(r0)
            java.util.Iterator r7 = r7.iterator()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r7.hasNext()     // Catch:{ IOException -> 0x004f }
            if (r2 == 0) goto L_0x004a
            java.lang.Object r2 = r7.next()     // Catch:{ IOException -> 0x004f }
            java.util.Objects.requireNonNull(r2)     // Catch:{ IOException -> 0x004f }
            boolean r3 = r2 instanceof java.lang.CharSequence     // Catch:{ IOException -> 0x004f }
            if (r3 == 0) goto L_0x0021
            r3 = r1
            goto L_0x0043
        L_0x0021:
            r3 = r2
            r2 = r1
        L_0x0023:
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x004f }
        L_0x0027:
            r1.append(r3)     // Catch:{ IOException -> 0x004f }
            boolean r3 = r7.hasNext()     // Catch:{ IOException -> 0x004f }
            if (r3 == 0) goto L_0x0049
            java.lang.String r3 = r0.a     // Catch:{ IOException -> 0x004f }
            r1.append(r3)     // Catch:{ IOException -> 0x004f }
            java.lang.Object r3 = r7.next()     // Catch:{ IOException -> 0x004f }
            java.util.Objects.requireNonNull(r3)     // Catch:{ IOException -> 0x004f }
            boolean r4 = r3 instanceof java.lang.CharSequence     // Catch:{ IOException -> 0x004f }
            if (r4 == 0) goto L_0x0023
            r5 = r3
            r3 = r2
            r2 = r5
        L_0x0043:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ IOException -> 0x004f }
            r5 = r3
            r3 = r2
            r2 = r5
            goto L_0x0027
        L_0x0049:
            r1 = r2
        L_0x004a:
            java.lang.String r7 = r1.toString()
            return r7
        L_0x004f:
            r7 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.b.a.d.m.a(java.lang.Iterable):java.lang.String");
    }
}
