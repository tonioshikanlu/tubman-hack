package b.j.a.c.b0.a0;

import b.j.a.c.i;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class n {
    public static final HashSet<String> a = new HashSet<>();

    static {
        Class[] clsArr = {UUID.class, AtomicBoolean.class, StackTraceElement.class, ByteBuffer.class, Void.class};
        for (int i2 = 0; i2 < 5; i2++) {
            a.add(clsArr[i2].getName());
        }
        int i3 = m.f1707k;
        Class[] clsArr2 = {File.class, URL.class, URI.class, Class.class, i.class, Currency.class, Pattern.class, Locale.class, Charset.class, TimeZone.class, InetAddress.class, InetSocketAddress.class, StringBuilder.class};
        for (int i4 = 0; i4 < 13; i4++) {
            a.add(clsArr2[i4].getName());
        }
    }
}
