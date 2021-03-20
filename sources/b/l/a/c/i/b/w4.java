package b.l.a.c.i.b;

import java.util.Objects;

public final class w4 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ s f4329h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ p9 f4330i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e5 f4331j;

    public w4(e5 e5Var, s sVar, p9 p9Var) {
        this.f4331j = e5Var;
        this.f4329h = sVar;
        this.f4330i = p9Var;
    }

    public final void run() {
        q qVar;
        e5 e5Var = this.f4331j;
        s sVar = this.f4329h;
        Objects.requireNonNull(e5Var);
        if (!(!"_cmp".equals(sVar.f4248h) || (qVar = sVar.f4249i) == null || qVar.f4228h.size() == 0)) {
            String string = sVar.f4249i.f4228h.getString("_cis");
            if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                e5Var.a.a().f4094l.b("Event has been filtered ", sVar.toString());
                sVar = new s("_cmpx", sVar.f4249i, sVar.f4250j, sVar.f4251k);
            }
        }
        this.f4331j.a.n();
        this.f4331j.a.g(sVar, this.f4330i);
    }
}
