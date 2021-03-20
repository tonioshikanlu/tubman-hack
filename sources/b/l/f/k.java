package b.l.f;

import b.l.f.c0.p;
import b.l.f.e0.a;
import b.l.f.w.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class k implements o {
    public static final o[] c = new o[0];
    public Map<e, ?> a;

    /* renamed from: b  reason: collision with root package name */
    public o[] f5758b;

    public q a(c cVar, Map<e, ?> map) {
        e(map);
        return d(cVar);
    }

    public q b(c cVar) {
        e((Map<e, ?>) null);
        return d(cVar);
    }

    public void c() {
        o[] oVarArr = this.f5758b;
        if (oVarArr != null) {
            for (o c2 : oVarArr) {
                c2.c();
            }
        }
    }

    public final q d(c cVar) {
        o[] oVarArr = this.f5758b;
        if (oVarArr != null) {
            int length = oVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                try {
                    return oVarArr[i2].a(cVar, this.a);
                } catch (p unused) {
                    i2++;
                }
            }
        }
        throw m.f5759j;
    }

    public void e(Map<e, ?> map) {
        this.a = map;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(e.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(a.UPC_A) && !collection.contains(a.UPC_E) && !collection.contains(a.EAN_13) && !collection.contains(a.EAN_8) && !collection.contains(a.CODABAR) && !collection.contains(a.CODE_39) && !collection.contains(a.CODE_93) && !collection.contains(a.CODE_128) && !collection.contains(a.ITF) && !collection.contains(a.RSS_14) && !collection.contains(a.RSS_EXPANDED)) {
                z = false;
            }
            if (z && !z2) {
                arrayList.add(new p(map));
            }
            if (collection.contains(a.QR_CODE)) {
                arrayList.add(new a());
            }
            if (collection.contains(a.DATA_MATRIX)) {
                arrayList.add(new b.l.f.z.a());
            }
            if (collection.contains(a.AZTEC)) {
                arrayList.add(new b());
            }
            if (collection.contains(a.PDF_417)) {
                arrayList.add(new b.l.f.d0.b());
            }
            if (collection.contains(a.MAXICODE)) {
                arrayList.add(new b.l.f.b0.a());
            }
            if (z && z2) {
                arrayList.add(new p(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z2) {
                arrayList.add(new p(map));
            }
            arrayList.add(new a());
            arrayList.add(new b.l.f.z.a());
            arrayList.add(new b());
            arrayList.add(new b.l.f.d0.b());
            arrayList.add(new b.l.f.b0.a());
            if (z2) {
                arrayList.add(new p(map));
            }
        }
        this.f5758b = (o[]) arrayList.toArray(c);
    }
}
