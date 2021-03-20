package b.l.a.c.f.e;

import java.util.Objects;

public final class o8 extends e<o8, n8> implements f0 {
    /* access modifiers changed from: private */
    public static final o8 zzg;
    private int zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public um zzf = um.f3344i;

    static {
        o8 o8Var = new o8();
        zzg = o8Var;
        e.r(o8.class, o8Var);
    }

    public static n8 v() {
        return (n8) zzg.i();
    }

    public static o8 w() {
        return zzg;
    }

    public static void y(o8 o8Var, p8 p8Var) {
        Objects.requireNonNull(p8Var);
        if (p8Var != p8.UNRECOGNIZED) {
            o8Var.zzb = p8Var.f3225h;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzg, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzb", "zze", "zzf"});
        } else if (i3 == 3) {
            return new o8();
        } else {
            if (i3 == 4) {
                return new n8((m8) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zzg;
        }
    }

    public final p8 s() {
        int i2 = this.zzb;
        p8 p8Var = i2 != 0 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : p8.CURVE25519 : p8.NIST_P521 : p8.NIST_P384 : p8.NIST_P256 : p8.UNKNOWN_CURVE;
        return p8Var == null ? p8.UNRECOGNIZED : p8Var;
    }

    public final t8 t() {
        t8 d = t8.d(this.zze);
        return d == null ? t8.UNRECOGNIZED : d;
    }

    public final um u() {
        return this.zzf;
    }
}
