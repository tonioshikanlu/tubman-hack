package b.l.a.a.f.q.i;

import android.database.sqlite.SQLiteDatabase;
import b.l.a.a.f.q.i.z;
import java.util.List;

public final /* synthetic */ class y implements z.a {
    public static final y a = new y();

    public void a(SQLiteDatabase sQLiteDatabase) {
        List<z.a> list = z.f2557j;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }
}
