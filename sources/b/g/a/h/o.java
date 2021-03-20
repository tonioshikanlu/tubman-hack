package b.g.a.h;

import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import b.g.a.e.b;
import b.g.a.e.c;
import b.g.a.e.d;
import b.p.b.o;
import com.segment.analytics.AnalyticsContext;
import java.security.SecureRandom;
import java.util.Map;
import java.util.Objects;

public class o {

    /* renamed from: e  reason: collision with root package name */
    public static final String f448e = "o";
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public final String f449b;
    public final String c;
    public final String d;

    public class a implements b.g.a.f.a<b.g.a.j.a, c> {
        public final /* synthetic */ d a;

        public a(d dVar) {
            this.a = dVar;
        }

        public void a(Object obj) {
            this.a.a((b.g.a.j.a) obj);
        }

        public void b(b.g.a.b bVar) {
            c cVar = (c) bVar;
            if ("Unauthorized".equals(cVar.b())) {
                String str = o.f448e;
                StringBuilder y = b.e.a.a.a.y("Unable to complete authentication with PKCE. PKCE support can be enabled by setting Application Type to 'Native' and Token Endpoint Authentication Method to 'None' for this app at 'https://manage.auth0.com/#/applications/");
                y.append(o.this.a.a.a);
                y.append("/settings'.");
                Log.e(str, y.toString());
            }
            this.a.b(cVar);
        }
    }

    public o(@NonNull b bVar, String str) {
        a aVar = new a();
        this.a = bVar;
        this.c = str;
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 11);
        this.f449b = encodeToString;
        this.d = Base64.encodeToString(aVar.b(aVar.a(encodeToString)), 11);
    }

    public void a(String str, @NonNull d dVar) {
        b bVar = this.a;
        String str2 = this.c;
        Objects.requireNonNull(bVar);
        d b2 = d.b();
        String str3 = bVar.a.a;
        if (str3 == null) {
            b2.a.remove("client_id");
        } else {
            b2.a.put("client_id", str3);
        }
        b2.a.put("grant_type", "authorization_code");
        if (str == null) {
            b2.a.remove("code");
        } else {
            b2.a.put("code", str);
        }
        if (str2 == null) {
            b2.a.remove("redirect_uri");
        } else {
            b2.a.put("redirect_uri", str2);
        }
        Map<String, Object> a2 = b2.a();
        o.b k2 = b.p.b.o.l(bVar.a.f405b.f6728i).k();
        k2.b("oauth");
        k2.b(AnalyticsContext.Device.DEVICE_TOKEN_KEY);
        b.g.a.i.b.c cVar = (b.g.a.i.b.c) bVar.d.a(k2.c(), bVar.f406b, bVar.c, b.g.a.j.a.class, bVar.f407e);
        cVar.a(a2);
        String str4 = this.f449b;
        d dVar2 = cVar.f455g;
        if (str4 == null) {
            dVar2.a.remove("code_verifier");
        } else {
            dVar2.a.put("code_verifier", str4);
        }
        cVar.c(new a(dVar));
    }
}
