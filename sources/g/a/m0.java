package g.a;

import e.t.g;
import g.a.a.b;
import java.util.Objects;

public abstract class m0 extends x {

    /* renamed from: i  reason: collision with root package name */
    public long f9961i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f9962j;

    /* renamed from: k  reason: collision with root package name */
    public b<h0<?>> f9963k;

    public final void o0(boolean z) {
        long p0 = this.f9961i - p0(z);
        this.f9961i = p0;
        if (p0 <= 0 && this.f9962j) {
            shutdown();
        }
    }

    public final long p0(boolean z) {
        return z ? 4294967296L : 1;
    }

    public final void q0(h0<?> h0Var) {
        b<h0<?>> bVar = this.f9963k;
        if (bVar == null) {
            bVar = new b<>();
            this.f9963k = bVar;
        }
        Object[] objArr = bVar.a;
        int i2 = bVar.c;
        objArr[i2] = h0Var;
        int length = (objArr.length - 1) & (i2 + 1);
        bVar.c = length;
        int i3 = bVar.f9899b;
        if (length == i3) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[(length2 << 1)];
            g.h(objArr, objArr2, 0, i3, 0, 10);
            Object[] objArr3 = bVar.a;
            int length3 = objArr3.length;
            int i4 = bVar.f9899b;
            g.h(objArr3, objArr2, length3 - i4, 0, i4, 4);
            bVar.a = objArr2;
            bVar.f9899b = 0;
            bVar.c = length2;
        }
    }

    public final void r0(boolean z) {
        this.f9961i = p0(z) + this.f9961i;
        if (!z) {
            this.f9962j = true;
        }
    }

    public final boolean s0() {
        return this.f9961i >= p0(true);
    }

    public void shutdown() {
    }

    public final boolean t0() {
        b<h0<?>> bVar = this.f9963k;
        if (bVar != null) {
            int i2 = bVar.f9899b;
            Object obj = null;
            if (i2 != bVar.c) {
                Object[] objArr = bVar.a;
                Object obj2 = objArr[i2];
                objArr[i2] = null;
                bVar.f9899b = (i2 + 1) & (objArr.length - 1);
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type T");
                obj = obj2;
            }
            h0 h0Var = (h0) obj;
            if (h0Var != null) {
                h0Var.run();
                return true;
            }
        }
        return false;
    }
}
