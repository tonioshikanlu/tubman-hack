package b.l.a.c.f.e;

import java.util.Objects;

public final class h9 extends e<h9, e9> implements f0 {
    /* access modifiers changed from: private */
    public static final h9 zzg;
    /* access modifiers changed from: private */
    public String zzb = "";
    /* access modifiers changed from: private */
    public um zze = um.f3344i;
    private int zzf;

    static {
        h9 h9Var = new h9();
        zzg = h9Var;
        e.r(h9.class, h9Var);
    }

    public static void A(h9 h9Var, g9 g9Var) {
        Objects.requireNonNull(g9Var);
        if (g9Var != g9.UNRECOGNIZED) {
            h9Var.zzf = g9Var.f3008h;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static e9 v() {
        return (e9) zzg.i();
    }

    public static h9 w() {
        return zzg;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        } else if (i3 == 3) {
            return new h9();
        } else {
            if (i3 == 4) {
                return new e9((d9) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzg;
        }
    }

    public final String s() {
        return this.zzb;
    }

    public final um t() {
        return this.zze;
    }

    public final g9 u() {
        int i2 = this.zzf;
        g9 g9Var = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : g9.REMOTE : g9.ASYMMETRIC_PUBLIC : g9.ASYMMETRIC_PRIVATE : g9.SYMMETRIC : g9.UNKNOWN_KEYMATERIAL;
        return g9Var == null ? g9.UNRECOGNIZED : g9Var;
    }
}
