package b.l.b.a.c.j;

import b.j.a.b.d;
import b.j.a.b.f;
import b.j.a.b.l;
import b.j.a.b.m;
import b.j.a.b.o;
import b.j.a.b.s.b;
import b.j.a.b.t.g;
import b.l.b.a.c.c;
import b.l.b.a.c.i;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Objects;

public final class a extends c {
    public final d a;

    public a() {
        d dVar = new d((m) null);
        this.a = dVar;
        f.a aVar = f.a.AUTO_CLOSE_JSON_CONTENT;
        dVar.f1388l = (~aVar.f1409i) & dVar.f1388l;
    }

    public static i f(l lVar) {
        if (lVar == null) {
            return null;
        }
        switch (lVar.ordinal()) {
            case 1:
                return i.START_OBJECT;
            case 2:
                return i.END_OBJECT;
            case 3:
                return i.START_ARRAY;
            case 4:
                return i.END_ARRAY;
            case 5:
                return i.FIELD_NAME;
            case 7:
                return i.VALUE_STRING;
            case 8:
                return i.VALUE_NUMBER_INT;
            case 9:
                return i.VALUE_NUMBER_FLOAT;
            case 10:
                return i.VALUE_TRUE;
            case 11:
                return i.VALUE_FALSE;
            case 12:
                return i.VALUE_NULL;
            default:
                return i.NOT_AVAILABLE;
        }
    }

