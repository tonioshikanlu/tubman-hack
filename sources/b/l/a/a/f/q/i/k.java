package b.l.a.a.f.q.i;

import android.database.Cursor;
import b.l.a.a.a;
import b.l.a.a.f.a;
import b.l.a.a.f.d;
import b.l.a.a.f.h;
import b.l.a.a.f.q.i.t;
import java.util.HashMap;
import java.util.List;

public final /* synthetic */ class k implements t.b {
    public final t a;

    /* renamed from: b  reason: collision with root package name */
    public final List f2548b;
    public final h c;

    public k(t tVar, List list, h hVar) {
        this.a = tVar;
        this.f2548b = list;
        this.c = hVar;
    }

    public Object apply(Object obj) {
        a aVar;
        a aVar2;
        t tVar = this.a;
        List list = this.f2548b;
        h hVar = this.c;
        Cursor cursor = (Cursor) obj;
        a aVar3 = t.f2550l;
        while (cursor.moveToNext()) {
            long j2 = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            a.b bVar = new a.b();
            bVar.f = new HashMap();
            bVar.f(cursor.getString(1));
            bVar.e(cursor.getLong(2));
            bVar.g(cursor.getLong(3));
            if (z) {
                String string = cursor.getString(4);
                if (string == null) {
                    aVar2 = t.f2550l;
                } else {
                    aVar2 = new b.l.a.a.a(string);
                }
                bVar.d(new d(aVar2, cursor.getBlob(5)));
            } else {
                String string2 = cursor.getString(4);
                if (string2 == null) {
                    aVar = t.f2550l;
                } else {
                    aVar = new b.l.a.a.a(string2);
                }
                bVar.d(new d(aVar, (byte[]) t.O(tVar.e().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, (String) null, (String) null, "sequence_num"), l.a)));
            }
            if (!cursor.isNull(6)) {
                bVar.f2468b = Integer.valueOf(cursor.getInt(6));
            }
            list.add(new b(j2, hVar, bVar.b()));
        }
        return null;
    }
}
