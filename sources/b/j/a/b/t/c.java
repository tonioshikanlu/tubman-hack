package b.j.a.b.t;

import b.j.a.b.f;
import b.j.a.b.m;
import b.j.a.b.o;
import b.j.a.b.q.a;
import b.j.a.b.s.b;
import b.j.a.b.w.e;

public abstract class c extends a {
    public static final int[] s = b.j.a.b.s.a.f1464h;

    /* renamed from: n  reason: collision with root package name */
    public final b f1503n;

    /* renamed from: o  reason: collision with root package name */
    public int[] f1504o = s;

    /* renamed from: p  reason: collision with root package name */
    public int f1505p;

    /* renamed from: q  reason: collision with root package name */
    public o f1506q = e.f1560o;
    public boolean r;

    public c(b bVar, int i2, m mVar) {
        super(i2, mVar);
        this.f1503n = bVar;
        boolean z = false;
        if ((f.a.ESCAPE_NON_ASCII.f1409i & i2) != 0) {
            this.f1505p = 127;
        }
        this.r = !((f.a.QUOTE_FIELD_NAMES.f1409i & i2) != 0 ? true : z);
    }

    public f H(f.a aVar) {
        int i2 = aVar.f1409i;
        this.f1448j &= ~i2;
        if ((i2 & a.f1446m) != 0) {
            if (aVar == f.a.WRITE_NUMBERS_AS_STRINGS) {
                this.f1449k = false;
            } else if (aVar == f.a.ESCAPE_NON_ASCII) {
                a1(0);
            } else if (aVar == f.a.STRICT_DUPLICATE_DETECTION) {
                e eVar = this.f1450l;
                eVar.d = null;
                this.f1450l = eVar;
            }
        }
        if (aVar == f.a.QUOTE_FIELD_NAMES) {
            this.r = true;
        }
        return this;
    }

    public final void S0(String str, String str2) {
        t0(str);
        Q0(str2);
    }

    public void V0(int i2, int i3) {
        b bVar;
        boolean z = false;
        if ((a.f1446m & i3) != 0) {
            this.f1449k = (f.a.WRITE_NUMBERS_AS_STRINGS.f1409i & i2) != 0;
            int i4 = f.a.ESCAPE_NON_ASCII.f1409i;
            if ((i3 & i4) != 0) {
                if ((i4 & i2) != 0) {
                    a1(127);
                } else {
                    a1(0);
                }
            }
            int i5 = f.a.STRICT_DUPLICATE_DETECTION.f1409i;
            if ((i3 & i5) != 0) {
                boolean z2 = (i2 & i5) != 0;
                e eVar = this.f1450l;
                if (!z2) {
                    bVar = null;
                } else if (eVar.d == null) {
                    bVar = new b(this);
                }
                eVar.d = bVar;
                this.f1450l = eVar;
            }
        }
        if ((i2 & f.a.QUOTE_FIELD_NAMES.f1409i) != 0) {
            z = true;
        }
        this.r = !z;
    }

    public void Y0(String str) {
        throw new b.j.a.b.e(String.format("Can not %s, expecting field name (context: %s)", new Object[]{str, this.f1450l.h()}), this);
    }

    public void Z0(String str, int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                this.f1399h.d(this);
            } else if (i2 == 2) {
                this.f1399h.i(this);
            } else if (i2 == 3) {
                this.f1399h.c(this);
            } else if (i2 != 5) {
                b.j.a.b.w.m.a();
                throw null;
            } else {
                Y0(str);
                throw null;
            }
        } else if (this.f1450l.d()) {
            this.f1399h.b(this);
        } else if (this.f1450l.e()) {
            this.f1399h.g(this);
        }
    }

    public f a1(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.f1505p = i2;
        return this;
    }
}
