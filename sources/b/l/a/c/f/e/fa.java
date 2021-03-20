package b.l.a.c.f.e;

public final class fa extends e<fa, ea> implements f0 {
    /* access modifiers changed from: private */
    public static final fa zzf;
    /* access modifiers changed from: private */
    public int zzb;
    private ha zze;

    static {
        fa faVar = new fa();
        zzf = faVar;
        e.r(fa.class, faVar);
    }

    public static fa u(um umVar, fn fnVar) {
        return (fa) e.e(zzf, umVar, fnVar);
    }

    public static ea v() {
        return (ea) zzf.i();
    }

    public static /* synthetic */ void y(fa faVar, ha haVar) {
        haVar.getClass();
        faVar.zze = haVar;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzb", "zze"});
        } else if (i3 == 3) {
            return new fa();
        } else {
            if (i3 == 4) {
                return new ea((da) null);
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

    public final ha t() {
        ha haVar = this.zze;
        return haVar == null ? ha.v() : haVar;
    }
}
