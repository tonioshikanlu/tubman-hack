package b.l.a.c.g;

import b.l.a.c.c.l.a;
import b.l.a.c.c.l.h;
import b.l.a.c.c.l.k.d;
import b.l.a.c.f.g.c0;
import b.l.a.c.f.g.p;
import com.google.android.gms.common.api.GoogleApiClient;

public class b {
    public static final a.g<p> a;

    /* renamed from: b  reason: collision with root package name */
    public static final a.C0058a<p, a.d.c> f3853b;
    public static final b.l.a.c.c.l.a<a.d.c> c;
    @Deprecated
    public static final c0 d = new c0();

    public static abstract class a<R extends h> extends d<R, p> {
        public a(GoogleApiClient googleApiClient) {
            super(b.c, googleApiClient);
        }
    }

    static {
        a.g<p> gVar = new a.g<>();
        a = gVar;
        f fVar = new f();
        f3853b = fVar;
        c = new b.l.a.c.c.l.a<>("LocationServices.API", fVar, gVar);
    }
}
