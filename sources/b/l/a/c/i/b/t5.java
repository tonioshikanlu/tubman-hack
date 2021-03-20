package b.l.a.c.i.b;

public final class t5 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f4277h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f4278i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f4279j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ long f4280k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ m6 f4281l;

    public t5(m6 m6Var, String str, String str2, Object obj, long j2) {
        this.f4281l = m6Var;
        this.f4277h = str;
        this.f4278i = str2;
        this.f4279j = obj;
        this.f4280k = j2;
    }

    public final void run() {
        this.f4281l.m(this.f4277h, this.f4278i, this.f4279j, this.f4280k);
    }
}
