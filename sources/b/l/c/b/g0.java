package b.l.c.b;

import b.l.c.b.o;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class g0<E> extends e<E> implements Serializable {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f4851o = 0;

    /* renamed from: l  reason: collision with root package name */
    public final transient d<c<E>> f4852l;

    /* renamed from: m  reason: collision with root package name */
    public final transient l<E> f4853m;

    /* renamed from: n  reason: collision with root package name */
    public final transient c<E> f4854n;

    public class a implements Iterator<o.a<E>> {

        /* renamed from: h  reason: collision with root package name */
        public c<E> f4855h;

        /* renamed from: i  reason: collision with root package name */
        public o.a<E> f4856i;

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
            if (r5.f4853m.a(r0.a) != false) goto L_0x0045;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
            if (r5.f4842j.compare(r1, r0.a) == 0) goto L_0x0034;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a() {
            /*
                r4 = this;
                b.l.c.b.g0.this = r5
                r4.<init>()
                b.l.c.b.g0$d<b.l.c.b.g0$c<E>> r0 = r5.f4852l
                T r0 = r0.a
                b.l.c.b.g0$c r0 = (b.l.c.b.g0.c) r0
                if (r0 != 0) goto L_0x000e
                goto L_0x0044
            L_0x000e:
                b.l.c.b.l<E> r1 = r5.f4853m
                boolean r2 = r1.f4874i
                if (r2 == 0) goto L_0x0032
                T r1 = r1.f4875j
                java.util.Comparator<? super E> r2 = r5.f4842j
                b.l.c.b.g0$c r0 = r0.e(r2, r1)
                if (r0 != 0) goto L_0x001f
                goto L_0x0044
            L_0x001f:
                b.l.c.b.l<E> r2 = r5.f4853m
                b.l.c.b.f r2 = r2.f4876k
                b.l.c.b.f r3 = b.l.c.b.f.OPEN
                if (r2 != r3) goto L_0x0036
                java.util.Comparator<? super E> r2 = r5.f4842j
                E r3 = r0.a
                int r1 = r2.compare(r1, r3)
                if (r1 != 0) goto L_0x0036
                goto L_0x0034
            L_0x0032:
                b.l.c.b.g0$c<E> r0 = r5.f4854n
            L_0x0034:
                b.l.c.b.g0$c<E> r0 = r0.f4865i
            L_0x0036:
                b.l.c.b.g0$c<E> r1 = r5.f4854n
                if (r0 == r1) goto L_0x0044
                b.l.c.b.l<E> r5 = r5.f4853m
                E r1 = r0.a
                boolean r5 = r5.a(r1)
                if (r5 != 0) goto L_0x0045
            L_0x0044:
                r0 = 0
            L_0x0045:
                r4.f4855h = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.l.c.b.g0.a.<init>(b.l.c.b.g0):void");
        }

        public boolean hasNext() {
            c<E> cVar = this.f4855h;
            if (cVar == null) {
                return false;
            }
            if (!g0.this.f4853m.c(cVar.a)) {
                return true;
            }
            this.f4855h = null;
            return false;
        }

        public Object next() {
            if (hasNext()) {
                g0 g0Var = g0.this;
                c<E> cVar = this.f4855h;
                Objects.requireNonNull(g0Var);
                f0 f0Var = new f0(g0Var, cVar);
                this.f4856i = f0Var;
                c<E> cVar2 = this.f4855h.f4865i;
                if (cVar2 == g0.this.f4854n) {
                    cVar2 = null;
                }
                this.f4855h = cVar2;
                return f0Var;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            b.l.a.c.b.a.E(this.f4856i != null);
            g0.this.G(this.f4856i.m(), 0);
            this.f4856i = null;
        }
    }

    public enum b {
        SIZE {
            public int d(c<?> cVar) {
                return cVar.f4861b;
            }

            public long e(c<?> cVar) {
                if (cVar == null) {
                    return 0;
                }
                return cVar.d;
            }
        },
        DISTINCT {
            public int d(c<?> cVar) {
                return 1;
            }

            public long e(c<?> cVar) {
                if (cVar == null) {
                    return 0;
                }
                return (long) cVar.c;
            }
        };

        /* access modifiers changed from: public */
        b(f0 f0Var) {
        }

        public abstract int d(c<?> cVar);

        public abstract long e(c<?> cVar);
    }

    public static final class c<E> {
        public final E a;

        /* renamed from: b  reason: collision with root package name */
        public int f4861b;
        public int c;
        public long d;

        /* renamed from: e  reason: collision with root package name */
        public int f4862e;
        public c<E> f;

        /* renamed from: g  reason: collision with root package name */
        public c<E> f4863g;

        /* renamed from: h  reason: collision with root package name */
        public c<E> f4864h;

        /* renamed from: i  reason: collision with root package name */
        public c<E> f4865i;

        public c(E e2, int i2) {
            b.l.a.c.b.a.q(i2 > 0);
            this.a = e2;
            this.f4861b = i2;
            this.d = (long) i2;
            this.c = 1;
            this.f4862e = 1;
            this.f = null;
            this.f4863g = null;
        }

        public static int i(c<?> cVar) {
            if (cVar == null) {
                return 0;
            }
            return cVar.f4862e;
        }

        public c<E> a(Comparator<? super E> comparator, E e2, int i2, int[] iArr) {
            int compare = comparator.compare(e2, this.a);
            boolean z = true;
            if (compare < 0) {
                c<E> cVar = this.f;
                if (cVar == null) {
                    iArr[0] = 0;
                    b(e2, i2);
                    return this;
                }
                int i3 = cVar.f4862e;
                c<E> a2 = cVar.a(comparator, e2, i2, iArr);
                this.f = a2;
                if (iArr[0] == 0) {
                    this.c++;
                }
                this.d += (long) i2;
                return a2.f4862e == i3 ? this : j();
            } else if (compare > 0) {
                c<E> cVar2 = this.f4863g;
                if (cVar2 == null) {
                    iArr[0] = 0;
                    c(e2, i2);
                    return this;
                }
                int i4 = cVar2.f4862e;
                c<E> a3 = cVar2.a(comparator, e2, i2, iArr);
                this.f4863g = a3;
                if (iArr[0] == 0) {
                    this.c++;
                }
                this.d += (long) i2;
                return a3.f4862e == i4 ? this : j();
            } else {
                int i5 = this.f4861b;
                iArr[0] = i5;
                long j2 = (long) i2;
                if (((long) i5) + j2 > 2147483647L) {
                    z = false;
                }
                b.l.a.c.b.a.q(z);
                this.f4861b += i2;
                this.d += j2;
                return this;
            }
        }

        public final c<E> b(E e2, int i2) {
            c<E> cVar = new c<>(e2, i2);
            this.f = cVar;
            c<E> cVar2 = this.f4864h;
            int i3 = g0.f4851o;
            cVar2.f4865i = cVar;
            cVar.f4864h = cVar2;
            cVar.f4865i = this;
            this.f4864h = cVar;
            this.f4862e = Math.max(2, this.f4862e);
            this.c++;
            this.d += (long) i2;
            return this;
        }

        public final c<E> c(E e2, int i2) {
            c<E> cVar = new c<>(e2, i2);
            this.f4863g = cVar;
            c<E> cVar2 = this.f4865i;
            int i3 = g0.f4851o;
            this.f4865i = cVar;
            cVar.f4864h = this;
            cVar.f4865i = cVar2;
            cVar2.f4864h = cVar;
            this.f4862e = Math.max(2, this.f4862e);
            this.c++;
            this.d += (long) i2;
            return this;
        }

        public final int d() {
            return i(this.f) - i(this.f4863g);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
            r2 = r0.e(r2, r3);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final b.l.c.b.g0.c<E> e(java.util.Comparator<? super E> r2, E r3) {
            /*
                r1 = this;
                E r0 = r1.a
                int r0 = r2.compare(r3, r0)
                if (r0 >= 0) goto L_0x0016
                b.l.c.b.g0$c<E> r0 = r1.f
                if (r0 != 0) goto L_0x000d
                goto L_0x0014
            L_0x000d:
                b.l.c.b.g0$c r2 = r0.e(r2, r3)
                if (r2 == 0) goto L_0x0014
                goto L_0x0015
            L_0x0014:
                r2 = r1
            L_0x0015:
                return r2
            L_0x0016:
                if (r0 != 0) goto L_0x0019
                return r1
            L_0x0019:
                b.l.c.b.g0$c<E> r0 = r1.f4863g
                if (r0 != 0) goto L_0x001f
                r2 = 0
                goto L_0x0023
            L_0x001f:
                b.l.c.b.g0$c r2 = r0.e(r2, r3)
            L_0x0023:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: b.l.c.b.g0.c.e(java.util.Comparator, java.lang.Object):b.l.c.b.g0$c");
        }

        public int f(Comparator<? super E> comparator, E e2) {
            int compare = comparator.compare(e2, this.a);
            if (compare < 0) {
                c<E> cVar = this.f;
                if (cVar == null) {
                    return 0;
                }
                return cVar.f(comparator, e2);
            } else if (compare <= 0) {
                return this.f4861b;
            } else {
                c<E> cVar2 = this.f4863g;
                if (cVar2 == null) {
                    return 0;
                }
                return cVar2.f(comparator, e2);
            }
        }

        public final c<E> g() {
            int i2 = this.f4861b;
            this.f4861b = 0;
            c<E> cVar = this.f4864h;
            c<E> cVar2 = this.f4865i;
            int i3 = g0.f4851o;
            cVar.f4865i = cVar2;
            cVar2.f4864h = cVar;
            c<E> cVar3 = this.f;
            if (cVar3 == null) {
                return this.f4863g;
            }
            c<E> cVar4 = this.f4863g;
            if (cVar4 == null) {
                return cVar3;
            }
            if (cVar3.f4862e >= cVar4.f4862e) {
                c<E> cVar5 = this.f4864h;
                cVar5.f = cVar3.n(cVar5);
                cVar5.f4863g = this.f4863g;
                cVar5.c = this.c - 1;
                cVar5.d = this.d - ((long) i2);
                return cVar5.j();
            }
            c<E> cVar6 = this.f4865i;
            cVar6.f4863g = cVar4.o(cVar6);
            cVar6.f = this.f;
            cVar6.c = this.c - 1;
            cVar6.d = this.d - ((long) i2);
            return cVar6.j();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
            r2 = r0.h(r2, r3);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final b.l.c.b.g0.c<E> h(java.util.Comparator<? super E> r2, E r3) {
            /*
                r1 = this;
                E r0 = r1.a
                int r0 = r2.compare(r3, r0)
                if (r0 <= 0) goto L_0x0016
                b.l.c.b.g0$c<E> r0 = r1.f4863g
                if (r0 != 0) goto L_0x000d
                goto L_0x0014
            L_0x000d:
                b.l.c.b.g0$c r2 = r0.h(r2, r3)
                if (r2 == 0) goto L_0x0014
                goto L_0x0015
            L_0x0014:
                r2 = r1
            L_0x0015:
                return r2
            L_0x0016:
                if (r0 != 0) goto L_0x0019
                return r1
            L_0x0019:
                b.l.c.b.g0$c<E> r0 = r1.f
                if (r0 != 0) goto L_0x001f
                r2 = 0
                goto L_0x0023
            L_0x001f:
                b.l.c.b.g0$c r2 = r0.h(r2, r3)
            L_0x0023:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: b.l.c.b.g0.c.h(java.util.Comparator, java.lang.Object):b.l.c.b.g0$c");
        }

        public final c<E> j() {
            int d2 = d();
            if (d2 == -2) {
                if (this.f4863g.d() > 0) {
                    this.f4863g = this.f4863g.q();
                }
                return p();
            } else if (d2 != 2) {
                l();
                return this;
            } else {
                if (this.f.d() < 0) {
                    this.f = this.f.p();
                }
                return q();
            }
        }

        public final void k() {
            int i2;
            long j2;
            c<E> cVar = this.f;
            int i3 = g0.f4851o;
            int i4 = 0;
            if (cVar == null) {
                i2 = 0;
            } else {
                i2 = cVar.c;
            }
            int i5 = i2 + 1;
            c<E> cVar2 = this.f4863g;
            if (cVar2 != null) {
                i4 = cVar2.c;
            }
            this.c = i5 + i4;
            long j3 = (long) this.f4861b;
            long j4 = 0;
            if (cVar == null) {
                j2 = 0;
            } else {
                j2 = cVar.d;
            }
            long j5 = j3 + j2;
            if (cVar2 != null) {
                j4 = cVar2.d;
            }
            this.d = j5 + j4;
            l();
        }

        public final void l() {
            this.f4862e = Math.max(i(this.f), i(this.f4863g)) + 1;
        }

        public c<E> m(Comparator<? super E> comparator, E e2, int i2, int[] iArr) {
            long j2;
            long j3;
            int compare = comparator.compare(e2, this.a);
            if (compare < 0) {
                c<E> cVar = this.f;
                if (cVar == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f = cVar.m(comparator, e2, i2, iArr);
                if (iArr[0] > 0) {
                    if (i2 >= iArr[0]) {
                        this.c--;
                        j3 = this.d;
                        i2 = iArr[0];
                    } else {
                        j3 = this.d;
                    }
                    this.d = j3 - ((long) i2);
                }
                return iArr[0] == 0 ? this : j();
            } else if (compare > 0) {
                c<E> cVar2 = this.f4863g;
                if (cVar2 == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f4863g = cVar2.m(comparator, e2, i2, iArr);
                if (iArr[0] > 0) {
                    if (i2 >= iArr[0]) {
                        this.c--;
                        j2 = this.d;
                        i2 = iArr[0];
                    } else {
                        j2 = this.d;
                    }
                    this.d = j2 - ((long) i2);
                }
                return j();
            } else {
                int i3 = this.f4861b;
                iArr[0] = i3;
                if (i2 >= i3) {
                    return g();
                }
                this.f4861b = i3 - i2;
                this.d -= (long) i2;
                return this;
            }
        }

        public final c<E> n(c<E> cVar) {
            c<E> cVar2 = this.f4863g;
            if (cVar2 == null) {
                return this.f;
            }
            this.f4863g = cVar2.n(cVar);
            this.c--;
            this.d -= (long) cVar.f4861b;
            return j();
        }

        public final c<E> o(c<E> cVar) {
            c<E> cVar2 = this.f;
            if (cVar2 == null) {
                return this.f4863g;
            }
            this.f = cVar2.o(cVar);
            this.c--;
            this.d -= (long) cVar.f4861b;
            return j();
        }

        public final c<E> p() {
            b.l.a.c.b.a.H(this.f4863g != null);
            c<E> cVar = this.f4863g;
            this.f4863g = cVar.f;
            cVar.f = this;
            cVar.d = this.d;
            cVar.c = this.c;
            k();
            cVar.l();
            return cVar;
        }

        public final c<E> q() {
            b.l.a.c.b.a.H(this.f != null);
            c<E> cVar = this.f;
            this.f = cVar.f4863g;
            cVar.f4863g = this;
            cVar.d = this.d;
            cVar.c = this.c;
            k();
            cVar.l();
            return cVar;
        }

        public c<E> r(Comparator<? super E> comparator, E e2, int i2, int i3, int[] iArr) {
            int i4;
            int i5;
            int compare = comparator.compare(e2, this.a);
            if (compare < 0) {
                c<E> cVar = this.f;
                if (cVar == null) {
                    iArr[0] = 0;
                    if (i2 == 0 && i3 > 0) {
                        b(e2, i3);
                    }
                    return this;
                }
                this.f = cVar.r(comparator, e2, i2, i3, iArr);
                if (iArr[0] == i2) {
                    if (i3 != 0 || iArr[0] == 0) {
                        if (i3 > 0 && iArr[0] == 0) {
                            i5 = this.c + 1;
                        }
                        this.d += (long) (i3 - iArr[0]);
                    } else {
                        i5 = this.c - 1;
                    }
                    this.c = i5;
                    this.d += (long) (i3 - iArr[0]);
                }
                return j();
            } else if (compare > 0) {
                c<E> cVar2 = this.f4863g;
                if (cVar2 == null) {
                    iArr[0] = 0;
                    if (i2 == 0 && i3 > 0) {
                        c(e2, i3);
                    }
                    return this;
                }
                this.f4863g = cVar2.r(comparator, e2, i2, i3, iArr);
                if (iArr[0] == i2) {
                    if (i3 != 0 || iArr[0] == 0) {
                        if (i3 > 0 && iArr[0] == 0) {
                            i4 = this.c + 1;
                        }
                        this.d += (long) (i3 - iArr[0]);
                    } else {
                        i4 = this.c - 1;
                    }
                    this.c = i4;
                    this.d += (long) (i3 - iArr[0]);
                }
                return j();
            } else {
                int i6 = this.f4861b;
                iArr[0] = i6;
                if (i2 == i6) {
                    if (i3 == 0) {
                        return g();
                    }
                    this.d += (long) (i3 - i6);
                    this.f4861b = i3;
                }
                return this;
            }
        }

        public c<E> s(Comparator<? super E> comparator, E e2, int i2, int[] iArr) {
            long j2;
            int i3;
            int i4;
            int i5;
            int compare = comparator.compare(e2, this.a);
            if (compare < 0) {
                c<E> cVar = this.f;
                if (cVar == null) {
                    iArr[0] = 0;
                    if (i2 > 0) {
                        b(e2, i2);
                    }
                    return this;
                }
                this.f = cVar.s(comparator, e2, i2, iArr);
                if (i2 != 0 || iArr[0] == 0) {
                    if (i2 > 0 && iArr[0] == 0) {
                        i5 = this.c + 1;
                    }
                    j2 = this.d;
                    i3 = iArr[0];
                } else {
                    i5 = this.c - 1;
                }
                this.c = i5;
                j2 = this.d;
                i3 = iArr[0];
            } else if (compare > 0) {
                c<E> cVar2 = this.f4863g;
                if (cVar2 == null) {
                    iArr[0] = 0;
                    if (i2 > 0) {
                        c(e2, i2);
                    }
                    return this;
                }
                this.f4863g = cVar2.s(comparator, e2, i2, iArr);
                if (i2 != 0 || iArr[0] == 0) {
                    if (i2 > 0 && iArr[0] == 0) {
                        i4 = this.c + 1;
                    }
                    j2 = this.d;
                    i3 = iArr[0];
                } else {
                    i4 = this.c - 1;
                }
                this.c = i4;
                j2 = this.d;
                i3 = iArr[0];
            } else {
                int i6 = this.f4861b;
                iArr[0] = i6;
                if (i2 == 0) {
                    return g();
                }
                this.d += (long) (i2 - i6);
                this.f4861b = i2;
                return this;
            }
            this.d = j2 + ((long) (i2 - i3));
            return j();
        }

        public String toString() {
            return new t(this.a, this.f4861b).toString();
        }
    }

    public static final class d<T> {
        public T a;

        public d(f0 f0Var) {
        }

        public void a(T t, T t2) {
            if (this.a == t) {
                this.a = t2;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    public g0(d<c<E>> dVar, l<E> lVar, c<E> cVar) {
        super(lVar.f4873h);
        this.f4852l = dVar;
        this.f4853m = lVar;
        this.f4854n = cVar;
    }

    public final long D(b bVar) {
        c cVar = (c) this.f4852l.a;
        long e2 = bVar.e(cVar);
        if (this.f4853m.f4874i) {
            e2 -= y(bVar, cVar);
        }
        return this.f4853m.f4877l ? e2 - v(bVar, cVar) : e2;
    }

    public boolean F(E e2, int i2, int i3) {
        b.l.a.c.b.a.w(i3, "newCount");
        b.l.a.c.b.a.w(i2, "oldCount");
        b.l.a.c.b.a.q(this.f4853m.a(e2));
        T t = (c) this.f4852l.a;
        if (t != null) {
            int[] iArr = new int[1];
            T r = t.r(this.f4842j, e2, i2, i3, iArr);
            d<c<E>> dVar = this.f4852l;
            if (dVar.a == t) {
                dVar.a = r;
                if (iArr[0] == i2) {
                    return true;
                }
                return false;
            }
            throw new ConcurrentModificationException();
        } else if (i2 != 0) {
            return false;
        } else {
            if (i3 > 0) {
                o(e2, i3);
            }
            return true;
        }
    }

    public int G(E e2, int i2) {
        b.l.a.c.b.a.w(i2, "count");
        boolean z = true;
        if (!this.f4853m.a(e2)) {
            if (i2 != 0) {
                z = false;
            }
            b.l.a.c.b.a.q(z);
            return 0;
        }
        T t = (c) this.f4852l.a;
        if (t == null) {
            if (i2 > 0) {
                o(e2, i2);
            }
            return 0;
        }
        int[] iArr = new int[1];
        T s = t.s(this.f4842j, e2, i2, iArr);
        d<c<E>> dVar = this.f4852l;
        if (dVar.a == t) {
            dVar.a = s;
            return iArr[0];
        }
        throw new ConcurrentModificationException();
    }

    public b0<E> O(E e2, f fVar) {
        return new g0(this.f4852l, this.f4853m.b(new l(this.f4842j, false, null, f.OPEN, true, e2, fVar)), this.f4854n);
    }

    public int S(Object obj) {
        try {
            c cVar = (c) this.f4852l.a;
            if (this.f4853m.a(obj)) {
                if (cVar != null) {
                    return cVar.f(this.f4842j, obj);
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    public void clear() {
        l<E> lVar = this.f4853m;
        if (lVar.f4874i || lVar.f4877l) {
            a aVar = new a();
            while (aVar.hasNext()) {
                aVar.next();
                aVar.remove();
            }
            return;
        }
        c<E> cVar = this.f4854n.f4865i;
        while (true) {
            c<E> cVar2 = this.f4854n;
            if (cVar != cVar2) {
                c<E> cVar3 = cVar.f4865i;
                cVar.f4861b = 0;
                cVar.f = null;
                cVar.f4863g = null;
                cVar.f4864h = null;
                cVar.f4865i = null;
                cVar = cVar3;
            } else {
                cVar2.f4865i = cVar2;
                cVar2.f4864h = cVar2;
                this.f4852l.a = null;
                return;
            }
        }
    }

    public int e() {
        return b.l.a.c.b.a.x0(D(b.DISTINCT));
    }

    public Iterator<E> iterator() {
        return new u(this, entrySet().iterator());
    }

    public int k(Object obj, int i2) {
        b.l.a.c.b.a.w(i2, "occurrences");
        if (i2 == 0) {
            return S(obj);
        }
        T t = (c) this.f4852l.a;
        int[] iArr = new int[1];
        try {
            if (this.f4853m.a(obj)) {
                if (t != null) {
                    T m2 = t.m(this.f4842j, obj, i2, iArr);
                    d<c<E>> dVar = this.f4852l;
                    if (dVar.a == t) {
                        dVar.a = m2;
                        return iArr[0];
                    }
                    throw new ConcurrentModificationException();
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    public Iterator<E> l() {
        return new p(new a());
    }

    public b0<E> m(E e2, f fVar) {
        return new g0(this.f4852l, this.f4853m.b(new l(this.f4842j, true, e2, fVar, false, null, f.OPEN)), this.f4854n);
    }

    public Iterator<o.a<E>> n() {
        return new a();
    }

    public int o(E e2, int i2) {
        b.l.a.c.b.a.w(i2, "occurrences");
        if (i2 == 0) {
            return S(e2);
        }
        b.l.a.c.b.a.q(this.f4853m.a(e2));
        T t = (c) this.f4852l.a;
        if (t == null) {
            this.f4842j.compare(e2, e2);
            c<E> cVar = new c<>(e2, i2);
            c<E> cVar2 = this.f4854n;
            cVar2.f4865i = cVar;
            cVar.f4864h = cVar2;
            cVar.f4865i = cVar2;
            cVar2.f4864h = cVar;
            this.f4852l.a(t, cVar);
            return 0;
        }
        int[] iArr = new int[1];
        T a2 = t.a(this.f4842j, e2, i2, iArr);
        d<c<E>> dVar = this.f4852l;
        if (dVar.a == t) {
            dVar.a = a2;
            return iArr[0];
        }
        throw new ConcurrentModificationException();
    }

    public int size() {
        return b.l.a.c.b.a.x0(D(b.SIZE));
    }

    public final long v(b bVar, c<E> cVar) {
        long j2;
        long j3;
        if (cVar == null) {
            return 0;
        }
        int compare = this.f4842j.compare(this.f4853m.f4878m, cVar.a);
        if (compare > 0) {
            return v(bVar, cVar.f4863g);
        }
        if (compare == 0) {
            int ordinal = this.f4853m.f4879n.ordinal();
            if (ordinal == 0) {
                j3 = (long) bVar.d(cVar);
                j2 = bVar.e(cVar.f4863g);
            } else if (ordinal == 1) {
                return bVar.e(cVar.f4863g);
            } else {
                throw new AssertionError();
            }
        } else {
            j3 = bVar.e(cVar.f4863g) + ((long) bVar.d(cVar));
            j2 = v(bVar, cVar.f);
        }
        return j2 + j3;
    }

    public final long y(b bVar, c<E> cVar) {
        long j2;
        long j3;
        if (cVar == null) {
            return 0;
        }
        int compare = this.f4842j.compare(this.f4853m.f4875j, cVar.a);
        if (compare < 0) {
            return y(bVar, cVar.f);
        }
        if (compare == 0) {
            int ordinal = this.f4853m.f4876k.ordinal();
            if (ordinal == 0) {
                j3 = (long) bVar.d(cVar);
                j2 = bVar.e(cVar.f);
            } else if (ordinal == 1) {
                return bVar.e(cVar.f);
            } else {
                throw new AssertionError();
            }
        } else {
            j3 = bVar.e(cVar.f) + ((long) bVar.d(cVar));
            j2 = y(bVar, cVar.f4863g);
        }
        return j2 + j3;
    }

    public g0(Comparator<? super E> comparator) {
        super(comparator);
        f fVar = f.OPEN;
        this.f4853m = new l(comparator, false, null, fVar, false, null, fVar);
        c<E> cVar = new c<>(null, 1);
        this.f4854n = cVar;
        cVar.f4865i = cVar;
        cVar.f4864h = cVar;
        this.f4852l = new d<>((f0) null);
    }
}
