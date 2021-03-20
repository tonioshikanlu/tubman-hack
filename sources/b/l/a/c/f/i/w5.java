package b.l.a.c.f.i;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

public final class w5 {
    public static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f3798b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f3798b = bArr;
        ByteBuffer.wrap(bArr);
        int i2 = 0 + 0;
    }

    public static int a(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int b(boolean z) {
        return z ? 1231 : 1237;
    }

    public static Object c(Object obj, Object obj2) {
        f4 f = ((q6) obj).f();
        q6 q6Var = (q6) obj2;
        Objects.requireNonNull(f);
        m5 m5Var = (m5) f;
        if (m5Var.f3653h.getClass().isInstance(q6Var)) {
            m5Var.h((p5) ((g4) q6Var));
            return m5Var.l();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
