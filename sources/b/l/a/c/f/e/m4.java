package b.l.a.c.f.e;

import java.security.InvalidAlgorithmParameterException;

public final class m4 extends g2<q7, o7> {
    public m4(n4 n4Var, Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ void a(e0 e0Var) {
        q7 q7Var = (q7) e0Var;
        if (q7Var.s() != 64) {
            int s = q7Var.s();
            StringBuilder sb = new StringBuilder(61);
            sb.append("invalid key size: ");
            sb.append(s);
            sb.append(". Valid keys must have 64 bytes.");
            throw new InvalidAlgorithmParameterException(sb.toString());
        }
    }

    public final /* bridge */ /* synthetic */ e0 b(um umVar) {
        return q7.t(umVar, fn.a());
    }

    public final Object c(e0 e0Var) {
        n7 v = o7.v();
        byte[] a = ub.a(((q7) e0Var).s());
        um J = um.J(a, 0, a.length);
        if (v.f3216j) {
            v.a();
            v.f3216j = false;
        }
        ((o7) v.f3215i).zze = J;
        if (v.f3216j) {
            v.a();
            v.f3216j = false;
        }
        ((o7) v.f3215i).zzb = 0;
        return (o7) v.c();
    }
}
