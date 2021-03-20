package b.l.d.n;

import android.os.Bundle;
import androidx.annotation.Nullable;
import b.l.a.c.f.i.c;
import b.l.a.c.f.i.d;
import b.l.a.c.f.i.f0;
import b.l.a.c.f.i.g;
import b.l.a.c.f.i.h;
import b.l.a.c.f.i.i;
import b.l.a.c.f.i.j;
import b.l.a.c.f.i.k;
import b.l.a.c.f.i.l;
import b.l.a.c.f.i.m;
import b.l.a.c.f.i.n;
import b.l.a.c.f.i.q;
import b.l.a.c.f.i.r9;
import b.l.a.c.i.b.n6;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

public final class b implements n6 {
    public final /* synthetic */ f0 a;

    public b(f0 f0Var) {
        this.a = f0Var;
    }

    public final void a(String str, @Nullable String str2, @Nullable Bundle bundle) {
        f0 f0Var = this.a;
        Objects.requireNonNull(f0Var);
        f0Var.c.execute(new c(f0Var, str, str2, bundle));
    }

    public final List<Bundle> b(@Nullable String str, @Nullable String str2) {
        f0 f0Var = this.a;
        Objects.requireNonNull(f0Var);
        r9 r9Var = new r9();
        f0Var.c.execute(new d(f0Var, str, str2, r9Var));
        List<Bundle> list = (List) r9.o(r9Var.n(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final void c(Bundle bundle) {
        f0 f0Var = this.a;
        Objects.requireNonNull(f0Var);
        f0Var.c.execute(new b.l.a.c.f.i.b(f0Var, bundle));
    }

    public final int d(String str) {
        f0 f0Var = this.a;
        Objects.requireNonNull(f0Var);
        r9 r9Var = new r9();
        f0Var.c.execute(new q(f0Var, str, r9Var));
        Integer num = (Integer) r9.o(r9Var.n(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final Map<String, Object> e(@Nullable String str, @Nullable String str2, boolean z) {
        f0 f0Var = this.a;
        Objects.requireNonNull(f0Var);
        r9 r9Var = new r9();
        f0Var.c.execute(new n(f0Var, str, str2, z, r9Var));
        Bundle n2 = r9Var.n(5000);
        if (n2 == null || n2.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(n2.size());
        for (String str3 : n2.keySet()) {
            Object obj = n2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final String f() {
        f0 f0Var = this.a;
        Objects.requireNonNull(f0Var);
        r9 r9Var = new r9();
        f0Var.c.execute(new j(f0Var, r9Var));
        return r9Var.k(50);
    }

    public final String g() {
        f0 f0Var = this.a;
        Objects.requireNonNull(f0Var);
        r9 r9Var = new r9();
        f0Var.c.execute(new m(f0Var, r9Var));
        return r9Var.k(500);
    }

    public final String h() {
        f0 f0Var = this.a;
        Objects.requireNonNull(f0Var);
        r9 r9Var = new r9();
        f0Var.c.execute(new i(f0Var, r9Var));
        return r9Var.k(500);
    }

    public final void i(String str, String str2, Bundle bundle) {
        this.a.e(str, str2, bundle);
    }

    public final long j() {
        f0 f0Var = this.a;
        Objects.requireNonNull(f0Var);
        r9 r9Var = new r9();
        f0Var.c.execute(new k(f0Var, r9Var));
        Long l2 = (Long) r9.o(r9Var.n(500), Long.class);
        if (l2 != null) {
            return l2.longValue();
        }
        long nanoTime = System.nanoTime();
        Objects.requireNonNull((b.l.a.c.c.p.c) f0Var.f3547b);
        long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
        int i2 = f0Var.f + 1;
        f0Var.f = i2;
        return nextLong + ((long) i2);
    }

    public final void k(String str) {
        f0 f0Var = this.a;
        Objects.requireNonNull(f0Var);
        f0Var.c.execute(new h(f0Var, str));
    }

    public final void m(String str) {
        f0 f0Var = this.a;
        Objects.requireNonNull(f0Var);
        f0Var.c.execute(new g(f0Var, str));
    }

    public final String r() {
        f0 f0Var = this.a;
        Objects.requireNonNull(f0Var);
        r9 r9Var = new r9();
        f0Var.c.execute(new l(f0Var, r9Var));
        return r9Var.k(500);
    }
}
