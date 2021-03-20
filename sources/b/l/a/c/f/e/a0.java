package b.l.a.c.f.e;

import java.util.Iterator;
import java.util.Map;

public final class a0 {
    public static final int a(int i2, Object obj, Object obj2) {
        z zVar = (z) obj;
        x xVar = (x) obj2;
        if (zVar.isEmpty()) {
            return 0;
        }
        Iterator it = zVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object b(Object obj, Object obj2) {
        z zVar = (z) obj;
        z zVar2 = (z) obj2;
        if (!zVar2.isEmpty()) {
            if (!zVar.f3428h) {
                zVar = zVar.a();
            }
            zVar.c();
            if (!zVar2.isEmpty()) {
                zVar.putAll(zVar2);
            }
        }
        return zVar;
    }
}
