package b.l.a.c.i.b;

import b.l.a.c.f.i.o1;

public final class t9 {
    public o1 a;

    /* renamed from: b  reason: collision with root package name */
    public Long f4291b;
    public long c;
    public final /* synthetic */ x9 d;

    public /* synthetic */ t9(x9 x9Var) {
        this.d = x9Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ef, code lost:
        if (r14 == null) goto L_0x00f4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.a.c.f.i.o1 a(java.lang.String r18, b.l.a.c.f.i.o1 r19) {
        /*
            r17 = this;
            r1 = r17
            r3 = r18
            r8 = r19
            java.lang.String r0 = r19.v()
            java.util.List r9 = r19.s()
            b.l.a.c.i.b.x9 r2 = r1.d
            b.l.a.c.i.b.d9 r2 = r2.f4305b
            r2.P()
            java.lang.String r2 = "_eid"
            java.lang.Object r4 = b.l.a.c.i.b.f9.l(r8, r2)
            java.lang.Long r4 = (java.lang.Long) r4
            r10 = 0
            if (r4 == 0) goto L_0x0218
            java.lang.String r5 = "_ep"
            boolean r5 = r0.equals(r5)
            r6 = 0
            if (r5 == 0) goto L_0x01d3
            b.l.a.c.i.b.x9 r0 = r1.d
            b.l.a.c.i.b.d9 r0 = r0.f4305b
            r0.P()
            java.lang.String r0 = "_en"
            java.lang.Object r0 = b.l.a.c.i.b.f9.l(r8, r0)
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r5 = 0
            if (r0 == 0) goto L_0x0051
            b.l.a.c.i.b.x9 r0 = r1.d
            b.l.a.c.i.b.l4 r0 = r0.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4089g
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.b(r2, r4)
            return r5
        L_0x0051:
            b.l.a.c.f.i.o1 r0 = r1.a
            r12 = 1
            if (r0 == 0) goto L_0x0068
            java.lang.Long r0 = r1.f4291b
            if (r0 == 0) goto L_0x0068
            long r13 = r4.longValue()
            java.lang.Long r0 = r1.f4291b
            long r15 = r0.longValue()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x011c
        L_0x0068:
            b.l.a.c.i.b.x9 r0 = r1.d
            b.l.a.c.i.b.d9 r0 = r0.f4305b
            b.l.a.c.i.b.j r13 = r0.L()
            r13.h()
            r13.i()
            android.database.sqlite.SQLiteDatabase r0 = r13.y()     // Catch:{ SQLiteException -> 0x00e0, all -> 0x00dc }
            r14 = 2
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x00e0, all -> 0x00dc }
            r14[r10] = r3     // Catch:{ SQLiteException -> 0x00e0, all -> 0x00dc }
            java.lang.String r15 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x00e0, all -> 0x00dc }
            r14[r12] = r15     // Catch:{ SQLiteException -> 0x00e0, all -> 0x00dc }
            java.lang.String r15 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            android.database.Cursor r14 = r0.rawQuery(r15, r14)     // Catch:{ SQLiteException -> 0x00e0, all -> 0x00dc }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00a3 }
            if (r0 != 0) goto L_0x00a5
            b.l.a.c.i.b.l4 r0 = r13.a     // Catch:{ SQLiteException -> 0x00a3 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ SQLiteException -> 0x00a3 }
            b.l.a.c.i.b.i3 r0 = r0.f4096n     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r15 = "Main event not found"
            r0.a(r15)     // Catch:{ SQLiteException -> 0x00a3 }
            r14.close()
            r0 = r5
            goto L_0x00f5
        L_0x00a3:
            r0 = move-exception
            goto L_0x00e2
        L_0x00a5:
            byte[] r0 = r14.getBlob(r10)     // Catch:{ SQLiteException -> 0x00a3 }
            long r15 = r14.getLong(r12)     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00a3 }
            b.l.a.c.f.i.n1 r5 = b.l.a.c.f.i.o1.C()     // Catch:{ IOException -> 0x00c9 }
            b.l.a.c.f.i.f4 r0 = b.l.a.c.i.b.f9.G(r5, r0)     // Catch:{ IOException -> 0x00c9 }
            b.l.a.c.f.i.n1 r0 = (b.l.a.c.f.i.n1) r0     // Catch:{ IOException -> 0x00c9 }
            b.l.a.c.f.i.p5 r0 = r0.g()     // Catch:{ IOException -> 0x00c9 }
            b.l.a.c.f.i.o1 r0 = (b.l.a.c.f.i.o1) r0     // Catch:{ IOException -> 0x00c9 }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00a3 }
            r14.close()
            goto L_0x00f5
        L_0x00c9:
            r0 = move-exception
            b.l.a.c.i.b.l4 r5 = r13.a     // Catch:{ SQLiteException -> 0x00a3 }
            b.l.a.c.i.b.k3 r5 = r5.a()     // Catch:{ SQLiteException -> 0x00a3 }
            b.l.a.c.i.b.i3 r5 = r5.f     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            java.lang.Object r10 = b.l.a.c.i.b.k3.t(r18)     // Catch:{ SQLiteException -> 0x00a3 }
            r5.d(r15, r10, r4, r0)     // Catch:{ SQLiteException -> 0x00a3 }
            goto L_0x00f1
        L_0x00dc:
            r0 = move-exception
            r5 = 0
            goto L_0x01cd
        L_0x00e0:
            r0 = move-exception
            r14 = 0
        L_0x00e2:
            b.l.a.c.i.b.l4 r5 = r13.a     // Catch:{ all -> 0x01cb }
            b.l.a.c.i.b.k3 r5 = r5.a()     // Catch:{ all -> 0x01cb }
            b.l.a.c.i.b.i3 r5 = r5.f     // Catch:{ all -> 0x01cb }
            java.lang.String r10 = "Error selecting main event"
            r5.b(r10, r0)     // Catch:{ all -> 0x01cb }
            if (r14 == 0) goto L_0x00f4
        L_0x00f1:
            r14.close()
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            if (r0 == 0) goto L_0x01ba
            java.lang.Object r5 = r0.first
            if (r5 != 0) goto L_0x00fd
            goto L_0x01ba
        L_0x00fd:
            b.l.a.c.f.i.o1 r5 = (b.l.a.c.f.i.o1) r5
            r1.a = r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r13 = r0.longValue()
            r1.c = r13
            b.l.a.c.i.b.x9 r0 = r1.d
            b.l.a.c.i.b.d9 r0 = r0.f4305b
            r0.P()
            b.l.a.c.f.i.o1 r0 = r1.a
            java.lang.Object r0 = b.l.a.c.i.b.f9.l(r0, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f4291b = r0
        L_0x011c:
            long r13 = r1.c
            r15 = -1
            long r13 = r13 + r15
            r1.c = r13
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x015d
            b.l.a.c.i.b.x9 r0 = r1.d
            b.l.a.c.i.b.d9 r0 = r0.f4305b
            b.l.a.c.i.b.j r2 = r0.L()
            r2.h()
            b.l.a.c.i.b.l4 r0 = r2.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4096n
            java.lang.String r4 = "Clearing complex main event info. appId"
            r0.b(r4, r3)
            android.database.sqlite.SQLiteDatabase r0 = r2.y()     // Catch:{ SQLiteException -> 0x014e }
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x014e }
            r5 = 0
            r4[r5] = r3     // Catch:{ SQLiteException -> 0x014e }
            java.lang.String r3 = "delete from main_event_params where app_id=?"
            r0.execSQL(r3, r4)     // Catch:{ SQLiteException -> 0x014e }
            goto L_0x016e
        L_0x014e:
            r0 = move-exception
            b.l.a.c.i.b.l4 r2 = r2.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f
            java.lang.String r3 = "Error clearing complex main event"
            r2.b(r3, r0)
            goto L_0x016e
        L_0x015d:
            b.l.a.c.i.b.x9 r0 = r1.d
            b.l.a.c.i.b.d9 r0 = r0.f4305b
            b.l.a.c.i.b.j r2 = r0.L()
            long r5 = r1.c
            b.l.a.c.f.i.o1 r7 = r1.a
            r3 = r18
            r2.o(r3, r4, r5, r7)
        L_0x016e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            b.l.a.c.f.i.o1 r2 = r1.a
            java.util.List r2 = r2.s()
            java.util.Iterator r2 = r2.iterator()
        L_0x017d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x019e
            java.lang.Object r3 = r2.next()
            b.l.a.c.f.i.s1 r3 = (b.l.a.c.f.i.s1) r3
            b.l.a.c.i.b.x9 r4 = r1.d
            b.l.a.c.i.b.d9 r4 = r4.f4305b
            r4.P()
            java.lang.String r4 = r3.t()
            b.l.a.c.f.i.s1 r4 = b.l.a.c.i.b.f9.L(r8, r4)
            if (r4 != 0) goto L_0x017d
            r0.add(r3)
            goto L_0x017d
        L_0x019e:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01a9
            r0.addAll(r9)
            r9 = r0
            goto L_0x01b8
        L_0x01a9:
            b.l.a.c.i.b.x9 r0 = r1.d
            b.l.a.c.i.b.l4 r0 = r0.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4089g
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.b(r2, r11)
        L_0x01b8:
            r0 = r11
            goto L_0x0218
        L_0x01ba:
            b.l.a.c.i.b.x9 r0 = r1.d
            b.l.a.c.i.b.l4 r0 = r0.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4089g
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.c(r2, r11, r4)
            r2 = 0
            return r2
        L_0x01cb:
            r0 = move-exception
            r5 = r14
        L_0x01cd:
            if (r5 == 0) goto L_0x01d2
            r5.close()
        L_0x01d2:
            throw r0
        L_0x01d3:
            r1.f4291b = r4
            r1.a = r8
            b.l.a.c.i.b.x9 r2 = r1.d
            b.l.a.c.i.b.d9 r2 = r2.f4305b
            r2.P()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r5 = "_epc"
            java.lang.Object r5 = b.l.a.c.i.b.f9.l(r8, r5)
            if (r5 == 0) goto L_0x01eb
            r2 = r5
        L_0x01eb:
            java.lang.Long r2 = (java.lang.Long) r2
            long r10 = r2.longValue()
            r1.c = r10
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0207
            b.l.a.c.i.b.x9 r2 = r1.d
            b.l.a.c.i.b.l4 r2 = r2.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f4089g
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.b(r3, r0)
            goto L_0x0218
        L_0x0207:
            b.l.a.c.i.b.x9 r2 = r1.d
            b.l.a.c.i.b.d9 r2 = r2.f4305b
            b.l.a.c.i.b.j r2 = r2.L()
            long r5 = r1.c
            r3 = r18
            r7 = r19
            r2.o(r3, r4, r5, r7)
        L_0x0218:
            b.l.a.c.f.i.m5 r2 = r19.n()
            b.l.a.c.f.i.n1 r2 = (b.l.a.c.f.i.n1) r2
            r2.t(r0)
            boolean r0 = r2.f3655j
            if (r0 == 0) goto L_0x022b
            r2.j()
            r3 = 0
            r2.f3655j = r3
        L_0x022b:
            MessageType r0 = r2.f3654i
            b.l.a.c.f.i.o1 r0 = (b.l.a.c.f.i.o1) r0
            b.l.a.c.f.i.o1.H(r0)
            boolean r0 = r2.f3655j
            if (r0 == 0) goto L_0x023c
            r2.j()
            r3 = 0
            r2.f3655j = r3
        L_0x023c:
            MessageType r0 = r2.f3654i
            b.l.a.c.f.i.o1 r0 = (b.l.a.c.f.i.o1) r0
            b.l.a.c.f.i.o1.G(r0, r9)
            b.l.a.c.f.i.p5 r0 = r2.g()
            b.l.a.c.f.i.o1 r0 = (b.l.a.c.f.i.o1) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.t9.a(java.lang.String, b.l.a.c.f.i.o1):b.l.a.c.f.i.o1");
    }
}
