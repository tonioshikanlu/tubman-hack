package b.l.a.c.f.e;

import android.content.Context;
import androidx.annotation.NonNull;
import b.l.a.c.b.a;
import b.l.d.d;
import b.l.d.o.e0.g0;
import b.l.d.o.e0.j0;
import b.l.d.o.e0.l0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class ci extends ug<xi> {

    /* renamed from: b  reason: collision with root package name */
    public final Context f2885b;
    public final xi c;
    public final Future<pg<xi>> d = a();

    public ci(Context context, xi xiVar) {
        this.f2885b = context;
        this.c = xiVar;
    }

    @NonNull
    public static j0 d(d dVar, lk lkVar) {
        Objects.requireNonNull(dVar, "null reference");
        Objects.requireNonNull(lkVar, "null reference");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new g0(lkVar, "firebase"));
        List<yk> list = lkVar.f3130m.f2846h;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                arrayList.add(new g0(list.get(i2)));
            }
        }
        j0 j0Var = new j0(dVar, arrayList);
        j0Var.f4986p = new l0(lkVar.f3134q, lkVar.f3133p);
        j0Var.f4987q = lkVar.r;
        j0Var.r = lkVar.s;
        j0Var.j0(a.G1(lkVar.t));
        return j0Var;
    }

    public final Future<pg<xi>> a() {
        Future<pg<xi>> future = this.d;
        if (future != null) {
            return future;
        }
        di diVar = new di(this.c, this.f2885b);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor).submit(diVar);
    }
}
