package b.l.a.a.f.q.i;

import android.database.Cursor;
import b.l.a.a.a;
import b.l.a.a.f.q.i.t;
import java.util.ArrayList;

public final /* synthetic */ class l implements t.b {
    public static final l a = new l();

    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        a aVar = t.f2550l;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i2 += blob.length;
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            byte[] bArr2 = (byte[]) arrayList.get(i4);
            System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
            i3 += bArr2.length;
        }
        return bArr;
    }
}
