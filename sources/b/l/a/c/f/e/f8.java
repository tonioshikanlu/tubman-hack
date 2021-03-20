package b.l.a.c.f.e;

import java.util.Objects;

public final class f8 extends e<f8, e8> implements f0 {
    /* access modifiers changed from: private */
    public static final f8 zzg;
    private o8 zzb;
    private z7 zze;
    private int zzf;

    static {
        f8 f8Var = new f8();
        zzg = f8Var;
        e.r(f8.class, f8Var);
    }

    public static void A(f8 f8Var, w7 w7Var) {
        Objects.requireNonNull(w7Var);
        if (w7Var != w7.UNRECOGNIZED) {
            f8Var.zzf = w7Var.f3379h;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static e8 v() {
        return (e8) zzg.i();
    }

    public static f8 w() {
        return zzg;
    }

    public static /* synthetic */ void y(f8 f8Var, o8 o8Var) {
        o8Var.getClass();
        f8Var.zzb = o8Var;
    }

    public static /* synthetic */ void z(f8 f8Var, z7 z7Var) {
        z7Var.getClass();
        f8Var.zze = z7Var;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        } else if (i3 == 3) {
            return new f8();
        } else {
            if (i3 == 4) {
                return new e8((d8) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzg;
        }
    }

    public final o8 s() {
        o8 o8Var = this.zzb;
        return o8Var == null ? o8.w() : o8Var;
    }

    public final z7 t() {
        z7 z7Var = this.zze;
        return z7Var == null ? z7.u() : z7Var;
    }

    public final w7 u() {
        int i2 = this.zzf;
        w7 w7Var = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : w7.DO_NOT_USE_CRUNCHY_UNCOMPRESSED : w7.COMPRESSED : w7.UNCOMPRESSED : w7.UNKNOWN_FORMAT;
        return w7Var == null ? w7.UNRECOGNIZED : w7Var;
    }
}
