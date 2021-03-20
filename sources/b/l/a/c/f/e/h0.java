package b.l.a.c.f.e;

public final class h0<T> implements o0<T> {
    public final e0 a;

    /* renamed from: b  reason: collision with root package name */
    public final c1<?, ?> f3020b;
    public final boolean c;
    public final gn<?> d;

    public h0(c1<?, ?> c1Var, gn<?> gnVar, e0 e0Var) {
        this.f3020b = c1Var;
        this.c = gnVar.a(e0Var);
        this.d = gnVar;
        this.a = e0Var;
    }

    public final T a() {
        return ((on) this.a.p()).b();
    }

    public final void b(T t) {
        this.f3020b.m(t);
        this.d.d(t);
    }

    public final int c(T t) {
        c1<?, ?> c1Var = this.f3020b;
        int p2 = c1Var.p(c1Var.j(t));
        if (!this.c) {
            return p2;
        }
        this.d.b(t);
        throw null;
    }

    public final void d(T t, T t2) {
        c1<?, ?> c1Var = this.f3020b;
        Class<?> cls = q0.a;
        c1Var.i(t, c1Var.o(c1Var.j(t), c1Var.j(t2)));
        if (this.c) {
            this.d.b(t2);
            throw null;
        }
    }

    public final int e(T t) {
        int hashCode = this.f3020b.j(t).hashCode();
        if (!this.c) {
            return hashCode;
        }
        this.d.b(t);
        throw null;
    }

    public final boolean f(T t, T t2) {
        if (!this.f3020b.j(t).equals(this.f3020b.j(t2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        this.d.b(t);
        this.d.b(t2);
        throw null;
    }

    public final void g(T t, wm wmVar, fn fnVar) {
        boolean z;
        c1<?, ?> c1Var = this.f3020b;
        gn<?> gnVar = this.d;
        Object k2 = c1Var.k(t);
        kn<?> c2 = gnVar.c(t);
        while (wmVar.v() != Integer.MAX_VALUE) {
            int i2 = wmVar.f3390b;
            if (i2 != 11) {
                if ((i2 & 7) == 2) {
                    Object f = gnVar.f(fnVar, this.a, i2 >>> 3);
                    if (f != null) {
                        gnVar.g(wmVar, f, fnVar, c2);
                    } else {
                        z = c1Var.n(k2, wmVar);
                    }
                } else {
                    z = wmVar.w();
                }
                if (!z) {
                    c1Var.l(t, k2);
                    return;
                }
            } else {
                int i3 = 0;
                Object obj = null;
                um umVar = null;
                while (true) {
                    try {
                        if (wmVar.v() == Integer.MAX_VALUE) {
                            break;
                        }
                        int i4 = wmVar.f3390b;
                        if (i4 == 16) {
                            i3 = wmVar.D();
                            obj = gnVar.f(fnVar, this.a, i3);
                        } else if (i4 == 26) {
                            if (obj != null) {
                                gnVar.g(wmVar, obj, fnVar, c2);
                            } else {
                                umVar = wmVar.C();
                            }
                        } else if (!wmVar.w()) {
                            break;
                        }
                    } catch (Throwable th) {
                        c1Var.l(t, k2);
                        throw th;
                    }
                }
                if (wmVar.f3390b != 12) {
                    throw l.e();
                } else if (umVar != null) {
                    if (obj != null) {
                        gnVar.h(umVar, obj, fnVar, c2);
                    } else {
                        c1Var.e(k2, i3, umVar);
                    }
                }
            }
        }
        c1Var.l(t, k2);
    }

    public final void h(T t, cn cnVar) {
        this.d.b(t);
        throw null;
    }

    public final boolean i(T t) {
        this.d.b(t);
        throw null;
    }

    public final void j(T t, byte[] bArr, int i2, int i3, jm jmVar) {
        e eVar = (e) t;
        if (eVar.zzc == d1.f) {
            eVar.zzc = d1.a();
        }
        c cVar = (c) t;
        throw null;
    }
}
