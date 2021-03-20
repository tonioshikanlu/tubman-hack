package b.l.d.q.f.i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.d.q.f.i.v;

public final class f extends v.d {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5209b;
    public final long c;
    public final Long d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5210e;
    public final v.d.a f;

    /* renamed from: g  reason: collision with root package name */
    public final v.d.f f5211g;

    /* renamed from: h  reason: collision with root package name */
    public final v.d.e f5212h;

    /* renamed from: i  reason: collision with root package name */
    public final v.d.c f5213i;

    /* renamed from: j  reason: collision with root package name */
    public final w<v.d.C0082d> f5214j;

    /* renamed from: k  reason: collision with root package name */
    public final int f5215k;

    public static final class b extends v.d.b {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public String f5216b;
        public Long c;
        public Long d;

        /* renamed from: e  reason: collision with root package name */
        public Boolean f5217e;
        public v.d.a f;

        /* renamed from: g  reason: collision with root package name */
        public v.d.f f5218g;

        /* renamed from: h  reason: collision with root package name */
        public v.d.e f5219h;

        /* renamed from: i  reason: collision with root package name */
        public v.d.c f5220i;

        /* renamed from: j  reason: collision with root package name */
        public w<v.d.C0082d> f5221j;

        /* renamed from: k  reason: collision with root package name */
        public Integer f5222k;

        public b() {
        }

        public b(v.d dVar, a aVar) {
            f fVar = (f) dVar;
            this.a = fVar.a;
            this.f5216b = fVar.f5209b;
            this.c = Long.valueOf(fVar.c);
            this.d = fVar.d;
            this.f5217e = Boolean.valueOf(fVar.f5210e);
            this.f = fVar.f;
            this.f5218g = fVar.f5211g;
            this.f5219h = fVar.f5212h;
            this.f5220i = fVar.f5213i;
            this.f5221j = fVar.f5214j;
            this.f5222k = Integer.valueOf(fVar.f5215k);
        }

