package b.l.a.c.i.b;

import android.os.Bundle;
import android.text.TextUtils;

public final class b9 implements j9 {
    public final /* synthetic */ d9 a;

    public b9(d9 d9Var) {
        this.a = d9Var;
    }

    public final void a(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.a.f3979j.a().f.a("AppId not known when logging error event");
        } else {
            this.a.d().q(new a9(this, str, bundle));
        }
    }
}
