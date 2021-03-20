package b.l.f;

import b.l.f.c0.b0;
import b.l.f.c0.d;
import b.l.f.c0.f;
import b.l.f.c0.h;
import b.l.f.c0.j;
import b.l.f.c0.o;
import b.l.f.c0.u;
import b.l.f.w.c;
import b.l.f.y.b;
import java.util.Map;

public final class l implements u {
    public b a(String str, a aVar, int i2, int i3, Map<g, ?> map) {
        u uVar;
        switch (aVar.ordinal()) {
            case 0:
                uVar = new c();
                break;
            case 1:
                uVar = new b.l.f.c0.b();
                break;
            case 2:
                uVar = new f();
                break;
            case 3:
                uVar = new h();
                break;
            case 4:
                uVar = new d();
                break;
            case 5:
                uVar = new b.l.f.z.b();
                break;
            case 6:
                uVar = new b.l.f.c0.l();
                break;
            case 7:
                uVar = new j();
                break;
            case 8:
                uVar = new o();
                break;
            case 10:
                uVar = new b.l.f.d0.d();
                break;
            case 11:
                uVar = new b.l.f.e0.b();
                break;
            case 14:
                uVar = new u();
                break;
            case 15:
                uVar = new b0();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
        }
        return uVar.a(str, aVar, i2, i3, map);
    }
}
