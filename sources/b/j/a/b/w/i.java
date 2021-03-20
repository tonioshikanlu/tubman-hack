package b.j.a.b.w;

import b.j.a.b.l;
import java.util.ArrayList;
import java.util.List;

public class i extends h {

    /* renamed from: j  reason: collision with root package name */
    public final b.j.a.b.i[] f1572j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f1573k;

    /* renamed from: l  reason: collision with root package name */
    public int f1574l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1575m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(boolean z, b.j.a.b.i[] iVarArr) {
        super(iVarArr[0]);
        boolean z2 = false;
        this.f1573k = z;
        if (z && this.f1571i.J0()) {
            z2 = true;
        }
        this.f1575m = z2;
        this.f1572j = iVarArr;
        this.f1574l = 1;
    }

    public static i c1(boolean z, b.j.a.b.i iVar, b.j.a.b.i iVar2) {
        boolean z2 = iVar instanceof i;
        if (z2 || (iVar2 instanceof i)) {
            ArrayList arrayList = new ArrayList();
            if (z2) {
                ((i) iVar).b1(arrayList);
            } else {
                arrayList.add(iVar);
            }
            if (iVar2 instanceof i) {
                ((i) iVar2).b1(arrayList);
            } else {
                arrayList.add(iVar2);
            }
            return new i(z, (b.j.a.b.i[]) arrayList.toArray(new b.j.a.b.i[arrayList.size()]));
        }
        return new i(z, new b.j.a.b.i[]{iVar, iVar2});
    }

    public l T0() {
        l T0;
        b.j.a.b.i iVar = this.f1571i;
        if (iVar == null) {
            return null;
        }
        if (this.f1575m) {
            this.f1575m = false;
            return iVar.z();
        }
        l T02 = iVar.T0();
        if (T02 != null) {
            return T02;
        }
        do {
            int i2 = this.f1574l;
            b.j.a.b.i[] iVarArr = this.f1572j;
            if (i2 >= iVarArr.length) {
                return null;
            }
            this.f1574l = i2 + 1;
            b.j.a.b.i iVar2 = iVarArr[i2];
            this.f1571i = iVar2;
            if (this.f1573k && iVar2.J0()) {
                return this.f1571i.g0();
            }
            T0 = this.f1571i.T0();
        } while (T0 == null);
        return T0;
    }

    public b.j.a.b.i a1() {
        if (this.f1571i.z() != l.START_OBJECT && this.f1571i.z() != l.START_ARRAY) {
            return this;
        }
        int i2 = 1;
        while (true) {
            l T0 = T0();
            if (T0 == null) {
                return this;
            }
            if (T0.f1442l) {
                i2++;
            } else if (T0.f1443m && i2 - 1 == 0) {
                return this;
            }
        }
    }

    public void b1(List<b.j.a.b.i> list) {
        int length = this.f1572j.length;
        for (int i2 = this.f1574l - 1; i2 < length; i2++) {
            b.j.a.b.i iVar = this.f1572j[i2];
            if (iVar instanceof i) {
                ((i) iVar).b1(list);
            } else {
                list.add(iVar);
            }
        }
    }

    public void close() {
        boolean z;
        do {
            this.f1571i.close();
            int i2 = this.f1574l;
            b.j.a.b.i[] iVarArr = this.f1572j;
            if (i2 < iVarArr.length) {
                this.f1574l = i2 + 1;
                this.f1571i = iVarArr[i2];
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
        } while (z);
    }
}
