package b.l.a.c.i.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.appcompat.widget.ActivityChooserView;
import b.l.a.c.b.a;
import b.l.a.c.c.p.c;
import b.l.a.c.f.i.o1;
import b.l.a.c.f.i.y9;
import com.amplitude.api.DatabaseHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class j extends u8 {
    public static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f4067g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f4068h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f4069i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f4070j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f4071k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f4072l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f4073m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public final i d;

    /* renamed from: e  reason: collision with root package name */
    public final r8 f4074e = new r8(this.a.f4121n);

    public j(d9 d9Var) {
        super(d9Var);
        f fVar = this.a.f4114g;
        this.d = new i(this, this.a.a);
    }

    @WorkerThread
    public static final void s(ContentValues contentValues, String str, Object obj) {
        a.x("value");
        Objects.requireNonNull(obj, "null reference");
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    @WorkerThread
    public final void A(o oVar) {
        Objects.requireNonNull(oVar, "null reference");
        h();
        i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", oVar.a);
        contentValues.put("name", oVar.f4180b);
        contentValues.put("lifetime_count", Long.valueOf(oVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(oVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(oVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(oVar.f4182g));
        contentValues.put("last_bundled_day", oVar.f4183h);
        contentValues.put("last_sampled_complex_event_id", oVar.f4184i);
        contentValues.put("last_sampling_rate", oVar.f4185j);
        contentValues.put("current_session_count", Long.valueOf(oVar.f4181e));
        Boolean bool = oVar.f4186k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (y().insertWithOnConflict(DatabaseHelper.EVENT_TABLE_NAME, (String) null, contentValues, 5) == -1) {
                this.a.a().f.b("Failed to insert/update event aggregates (got -1). appId", k3.t(oVar.a));
            }
        } catch (SQLiteException e2) {
            this.a.a().f.c("Error storing event aggregates. appId", k3.t(oVar.a), e2);
        }
    }

    @WorkerThread
    public final void B(String str, String str2) {
        a.x(str);
        a.x(str2);
        h();
        i();
        try {
            y().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            this.a.a().f.d("Error deleting user property. appId", k3.t(str), this.a.u().r(str2), e2);
        }
    }

    @WorkerThread
    public final boolean C(i9 i9Var) {
        h();
        i();
        if (D(i9Var.a, i9Var.c) == null) {
            if (k9.e0(i9Var.c)) {
                if (t("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{i9Var.a}) >= ((long) this.a.f4114g.q(i9Var.a, x2.G, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(i9Var.c)) {
                long t = t("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{i9Var.a, i9Var.f4065b});
                f fVar = this.a.f4114g;
                if (t >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", i9Var.a);
        contentValues.put("origin", i9Var.f4065b);
        contentValues.put("name", i9Var.c);
        contentValues.put("set_timestamp", Long.valueOf(i9Var.d));
        s(contentValues, "value", i9Var.f4066e);
        try {
            if (y().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                this.a.a().f.b("Failed to insert/update user property (got -1). appId", k3.t(i9Var.a));
            }
        } catch (SQLiteException e2) {
            this.a.a().f.c("Error storing user property. appId", k3.t(i9Var.a), e2);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.a.c.i.b.i9 D(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            b.l.a.c.b.a.x(r20)
            b.l.a.c.b.a.x(r21)
            r19.h()
            r19.i()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.y()     // Catch:{ SQLiteException -> 0x007c, all -> 0x007a }
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch:{ SQLiteException -> 0x007c, all -> 0x007a }
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x007c, all -> 0x007a }
            r2 = 0
            r15[r2] = r20     // Catch:{ SQLiteException -> 0x007c, all -> 0x007a }
            r3 = 1
            r15[r3] = r9     // Catch:{ SQLiteException -> 0x007c, all -> 0x007a }
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x007c, all -> 0x007a }
            boolean r4 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0074 }
            if (r4 != 0) goto L_0x0040
            r11.close()
            return r10
        L_0x0040:
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.Object r8 = r1.l(r11, r3)     // Catch:{ SQLiteException -> 0x0074 }
            if (r8 != 0) goto L_0x004e
            r11.close()
            return r10
        L_0x004e:
            java.lang.String r4 = r11.getString(r0)     // Catch:{ SQLiteException -> 0x0074 }
            b.l.a.c.i.b.i9 r0 = new b.l.a.c.i.b.i9     // Catch:{ SQLiteException -> 0x0074 }
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x0074 }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0074 }
            if (r2 == 0) goto L_0x0076
            b.l.a.c.i.b.l4 r2 = r1.a     // Catch:{ SQLiteException -> 0x0074 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ SQLiteException -> 0x0074 }
            b.l.a.c.i.b.i3 r2 = r2.f     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r20)     // Catch:{ SQLiteException -> 0x0074 }
            r2.b(r3, r4)     // Catch:{ SQLiteException -> 0x0074 }
            goto L_0x0076
        L_0x0074:
            r0 = move-exception
            goto L_0x007e
        L_0x0076:
            r11.close()
            return r0
        L_0x007a:
            r0 = move-exception
            goto L_0x00a1
        L_0x007c:
            r0 = move-exception
            r11 = r10
        L_0x007e:
            b.l.a.c.i.b.l4 r2 = r1.a     // Catch:{ all -> 0x009f }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x009f }
            b.l.a.c.i.b.i3 r2 = r2.f     // Catch:{ all -> 0x009f }
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r20)     // Catch:{ all -> 0x009f }
            b.l.a.c.i.b.l4 r5 = r1.a     // Catch:{ all -> 0x009f }
            b.l.a.c.i.b.f3 r5 = r5.u()     // Catch:{ all -> 0x009f }
            java.lang.String r5 = r5.r(r9)     // Catch:{ all -> 0x009f }
            r2.d(r3, r4, r5, r0)     // Catch:{ all -> 0x009f }
            if (r11 == 0) goto L_0x009e
            r11.close()
        L_0x009e:
            return r10
        L_0x009f:
            r0 = move-exception
            r10 = r11
        L_0x00a1:
            if (r10 == 0) goto L_0x00a6
            r10.close()
        L_0x00a6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.j.D(java.lang.String, java.lang.String):b.l.a.c.i.b.i9");
    }

    @WorkerThread
    public final List<i9> E(String str) {
        a.x(str);
        h();
        i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            f fVar = this.a.f4114g;
            Cursor query = y().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j2 = query.getLong(2);
                    Object l2 = l(query, 3);
                    if (l2 == null) {
                        this.a.a().f.b("Read invalid user property value, ignoring it. appId", k3.t(str));
                    } else {
                        arrayList.add(new i9(str, str2, string, j2, l2));
                    }
                } while (query.moveToNext());
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e2) {
            this.a.a().f.c("Error querying user properties. appId", k3.t(str), e2);
            List<i9> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0112  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<b.l.a.c.i.b.i9> F(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            r16 = this;
            r1 = r16
            b.l.a.c.b.a.x(r17)
            r16.h()
            r16.i()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1001"
            r11 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00f6 }
            r12 = 3
            r2.<init>(r12)     // Catch:{ SQLiteException -> 0x00f6 }
            r13 = r17
            r2.add(r13)     // Catch:{ SQLiteException -> 0x00f4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00f4 }
            java.lang.String r4 = "app_id=?"
            r3.<init>(r4)     // Catch:{ SQLiteException -> 0x00f4 }
            boolean r4 = android.text.TextUtils.isEmpty(r18)     // Catch:{ SQLiteException -> 0x00f4 }
            if (r4 != 0) goto L_0x0036
            r14 = r18
            r2.add(r14)     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r4 = " and origin=?"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x00b0 }
            goto L_0x0038
        L_0x0036:
            r14 = r18
        L_0x0038:
            boolean r4 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SQLiteException -> 0x00b0 }
            if (r4 != 0) goto L_0x0050
            java.lang.String r4 = java.lang.String.valueOf(r19)     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r5 = "*"
            java.lang.String r4 = r4.concat(r5)     // Catch:{ SQLiteException -> 0x00b0 }
            r2.add(r4)     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r4 = " and name glob ?"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x00b0 }
        L_0x0050:
            int r4 = r2.size()     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch:{ SQLiteException -> 0x00b0 }
            r6 = r2
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ SQLiteException -> 0x00b0 }
            android.database.sqlite.SQLiteDatabase r2 = r16.y()     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r4 = "user_attributes"
            java.lang.String r5 = "name"
            java.lang.String r7 = "set_timestamp"
            java.lang.String r8 = "value"
            java.lang.String r9 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r5, r7, r8, r9}     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r7 = r3.toString()     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r9 = "rowid"
            b.l.a.c.i.b.l4 r3 = r1.a     // Catch:{ SQLiteException -> 0x00b0 }
            b.l.a.c.i.b.f r3 = r3.f4114g     // Catch:{ SQLiteException -> 0x00b0 }
            r8 = 0
            r15 = 0
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r8
            r8 = r15
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00b0 }
            boolean r2 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x00b0 }
            if (r2 != 0) goto L_0x008e
            r11.close()
            return r0
        L_0x008e:
            int r2 = r0.size()     // Catch:{ SQLiteException -> 0x00b0 }
            b.l.a.c.i.b.l4 r3 = r1.a     // Catch:{ SQLiteException -> 0x00b0 }
            b.l.a.c.i.b.f r4 = r3.f4114g     // Catch:{ SQLiteException -> 0x00b0 }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r4) goto L_0x00b2
            b.l.a.c.i.b.k3 r2 = r3.a()     // Catch:{ SQLiteException -> 0x00b0 }
            b.l.a.c.i.b.i3 r2 = r2.f     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r3 = "Read more than the max allowed user properties, ignoring excess"
            b.l.a.c.i.b.l4 r5 = r1.a     // Catch:{ SQLiteException -> 0x00b0 }
            b.l.a.c.i.b.f r5 = r5.f4114g     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x00b0 }
            r2.b(r3, r4)     // Catch:{ SQLiteException -> 0x00b0 }
            goto L_0x00f0
        L_0x00ae:
            r0 = move-exception
            goto L_0x0116
        L_0x00b0:
            r0 = move-exception
            goto L_0x00fb
        L_0x00b2:
            r2 = 0
            java.lang.String r6 = r11.getString(r2)     // Catch:{ SQLiteException -> 0x00b0 }
            r2 = 1
            long r7 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x00b0 }
            r2 = 2
            java.lang.Object r9 = r1.l(r11, r2)     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r14 = r11.getString(r12)     // Catch:{ SQLiteException -> 0x00b0 }
            if (r9 != 0) goto L_0x00db
            b.l.a.c.i.b.l4 r2 = r1.a     // Catch:{ SQLiteException -> 0x00b0 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ SQLiteException -> 0x00b0 }
            b.l.a.c.i.b.i3 r2 = r2.f     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r3 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r17)     // Catch:{ SQLiteException -> 0x00b0 }
            r10 = r19
            r2.d(r3, r4, r14, r10)     // Catch:{ SQLiteException -> 0x00b0 }
            goto L_0x00e9
        L_0x00db:
            r10 = r19
            b.l.a.c.i.b.i9 r2 = new b.l.a.c.i.b.i9     // Catch:{ SQLiteException -> 0x00b0 }
            r3 = r2
            r4 = r17
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r9)     // Catch:{ SQLiteException -> 0x00b0 }
            r0.add(r2)     // Catch:{ SQLiteException -> 0x00b0 }
        L_0x00e9:
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x00b0 }
            if (r2 == 0) goto L_0x00f0
            goto L_0x008e
        L_0x00f0:
            r11.close()
            return r0
        L_0x00f4:
            r0 = move-exception
            goto L_0x00f9
        L_0x00f6:
            r0 = move-exception
            r13 = r17
        L_0x00f9:
            r14 = r18
        L_0x00fb:
            b.l.a.c.i.b.l4 r2 = r1.a     // Catch:{ all -> 0x00ae }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x00ae }
            b.l.a.c.i.b.i3 r2 = r2.f     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r17)     // Catch:{ all -> 0x00ae }
            r2.d(r3, r4, r14, r0)     // Catch:{ all -> 0x00ae }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00ae }
            if (r11 == 0) goto L_0x0115
            r11.close()
        L_0x0115:
            return r0
        L_0x0116:
            if (r11 == 0) goto L_0x011b
            r11.close()
        L_0x011b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.j.F(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    @WorkerThread
    public final boolean G(b bVar) {
        h();
        i();
        String str = bVar.f3911h;
        Objects.requireNonNull(str, "null reference");
        if (D(str, bVar.f3913j.f4021i) == null) {
            long t = t("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            f fVar = this.a.f4114g;
            if (t >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", bVar.f3912i);
        contentValues.put("name", bVar.f3913j.f4021i);
        Object V = bVar.f3913j.V();
        Objects.requireNonNull(V, "null reference");
        s(contentValues, "value", V);
        contentValues.put("active", Boolean.valueOf(bVar.f3915l));
        contentValues.put("trigger_event_name", bVar.f3916m);
        contentValues.put("trigger_timeout", Long.valueOf(bVar.f3918o));
        contentValues.put("timed_out_event", this.a.t().L(bVar.f3917n));
        contentValues.put("creation_timestamp", Long.valueOf(bVar.f3914k));
        contentValues.put("triggered_event", this.a.t().L(bVar.f3919p));
        contentValues.put("triggered_timestamp", Long.valueOf(bVar.f3913j.f4022j));
        contentValues.put("time_to_live", Long.valueOf(bVar.f3920q));
        contentValues.put("expired_event", this.a.t().L(bVar.r));
        try {
            if (y().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                this.a.a().f.b("Failed to insert/update conditional user property (got -1)", k3.t(str));
            }
        } catch (SQLiteException e2) {
            this.a.a().f.c("Error storing conditional user property", k3.t(str), e2);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011d  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.a.c.i.b.b H(java.lang.String r31, java.lang.String r32) {
        /*
            r30 = this;
            r1 = r30
            r8 = r32
            b.l.a.c.b.a.x(r31)
            b.l.a.c.b.a.x(r32)
            r30.h()
            r30.i()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r30.y()     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f4 }
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r12 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f4 }
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f4 }
            r2 = 0
            r14[r2] = r31     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f4 }
            r3 = 1
            r14[r3] = r8     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f4 }
            java.lang.String r11 = "conditional_properties"
            java.lang.String r13 = "app_id=? and name=?"
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f4 }
            boolean r4 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x00ee }
            if (r4 != 0) goto L_0x004f
            r10.close()
            return r9
        L_0x004f:
            java.lang.String r17 = r10.getString(r2)     // Catch:{ SQLiteException -> 0x00ee }
            java.lang.Object r6 = r1.l(r10, r3)     // Catch:{ SQLiteException -> 0x00ee }
            int r0 = r10.getInt(r0)     // Catch:{ SQLiteException -> 0x00ee }
            if (r0 == 0) goto L_0x0060
            r21 = r3
            goto L_0x0062
        L_0x0060:
            r21 = r2
        L_0x0062:
            r0 = 3
            java.lang.String r22 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x00ee }
            r0 = 4
            long r24 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00ee }
            b.l.a.c.i.b.d9 r0 = r1.f4305b     // Catch:{ SQLiteException -> 0x00ee }
            b.l.a.c.i.b.f9 r0 = r0.P()     // Catch:{ SQLiteException -> 0x00ee }
            r2 = 5
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable$Creator<b.l.a.c.i.b.s> r3 = b.l.a.c.i.b.s.CREATOR     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable r0 = r0.y(r2, r3)     // Catch:{ SQLiteException -> 0x00ee }
            r23 = r0
            b.l.a.c.i.b.s r23 = (b.l.a.c.i.b.s) r23     // Catch:{ SQLiteException -> 0x00ee }
            r0 = 6
            long r19 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00ee }
            b.l.a.c.i.b.d9 r0 = r1.f4305b     // Catch:{ SQLiteException -> 0x00ee }
            b.l.a.c.i.b.f9 r0 = r0.P()     // Catch:{ SQLiteException -> 0x00ee }
            r2 = 7
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable r0 = r0.y(r2, r3)     // Catch:{ SQLiteException -> 0x00ee }
            r26 = r0
            b.l.a.c.i.b.s r26 = (b.l.a.c.i.b.s) r26     // Catch:{ SQLiteException -> 0x00ee }
            r0 = 8
            long r4 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00ee }
            r0 = 9
            long r27 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00ee }
            b.l.a.c.i.b.d9 r0 = r1.f4305b     // Catch:{ SQLiteException -> 0x00ee }
            b.l.a.c.i.b.f9 r0 = r0.P()     // Catch:{ SQLiteException -> 0x00ee }
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable r0 = r0.y(r2, r3)     // Catch:{ SQLiteException -> 0x00ee }
            r29 = r0
            b.l.a.c.i.b.s r29 = (b.l.a.c.i.b.s) r29     // Catch:{ SQLiteException -> 0x00ee }
            b.l.a.c.i.b.g9 r18 = new b.l.a.c.i.b.g9     // Catch:{ SQLiteException -> 0x00ee }
            r2 = r18
            r3 = r32
            r7 = r17
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x00ee }
            b.l.a.c.i.b.b r0 = new b.l.a.c.i.b.b     // Catch:{ SQLiteException -> 0x00ee }
            r15 = r0
            r16 = r31
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r29)     // Catch:{ SQLiteException -> 0x00ee }
            boolean r2 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x00ee }
            if (r2 == 0) goto L_0x00f0
            b.l.a.c.i.b.l4 r2 = r1.a     // Catch:{ SQLiteException -> 0x00ee }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ SQLiteException -> 0x00ee }
            b.l.a.c.i.b.i3 r2 = r2.f     // Catch:{ SQLiteException -> 0x00ee }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r31)     // Catch:{ SQLiteException -> 0x00ee }
            b.l.a.c.i.b.l4 r5 = r1.a     // Catch:{ SQLiteException -> 0x00ee }
            b.l.a.c.i.b.f3 r5 = r5.u()     // Catch:{ SQLiteException -> 0x00ee }
            java.lang.String r5 = r5.r(r8)     // Catch:{ SQLiteException -> 0x00ee }
            r2.c(r3, r4, r5)     // Catch:{ SQLiteException -> 0x00ee }
            goto L_0x00f0
        L_0x00ee:
            r0 = move-exception
            goto L_0x00f8
        L_0x00f0:
            r10.close()
            return r0
        L_0x00f4:
            r0 = move-exception
            goto L_0x011b
        L_0x00f6:
            r0 = move-exception
            r10 = r9
        L_0x00f8:
            b.l.a.c.i.b.l4 r2 = r1.a     // Catch:{ all -> 0x0119 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x0119 }
            b.l.a.c.i.b.i3 r2 = r2.f     // Catch:{ all -> 0x0119 }
            java.lang.String r3 = "Error querying conditional property"
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r31)     // Catch:{ all -> 0x0119 }
            b.l.a.c.i.b.l4 r5 = r1.a     // Catch:{ all -> 0x0119 }
            b.l.a.c.i.b.f3 r5 = r5.u()     // Catch:{ all -> 0x0119 }
            java.lang.String r5 = r5.r(r8)     // Catch:{ all -> 0x0119 }
            r2.d(r3, r4, r5, r0)     // Catch:{ all -> 0x0119 }
            if (r10 == 0) goto L_0x0118
            r10.close()
        L_0x0118:
            return r9
        L_0x0119:
            r0 = move-exception
            r9 = r10
        L_0x011b:
            if (r9 == 0) goto L_0x0120
            r9.close()
        L_0x0120:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.j.H(java.lang.String, java.lang.String):b.l.a.c.i.b.b");
    }

    @WorkerThread
    public final int I(String str, String str2) {
        a.x(str);
        a.x(str2);
        h();
        i();
        try {
            return y().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            this.a.a().f.d("Error deleting conditional property", k3.t(str), this.a.u().r(str2), e2);
            return 0;
        }
    }

    @WorkerThread
    public final List<b> J(String str, String str2, String str3) {
        a.x(str);
        h();
        i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return K(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List<b> K(String str, String[] strArr) {
        h();
        i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            f fVar = this.a.f4114g;
            Cursor query = y().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (query.moveToFirst()) {
                while (true) {
                    int size = arrayList.size();
                    l4 l4Var = this.a;
                    f fVar2 = l4Var.f4114g;
                    if (size < 1000) {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        Object l2 = l(query, 3);
                        boolean z = query.getInt(4) != 0;
                        String string4 = query.getString(5);
                        long j2 = query.getLong(6);
                        f9 P = this.f4305b.P();
                        byte[] blob = query.getBlob(7);
                        Parcelable.Creator creator = s.CREATOR;
                        arrayList.add(new b(string, string2, new g9(string3, query.getLong(10), l2, string2), query.getLong(8), z, string4, (s) P.y(blob, creator), j2, (s) this.f4305b.P().y(query.getBlob(9), creator), query.getLong(11), (s) this.f4305b.P().y(query.getBlob(12), creator)));
                        if (!query.moveToNext()) {
                            break;
                        }
                    } else {
                        i3 i3Var = l4Var.a().f;
                        f fVar3 = this.a.f4114g;
                        i3Var.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        break;
                    }
                }
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e2) {
            this.a.a().f.b("Error querying conditional user property value", e2);
            List<b> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ee A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f0 A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x010d A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x010f A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x012c A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x012e A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x014b A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x014d A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x016d A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0171 A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0199 A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x019b A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01b8 A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01ba A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01d7 A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01f0 A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x020c A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x020d A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x021c A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x023d A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0257 A[Catch:{ SQLiteException -> 0x0269 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x028e  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.a.c.i.b.a5 L(java.lang.String r34) {
        /*
            r33 = this;
            r1 = r33
            r2 = r34
            b.l.a.c.b.a.x(r34)
            r33.h()
            r33.i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r33.y()     // Catch:{ SQLiteException -> 0x0271, all -> 0x026f }
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "admob_app_id"
            java.lang.String r30 = "dynamite_version"
            java.lang.String r31 = "safelisted_events"
            java.lang.String r32 = "ga_app_id"
            java.lang.String[] r6 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32}     // Catch:{ SQLiteException -> 0x0271, all -> 0x026f }
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0271, all -> 0x026f }
            r12 = 0
            r8[r12] = r2     // Catch:{ SQLiteException -> 0x0271, all -> 0x026f }
            java.lang.String r5 = "apps"
            java.lang.String r7 = "app_id=?"
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0271, all -> 0x026f }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0269 }
            if (r5 != 0) goto L_0x0069
            r4.close()
            return r3
        L_0x0069:
            b.l.a.c.i.b.a5 r5 = new b.l.a.c.i.b.a5     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.d9 r6 = r1.f4305b     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.l4 r6 = r6.f3979j     // Catch:{ SQLiteException -> 0x0269 }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x0269 }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x0269 }
            r5.A(r6)     // Catch:{ SQLiteException -> 0x0269 }
            java.lang.String r6 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0269 }
            r5.C(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 2
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.I(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.h(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 4
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.M(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 5
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.O(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 6
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.Q(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 7
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.U(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 8
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.a(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 9
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.c(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 10
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0269 }
            if (r7 != 0) goto L_0x00d3
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x0269 }
            if (r6 == 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r6 = r12
            goto L_0x00d4
        L_0x00d3:
            r6 = r0
        L_0x00d4:
            r5.g(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 11
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.l4 r8 = r5.a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.i4 r8 = r8.d()     // Catch:{ SQLiteException -> 0x0269 }
            r8.h()     // Catch:{ SQLiteException -> 0x0269 }
            boolean r8 = r5.D     // Catch:{ SQLiteException -> 0x0269 }
            long r9 = r5.w     // Catch:{ SQLiteException -> 0x0269 }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x00f0
            r9 = r0
            goto L_0x00f1
        L_0x00f0:
            r9 = r12
        L_0x00f1:
            r8 = r8 | r9
            r5.D = r8     // Catch:{ SQLiteException -> 0x0269 }
            r5.w = r6     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 12
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.l4 r8 = r5.a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.i4 r8 = r8.d()     // Catch:{ SQLiteException -> 0x0269 }
            r8.h()     // Catch:{ SQLiteException -> 0x0269 }
            boolean r8 = r5.D     // Catch:{ SQLiteException -> 0x0269 }
            long r9 = r5.x     // Catch:{ SQLiteException -> 0x0269 }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x010f
            r9 = r0
            goto L_0x0110
        L_0x010f:
            r9 = r12
        L_0x0110:
            r8 = r8 | r9
            r5.D = r8     // Catch:{ SQLiteException -> 0x0269 }
            r5.x = r6     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 13
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.l4 r8 = r5.a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.i4 r8 = r8.d()     // Catch:{ SQLiteException -> 0x0269 }
            r8.h()     // Catch:{ SQLiteException -> 0x0269 }
            boolean r8 = r5.D     // Catch:{ SQLiteException -> 0x0269 }
            long r9 = r5.y     // Catch:{ SQLiteException -> 0x0269 }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x012e
            r9 = r0
            goto L_0x012f
        L_0x012e:
            r9 = r12
        L_0x012f:
            r8 = r8 | r9
            r5.D = r8     // Catch:{ SQLiteException -> 0x0269 }
            r5.y = r6     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 14
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.l4 r8 = r5.a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.i4 r8 = r8.d()     // Catch:{ SQLiteException -> 0x0269 }
            r8.h()     // Catch:{ SQLiteException -> 0x0269 }
            boolean r8 = r5.D     // Catch:{ SQLiteException -> 0x0269 }
            long r9 = r5.z     // Catch:{ SQLiteException -> 0x0269 }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x014d
            r9 = r0
            goto L_0x014e
        L_0x014d:
            r9 = r12
        L_0x014e:
            r8 = r8 | r9
            r5.D = r8     // Catch:{ SQLiteException -> 0x0269 }
            r5.z = r6     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 15
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.k(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 16
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.m(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 17
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0269 }
            if (r7 == 0) goto L_0x0171
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0176
        L_0x0171:
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x0269 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x0269 }
        L_0x0176:
            r5.S(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 18
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.K(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 19
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.l4 r8 = r5.a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.i4 r8 = r8.d()     // Catch:{ SQLiteException -> 0x0269 }
            r8.h()     // Catch:{ SQLiteException -> 0x0269 }
            boolean r8 = r5.D     // Catch:{ SQLiteException -> 0x0269 }
            long r9 = r5.A     // Catch:{ SQLiteException -> 0x0269 }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x019b
            r9 = r0
            goto L_0x019c
        L_0x019b:
            r9 = r12
        L_0x019c:
            r8 = r8 | r9
            r5.D = r8     // Catch:{ SQLiteException -> 0x0269 }
            r5.A = r6     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 20
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.l4 r8 = r5.a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.i4 r8 = r8.d()     // Catch:{ SQLiteException -> 0x0269 }
            r8.h()     // Catch:{ SQLiteException -> 0x0269 }
            boolean r8 = r5.D     // Catch:{ SQLiteException -> 0x0269 }
            long r9 = r5.B     // Catch:{ SQLiteException -> 0x0269 }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x01ba
            r9 = r0
            goto L_0x01bb
        L_0x01ba:
            r9 = r12
        L_0x01bb:
            r8 = r8 | r9
            r5.D = r8     // Catch:{ SQLiteException -> 0x0269 }
            r5.B = r6     // Catch:{ SQLiteException -> 0x0269 }
            r6 = 21
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0269 }
            r5.p(r6)     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.l4 r6 = r1.a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.f r6 = r6.f4114g     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.w2<java.lang.Boolean> r7 = b.l.a.c.i.b.x2.v0     // Catch:{ SQLiteException -> 0x0269 }
            boolean r6 = r6.r(r3, r7)     // Catch:{ SQLiteException -> 0x0269 }
            r7 = 0
            if (r6 != 0) goto L_0x01e8
            r6 = 22
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0269 }
            if (r9 == 0) goto L_0x01e1
            r9 = r7
            goto L_0x01e5
        L_0x01e1:
            long r9 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0269 }
        L_0x01e5:
            r5.r(r9)     // Catch:{ SQLiteException -> 0x0269 }
        L_0x01e8:
            r6 = 23
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0269 }
            if (r9 != 0) goto L_0x01f8
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x0269 }
            if (r6 == 0) goto L_0x01f7
            goto L_0x01f8
        L_0x01f7:
            r0 = r12
        L_0x01f8:
            r5.t(r0)     // Catch:{ SQLiteException -> 0x0269 }
            r0 = 24
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0269 }
            r5.E(r0)     // Catch:{ SQLiteException -> 0x0269 }
            r0 = 25
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x0269 }
            if (r6 == 0) goto L_0x020d
            goto L_0x0211
        L_0x020d:
            long r7 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0269 }
        L_0x0211:
            r5.e(r7)     // Catch:{ SQLiteException -> 0x0269 }
            r0 = 26
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x0269 }
            if (r6 != 0) goto L_0x022e
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0269 }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x0269 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x0269 }
            r5.x(r0)     // Catch:{ SQLiteException -> 0x0269 }
        L_0x022e:
            b.l.a.c.f.i.y9.b()     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.l4 r0 = r1.a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.f r0 = r0.f4114g     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.w2<java.lang.Boolean> r6 = b.l.a.c.i.b.x2.i0     // Catch:{ SQLiteException -> 0x0269 }
            boolean r0 = r0.r(r2, r6)     // Catch:{ SQLiteException -> 0x0269 }
            if (r0 == 0) goto L_0x0246
            r0 = 27
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0269 }
            r5.G(r0)     // Catch:{ SQLiteException -> 0x0269 }
        L_0x0246:
            b.l.a.c.i.b.l4 r0 = r5.a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.i4 r0 = r0.d()     // Catch:{ SQLiteException -> 0x0269 }
            r0.h()     // Catch:{ SQLiteException -> 0x0269 }
            r5.D = r12     // Catch:{ SQLiteException -> 0x0269 }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0269 }
            if (r0 == 0) goto L_0x026b
            b.l.a.c.i.b.l4 r0 = r1.a     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ SQLiteException -> 0x0269 }
            b.l.a.c.i.b.i3 r0 = r0.f     // Catch:{ SQLiteException -> 0x0269 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = b.l.a.c.i.b.k3.t(r34)     // Catch:{ SQLiteException -> 0x0269 }
            r0.b(r6, r7)     // Catch:{ SQLiteException -> 0x0269 }
            goto L_0x026b
        L_0x0269:
            r0 = move-exception
            goto L_0x0273
        L_0x026b:
            r4.close()
            return r5
        L_0x026f:
            r0 = move-exception
            goto L_0x028c
        L_0x0271:
            r0 = move-exception
            r4 = r3
        L_0x0273:
            b.l.a.c.i.b.l4 r5 = r1.a     // Catch:{ all -> 0x028a }
            b.l.a.c.i.b.k3 r5 = r5.a()     // Catch:{ all -> 0x028a }
            b.l.a.c.i.b.i3 r5 = r5.f     // Catch:{ all -> 0x028a }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = b.l.a.c.i.b.k3.t(r34)     // Catch:{ all -> 0x028a }
            r5.c(r6, r2, r0)     // Catch:{ all -> 0x028a }
            if (r4 == 0) goto L_0x0289
            r4.close()
        L_0x0289:
            return r3
        L_0x028a:
            r0 = move-exception
            r3 = r4
        L_0x028c:
            if (r3 == 0) goto L_0x0291
            r3.close()
        L_0x0291:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.j.L(java.lang.String):b.l.a.c.i.b.a5");
    }

    @WorkerThread
    public final void M(a5 a5Var) {
        h();
        i();
        String y = a5Var.y();
        Objects.requireNonNull(y, "null reference");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", y);
        contentValues.put("app_instance_id", a5Var.z());
        contentValues.put("gmp_app_id", a5Var.B());
        contentValues.put("resettable_device_id_hash", a5Var.H());
        contentValues.put("last_bundle_index", Long.valueOf(a5Var.i()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(a5Var.L()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(a5Var.N()));
        contentValues.put("app_version", a5Var.P());
        contentValues.put("app_store", a5Var.T());
        contentValues.put("gmp_version", Long.valueOf(a5Var.V()));
        contentValues.put("dev_cert_hash", Long.valueOf(a5Var.b()));
        contentValues.put("measurement_enabled", Boolean.valueOf(a5Var.f()));
        a5Var.a.d().h();
        contentValues.put("day", Long.valueOf(a5Var.w));
        a5Var.a.d().h();
        contentValues.put("daily_public_events_count", Long.valueOf(a5Var.x));
        a5Var.a.d().h();
        contentValues.put("daily_events_count", Long.valueOf(a5Var.y));
        a5Var.a.d().h();
        contentValues.put("daily_conversions_count", Long.valueOf(a5Var.z));
        a5Var.a.d().h();
        contentValues.put("config_fetched_time", Long.valueOf(a5Var.E));
        a5Var.a.d().h();
        contentValues.put("failed_config_fetch_time", Long.valueOf(a5Var.F));
        contentValues.put("app_version_int", Long.valueOf(a5Var.R()));
        contentValues.put("firebase_instance_id", a5Var.J());
        a5Var.a.d().h();
        contentValues.put("daily_error_events_count", Long.valueOf(a5Var.A));
        a5Var.a.d().h();
        contentValues.put("daily_realtime_events_count", Long.valueOf(a5Var.B));
        a5Var.a.d().h();
        contentValues.put("health_monitor_sample", a5Var.C);
        contentValues.put("android_id", Long.valueOf(a5Var.q()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(a5Var.s()));
        contentValues.put("admob_app_id", a5Var.D());
        contentValues.put("dynamite_version", Long.valueOf(a5Var.d()));
        List<String> w = a5Var.w();
        if (w != null) {
            if (w.size() == 0) {
                this.a.a().f4091i.b("Safelisted events should not be an empty list. appId", y);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", w));
            }
        }
        y9.b();
        if (this.a.f4114g.r(y, x2.i0)) {
            contentValues.put("ga_app_id", a5Var.F());
        }
        try {
            SQLiteDatabase y2 = y();
            if (((long) y2.update("apps", contentValues, "app_id = ?", new String[]{y})) == 0 && y2.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                this.a.a().f.b("Failed to insert/update app (got -1). appId", k3.t(y));
            }
        } catch (SQLiteException e2) {
            this.a.a().f.c("Error storing app. appId", k3.t(y), e2);
        }
    }

    @WorkerThread
    public final h N(long j2, String str, boolean z, boolean z2) {
        return O(j2, str, 1, false, false, z, false, z2);
    }

    @WorkerThread
    public final h O(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        a.x(str);
        h();
        i();
        String[] strArr = {str};
        h hVar = new h();
        Cursor cursor = null;
        try {
            SQLiteDatabase y = y();
            cursor = y.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                this.a.a().f4091i.b("Not updating daily counts, app is not known. appId", k3.t(str));
                cursor.close();
                return hVar;
            }
            if (cursor.getLong(0) == j2) {
                hVar.f4027b = cursor.getLong(1);
                hVar.a = cursor.getLong(2);
                hVar.c = cursor.getLong(3);
                hVar.d = cursor.getLong(4);
                hVar.f4028e = cursor.getLong(5);
            }
            if (z) {
                hVar.f4027b += j3;
            }
            if (z2) {
                hVar.a += j3;
            }
            if (z3) {
                hVar.c += j3;
            }
            if (z4) {
                hVar.d += j3;
            }
            if (z5) {
                hVar.f4028e += j3;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j2));
            contentValues.put("daily_public_events_count", Long.valueOf(hVar.a));
            contentValues.put("daily_events_count", Long.valueOf(hVar.f4027b));
            contentValues.put("daily_conversions_count", Long.valueOf(hVar.c));
            contentValues.put("daily_error_events_count", Long.valueOf(hVar.d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(hVar.f4028e));
            y.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return hVar;
        } catch (SQLiteException e2) {
            this.a.a().f.c("Error updating daily counts. appId", k3.t(str), e2);
            if (cursor != null) {
                cursor.close();
            }
            return hVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String P() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.y()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0022, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            goto L_0x003c
        L_0x0022:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0025:
            b.l.a.c.i.b.l4 r3 = r6.a     // Catch:{ all -> 0x0038 }
            b.l.a.c.i.b.k3 r3 = r3.a()     // Catch:{ all -> 0x0038 }
            b.l.a.c.i.b.i3 r3 = r3.f     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0037
            r0.close()
        L_0x0037:
            return r1
        L_0x0038:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.close()
        L_0x0041:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.j.P():java.lang.String");
    }

    @WorkerThread
    public final void Q() {
        h();
        i();
        if (q()) {
            long a = this.a.q().f4355h.a();
            Objects.requireNonNull((c) this.a.f4121n);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - a);
            f fVar = this.a.f4114g;
            if (abs > x2.y.a(null).longValue()) {
                this.a.q().f4355h.b(elapsedRealtime);
                h();
                i();
                if (q()) {
                    SQLiteDatabase y = y();
                    Objects.requireNonNull((c) this.a.f4121n);
                    f fVar2 = this.a.f4114g;
                    int delete = y.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(f.i())});
                    if (delete > 0) {
                        this.a.a().f4096n.b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    @WorkerThread
    public final void R(List<Long> list) {
        h();
        i();
        Objects.requireNonNull(list, "null reference");
        if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        } else if (q()) {
            String join = TextUtils.join(",", list);
            String r = b.e.a.a.a.r(new StringBuilder(String.valueOf(join).length() + 2), "(", join, ")");
            if (t(b.e.a.a.a.r(new StringBuilder(String.valueOf(r).length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", r, " AND retry_count =  2147483647 LIMIT 1"), (String[]) null) > 0) {
                this.a.a().f4091i.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase y = y();
                StringBuilder sb = new StringBuilder(String.valueOf(r).length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(r);
                sb.append(" AND (retry_count IS NULL OR retry_count < ");
                sb.append(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                sb.append(")");
                y.execSQL(sb.toString());
            } catch (SQLiteException e2) {
                this.a.a().f.b("Error incrementing retry count. error", e2);
            }
        }
    }

    public final boolean k() {
        return false;
    }

    @WorkerThread
    public final Object l(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            this.a.a().f.a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i2));
            }
            if (type == 3) {
                return cursor.getString(i2);
            }
            if (type != 4) {
                this.a.a().f.b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            this.a.a().f.a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    @WorkerThread
    public final long m(String str, String str2) {
        long j2;
        SQLiteException e2;
        a.x(str);
        a.x("first_open_count");
        h();
        i();
        SQLiteDatabase y = y();
        y.beginTransaction();
        try {
            j2 = u("select first_open_count from app2 where app_id=?", new String[]{str}, -1);
            if (j2 == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (y.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    this.a.a().f.c("Failed to insert column (got -1). appId", k3.t(str), "first_open_count");
                    y.endTransaction();
                    return -1;
                }
                j2 = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + j2));
                if (((long) y.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    this.a.a().f.c("Failed to update column (got 0). appId", k3.t(str), "first_open_count");
                    y.endTransaction();
                    return -1;
                }
                y.setTransactionSuccessful();
                y.endTransaction();
                return j2;
            } catch (SQLiteException e3) {
                e2 = e3;
            }
        } catch (SQLiteException e4) {
            j2 = 0;
            e2 = e4;
            try {
                this.a.a().f.d("Error inserting column. appId", k3.t(str), "first_open_count", e2);
                y.endTransaction();
                return j2;
            } catch (Throwable th) {
                y.endTransaction();
                throw th;
            }
        }
    }

    public final long n(String str) {
        a.x(str);
        return u("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    public final boolean o(String str, Long l2, long j2, o1 o1Var) {
        h();
        i();
        Objects.requireNonNull(o1Var, "null reference");
        a.x(str);
        byte[] e2 = o1Var.e();
        this.a.a().f4096n.c("Saving complex main event, appId, data size", this.a.u().p(str), Integer.valueOf(e2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", e2);
        try {
            if (y().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            this.a.a().f.b("Failed to insert complex main event (got -1). appId", k3.t(str));
            return false;
        } catch (SQLiteException e3) {
            this.a.a().f.c("Error storing complex main event. appId", k3.t(str), e3);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle p(java.lang.String r8) {
        /*
            r7 = this;
            r7.h()
            r7.i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.y()     // Catch:{ SQLiteException -> 0x00bb, all -> 0x00b9 }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00bb, all -> 0x00b9 }
            r3 = 0
            r2[r3] = r8     // Catch:{ SQLiteException -> 0x00bb, all -> 0x00b9 }
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch:{ SQLiteException -> 0x00bb, all -> 0x00b9 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x002e }
            if (r2 != 0) goto L_0x0031
            b.l.a.c.i.b.l4 r8 = r7.a     // Catch:{ SQLiteException -> 0x002e }
            b.l.a.c.i.b.k3 r8 = r8.a()     // Catch:{ SQLiteException -> 0x002e }
            b.l.a.c.i.b.i3 r8 = r8.f4096n     // Catch:{ SQLiteException -> 0x002e }
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch:{ SQLiteException -> 0x002e }
            r1.close()
            return r0
        L_0x002e:
            r8 = move-exception
            goto L_0x00bd
        L_0x0031:
            byte[] r2 = r1.getBlob(r3)     // Catch:{ SQLiteException -> 0x002e }
            b.l.a.c.f.i.n1 r3 = b.l.a.c.f.i.o1.C()     // Catch:{ IOException -> 0x00a3 }
            b.l.a.c.f.i.f4 r2 = b.l.a.c.i.b.f9.G(r3, r2)     // Catch:{ IOException -> 0x00a3 }
            b.l.a.c.f.i.n1 r2 = (b.l.a.c.f.i.n1) r2     // Catch:{ IOException -> 0x00a3 }
            b.l.a.c.f.i.p5 r2 = r2.g()     // Catch:{ IOException -> 0x00a3 }
            b.l.a.c.f.i.o1 r2 = (b.l.a.c.f.i.o1) r2     // Catch:{ IOException -> 0x00a3 }
            b.l.a.c.i.b.d9 r8 = r7.f4305b     // Catch:{ SQLiteException -> 0x002e }
            r8.P()     // Catch:{ SQLiteException -> 0x002e }
            java.util.List r8 = r2.s()     // Catch:{ SQLiteException -> 0x002e }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x002e }
            r2.<init>()     // Catch:{ SQLiteException -> 0x002e }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x002e }
        L_0x0057:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x002e }
            if (r3 == 0) goto L_0x009f
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x002e }
            b.l.a.c.f.i.s1 r3 = (b.l.a.c.f.i.s1) r3     // Catch:{ SQLiteException -> 0x002e }
            java.lang.String r4 = r3.t()     // Catch:{ SQLiteException -> 0x002e }
            boolean r5 = r3.A()     // Catch:{ SQLiteException -> 0x002e }
            if (r5 == 0) goto L_0x0075
            double r5 = r3.B()     // Catch:{ SQLiteException -> 0x002e }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x002e }
            goto L_0x0057
        L_0x0075:
            boolean r5 = r3.y()     // Catch:{ SQLiteException -> 0x002e }
            if (r5 == 0) goto L_0x0083
            float r3 = r3.z()     // Catch:{ SQLiteException -> 0x002e }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x002e }
            goto L_0x0057
        L_0x0083:
            boolean r5 = r3.u()     // Catch:{ SQLiteException -> 0x002e }
            if (r5 == 0) goto L_0x0091
            java.lang.String r3 = r3.v()     // Catch:{ SQLiteException -> 0x002e }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x002e }
            goto L_0x0057
        L_0x0091:
            boolean r5 = r3.w()     // Catch:{ SQLiteException -> 0x002e }
            if (r5 == 0) goto L_0x0057
            long r5 = r3.x()     // Catch:{ SQLiteException -> 0x002e }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x002e }
            goto L_0x0057
        L_0x009f:
            r1.close()
            return r2
        L_0x00a3:
            r2 = move-exception
            b.l.a.c.i.b.l4 r3 = r7.a     // Catch:{ SQLiteException -> 0x002e }
            b.l.a.c.i.b.k3 r3 = r3.a()     // Catch:{ SQLiteException -> 0x002e }
            b.l.a.c.i.b.i3 r3 = r3.f     // Catch:{ SQLiteException -> 0x002e }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = b.l.a.c.i.b.k3.t(r8)     // Catch:{ SQLiteException -> 0x002e }
            r3.c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x002e }
            r1.close()
            return r0
        L_0x00b9:
            r8 = move-exception
            goto L_0x00d2
        L_0x00bb:
            r8 = move-exception
            r1 = r0
        L_0x00bd:
            b.l.a.c.i.b.l4 r2 = r7.a     // Catch:{ all -> 0x00d0 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x00d0 }
            b.l.a.c.i.b.i3 r2 = r2.f     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x00cf
            r1.close()
        L_0x00cf:
            return r0
        L_0x00d0:
            r8 = move-exception
            r0 = r1
        L_0x00d2:
            if (r0 == 0) goto L_0x00d7
            r0.close()
        L_0x00d7:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.j.p(java.lang.String):android.os.Bundle");
    }

    public final boolean q() {
        l4 l4Var = this.a;
        Context context = l4Var.a;
        f fVar = l4Var.f4114g;
        return context.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v0, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f0, code lost:
        r0 = th;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f9, code lost:
        r4 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01f0 A[ExcHandler: all (th java.lang.Throwable), PHI: r3 
      PHI: (r3v5 java.lang.String) = (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v15 java.lang.String), (r3v17 java.lang.String), (r3v19 java.lang.String), (r3v21 java.lang.String), (r3v23 java.lang.String), (r3v25 java.lang.String), (r3v27 java.lang.String), (r3v29 java.lang.String), (r3v31 java.lang.String) binds: [B:1:0x000b, B:28:0x0085, B:23:0x0072, B:12:0x003b, B:7:0x0020, B:39:0x00bd, B:45:0x00f5, B:84:0x01db, B:85:?, B:49:0x0109, B:78:0x01c3, B:79:?, B:72:0x01a8, B:62:0x017a] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x020d  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0085=Splitter:B:28:0x0085, B:12:0x003b=Splitter:B:12:0x003b} */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(java.lang.String r21, long r22, long r24, b.l.a.c.i.b.c9 r26) {
        /*
            r20 = this;
            r1 = r20
            r2 = r26
            r20.h()
            r20.i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r20.y()     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r5 = ""
            r13 = -1
            r15 = 0
            r12 = 1
            r11 = 2
            if (r4 == 0) goto L_0x006e
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x002f
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            r6[r15] = r7     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            goto L_0x0037
        L_0x002f:
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            r6[r15] = r7     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
        L_0x0037:
            if (r4 == 0) goto L_0x003b
            java.lang.String r5 = "rowid <= ? and "
        L_0x003b:
            int r4 = r5.length()     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            int r4 = r4 + 148
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            r7.<init>(r4)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r4 = "select app_id, metadata_fingerprint from raw_events where "
            r7.append(r4)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            r7.append(r5)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r4 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r7.append(r4)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r4 = r7.toString()     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01f6 }
            if (r5 != 0) goto L_0x0065
            r4.close()
            return
        L_0x0065:
            java.lang.String r3 = r4.getString(r15)     // Catch:{ SQLiteException -> 0x01f6 }
            java.lang.String r5 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x01f6 }
            goto L_0x00b3
        L_0x006e:
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x007d
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            r6[r15] = r3     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            goto L_0x0081
        L_0x007d:
            java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
        L_0x0081:
            if (r4 == 0) goto L_0x0085
            java.lang.String r5 = " and rowid <= ?"
        L_0x0085:
            int r4 = r5.length()     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            int r4 = r4 + 84
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            r7.<init>(r4)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r4 = "select metadata_fingerprint from raw_events where app_id = ?"
            r7.append(r4)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            r7.append(r5)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r4 = " order by rowid limit 1;"
            r7.append(r4)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            java.lang.String r4 = r7.toString()     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01f0 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01f6 }
            if (r5 != 0) goto L_0x00af
            r4.close()
            return
        L_0x00af:
            java.lang.String r5 = r4.getString(r15)     // Catch:{ SQLiteException -> 0x01f6 }
        L_0x00b3:
            r4.close()     // Catch:{ SQLiteException -> 0x01f6 }
            r16 = r3
            r3 = r4
            r17 = r5
            java.lang.String r4 = "metadata"
            java.lang.String[] r6 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r8[r15] = r16     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r8[r12] = r17     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            java.lang.String r5 = "raw_events_metadata"
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            r9 = 0
            r10 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r4 = r0
            r11 = r18
            r12 = r19
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            if (r4 != 0) goto L_0x00f5
            b.l.a.c.i.b.l4 r0 = r1.a     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.i.b.i3 r0 = r0.f     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r16)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r0.b(r2, r4)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r3.close()
            return
        L_0x00f5:
            byte[] r4 = r3.getBlob(r15)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.f.i.v1 r5 = b.l.a.c.f.i.w1.C0()     // Catch:{ IOException -> 0x01da }
            b.l.a.c.f.i.f4 r4 = b.l.a.c.i.b.f9.G(r5, r4)     // Catch:{ IOException -> 0x01da }
            b.l.a.c.f.i.v1 r4 = (b.l.a.c.f.i.v1) r4     // Catch:{ IOException -> 0x01da }
            b.l.a.c.f.i.p5 r4 = r4.g()     // Catch:{ IOException -> 0x01da }
            b.l.a.c.f.i.w1 r4 = (b.l.a.c.f.i.w1) r4     // Catch:{ IOException -> 0x01da }
            boolean r5 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            if (r5 == 0) goto L_0x0120
            b.l.a.c.i.b.l4 r5 = r1.a     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.i.b.k3 r5 = r5.a()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.i.b.i3 r5 = r5.f4091i     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            java.lang.String r6 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r7 = b.l.a.c.i.b.k3.t(r16)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r5.b(r6, r7)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
        L_0x0120:
            r3.close()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r2.a = r4     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            r13 = 3
            if (r4 == 0) goto L_0x013b
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r5[r15] = r16     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r14 = 1
            r5[r14] = r17     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r12 = 2
            r5[r12] = r6     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            goto L_0x0145
        L_0x013b:
            r12 = 2
            r14 = 1
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r5[r15] = r16     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r5[r14] = r17     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
        L_0x0145:
            r7 = r4
            r8 = r5
            java.lang.String r4 = "rowid"
            java.lang.String r5 = "name"
            java.lang.String r6 = "timestamp"
            java.lang.String r9 = "data"
            java.lang.String[] r6 = new java.lang.String[]{r4, r5, r6, r9}     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            java.lang.String r5 = "raw_events"
            r9 = 0
            r10 = 0
            java.lang.String r11 = "rowid"
            r17 = 0
            r4 = r0
            r12 = r17
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            if (r0 == 0) goto L_0x01c3
        L_0x0168:
            long r4 = r3.getLong(r15)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            byte[] r0 = r3.getBlob(r13)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.f.i.n1 r6 = b.l.a.c.f.i.o1.C()     // Catch:{ IOException -> 0x01a6 }
            b.l.a.c.f.i.f4 r0 = b.l.a.c.i.b.f9.G(r6, r0)     // Catch:{ IOException -> 0x01a6 }
            b.l.a.c.f.i.n1 r0 = (b.l.a.c.f.i.n1) r0     // Catch:{ IOException -> 0x01a6 }
            java.lang.String r6 = r3.getString(r14)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r0.t(r6)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r6 = 2
            long r7 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            boolean r9 = r0.f3655j     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            if (r9 == 0) goto L_0x018f
            r0.j()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r0.f3655j = r15     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
        L_0x018f:
            MessageType r9 = r0.f3654i     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.f.i.o1 r9 = (b.l.a.c.f.i.o1) r9     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.f.i.o1.K(r9, r7)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.f.i.p5 r0 = r0.g()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.f.i.o1 r0 = (b.l.a.c.f.i.o1) r0     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            boolean r0 = r2.a(r4, r0)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            if (r0 != 0) goto L_0x01b9
            r3.close()
            return
        L_0x01a6:
            r0 = move-exception
            r6 = 2
            b.l.a.c.i.b.l4 r4 = r1.a     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.i.b.k3 r4 = r4.a()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.i.b.i3 r4 = r4.f     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            java.lang.String r5 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r7 = b.l.a.c.i.b.k3.t(r16)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r4.c(r5, r7, r0)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
        L_0x01b9:
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            if (r0 != 0) goto L_0x0168
            r3.close()
            return
        L_0x01c3:
            b.l.a.c.i.b.l4 r0 = r1.a     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.i.b.i3 r0 = r0.f4091i     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r16)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r0.b(r2, r4)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r3.close()
            return
        L_0x01d8:
            r0 = move-exception
            goto L_0x01f2
        L_0x01da:
            r0 = move-exception
            b.l.a.c.i.b.l4 r2 = r1.a     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            b.l.a.c.i.b.i3 r2 = r2.f     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = b.l.a.c.i.b.k3.t(r16)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r2.c(r4, r5, r0)     // Catch:{ SQLiteException -> 0x01d8, all -> 0x01f0 }
            r3.close()
            return
        L_0x01f0:
            r0 = move-exception
            goto L_0x0213
        L_0x01f2:
            r4 = r3
            r3 = r16
            goto L_0x01fa
        L_0x01f6:
            r0 = move-exception
            goto L_0x01fa
        L_0x01f8:
            r0 = move-exception
            r4 = r3
        L_0x01fa:
            b.l.a.c.i.b.l4 r2 = r1.a     // Catch:{ all -> 0x0211 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x0211 }
            b.l.a.c.i.b.i3 r2 = r2.f     // Catch:{ all -> 0x0211 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r3 = b.l.a.c.i.b.k3.t(r3)     // Catch:{ all -> 0x0211 }
            r2.c(r5, r3, r0)     // Catch:{ all -> 0x0211 }
            if (r4 == 0) goto L_0x0210
            r4.close()
        L_0x0210:
            return
        L_0x0211:
            r0 = move-exception
            r3 = r4
        L_0x0213:
            if (r3 == 0) goto L_0x0218
            r3.close()
        L_0x0218:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.j.r(java.lang.String, long, long, b.l.a.c.i.b.c9):void");
    }

    @WorkerThread
    public final long t(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = y().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j2 = cursor.getLong(0);
                cursor.close();
                return j2;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e2) {
            this.a.a().f.c("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final long u(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = y().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j3 = rawQuery.getLong(0);
                rawQuery.close();
                return j3;
            }
            rawQuery.close();
            return j2;
        } catch (SQLiteException e2) {
            this.a.a().f.c("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final void v() {
        i();
        y().beginTransaction();
    }

    @WorkerThread
    public final void w() {
        i();
        y().setTransactionSuccessful();
    }

    @WorkerThread
    public final void x() {
        i();
        y().endTransaction();
    }

    @WorkerThread
    public final SQLiteDatabase y() {
        h();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e2) {
            this.a.a().f4091i.b("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014c  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.a.c.i.b.o z(java.lang.String r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r15 = r29
            b.l.a.c.b.a.x(r28)
            b.l.a.c.b.a.x(r29)
            r27.h()
            r27.i()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.y()     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            r6[r10] = r28     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            r11 = 1
            r6[r11] = r15     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            java.lang.String r3 = "events"
            java.lang.String r5 = "app_id=? and name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            boolean r2 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r2 != 0) goto L_0x005c
            r13.close()
            return r19
        L_0x005c:
            long r5 = r13.getLong(r10)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            long r7 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            long r16 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r0 = 3
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r3 = 0
            if (r2 == 0) goto L_0x0074
            r20 = r3
            goto L_0x0078
        L_0x0074:
            long r20 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
        L_0x0078:
            r0 = 4
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r2 == 0) goto L_0x0082
            r0 = r19
            goto L_0x008a
        L_0x0082:
            long r22 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
        L_0x008a:
            r2 = 5
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r9 == 0) goto L_0x0094
            r18 = r19
            goto L_0x009e
        L_0x0094:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r18 = r2
        L_0x009e:
            r2 = 6
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r9 == 0) goto L_0x00a8
            r22 = r19
            goto L_0x00b2
        L_0x00a8:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r22 = r2
        L_0x00b2:
            r2 = 7
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r9 != 0) goto L_0x00cb
            long r23 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r25 = 1
            int r2 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x00c4
            r10 = r11
        L_0x00c4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r23 = r2
            goto L_0x00cd
        L_0x00cb:
            r23 = r19
        L_0x00cd:
            r2 = 8
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r9 == 0) goto L_0x00d7
            r9 = r3
            goto L_0x00dc
        L_0x00d7:
            long r2 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r9 = r2
        L_0x00dc:
            b.l.a.c.i.b.o r24 = new b.l.a.c.i.b.o     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r2 = r24
            r3 = r28
            r4 = r29
            r11 = r16
            r25 = r13
            r13 = r20
            r15 = r0
            r16 = r18
            r17 = r22
            r18 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            boolean r0 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            if (r0 == 0) goto L_0x010b
            b.l.a.c.i.b.l4 r0 = r1.a     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            b.l.a.c.i.b.i3 r0 = r0.f     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = b.l.a.c.i.b.k3.t(r28)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            r0.b(r2, r3)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
        L_0x010b:
            r25.close()
            return r24
        L_0x010f:
            r0 = move-exception
            goto L_0x0116
        L_0x0111:
            r0 = move-exception
            goto L_0x011c
        L_0x0113:
            r0 = move-exception
            r25 = r13
        L_0x0116:
            r19 = r25
            goto L_0x014a
        L_0x0119:
            r0 = move-exception
            r25 = r13
        L_0x011c:
            r13 = r25
            goto L_0x0124
        L_0x011f:
            r0 = move-exception
            goto L_0x014a
        L_0x0121:
            r0 = move-exception
            r13 = r19
        L_0x0124:
            b.l.a.c.i.b.l4 r2 = r1.a     // Catch:{ all -> 0x0147 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x0147 }
            b.l.a.c.i.b.i3 r2 = r2.f     // Catch:{ all -> 0x0147 }
            java.lang.String r3 = "Error querying events. appId"
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r28)     // Catch:{ all -> 0x0147 }
            b.l.a.c.i.b.l4 r5 = r1.a     // Catch:{ all -> 0x0147 }
            b.l.a.c.i.b.f3 r5 = r5.u()     // Catch:{ all -> 0x0147 }
            r6 = r29
            java.lang.String r5 = r5.p(r6)     // Catch:{ all -> 0x0147 }
            r2.d(r3, r4, r5, r0)     // Catch:{ all -> 0x0147 }
            if (r13 == 0) goto L_0x0146
            r13.close()
        L_0x0146:
            return r19
        L_0x0147:
            r0 = move-exception
            r19 = r13
        L_0x014a:
            if (r19 == 0) goto L_0x014f
            r19.close()
        L_0x014f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.j.z(java.lang.String, java.lang.String):b.l.a.c.i.b.o");
    }
}
