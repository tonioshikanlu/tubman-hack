package b.g.a.e.f;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import b.a.a.n.f;
import b.g.a.e.b;
import b.g.a.g.e;
import b.g.a.j.a;
import b.l.e.k;
import java.util.Date;
import java.util.Objects;

@RequiresApi(api = 21)
public class h {

    /* renamed from: g  reason: collision with root package name */
    public static final String f414g = "h";
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public final j f415b;
    public final d c;
    public final k d;

    /* renamed from: e  reason: collision with root package name */
    public final f f416e;
    public int f = -1;

    public h(@NonNull Context context, @NonNull b bVar, @NonNull j jVar) {
        d dVar = new d(context, jVar, "com.auth0.key");
        f fVar = new f();
        this.a = bVar;
        this.f415b = jVar;
        this.c = dVar;
        this.d = f.a();
        this.f416e = fVar;
    }

    public void a() {
        this.f415b.e("com.auth0.credentials");
        this.f415b.e("com.auth0.credentials_expires_at");
        this.f415b.e("com.auth0.credentials_can_refresh");
        Log.d(f414g, "Credentials were just removed from the storage");
    }

    public boolean b() {
        String g2 = this.f415b.g("com.auth0.credentials");
        Long a2 = this.f415b.a("com.auth0.credentials_expires_at");
        Boolean c2 = this.f415b.c("com.auth0.credentials_can_refresh");
        return !TextUtils.isEmpty(g2) && a2 != null && (a2.longValue() > System.currentTimeMillis() || (c2 != null && c2.booleanValue()));
    }

    public void c(@NonNull a aVar) {
        Date date;
        if ((!TextUtils.isEmpty(aVar.a) || !TextUtils.isEmpty(aVar.c)) && (date = aVar.f) != null) {
            long time = date.getTime();
            String str = aVar.c;
            if (str != null) {
                Objects.requireNonNull(this.f416e);
                Date date2 = new e(str).f419j.c;
                if (date2 != null) {
                    time = Math.min(date2.getTime(), time);
                }
            }
            String i2 = this.d.i(aVar);
            boolean z = !TextUtils.isEmpty(aVar.d);
            Log.d(f414g, "Trying to encrypt the given data using the private key.");
            try {
                this.f415b.b("com.auth0.credentials", Base64.encodeToString(this.c.d(i2.getBytes()), 0));
                this.f415b.f("com.auth0.credentials_expires_at", Long.valueOf(time));
                this.f415b.d("com.auth0.credentials_can_refresh", Boolean.valueOf(z));
            } catch (e e2) {
                throw new b(String.format("This device is not compatible with the %s class.", new Object[]{h.class.getSimpleName()}), e2);
            } catch (c e3) {
                a();
                throw new b("A change on the Lock Screen security settings have deemed the encryption keys invalid and have been recreated. Please, try saving the credentials again.", e3);
            }
        } else {
            throw new b("Credentials must have a valid date of expiration and a valid access_token or id_token value.");
        }
    }
}
