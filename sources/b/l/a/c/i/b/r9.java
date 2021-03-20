package b.l.a.c.i.b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import b.l.a.c.c.p.c;
import java.util.Objects;

public final class r9 {
    public final l4 a;

    public r9(l4 l4Var) {
        this.a = l4Var;
    }

    @WorkerThread
    public final void a(String str, Bundle bundle) {
        String str2;
        this.a.d().h();
        if (!this.a.j()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.a.q().z.b(str2);
                u3 u3Var = this.a.q().A;
                Objects.requireNonNull((c) this.a.f4121n);
                u3Var.b(System.currentTimeMillis());
            }
        }
    }

    public final boolean b() {
        if (!c()) {
            return false;
        }
        Objects.requireNonNull((c) this.a.f4121n);
        if (System.currentTimeMillis() - this.a.q().A.a() > this.a.f4114g.o((String) null, x2.R)) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        return this.a.q().A.a() > 0;
    }
}
