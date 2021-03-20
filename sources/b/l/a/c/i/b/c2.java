package b.l.a.c.i.b;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import b.l.a.c.f.e.am;
import java.util.Map;

public final class c2 extends b3 {

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Long> f3936b = new ArrayMap();
    public final Map<String, Integer> c = new ArrayMap();
    public long d;

    public c2(l4 l4Var) {
        super(l4Var);
    }

    public final void i(String str, long j2) {
        if (str == null || str.length() == 0) {
            this.a.a().f.a("Ad unit id must be a non-empty string");
        } else {
            this.a.d().q(new a(this, str, j2));
        }
    }

    public final void j(String str, long j2) {
        if (str == null || str.length() == 0) {
            this.a.a().f.a("Ad unit id must be a non-empty string");
        } else {
            this.a.d().q(new a0(this, str, j2));
        }
    }

    @WorkerThread
    public final void k(long j2) {
        t6 p2 = this.a.y().p(false);
        for (String next : this.f3936b.keySet()) {
            m(next, j2 - this.f3936b.get(next).longValue(), p2);
        }
        if (!this.f3936b.isEmpty()) {
            l(j2 - this.d, p2);
        }
        n(j2);
    }

    @WorkerThread
    public final void l(long j2, t6 t6Var) {
        if (t6Var == null) {
            this.a.a().f4096n.a("Not logging ad exposure. No active activity");
        } else if (j2 < 1000) {
            this.a.a().f4096n.b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j2);
            b7.r(t6Var, bundle, true);
            this.a.s().A(am.f2847m, "_xa", bundle);
        }
    }

    @WorkerThread
    public final void m(String str, long j2, t6 t6Var) {
        if (t6Var == null) {
            this.a.a().f4096n.a("Not logging ad unit exposure. No active activity");
        } else if (j2 < 1000) {
            this.a.a().f4096n.b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j2);
            b7.r(t6Var, bundle, true);
            this.a.s().A(am.f2847m, "_xu", bundle);
        }
    }

    @WorkerThread
    public final void n(long j2) {
        for (String put : this.f3936b.keySet()) {
            this.f3936b.put(put, Long.valueOf(j2));
        }
        if (!this.f3936b.isEmpty()) {
            this.d = j2;
        }
    }
}
