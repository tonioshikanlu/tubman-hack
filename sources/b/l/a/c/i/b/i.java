package b.l.a.c.i.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.WorkerThread;
import b.l.a.c.b.a;
import com.amplitude.api.DatabaseHelper;

public final class i extends SQLiteOpenHelper {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ j f4047h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(j jVar, Context context) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f4047h = jVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002b A[SYNTHETIC, Splitter:B:7:0x002b] */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        /*
            r6 = this;
            b.l.a.c.i.b.j r0 = r6.f4047h
            b.l.a.c.i.b.r8 r1 = r0.f4074e
            b.l.a.c.i.b.l4 r0 = r0.a
            b.l.a.c.i.b.f r0 = r0.f4114g
            long r2 = r1.f4247b
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0011
            goto L_0x0026
        L_0x0011:
            b.l.a.c.c.p.b r0 = r1.a
            b.l.a.c.c.p.c r0 = (b.l.a.c.c.p.c) r0
            java.util.Objects.requireNonNull(r0)
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r1.f4247b
            long r2 = r2 - r0
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0028
        L_0x0026:
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 == 0) goto L_0x0093
            android.database.sqlite.SQLiteDatabase r0 = super.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0030 }
            return r0
        L_0x0030:
            b.l.a.c.i.b.j r0 = r6.f4047h
            b.l.a.c.i.b.r8 r0 = r0.f4074e
            b.l.a.c.c.p.b r1 = r0.a
            b.l.a.c.c.p.c r1 = (b.l.a.c.c.p.c) r1
            java.util.Objects.requireNonNull(r1)
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.f4247b = r1
            b.l.a.c.i.b.j r0 = r6.f4047h
            b.l.a.c.i.b.l4 r0 = r0.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f
            java.lang.String r1 = "Opening the database failed, dropping and recreating it"
            r0.a(r1)
            b.l.a.c.i.b.j r0 = r6.f4047h
            b.l.a.c.i.b.l4 r0 = r0.a
            b.l.a.c.i.b.f r0 = r0.f4114g
            java.lang.String r0 = "google_app_measurement.db"
            b.l.a.c.i.b.j r1 = r6.f4047h
            b.l.a.c.i.b.l4 r1 = r1.a
            android.content.Context r1 = r1.a
            java.io.File r1 = r1.getDatabasePath(r0)
            boolean r1 = r1.delete()
            if (r1 != 0) goto L_0x0077
            b.l.a.c.i.b.j r1 = r6.f4047h
            b.l.a.c.i.b.l4 r1 = r1.a
            b.l.a.c.i.b.k3 r1 = r1.a()
            b.l.a.c.i.b.i3 r1 = r1.f
            java.lang.String r2 = "Failed to delete corrupted db file"
            r1.b(r2, r0)
        L_0x0077:
            android.database.sqlite.SQLiteDatabase r0 = super.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0082 }
            b.l.a.c.i.b.j r1 = r6.f4047h     // Catch:{ SQLiteException -> 0x0082 }
            b.l.a.c.i.b.r8 r1 = r1.f4074e     // Catch:{ SQLiteException -> 0x0082 }
            r1.f4247b = r4     // Catch:{ SQLiteException -> 0x0082 }
            return r0
        L_0x0082:
            r0 = move-exception
            b.l.a.c.i.b.j r1 = r6.f4047h
            b.l.a.c.i.b.l4 r1 = r1.a
            b.l.a.c.i.b.k3 r1 = r1.a()
            b.l.a.c.i.b.i3 r1 = r1.f
            java.lang.String r2 = "Failed to open freshly created database"
            r1.b(r2, r0)
            throw r0
        L_0x0093:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            java.lang.String r1 = "Database open failed"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.i.getWritableDatabase():android.database.sqlite.SQLiteDatabase");
    }

    @WorkerThread
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        a.J1(this.f4047h.a.a(), sQLiteDatabase);
    }

    @WorkerThread
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    @WorkerThread
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        a.j1(this.f4047h.a.a(), sQLiteDatabase2, DatabaseHelper.EVENT_TABLE_NAME, "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", j.f);
        a.j1(this.f4047h.a.a(), sQLiteDatabase2, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", (String[]) null);
        a.j1(this.f4047h.a.a(), sQLiteDatabase2, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", j.f4067g);
        a.j1(this.f4047h.a.a(), sQLiteDatabase2, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", j.f4068h);
        a.j1(this.f4047h.a.a(), sQLiteDatabase2, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", j.f4070j);
        a.j1(this.f4047h.a.a(), sQLiteDatabase2, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", (String[]) null);
        a.j1(this.f4047h.a.a(), sQLiteDatabase2, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", j.f4069i);
        a.j1(this.f4047h.a.a(), sQLiteDatabase2, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", j.f4071k);
        a.j1(this.f4047h.a.a(), sQLiteDatabase2, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", j.f4072l);
        a.j1(this.f4047h.a.a(), sQLiteDatabase2, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", (String[]) null);
        a.j1(this.f4047h.a.a(), sQLiteDatabase2, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", j.f4073m);
        a.j1(this.f4047h.a.a(), sQLiteDatabase2, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", (String[]) null);
        a.j1(this.f4047h.a.a(), sQLiteDatabase2, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", (String[]) null);
        a.j1(this.f4047h.a.a(), sQLiteDatabase2, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", (String[]) null);
    }

    @WorkerThread
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}
