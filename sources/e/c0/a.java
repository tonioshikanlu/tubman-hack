package e.c0;

import e.x.c.i;
import java.nio.charset.Charset;

public final class a {
    public static final Charset a;

    /* renamed from: b  reason: collision with root package name */
    public static Charset f9877b;
    public static Charset c;
    public static final a d = null;

    static {
        Charset forName = Charset.forName("UTF-8");
        i.d(forName, "Charset.forName(\"UTF-8\")");
        a = forName;
        i.d(Charset.forName("UTF-16"), "Charset.forName(\"UTF-16\")");
        i.d(Charset.forName("UTF-16BE"), "Charset.forName(\"UTF-16BE\")");
        i.d(Charset.forName("UTF-16LE"), "Charset.forName(\"UTF-16LE\")");
        i.d(Charset.forName("US-ASCII"), "Charset.forName(\"US-ASCII\")");
        i.d(Charset.forName("ISO-8859-1"), "Charset.forName(\"ISO-8859-1\")");
    }
}
