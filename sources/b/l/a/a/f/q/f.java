package b.l.a.a.f.q;

import b.l.a.a.b;
import b.l.a.a.f.q.h.c;
import b.l.a.a.f.q.h.f;
import com.amplitude.api.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import m.a.a;

public final class f implements Object<b.l.a.a.f.q.h.f> {
    public final a<b.l.a.a.f.s.a> a;

    public f(a<b.l.a.a.f.s.a> aVar) {
        this.a = aVar;
    }

    public Object get() {
        b.l.a.a.f.s.a aVar = this.a.get();
        HashMap hashMap = new HashMap();
        b bVar = b.DEFAULT;
        f.a.C0056a a2 = f.a.a();
        a2.b(Constants.EVENT_UPLOAD_PERIOD_MILLIS);
        a2.c(86400000);
        hashMap.put(bVar, a2.a());
        b bVar2 = b.HIGHEST;
        f.a.C0056a a3 = f.a.a();
        a3.b(1000);
        a3.c(86400000);
        hashMap.put(bVar2, a3.a());
        b bVar3 = b.VERY_LOW;
        f.a.C0056a a4 = f.a.a();
        a4.b(86400000);
        a4.c(86400000);
        Set<f.b> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new f.b[]{f.b.NETWORK_UNMETERED, f.b.DEVICE_IDLE})));
        c.b bVar4 = (c.b) a4;
        Objects.requireNonNull(unmodifiableSet, "Null flags");
        bVar4.c = unmodifiableSet;
        hashMap.put(bVar3, bVar4.a());
        Objects.requireNonNull(aVar, "missing required property: clock");
        int size = hashMap.keySet().size();
        b.values();
        if (size >= 3) {
            new HashMap();
            return new b.l.a.a.f.q.h.b(aVar, hashMap);
        }
        throw new IllegalStateException("Not all priorities have been configured");
    }
}
