package b.j.a.c.b0.a0;

import b.j.a.b.l;
import b.j.a.c.c0.c;
import b.j.a.c.g;
import b.j.a.c.i;
import b.j.a.c.k;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

public abstract class m<T> extends c0<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f1707k = 0;

    public static class a extends m<Object> {

        /* renamed from: l  reason: collision with root package name */
        public final int f1708l;

        public a(Class<?> cls, int i2) {
            super(cls);
            this.f1708l = i2;
        }

        public Object c0(String str, g gVar) {
            switch (this.f1708l) {
                case 1:
                    return new File(str);
                case 2:
                    return new URL(str);
                case 3:
                    return URI.create(str);
                case 4:
                    try {
                        return gVar.h().l(str);
                    } catch (Exception e2) {
                        gVar.B(this.f1761h, str, b.j.a.c.j0.g.r(e2));
                        throw null;
                    }
                case 5:
                    return gVar.h().h(str);
                case 6:
                    return Currency.getInstance(str);
                case 7:
                    return Pattern.compile(str);
                case 8:
                    int g0 = g0(str);
                    if (g0 < 0) {
                        return new Locale(str);
                    }
                    String substring = str.substring(0, g0);
                    String substring2 = str.substring(g0 + 1);
                    int g02 = g0(substring2);
                    return g02 < 0 ? new Locale(substring, substring2) : new Locale(substring, substring2.substring(0, g02), substring2.substring(g02 + 1));
                case 9:
                    return Charset.forName(str);
                case 10:
                    return TimeZone.getTimeZone(str);
                case 11:
                    return InetAddress.getByName(str);
                case 12:
                    if (str.startsWith("[")) {
                        int lastIndexOf = str.lastIndexOf(93);
                        if (lastIndexOf != -1) {
                            int indexOf = str.indexOf(58, lastIndexOf);
                            return new InetSocketAddress(str.substring(0, lastIndexOf + 1), indexOf > -1 ? Integer.parseInt(str.substring(indexOf + 1)) : 0);
                        }
                        throw new c(gVar.f1996m, "Bracketed IPv6 address must contain closing bracket", str, InetSocketAddress.class);
                    }
                    int indexOf2 = str.indexOf(58);
                    if (indexOf2 >= 0) {
                        int i2 = indexOf2 + 1;
                        if (str.indexOf(58, i2) < 0) {
                            return new InetSocketAddress(str.substring(0, indexOf2), Integer.parseInt(str.substring(i2)));
                        }
                    }
                    return new InetSocketAddress(str, 0);
                case 13:
                    return new StringBuilder(str);
                default:
                    b.j.a.b.w.m.a();
                    throw null;
            }
        }

        public Object e0() {
            int i2 = this.f1708l;
            if (i2 == 3) {
                return URI.create("");
            }
            if (i2 == 8) {
                return Locale.ROOT;
            }
            if (i2 == 13) {
                return new StringBuilder();
            }
            return null;
        }

        public int g0(String str) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt == '_' || charAt == '-') {
                    return i2;
                }
            }
            return -1;
        }
    }

    public m(Class<?> cls) {
        super(cls);
    }

    public static a f0(Class<?> cls) {
        int i2;
        if (cls == File.class) {
            i2 = 1;
        } else if (cls == URL.class) {
            i2 = 2;
        } else if (cls == URI.class) {
            i2 = 3;
        } else if (cls == Class.class) {
            i2 = 4;
        } else if (cls == i.class) {
            i2 = 5;
        } else if (cls == Currency.class) {
            i2 = 6;
        } else if (cls == Pattern.class) {
            i2 = 7;
        } else if (cls == Locale.class) {
            i2 = 8;
        } else if (cls == Charset.class) {
            i2 = 9;
        } else if (cls == TimeZone.class) {
            i2 = 10;
        } else if (cls == InetAddress.class) {
            i2 = 11;
        } else if (cls == InetSocketAddress.class) {
            i2 = 12;
        } else if (cls != StringBuilder.class) {
            return null;
        } else {
            i2 = 13;
        }
        return new a(cls, i2);
    }

    public abstract T c0(String str, g gVar);

    public T d(b.j.a.b.i iVar, g gVar) {
        String H0 = iVar.H0();
        if (H0 != null) {
            if (H0.length() != 0) {
                String trim = H0.trim();
                if (trim.length() != 0) {
                    try {
                        return c0(trim, gVar);
                    } catch (IllegalArgumentException | MalformedURLException e2) {
                        String str = "not a valid textual representation";
                        String message = e2.getMessage();
                        if (message != null) {
                            str = b.e.a.a.a.n(str, ", problem: ", message);
                        }
                        k e0 = gVar.e0(trim, this.f1761h, str);
                        e0.initCause(e2);
                        throw e0;
                    }
                }
            }
            return e0();
        }
        l g0 = iVar.g0();
        if (g0 == l.START_ARRAY) {
            return v(iVar, gVar);
        }
        if (g0 == l.VALUE_EMBEDDED_OBJECT) {
            T o0 = iVar.o0();
            if (o0 == null) {
                return null;
            }
            return this.f1761h.isAssignableFrom(o0.getClass()) ? o0 : d0(o0, gVar);
        }
        gVar.G(this.f1761h, iVar);
        throw null;
    }

    public T d0(Object obj, g gVar) {
        gVar.Y(this, "Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this.f1761h.getName());
        throw null;
    }

    public T e0() {
        return null;
    }
}