    public b.l.b.a.c.d a(OutputStream outputStream, Charset charset) {
        d dVar = this.a;
        b.j.a.b.c cVar = b.j.a.b.c.UTF8;
        b bVar = new b(dVar.b(), outputStream, false);
        bVar.f1467b = cVar;
        g gVar = new g(bVar, dVar.f1388l, dVar.f1389m, outputStream, dVar.f1391o);
        o oVar = dVar.f1390n;
        if (oVar != d.s) {
            gVar.f1506q = oVar;
        }
        return new b(this, gVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: b.j.a.b.t.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: b.j.a.b.t.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: b.j.a.b.t.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: b.j.a.b.s.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: b.j.a.b.s.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: b.j.a.b.t.h} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d9, code lost:
        if (r5.a(r6 >>> 16) == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0106, code lost:
        if (r5.a((r0[r6 + 1] & androidx.exifinterface.media.ExifInterface.MARKER) | ((r0[r6] & 255) << 8)) != false) goto L_0x0108;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0181  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.l.b.a.c.f b(java.io.InputStream r21, java.nio.charset.Charset r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.util.Objects.requireNonNull(r21)
            b.l.b.a.c.j.c r2 = new b.l.b.a.c.j.c
            b.j.a.b.d r3 = r0.a
            b.j.a.b.s.b r4 = new b.j.a.b.s.b
            b.j.a.b.w.a r5 = r3.b()
            r6 = 0
            r4.<init>(r5, r1, r6)
            b.j.a.b.t.a r5 = new b.j.a.b.t.a
            r5.<init>(r4, r1)
            int r9 = r3.f1387k
            b.j.a.b.m r11 = r3.f1389m
            b.j.a.b.u.a r13 = r3.f1385i
            b.j.a.b.u.b r1 = r3.f1384h
            int r3 = r3.f1386j
            int r4 = r5.d
            b.j.a.b.c r7 = b.j.a.b.c.UTF8
            r8 = 4
            boolean r10 = r5.b(r8)
            r12 = 16
            r15 = 8
            if (r10 == 0) goto L_0x00e8
            byte[] r10 = r5.c
            int r8 = r5.d
            byte r16 = r10[r8]
            int r16 = r16 << 24
            int r17 = r8 + 1
            byte r6 = r10[r17]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << r12
            r6 = r16 | r6
            int r12 = r8 + 2
            byte r14 = r10[r12]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << r15
            r6 = r6 | r14
            int r14 = r8 + 3
            byte r10 = r10[r14]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r6 = r6 | r10
            r10 = -16842752(0xfffffffffeff0000, float:-1.6947657E38)
            java.lang.String r15 = "3412"
            r19 = 0
            if (r6 == r10) goto L_0x00e4
            r10 = -131072(0xfffffffffffe0000, float:NaN)
            java.lang.String r0 = "2143"
            if (r6 == r10) goto L_0x009c
            r10 = 65279(0xfeff, float:9.1475E-41)
            if (r6 == r10) goto L_0x0092
            r8 = 65534(0xfffe, float:9.1833E-41)
            if (r6 == r8) goto L_0x008e
            int r8 = r6 >>> 16
            if (r8 != r10) goto L_0x0076
            r5.d = r12
            r8 = 2
            r5.f1501h = r8
            r10 = 1
            goto L_0x00a4
        L_0x0076:
            r10 = 65534(0xfffe, float:9.1833E-41)
            if (r8 != r10) goto L_0x007f
            r5.d = r12
            r8 = 2
            goto L_0x00a1
        L_0x007f:
            int r8 = r6 >>> 8
            r10 = 15711167(0xefbbbf, float:2.2016034E-38)
            if (r8 != r10) goto L_0x008c
            r5.d = r14
            r10 = 1
            r5.f1501h = r10
            goto L_0x00a4
        L_0x008c:
            r8 = 0
            goto L_0x00a7
        L_0x008e:
            r5.c(r0)
            throw r19
        L_0x0092:
            r10 = 1
            r5.f1500g = r10
            r10 = 4
            int r8 = r8 + r10
            r5.d = r8
            r5.f1501h = r10
            goto L_0x00a6
        L_0x009c:
            r10 = 4
            int r8 = r8 + r10
            r5.d = r8
            r8 = 4
        L_0x00a1:
            r5.f1501h = r8
            r10 = 0
        L_0x00a4:
            r5.f1500g = r10
        L_0x00a6:
            r8 = 1
        L_0x00a7:
            if (r8 == 0) goto L_0x00aa
            goto L_0x0108
        L_0x00aa:
            int r8 = r6 >> 8
            if (r8 != 0) goto L_0x00b3
            r8 = 1
            r5.f1500g = r8
            r8 = 0
            goto L_0x00bc
        L_0x00b3:
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            r8 = r8 & r6
            if (r8 != 0) goto L_0x00c1
            r8 = 0
            r5.f1500g = r8
        L_0x00bc:
            r0 = 4
            r5.f1501h = r0
            r0 = 1
            goto L_0x00cf
        L_0x00c1:
            r8 = 0
            r10 = -16711681(0xffffffffff00ffff, float:-1.714704E38)
            r10 = r10 & r6
            if (r10 == 0) goto L_0x00e0
            r10 = -65281(0xffffffffffff00ff, float:NaN)
            r10 = r10 & r6
            if (r10 == 0) goto L_0x00dc
            r0 = r8
        L_0x00cf:
            if (r0 == 0) goto L_0x00d2
            goto L_0x0108
        L_0x00d2:
            r0 = 16
            int r6 = r6 >>> r0
            boolean r0 = r5.a(r6)
            if (r0 == 0) goto L_0x010a
            goto L_0x0108
        L_0x00dc:
            r5.c(r0)
            throw r19
        L_0x00e0:
            r5.c(r15)
            throw r19
        L_0x00e4:
            r5.c(r15)
            throw r19
        L_0x00e8:
            r0 = 2
            r8 = 0
            boolean r6 = r5.b(r0)
            if (r6 == 0) goto L_0x010a
            byte[] r0 = r5.c
            int r6 = r5.d
            byte r10 = r0[r6]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r12 = 8
            int r10 = r10 << r12
            r12 = 1
            int r6 = r6 + r12
            byte r0 = r0[r6]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r10
            boolean r0 = r5.a(r0)
            if (r0 == 0) goto L_0x010a
        L_0x0108:
            r6 = 1
            goto L_0x010b
        L_0x010a:
            r6 = r8
        L_0x010b:
            java.lang.String r0 = "Internal error"
            if (r6 != 0) goto L_0x0110
            goto L_0x0135
        L_0x0110:
            int r6 = r5.f1501h
            r8 = 1
            if (r6 == r8) goto L_0x0135
            r8 = 2
            if (r6 == r8) goto L_0x012b
            r8 = 4
            if (r6 != r8) goto L_0x0125
            boolean r6 = r5.f1500g
            if (r6 == 0) goto L_0x0122
            b.j.a.b.c r6 = b.j.a.b.c.UTF32_BE
            goto L_0x0136
        L_0x0122:
            b.j.a.b.c r6 = b.j.a.b.c.UTF32_LE
            goto L_0x0136
        L_0x0125:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x012b:
            boolean r6 = r5.f1500g
            if (r6 == 0) goto L_0x0132
            b.j.a.b.c r6 = b.j.a.b.c.UTF16_BE
            goto L_0x0136
        L_0x0132:
            b.j.a.b.c r6 = b.j.a.b.c.UTF16_LE
            goto L_0x0136
        L_0x0135:
            r6 = r7
        L_0x0136:
            b.j.a.b.s.b r8 = r5.a
            r8.f1467b = r6
            int r8 = r5.d
            int r4 = r8 - r4
            if (r6 != r7) goto L_0x0181
            b.j.a.b.d$a r6 = b.j.a.b.d.a.CANONICALIZE_FIELD_NAMES
            boolean r6 = r6.d(r3)
            if (r6 == 0) goto L_0x0181
            java.util.Objects.requireNonNull(r13)
            b.j.a.b.u.a r0 = new b.j.a.b.u.a
            b.j.a.b.d$a r1 = b.j.a.b.d.a.INTERN_FIELD_NAMES
            boolean r14 = r1.d(r3)
            int r15 = r13.c
            b.j.a.b.d$a r1 = b.j.a.b.d.a.FAIL_ON_SYMBOL_HASH_OVERFLOW
            boolean r16 = r1.d(r3)
            java.util.concurrent.atomic.AtomicReference<b.j.a.b.u.a$a> r1 = r13.f1514b
            java.lang.Object r1 = r1.get()
            r17 = r1
            b.j.a.b.u.a$a r17 = (b.j.a.b.u.a.C0047a) r17
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            b.j.a.b.t.h r1 = new b.j.a.b.t.h
            b.j.a.b.s.b r8 = r5.a
            java.io.InputStream r10 = r5.f1498b
            byte[] r13 = r5.c
            int r14 = r5.d
            int r15 = r5.f1499e
            boolean r3 = r5.f
            r7 = r1
            r16 = r4
            r17 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01f0
        L_0x0181:
            b.j.a.b.t.f r4 = new b.j.a.b.t.f
            b.j.a.b.s.b r8 = r5.a
            b.j.a.b.c r6 = r8.f1467b
            int r7 = r6.f1381j
            r10 = 8
            if (r7 == r10) goto L_0x01b6
            r10 = 16
            if (r7 == r10) goto L_0x01b6
            r6 = 32
            if (r7 != r6) goto L_0x01b0
            b.j.a.b.s.j r0 = new b.j.a.b.s.j
            b.j.a.b.s.b r13 = r5.a
            java.io.InputStream r14 = r5.f1498b
            byte[] r15 = r5.c
            int r6 = r5.d
            int r5 = r5.f1499e
            b.j.a.b.c r7 = r13.f1467b
            boolean r7 = r7.f1380i
            r12 = r0
            r16 = r6
            r17 = r5
            r18 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18)
            goto L_0x01e6
        L_0x01b0:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x01b6:
            java.io.InputStream r14 = r5.f1498b
            if (r14 != 0) goto L_0x01c6
            java.io.ByteArrayInputStream r14 = new java.io.ByteArrayInputStream
            byte[] r0 = r5.c
            int r7 = r5.d
            int r5 = r5.f1499e
            r14.<init>(r0, r7, r5)
            goto L_0x01df
        L_0x01c6:
            int r0 = r5.d
            int r7 = r5.f1499e
            if (r0 >= r7) goto L_0x01df
            b.j.a.b.s.e r0 = new b.j.a.b.s.e
            b.j.a.b.s.b r13 = r5.a
            byte[] r15 = r5.c
            int r7 = r5.d
            int r5 = r5.f1499e
            r12 = r0
            r16 = r7
            r17 = r5
            r12.<init>(r13, r14, r15, r16, r17)
            r14 = r0
        L_0x01df:
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.lang.String r5 = r6.f1379h
            r0.<init>(r14, r5)
        L_0x01e6:
            r10 = r0
            b.j.a.b.u.b r12 = r1.d(r3)
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            r1 = r4
        L_0x01f0:
            r0 = r20
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.b.a.c.j.a.b(java.io.InputStream, java.nio.charset.Charset):b.l.b.a.c.f");
    }

    public b.l.b.a.c.f c(Reader reader) {
        Objects.requireNonNull(reader);
        return new c(this, this.a.c(reader));
    }

    public b.l.b.a.c.f d(String str) {
        Objects.requireNonNull(str);
        return new c(this, this.a.d(str));
    }
}
