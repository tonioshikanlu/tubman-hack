package b.l.a.c.f.e;

import java.io.IOException;

public class l extends IOException {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f3117h = 0;

    public l(String str) {
        super(str);
    }

    public static l a() {
        return new l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static l b() {
        return new l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static l c() {
        return new l("CodedInputStream encountered a malformed varint.");
    }

    public static l d() {
        return new l("Protocol message contained an invalid tag (zero).");
    }

    public static l e() {
        return new l("Protocol message end-group tag did not match expected tag.");
    }

    public static l f() {
        return new l("Failed to parse the message.");
    }

    public static l g() {
        return new l("Protocol message had invalid UTF-8.");
    }
}
