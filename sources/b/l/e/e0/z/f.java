package b.l.e.e0.z;

import b.l.e.g0.c;
import b.l.e.n;
import b.l.e.q;
import b.l.e.s;
import b.l.e.t;
import b.l.e.v;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class f extends c {
    public static final Writer v = new a();
    public static final v w = new v("closed");
    public final List<q> s = new ArrayList();
    public String t;
    public q u = s.a;

    public class a extends Writer {
        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public f() {
        super(v);
    }

    public c H() {
        if (this.s.isEmpty() || this.t != null) {
            throw new IllegalStateException();
        } else if (t0() instanceof n) {
            List<q> list = this.s;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c N() {
        if (this.s.isEmpty() || this.t != null) {
            throw new IllegalStateException();
        } else if (t0() instanceof t) {
            List<q> list = this.s;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c O(String str) {
        if (this.s.isEmpty() || this.t != null) {
            throw new IllegalStateException();
        } else if (t0() instanceof t) {
            this.t = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c Y() {
        u0(s.a);
        return this;
    }

    public void close() {
        if (this.s.isEmpty()) {
            this.s.add(w);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c e() {
        n nVar = new n();
        u0(nVar);
        this.s.add(nVar);
        return this;
    }

    public void flush() {
    }

    public c n0(long j2) {
        u0(new v((Number) Long.valueOf(j2)));
        return this;
    }

    public c o0(Boolean bool) {
        if (bool == null) {
            u0(s.a);
            return this;
        }
        u0(new v(bool));
        return this;
    }

    public c p0(Number number) {
        if (number == null) {
            u0(s.a);
            return this;
        }
        if (!this.f5546m) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        u0(new v(number));
        return this;
    }

    public c q() {
        t tVar = new t();
        u0(tVar);
        this.s.add(tVar);
        return this;
    }

    public c q0(String str) {
        if (str == null) {
            u0(s.a);
            return this;
        }
        u0(new v(str));
        return this;
    }

    public c r0(boolean z) {
        u0(new v(Boolean.valueOf(z)));
        return this;
    }

    public final q t0() {
        List<q> list = this.s;
        return list.get(list.size() - 1);
    }

    public final void u0(q qVar) {
        if (this.t != null) {
            if (!(qVar instanceof s) || this.f5549p) {
                ((t) t0()).a.put(this.t, qVar);
            }
            this.t = null;
        } else if (this.s.isEmpty()) {
            this.u = qVar;
        } else {
            q t0 = t0();
            if (t0 instanceof n) {
                ((n) t0).f5566h.add(qVar);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
