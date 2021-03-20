package b.l.a.c.i.b;

public final class d5 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f3959h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f3960i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f3961j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ long f3962k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ e5 f3963l;

    public d5(e5 e5Var, String str, String str2, String str3, long j2) {
        this.f3963l = e5Var;
        this.f3959h = str;
        this.f3960i = str2;
        this.f3961j = str3;
        this.f3962k = j2;
    }

    public final void run() {
        if (this.f3959h == null) {
            this.f3963l.a.f3979j.y().s(this.f3960i, (t6) null);
            return;
        }
        b7 y = this.f3963l.a.f3979j.y();
        String str = this.f3960i;
        y.h();
        synchronized (y) {
            String str2 = y.f3931m;
            if (str2 != null) {
                boolean equals = str2.equals(str);
            }
            y.f3931m = str;
        }
    }
}
