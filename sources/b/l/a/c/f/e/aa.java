package b.l.a.c.f.e;

public final class aa extends e<aa, z9> implements f0 {
    /* access modifiers changed from: private */
    public static final aa zzf;
    /* access modifiers changed from: private */
    public int zzb;
    private ca zze;

    static {
        aa aaVar = new aa();
        zzf = aaVar;
        e.r(aa.class, aaVar);
    }

    public static aa u(um umVar, fn fnVar) {
        return (aa) e.e(zzf, umVar, fnVar);
    }

    public static z9 v() {
        return (z9) zzf.i();
    }

    public static /* synthetic */ void y(aa aaVar, ca caVar) {
        caVar.getClass();
        aaVar.zze = caVar;
    }

    public final Object h(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new n0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzb", "zze"});
        } else if (i3 == 3) {
            return new aa();
        } else {
            if (i3 == 4) {
                return new z9((y9) null);
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

    public final ca t() {
        ca caVar = this.zze;
        return caVar == null ? ca.u() : caVar;
    }
}
