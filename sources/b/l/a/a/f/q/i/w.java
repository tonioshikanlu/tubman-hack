package b.l.a.a.f.q.i;

import android.database.sqlite.SQLiteDatabase;
import b.l.a.a.f.q.i.z;
import java.util.List;

public final /* synthetic */ class w implements z.a {
    public static final w a = new w();

    public void a(SQLiteDatabase sQLiteDatabase) {
        List<z.a> list = z.f2557j;
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }
}
