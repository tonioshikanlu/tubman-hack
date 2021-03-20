package e.a.a.a.y0.d.a.b0;

import e.a.a.a.y0.d.a.a;
import e.a.a.a.y0.d.a.e0.d;
import e.a.a.a.y0.d.a.e0.h;
import e.x.c.i;
import java.util.EnumMap;

public final class e {
    public final EnumMap<a.C0170a, h> a;

    public e(EnumMap<a.C0170a, h> enumMap) {
        i.e(enumMap, "nullabilityQualifiers");
        this.a = enumMap;
    }

    public final d a(a.C0170a aVar) {
        h hVar = this.a.get(aVar);
        if (hVar == null) {
            return null;
        }
        i.d(hVar, "nullabilityQualifiers[ap…ilityType] ?: return null");
        return new d(hVar.a, (e.a.a.a.y0.d.a.e0.e) null, false, hVar.f8509b);
    }
}
