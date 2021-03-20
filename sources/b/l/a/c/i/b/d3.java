package b.l.a.c.i.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.WorkerThread;
import b.l.a.c.b.a;

public final class d3 extends SQLiteOpenHelper {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e3 f3958h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d3(e3 e3Var, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f3958h = e3Var;
    }

    @WorkerThread
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e2) {
            throw e2;
        } catch (SQLiteException unused) {
            this.f3958h.a.a().f.a("Opening the local database failed, dropping and recreating it");
            f fVar = this.f3958h.a.f4114g;
            if (!this.f3958h.a.a.getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f3958h.a.a().f.b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e3) {
                this.f3958h.a.a().f.b("Failed to open local database. Events will bypass local storage", e3);
                return null;
            }
        }
    }

    @WorkerThread
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        a.J1(this.f3958h.a.a(), sQLiteDatabase);
    }

    @WorkerThread
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    @WorkerThread
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        a.j1(this.f3958h.a.a(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    @WorkerThread
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}
