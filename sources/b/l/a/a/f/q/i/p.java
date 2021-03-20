package b.l.a.a.f.q.i;

import android.database.Cursor;
import android.util.Base64;
import b.l.a.a.a;
import b.l.a.a.f.b;
import b.l.a.a.f.h;
import b.l.a.a.f.q.i.t;
import java.util.ArrayList;

public final /* synthetic */ class p implements t.b {
    public static final p a = new p();

    public Object apply(Object obj) {
        byte[] bArr;
        Cursor cursor = (Cursor) obj;
        a aVar = t.f2550l;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            h.a a2 = h.a();
            a2.b(cursor.getString(1));
            a2.c(b.l.a.a.f.t.a.b(cursor.getInt(2)));
            String string = cursor.getString(3);
            if (string == null) {
                bArr = null;
            } else {
                bArr = Base64.decode(string, 0);
            }
            b.C0054b bVar = (b.C0054b) a2;
            bVar.f2471b = bArr;
            arrayList.add(bVar.a());
        }
        return arrayList;
    }
}
