package b.l.a.d.a.b;

public final /* synthetic */ class o0 implements u0 {
    public final v0 a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4589b;
    public final /* synthetic */ int c = 0;

    public o0(v0 v0Var, int i2) {
        this.a = v0Var;
        this.f4589b = i2;
    }

    public o0(v0 v0Var, int i2, byte[] bArr) {
        this.a = v0Var;
        this.f4589b = i2;
    }

    public final Object a() {
        if (this.c != 0) {
            this.a.c(this.f4589b).c.c = 5;
            return null;
        }
        v0 v0Var = this.a;
        int i2 = this.f4589b;
        s0 c2 = v0Var.c(i2);
        if (e1.e(c2.c.c)) {
            t tVar = v0Var.a;
            r0 r0Var = c2.c;
            String str = r0Var.a;
            int i3 = c2.f4621b;
            long j2 = r0Var.f4617b;
            if (tVar.e(str, i3, j2).exists()) {
                t.h(tVar.e(str, i3, j2));
            }
            r0 r0Var2 = c2.c;
            int i4 = r0Var2.c;
            if (i4 == 5 || i4 == 6) {
                t tVar2 = v0Var.a;
                String str2 = r0Var2.a;
                int i5 = c2.f4621b;
                long j3 = r0Var2.f4617b;
                if (tVar2.j(str2, i5, j3).exists()) {
                    t.h(tVar2.j(str2, i5, j3));
                }
            }
            return null;
        }
        throw new g0(String.format("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i2)}), i2);
    }
}
