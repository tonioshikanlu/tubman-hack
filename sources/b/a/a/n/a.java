package b.a.a.n;

import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.Arrays;

public final class a extends k implements l<Byte, CharSequence> {

    /* renamed from: h  reason: collision with root package name */
    public static final a f350h = new a();

    public a() {
        super(1);
    }

    public Object invoke(Object obj) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
        i.d(format, "java.lang.String.format(this, *args)");
        return format;
    }
}
