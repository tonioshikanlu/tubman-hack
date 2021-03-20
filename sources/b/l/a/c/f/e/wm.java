package b.l.a.c.f.e;

import androidx.appcompat.widget.ActivityChooserView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

public final class wm {
    public final vm a;

    /* renamed from: b  reason: collision with root package name */
    public int f3390b;
    public int c;
    public int d = 0;

    public wm(vm vmVar) {
        Charset charset = j.a;
        this.a = vmVar;
        vmVar.f3363b = this;
    }

    public static final void t(int i2) {
        if ((i2 & 3) != 0) {
            throw l.f();
        }
    }

    public static final void u(int i2) {
        if ((i2 & 7) != 0) {
            throw l.f();
        }
    }

    public final String A() {
        p(2);
        vm vmVar = this.a;
        int e2 = vmVar.e();
        if (e2 > 0) {
            int i2 = vmVar.d;
            int i3 = vmVar.f;
            if (e2 <= i2 - i3) {
                String str = new String(vmVar.c, i3, e2, j.a);
                vmVar.f += e2;
                return str;
            }
        }
        if (e2 == 0) {
            return "";
        }
        if (e2 < 0) {
            throw l.b();
        }
        throw l.a();
    }

    public final String B() {
        p(2);
        vm vmVar = this.a;
        int e2 = vmVar.e();
        if (e2 > 0) {
            int i2 = vmVar.d;
            int i3 = vmVar.f;
            if (e2 <= i2 - i3) {
                String b2 = s1.a.b(vmVar.c, i3, e2);
                vmVar.f += e2;
                return b2;
            }
        }
        if (e2 == 0) {
            return "";
        }
        if (e2 <= 0) {
            throw l.b();
        }
        throw l.a();
    }

    public final um C() {
        p(2);
        vm vmVar = this.a;
        int e2 = vmVar.e();
        if (e2 > 0) {
            int i2 = vmVar.d;
            int i3 = vmVar.f;
            if (e2 <= i2 - i3) {
                um J = um.J(vmVar.c, i3, e2);
                vmVar.f += e2;
                return J;
            }
        }
        if (e2 == 0) {
            return um.f3344i;
        }
        if (e2 > 0) {
            int i4 = vmVar.d;
            int i5 = vmVar.f;
            if (e2 <= i4 - i5) {
                int i6 = e2 + i5;
                vmVar.f = i6;
                byte[] copyOfRange = Arrays.copyOfRange(vmVar.c, i5, i6);
                um umVar = um.f3344i;
                return new rm(copyOfRange);
            }
        }
        if (e2 <= 0) {
            throw l.b();
        }
        throw l.a();
    }

    public final int D() {
        p(0);
        return this.a.e();
    }

