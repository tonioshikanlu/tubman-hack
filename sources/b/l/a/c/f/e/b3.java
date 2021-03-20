package b.l.a.c.f.e;

import java.nio.charset.Charset;

public final class b3 {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static x9 a(s9 s9Var) {
        u9 t = x9.t();
        int s = s9Var.s();
        if (t.f3216j) {
            t.a();
            t.f3216j = false;
        }
        ((x9) t.f3215i).zzb = s;
        for (r9 next : s9Var.t()) {
            v9 t2 = w9.t();
            String s2 = next.t().s();
            if (t2.f3216j) {
                t2.a();
                t2.f3216j = false;
            }
            w9.v((w9) t2.f3215i, s2);
            i9 u = next.u();
            if (t2.f3216j) {
                t2.a();
                t2.f3216j = false;
            }
            ((w9) t2.f3215i).zze = u.a();
            ia w = next.w();
            if (t2.f3216j) {
                t2.a();
                t2.f3216j = false;
            }
            ((w9) t2.f3215i).zzg = w.a();
            int v = next.v();
            if (t2.f3216j) {
                t2.a();
                t2.f3216j = false;
            }
            ((w9) t2.f3215i).zzf = v;
            w9 w9Var = (w9) t2.c();
            if (t.f3216j) {
                t.a();
                t.f3216j = false;
            }
            x9.w((x9) t.f3215i, w9Var);
        }
        return (x9) t.c();
    }
}
