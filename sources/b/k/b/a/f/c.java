package b.k.b.a.f;

public final class c {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r8 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        if (r8 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003e, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String a(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x003b, all -> 0x0033 }
            if (r9 == 0) goto L_0x002f
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x003b, all -> 0x0033 }
            if (r8 == 0) goto L_0x002c
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x003c, all -> 0x0029 }
            if (r9 == 0) goto L_0x002c
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ Exception -> 0x003c, all -> 0x0029 }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ Exception -> 0x003c, all -> 0x0029 }
            r8.close()
            return r9
        L_0x0029:
            r9 = move-exception
            r7 = r8
            goto L_0x0035
        L_0x002c:
            if (r8 == 0) goto L_0x0041
            goto L_0x003e
        L_0x002f:
            e.x.c.i.l()     // Catch:{ Exception -> 0x003b, all -> 0x0033 }
            throw r7
        L_0x0033:
            r8 = move-exception
            r9 = r8
        L_0x0035:
            if (r7 == 0) goto L_0x003a
            r7.close()
        L_0x003a:
            throw r9
        L_0x003b:
            r8 = r7
        L_0x003c:
            if (r8 == 0) goto L_0x0041
        L_0x003e:
            r8.close()
        L_0x0041:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b.k.b.a.f.c.a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r1 != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String b(android.net.Uri r7) {
        /*
            java.lang.String r0 = "."
            java.lang.String r1 = "uriImage"
            e.x.c.i.f(r7, r1)
            r1 = 1
            r2 = 0
            r3 = 0
            java.lang.String r7 = r7.getPath()     // Catch:{ Exception -> 0x0027 }
            if (r7 == 0) goto L_0x0027
            r4 = 6
            int r5 = e.c0.h.p(r7, r0, r3, r3, r4)     // Catch:{ Exception -> 0x0027 }
            r6 = -1
            if (r5 == r6) goto L_0x0027
            int r0 = e.c0.h.p(r7, r0, r3, r3, r4)     // Catch:{ Exception -> 0x0027 }
            int r0 = r0 + r1
            java.lang.String r7 = r7.substring(r0)     // Catch:{ Exception -> 0x0027 }
            java.lang.String r0 = "(this as java.lang.String).substring(startIndex)"
            e.x.c.i.b(r7, r0)     // Catch:{ Exception -> 0x0027 }
            r2 = r7
        L_0x0027:
            if (r2 == 0) goto L_0x0033
            int r7 = r2.length()
            if (r7 != 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r1 = r3
        L_0x0031:
            if (r1 == 0) goto L_0x0035
        L_0x0033:
            java.lang.String r2 = "jpg"
        L_0x0035:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r0 = 46
            r7.append(r0)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b.k.b.a.f.c.b(android.net.Uri):java.lang.String");
    }
}
