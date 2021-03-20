package b.l.d.q.f.i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.d.q.f.i.v;

public final class k extends v.d.C0082d.a {
    public final v.d.C0082d.a.b a;

    /* renamed from: b  reason: collision with root package name */
    public final w<v.b> f5238b;
    public final Boolean c;
    public final int d;

    public static final class b extends v.d.C0082d.a.C0083a {
        public v.d.C0082d.a.b a;

        /* renamed from: b  reason: collision with root package name */
        public w<v.b> f5239b;
        public Boolean c;
        public Integer d;

        public b() {
        }

        public b(v.d.C0082d.a aVar, a aVar2) {
            k kVar = (k) aVar;
            this.a = kVar.a;
            this.f5239b = kVar.f5238b;
            this.c = kVar.c;
            this.d = Integer.valueOf(kVar.d);
        }

        public v.d.C0082d.a a() {
            String str = this.a == null ? " execution" : "";
            if (this.d == null) {
                str = b.e.a.a.a.m(str, " uiOrientation");
            }
            if (str.isEmpty()) {
                return new k(this.a, this.f5239b, this.c, this.d.intValue(), (a) null);
            }
            throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str));
        }
    }

    public k(v.d.C0082d.a.b bVar, w wVar, Boolean bool, int i2, a aVar) {
        this.a = bVar;
        this.f5238b = wVar;
        this.c = bool;
        this.d = i2;
    }

    @Nullable
    public Boolean a() {
        return this.c;
    }

    @Nullable
    public w<v.b> b() {
        return this.f5238b;
    }

    @NonNull
    public v.d.C0082d.a.b c() {
        return this.a;
    }

    public int d() {
        return this.d;
    }

    public v.d.C0082d.a.C0083a e() {
        return new b(this, (a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f5238b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof b.l.d.q.f.i.v.d.C0082d.a
            r2 = 0
            if (r1 == 0) goto L_0x004c
            b.l.d.q.f.i.v$d$d$a r5 = (b.l.d.q.f.i.v.d.C0082d.a) r5
            b.l.d.q.f.i.v$d$d$a$b r1 = r4.a
            b.l.d.q.f.i.v$d$d$a$b r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
            b.l.d.q.f.i.w<b.l.d.q.f.i.v$b> r1 = r4.f5238b
            if (r1 != 0) goto L_0x0022
            b.l.d.q.f.i.w r1 = r5.b()
            if (r1 != 0) goto L_0x004a
            goto L_0x002c
        L_0x0022:
            b.l.d.q.f.i.w r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
        L_0x002c:
            java.lang.Boolean r1 = r4.c
            if (r1 != 0) goto L_0x0037
            java.lang.Boolean r1 = r5.a()
            if (r1 != 0) goto L_0x004a
            goto L_0x0041
        L_0x0037:
            java.lang.Boolean r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
        L_0x0041:
            int r1 = r4.d
            int r5 = r5.d()
            if (r1 != r5) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r0 = r2
        L_0x004b:
            return r0
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.q.f.i.k.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        w<v.b> wVar = this.f5238b;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        Boolean bool = this.c;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return ((hashCode2 ^ i2) * 1000003) ^ this.d;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Application{execution=");
        y.append(this.a);
        y.append(", customAttributes=");
        y.append(this.f5238b);
        y.append(", background=");
        y.append(this.c);
        y.append(", uiOrientation=");
        return b.e.a.a.a.o(y, this.d, "}");
    }
}
