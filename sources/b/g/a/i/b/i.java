package b.g.a.i.b;

import b.g.a.b;
import b.g.a.i.a;
import b.l.e.k;
import b.p.b.o;
import b.p.b.r;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class i {
    public final HashMap<String, String> a;

    public i() {
        HashMap<String, String> hashMap = new HashMap<>();
        this.a = hashMap;
        String locale = Locale.getDefault().toString();
        hashMap.put("Accept-Language", locale.isEmpty() ? "en_US" : locale);
    }

    public <T, U extends b> a<T, U> a(o oVar, r rVar, k kVar, Class<T> cls, a<U> aVar) {
        j jVar = new j(oVar, rVar, kVar, "POST", cls, aVar);
        b(jVar);
        return jVar;
    }

    public final <T, U extends b> void b(a<T, U> aVar) {
        for (Map.Entry next : this.a.entrySet()) {
            ((c) aVar).a.put((String) next.getKey(), (String) next.getValue());
        }
    }
}
