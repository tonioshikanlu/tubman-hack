package o;

import e.a.a.a.y0.m.o1.c;
import e.x.c.i;
import java.util.zip.Inflater;

public final class n implements z {

    /* renamed from: h  reason: collision with root package name */
    public int f10471h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f10472i;

    /* renamed from: j  reason: collision with root package name */
    public final g f10473j;

    /* renamed from: k  reason: collision with root package name */
    public final Inflater f10474k;

    public n(g gVar, Inflater inflater) {
        i.e(gVar, "source");
        i.e(inflater, "inflater");
        this.f10473j = gVar;
        this.f10474k = inflater;
    }

    public n(z zVar, Inflater inflater) {
        i.e(zVar, "source");
        i.e(inflater, "inflater");
        g m2 = c.m(zVar);
        i.e(m2, "source");
        i.e(inflater, "inflater");
        this.f10473j = m2;
        this.f10474k = inflater;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0070 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long T(o.e r10, long r11) {
        /*
            r9 = this;
            java.lang.String r0 = "sink"
            e.x.c.i.e(r10, r0)
        L_0x0005:
            e.x.c.i.e(r10, r0)
            r1 = 0
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r4 = 1
            if (r3 < 0) goto L_0x0011
            r5 = r4
            goto L_0x0012
        L_0x0011:
            r5 = 0
        L_0x0012:
            if (r5 == 0) goto L_0x00aa
            boolean r5 = r9.f10472i
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x009e
            if (r3 != 0) goto L_0x001c
            goto L_0x006b
        L_0x001c:
            o.u r3 = r10.q0(r4)     // Catch:{ DataFormatException -> 0x0097 }
            int r4 = r3.c     // Catch:{ DataFormatException -> 0x0097 }
            int r4 = 8192 - r4
            long r4 = (long) r4     // Catch:{ DataFormatException -> 0x0097 }
            long r4 = java.lang.Math.min(r11, r4)     // Catch:{ DataFormatException -> 0x0097 }
            int r4 = (int) r4     // Catch:{ DataFormatException -> 0x0097 }
            r9.b()     // Catch:{ DataFormatException -> 0x0097 }
            java.util.zip.Inflater r5 = r9.f10474k     // Catch:{ DataFormatException -> 0x0097 }
            byte[] r6 = r3.a     // Catch:{ DataFormatException -> 0x0097 }
            int r7 = r3.c     // Catch:{ DataFormatException -> 0x0097 }
            int r4 = r5.inflate(r6, r7, r4)     // Catch:{ DataFormatException -> 0x0097 }
            int r5 = r9.f10471h     // Catch:{ DataFormatException -> 0x0097 }
            if (r5 != 0) goto L_0x003c
            goto L_0x004e
        L_0x003c:
            java.util.zip.Inflater r6 = r9.f10474k     // Catch:{ DataFormatException -> 0x0097 }
            int r6 = r6.getRemaining()     // Catch:{ DataFormatException -> 0x0097 }
            int r5 = r5 - r6
            int r6 = r9.f10471h     // Catch:{ DataFormatException -> 0x0097 }
            int r6 = r6 - r5
            r9.f10471h = r6     // Catch:{ DataFormatException -> 0x0097 }
            o.g r6 = r9.f10473j     // Catch:{ DataFormatException -> 0x0097 }
            long r7 = (long) r5     // Catch:{ DataFormatException -> 0x0097 }
            r6.skip(r7)     // Catch:{ DataFormatException -> 0x0097 }
        L_0x004e:
            if (r4 <= 0) goto L_0x005c
            int r5 = r3.c     // Catch:{ DataFormatException -> 0x0097 }
            int r5 = r5 + r4
            r3.c = r5     // Catch:{ DataFormatException -> 0x0097 }
            long r5 = r10.f10453i     // Catch:{ DataFormatException -> 0x0097 }
            long r3 = (long) r4     // Catch:{ DataFormatException -> 0x0097 }
            long r5 = r5 + r3
            r10.f10453i = r5     // Catch:{ DataFormatException -> 0x0097 }
            goto L_0x006c
        L_0x005c:
            int r4 = r3.f10489b     // Catch:{ DataFormatException -> 0x0097 }
            int r5 = r3.c     // Catch:{ DataFormatException -> 0x0097 }
            if (r4 != r5) goto L_0x006b
            o.u r4 = r3.a()     // Catch:{ DataFormatException -> 0x0097 }
            r10.f10452h = r4     // Catch:{ DataFormatException -> 0x0097 }
            o.v.a(r3)     // Catch:{ DataFormatException -> 0x0097 }
        L_0x006b:
            r3 = r1
        L_0x006c:
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0071
            return r3
        L_0x0071:
            java.util.zip.Inflater r1 = r9.f10474k
            boolean r1 = r1.finished()
            if (r1 != 0) goto L_0x0094
            java.util.zip.Inflater r1 = r9.f10474k
            boolean r1 = r1.needsDictionary()
            if (r1 == 0) goto L_0x0082
            goto L_0x0094
        L_0x0082:
            o.g r1 = r9.f10473j
            boolean r1 = r1.D()
            if (r1 != 0) goto L_0x008c
            goto L_0x0005
        L_0x008c:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r11 = "source exhausted prematurely"
            r10.<init>(r11)
            throw r10
        L_0x0094:
            r10 = -1
            return r10
        L_0x0097:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r10)
            throw r11
        L_0x009e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "closed"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00aa:
            java.lang.String r10 = "byteCount < 0: "
            java.lang.String r10 = b.e.a.a.a.j(r10, r11)
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.n.T(o.e, long):long");
    }

    public final boolean b() {
        if (!this.f10474k.needsInput()) {
            return false;
        }
        if (this.f10473j.D()) {
            return true;
        }
        u uVar = this.f10473j.d().f10452h;
        i.c(uVar);
        int i2 = uVar.c;
        int i3 = uVar.f10489b;
        int i4 = i2 - i3;
        this.f10471h = i4;
        this.f10474k.setInput(uVar.a, i3, i4);
        return false;
    }

    public void close() {
        if (!this.f10472i) {
            this.f10474k.end();
            this.f10472i = true;
            this.f10473j.close();
        }
    }

    public a0 f() {
        return this.f10473j.f();
    }
}
