package b.l.a.c.i.b;

import android.os.RemoteException;
import b.l.a.c.f.i.tb;

public final class l7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ s f4126h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f4127i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ tb f4128j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ b8 f4129k;

    public l7(b8 b8Var, s sVar, String str, tb tbVar) {
        this.f4129k = b8Var;
        this.f4126h = sVar;
        this.f4127i = str;
        this.f4128j = tbVar;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            b8 b8Var = this.f4129k;
            a3 a3Var = b8Var.d;
            if (a3Var == null) {
                b8Var.a.a().f.a("Discarding data. Failed to send event to service to bundle");
            } else {
                bArr = a3Var.l1(this.f4126h, this.f4127i);
                this.f4129k.s();
            }
        } catch (RemoteException e2) {
            this.f4129k.a.a().f.b("Failed to send event to the service to bundle", e2);
        } catch (Throwable th) {
            this.f4129k.a.t().S(this.f4128j, bArr);
            throw th;
        }
        this.f4129k.a.t().S(this.f4128j, bArr);
    }
}
