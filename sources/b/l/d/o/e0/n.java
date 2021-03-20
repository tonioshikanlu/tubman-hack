package b.l.d.o.e0;

import android.util.Log;
import b.l.a.c.c.n.a;
import b.l.a.c.f.e.fc;
import b.l.d.o.q;
import java.util.HashMap;
import java.util.Map;

public final class n {
    public static final a a = new a("GetTokenResultFactory", new String[0]);

    public static q a(String str) {
        Map map;
        try {
            map = o.a(str);
        } catch (fc e2) {
            a aVar = a;
            Log.e(aVar.a, aVar.c("Error parsing token claims", new Object[0]), e2);
            map = new HashMap();
        }
        return new q(str, map);
    }
}
