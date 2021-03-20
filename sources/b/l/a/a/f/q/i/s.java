package b.l.a.a.f.q.i;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import b.l.a.a.a;
import b.l.a.a.f.e;
import b.l.a.a.f.h;
import b.l.a.a.f.q.i.t;
import com.amplitude.api.DatabaseHelper;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public final /* synthetic */ class s implements t.b {
    public final t a;

    /* renamed from: b  reason: collision with root package name */
    public final h f2549b;
    public final e c;

    public s(t tVar, h hVar, e eVar) {
        this.a = tVar;
        this.f2549b = hVar;
        this.c = eVar;
    }

    public Object apply(Object obj) {
        long j2;
        t tVar = this.a;
        h hVar = this.f2549b;
        e eVar = this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        a aVar = t.f2550l;
        if (tVar.e().compileStatement("PRAGMA page_size").simpleQueryForLong() * tVar.e().compileStatement("PRAGMA page_count").simpleQueryForLong() >= tVar.f2554k.e()) {
            return -1L;
        }
        Long q2 = tVar.q(sQLiteDatabase, hVar);
        if (q2 != null) {
            j2 = q2.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", hVar.b());
            contentValues.put("priority", Integer.valueOf(b.l.a.a.f.t.a.a(hVar.d())));
            contentValues.put("next_request_ms", 0);
            if (hVar.c() != null) {
                contentValues.put(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE, Base64.encodeToString(hVar.c(), 0));
            }
            j2 = sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        int d = tVar.f2554k.d();
        byte[] bArr = eVar.d().f2482b;
        boolean z = bArr.length <= d;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(j2));
        contentValues2.put("transport_name", eVar.g());
        contentValues2.put("timestamp_ms", Long.valueOf(eVar.e()));
        contentValues2.put("uptime_ms", Long.valueOf(eVar.h()));
        contentValues2.put("payload_encoding", eVar.d().a.a);
        contentValues2.put("code", eVar.c());
        contentValues2.put("num_attempts", 0);
        contentValues2.put("inline", Boolean.valueOf(z));
        contentValues2.put("payload", z ? bArr : new byte[0]);
        long insert = sQLiteDatabase.insert(DatabaseHelper.EVENT_TABLE_NAME, (String) null, contentValues2);
        if (!z) {
            int ceil = (int) Math.ceil(((double) bArr.length) / ((double) d));
            for (int i2 = 1; i2 <= ceil; i2++) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (i2 - 1) * d, Math.min(i2 * d, bArr.length));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("event_id", Long.valueOf(insert));
                contentValues3.put("sequence_num", Integer.valueOf(i2));
                contentValues3.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues3);
            }
        }
        for (Map.Entry next : Collections.unmodifiableMap(eVar.b()).entrySet()) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("event_id", Long.valueOf(insert));
            contentValues4.put("name", (String) next.getKey());
            contentValues4.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues4);
        }
        return Long.valueOf(insert);
    }
}
