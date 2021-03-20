package b.l.a.a.f.q.i;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import b.l.a.a.a;
import b.l.a.a.f.e;
import b.l.a.a.f.h;
import b.l.a.a.f.q.i.t;
import com.amplitude.api.DatabaseHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;

public final /* synthetic */ class j implements t.b {
    public final t a;

    /* renamed from: b  reason: collision with root package name */
    public final h f2547b;

    public j(t tVar, h hVar) {
        this.a = tVar;
        this.f2547b = hVar;
    }

    /* JADX INFO: finally extract failed */
    public Object apply(Object obj) {
        t tVar = this.a;
        h hVar = this.f2547b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        a aVar = t.f2550l;
        Objects.requireNonNull(tVar);
        ArrayList arrayList = new ArrayList();
        Long q2 = tVar.q(sQLiteDatabase, hVar);
        if (q2 != null) {
            t.O(sQLiteDatabase.query(DatabaseHelper.EVENT_TABLE_NAME, new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{q2.toString()}, (String) null, (String) null, (String) null, String.valueOf(tVar.f2554k.c())), new k(tVar, arrayList, hVar));
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sb.append(((h) arrayList.get(i2)).b());
            if (i2 < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                long j2 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j2));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j2), set);
                }
                set.add(new t.c(query.getString(1), query.getString(2), (t.a) null));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            h hVar2 = (h) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(hVar2.b()))) {
                e.a i3 = hVar2.a().i();
                for (t.c cVar : (Set) hashMap.get(Long.valueOf(hVar2.b()))) {
                    i3.a(cVar.a, cVar.f2555b);
                }
                listIterator.set(new b(hVar2.b(), hVar2.c(), i3.b()));
            }
        }
        return arrayList;
    }
}
