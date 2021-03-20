package b.l.d.n.a.c;

import android.os.Bundle;
import b.l.a.c.i.a.a;

public final class e implements a.C0067a {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j2) {
        if (str != null && !str.equals("crash") && (!b.a.contains(str2))) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j2);
            bundle2.putBundle("params", bundle);
            ((b.l.d.q.a) this.a.a).a(3, bundle2);
        }
    }
}
