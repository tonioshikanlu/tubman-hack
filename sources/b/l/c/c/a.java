package b.l.c.c;

import androidx.exifinterface.media.ExifInterface;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

public abstract class a {
    public static final a a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b.l.c.c.a$a  reason: collision with other inner class name */
    public static final class C0072a {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final char[] f4900b;
        public final int c;
        public final int d;

        /* renamed from: e  reason: collision with root package name */
        public final int f4901e;
        public final int f;

        /* renamed from: g  reason: collision with root package name */
        public final byte[] f4902g;

        public C0072a(String str, char[] cArr) {
            Objects.requireNonNull(str);
            this.a = str;
            Objects.requireNonNull(cArr);
            this.f4900b = cArr;
            try {
                int b2 = b.l.c.d.a.b(cArr.length, RoundingMode.UNNECESSARY);
                this.d = b2;
                int min = Math.min(8, Integer.lowestOneBit(b2));
                try {
                    this.f4901e = 8 / min;
                    this.f = b2 / min;
                    this.c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i2 = 0; i2 < cArr.length; i2++) {
                        char c2 = cArr[i2];
                        b.l.a.c.b.a.l(c2 < 128, "Non-ASCII character: %s", c2);
                        b.l.a.c.b.a.l(bArr[c2] == -1, "Duplicate character: %s", c2);
                        bArr[c2] = (byte) i2;
                    }
                    this.f4902g = bArr;
                    boolean[] zArr = new boolean[this.f4901e];
                    for (int i3 = 0; i3 < this.f; i3++) {
                        zArr[b.l.c.d.a.a(i3 * 8, this.d, RoundingMode.CEILING)] = true;
                    }
                } catch (ArithmeticException e2) {
                    StringBuilder y = b.e.a.a.a.y("Illegal alphabet ");
                    y.append(new String(cArr));
                    throw new IllegalArgumentException(y.toString(), e2);
                }
            } catch (ArithmeticException e3) {
                StringBuilder y2 = b.e.a.a.a.y("Illegal alphabet length ");
                y2.append(cArr.length);
                throw new IllegalArgumentException(y2.toString(), e3);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0072a) {
                return Arrays.equals(this.f4900b, ((C0072a) obj).f4900b);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f4900b);
        }

