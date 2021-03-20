package b.l.a.c.f.i;

import java.io.IOException;

public class y5 extends IOException {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f3814h = 0;

    public y5(String str) {
        super(str);
    }

    public static y5 a() {
        return new y5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static y5 b() {
        return new y5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static y5 c() {
        return new y5("Failed to parse the message.");
    }

    public static y5 d() {
        return new y5("Protocol message had invalid UTF-8.");
    }
}
