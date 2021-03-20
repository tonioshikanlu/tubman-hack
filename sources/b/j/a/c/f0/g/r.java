package b.j.a.c.f0.g;

import b.j.a.b.l;
import b.j.a.b.v.b;
import b.j.a.c.f0.d;
import b.j.a.c.f0.f;
import java.util.Objects;

public abstract class r extends f {
    public final d a;

    /* renamed from: b  reason: collision with root package name */
    public final b.j.a.c.d f1990b;

    public r(d dVar, b.j.a.c.d dVar2) {
        this.a = dVar;
        this.f1990b = dVar2;
    }

    public String b() {
        return null;
    }

    public b e(b.j.a.b.f fVar, b bVar) {
        String str;
        if (bVar.c == null) {
            Object obj = bVar.a;
            Class<?> cls = bVar.f1539b;
            if (cls == null) {
                str = this.a.c(obj);
            } else {
                str = this.a.a(obj, cls);
            }
            bVar.c = str;
        }
        Objects.requireNonNull(fVar);
        Object obj2 = bVar.c;
        l lVar = bVar.f;
        boolean z = false;
        if (fVar.z()) {
            bVar.f1541g = false;
            fVar.T0(obj2);
        } else {
            String valueOf = obj2 instanceof String ? (String) obj2 : String.valueOf(obj2);
            bVar.f1541g = true;
            b.a aVar = bVar.f1540e;
            if (lVar != l.START_OBJECT) {
                Objects.requireNonNull(aVar);
                if (aVar == b.a.METADATA_PROPERTY || aVar == b.a.PAYLOAD_PROPERTY) {
                    z = true;
                }
                if (z) {
                    aVar = b.a.WRAPPER_ARRAY;
                    bVar.f1540e = aVar;
                }
            }
            int ordinal = aVar.ordinal();
            if (ordinal == 1) {
                fVar.N0();
                fVar.t0(valueOf);
            } else if (ordinal == 2) {
                fVar.O0(bVar.a);
                fVar.S0(bVar.d, valueOf);
                return bVar;
            } else if (!(ordinal == 3 || ordinal == 4)) {
                fVar.L0();
                fVar.Q0(valueOf);
            }
        }
        if (lVar == l.START_OBJECT) {
            fVar.O0(bVar.a);
        } else if (lVar == l.START_ARRAY) {
            fVar.L0();
        }
        return bVar;
    }

    public b f(b.j.a.b.f fVar, b bVar) {
        Objects.requireNonNull(fVar);
        l lVar = bVar.f;
        if (lVar == l.START_OBJECT) {
            fVar.r0();
        } else if (lVar == l.START_ARRAY) {
            fVar.q0();
        }
        if (bVar.f1541g) {
            int ordinal = bVar.f1540e.ordinal();
            if (ordinal == 0) {
                fVar.q0();
            } else if (!(ordinal == 2 || ordinal == 3)) {
                if (ordinal != 4) {
                    fVar.r0();
                } else {
                    Object obj = bVar.c;
                    fVar.S0(bVar.d, obj instanceof String ? (String) obj : String.valueOf(obj));
                }
            }
        }
        return bVar;
    }
}
