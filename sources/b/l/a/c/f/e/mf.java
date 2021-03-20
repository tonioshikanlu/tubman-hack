package b.l.a.c.f.e;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import b.l.a.c.c.n.a;
import b.l.d.o.n0;
import b.l.d.o.x;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

public final class mf implements ij<cm> {
    public final /* synthetic */ ij a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ nf f3164b;

    public mf(nf nfVar, ij ijVar) {
        this.f3164b = nfVar;
        this.a = ijVar;
    }

    public final void a(Object obj) {
        cm cmVar = (cm) obj;
        if (!TextUtils.isEmpty(cmVar.f2901l)) {
            Status status = new Status(17025);
            ei eiVar = this.f3164b.f3191b;
            x xVar = new x((String) null, (String) null, false, cmVar.f2902m, true, cmVar.f2901l, (String) null);
            Objects.requireNonNull(eiVar);
            try {
                eiVar.a.i1(status, xVar);
            } catch (RemoteException e2) {
                a aVar = eiVar.f2940b;
                Log.e(aVar.a, aVar.c("RemoteException when sending failure result.", new Object[0]), e2);
            }
        } else {
            this.f3164b.c.f(new sk(cmVar.f2898i, cmVar.f2897h, Long.valueOf(cmVar.f2899j), "Bearer"), (String) null, "phone", Boolean.valueOf(cmVar.f2900k), (n0) null, this.f3164b.f3191b, this.a);
        }
    }

    public final void d(@Nullable String str) {
        this.a.d(str);
    }
}
