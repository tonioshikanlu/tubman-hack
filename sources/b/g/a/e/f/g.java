package b.g.a.e.f;

import b.g.a.b;
import b.g.a.e.c;
import b.g.a.j.a;
import java.util.Objects;

public class g implements Object<a> {
    public final /* synthetic */ a a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b.g.a.f.a f413b;
    public final /* synthetic */ h c;

    public g(h hVar, a aVar, b.g.a.f.a aVar2) {
        this.c = hVar;
        this.a = aVar;
        this.f413b = aVar2;
    }

    public void a(Object obj) {
        a aVar = (a) obj;
        a aVar2 = new a(aVar.c, aVar.a, aVar.f458b, this.a.d, aVar.f, aVar.f459e);
        this.c.c(aVar2);
        this.f413b.a(aVar2);
        Objects.requireNonNull(this.c);
    }

    public void b(b bVar) {
        this.f413b.b(new b("An error occurred while trying to use the Refresh Token to renew the Credentials.", (c) bVar));
        Objects.requireNonNull(this.c);
    }
}
