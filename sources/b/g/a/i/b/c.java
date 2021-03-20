package b.g.a.i.b;

import b.g.a.b;
import b.g.a.e.d;
import b.g.a.i.a;
import b.l.e.b0;
import b.l.e.k;
import b.p.b.o;
import b.p.b.r;
import b.p.b.t;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class c<T, U extends b> implements a<T, U>, Object<T, U> {
    public final Map<String, String> a;

    /* renamed from: b  reason: collision with root package name */
    public final o f453b;
    public final r c;
    public final b0<T> d;

    /* renamed from: e  reason: collision with root package name */
    public final a<U> f454e;
    public final k f;

    /* renamed from: g  reason: collision with root package name */
    public final d f455g;

    /* renamed from: h  reason: collision with root package name */
    public b.g.a.f.a<T, U> f456h = null;

    public c(o oVar, r rVar, k kVar, b0<T> b0Var, a<U> aVar) {
        HashMap hashMap = new HashMap();
        d b2 = d.b();
        this.f453b = oVar;
        this.c = rVar;
        this.f = kVar;
        this.d = b0Var;
        this.a = hashMap;
        this.f455g = b2;
        this.f454e = aVar;
    }

    public a<T, U> a(Map<String, Object> map) {
        d dVar = this.f455g;
        Objects.requireNonNull(dVar);
        if (map != null) {
            for (String next : map.keySet()) {
                if (map.get(next) != null) {
                    dVar.a.put(next, map.get(next));
                }
            }
        }
        return this;
    }

    public abstract t b();

    /* JADX WARNING: type inference failed for: r3v0, types: [b.g.a.i.b.c, b.p.b.e] */
    public void c(b.g.a.f.a<T, U> aVar) {
        this.f456h = aVar;
        try {
            new b.p.b.d(this.c, b()).a(this);
        } catch (b.g.a.d e2) {
            Objects.requireNonNull(this.f454e);
            aVar.b(new b.g.a.e.c("Error parsing the request body", (b) e2));
        }
    }
}