        public String toString() {
            return this.a;
        }
    }

    public static final class b extends d {
        public final char[] d = new char[512];

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(java.lang.String r5, java.lang.String r6) {
            /*
                r4 = this;
                b.l.c.c.a$a r0 = new b.l.c.c.a$a
                char[] r6 = r6.toCharArray()
                r0.<init>(r5, r6)
                r5 = 0
                r4.<init>(r0, r5)
                r5 = 512(0x200, float:7.175E-43)
                char[] r5 = new char[r5]
                r4.d = r5
                char[] r5 = r0.f4900b
                int r5 = r5.length
                r6 = 16
                r1 = 0
                if (r5 != r6) goto L_0x001d
                r5 = 1
                goto L_0x001e
            L_0x001d:
                r5 = r1
            L_0x001e:
                b.l.a.c.b.a.q(r5)
            L_0x0021:
                r5 = 256(0x100, float:3.59E-43)
                if (r1 >= r5) goto L_0x003a
                char[] r5 = r4.d
                int r6 = r1 >>> 4
                char[] r2 = r0.f4900b
                char r6 = r2[r6]
                r5[r1] = r6
                r6 = r1 | 256(0x100, float:3.59E-43)
                r3 = r1 & 15
                char r2 = r2[r3]
                r5[r6] = r2
                int r1 = r1 + 1
                goto L_0x0021
            L_0x003a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.l.c.c.a.b.<init>(java.lang.String, java.lang.String):void");
        }

        public void a(Appendable appendable, byte[] bArr, int i2, int i3) {
            b.l.a.c.b.a.D(i2, i2 + i3, bArr.length);
            for (int i4 = 0; i4 < i3; i4++) {
                byte b2 = bArr[i2 + i4] & ExifInterface.MARKER;
                appendable.append(this.d[b2]);
                appendable.append(this.d[b2 | 256]);
            }
        }
    }

    public static final class c extends d {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
            /*
                r1 = this;
                b.l.c.c.a$a r0 = new b.l.c.c.a$a
                char[] r3 = r3.toCharArray()
                r0.<init>(r2, r3)
                r1.<init>(r0, r4)
                char[] r2 = r0.f4900b
                int r2 = r2.length
                r3 = 64
                if (r2 != r3) goto L_0x0015
                r2 = 1
                goto L_0x0016
            L_0x0015:
                r2 = 0
            L_0x0016:
                b.l.a.c.b.a.q(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.l.c.c.a.c.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
        }

        public void a(Appendable appendable, byte[] bArr, int i2, int i3) {
            int i4 = i2 + i3;
            b.l.a.c.b.a.D(i2, i4, bArr.length);
            while (i3 >= 3) {
                int i5 = i2 + 1;
                int i6 = i5 + 1;
                byte b2 = ((bArr[i2] & ExifInterface.MARKER) << 16) | ((bArr[i5] & ExifInterface.MARKER) << 8);
                byte b3 = b2 | (bArr[i6] & ExifInterface.MARKER);
                appendable.append(this.f4903b.f4900b[b3 >>> 18]);
                appendable.append(this.f4903b.f4900b[(b3 >>> 12) & 63]);
                appendable.append(this.f4903b.f4900b[(b3 >>> 6) & 63]);
                appendable.append(this.f4903b.f4900b[b3 & 63]);
                i3 -= 3;
                i2 = i6 + 1;
            }
            if (i2 < i4) {
                b(appendable, bArr, i2, i4 - i2);
            }
        }
    }

    public static class d extends a {

        /* renamed from: b  reason: collision with root package name */
        public final C0072a f4903b;
        public final Character c;

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(b.l.c.c.a.C0072a r5, java.lang.Character r6) {
            /*
                r4 = this;
                r4.<init>()
                java.util.Objects.requireNonNull(r5)
                r4.f4903b = r5
                r0 = 0
                r1 = 1
                if (r6 == 0) goto L_0x0022
                char r2 = r6.charValue()
                byte[] r5 = r5.f4902g
                int r3 = r5.length
                if (r2 >= r3) goto L_0x001c
                byte r5 = r5[r2]
                r2 = -1
                if (r5 == r2) goto L_0x001c
                r5 = r1
                goto L_0x001d
            L_0x001c:
                r5 = r0
            L_0x001d:
                if (r5 != 0) goto L_0x0020
                goto L_0x0022
            L_0x0020:
                r5 = r0
                goto L_0x0023
            L_0x0022:
                r5 = r1
            L_0x0023:
                if (r5 == 0) goto L_0x0028
                r4.c = r6
                return
            L_0x0028:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r6
                java.lang.String r6 = "Padding character %s was already in alphabet"
                java.lang.String r6 = b.l.c.a.c.a(r6, r1)
                r5.<init>(r6)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: b.l.c.c.a.d.<init>(b.l.c.c.a$a, java.lang.Character):void");
        }

        public void a(Appendable appendable, byte[] bArr, int i2, int i3) {
            b.l.a.c.b.a.D(i2, i2 + i3, bArr.length);
            int i4 = 0;
            while (i4 < i3) {
                b(appendable, bArr, i2 + i4, Math.min(this.f4903b.f, i3 - i4));
                i4 += this.f4903b.f;
            }
        }

        public void b(Appendable appendable, byte[] bArr, int i2, int i3) {
            b.l.a.c.b.a.D(i2, i2 + i3, bArr.length);
            int i4 = 0;
            b.l.a.c.b.a.q(i3 <= this.f4903b.f);
            long j2 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                j2 = (j2 | ((long) (bArr[i2 + i5] & ExifInterface.MARKER))) << 8;
            }
            int i6 = ((i3 + 1) * 8) - this.f4903b.d;
            while (i4 < i3 * 8) {
                C0072a aVar = this.f4903b;
                appendable.append(aVar.f4900b[((int) (j2 >>> (i6 - i4))) & aVar.c]);
                i4 += this.f4903b.d;
            }
            if (this.c != null) {
                while (i4 < this.f4903b.f * 8) {
                    appendable.append(this.c.charValue());
                    i4 += this.f4903b.d;
                }
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f4903b.equals(dVar.f4903b) && b.l.a.c.b.a.U(this.c, dVar.c);
        }

        public int hashCode() {
            return this.f4903b.hashCode() ^ Arrays.hashCode(new Object[]{this.c});
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f4903b.a);
            if (8 % this.f4903b.d != 0) {
                if (this.c == null) {
                    str = ".omitPadding()";
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.c);
                    str = "')";
                }
                sb.append(str);
            }
            return sb.toString();
        }
    }

    static {
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new d(new C0072a("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), '=');
        new d(new C0072a("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), '=');
        new b("base16()", "0123456789ABCDEF");
    }

    public abstract void a(Appendable appendable, byte[] bArr, int i2, int i3);
}
