package b.l.f;

import java.util.EnumMap;
import java.util.Map;

public final class q {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5763b;
    public s[] c;
    public final a d;

    /* renamed from: e  reason: collision with root package name */
    public Map<r, Object> f5764e = null;

    public q(String str, byte[] bArr, int i2, s[] sVarArr, a aVar, long j2) {
        this.a = str;
        this.f5763b = bArr;
        this.c = sVarArr;
        this.d = aVar;
    }

    public q(String str, byte[] bArr, s[] sVarArr, a aVar) {
        System.currentTimeMillis();
        this.a = str;
        this.f5763b = bArr;
        this.c = sVarArr;
        this.d = aVar;
    }

    public void a(Map<r, Object> map) {
        if (map != null) {
            Map<r, Object> map2 = this.f5764e;
            if (map2 == null) {
                this.f5764e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void b(r rVar, Object obj) {
        if (this.f5764e == null) {
            this.f5764e = new EnumMap(r.class);
        }
        this.f5764e.put(rVar, obj);
    }

    public String toString() {
        return this.a;
    }
}
