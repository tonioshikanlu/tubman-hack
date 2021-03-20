package l.b.b.a.a;

import com.amplitude.api.Constants;
import com.google.api.client.http.HttpHeaders;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import l.b.c.h;
import l.b.c.p;
import l.b.c.q;
import l.b.c.w;
import l.b.c.z.a;

public final class a extends l.b.c.z.a {
    public static final List<String> a = Collections.singletonList("X-Cloud-Trace-Context");

    static {
        new w.b(w.b.f8152b, (w.a) null);
    }

    public <C> void a(p pVar, C c, a.C0164a<C> aVar) {
        String str;
        p pVar2 = pVar;
        C c2 = c;
        b.l.a.c.b.a.C(pVar2, "spanContext");
        b.l.a.c.b.a.C(aVar, "setter");
        b.l.a.c.b.a.C(c2, Constants.AMP_TRACKING_OPTION_CARRIER);
        StringBuilder sb = new StringBuilder();
        sb.append(pVar2.a.d());
        sb.append('/');
        q qVar = pVar2.f8128b;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        byte[] bArr = new byte[8];
        long j2 = qVar.f8130h;
        char[] cArr = h.a;
        bArr[7] = (byte) ((int) (j2 & 255));
        bArr[6] = (byte) ((int) ((j2 >> 8) & 255));
        bArr[5] = (byte) ((int) ((j2 >> 16) & 255));
        bArr[4] = (byte) ((int) ((j2 >> 24) & 255));
        bArr[3] = (byte) ((int) ((j2 >> 32) & 255));
        bArr[2] = (byte) ((int) ((j2 >> 40) & 255));
        bArr[1] = (byte) ((int) ((j2 >> 48) & 255));
        bArr[0] = (byte) ((int) ((j2 >> 56) & 255));
        allocate.put(bArr);
        long j3 = allocate.getLong(0);
        b.l.a.c.b.a.m(true, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", 10);
        int i2 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        String str2 = "0";
        if (i2 == 0) {
            str = str2;
        } else if (i2 > 0) {
            str = Long.toString(j3, 10);
        } else {
            char[] cArr2 = new char[64];
            long j4 = (j3 >>> 1) / ((long) 5);
            long j5 = (long) 10;
            int i3 = 63;
            cArr2[63] = Character.forDigit((int) (j3 - (j4 * j5)), 10);
            while (j4 > 0) {
                i3--;
                cArr2[i3] = Character.forDigit((int) (j4 % j5), 10);
                j4 /= j5;
            }
            str = new String(cArr2, i3, 64 - i3);
        }
        sb.append(str);
        sb.append(";o=");
        if (pVar2.c.a()) {
            str2 = "1";
        }
        sb.append(str2);
        ((HttpHeaders) c2).m("X-Cloud-Trace-Context", sb.toString());
    }
}
