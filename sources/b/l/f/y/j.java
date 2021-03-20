package b.l.f.y;

import java.nio.charset.Charset;

public final class j {
    public static final String a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f5838b;

    static {
        String name = Charset.defaultCharset().name();
        a = name;
        f5838b = "SJIS".equalsIgnoreCase(name) || "EUC_JP".equalsIgnoreCase(name);
    }
}
