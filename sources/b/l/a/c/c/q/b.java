package b.l.a.c.c.q;

import android.content.Context;

public class b {

    /* renamed from: b  reason: collision with root package name */
    public static b f2827b = new b();
    public a a = null;

    public static a a(Context context) {
        a aVar;
        b bVar = f2827b;
        synchronized (bVar) {
            if (bVar.a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                bVar.a = new a(context);
            }
            aVar = bVar.a;
        }
        return aVar;
    }
}
