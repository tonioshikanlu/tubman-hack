package b.l.d.n.a.c;

import android.os.Bundle;
import b.l.a.c.i.a.a;
import b.l.a.c.i.b.i5;
import b.l.a.c.i.b.s6;
import com.amplitude.api.DatabaseHelper;
import java.util.Set;

public final class c implements a.C0067a {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j2) {
        if (this.a.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            Set<String> set = b.a;
            String c = s6.c(str2, i5.c, i5.a);
            if (c != null) {
                str2 = c;
            }
            bundle2.putString(DatabaseHelper.EVENT_TABLE_NAME, str2);
            ((b.l.d.q.a) this.a.f4924b).a(2, bundle2);
        }
    }
}
