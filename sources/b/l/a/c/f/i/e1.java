package b.l.a.c.f.i;

public final class e1 extends p5<e1, d1> implements r6 {
    /* access modifiers changed from: private */
    public static final e1 zzg;
    private int zza;
    private String zze = "";
    private String zzf = "";

    static {
        e1 e1Var = new e1();
        zzg = e1Var;
        p5.q(e1.class, e1Var);
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new z6(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zza", "zze", "zzf"});
        } else if (i3 == 3) {
            return new e1();
        } else {
            if (i3 == 4) {
                return new d1();
            }
            if (i3 != 5) {
                return null;
            }
            return zzg;
        }
    }

    public final String s() {
        return this.zze;
    }

    public final String t() {
        return this.zzf;
    }
}
