package e.a.a.a.y0.h;

import e.a.a.a.y0.h.c;
import java.io.OutputStream;
import java.util.NoSuchElementException;

public class o extends c {

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f9254i;

    /* renamed from: j  reason: collision with root package name */
    public int f9255j = 0;

    public class b implements c.a {

        /* renamed from: h  reason: collision with root package name */
        public int f9256h = 0;

        /* renamed from: i  reason: collision with root package name */
        public final int f9257i;

        public b(a aVar) {
            this.f9257i = o.this.f9254i.length;
        }

        public byte d() {
            try {
                byte[] bArr = o.this.f9254i;
                int i2 = this.f9256h;
                this.f9256h = i2 + 1;
                return bArr[i2];
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new NoSuchElementException(e2.getMessage());
            }
        }

        public boolean hasNext() {
            return this.f9256h < this.f9257i;
        }

        public Object next() {
            return Byte.valueOf(d());
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public o(byte[] bArr) {
        this.f9254i = bArr;
    }

    /* renamed from: C */
    public c.a iterator() {
        return new b((a) null);
    }

    public int G(int i2, int i3, int i4) {
        byte[] bArr = this.f9254i;
        int R = R() + i3;
        for (int i5 = R; i5 < R + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        if (r9[r0] > -65) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008a, code lost:
        if (r9[r0] > -65) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r9[r0] > -65) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int H(int r8, int r9, int r10) {
        /*
            r7 = this;
            int r0 = r7.R()
            int r0 = r0 + r9
            byte[] r9 = r7.f9254i
            int r10 = r10 + r0
            if (r8 == 0) goto L_0x008d
            if (r0 < r10) goto L_0x000e
            goto L_0x0091
        L_0x000e:
            byte r1 = (byte) r8
            r2 = -32
            r3 = -1
            r4 = -65
            if (r1 >= r2) goto L_0x0027
            r8 = -62
            if (r1 < r8) goto L_0x0024
            int r8 = r0 + 1
            byte r0 = r9[r0]
            if (r0 <= r4) goto L_0x0021
            goto L_0x0024
        L_0x0021:
            r0 = r8
            goto L_0x008d
        L_0x0024:
            r8 = r3
            goto L_0x0091
        L_0x0027:
            r5 = -16
            if (r1 >= r5) goto L_0x0054
            int r8 = r8 >> 8
            int r8 = ~r8
            byte r8 = (byte) r8
            if (r8 != 0) goto L_0x003f
            int r8 = r0 + 1
            byte r0 = r9[r0]
            if (r8 < r10) goto L_0x003c
            int r8 = b.q.a.a.u1(r1, r0)
            goto L_0x0091
        L_0x003c:
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x003f:
            if (r8 > r4) goto L_0x0024
            r5 = -96
            if (r1 != r2) goto L_0x0047
            if (r8 < r5) goto L_0x0024
        L_0x0047:
            r2 = -19
            if (r1 != r2) goto L_0x004d
            if (r8 >= r5) goto L_0x0024
        L_0x004d:
            int r8 = r0 + 1
            byte r0 = r9[r0]
            if (r0 <= r4) goto L_0x0021
            goto L_0x0024
        L_0x0054:
            int r2 = r8 >> 8
            int r2 = ~r2
            byte r2 = (byte) r2
            r5 = 0
            if (r2 != 0) goto L_0x0068
            int r8 = r0 + 1
            byte r2 = r9[r0]
            if (r8 < r10) goto L_0x0066
            int r8 = b.q.a.a.u1(r1, r2)
            goto L_0x0091
        L_0x0066:
            r0 = r8
            goto L_0x006b
        L_0x0068:
            int r8 = r8 >> 16
            byte r5 = (byte) r8
        L_0x006b:
            if (r5 != 0) goto L_0x0079
            int r8 = r0 + 1
            byte r5 = r9[r0]
            if (r8 < r10) goto L_0x0078
            int r8 = b.q.a.a.v1(r1, r2, r5)
            goto L_0x0091
        L_0x0078:
            r0 = r8
        L_0x0079:
            if (r2 > r4) goto L_0x0024
            int r8 = r1 << 28
            int r2 = r2 + 112
            int r2 = r2 + r8
            int r8 = r2 >> 30
            if (r8 != 0) goto L_0x0024
            if (r5 > r4) goto L_0x0024
            int r8 = r0 + 1
            byte r0 = r9[r0]
            if (r0 <= r4) goto L_0x0021
            goto L_0x0024
        L_0x008d:
            int r8 = b.q.a.a.v2(r9, r0, r10)
        L_0x0091:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.h.o.H(int, int, int):int");
    }

    public int I() {
        return this.f9255j;
    }

    public String J(String str) {
        byte[] bArr = this.f9254i;
        return new String(bArr, 0, bArr.length, str);
    }

    public void L(OutputStream outputStream, int i2, int i3) {
        outputStream.write(this.f9254i, R() + i2, i3);
    }

    public boolean N(o oVar, int i2, int i3) {
        if (i3 > oVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i3);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 + i3 <= oVar.size()) {
            byte[] bArr = this.f9254i;
            byte[] bArr2 = oVar.f9254i;
            int R = R() + i3;
            int R2 = R();
            int R3 = oVar.R() + i2;
            while (R2 < R) {
                if (bArr[R2] != bArr2[R3]) {
                    return false;
                }
                R2++;
                R3++;
            }
            return true;
        } else {
            int size2 = oVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(i3);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public int R() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c) || size() != ((c) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof o) {
            return N((o) obj, 0, size());
        }
        if (obj instanceof s) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(b.e.a.a.a.q(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
    }

    public int hashCode() {
        int i2 = this.f9255j;
        if (i2 == 0) {
            int size = size();
            i2 = G(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f9255j = i2;
        }
        return i2;
    }

    public void p(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f9254i, i2, bArr, i3, i4);
    }

    public int s() {
        return 0;
    }

    public int size() {
        return this.f9254i.length;
    }

    public boolean v() {
        return true;
    }

    public boolean y() {
        int R = R();
        return b.q.a.a.b2(this.f9254i, R, size() + R);
    }
}
