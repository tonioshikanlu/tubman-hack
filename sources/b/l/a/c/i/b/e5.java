package b.l.a.c.i.b;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.BinderThread;
import b.l.a.c.b.a;
import b.l.a.c.c.i;
import b.l.a.c.c.j;
import b.l.a.c.c.p.c;
import b.l.a.c.f.i.t8;
import com.amplitude.api.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class e5 extends z2 {
    public final d9 a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f3991b;
    public String c = null;

    public e5(d9 d9Var) {
        Objects.requireNonNull(d9Var, "null reference");
        this.a = d9Var;
    }

    @BinderThread
    public final void B0(p9 p9Var) {
        n(p9Var);
        k(new c5(this, p9Var));
    }

    @BinderThread
    public final void C0(b bVar, p9 p9Var) {
        Objects.requireNonNull(bVar, "null reference");
        Objects.requireNonNull(bVar.f3913j, "null reference");
        n(p9Var);
        b bVar2 = new b(bVar);
        bVar2.f3911h = p9Var.f4218h;
        k(new n4(this, bVar2, p9Var));
    }

    @BinderThread
    public final void D(p9 p9Var) {
        t8.b();
        if (this.a.f3979j.f4114g.r((String) null, x2.y0)) {
            a.x(p9Var.f4218h);
            Objects.requireNonNull(p9Var.C, "null reference");
            v4 v4Var = new v4(this, p9Var);
            if (this.a.d().o()) {
                v4Var.run();
            } else {
                this.a.d().s(v4Var);
            }
        }
    }

    @BinderThread
    public final void D0(long j2, String str, String str2, String str3) {
        k(new d5(this, str2, str3, str, j2));
    }

    @BinderThread
    public final void K(p9 p9Var) {
        n(p9Var);
        k(new u4(this, p9Var));
    }

    @BinderThread
    public final List<g9> O0(String str, String str2, boolean z, p9 p9Var) {
        n(p9Var);
        String str3 = p9Var.f4218h;
        Objects.requireNonNull(str3, "null reference");
        try {
            List<i9> list = (List) ((FutureTask) this.a.d().p(new p4(this, str3, str, str2))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (i9 i9Var : list) {
                if (z || !k9.F(i9Var.c)) {
                    arrayList.add(new g9(i9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.a.a().f.c("Failed to query user properties. appId", k3.t(p9Var.f4218h), e2);
            return Collections.emptyList();
        }
    }

    @BinderThread
    public final String Q(p9 p9Var) {
        n(p9Var);
        d9 d9Var = this.a;
        try {
            return (String) ((FutureTask) d9Var.f3979j.d().p(new y8(d9Var, p9Var))).get(Constants.EVENT_UPLOAD_PERIOD_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            d9Var.f3979j.a().f.c("Failed to get app instance id. appId", k3.t(p9Var.f4218h), e2);
            return null;
        }
    }

    @BinderThread
    public final List<b> R0(String str, String str2, String str3) {
        o(str, true);
        try {
            return (List) ((FutureTask) this.a.d().p(new s4(this, str, str2, str3))).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.a.a().f.b("Failed to get conditional user properties as", e2);
            return Collections.emptyList();
        }
    }

    @BinderThread
    public final void S(g9 g9Var, p9 p9Var) {
        Objects.requireNonNull(g9Var, "null reference");
        n(p9Var);
        k(new z4(this, g9Var, p9Var));
    }

    @BinderThread
    public final void U0(p9 p9Var) {
        a.x(p9Var.f4218h);
        o(p9Var.f4218h, false);
        k(new t4(this, p9Var));
    }

    @BinderThread
    public final void Y0(s sVar, p9 p9Var) {
        Objects.requireNonNull(sVar, "null reference");
        n(p9Var);
        k(new w4(this, sVar, p9Var));
    }

    @BinderThread
    public final List<g9> b1(String str, String str2, String str3, boolean z) {
        o(str, true);
        try {
            List<i9> list = (List) ((FutureTask) this.a.d().p(new q4(this, str, str2, str3))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (i9 i9Var : list) {
                if (z || !k9.F(i9Var.c)) {
                    arrayList.add(new g9(i9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.a.a().f.c("Failed to get user properties as. appId", k3.t(str), e2);
            return Collections.emptyList();
        }
    }

    @BinderThread
    public final void c1(Bundle bundle, p9 p9Var) {
        n(p9Var);
        String str = p9Var.f4218h;
        Objects.requireNonNull(str, "null reference");
        k(new m4(this, str, bundle));
    }

    public final void k(Runnable runnable) {
        if (this.a.d().o()) {
            runnable.run();
        } else {
            this.a.d().q(runnable);
        }
    }

    @BinderThread
    public final byte[] l1(s sVar, String str) {
        a.x(str);
        Objects.requireNonNull(sVar, "null reference");
        o(str, true);
        this.a.a().f4095m.b("Log and bundle. event", this.a.Q().p(sVar.f4248h));
        Objects.requireNonNull((c) this.a.f3979j.f4121n);
        long nanoTime = System.nanoTime() / 1000000;
        i4 d = this.a.d();
        y4 y4Var = new y4(this, sVar, str);
        d.l();
        g4 g4Var = new g4(d, y4Var, true);
        if (Thread.currentThread() == d.c) {
            g4Var.run();
        } else {
            d.u(g4Var);
        }
        try {
            byte[] bArr = (byte[]) g4Var.get();
            if (bArr == null) {
                this.a.a().f.b("Log and bundle returned null. appId", k3.t(str));
                bArr = new byte[0];
            }
            Objects.requireNonNull((c) this.a.f3979j.f4121n);
            this.a.a().f4095m.d("Log and bundle processed. event, size, time_ms", this.a.Q().p(sVar.f4248h), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e2) {
            this.a.a().f.d("Failed to log and bundle. appId, event, error", k3.t(str), this.a.Q().p(sVar.f4248h), e2);
            return null;
        }
    }

    @BinderThread
    public final void n(p9 p9Var) {
        Objects.requireNonNull(p9Var, "null reference");
        a.x(p9Var.f4218h);
        o(p9Var.f4218h, false);
        this.a.f3979j.t().o(p9Var.f4219i, p9Var.x, p9Var.B);
    }

    @BinderThread
    public final void o(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f3991b == null) {
                        if (!"com.google.android.gms".equals(this.c) && !a.e0(this.a.f3979j.a, Binder.getCallingUid())) {
                            if (!j.a(this.a.f3979j.a).b(Binder.getCallingUid())) {
                                z2 = false;
                                this.f3991b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f3991b = Boolean.valueOf(z2);
                    }
                    if (this.f3991b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e2) {
                    this.a.a().f.b("Measurement Service called with invalid calling package. appId", k3.t(str));
                    throw e2;
                }
            }
            if (this.c == null) {
                Context context = this.a.f3979j.a;
                int callingUid = Binder.getCallingUid();
                boolean z3 = i.a;
                if (a.B0(context, callingUid, str)) {
                    this.c = str;
                }
            }
            if (!str.equals(this.c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.a.a().f.a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @BinderThread
    public final List<b> r(String str, String str2, p9 p9Var) {
        n(p9Var);
        String str3 = p9Var.f4218h;
        Objects.requireNonNull(str3, "null reference");
        try {
            return (List) ((FutureTask) this.a.d().p(new r4(this, str3, str, str2))).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.a.a().f.b("Failed to get conditional user properties", e2);
            return Collections.emptyList();
        }
    }
}
