package b.l.a.c.f.e;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Mac;

public final class rb implements v5 {
    public final ThreadLocal<Mac> a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3248b;
    public final Key c;
    public final int d;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rb(java.lang.String r5, java.security.Key r6) {
        /*
            r4 = this;
            r4.<init>()
            b.l.a.c.f.e.qb r0 = new b.l.a.c.f.e.qb
            r0.<init>(r4)
            r4.a = r0
            r4.f3248b = r5
            r4.c = r6
            byte[] r6 = r6.getEncoded()
            int r6 = r6.length
            r1 = 16
            if (r6 < r1) goto L_0x007c
            int r6 = r5.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r6) {
                case -1823053428: goto L_0x0040;
                case 392315118: goto L_0x0036;
                case 392316170: goto L_0x002c;
                case 392317873: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x004a
        L_0x0022:
            java.lang.String r6 = "HMACSHA512"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x004a
            r6 = r1
            goto L_0x004b
        L_0x002c:
            java.lang.String r6 = "HMACSHA384"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x004a
            r6 = r2
            goto L_0x004b
        L_0x0036:
            java.lang.String r6 = "HMACSHA256"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x004a
            r6 = r3
            goto L_0x004b
        L_0x0040:
            java.lang.String r6 = "HMACSHA1"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x004a
            r6 = 0
            goto L_0x004b
        L_0x004a:
            r6 = -1
        L_0x004b:
            if (r6 == 0) goto L_0x0074
            if (r6 == r3) goto L_0x0071
            if (r6 == r2) goto L_0x006e
            if (r6 == r1) goto L_0x006b
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException
            java.lang.String r0 = "unknown Hmac algorithm: "
            int r1 = r5.length()
            if (r1 == 0) goto L_0x0062
            java.lang.String r5 = r0.concat(r5)
            goto L_0x0067
        L_0x0062:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0)
        L_0x0067:
            r6.<init>(r5)
            throw r6
        L_0x006b:
            r5 = 64
            goto L_0x0076
        L_0x006e:
            r5 = 48
            goto L_0x0076
        L_0x0071:
            r5 = 32
            goto L_0x0076
        L_0x0074:
            r5 = 20
        L_0x0076:
            r4.d = r5
            r0.get()
            return
        L_0x007c:
            java.security.InvalidAlgorithmParameterException r5 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r6 = "key size too small, need at least 16 bytes"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.rb.<init>(java.lang.String, java.security.Key):void");
    }

    public final byte[] a(byte[] bArr, int i2) {
        if (i2 <= this.d) {
            this.a.get().update(bArr);
            return Arrays.copyOf(this.a.get().doFinal(), i2);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
