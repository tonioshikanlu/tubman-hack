package b.l.a.c.f.i;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class v2 implements z2 {
    public final x2 a;

    public v2(x2 x2Var) {
        this.a = x2Var;
    }

    /* JADX INFO: finally extract failed */
    public final Object a() {
        x2 x2Var = this.a;
        Cursor query = x2Var.a.query(x2Var.f3806b, x2.f3805h, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                Map emptyMap = Collections.emptyMap();
                query.close();
                return emptyMap;
            }
            Map arrayMap = count <= 256 ? new ArrayMap(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                arrayMap.put(query.getString(0), query.getString(1));
            }
            query.close();
            return arrayMap;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
