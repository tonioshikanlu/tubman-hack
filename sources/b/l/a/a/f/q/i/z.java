package b.l.a.a.f.q.i;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

public final class z extends SQLiteOpenHelper {

    /* renamed from: j  reason: collision with root package name */
    public static final List<a> f2557j = Arrays.asList(new a[]{v.a, w.a, x.a, y.a});

    /* renamed from: h  reason: collision with root package name */
    public final int f2558h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2559i = false;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    public z(Context context, String str, int i2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i2);
        this.f2558h = i2;
    }

    public final void b(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        List<a> list = f2557j;
        if (i3 <= list.size()) {
            while (i2 < i3) {
                f2557j.get(i2).a(sQLiteDatabase);
                i2++;
            }
            return;
        }
        StringBuilder A = b.e.a.a.a.A("Migration from ", i2, " to ", i3, " was requested, but cannot be performed. Only ");
        A.append(list.size());
        A.append(" migrations are provided");
        throw new IllegalArgumentException(A.toString());
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f2559i = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i2 = this.f2558h;
        if (!this.f2559i) {
            onConfigure(sQLiteDatabase);
        }
        b(sQLiteDatabase, 0, i2);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        if (!this.f2559i) {
            onConfigure(sQLiteDatabase);
        }
        b(sQLiteDatabase, 0, i3);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f2559i) {
            onConfigure(sQLiteDatabase);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (!this.f2559i) {
            onConfigure(sQLiteDatabase);
        }
        b(sQLiteDatabase, i2, i3);
    }
}
