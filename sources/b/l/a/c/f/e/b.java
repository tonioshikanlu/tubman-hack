package b.l.a.c.f.e;

public final class b extends w0 {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ bi f2856m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(w1 w1Var, CharSequence charSequence, bi biVar) {
        super(w1Var, charSequence);
        this.f2856m = biVar;
    }

    public final int a(int i2) {
        if (this.f2856m.a.find(i2)) {
            return this.f2856m.a.start();
        }
        return -1;
    }

    public final int b(int i2) {
        return this.f2856m.a.end();
    }
}
