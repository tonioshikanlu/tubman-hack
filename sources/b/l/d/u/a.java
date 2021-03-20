package b.l.d.u;

import android.content.Context;
import b.l.d.w.b;

public final /* synthetic */ class a implements b {
    public final Context a;

    public a(Context context) {
        this.a = context;
    }

    public Object get() {
        g gVar;
        Context context = this.a;
        int i2 = d.f5294b;
        g gVar2 = g.f5301b;
        synchronized (g.class) {
            if (g.f5301b == null) {
                g.f5301b = new g(context);
            }
            gVar = g.f5301b;
        }
        return gVar;
    }
}
