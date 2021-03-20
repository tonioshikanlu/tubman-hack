package b.g.a.j;

import androidx.annotation.Nullable;
import b.l.e.d0.b;
import java.util.Date;

public class a {
    @b("access_token")
    public String a;
    @b("token_type")

    /* renamed from: b  reason: collision with root package name */
    public String f458b;
    @b("id_token")
    public String c;
    @b("refresh_token")
    public String d;
    @b("scope")

    /* renamed from: e  reason: collision with root package name */
    public String f459e;
    @b("expires_at")
    public Date f;

    public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Date date, @Nullable String str5) {
        this.c = str;
        this.a = str2;
        this.f458b = str3;
        this.d = str4;
        this.f459e = str5;
        this.f = date;
        if (date != null) {
            long time = (date.getTime() - System.currentTimeMillis()) / 1000;
        }
    }
}
