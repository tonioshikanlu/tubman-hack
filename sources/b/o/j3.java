package b.o;

public final class j3 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ l3 f6163h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f6164i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f6165j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Throwable f6166k;

    public j3(l3 l3Var, int i2, String str, Throwable th) {
        this.f6163h = l3Var;
        this.f6164i = i2;
        this.f6165j = str;
        this.f6166k = th;
    }

    public void run() {
        this.f6163h.a(this.f6164i, this.f6165j, this.f6166k);
    }
}
