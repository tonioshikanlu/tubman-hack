package b.l.d.q;

import android.os.Bundle;
import androidx.annotation.Nullable;
import b.l.d.n.a.a;
import b.l.d.q.f.e.b;

public class a implements a.b {
    public b a;

    /* renamed from: b  reason: collision with root package name */
    public b f5053b;

    public void a(int i2, @Nullable Bundle bundle) {
        b.l.d.q.f.b bVar = b.l.d.q.f.b.a;
        bVar.b("Received Analytics message: " + i2 + " " + bundle);
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            b bVar2 = "clx".equals(bundle2.getString("_o")) ? this.a : this.f5053b;
            if (bVar2 != null) {
                bVar2.b(string, bundle2);
            }
        }
    }
}
