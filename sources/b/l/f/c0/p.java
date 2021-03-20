package b.l.f.c0;

import b.l.f.a;
import b.l.f.c0.c0.f.c;
import b.l.f.e;
import b.l.f.m;
import b.l.f.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class p extends r {

    /* renamed from: b  reason: collision with root package name */
    public static final r[] f5646b = new r[0];
    public final r[] a;

    public p(Map<e, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(e.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(a.EAN_13) || collection.contains(a.UPC_A) || collection.contains(a.EAN_8) || collection.contains(a.UPC_E)) {
                arrayList.add(new q(map));
            }
            if (collection.contains(a.CODE_39)) {
                arrayList.add(new e(z));
            }
            if (collection.contains(a.CODE_93)) {
                arrayList.add(new g());
            }
            if (collection.contains(a.CODE_128)) {
                arrayList.add(new c());
            }
            if (collection.contains(a.ITF)) {
                arrayList.add(new n());
            }
            if (collection.contains(a.CODABAR)) {
                arrayList.add(new a());
            }
            if (collection.contains(a.RSS_14)) {
                arrayList.add(new b.l.f.c0.c0.e());
            }
            if (collection.contains(a.RSS_EXPANDED)) {
                arrayList.add(new c());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new q(map));
            arrayList.add(new e(false));
            arrayList.add(new a());
            arrayList.add(new g());
            arrayList.add(new c());
            arrayList.add(new n());
            arrayList.add(new b.l.f.c0.c0.e());
            arrayList.add(new c());
        }
        this.a = (r[]) arrayList.toArray(f5646b);
    }

    public void c() {
        for (r c : this.a) {
            c.c();
        }
    }

    public q d(int i2, b.l.f.y.a aVar, Map<e, ?> map) {
        r[] rVarArr = this.a;
        int i3 = 0;
        while (i3 < rVarArr.length) {
            try {
                return rVarArr[i3].d(i2, aVar, map);
            } catch (b.l.f.p unused) {
                i3++;
            }
        }
        throw m.f5759j;
    }
}
