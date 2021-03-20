package b.l.a.c.i.b;

import java.util.Map;
import java.util.Set;

public final class x9 extends u8 {
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public Set<Integer> f4373e;
    public Map<Integer, s9> f;

    /* renamed from: g  reason: collision with root package name */
    public Long f4374g;

    /* renamed from: h  reason: collision with root package name */
    public Long f4375h;

    public x9(d9 d9Var) {
        super(d9Var);
    }

    public final boolean k() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02fc, code lost:
        if (r5 != null) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x071c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x071d, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x071f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0720, code lost:
        r65 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x073d, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0748, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x08f0, code lost:
        if (r13 == null) goto L_0x08f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0a1e, code lost:
        if (r7 != false) goto L_0x0a29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016c, code lost:
        if (r5 != null) goto L_0x016e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x059d  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x071c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:240:0x067f] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x073d  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0748  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0764  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0806  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x08fd  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0a4f  */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0ae3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01af A[Catch:{ SQLiteException -> 0x0221 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bd A[SYNTHETIC, Splitter:B:65:0x01bd] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0248  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<b.l.a.c.f.i.j1> l(java.lang.String r64, java.util.List<b.l.a.c.f.i.o1> r65, java.util.List<b.l.a.c.f.i.g2> r66, java.lang.Long r67, java.lang.Long r68) {
        /*
            r63 = this;
            r9 = r63
            java.lang.String r10 = "current_results"
            b.l.a.c.b.a.x(r64)
            b.l.a.c.b.a.A(r65)
            b.l.a.c.b.a.A(r66)
            r0 = r64
            r9.d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r9.f4373e = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r9.f = r0
            r0 = r67
            r9.f4374g = r0
            r0 = r68
            r9.f4375h = r0
            java.util.Iterator r0 = r65.iterator()
        L_0x002b:
            boolean r1 = r0.hasNext()
            r11 = 0
            r12 = 1
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r0.next()
            b.l.a.c.f.i.o1 r1 = (b.l.a.c.f.i.o1) r1
            java.lang.String r1 = r1.v()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x002b
            r1 = r12
            goto L_0x0048
        L_0x0047:
            r1 = r11
        L_0x0048:
            b.l.a.c.f.i.f9.b()
            b.l.a.c.i.b.l4 r0 = r9.a
            b.l.a.c.i.b.f r0 = r0.p()
            java.lang.String r2 = r9.d
            b.l.a.c.i.b.w2<java.lang.Boolean> r3 = b.l.a.c.i.b.x2.b0
            boolean r13 = r0.r(r2, r3)
            b.l.a.c.f.i.f9.b()
            b.l.a.c.i.b.l4 r0 = r9.a
            b.l.a.c.i.b.f r0 = r0.p()
            java.lang.String r2 = r9.d
            b.l.a.c.i.b.w2<java.lang.Boolean> r3 = b.l.a.c.i.b.x2.a0
            boolean r14 = r0.r(r2, r3)
            if (r1 == 0) goto L_0x00af
            b.l.a.c.i.b.d9 r0 = r9.f4305b
            b.l.a.c.i.b.j r2 = r0.L()
            java.lang.String r3 = r9.d
            r2.i()
            r2.h()
            b.l.a.c.b.a.x(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.y()     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x009b }
            r5[r11] = r3     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String r6 = "events"
            java.lang.String r7 = "app_id = ?"
            r4.update(r6, r0, r7, r5)     // Catch:{ SQLiteException -> 0x009b }
            goto L_0x00af
        L_0x009b:
            r0 = move-exception
            b.l.a.c.i.b.l4 r2 = r2.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.o()
            java.lang.Object r3 = b.l.a.c.i.b.k3.t(r3)
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            r2.c(r4, r3, r0)
        L_0x00af:
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.lang.String r15 = "Failed to merge filter. appId"
            java.lang.String r8 = "Database error querying filters. appId"
            java.lang.String r7 = "data"
            java.lang.String r6 = "audience_id"
            if (r14 == 0) goto L_0x0179
            if (r13 == 0) goto L_0x0179
            b.l.a.c.i.b.d9 r0 = r9.f4305b
            b.l.a.c.i.b.j r2 = r0.L()
            java.lang.String r3 = r9.d
            b.l.a.c.b.a.x(r3)
            androidx.collection.ArrayMap r4 = new androidx.collection.ArrayMap
            r4.<init>()
            android.database.sqlite.SQLiteDatabase r16 = r2.y()
            java.lang.String[] r18 = new java.lang.String[]{r6, r7}     // Catch:{ SQLiteException -> 0x0155, all -> 0x0152 }
            java.lang.String[] r0 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0155, all -> 0x0152 }
            r0[r11] = r3     // Catch:{ SQLiteException -> 0x0155, all -> 0x0152 }
            java.lang.String r17 = "event_filters"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r5 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x0155, all -> 0x0152 }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0150 }
            if (r0 == 0) goto L_0x014b
        L_0x00f1:
            byte[] r0 = r5.getBlob(r12)     // Catch:{ SQLiteException -> 0x0150 }
            b.l.a.c.f.i.j0 r12 = b.l.a.c.f.i.k0.E()     // Catch:{ IOException -> 0x012b }
            b.l.a.c.f.i.f4 r0 = b.l.a.c.i.b.f9.G(r12, r0)     // Catch:{ IOException -> 0x012b }
            b.l.a.c.f.i.j0 r0 = (b.l.a.c.f.i.j0) r0     // Catch:{ IOException -> 0x012b }
            b.l.a.c.f.i.p5 r0 = r0.g()     // Catch:{ IOException -> 0x012b }
            b.l.a.c.f.i.k0 r0 = (b.l.a.c.f.i.k0) r0     // Catch:{ IOException -> 0x012b }
            boolean r12 = r0.y()     // Catch:{ SQLiteException -> 0x0150 }
            if (r12 != 0) goto L_0x010c
            goto L_0x013d
        L_0x010c:
            int r12 = r5.getInt(r11)     // Catch:{ SQLiteException -> 0x0150 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLiteException -> 0x0150 }
            java.lang.Object r16 = r4.get(r12)     // Catch:{ SQLiteException -> 0x0150 }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x0150 }
            if (r16 != 0) goto L_0x0125
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0150 }
            r11.<init>()     // Catch:{ SQLiteException -> 0x0150 }
            r4.put(r12, r11)     // Catch:{ SQLiteException -> 0x0150 }
            goto L_0x0127
        L_0x0125:
            r11 = r16
        L_0x0127:
            r11.add(r0)     // Catch:{ SQLiteException -> 0x0150 }
            goto L_0x013d
        L_0x012b:
            r0 = move-exception
            b.l.a.c.i.b.l4 r11 = r2.a     // Catch:{ SQLiteException -> 0x0150 }
            b.l.a.c.i.b.k3 r11 = r11.a()     // Catch:{ SQLiteException -> 0x0150 }
            b.l.a.c.i.b.i3 r11 = r11.o()     // Catch:{ SQLiteException -> 0x0150 }
            java.lang.Object r12 = b.l.a.c.i.b.k3.t(r3)     // Catch:{ SQLiteException -> 0x0150 }
            r11.c(r15, r12, r0)     // Catch:{ SQLiteException -> 0x0150 }
        L_0x013d:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0150 }
            if (r0 != 0) goto L_0x0148
            r5.close()
            r11 = r4
            goto L_0x017a
        L_0x0148:
            r11 = 0
            r12 = 1
            goto L_0x00f1
        L_0x014b:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0150 }
            goto L_0x016e
        L_0x0150:
            r0 = move-exception
            goto L_0x0157
        L_0x0152:
            r0 = move-exception
            r5 = 0
            goto L_0x0173
        L_0x0155:
            r0 = move-exception
            r5 = 0
        L_0x0157:
            b.l.a.c.i.b.l4 r2 = r2.a     // Catch:{ all -> 0x0172 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x0172 }
            b.l.a.c.i.b.i3 r2 = r2.o()     // Catch:{ all -> 0x0172 }
            java.lang.Object r3 = b.l.a.c.i.b.k3.t(r3)     // Catch:{ all -> 0x0172 }
            r2.c(r8, r3, r0)     // Catch:{ all -> 0x0172 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0172 }
            if (r5 == 0) goto L_0x0179
        L_0x016e:
            r5.close()
            goto L_0x0179
        L_0x0172:
            r0 = move-exception
        L_0x0173:
            if (r5 == 0) goto L_0x0178
            r5.close()
        L_0x0178:
            throw r0
        L_0x0179:
            r11 = r0
        L_0x017a:
            b.l.a.c.i.b.d9 r0 = r9.f4305b
            b.l.a.c.i.b.j r2 = r0.L()
            java.lang.String r3 = r9.d
            r2.i()
            r2.h()
            b.l.a.c.b.a.x(r3)
            android.database.sqlite.SQLiteDatabase r16 = r2.y()
            java.lang.String[] r18 = new java.lang.String[]{r6, r10}     // Catch:{ SQLiteException -> 0x0229, all -> 0x0225 }
            r4 = 1
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0229, all -> 0x0225 }
            r4 = 0
            r0[r4] = r3     // Catch:{ SQLiteException -> 0x0229, all -> 0x0225 }
            java.lang.String r17 = "audience_filter_values"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r4 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x0229, all -> 0x0225 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0221 }
            if (r0 != 0) goto L_0x01bd
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0221 }
            r4.close()
            r12 = r0
            r18 = r6
            r19 = r7
            goto L_0x024c
        L_0x01bd:
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap     // Catch:{ SQLiteException -> 0x0221 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0221 }
        L_0x01c2:
            r12 = 0
            int r16 = r4.getInt(r12)     // Catch:{ SQLiteException -> 0x0221 }
            r12 = 1
            byte[] r0 = r4.getBlob(r12)     // Catch:{ SQLiteException -> 0x0221 }
            b.l.a.c.f.i.b2 r12 = b.l.a.c.f.i.c2.C()     // Catch:{ IOException -> 0x01ea }
            b.l.a.c.f.i.f4 r0 = b.l.a.c.i.b.f9.G(r12, r0)     // Catch:{ IOException -> 0x01ea }
            b.l.a.c.f.i.b2 r0 = (b.l.a.c.f.i.b2) r0     // Catch:{ IOException -> 0x01ea }
            b.l.a.c.f.i.p5 r0 = r0.g()     // Catch:{ IOException -> 0x01ea }
            b.l.a.c.f.i.c2 r0 = (b.l.a.c.f.i.c2) r0     // Catch:{ IOException -> 0x01ea }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x0221 }
            r5.put(r12, r0)     // Catch:{ SQLiteException -> 0x0221 }
            r17 = r5
            r18 = r6
            r19 = r7
            goto L_0x0208
        L_0x01ea:
            r0 = move-exception
            b.l.a.c.i.b.l4 r12 = r2.a     // Catch:{ SQLiteException -> 0x0221 }
            b.l.a.c.i.b.k3 r12 = r12.a()     // Catch:{ SQLiteException -> 0x0221 }
            b.l.a.c.i.b.i3 r12 = r12.o()     // Catch:{ SQLiteException -> 0x0221 }
            r17 = r5
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            r18 = r6
            java.lang.Object r6 = b.l.a.c.i.b.k3.t(r3)     // Catch:{ SQLiteException -> 0x021d }
            r19 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x021b }
            r12.d(r5, r6, r7, r0)     // Catch:{ SQLiteException -> 0x021b }
        L_0x0208:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x021b }
            if (r0 != 0) goto L_0x0214
            r4.close()
            r12 = r17
            goto L_0x024c
        L_0x0214:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L_0x01c2
        L_0x021b:
            r0 = move-exception
            goto L_0x022f
        L_0x021d:
            r0 = move-exception
        L_0x021e:
            r19 = r7
            goto L_0x022f
        L_0x0221:
            r0 = move-exception
            r18 = r6
            goto L_0x021e
        L_0x0225:
            r0 = move-exception
            r5 = 0
            goto L_0x0ae1
        L_0x0229:
            r0 = move-exception
            r18 = r6
            r19 = r7
            r4 = 0
        L_0x022f:
            b.l.a.c.i.b.l4 r2 = r2.a     // Catch:{ all -> 0x0adf }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x0adf }
            b.l.a.c.i.b.i3 r2 = r2.o()     // Catch:{ all -> 0x0adf }
            java.lang.String r5 = "Database error querying filter results. appId"
            java.lang.Object r3 = b.l.a.c.i.b.k3.t(r3)     // Catch:{ all -> 0x0adf }
            r2.c(r5, r3, r0)     // Catch:{ all -> 0x0adf }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0adf }
            if (r4 == 0) goto L_0x024b
            r4.close()
        L_0x024b:
            r12 = r0
        L_0x024c:
            boolean r0 = r12.isEmpty()
            r7 = 2
            if (r0 == 0) goto L_0x025e
            r13 = r7
            r28 = r8
            r23 = r10
            r11 = r18
            r12 = r19
            goto L_0x058d
        L_0x025e:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r0 = r12.keySet()
            r2.<init>(r0)
            if (r1 == 0) goto L_0x03d1
            java.lang.String r1 = r9.d
            b.l.a.c.b.a.x(r1)
            b.l.a.c.b.a.A(r12)
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r3.<init>()
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x027e
            goto L_0x03c8
        L_0x027e:
            b.l.a.c.i.b.d9 r0 = r9.f4305b
            b.l.a.c.i.b.j r4 = r0.L()
            r4.i()
            r4.h()
            b.l.a.c.b.a.x(r1)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r5 = r4.y()
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x02e3, all -> 0x02df }
            r16 = 0
            r6[r16] = r1     // Catch:{ SQLiteException -> 0x02e3, all -> 0x02df }
            r16 = 1
            r6[r16] = r1     // Catch:{ SQLiteException -> 0x02e3, all -> 0x02df }
            java.lang.String r7 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            android.database.Cursor r5 = r5.rawQuery(r7, r6)     // Catch:{ SQLiteException -> 0x02e3, all -> 0x02df }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x02dd }
            if (r6 == 0) goto L_0x02d8
        L_0x02ac:
            r6 = 0
            int r7 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02dd }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ SQLiteException -> 0x02dd }
            java.lang.Object r7 = r0.get(r6)     // Catch:{ SQLiteException -> 0x02dd }
            java.util.List r7 = (java.util.List) r7     // Catch:{ SQLiteException -> 0x02dd }
            if (r7 != 0) goto L_0x02c5
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x02dd }
            r7.<init>()     // Catch:{ SQLiteException -> 0x02dd }
            r0.put(r6, r7)     // Catch:{ SQLiteException -> 0x02dd }
        L_0x02c5:
            r6 = 1
            int r17 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02dd }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x02dd }
            r7.add(r6)     // Catch:{ SQLiteException -> 0x02dd }
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x02dd }
            if (r6 != 0) goto L_0x02ac
            goto L_0x02fe
        L_0x02d8:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x02dd }
            goto L_0x02fe
        L_0x02dd:
            r0 = move-exception
            goto L_0x02e5
        L_0x02df:
            r0 = move-exception
            r5 = 0
            goto L_0x03cb
        L_0x02e3:
            r0 = move-exception
            r5 = 0
        L_0x02e5:
            b.l.a.c.i.b.l4 r4 = r4.a     // Catch:{ all -> 0x03ca }
            b.l.a.c.i.b.k3 r4 = r4.a()     // Catch:{ all -> 0x03ca }
            b.l.a.c.i.b.i3 r4 = r4.o()     // Catch:{ all -> 0x03ca }
            java.lang.String r6 = "Database error querying scoped filters. appId"
            java.lang.Object r1 = b.l.a.c.i.b.k3.t(r1)     // Catch:{ all -> 0x03ca }
            r4.c(r6, r1, r0)     // Catch:{ all -> 0x03ca }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x03ca }
            if (r5 == 0) goto L_0x0301
        L_0x02fe:
            r5.close()
        L_0x0301:
            java.util.Set r1 = r12.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0309:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x03c8
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r12.get(r5)
            b.l.a.c.f.i.c2 r6 = (b.l.a.c.f.i.c2) r6
            java.lang.Object r7 = r0.get(r5)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x03bb
            boolean r17 = r7.isEmpty()
            if (r17 == 0) goto L_0x0333
            goto L_0x03bb
        L_0x0333:
            b.l.a.c.i.b.d9 r5 = r9.f4305b
            b.l.a.c.i.b.f9 r5 = r5.P()
            r17 = r0
            java.util.List r0 = r6.u()
            java.util.List r0 = r5.C(r0, r7)
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x03b7
            b.l.a.c.f.i.m5 r5 = r6.n()
            b.l.a.c.f.i.b2 r5 = (b.l.a.c.f.i.b2) r5
            r5.p()
            r5.o(r0)
            b.l.a.c.i.b.d9 r0 = r9.f4305b
            b.l.a.c.i.b.f9 r0 = r0.P()
            r20 = r1
            java.util.List r1 = r6.s()
            java.util.List r0 = r0.C(r1, r7)
            r5.n()
            r5.m(r0)
            r0 = 0
        L_0x036c:
            int r1 = r6.x()
            if (r0 >= r1) goto L_0x038a
            b.l.a.c.f.i.l1 r1 = r6.y(r0)
            int r1 = r1.t()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x0387
            r5.q(r0)
        L_0x0387:
            int r0 = r0 + 1
            goto L_0x036c
        L_0x038a:
            r0 = 0
        L_0x038b:
            int r1 = r6.A()
            if (r0 >= r1) goto L_0x03a9
            b.l.a.c.f.i.e2 r1 = r6.B(r0)
            int r1 = r1.t()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x03a6
            r5.r(r0)
        L_0x03a6:
            int r0 = r0 + 1
            goto L_0x038b
        L_0x03a9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            b.l.a.c.f.i.p5 r1 = r5.g()
            b.l.a.c.f.i.c2 r1 = (b.l.a.c.f.i.c2) r1
            r3.put(r0, r1)
            goto L_0x03c2
        L_0x03b7:
            r0 = r17
            goto L_0x0309
        L_0x03bb:
            r17 = r0
            r20 = r1
            r3.put(r5, r6)
        L_0x03c2:
            r0 = r17
            r1 = r20
            goto L_0x0309
        L_0x03c8:
            r0 = r3
            goto L_0x03d2
        L_0x03ca:
            r0 = move-exception
        L_0x03cb:
            if (r5 == 0) goto L_0x03d0
            r5.close()
        L_0x03d0:
            throw r0
        L_0x03d1:
            r0 = r12
        L_0x03d2:
            java.util.Iterator r17 = r2.iterator()
        L_0x03d6:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x0584
            java.lang.Object r1 = r17.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r20 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r0.get(r1)
            b.l.a.c.f.i.c2 r1 = (b.l.a.c.f.i.c2) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            androidx.collection.ArrayMap r7 = new androidx.collection.ArrayMap
            r7.<init>()
            if (r1 == 0) goto L_0x043e
            int r2 = r1.x()
            if (r2 != 0) goto L_0x0408
            goto L_0x043e
        L_0x0408:
            java.util.List r2 = r1.w()
            java.util.Iterator r2 = r2.iterator()
        L_0x0410:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x043e
            java.lang.Object r3 = r2.next()
            b.l.a.c.f.i.l1 r3 = (b.l.a.c.f.i.l1) r3
            boolean r4 = r3.s()
            if (r4 == 0) goto L_0x0410
            int r4 = r3.t()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r21 = r3.u()
            if (r21 == 0) goto L_0x0439
            long r21 = r3.v()
            java.lang.Long r3 = java.lang.Long.valueOf(r21)
            goto L_0x043a
        L_0x0439:
            r3 = 0
        L_0x043a:
            r7.put(r4, r3)
            goto L_0x0410
        L_0x043e:
            androidx.collection.ArrayMap r4 = new androidx.collection.ArrayMap
            r4.<init>()
            if (r1 == 0) goto L_0x048e
            int r2 = r1.A()
            if (r2 != 0) goto L_0x044c
            goto L_0x048e
        L_0x044c:
            java.util.List r2 = r1.z()
            java.util.Iterator r2 = r2.iterator()
        L_0x0454:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x048e
            java.lang.Object r3 = r2.next()
            b.l.a.c.f.i.e2 r3 = (b.l.a.c.f.i.e2) r3
            boolean r21 = r3.s()
            if (r21 == 0) goto L_0x0454
            int r21 = r3.v()
            if (r21 <= 0) goto L_0x0454
            int r21 = r3.t()
            r22 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            int r21 = r3.v()
            r23 = r2
            int r2 = r21 + -1
            long r2 = r3.w(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4.put(r0, r2)
            r0 = r22
            r2 = r23
            goto L_0x0454
        L_0x048e:
            r22 = r0
            if (r1 == 0) goto L_0x04e3
            r0 = 0
        L_0x0493:
            int r2 = r1.t()
            int r2 = r2 * 64
            if (r0 >= r2) goto L_0x04e3
            java.util.List r2 = r1.s()
            boolean r2 = b.l.a.c.i.b.f9.A(r2, r0)
            if (r2 == 0) goto L_0x04d1
            b.l.a.c.i.b.l4 r2 = r9.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.s()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r21 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r23 = r10
            java.lang.String r10 = "Filter already evaluated. audience ID, filter ID"
            r2.c(r10, r3, r8)
            r6.set(r0)
            java.util.List r2 = r1.u()
            boolean r2 = b.l.a.c.i.b.f9.A(r2, r0)
            if (r2 == 0) goto L_0x04d5
            r5.set(r0)
            goto L_0x04dc
        L_0x04d1:
            r21 = r8
            r23 = r10
        L_0x04d5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r7.remove(r2)
        L_0x04dc:
            int r0 = r0 + 1
            r8 = r21
            r10 = r23
            goto L_0x0493
        L_0x04e3:
            r21 = r8
            r23 = r10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r12.get(r0)
            r8 = r1
            b.l.a.c.f.i.c2 r8 = (b.l.a.c.f.i.c2) r8
            if (r14 == 0) goto L_0x0552
            if (r13 == 0) goto L_0x0552
            java.lang.Object r0 = r11.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0552
            java.lang.Long r1 = r9.f4375h
            if (r1 == 0) goto L_0x0552
            java.lang.Long r1 = r9.f4374g
            if (r1 != 0) goto L_0x0507
            goto L_0x0552
        L_0x0507:
            java.util.Iterator r0 = r0.iterator()
        L_0x050b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0552
            java.lang.Object r1 = r0.next()
            b.l.a.c.f.i.k0 r1 = (b.l.a.c.f.i.k0) r1
            int r2 = r1.t()
            java.lang.Long r3 = r9.f4375h
            long r24 = r3.longValue()
            r26 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 / r26
            boolean r1 = r1.B()
            if (r1 == 0) goto L_0x0533
            java.lang.Long r1 = r9.f4374g
            long r24 = r1.longValue()
            long r24 = r24 / r26
        L_0x0533:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r2 = r7.containsKey(r1)
            if (r2 == 0) goto L_0x0544
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r7.put(r1, r2)
        L_0x0544:
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L_0x050b
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r4.put(r1, r2)
            goto L_0x050b
        L_0x0552:
            b.l.a.c.i.b.s9 r0 = new b.l.a.c.i.b.s9
            java.lang.String r3 = r9.d
            r1 = r0
            r2 = r63
            r10 = r4
            r4 = r8
            r8 = 0
            r24 = r11
            r11 = r18
            r64 = r12
            r16 = r13
            r12 = r19
            r13 = 2
            r28 = r21
            r8 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.Map<java.lang.Integer, b.l.a.c.i.b.s9> r1 = r9.f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r1.put(r2, r0)
            r13 = r16
            r0 = r22
            r10 = r23
            r11 = r24
            r8 = r28
            r12 = r64
            goto L_0x03d6
        L_0x0584:
            r28 = r8
            r23 = r10
            r11 = r18
            r12 = r19
            r13 = 2
        L_0x058d:
            boolean r0 = r65.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 == 0) goto L_0x059d
        L_0x0595:
            r18 = r11
            r19 = r12
            r12 = r28
            goto L_0x07fc
        L_0x059d:
            b.l.a.c.i.b.t9 r2 = new b.l.a.c.i.b.t9
            r2.<init>(r9)
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r3.<init>()
            java.util.Iterator r4 = r65.iterator()
        L_0x05ab:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0595
            java.lang.Object r0 = r4.next()
            b.l.a.c.f.i.o1 r0 = (b.l.a.c.f.i.o1) r0
            java.lang.String r5 = r9.d
            b.l.a.c.f.i.o1 r5 = r2.a(r5, r0)
            if (r5 == 0) goto L_0x05ab
            b.l.a.c.i.b.d9 r6 = r9.f4305b
            b.l.a.c.i.b.j r6 = r6.L()
            java.lang.String r7 = r9.d
            java.lang.String r8 = r5.v()
            java.lang.String r10 = r0.v()
            b.l.a.c.i.b.o r10 = r6.z(r7, r10)
            if (r10 != 0) goto L_0x0614
            b.l.a.c.i.b.l4 r10 = r6.a
            b.l.a.c.i.b.k3 r10 = r10.a()
            b.l.a.c.i.b.i3 r10 = r10.p()
            java.lang.Object r14 = b.l.a.c.i.b.k3.t(r7)
            b.l.a.c.i.b.l4 r6 = r6.a
            b.l.a.c.i.b.f3 r6 = r6.u()
            java.lang.String r6 = r6.p(r8)
            java.lang.String r8 = "Event aggregate wasn't created during raw event logging. appId, event"
            r10.c(r8, r14, r6)
            b.l.a.c.i.b.o r6 = new b.l.a.c.i.b.o
            r29 = r6
            java.lang.String r31 = r0.v()
            r32 = 1
            r34 = 1
            r36 = 1
            long r38 = r0.x()
            r40 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r30 = r7
            r29.<init>(r30, r31, r32, r34, r36, r38, r40, r42, r43, r44, r45)
            goto L_0x0649
        L_0x0614:
            b.l.a.c.i.b.o r6 = new b.l.a.c.i.b.o
            r46 = r6
            java.lang.String r0 = r10.a
            r47 = r0
            java.lang.String r0 = r10.f4180b
            r48 = r0
            long r7 = r10.c
            r16 = 1
            long r49 = r7 + r16
            long r7 = r10.d
            long r51 = r7 + r16
            long r7 = r10.f4181e
            long r53 = r7 + r16
            long r7 = r10.f
            r55 = r7
            long r7 = r10.f4182g
            r57 = r7
            java.lang.Long r0 = r10.f4183h
            r59 = r0
            java.lang.Long r0 = r10.f4184i
            r60 = r0
            java.lang.Long r0 = r10.f4185j
            r61 = r0
            java.lang.Boolean r0 = r10.f4186k
            r62 = r0
            r46.<init>(r47, r48, r49, r51, r53, r55, r57, r59, r60, r61, r62)
        L_0x0649:
            b.l.a.c.i.b.d9 r0 = r9.f4305b
            b.l.a.c.i.b.j r0 = r0.L()
            r0.A(r6)
            long r7 = r6.c
            java.lang.String r10 = r5.v()
            java.lang.Object r0 = r3.get(r10)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x074c
            b.l.a.c.i.b.d9 r0 = r9.f4305b
            b.l.a.c.i.b.j r14 = r0.L()
            java.lang.String r13 = r9.d
            r14.i()
            r14.h()
            b.l.a.c.b.a.x(r13)
            b.l.a.c.b.a.x(r10)
            r64 = r2
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            android.database.sqlite.SQLiteDatabase r29 = r14.y()
            java.lang.String[] r31 = new java.lang.String[]{r11, r12}     // Catch:{ SQLiteException -> 0x071f, all -> 0x071c }
            r65 = r4
            r4 = 2
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0716, all -> 0x071c }
            r4 = 0
            r0[r4] = r13     // Catch:{ SQLiteException -> 0x0716, all -> 0x071c }
            r4 = 1
            r0[r4] = r10     // Catch:{ SQLiteException -> 0x0716, all -> 0x071c }
            java.lang.String r30 = "event_filters"
            java.lang.String r32 = "app_id=? AND event_name=?"
            r34 = 0
            r35 = 0
            r36 = 0
            r33 = r0
            android.database.Cursor r4 = r29.query(r30, r31, r32, r33, r34, r35, r36)     // Catch:{ SQLiteException -> 0x0716, all -> 0x071c }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0712 }
            if (r0 == 0) goto L_0x0701
        L_0x06a4:
            r18 = r11
            r11 = 1
            byte[] r0 = r4.getBlob(r11)     // Catch:{ SQLiteException -> 0x06fd }
            b.l.a.c.f.i.j0 r11 = b.l.a.c.f.i.k0.E()     // Catch:{ IOException -> 0x06dd }
            b.l.a.c.f.i.f4 r0 = b.l.a.c.i.b.f9.G(r11, r0)     // Catch:{ IOException -> 0x06dd }
            b.l.a.c.f.i.j0 r0 = (b.l.a.c.f.i.j0) r0     // Catch:{ IOException -> 0x06dd }
            b.l.a.c.f.i.p5 r0 = r0.g()     // Catch:{ IOException -> 0x06dd }
            b.l.a.c.f.i.k0 r0 = (b.l.a.c.f.i.k0) r0     // Catch:{ IOException -> 0x06dd }
            r11 = 0
            int r17 = r4.getInt(r11)     // Catch:{ SQLiteException -> 0x06fd }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x06fd }
            java.lang.Object r17 = r2.get(r11)     // Catch:{ SQLiteException -> 0x06fd }
            java.util.List r17 = (java.util.List) r17     // Catch:{ SQLiteException -> 0x06fd }
            r19 = r12
            if (r17 != 0) goto L_0x06d7
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0710 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0710 }
            r2.put(r11, r12)     // Catch:{ SQLiteException -> 0x0710 }
            goto L_0x06d9
        L_0x06d7:
            r12 = r17
        L_0x06d9:
            r12.add(r0)     // Catch:{ SQLiteException -> 0x0710 }
            goto L_0x06f1
        L_0x06dd:
            r0 = move-exception
            r19 = r12
            b.l.a.c.i.b.l4 r11 = r14.a     // Catch:{ SQLiteException -> 0x0710 }
            b.l.a.c.i.b.k3 r11 = r11.a()     // Catch:{ SQLiteException -> 0x0710 }
            b.l.a.c.i.b.i3 r11 = r11.o()     // Catch:{ SQLiteException -> 0x0710 }
            java.lang.Object r12 = b.l.a.c.i.b.k3.t(r13)     // Catch:{ SQLiteException -> 0x0710 }
            r11.c(r15, r12, r0)     // Catch:{ SQLiteException -> 0x0710 }
        L_0x06f1:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0710 }
            if (r0 != 0) goto L_0x06f8
            goto L_0x0709
        L_0x06f8:
            r11 = r18
            r12 = r19
            goto L_0x06a4
        L_0x06fd:
            r0 = move-exception
        L_0x06fe:
            r19 = r12
            goto L_0x0724
        L_0x0701:
            r18 = r11
            r19 = r12
            java.util.Map r2 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0710 }
        L_0x0709:
            r4.close()
            r0 = r2
            r12 = r28
            goto L_0x0740
        L_0x0710:
            r0 = move-exception
            goto L_0x0724
        L_0x0712:
            r0 = move-exception
            r18 = r11
            goto L_0x06fe
        L_0x0716:
            r0 = move-exception
        L_0x0717:
            r18 = r11
            r19 = r12
            goto L_0x0723
        L_0x071c:
            r0 = move-exception
            r5 = 0
            goto L_0x0746
        L_0x071f:
            r0 = move-exception
            r65 = r4
            goto L_0x0717
        L_0x0723:
            r4 = 0
        L_0x0724:
            b.l.a.c.i.b.l4 r2 = r14.a     // Catch:{ all -> 0x0744 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x0744 }
            b.l.a.c.i.b.i3 r2 = r2.o()     // Catch:{ all -> 0x0744 }
            java.lang.Object r11 = b.l.a.c.i.b.k3.t(r13)     // Catch:{ all -> 0x0744 }
            r12 = r28
            r2.c(r12, r11, r0)     // Catch:{ all -> 0x0744 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0744 }
            if (r4 == 0) goto L_0x0740
            r4.close()
        L_0x0740:
            r3.put(r10, r0)
            goto L_0x0756
        L_0x0744:
            r0 = move-exception
            r5 = r4
        L_0x0746:
            if (r5 == 0) goto L_0x074b
            r5.close()
        L_0x074b:
            throw r0
        L_0x074c:
            r64 = r2
            r65 = r4
            r18 = r11
            r19 = r12
            r12 = r28
        L_0x0756:
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x075e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x07ef
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.util.Set<java.lang.Integer> r10 = r9.f4373e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x0788
            b.l.a.c.i.b.l4 r4 = r9.a
            b.l.a.c.i.b.k3 r4 = r4.a()
            b.l.a.c.i.b.i3 r4 = r4.s()
            r4.b(r1, r11)
            goto L_0x075e
        L_0x0788:
            java.lang.Object r10 = r0.get(r11)
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r10 = r10.iterator()
            r11 = 1
        L_0x0793:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x07de
            java.lang.Object r11 = r10.next()
            b.l.a.c.f.i.k0 r11 = (b.l.a.c.f.i.k0) r11
            b.l.a.c.i.b.u9 r13 = new b.l.a.c.i.b.u9
            java.lang.String r14 = r9.d
            r13.<init>(r9, r14, r4, r11)
            java.lang.Long r14 = r9.f4374g
            r17 = r0
            java.lang.Long r0 = r9.f4375h
            int r11 = r11.t()
            boolean r36 = r9.n(r4, r11)
            r29 = r13
            r30 = r14
            r31 = r0
            r32 = r5
            r33 = r7
            r35 = r6
            boolean r11 = r29.i(r30, r31, r32, r33, r35, r36)
            if (r11 == 0) goto L_0x07d4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            b.l.a.c.i.b.s9 r0 = r9.m(r0)
            r0.a(r13)
            r0 = r17
            goto L_0x0793
        L_0x07d4:
            java.util.Set<java.lang.Integer> r0 = r9.f4373e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r0.add(r10)
            goto L_0x07e0
        L_0x07de:
            r17 = r0
        L_0x07e0:
            if (r11 != 0) goto L_0x07eb
            java.util.Set<java.lang.Integer> r0 = r9.f4373e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
        L_0x07eb:
            r0 = r17
            goto L_0x075e
        L_0x07ef:
            r2 = r64
            r4 = r65
            r28 = r12
            r11 = r18
            r12 = r19
            r13 = 2
            goto L_0x05ab
        L_0x07fc:
            boolean r0 = r66.isEmpty()
            if (r0 == 0) goto L_0x0806
        L_0x0802:
            r11 = r18
            goto L_0x0a35
        L_0x0806:
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.util.Iterator r3 = r66.iterator()
        L_0x080f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0802
            java.lang.Object r0 = r3.next()
            r4 = r0
            b.l.a.c.f.i.g2 r4 = (b.l.a.c.f.i.g2) r4
            java.lang.String r5 = r4.u()
            java.lang.Object r0 = r2.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x0901
            b.l.a.c.i.b.d9 r0 = r9.f4305b
            b.l.a.c.i.b.j r6 = r0.L()
            java.lang.String r7 = r9.d
            r6.i()
            r6.h()
            b.l.a.c.b.a.x(r7)
            b.l.a.c.b.a.x(r5)
            androidx.collection.ArrayMap r8 = new androidx.collection.ArrayMap
            r8.<init>()
            android.database.sqlite.SQLiteDatabase r29 = r6.y()
            r11 = r18
            r10 = r19
            java.lang.String[] r31 = new java.lang.String[]{r11, r10}     // Catch:{ SQLiteException -> 0x08d7, all -> 0x08d4 }
            r13 = 2
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x08d7, all -> 0x08d4 }
            r13 = 0
            r0[r13] = r7     // Catch:{ SQLiteException -> 0x08d7, all -> 0x08d4 }
            r13 = 1
            r0[r13] = r5     // Catch:{ SQLiteException -> 0x08d7, all -> 0x08d4 }
            java.lang.String r30 = "property_filters"
            java.lang.String r32 = "app_id=? AND property_name=?"
            r34 = 0
            r35 = 0
            r36 = 0
            r33 = r0
            android.database.Cursor r13 = r29.query(r30, r31, r32, r33, r34, r35, r36)     // Catch:{ SQLiteException -> 0x08d7, all -> 0x08d4 }
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x08d0 }
            if (r0 == 0) goto L_0x08c7
        L_0x086c:
            r14 = 1
            byte[] r0 = r13.getBlob(r14)     // Catch:{ SQLiteException -> 0x08d0 }
            b.l.a.c.f.i.s0 r15 = b.l.a.c.f.i.t0.A()     // Catch:{ IOException -> 0x08a3 }
            b.l.a.c.f.i.f4 r0 = b.l.a.c.i.b.f9.G(r15, r0)     // Catch:{ IOException -> 0x08a3 }
            b.l.a.c.f.i.s0 r0 = (b.l.a.c.f.i.s0) r0     // Catch:{ IOException -> 0x08a3 }
            b.l.a.c.f.i.p5 r0 = r0.g()     // Catch:{ IOException -> 0x08a3 }
            b.l.a.c.f.i.t0 r0 = (b.l.a.c.f.i.t0) r0     // Catch:{ IOException -> 0x08a3 }
            r15 = 0
            int r17 = r13.getInt(r15)     // Catch:{ SQLiteException -> 0x08d0 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x08d0 }
            java.lang.Object r17 = r8.get(r14)     // Catch:{ SQLiteException -> 0x08d0 }
            java.util.List r17 = (java.util.List) r17     // Catch:{ SQLiteException -> 0x08d0 }
            if (r17 != 0) goto L_0x089b
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x08d0 }
            r15.<init>()     // Catch:{ SQLiteException -> 0x08d0 }
            r8.put(r14, r15)     // Catch:{ SQLiteException -> 0x08d0 }
            goto L_0x089d
        L_0x089b:
            r15 = r17
        L_0x089d:
            r15.add(r0)     // Catch:{ SQLiteException -> 0x08d0 }
            r64 = r3
            goto L_0x08b9
        L_0x08a3:
            r0 = move-exception
            b.l.a.c.i.b.l4 r14 = r6.a     // Catch:{ SQLiteException -> 0x08d0 }
            b.l.a.c.i.b.k3 r14 = r14.a()     // Catch:{ SQLiteException -> 0x08d0 }
            b.l.a.c.i.b.i3 r14 = r14.o()     // Catch:{ SQLiteException -> 0x08d0 }
            java.lang.String r15 = "Failed to merge filter"
            r64 = r3
            java.lang.Object r3 = b.l.a.c.i.b.k3.t(r7)     // Catch:{ SQLiteException -> 0x08ce }
            r14.c(r15, r3, r0)     // Catch:{ SQLiteException -> 0x08ce }
        L_0x08b9:
            boolean r0 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x08ce }
            if (r0 != 0) goto L_0x08c4
            r13.close()
            r0 = r8
            goto L_0x08f5
        L_0x08c4:
            r3 = r64
            goto L_0x086c
        L_0x08c7:
            r64 = r3
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x08ce }
            goto L_0x08f2
        L_0x08ce:
            r0 = move-exception
            goto L_0x08db
        L_0x08d0:
            r0 = move-exception
            r64 = r3
            goto L_0x08db
        L_0x08d4:
            r0 = move-exception
            r5 = 0
            goto L_0x08fb
        L_0x08d7:
            r0 = move-exception
            r64 = r3
            r13 = 0
        L_0x08db:
            b.l.a.c.i.b.l4 r3 = r6.a     // Catch:{ all -> 0x08f9 }
            b.l.a.c.i.b.k3 r3 = r3.a()     // Catch:{ all -> 0x08f9 }
            b.l.a.c.i.b.i3 r3 = r3.o()     // Catch:{ all -> 0x08f9 }
            java.lang.Object r6 = b.l.a.c.i.b.k3.t(r7)     // Catch:{ all -> 0x08f9 }
            r3.c(r12, r6, r0)     // Catch:{ all -> 0x08f9 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x08f9 }
            if (r13 == 0) goto L_0x08f5
        L_0x08f2:
            r13.close()
        L_0x08f5:
            r2.put(r5, r0)
            goto L_0x0907
        L_0x08f9:
            r0 = move-exception
            r5 = r13
        L_0x08fb:
            if (r5 == 0) goto L_0x0900
            r5.close()
        L_0x0900:
            throw r0
        L_0x0901:
            r64 = r3
            r11 = r18
            r10 = r19
        L_0x0907:
            java.util.Set r3 = r0.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x090f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0a2d
            java.lang.Object r5 = r3.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.Set<java.lang.Integer> r6 = r9.f4373e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x093a
            b.l.a.c.i.b.l4 r0 = r9.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.s()
            r0.b(r1, r7)
            goto L_0x0a2d
        L_0x093a:
            java.lang.Object r6 = r0.get(r7)
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = 1
        L_0x0945:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0a1c
            java.lang.Object r7 = r6.next()
            b.l.a.c.f.i.t0 r7 = (b.l.a.c.f.i.t0) r7
            b.l.a.c.i.b.l4 r8 = r9.a
            b.l.a.c.i.b.k3 r8 = r8.a()
            java.lang.String r8 = r8.v()
            r13 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r13)
            if (r8 == 0) goto L_0x09af
            b.l.a.c.i.b.l4 r8 = r9.a
            b.l.a.c.i.b.k3 r8 = r8.a()
            b.l.a.c.i.b.i3 r8 = r8.s()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            boolean r15 = r7.s()
            if (r15 == 0) goto L_0x097f
            int r15 = r7.t()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x0980
        L_0x097f:
            r15 = 0
        L_0x0980:
            b.l.a.c.i.b.l4 r13 = r9.a
            b.l.a.c.i.b.f3 r13 = r13.u()
            r65 = r0
            java.lang.String r0 = r7.u()
            java.lang.String r0 = r13.r(r0)
            java.lang.String r13 = "Evaluating filter. audience, filter, property"
            r8.d(r13, r14, r15, r0)
            b.l.a.c.i.b.l4 r0 = r9.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.s()
            b.l.a.c.i.b.d9 r8 = r9.f4305b
            b.l.a.c.i.b.f9 r8 = r8.P()
            java.lang.String r8 = r8.x(r7)
            java.lang.String r13 = "Filter definition"
            r0.b(r13, r8)
            goto L_0x09b1
        L_0x09af:
            r65 = r0
        L_0x09b1:
            boolean r0 = r7.s()
            if (r0 == 0) goto L_0x09f2
            int r0 = r7.t()
            r8 = 256(0x100, float:3.59E-43)
            if (r0 <= r8) goto L_0x09c0
            goto L_0x09f2
        L_0x09c0:
            b.l.a.c.i.b.w9 r0 = new b.l.a.c.i.b.w9
            java.lang.String r8 = r9.d
            r0.<init>(r9, r8, r5, r7)
            java.lang.Long r8 = r9.f4374g
            java.lang.Long r13 = r9.f4375h
            int r7 = r7.t()
            boolean r7 = r9.n(r5, r7)
            boolean r7 = r0.i(r8, r13, r4, r7)
            if (r7 == 0) goto L_0x09e8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            b.l.a.c.i.b.s9 r8 = r9.m(r8)
            r8.a(r0)
            r0 = r65
            goto L_0x0945
        L_0x09e8:
            java.util.Set<java.lang.Integer> r0 = r9.f4373e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r0.add(r6)
            goto L_0x0a1e
        L_0x09f2:
            b.l.a.c.i.b.l4 r0 = r9.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.p()
            java.lang.String r6 = r9.d
            java.lang.Object r6 = b.l.a.c.i.b.k3.t(r6)
            boolean r8 = r7.s()
            if (r8 == 0) goto L_0x0a11
            int r7 = r7.t()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0a12
        L_0x0a11:
            r7 = 0
        L_0x0a12:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "Invalid property filter ID. appId, id"
            r0.c(r8, r6, r7)
            goto L_0x0a20
        L_0x0a1c:
            r65 = r0
        L_0x0a1e:
            if (r7 != 0) goto L_0x0a29
        L_0x0a20:
            java.util.Set<java.lang.Integer> r0 = r9.f4373e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
        L_0x0a29:
            r0 = r65
            goto L_0x090f
        L_0x0a2d:
            r3 = r64
            r19 = r10
            r18 = r11
            goto L_0x080f
        L_0x0a35:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map<java.lang.Integer, b.l.a.c.i.b.s9> r0 = r9.f
            java.util.Set r0 = r0.keySet()
            java.util.Set<java.lang.Integer> r2 = r9.f4373e
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x0a49:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0ade
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.Integer, b.l.a.c.i.b.s9> r3 = r9.f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            b.l.a.c.i.b.s9 r3 = (b.l.a.c.i.b.s9) r3
            b.l.a.c.b.a.A(r3)
            b.l.a.c.f.i.j1 r0 = r3.b(r0)
            r1.add(r0)
            b.l.a.c.i.b.d9 r3 = r9.f4305b
            b.l.a.c.i.b.j r3 = r3.L()
            java.lang.String r5 = r9.d
            b.l.a.c.f.i.c2 r0 = r0.u()
            r3.i()
            r3.h()
            b.l.a.c.b.a.x(r5)
            b.l.a.c.b.a.A(r0)
            byte[] r0 = r0.e()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            r6.put(r11, r4)
            r4 = r23
            r6.put(r4, r0)
            android.database.sqlite.SQLiteDatabase r0 = r3.y()     // Catch:{ SQLiteException -> 0x0ac5 }
            java.lang.String r7 = "audience_filter_values"
            r8 = 5
            r10 = 0
            long r6 = r0.insertWithOnConflict(r7, r10, r6, r8)     // Catch:{ SQLiteException -> 0x0ac3 }
            r12 = -1
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0ada
            b.l.a.c.i.b.l4 r0 = r3.a     // Catch:{ SQLiteException -> 0x0ac3 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ SQLiteException -> 0x0ac3 }
            b.l.a.c.i.b.i3 r0 = r0.o()     // Catch:{ SQLiteException -> 0x0ac3 }
            java.lang.String r6 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r7 = b.l.a.c.i.b.k3.t(r5)     // Catch:{ SQLiteException -> 0x0ac3 }
            r0.b(r6, r7)     // Catch:{ SQLiteException -> 0x0ac3 }
            goto L_0x0ada
        L_0x0ac3:
            r0 = move-exception
            goto L_0x0ac7
        L_0x0ac5:
            r0 = move-exception
            r10 = 0
        L_0x0ac7:
            b.l.a.c.i.b.l4 r3 = r3.a
            b.l.a.c.i.b.k3 r3 = r3.a()
            b.l.a.c.i.b.i3 r3 = r3.o()
            java.lang.Object r5 = b.l.a.c.i.b.k3.t(r5)
            java.lang.String r6 = "Error storing filter results. appId"
            r3.c(r6, r5, r0)
        L_0x0ada:
            r23 = r4
            goto L_0x0a49
        L_0x0ade:
            return r1
        L_0x0adf:
            r0 = move-exception
            r5 = r4
        L_0x0ae1:
            if (r5 == 0) goto L_0x0ae6
            r5.close()
        L_0x0ae6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.x9.l(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    public final s9 m(Integer num) {
        if (this.f.containsKey(num)) {
            return this.f.get(num);
        }
        s9 s9Var = new s9(this, this.d);
        this.f.put(num, s9Var);
        return s9Var;
    }

    public final boolean n(int i2, int i3) {
        s9 s9Var = this.f.get(Integer.valueOf(i2));
        if (s9Var == null) {
            return false;
        }
        return s9Var.d.get(i3);
    }
}
