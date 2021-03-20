package b.l.b.a.d.z;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public final class a {
    public static final d a = new b("-_.*", true);

    /* renamed from: b  reason: collision with root package name */
    public static final d f4832b = new b("-_.!~*'()@:$&,;=+", false);
    public static final d c = new b("-_.!~*'():$&,;=", false);
    public static final d d = new b("-_.!~*'()@:$,;/?:", false);

    static {
        new b("-_.!~*'()@:$&,;=+/?", false);
    }

    public static String a(String str) {
        try {
            return URLDecoder.decode(str, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }
}
