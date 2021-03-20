package n;

import e.x.c.i;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import n.b0;
import n.m0.c;
import n.z;
import o.e;
import o.f;

public final class v extends g0 {
    public static final b0 d = b0.a.a("application/x-www-form-urlencoded");

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f10421b;
    public final List<String> c;

    public static final class a {
        public final List<String> a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f10422b = new ArrayList();
        public final Charset c = null;

        public final a a(String str, String str2) {
            i.e(str, "name");
            i.e(str2, "value");
            List<String> list = this.a;
            z.b bVar = z.f10429l;
            list.add(z.b.a(bVar, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.c, 91));
            this.f10422b.add(z.b.a(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.c, 91));
            return this;
        }
    }

    static {
        b0.a aVar = b0.f10048e;
    }

    public v(List<String> list, List<String> list2) {
        i.e(list, "encodedNames");
        i.e(list2, "encodedValues");
        this.f10421b = c.y(list);
        this.c = c.y(list2);
    }

    public long a() {
        return d((f) null, true);
    }

    public b0 b() {
        return d;
    }

    public void c(f fVar) {
        i.e(fVar, "sink");
        d(fVar, false);
    }

    public final long d(f fVar, boolean z) {
        e eVar;
        if (z) {
            eVar = new e();
        } else {
            i.c(fVar);
            eVar = fVar.d();
        }
        int size = this.f10421b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                eVar.u0(38);
            }
            eVar.y0(this.f10421b.get(i2));
            eVar.u0(61);
            eVar.y0(this.c.get(i2));
        }
        if (!z) {
            return 0;
        }
        long j2 = eVar.f10453i;
        eVar.skip(j2);
        return j2;
    }
}
