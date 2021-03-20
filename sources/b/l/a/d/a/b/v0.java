package b.l.a.d.a.b;

import android.os.Bundle;
import b.l.a.d.a.e.c0;
import b.l.a.d.a.e.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

public final class v0 {

    /* renamed from: g  reason: collision with root package name */
    public static final f f4637g = new f("ExtractorSessionStoreView");
    public final t a;

    /* renamed from: b  reason: collision with root package name */
    public final c0<n2> f4638b;
    public final k0 c;
    public final c0<Executor> d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Integer, s0> f4639e = new HashMap();
    public final ReentrantLock f = new ReentrantLock();

    public v0(t tVar, c0<n2> c0Var, k0 k0Var, c0<Executor> c0Var2) {
        this.a = tVar;
        this.f4638b = c0Var;
        this.c = k0Var;
        this.d = c0Var2;
    }

    public static String d(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new g0("Session without pack received.");
    }

    public final void a(int i2) {
        b(new o0(this, i2));
    }

    public final <T> T b(u0<T> u0Var) {
        try {
            this.f.lock();
            return u0Var.a();
        } finally {
            this.f.unlock();
        }
    }

    public final s0 c(int i2) {
        Map<Integer, s0> map = this.f4639e;
        Integer valueOf = Integer.valueOf(i2);
        s0 s0Var = map.get(valueOf);
        if (s0Var != null) {
            return s0Var;
        }
        throw new g0(String.format("Could not find session %d while trying to get it", new Object[]{valueOf}), i2);
    }
}
