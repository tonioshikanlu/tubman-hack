package b.l.a.c.f.e;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import b.l.a.c.b.a;
import b.l.a.c.c.e;
import b.l.a.c.c.l.d;
import b.l.d.j;
import java.util.concurrent.Callable;

public final class di implements Callable<pg<xi>> {
    public final xi a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2918b;

    public di(xi xiVar, Context context) {
        this.a = xiVar;
        this.f2918b = context;
    }

    public final Object call() {
        Object obj = e.c;
        int b2 = e.d.b(this.f2918b, 12451000);
        Context context = this.f2918b;
        String str = this.a.f3403i;
        a.x(str);
        xi xiVar = new xi(str);
        xiVar.f3257h = true;
        b.l.a.c.c.l.a<xi> aVar = yi.c;
        j jVar = new j();
        a.B(jVar, "StatusExceptionMapper must not be null.");
        return new pg(new sg(context, aVar, xiVar, new d.a(jVar, (Account) null, Looper.getMainLooper())));
    }
}
