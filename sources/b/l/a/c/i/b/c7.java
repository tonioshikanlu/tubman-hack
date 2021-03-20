package b.l.a.c.i.b;

import android.os.Bundle;
import android.os.RemoteException;
import b.l.a.c.f.i.tb;
import java.util.List;
import java.util.Objects;

public final class c7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f3949h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f3950i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ p9 f3951j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f3952k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ tb f3953l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ b8 f3954m;

    public c7(b8 b8Var, String str, String str2, p9 p9Var, boolean z, tb tbVar) {
        this.f3954m = b8Var;
        this.f3949h = str;
        this.f3950i = str2;
        this.f3951j = p9Var;
        this.f3952k = z;
        this.f3953l = tbVar;
    }

    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e2;
        Bundle bundle2 = new Bundle();
        try {
            b8 b8Var = this.f3954m;
            a3 a3Var = b8Var.d;
            if (a3Var == null) {
                b8Var.a.a().f.c("Failed to get user properties; not connected to service", this.f3949h, this.f3950i);
                this.f3954m.a.t().U(this.f3953l, bundle2);
                return;
            }
            Objects.requireNonNull(this.f3951j, "null reference");
            List<g9> O0 = a3Var.O0(this.f3949h, this.f3950i, this.f3952k, this.f3951j);
            bundle = new Bundle();
            if (O0 != null) {
                for (g9 next : O0) {
                    String str = next.f4024l;
                    if (str != null) {
                        bundle.putString(next.f4021i, str);
                    } else {
                        Long l2 = next.f4023k;
                        if (l2 != null) {
                            bundle.putLong(next.f4021i, l2.longValue());
                        } else {
                            Double d = next.f4026n;
                            if (d != null) {
                                bundle.putDouble(next.f4021i, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.f3954m.s();
                this.f3954m.a.t().U(this.f3953l, bundle);
            } catch (RemoteException e3) {
                e2 = e3;
                try {
                    this.f3954m.a.a().f.c("Failed to get user properties; remote exception", this.f3949h, e2);
                    this.f3954m.a.t().U(this.f3953l, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.f3954m.a.t().U(this.f3953l, bundle2);
                    throw th;
                }
            }
        } catch (RemoteException e4) {
            bundle = bundle2;
            e2 = e4;
            this.f3954m.a.a().f.c("Failed to get user properties; remote exception", this.f3949h, e2);
            this.f3954m.a.t().U(this.f3953l, bundle);
        } catch (Throwable th3) {
            th = th3;
            this.f3954m.a.t().U(this.f3953l, bundle2);
            throw th;
        }
    }
}
