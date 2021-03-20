package b.l.a.c.c;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import b.l.a.c.c.m.m0;
import b.l.a.c.c.m.n0;
import b.l.a.c.c.m.o0;
import b.l.a.c.d.d;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Objects;

public final class t {
    public static volatile n0 a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f2828b = new Object();
    public static Context c;

    public static c0 a(String str, u uVar, boolean z, boolean z2) {
        n0 n0Var;
        try {
            if (a == null) {
                Objects.requireNonNull(c, "null reference");
                synchronized (f2828b) {
                    if (a == null) {
                        IBinder b2 = DynamiteModule.c(c, DynamiteModule.f7282k, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                        int i2 = m0.a;
                        if (b2 == null) {
                            n0Var = null;
                        } else {
                            IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                            n0Var = queryLocalInterface instanceof n0 ? (n0) queryLocalInterface : new o0(b2);
                        }
                        a = n0Var;
                    }
                }
            }
            Objects.requireNonNull(c, "null reference");
            try {
                if (a.F0(new a0(str, uVar, z, z2), new d(c.getPackageManager()))) {
                    return c0.d;
                }
                return new e0(new v(z, str, uVar), (f0) null);
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return new c0(false, "module call", e2);
            }
        } catch (DynamiteModule.a e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            String valueOf = String.valueOf(e3.getMessage());
            return new c0(false, valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e3);
        }
    }
}
