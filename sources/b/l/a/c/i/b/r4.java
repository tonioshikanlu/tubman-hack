package b.l.a.c.i.b;

import java.util.List;
import java.util.concurrent.Callable;

public final class r4 implements Callable<List<b>> {
    public final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f4239b;
    public final /* synthetic */ String c;
    public final /* synthetic */ e5 d;

    public r4(e5 e5Var, String str, String str2, String str3) {
        this.d = e5Var;
        this.a = str;
        this.f4239b = str2;
        this.c = str3;
    }

    public final /* synthetic */ Object call() {
        this.d.a.n();
        return this.d.a.L().J(this.a, this.f4239b, this.c);
    }
}
