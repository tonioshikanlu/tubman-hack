package b.l.a.a.f.q.i;

import android.database.sqlite.SQLiteDatabase;
import b.l.a.a.f.q.i.z;
import java.util.List;

public final /* synthetic */ class x implements z.a {
    public static final x a = new x();

    public void a(SQLiteDatabase sQLiteDatabase) {
        List<z.a> list = z.f2557j;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
