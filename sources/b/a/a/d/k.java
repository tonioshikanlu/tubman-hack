package b.a.a.d;

import b.a.a.e.a;
import b.l.a.d.a.i.b;

public final class k implements b {
    public final /* synthetic */ m a;

    public k(m mVar) {
        this.a = mVar;
    }

    public final void b(Exception exc) {
        String str;
        a aVar = a.f235b;
        a.a("App Review Failed", this.a.c);
        Object[] objArr = new Object[2];
        if (exc == null || (str = exc.getLocalizedMessage()) == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = Integer.valueOf(this.a.c);
        q.a.a.d.b("In-App Review Failed: %s. App Sessions = %d", objArr);
    }
}
