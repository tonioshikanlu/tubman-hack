package b.l.a.a.f.q.i;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import b.a.a.n.f;
import b.l.a.a.f.e;
import b.l.a.a.f.h;
import b.l.a.a.f.r.b;
import com.amplitude.api.DatabaseHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@WorkerThread
public class t implements c, b.l.a.a.f.r.b {

    /* renamed from: l  reason: collision with root package name */
    public static final b.l.a.a.a f2550l = new b.l.a.a.a("proto");

    /* renamed from: h  reason: collision with root package name */
    public final z f2551h;

    /* renamed from: i  reason: collision with root package name */
    public final b.l.a.a.f.s.a f2552i;

    /* renamed from: j  reason: collision with root package name */
    public final b.l.a.a.f.s.a f2553j;

    /* renamed from: k  reason: collision with root package name */
    public final d f2554k;

    public interface b<T, U> {
        U apply(T t);
    }

    public static class c {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2555b;

        public c(String str, String str2, a aVar) {
            this.a = str;
            this.f2555b = str2;
        }
    }

    public interface d<T> {
        T a();
    }

    public t(b.l.a.a.f.s.a aVar, b.l.a.a.f.s.a aVar2, d dVar, z zVar) {
        this.f2551h = zVar;
        this.f2552i = aVar;
        this.f2553j = aVar2;
        this.f2554k = dVar;
    }

    public static String N(Iterable<h> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<h> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> T O(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public void B(h hVar, long j2) {
        z(new i(j2, hVar));
    }

    public final <T> T H(d<T> dVar, b<Throwable, T> bVar) {
        long a2 = this.f2553j.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f2553j.a() >= ((long) this.f2554k.a()) + a2) {
                    return bVar.apply(e2);
                }
                SystemClock.sleep(50);
            }
        }
    }

    @Nullable
    public h I(h hVar, e eVar) {
        f.d("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", hVar.d(), eVar.g(), hVar.b());
        long longValue = ((Long) z(new s(this, hVar, eVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new b(longValue, hVar, eVar);
    }

    public Iterable<h> J() {
        SQLiteDatabase e2 = e();
        e2.beginTransaction();
        try {
            List list = (List) O(e2.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), p.a);
            e2.setTransactionSuccessful();
            return list;
        } finally {
            e2.endTransaction();
        }
    }

    /* JADX INFO: finally extract failed */
    public long R(h hVar) {
        Cursor rawQuery = e().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{hVar.b(), String.valueOf(b.l.a.a.f.t.a.a(hVar.d()))});
        try {
            Long valueOf = Long.valueOf(rawQuery.moveToNext() ? rawQuery.getLong(0) : 0);
            rawQuery.close();
            return valueOf.longValue();
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean W(h hVar) {
        Boolean bool;
        SQLiteDatabase e2 = e();
        e2.beginTransaction();
        try {
            Long q2 = q(e2, hVar);
            if (q2 == null) {
                bool = Boolean.FALSE;
            } else {
                bool = (Boolean) O(e().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{q2.toString()}), q.a);
            }
            e2.setTransactionSuccessful();
            e2.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th) {
            e2.endTransaction();
            throw th;
        }
    }

    public void X(Iterable<h> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder y = b.e.a.a.a.y("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            y.append(N(iterable));
            String sb = y.toString();
            SQLiteDatabase e2 = e();
            e2.beginTransaction();
            try {
                e2.compileStatement(sb).execute();
                e2.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                e2.setTransactionSuccessful();
            } finally {
                e2.endTransaction();
            }
        }
    }

    public <T> T b(b.a<T> aVar) {
        SQLiteDatabase e2 = e();
        H(new m(e2), n.a);
        try {
            T a2 = aVar.a();
            e2.setTransactionSuccessful();
            return a2;
        } finally {
            e2.endTransaction();
        }
    }

    public void close() {
        this.f2551h.close();
    }

    @VisibleForTesting
    public SQLiteDatabase e() {
        z zVar = this.f2551h;
        zVar.getClass();
        return (SQLiteDatabase) H(new o(zVar), r.a);
    }

    /* JADX INFO: finally extract failed */
    public int i() {
        long a2 = this.f2552i.a() - this.f2554k.b();
        SQLiteDatabase e2 = e();
        e2.beginTransaction();
        try {
            Integer valueOf = Integer.valueOf(e2.delete(DatabaseHelper.EVENT_TABLE_NAME, "timestamp_ms < ?", new String[]{String.valueOf(a2)}));
            e2.setTransactionSuccessful();
            e2.endTransaction();
            return valueOf.intValue();
        } catch (Throwable th) {
            e2.endTransaction();
            throw th;
        }
    }

    public void l(Iterable<h> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder y = b.e.a.a.a.y("DELETE FROM events WHERE _id in ");
            y.append(N(iterable));
            e().compileStatement(y.toString()).execute();
        }
    }

    @Nullable
    public final Long q(SQLiteDatabase sQLiteDatabase, h hVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{hVar.b(), String.valueOf(b.l.a.a.f.t.a.a(hVar.d()))}));
        if (hVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(hVar.c(), 0));
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public Iterable<h> x(h hVar) {
        return (Iterable) z(new j(this, hVar));
    }

    public final <T> T z(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase e2 = e();
        e2.beginTransaction();
        try {
            T apply = bVar.apply(e2);
            e2.setTransactionSuccessful();
            return apply;
        } finally {
            e2.endTransaction();
        }
    }
}