    public final void E(List<Double> list) {
        int a2;
        int a3;
        if (list instanceof dn) {
            dn dnVar = (dn) list;
            int i2 = this.f3390b & 7;
            if (i2 == 1) {
                do {
                    dnVar.e(Double.longBitsToDouble(this.a.i()));
                    if (!this.a.k()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f3390b);
                this.d = a3;
            } else if (i2 == 2) {
                int e2 = this.a.e();
                u(e2);
                int i3 = this.a.f + e2;
                do {
                    dnVar.e(Double.longBitsToDouble(this.a.i()));
                } while (this.a.f < i3);
            } else {
                int i4 = l.f3117h;
                throw new k();
            }
        } else {
            int i5 = this.f3390b & 7;
            if (i5 == 1) {
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(this.a.i())));
                    if (!this.a.k()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f3390b);
                this.d = a2;
            } else if (i5 == 2) {
                int e3 = this.a.e();
                u(e3);
                int i6 = this.a.f + e3;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(this.a.i())));
                } while (this.a.f < i6);
            } else {
                int i7 = l.f3117h;
                throw new k();
            }
        }
    }

    public final void F(List<Float> list) {
        int a2;
        int a3;
        if (list instanceof mn) {
            mn mnVar = (mn) list;
            int i2 = this.f3390b & 7;
            if (i2 == 2) {
                int e2 = this.a.e();
                t(e2);
                int i3 = this.a.f + e2;
                do {
                    mnVar.e(Float.intBitsToFloat(this.a.h()));
                } while (this.a.f < i3);
            } else if (i2 == 5) {
                do {
                    mnVar.e(Float.intBitsToFloat(this.a.h()));
                    if (!this.a.k()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f3390b);
                this.d = a3;
            } else {
                int i4 = l.f3117h;
                throw new k();
            }
        } else {
            int i5 = this.f3390b & 7;
            if (i5 == 2) {
                int e3 = this.a.e();
                t(e3);
                int i6 = this.a.f + e3;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(this.a.h())));
                } while (this.a.f < i6);
            } else if (i5 == 5) {
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(this.a.h())));
                    if (!this.a.k()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f3390b);
                this.d = a2;
            } else {
                int i7 = l.f3117h;
                throw new k();
            }
        }
    }

    public final void G(List<Long> list) {
        int a2;
        int a3;
        if (list instanceof t) {
            t tVar = (t) list;
            int i2 = this.f3390b & 7;
            if (i2 == 0) {
                do {
                    tVar.l(this.a.f());
                    if (!this.a.k()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f3390b);
                this.d = a3;
            } else if (i2 == 2) {
                int e2 = this.a.f + this.a.e();
                do {
                    tVar.l(this.a.f());
                } while (this.a.f < e2);
                s(e2);
            } else {
                int i3 = l.f3117h;
                throw new k();
            }
        } else {
            int i4 = this.f3390b & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(this.a.f()));
                    if (!this.a.k()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f3390b);
                this.d = a2;
            } else if (i4 == 2) {
                int e3 = this.a.f + this.a.e();
                do {
                    list.add(Long.valueOf(this.a.f()));
                } while (this.a.f < e3);
                s(e3);
            } else {
                int i5 = l.f3117h;
                throw new k();
            }
        }
    }

    public final void a(List<Long> list) {
        int a2;
        int a3;
        if (list instanceof t) {
            t tVar = (t) list;
            int i2 = this.f3390b & 7;
            if (i2 == 0) {
                do {
                    tVar.l(this.a.f());
                    if (!this.a.k()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f3390b);
                this.d = a3;
            } else if (i2 == 2) {
                int e2 = this.a.f + this.a.e();
                do {
                    tVar.l(this.a.f());
                } while (this.a.f < e2);
                s(e2);
            } else {
                int i3 = l.f3117h;
                throw new k();
            }
        } else {
            int i4 = this.f3390b & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(this.a.f()));
                    if (!this.a.k()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f3390b);
                this.d = a2;
            } else if (i4 == 2) {
                int e3 = this.a.f + this.a.e();
                do {
                    list.add(Long.valueOf(this.a.f()));
                } while (this.a.f < e3);
                s(e3);
            } else {
                int i5 = l.f3117h;
                throw new k();
            }
        }
    }

    public final void b(List<Integer> list) {
        int a2;
        int a3;
        if (list instanceof f) {
            f fVar = (f) list;
            int i2 = this.f3390b & 7;
            if (i2 == 0) {
                do {
                    fVar.l(this.a.e());
                    if (!this.a.k()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f3390b);
                this.d = a3;
            } else if (i2 == 2) {
                int e2 = this.a.f + this.a.e();
                do {
                    fVar.l(this.a.e());
                } while (this.a.f < e2);
                s(e2);
            } else {
                int i3 = l.f3117h;
                throw new k();
            }
        } else {
            int i4 = this.f3390b & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.e()));
                    if (!this.a.k()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f3390b);
                this.d = a2;
            } else if (i4 == 2) {
                int e3 = this.a.f + this.a.e();
                do {
                    list.add(Integer.valueOf(this.a.e()));
                } while (this.a.f < e3);
                s(e3);
            } else {
                int i5 = l.f3117h;
                throw new k();
            }
        }
    }

    public final void c(List<Long> list) {
        int a2;
        int a3;
        if (list instanceof t) {
            t tVar = (t) list;
            int i2 = this.f3390b & 7;
            if (i2 == 1) {
                do {
                    tVar.l(this.a.i());
                    if (!this.a.k()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f3390b);
                this.d = a3;
            } else if (i2 == 2) {
                int e2 = this.a.e();
                u(e2);
                int i3 = this.a.f + e2;
                do {
                    tVar.l(this.a.i());
                } while (this.a.f < i3);
            } else {
                int i4 = l.f3117h;
                throw new k();
            }
        } else {
            int i5 = this.f3390b & 7;
            if (i5 == 1) {
                do {
                    list.add(Long.valueOf(this.a.i()));
                    if (!this.a.k()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f3390b);
                this.d = a2;
            } else if (i5 == 2) {
                int e3 = this.a.e();
                u(e3);
                int i6 = this.a.f + e3;
                do {
                    list.add(Long.valueOf(this.a.i()));
                } while (this.a.f < i6);
            } else {
                int i7 = l.f3117h;
                throw new k();
            }
        }
    }

    public final void d(List<Integer> list) {
        int a2;
        int a3;
        if (list instanceof f) {
            f fVar = (f) list;
            int i2 = this.f3390b & 7;
            if (i2 == 2) {
                int e2 = this.a.e();
                t(e2);
                int i3 = this.a.f + e2;
                do {
                    fVar.l(this.a.h());
                } while (this.a.f < i3);
            } else if (i2 == 5) {
                do {
                    fVar.l(this.a.h());
                    if (!this.a.k()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f3390b);
                this.d = a3;
            } else {
                int i4 = l.f3117h;
                throw new k();
            }
        } else {
            int i5 = this.f3390b & 7;
            if (i5 == 2) {
                int e3 = this.a.e();
                t(e3);
                int i6 = this.a.f + e3;
                do {
                    list.add(Integer.valueOf(this.a.h()));
                } while (this.a.f < i6);
            } else if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.h()));
                    if (!this.a.k()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f3390b);
                this.d = a2;
            } else {
                int i7 = l.f3117h;
                throw new k();
            }
        }
    }

    public final void e(List<Boolean> list) {
        int a2;
        int a3;
        if (list instanceof km) {
            km kmVar = (km) list;
            int i2 = this.f3390b & 7;
            if (i2 == 0) {
                do {
                    kmVar.e(this.a.d());
                    if (!this.a.k()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f3390b);
                this.d = a3;
            } else if (i2 == 2) {
                int e2 = this.a.f + this.a.e();
                do {
                    kmVar.e(this.a.d());
                } while (this.a.f < e2);
                s(e2);
            } else {
                int i3 = l.f3117h;
                throw new k();
            }
        } else {
            int i4 = this.f3390b & 7;
            if (i4 == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.d()));
                    if (!this.a.k()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f3390b);
                this.d = a2;
            } else if (i4 == 2) {
                int e3 = this.a.f + this.a.e();
                do {
                    list.add(Boolean.valueOf(this.a.d()));
                } while (this.a.f < e3);
                s(e3);
            } else {
                int i5 = l.f3117h;
                throw new k();
            }
        }
    }

    public final void f(List<String> list, boolean z) {
        int a2;
        int a3;
        if ((this.f3390b & 7) != 2) {
            int i2 = l.f3117h;
            throw new k();
        } else if ((list instanceof p) && !z) {
            p pVar = (p) list;
            do {
                pVar.q(C());
                if (!this.a.k()) {
                    a3 = this.a.a();
                } else {
                    return;
                }
            } while (a3 == this.f3390b);
            this.d = a3;
        } else {
            do {
                list.add(z ? B() : A());
                if (!this.a.k()) {
                    a2 = this.a.a();
                } else {
                    return;
                }
            } while (a2 == this.f3390b);
            this.d = a2;
        }
    }

    public final <T> void g(List<T> list, o0<T> o0Var, fn fnVar) {
        int a2;
        int i2 = this.f3390b;
        if ((i2 & 7) == 2) {
            do {
                list.add(q(o0Var, fnVar));
                if (!this.a.k() && this.d == 0) {
                    a2 = this.a.a();
                } else {
                    return;
                }
            } while (a2 == i2);
            this.d = a2;
            return;
        }
        int i3 = l.f3117h;
        throw new k();
    }

    public final <T> void h(List<T> list, o0<T> o0Var, fn fnVar) {
        int a2;
        int i2 = this.f3390b;
        if ((i2 & 7) == 3) {
            do {
                list.add(r(o0Var, fnVar));
                if (!this.a.k() && this.d == 0) {
                    a2 = this.a.a();
                } else {
                    return;
                }
            } while (a2 == i2);
            this.d = a2;
            return;
        }
        int i3 = l.f3117h;
        throw new k();
    }

    public final void i(List<um> list) {
        int a2;
        if ((this.f3390b & 7) == 2) {
            do {
                list.add(C());
                if (!this.a.k()) {
                    a2 = this.a.a();
                } else {
                    return;
                }
            } while (a2 == this.f3390b);
            this.d = a2;
            return;
        }
        int i2 = l.f3117h;
        throw new k();
    }

    public final void j(List<Integer> list) {
        int a2;
        int a3;
        if (list instanceof f) {
            f fVar = (f) list;
            int i2 = this.f3390b & 7;
            if (i2 == 0) {
                do {
                    fVar.l(this.a.e());
                    if (!this.a.k()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f3390b);
                this.d = a3;
            } else if (i2 == 2) {
                int e2 = this.a.f + this.a.e();
                do {
                    fVar.l(this.a.e());
                } while (this.a.f < e2);
                s(e2);
            } else {
                int i3 = l.f3117h;
                throw new k();
            }
        } else {
            int i4 = this.f3390b & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.e()));
                    if (!this.a.k()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f3390b);
                this.d = a2;
            } else if (i4 == 2) {
                int e3 = this.a.f + this.a.e();
                do {
                    list.add(Integer.valueOf(this.a.e()));
                } while (this.a.f < e3);
                s(e3);
            } else {
                int i5 = l.f3117h;
                throw new k();
            }
        }
    }

    public final void k(List<Integer> list) {
        int a2;
        int a3;
        if (list instanceof f) {
            f fVar = (f) list;
            int i2 = this.f3390b & 7;
            if (i2 == 0) {
                do {
                    fVar.l(this.a.e());
                    if (!this.a.k()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f3390b);
                this.d = a3;
            } else if (i2 == 2) {
                int e2 = this.a.f + this.a.e();
                do {
                    fVar.l(this.a.e());
                } while (this.a.f < e2);
                s(e2);
            } else {
                int i3 = l.f3117h;
                throw new k();
            }
        } else {
            int i4 = this.f3390b & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.e()));
                    if (!this.a.k()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f3390b);
                this.d = a2;
            } else if (i4 == 2) {
                int e3 = this.a.f + this.a.e();
                do {
                    list.add(Integer.valueOf(this.a.e()));
                } while (this.a.f < e3);
                s(e3);
            } else {
                int i5 = l.f3117h;
                throw new k();
            }
        }
    }

    public final void l(List<Integer> list) {
        int a2;
        int a3;
        if (list instanceof f) {
            f fVar = (f) list;
            int i2 = this.f3390b & 7;
            if (i2 == 2) {
                int e2 = this.a.e();
                t(e2);
                int i3 = this.a.f + e2;
                do {
                    fVar.l(this.a.h());
                } while (this.a.f < i3);
            } else if (i2 == 5) {
                do {
                    fVar.l(this.a.h());
                    if (!this.a.k()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f3390b);
                this.d = a3;
            } else {
                int i4 = l.f3117h;
                throw new k();
            }
        } else {
            int i5 = this.f3390b & 7;
            if (i5 == 2) {
                int e3 = this.a.e();
                t(e3);
                int i6 = this.a.f + e3;
                do {
                    list.add(Integer.valueOf(this.a.h()));
                } while (this.a.f < i6);
            } else if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.h()));
                    if (!this.a.k()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f3390b);
                this.d = a2;
            } else {
                int i7 = l.f3117h;
                throw new k();
            }
        }
    }

    public final void m(List<Long> list) {
        int a2;
        int a3;
        if (list instanceof t) {
            t tVar = (t) list;
            int i2 = this.f3390b & 7;
            if (i2 == 1) {
                do {
                    tVar.l(this.a.i());
                    if (!this.a.k()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f3390b);
                this.d = a3;
            } else if (i2 == 2) {
                int e2 = this.a.e();
                u(e2);
                int i3 = this.a.f + e2;
                do {
                    tVar.l(this.a.i());
                } while (this.a.f < i3);
            } else {
                int i4 = l.f3117h;
                throw new k();
            }
        } else {
            int i5 = this.f3390b & 7;
            if (i5 == 1) {
                do {
                    list.add(Long.valueOf(this.a.i()));
                    if (!this.a.k()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f3390b);
                this.d = a2;
            } else if (i5 == 2) {
                int e3 = this.a.e();
                u(e3);
                int i6 = this.a.f + e3;
                do {
                    list.add(Long.valueOf(this.a.i()));
                } while (this.a.f < i6);
            } else {
                int i7 = l.f3117h;
                throw new k();
            }
        }
    }

    public final void n(List<Integer> list) {
        int a2;
        int a3;
        if (list instanceof f) {
            f fVar = (f) list;
            int i2 = this.f3390b & 7;
            if (i2 == 0) {
                do {
                    fVar.l(vm.n(this.a.e()));
                    if (!this.a.k()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f3390b);
                this.d = a3;
            } else if (i2 == 2) {
                int e2 = this.a.f + this.a.e();
                do {
                    fVar.l(vm.n(this.a.e()));
                } while (this.a.f < e2);
                s(e2);
            } else {
                int i3 = l.f3117h;
                throw new k();
            }
        } else {
            int i4 = this.f3390b & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(vm.n(this.a.e())));
                    if (!this.a.k()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f3390b);
                this.d = a2;
            } else if (i4 == 2) {
                int e3 = this.a.f + this.a.e();
                do {
                    list.add(Integer.valueOf(vm.n(this.a.e())));
                } while (this.a.f < e3);
                s(e3);
            } else {
                int i5 = l.f3117h;
                throw new k();
            }
        }
    }

    public final void o(List<Long> list) {
        int a2;
        int a3;
        if (list instanceof t) {
            t tVar = (t) list;
            int i2 = this.f3390b & 7;
            if (i2 == 0) {
                do {
                    tVar.l(vm.o(this.a.f()));
                    if (!this.a.k()) {
                        a3 = this.a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f3390b);
                this.d = a3;
            } else if (i2 == 2) {
                int e2 = this.a.f + this.a.e();
                do {
                    tVar.l(vm.o(this.a.f()));
                } while (this.a.f < e2);
                s(e2);
            } else {
                int i3 = l.f3117h;
                throw new k();
            }
        } else {
            int i4 = this.f3390b & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(vm.o(this.a.f())));
                    if (!this.a.k()) {
                        a2 = this.a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f3390b);
                this.d = a2;
            } else if (i4 == 2) {
                int e3 = this.a.f + this.a.e();
                do {
                    list.add(Long.valueOf(vm.o(this.a.f())));
                } while (this.a.f < e3);
                s(e3);
            } else {
                int i5 = l.f3117h;
                throw new k();
            }
        }
    }

    public final void p(int i2) {
        if ((this.f3390b & 7) != i2) {
            int i3 = l.f3117h;
            throw new k();
        }
    }

    public final <T> T q(o0<T> o0Var, fn fnVar) {
        int e2 = this.a.e();
        vm vmVar = this.a;
        if (vmVar.a < 100) {
            int j2 = vmVar.j(e2);
            T a2 = o0Var.a();
            this.a.a++;
            o0Var.g(a2, this, fnVar);
            o0Var.b(a2);
            this.a.b(0);
            vm vmVar2 = this.a;
            vmVar2.a--;
            vmVar2.f3366h = j2;
            vmVar2.p();
            return a2;
        }
        throw new l("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final <T> T r(o0<T> o0Var, fn fnVar) {
        int i2 = this.c;
        this.c = ((this.f3390b >>> 3) << 3) | 4;
        try {
            T a2 = o0Var.a();
            o0Var.g(a2, this, fnVar);
            o0Var.b(a2);
            if (this.f3390b == this.c) {
                return a2;
            }
            throw l.f();
        } finally {
            this.c = i2;
        }
    }

    public final void s(int i2) {
        if (this.a.f != i2) {
            throw l.a();
        }
    }

    public final int v() {
        int i2 = this.d;
        if (i2 != 0) {
            this.f3390b = i2;
            this.d = 0;
        } else {
            i2 = this.a.a();
            this.f3390b = i2;
        }
        return (i2 == 0 || i2 == this.c) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : i2 >>> 3;
    }

    public final boolean w() {
        int i2;
        if (this.a.k() || (i2 = this.f3390b) == this.c) {
            return false;
        }
        return this.a.c(i2);
    }

    public final long x() {
        p(0);
        return this.a.f();
    }

    public final long y() {
        p(1);
        return this.a.i();
    }

    public final int z() {
        p(5);
        return this.a.h();
    }
}
