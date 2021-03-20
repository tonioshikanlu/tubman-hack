package b.l.e.e0.z;

import b.l.e.b0;
import b.l.e.c0;
import b.l.e.k;
import b.l.e.o;
import b.l.e.p;
import b.l.e.q;
import b.l.e.w;
import b.l.e.x;
import java.lang.reflect.Type;
import java.util.Objects;

public final class m<T> extends b0<T> {
    public final x<T> a;

    /* renamed from: b  reason: collision with root package name */
    public final p<T> f5483b;
    public final k c;
    public final b.l.e.f0.a<T> d;

    /* renamed from: e  reason: collision with root package name */
    public final c0 f5484e;
    public final m<T>.b f = new b((a) null);

    /* renamed from: g  reason: collision with root package name */
    public b0<T> f5485g;

    public final class b implements w, o {
        public b(a aVar) {
        }

        public <R> R a(q qVar, Type type) {
            k kVar = m.this.c;
            Objects.requireNonNull(kVar);
            if (qVar == null) {
                return null;
            }
            return kVar.b(new e(qVar), type);
        }
    }

    public static final class c implements c0 {

        /* renamed from: h  reason: collision with root package name */
        public final b.l.e.f0.a<?> f5486h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f5487i;

        /* renamed from: j  reason: collision with root package name */
        public final Class<?> f5488j;

        /* renamed from: k  reason: collision with root package name */
        public final x<?> f5489k;

        /* renamed from: l  reason: collision with root package name */
        public final p<?> f5490l;

        public c(Object obj, b.l.e.f0.a<?> aVar, boolean z, Class<?> cls) {
            x<?> xVar = obj instanceof x ? (x) obj : null;
            this.f5489k = xVar;
            p<?> pVar = obj instanceof p ? (p) obj : null;
            this.f5490l = pVar;
            b.l.a.c.b.a.r((xVar == null && pVar == null) ? false : true);
            this.f5486h = aVar;
            this.f5487i = z;
            this.f5488j = null;
        }

        public <T> b0<T> a(k kVar, b.l.e.f0.a<T> aVar) {
            boolean z;
            b.l.e.f0.a<?> aVar2 = this.f5486h;
            if (aVar2 != null) {
                z = aVar2.equals(aVar) || (this.f5487i && this.f5486h.f5519b == aVar.a);
            } else {
                z = this.f5488j.isAssignableFrom(aVar.a);
            }
            if (z) {
                return new m(this.f5489k, this.f5490l, kVar, aVar, this);
            }
            return null;
        }
    }

    public m(x<T> xVar, p<T> pVar, k kVar, b.l.e.f0.a<T> aVar, c0 c0Var) {
        this.a = xVar;
        this.f5483b = pVar;
        this.c = kVar;
        this.d = aVar;
        this.f5484e = c0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        throw new b.l.e.y((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        throw new b.l.e.r((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        throw new b.l.e.y((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029 A[ExcHandler: NumberFormatException (r4v9 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030 A[ExcHandler: IOException (r4v8 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[ExcHandler: d (r4v7 'e' b.l.e.g0.d A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T a(b.l.e.g0.a r4) {
        /*
            r3 = this;
            b.l.e.p<T> r0 = r3.f5483b
            if (r0 != 0) goto L_0x001a
            b.l.e.b0<T> r0 = r3.f5485g
            if (r0 == 0) goto L_0x0009
            goto L_0x0015
        L_0x0009:
            b.l.e.k r0 = r3.c
            b.l.e.c0 r1 = r3.f5484e
            b.l.e.f0.a<T> r2 = r3.d
            b.l.e.b0 r0 = r0.g(r1, r2)
            r3.f5485g = r0
        L_0x0015:
            java.lang.Object r4 = r0.a(r4)
            return r4
        L_0x001a:
            r4.v0()     // Catch:{ EOFException -> 0x003e, d -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            r0 = 0
            b.l.e.b0<b.l.e.q> r1 = b.l.e.e0.z.o.X     // Catch:{ EOFException -> 0x0027, d -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            java.lang.Object r4 = r1.a(r4)     // Catch:{ EOFException -> 0x0027, d -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            b.l.e.q r4 = (b.l.e.q) r4     // Catch:{ EOFException -> 0x0027, d -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            goto L_0x0044
        L_0x0027:
            r4 = move-exception
            goto L_0x0040
        L_0x0029:
            r4 = move-exception
            b.l.e.y r0 = new b.l.e.y
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        L_0x0030:
            r4 = move-exception
            b.l.e.r r0 = new b.l.e.r
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        L_0x0037:
            r4 = move-exception
            b.l.e.y r0 = new b.l.e.y
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        L_0x003e:
            r4 = move-exception
            r0 = 1
        L_0x0040:
            if (r0 == 0) goto L_0x005a
            b.l.e.s r4 = b.l.e.s.a
        L_0x0044:
            java.util.Objects.requireNonNull(r4)
            boolean r0 = r4 instanceof b.l.e.s
            if (r0 == 0) goto L_0x004d
            r4 = 0
            return r4
        L_0x004d:
            b.l.e.p<T> r0 = r3.f5483b
            b.l.e.f0.a<T> r1 = r3.d
            java.lang.reflect.Type r1 = r1.f5519b
            b.l.e.e0.z.m<T>$b r2 = r3.f
            java.lang.Object r4 = r0.a(r4, r1, r2)
            return r4
        L_0x005a:
            b.l.e.y r0 = new b.l.e.y
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.e.e0.z.m.a(b.l.e.g0.a):java.lang.Object");
    }

    public void b(b.l.e.g0.c cVar, T t) {
        x<T> xVar = this.a;
        if (xVar == null) {
            b0<T> b0Var = this.f5485g;
            if (b0Var == null) {
                b0Var = this.c.g(this.f5484e, this.d);
                this.f5485g = b0Var;
            }
            b0Var.b(cVar, t);
        } else if (t == null) {
            cVar.Y();
        } else {
            o.X.b(cVar, xVar.a(t, this.d.f5519b, this.f));
        }
    }
}
