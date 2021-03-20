package b.g.a.i.b;

import androidx.core.app.NotificationCompat;
import b.g.a.j.b;
import b.l.e.e0.z.m;
import b.l.e.o;
import b.l.e.p;
import b.l.e.q;
import b.l.e.s;
import b.l.e.t;
import b.l.e.u;
import com.amplitude.api.AmplitudeClient;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class m implements p<b> {
    public Object a(q qVar, Type type, o oVar) {
        q qVar2 = qVar;
        Class<String> cls = String.class;
        Objects.requireNonNull(qVar);
        if (!(qVar2 instanceof t) || (qVar2 instanceof s) || ((AbstractCollection) qVar.e().entrySet()).isEmpty()) {
            throw new u("user profile json is not a valid json object");
        }
        t e2 = qVar.e();
        m.b bVar = (m.b) oVar;
        String str = (String) bVar.a(e2.a.remove(AmplitudeClient.USER_ID_KEY), cls);
        String str2 = (String) bVar.a(e2.a.remove("name"), cls);
        String str3 = (String) bVar.a(e2.a.remove("nickname"), cls);
        String str4 = (String) bVar.a(e2.a.remove("picture"), cls);
        String str5 = (String) bVar.a(e2.a.remove(NotificationCompat.CATEGORY_EMAIL), cls);
        String str6 = (String) bVar.a(e2.a.remove("given_name"), cls);
        String str7 = (String) bVar.a(e2.a.remove("family_name"), cls);
        Boolean valueOf = Boolean.valueOf(e2.v("email_verified") ? ((Boolean) bVar.a(e2.a.remove("email_verified"), Boolean.class)).booleanValue() : false);
        Type type2 = new k(this).f5519b;
        Type type3 = new l(this).f5519b;
        return new b(str, str2, str3, str4, str5, valueOf.booleanValue(), str7, (Date) bVar.a(e2.a.remove("created_at"), Date.class), (List) bVar.a(e2.a.remove("identities"), type2), (Map) bVar.a(e2, type3), (Map) bVar.a(e2.a.remove("user_metadata"), type3), (Map) bVar.a(e2.a.remove("app_metadata"), type3), str6);
    }
}