        public v.d a() {
            String str = this.a == null ? " generator" : "";
            if (this.f5216b == null) {
                str = b.e.a.a.a.m(str, " identifier");
            }
            if (this.c == null) {
                str = b.e.a.a.a.m(str, " startedAt");
            }
            if (this.f5217e == null) {
                str = b.e.a.a.a.m(str, " crashed");
            }
            if (this.f == null) {
                str = b.e.a.a.a.m(str, " app");
            }
            if (this.f5222k == null) {
                str = b.e.a.a.a.m(str, " generatorType");
            }
            if (str.isEmpty()) {
                return new f(this.a, this.f5216b, this.c.longValue(), this.d, this.f5217e.booleanValue(), this.f, this.f5218g, this.f5219h, this.f5220i, this.f5221j, this.f5222k.intValue(), (a) null);
            }
            throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str));
        }

        public v.d.b b(boolean z) {
            this.f5217e = Boolean.valueOf(z);
            return this;
        }
    }

    public f(String str, String str2, long j2, Long l2, boolean z, v.d.a aVar, v.d.f fVar, v.d.e eVar, v.d.c cVar, w wVar, int i2, a aVar2) {
        this.a = str;
        this.f5209b = str2;
        this.c = j2;
        this.d = l2;
        this.f5210e = z;
        this.f = aVar;
        this.f5211g = fVar;
        this.f5212h = eVar;
        this.f5213i = cVar;
        this.f5214j = wVar;
        this.f5215k = i2;
    }

    @NonNull
    public v.d.a a() {
        return this.f;
    }

    @Nullable
    public v.d.c b() {
        return this.f5213i;
    }

    @Nullable
    public Long c() {
        return this.d;
    }

    @Nullable
    public w<v.d.C0082d> d() {
        return this.f5214j;
    }

    @NonNull
    public String e() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r1 = r7.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r7.f5211g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r1 = r7.f5212h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r1 = r7.f5213i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r1 = r7.f5214j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof b.l.d.q.f.i.v.d
            r2 = 0
            if (r1 == 0) goto L_0x00b5
            b.l.d.q.f.i.v$d r8 = (b.l.d.q.f.i.v.d) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            java.lang.String r1 = r7.f5209b
            java.lang.String r3 = r8.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            long r3 = r7.c
            long r5 = r8.i()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00b3
            java.lang.Long r1 = r7.d
            if (r1 != 0) goto L_0x0038
            java.lang.Long r1 = r8.c()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0042
        L_0x0038:
            java.lang.Long r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0042:
            boolean r1 = r7.f5210e
            boolean r3 = r8.k()
            if (r1 != r3) goto L_0x00b3
            b.l.d.q.f.i.v$d$a r1 = r7.f
            b.l.d.q.f.i.v$d$a r3 = r8.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            b.l.d.q.f.i.v$d$f r1 = r7.f5211g
            if (r1 != 0) goto L_0x0061
            b.l.d.q.f.i.v$d$f r1 = r8.j()
            if (r1 != 0) goto L_0x00b3
            goto L_0x006b
        L_0x0061:
            b.l.d.q.f.i.v$d$f r3 = r8.j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x006b:
            b.l.d.q.f.i.v$d$e r1 = r7.f5212h
            if (r1 != 0) goto L_0x0076
            b.l.d.q.f.i.v$d$e r1 = r8.h()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0080
        L_0x0076:
            b.l.d.q.f.i.v$d$e r3 = r8.h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0080:
            b.l.d.q.f.i.v$d$c r1 = r7.f5213i
            if (r1 != 0) goto L_0x008b
            b.l.d.q.f.i.v$d$c r1 = r8.b()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0095
        L_0x008b:
            b.l.d.q.f.i.v$d$c r3 = r8.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0095:
            b.l.d.q.f.i.w<b.l.d.q.f.i.v$d$d> r1 = r7.f5214j
            if (r1 != 0) goto L_0x00a0
            b.l.d.q.f.i.w r1 = r8.d()
            if (r1 != 0) goto L_0x00b3
            goto L_0x00aa
        L_0x00a0:
            b.l.d.q.f.i.w r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x00aa:
            int r1 = r7.f5215k
            int r8 = r8.f()
            if (r1 != r8) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r0 = r2
        L_0x00b4:
            return r0
        L_0x00b5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.q.f.i.f.equals(java.lang.Object):boolean");
    }

    public int f() {
        return this.f5215k;
    }

    @NonNull
    public String g() {
        return this.f5209b;
    }

    @Nullable
    public v.d.e h() {
        return this.f5212h;
    }

    public int hashCode() {
        long j2 = this.c;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f5209b.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l2 = this.d;
        int i2 = 0;
        int hashCode2 = (((((hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ (this.f5210e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode()) * 1000003;
        v.d.f fVar = this.f5211g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        v.d.e eVar = this.f5212h;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        v.d.c cVar = this.f5213i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        w<v.d.C0082d> wVar = this.f5214j;
        if (wVar != null) {
            i2 = wVar.hashCode();
        }
        return ((hashCode5 ^ i2) * 1000003) ^ this.f5215k;
    }

    public long i() {
        return this.c;
    }

    @Nullable
    public v.d.f j() {
        return this.f5211g;
    }

    public boolean k() {
        return this.f5210e;
    }

    public v.d.b l() {
        return new b(this, (a) null);
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Session{generator=");
        y.append(this.a);
        y.append(", identifier=");
        y.append(this.f5209b);
        y.append(", startedAt=");
        y.append(this.c);
        y.append(", endedAt=");
        y.append(this.d);
        y.append(", crashed=");
        y.append(this.f5210e);
        y.append(", app=");
        y.append(this.f);
        y.append(", user=");
        y.append(this.f5211g);
        y.append(", os=");
        y.append(this.f5212h);
        y.append(", device=");
        y.append(this.f5213i);
        y.append(", events=");
        y.append(this.f5214j);
        y.append(", generatorType=");
        return b.e.a.a.a.o(y, this.f5215k, "}");
    }
}
