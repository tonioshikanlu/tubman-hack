package b.l.a.d.a.b;

import android.os.Bundle;
import b.l.a.d.a.i.n;

public final class l extends h<Void> {
    public final int c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4573e;
    public final /* synthetic */ m f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(m mVar, n<Void> nVar, int i2, String str, int i3) {
        super(mVar, nVar);
        this.f = mVar;
        this.c = i2;
        this.d = str;
        this.f4573e = i3;
    }

    public final void s0(Bundle bundle) {
        this.f.c.b();
        int i2 = bundle.getInt("error_code");
        m.f.b(6, "onError(%d), retrying notifyModuleCompleted...", new Object[]{Integer.valueOf(i2)});
        int i3 = this.f4573e;
        if (i3 > 0) {
            this.f.k(this.c, this.d, i3 - 1);
        }
    }
}
