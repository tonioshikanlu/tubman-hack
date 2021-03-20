package b.l.a.c.f.e;

import java.util.List;

public final class s9 extends e<s9, p9> implements f0 {
    /* access modifiers changed from: private */
    public static final s9 zzf;
    /* access modifiers changed from: private */
    public int zzb;
    private i<r9> zze = m0.f3159k;

    static {
        s9 s9Var = new s9();
        zzf = s9Var;
        e.r(s9.class, s9Var);
    }

    public static void A(s9 s9Var, r9 r9Var) {
        r9Var.getClass();
        i<r9> iVar = s9Var.zze;
        if (!iVar.a()) {
            int size = iVar.size();
            s9Var.zze = iVar.h(size == 0 ? 10 : size + size);
        }
        s9Var.zze.add(r9Var);
    }

    public static s9 w(byte[] bArr, fn fnVar) {
        return (s9) e.f(zzf, bArr, fnVar);
    }

    public static p9 x() {
        return (p9) zzf.i();
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzb", "zze", r9.class});
        } else if (i3 == 3) {
            return new s9();
        } else {
            if (i3 == 4) {
                return new p9((o9) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzf;
        }
    }

    public final int s() {
        return this.zzb;
    }

    public final List<r9> t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final r9 v(int i2) {
        return this.zze.get(i2);
    }
}
