package b.l.a.c.f.e;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

public final class j {
    public static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f3083b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f3083b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static int a(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int b(boolean z) {
        return z ? 1231 : 1237;
    }

    public static Object c(Object obj, Object obj2) {
        fm m2 = ((e0) obj).m();
        e0 e0Var = (e0) obj2;
        Objects.requireNonNull(m2);
        on onVar = (on) m2;
        if (onVar.f3214h.getClass().isInstance(e0Var)) {
            onVar.d((e) ((gm) e0Var));
            return onVar.b();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
