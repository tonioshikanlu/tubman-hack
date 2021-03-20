package b.l.a.c.i.b;

import android.os.Bundle;
import android.text.TextUtils;

public final class b6 implements j9 {
    public final /* synthetic */ m6 a;

    public b6(m6 m6Var) {
        this.a = m6Var;
    }

    public final void a(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.a.A("auto", "_err", bundle);
            return;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }
}
