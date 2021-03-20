package b.l.a.c.h;

import android.content.Context;
import android.os.RemoteException;
import b.l.a.c.b.a;
import b.l.a.c.c.g;
import b.l.a.c.f.h.d;
import b.l.a.c.h.f.l;
import b.l.a.c.h.f.m;
import java.util.Objects;

public final class c {
    public static boolean a = false;

    public static synchronized int a(Context context) {
        synchronized (c.class) {
            a.B(context, "Context is null");
            if (a) {
                return 0;
            }
            try {
                m a2 = l.a(context);
                try {
                    b.l.a.c.h.f.a e2 = a2.e();
                    Objects.requireNonNull(e2, "null reference");
                    a.f = e2;
                    d i2 = a2.i();
                    if (a.f2579g == null) {
                        Objects.requireNonNull(i2, "null reference");
                        a.f2579g = i2;
                    }
                    a = true;
                    return 0;
                } catch (RemoteException e3) {
                    throw new b.l.a.c.h.g.d(e3);
                }
            } catch (g e4) {
                return e4.f2600h;
            }
        }
    }
}
