package e.a.a.a.y0.d.a.e0;

import b.q.a.a;
import e.x.b.l;
import e.x.c.k;

public final class m extends k implements l<Integer, d> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ d[] f8554h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(d[] dVarArr) {
        super(1);
        this.f8554h = dVarArr;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        d[] dVarArr = this.f8554h;
        if (intValue >= 0 && intValue <= a.V0(dVarArr)) {
            return dVarArr[intValue];
        }
        d dVar = d.f;
        d dVar2 = d.f8499e;
        return d.f8499e;
    }
}
