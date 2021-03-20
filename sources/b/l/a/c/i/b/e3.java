package b.l.a.c.i.b;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import androidx.annotation.WorkerThread;

public final class e3 extends a4 {
    public final d3 c = new d3(this, this.a.a);
    public boolean d;

    public e3(l4 l4Var) {
        super(l4Var);
    }

    public final boolean k() {
        return false;
    }

    @WorkerThread
    public final void l() {
        int delete;
        h();
        try {
            SQLiteDatabase n2 = n();
            if (n2 != null && (delete = n2.delete("messages", (String) null, (String[]) null)) > 0) {
                this.a.a().f4096n.b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            this.a.a().f.b("Error resetting local analytics data. error", e2);
        }
    }

    @WorkerThread
    public final boolean m() {
        h();
        if (!this.d && this.a.a.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i2 = 5;
            int i3 = 0;
            while (i3 < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase n2 = n();
                    if (n2 == null) {
                        this.d = true;
                        return false;
                    }
                    n2.beginTransaction();
                    n2.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    n2.setTransactionSuccessful();
                    n2.endTransaction();
                    n2.close();
                    return true;
                } catch (SQLiteFullException e2) {
                    this.a.a().f.b("Error deleting app launch break from local database", e2);
                    this.d = true;
                    if (sQLiteDatabase == null) {
                        i3++;
                    }
                    sQLiteDatabase.close();
                    i3++;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep((long) i2);
                    i2 += 20;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i3++;
                    } else {
                        i3++;
                    }
                } catch (SQLiteException e3) {
                    if (sQLiteDatabase != null) {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                    this.a.a().f.b("Error deleting app launch break from local database", e3);
                    this.d = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i3++;
                    } else {
                        i3++;
                    }
                } catch (Throwable th) {
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            }
            this.a.a().f4091i.a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    @WorkerThread
    public final SQLiteDatabase n() {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.d = true;
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r7v5, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v8, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6 A[SYNTHETIC, Splitter:B:47:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0118 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0118 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0118 A[SYNTHETIC] */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean o(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.h()
            boolean r0 = r1.d
            r2 = 0
            if (r0 == 0) goto L_0x000b
            return r2
        L_0x000b:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            b.l.a.c.i.b.l4 r0 = r1.a
            b.l.a.c.i.b.f r0 = r0.f4114g
            r4 = 5
            r5 = r2
            r6 = r4
        L_0x0027:
            if (r5 >= r4) goto L_0x012e
            r7 = 0
            r8 = 1
            android.database.sqlite.SQLiteDatabase r9 = r16.n()     // Catch:{ SQLiteFullException -> 0x00fb, SQLiteDatabaseLockedException -> 0x00e9, SQLiteException -> 0x00c2, all -> 0x00be }
            if (r9 != 0) goto L_0x0034
            r1.d = r8     // Catch:{ SQLiteFullException -> 0x00bc, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b8 }
            return r2
        L_0x0034:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00bc, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b8 }
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r10 = r9.rawQuery(r0, r7)     // Catch:{ SQLiteFullException -> 0x00bc, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b8 }
            r11 = 0
            if (r10 == 0) goto L_0x0052
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            if (r0 == 0) goto L_0x0052
            long r11 = r10.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            goto L_0x0052
        L_0x004c:
            r0 = move-exception
            goto L_0x00ac
        L_0x004e:
            r0 = move-exception
            goto L_0x00af
        L_0x0050:
            r0 = move-exception
            goto L_0x00b3
        L_0x0052:
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            java.lang.String r15 = "messages"
            if (r0 < 0) goto L_0x0099
            b.l.a.c.i.b.l4 r0 = r1.a     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            b.l.a.c.i.b.i3 r0 = r0.f     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            java.lang.String r4 = "Data loss, local db full"
            r0.a(r4)     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            long r13 = r13 - r11
            r11 = 1
            long r13 = r13 + r11
            java.lang.String[] r0 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            java.lang.String r4 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            r0[r2] = r4     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            java.lang.String r4 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            int r0 = r9.delete(r15, r4, r0)     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            long r11 = (long) r0     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0099
            b.l.a.c.i.b.l4 r0 = r1.a     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            b.l.a.c.i.b.i3 r0 = r0.f     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            java.lang.String r4 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            long r13 = r13 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            r0.d(r4, r2, r8, r11)     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
        L_0x0099:
            r9.insertOrThrow(r15, r7, r3)     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            if (r10 == 0) goto L_0x00a7
            r10.close()
        L_0x00a7:
            r9.close()
            r2 = 1
            return r2
        L_0x00ac:
            r7 = r10
            goto L_0x0123
        L_0x00af:
            r7 = r10
            goto L_0x00b9
        L_0x00b1:
            r7 = r10
            goto L_0x00ea
        L_0x00b3:
            r7 = r10
            goto L_0x00fd
        L_0x00b5:
            r0 = move-exception
            goto L_0x0123
        L_0x00b8:
            r0 = move-exception
        L_0x00b9:
            r2 = r7
            r7 = r9
            goto L_0x00c4
        L_0x00bc:
            r0 = move-exception
            goto L_0x00fd
        L_0x00be:
            r0 = move-exception
            r9 = r7
            goto L_0x0123
        L_0x00c2:
            r0 = move-exception
            r2 = r7
        L_0x00c4:
            if (r7 == 0) goto L_0x00cf
            boolean r4 = r7.inTransaction()     // Catch:{ all -> 0x00e7 }
            if (r4 == 0) goto L_0x00cf
            r7.endTransaction()     // Catch:{ all -> 0x00e7 }
        L_0x00cf:
            b.l.a.c.i.b.l4 r4 = r1.a     // Catch:{ all -> 0x00e7 }
            b.l.a.c.i.b.k3 r4 = r4.a()     // Catch:{ all -> 0x00e7 }
            b.l.a.c.i.b.i3 r4 = r4.f     // Catch:{ all -> 0x00e7 }
            java.lang.String r8 = "Error writing entry to local database"
            r4.b(r8, r0)     // Catch:{ all -> 0x00e7 }
            r4 = 1
            r1.d = r4     // Catch:{ all -> 0x00e7 }
            if (r2 == 0) goto L_0x00e4
            r2.close()
        L_0x00e4:
            if (r7 == 0) goto L_0x0118
            goto L_0x0115
        L_0x00e7:
            r0 = move-exception
            goto L_0x0121
        L_0x00e9:
            r9 = r7
        L_0x00ea:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x00b5 }
            int r6 = r6 + 20
            if (r7 == 0) goto L_0x00f5
            r7.close()
        L_0x00f5:
            if (r9 == 0) goto L_0x0118
            r9.close()
            goto L_0x0118
        L_0x00fb:
            r0 = move-exception
            r9 = r7
        L_0x00fd:
            b.l.a.c.i.b.l4 r2 = r1.a     // Catch:{ all -> 0x011e }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x011e }
            b.l.a.c.i.b.i3 r2 = r2.f     // Catch:{ all -> 0x011e }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.b(r4, r0)     // Catch:{ all -> 0x011e }
            r2 = 1
            r1.d = r2     // Catch:{ all -> 0x011e }
            if (r7 == 0) goto L_0x0112
            r7.close()
        L_0x0112:
            if (r9 == 0) goto L_0x0118
            r7 = r9
        L_0x0115:
            r7.close()
        L_0x0118:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0027
        L_0x011e:
            r0 = move-exception
            r2 = r7
            r7 = r9
        L_0x0121:
            r9 = r7
            r7 = r2
        L_0x0123:
            if (r7 == 0) goto L_0x0128
            r7.close()
        L_0x0128:
            if (r9 == 0) goto L_0x012d
            r9.close()
        L_0x012d:
            throw r0
        L_0x012e:
            b.l.a.c.i.b.l4 r0 = r1.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4096n
            java.lang.String r2 = "Failed to write entry to local database"
            r0.a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.e3.o(int, byte[]):boolean");
    }
}
