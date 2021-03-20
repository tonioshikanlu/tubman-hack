package b.g.a;

import android.content.Context;
import androidx.annotation.NonNull;
import b.g.a.k.c;
import b.p.b.o;

public class a {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final o f405b;
    public c c;
    public boolean d;

    public a(@NonNull Context context) {
        String b2 = b(context, "com_auth0_client_id");
        String b3 = b(context, "com_auth0_domain");
        this.a = b2;
        o a2 = a(b3);
        this.f405b = a2;
        if (a2 != null) {
            if (a((String) null) == null) {
                String str = a2.d;
                if (str.endsWith(".auth0.com")) {
                    String[] split = str.split("\\.");
                    o.l(split.length > 3 ? b.e.a.a.a.q(b.e.a.a.a.y("https://cdn."), split[split.length - 3], ".auth0.com") : "https://cdn.auth0.com");
                }
            }
            this.c = new c("Auth0.Android", "1.22.0");
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid domain url: '%s'", new Object[]{b3}));
    }

    public static String b(@NonNull Context context, String str) {
        int identifier = context.getResources().getIdentifier(str, "string", context.getPackageName());
        if (identifier != 0) {
            return context.getString(identifier);
        }
        throw new IllegalArgumentException(String.format("The 'R.string.%s' value it's not defined in your project's resources file.", new Object[]{str}));
    }

    public final o a(String str) {
        if (str == null) {
            return null;
        }
        if (!str.startsWith("http")) {
            str = b.e.a.a.a.m("https://", str);
        }
        return o.l(str);
    }
}
