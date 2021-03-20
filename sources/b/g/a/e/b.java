package b.g.a.e;

import androidx.annotation.NonNull;
import b.a.a.n.f;
import b.g.a.a;
import b.g.a.i.b.i;
import b.g.a.k.c;
import b.l.e.k;
import b.p.b.r;
import b.p.b.s;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class b {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final r f406b;
    public final k c;
    public final i d;

    /* renamed from: e  reason: collision with root package name */
    public final b.g.a.i.b.a<c> f407e;

    public b(@NonNull a aVar) {
        i iVar = new i();
        k a2 = f.a();
        this.a = aVar;
        Objects.requireNonNull(aVar);
        r rVar = new r();
        s sVar = s.HTTP_1_1;
        List h2 = b.p.b.a0.i.h(Arrays.asList(new s[]{sVar, s.SPDY_3}));
        if (!h2.contains(sVar)) {
            throw new IllegalArgumentException("protocols doesn't contain http/1.1: " + h2);
        } else if (h2.contains(s.HTTP_1_0)) {
            throw new IllegalArgumentException("protocols must not contain http/1.0: " + h2);
        } else if (!h2.contains((Object) null)) {
            rVar.f6743k = b.p.b.a0.i.h(h2);
            this.f406b = rVar;
            this.c = a2;
            this.d = iVar;
            this.f407e = new b.g.a.i.b.a();
            c cVar = aVar.c;
            if (cVar != null) {
                iVar.a.put("Auth0-Client", cVar.f464b);
            }
        } else {
            throw new IllegalArgumentException("protocols must not contain null");
        }
    }
}
