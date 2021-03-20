package b.l.a.c.i.b;

import android.content.Intent;

public final /* synthetic */ class d8 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final h8 f3970h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3971i;

    /* renamed from: j  reason: collision with root package name */
    public final k3 f3972j;

    /* renamed from: k  reason: collision with root package name */
    public final Intent f3973k;

    public d8(h8 h8Var, int i2, k3 k3Var, Intent intent) {
        this.f3970h = h8Var;
        this.f3971i = i2;
        this.f3972j = k3Var;
        this.f3973k = intent;
    }

    public final void run() {
        h8 h8Var = this.f3970h;
        int i2 = this.f3971i;
        k3 k3Var = this.f3972j;
        Intent intent = this.f3973k;
        if (((g8) h8Var.a).a(i2)) {
            k3Var.f4096n.b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i2));
            h8Var.c().f4096n.a("Completed wakeful intent.");
            ((g8) h8Var.a).b(intent);
        }
    }
}
