package b.l.a.c.i.b;

import android.os.Bundle;
import android.os.RemoteException;
import b.l.a.c.f.i.tb;
import java.util.ArrayList;
import java.util.Objects;

public final class s7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f4264h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f4265i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ p9 f4266j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ tb f4267k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ b8 f4268l;

    public s7(b8 b8Var, String str, String str2, p9 p9Var, tb tbVar) {
        this.f4268l = b8Var;
        this.f4264h = str;
        this.f4265i = str2;
        this.f4266j = p9Var;
        this.f4267k = tbVar;
    }

    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            b8 b8Var = this.f4268l;
            a3 a3Var = b8Var.d;
            if (a3Var == null) {
                b8Var.a.a().f.c("Failed to get conditional properties; not connected to service", this.f4264h, this.f4265i);
            } else {
                Objects.requireNonNull(this.f4266j, "null reference");
                arrayList = k9.W(a3Var.r(this.f4264h, this.f4265i, this.f4266j));
                this.f4268l.s();
            }
        } catch (RemoteException e2) {
            this.f4268l.a.a().f.d("Failed to get conditional properties; remote exception", this.f4264h, this.f4265i, e2);
        } catch (Throwable th) {
            this.f4268l.a.t().V(this.f4267k, arrayList);
            throw th;
        }
        this.f4268l.a.t().V(this.f4267k, arrayList);
    }
}
