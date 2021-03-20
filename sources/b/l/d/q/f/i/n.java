package b.l.d.q.f.i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.d.q.f.i.v;

public final class n extends v.d.C0082d.a.b.C0085b {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5242b;
    public final w<v.d.C0082d.a.b.C0086d.C0087a> c;
    public final v.d.C0082d.a.b.C0085b d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5243e;

    public n(String str, String str2, w wVar, v.d.C0082d.a.b.C0085b bVar, int i2, a aVar) {
        this.a = str;
        this.f5242b = str2;
        this.c = wVar;
        this.d = bVar;
        this.f5243e = i2;
    }

    @Nullable
    public v.d.C0082d.a.b.C0085b a() {
        return this.d;
    }

    @NonNull
    public w<v.d.C0082d.a.b.C0086d.C0087a> b() {
        return this.c;
    }

    public int c() {
        return this.f5243e;
    }

    @Nullable
    public String d() {
        return this.f5242b;
    }

    @NonNull
    public String e() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f5242b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof b.l.d.q.f.i.v.d.C0082d.a.b.C0085b
            r2 = 0
            if (r1 == 0) goto L_0x0058
            b.l.d.q.f.i.v$d$d$a$b$b r5 = (b.l.d.q.f.i.v.d.C0082d.a.b.C0085b) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r4.f5242b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.d()
            if (r1 != 0) goto L_0x0056
            goto L_0x002c
        L_0x0022:
            java.lang.String r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x002c:
            b.l.d.q.f.i.w<b.l.d.q.f.i.v$d$d$a$b$d$a> r1 = r4.c
            b.l.d.q.f.i.w r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            b.l.d.q.f.i.v$d$d$a$b$b r1 = r4.d
            if (r1 != 0) goto L_0x0043
            b.l.d.q.f.i.v$d$d$a$b$b r1 = r5.a()
            if (r1 != 0) goto L_0x0056
            goto L_0x004d
        L_0x0043:
            b.l.d.q.f.i.v$d$d$a$b$b r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x004d:
            int r1 = r4.f5243e
            int r5 = r5.c()
            if (r1 != r5) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r0 = r2
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.q.f.i.n.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.f5242b;
        int i2 = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        v.d.C0082d.a.b.C0085b bVar = this.d;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return ((hashCode2 ^ i2) * 1000003) ^ this.f5243e;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Exception{type=");
        y.append(this.a);
        y.append(", reason=");
        y.append(this.f5242b);
        y.append(", frames=");
        y.append(this.c);
        y.append(", causedBy=");
        y.append(this.d);
        y.append(", overflowCount=");
        return b.e.a.a.a.o(y, this.f5243e, "}");
    }
}
