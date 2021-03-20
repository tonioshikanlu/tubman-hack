package b.l.d.u;

import android.content.Context;
import androidx.annotation.NonNull;
import b.l.d.p.x;
import b.l.d.u.f;
import b.l.d.w.b;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class d implements f {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f5294b = 0;
    public b<g> a;

    public d(Context context, Set<e> set) {
        x xVar = new x(new a(context));
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), c.a);
        this.a = xVar;
    }

    @NonNull
    public f.a a(@NonNull String str) {
        boolean a2;
        long currentTimeMillis = System.currentTimeMillis();
        boolean a3 = this.a.get().a(str, currentTimeMillis);
        g gVar = this.a.get();
        synchronized (gVar) {
            a2 = gVar.a("fire-global", currentTimeMillis);
        }
        if (a3 && a2) {
            return f.a.COMBINED;
        }
        if (a2) {
            return f.a.GLOBAL;
        }
        return a3 ? f.a.SDK : f.a.NONE;
    }
}
