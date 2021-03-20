package b.l.a.c.i.b;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.FutureTask;

public final class g4<V> extends FutureTask<V> implements Comparable<g4<V>> {

    /* renamed from: h  reason: collision with root package name */
    public final long f4010h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f4011i;

    /* renamed from: j  reason: collision with root package name */
    public final String f4012j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ i4 f4013k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g4(i4 i4Var, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f4013k = i4Var;
        long andIncrement = i4.f4049k.getAndIncrement();
        this.f4010h = andIncrement;
        this.f4012j = str;
        this.f4011i = z;
        if (andIncrement == RecyclerView.FOREVER_NS) {
            i4Var.a.a().f.a("Tasks index overflow");
        }
    }

    public final int compareTo(@NonNull Object obj) {
        g4 g4Var = (g4) obj;
        boolean z = this.f4011i;
        if (z != g4Var.f4011i) {
            return !z ? 1 : -1;
        }
        int i2 = (this.f4010h > g4Var.f4010h ? 1 : (this.f4010h == g4Var.f4010h ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        if (i2 > 0) {
            return 1;
        }
        this.f4013k.a.a().f4089g.b("Two tasks share the same index. index", Long.valueOf(this.f4010h));
        return 0;
    }

    public final void setException(Throwable th) {
        this.f4013k.a.a().f.b(this.f4012j, th);
        super.setException(th);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [b.l.a.c.i.b.i4, b.l.a.c.i.b.f5, java.util.concurrent.Callable<V>] */
    /* JADX WARNING: type inference failed for: r4v0, types: [boolean, java.util.concurrent.Callable] */
    /* JADX WARNING: type inference failed for: r5v0, types: [boolean, java.lang.String] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g4(java.util.concurrent.Callable<V> r3, boolean r4, java.lang.String r5) {
        /*
            r2 = this;
            r2.f4013k = r3
            r2.<init>(r4)
            java.util.concurrent.atomic.AtomicLong r4 = b.l.a.c.i.b.i4.f4049k
            long r0 = r4.getAndIncrement()
            r2.f4010h = r0
            java.lang.String r4 = "Task exception on worker thread"
            r2.f4012j = r4
            r2.f4011i = r5
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0029
            b.l.a.c.i.b.l4 r3 = r3.a
            b.l.a.c.i.b.k3 r3 = r3.a()
            b.l.a.c.i.b.i3 r3 = r3.f
            java.lang.String r4 = "Tasks index overflow"
            r3.a(r4)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.g4.<init>(b.l.a.c.i.b.i4, java.util.concurrent.Callable, boolean):void");
    }
}
