package b.l.a.c.j;

import androidx.core.app.NotificationCompat;
import b.l.a.c.c.l.a;

public final class d {
    public static final a.g<b.l.a.c.j.b.a> a;

    /* renamed from: b  reason: collision with root package name */
    public static final a.g<b.l.a.c.j.b.a> f4416b;
    public static final a.C0058a<b.l.a.c.j.b.a, a> c;
    public static final a.C0058a<b.l.a.c.j.b.a, Object> d;

    /* renamed from: e  reason: collision with root package name */
    public static final a<a> f4417e;

    static {
        a.g<b.l.a.c.j.b.a> gVar = new a.g<>();
        a = gVar;
        a.g<b.l.a.c.j.b.a> gVar2 = new a.g<>();
        f4416b = gVar2;
        c cVar = new c();
        c = cVar;
        f fVar = new f();
        d = fVar;
        b.l.a.c.b.a.y("profile", "scopeUri must not be null or empty");
        b.l.a.c.b.a.y(NotificationCompat.CATEGORY_EMAIL, "scopeUri must not be null or empty");
        f4417e = new a<>("SignIn.API", cVar, gVar);
        b.l.a.c.b.a.B(fVar, "Cannot construct an Api with a null ClientBuilder");
        b.l.a.c.b.a.B(gVar2, "Cannot construct an Api with a null ClientKey");
    }
}
