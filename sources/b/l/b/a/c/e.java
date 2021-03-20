package b.l.b.a.c;

import b.l.a.c.b.a;
import b.l.b.a.c.j.c;
import b.l.b.a.d.t;
import java.io.Reader;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class e implements t {
    public final c a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<String> f4754b;

    public e(c cVar) {
        HashSet hashSet = new HashSet();
        Objects.requireNonNull(cVar);
        this.a = cVar;
        this.f4754b = new HashSet(hashSet);
    }

    public final void a(f fVar) {
        String str;
        if (!this.f4754b.isEmpty()) {
            try {
                Set<String> set = this.f4754b;
                i e0 = fVar.e0();
                while (true) {
                    if (e0 != i.FIELD_NAME) {
                        str = null;
                        break;
                    }
                    str = fVar.q();
                    fVar.z();
                    if (set.contains(str)) {
                        break;
                    }
                    ((c) fVar).f4768j.a1();
                    e0 = fVar.z();
                }
                a.p((str == null || fVar.e() == i.END_OBJECT) ? false : true, "wrapper key(s) not found: %s", this.f4754b);
            } catch (Throwable th) {
                ((c) fVar).f4768j.close();
                throw th;
            }
        }
    }

    public <T> T b(Reader reader, Class<T> cls) {
        f c = this.a.c(reader);
        a(c);
        return c.H(cls, true, (a) null);
    }
}
