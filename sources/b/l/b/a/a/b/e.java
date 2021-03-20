package b.l.b.a.a.b;

import b.l.b.a.b.a;
import b.l.b.a.b.d;
import b.l.b.a.b.f;
import b.l.b.a.b.g;
import b.l.b.a.b.n;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class e implements g, d {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4711b;

    public e(String str, String str2) {
        Objects.requireNonNull(str);
        this.a = str;
        this.f4711b = str2;
    }

    public void initialize(f fVar) {
        fVar.a = this;
    }

    public void intercept(f fVar) {
        n nVar;
        a aVar = fVar.f4724h;
        if (aVar != null) {
            nVar = (n) aVar;
        } else {
            nVar = new n(new HashMap());
            fVar.f4724h = nVar;
        }
        Map<String, Object> e2 = b.l.b.a.d.g.e(nVar.c);
        e2.put("client_id", this.a);
        String str = this.f4711b;
        if (str != null) {
            e2.put("client_secret", str);
        }
    }
}
