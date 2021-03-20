package b.l.f.c0;

import b.l.f.a;
import b.l.f.c;
import b.l.f.e;
import b.l.f.h;
import b.l.f.q;
import b.l.f.r;
import java.util.Map;

public final class t extends y {

    /* renamed from: i  reason: collision with root package name */
    public final y f5648i = new i();

    public static q s(q qVar) {
        String str = qVar.a;
        if (str.charAt(0) == '0') {
            q qVar2 = new q(str.substring(1), (byte[]) null, qVar.c, a.UPC_A);
            Map<r, Object> map = qVar.f5764e;
            if (map != null) {
                qVar2.a(map);
            }
            return qVar2;
        }
        throw h.a();
    }

    public q a(c cVar, Map<e, ?> map) {
        return s(this.f5648i.a(cVar, map));
    }

    public q b(c cVar) {
        return s(this.f5648i.b(cVar));
    }

    public q d(int i2, b.l.f.y.a aVar, Map<e, ?> map) {
        return s(this.f5648i.d(i2, aVar, map));
    }

    public int m(b.l.f.y.a aVar, int[] iArr, StringBuilder sb) {
        return this.f5648i.m(aVar, iArr, sb);
    }

    public q n(int i2, b.l.f.y.a aVar, int[] iArr, Map<e, ?> map) {
        return s(this.f5648i.n(i2, aVar, iArr, map));
    }

    public a q() {
        return a.UPC_A;
    }
}
