package b.g.a.i.b;

import b.g.a.j.a;
import b.l.e.e0.z.m;
import b.l.e.o;
import b.l.e.p;
import b.l.e.q;
import b.l.e.s;
import b.l.e.t;
import b.l.e.u;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.Date;
import java.util.Objects;

public class d implements p<a> {
    public Object a(q qVar, Type type, o oVar) {
        Class<String> cls = String.class;
        Objects.requireNonNull(qVar);
        if (!(qVar instanceof t) || (qVar instanceof s) || ((AbstractCollection) qVar.e().entrySet()).isEmpty()) {
            throw new u("credentials json is not a valid json object");
        }
        t e2 = qVar.e();
        m.b bVar = (m.b) oVar;
        String str = (String) bVar.a(e2.a.remove("id_token"), cls);
        String str2 = (String) bVar.a(e2.a.remove("access_token"), cls);
        String str3 = (String) bVar.a(e2.a.remove("token_type"), cls);
        String str4 = (String) bVar.a(e2.a.remove("refresh_token"), cls);
        Long l2 = (Long) bVar.a(e2.a.remove("expires_in"), Long.class);
        String str5 = (String) bVar.a(e2.a.remove("scope"), cls);
        Date date = (Date) bVar.a(e2.a.remove("expires_at"), Date.class);
        if (date == null && l2 != null) {
            date = new Date((l2.longValue() * 1000) + System.currentTimeMillis());
        }
        return new a(str, str2, str3, str4, date, str5);
    }
}
