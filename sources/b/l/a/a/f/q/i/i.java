package b.l.a.a.f.q.i;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import b.l.a.a.a;
import b.l.a.a.f.h;
import b.l.a.a.f.q.i.t;

public final /* synthetic */ class i implements t.b {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final h f2546b;

    public i(long j2, h hVar) {
        this.a = j2;
        this.f2546b = hVar;
    }

    public Object apply(Object obj) {
        long j2 = this.a;
        h hVar = this.f2546b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        a aVar = t.f2550l;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j2));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{hVar.b(), String.valueOf(b.l.a.a.f.t.a.a(hVar.d()))}) < 1) {
            contentValues.put("backend_name", hVar.b());
            contentValues.put("priority", Integer.valueOf(b.l.a.a.f.t.a.a(hVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }
}
