package n.m0;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.exifinterface.media.ExifInterface;
import b.q.a.a;
import com.segment.analytics.internal.Iso8601Utils;
import e.c0.d;
import e.t.g;
import e.x.c.i;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.b0;
import n.c0;
import n.g0;
import n.h0;
import n.i0;
import n.j0;
import n.y;
import n.z;
import o.e;
import o.h;
import o.q;

public final class c {
    public static final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    public static final y f10150b = y.f10426i.c(new String[0]);
    public static final j0 c;
    public static final q d;

    /* renamed from: e  reason: collision with root package name */
    public static final TimeZone f10151e;
    public static final d f = new d("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: g  reason: collision with root package name */
    public static final String f10152g;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        i.e(bArr, "$this$toResponseBody");
        e eVar = new e();
        eVar.s0(bArr);
        i.e(eVar, "$this$asResponseBody");
        c = new i0(eVar, (b0) null, (long) 0);
        g0.a.c(g0.a, bArr, (b0) null, 0, 0, 7);
        q.a aVar = q.f10477j;
        h.a aVar2 = h.f10456l;
        d = aVar.c(aVar2.a("efbbbf"), aVar2.a("feff"), aVar2.a("fffe"), aVar2.a("0000ffff"), aVar2.a("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone(Iso8601Utils.GMT_ID);
        i.c(timeZone);
        f10151e = timeZone;
        Class<c0> cls = c0.class;
        String name = c0.class.getName();
        i.d(name, "OkHttpClient::class.java.name");
        String t = e.c0.h.t(name, "okhttp3.");
        i.e(t, "$this$removeSuffix");
        i.e("Client", "suffix");
        i.e(t, "$this$endsWith");
        i.e("Client", "suffix");
        if (e.c0.h.e(t, "Client", false, 2)) {
            t = t.substring(0, t.length() - "Client".length());
            i.d(t, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        f10152g = t;
    }

    public static final String A(String str, int i2, int i3) {
        i.e(str, "$this$trimSubstring");
        int n2 = n(str, i2, i3);
        String substring = str.substring(n2, o(str, n2, i3));
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final Throwable B(Exception exc, List<? extends Exception> list) {
        i.e(exc, "$this$withSuppressed");
        i.e(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception k2 : list) {
            a.k(exc, k2);
        }
        return exc;
    }

    public static final boolean a(z zVar, z zVar2) {
        i.e(zVar, "$this$canReuseConnectionFor");
        i.e(zVar2, "other");
        return i.a(zVar.f10431e, zVar2.f10431e) && zVar.f == zVar2.f && i.a(zVar.f10430b, zVar2.f10430b);
    }

    public static final int b(String str, long j2, TimeUnit timeUnit) {
        i.e(str, "name");
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        boolean z = true;
        if (!(i2 >= 0)) {
            throw new IllegalStateException(b.e.a.a.a.m(str, " < 0").toString());
        } else if (1 != 0) {
            long millis = timeUnit.toMillis(j2);
            if (millis <= ((long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
                if (millis == 0 && i2 > 0) {
                    z = false;
                }
                if (z) {
                    return (int) millis;
                }
                throw new IllegalArgumentException(b.e.a.a.a.m(str, " too small.").toString());
            }
            throw new IllegalArgumentException(b.e.a.a.a.m(str, " too large.").toString());
        } else {
            throw new IllegalStateException("unit == null".toString());
        }
    }

    public static final void c(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) {
        i.e(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        i.e(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    public static final int f(String str, char c2, int i2, int i3) {
        i.e(str, "$this$delimiterOffset");
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final int g(String str, String str2, int i2, int i3) {
        i.e(str, "$this$delimiterOffset");
        i.e(str2, "delimiters");
        while (i2 < i3) {
            if (e.c0.h.c(str2, str.charAt(i2), false, 2)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final boolean h(o.z zVar, int i2, TimeUnit timeUnit) {
        i.e(zVar, "$this$discard");
        i.e(timeUnit, "timeUnit");
        try {
            return v(zVar, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String str, Object... objArr) {
        i.e(str, "format");
        i.e(objArr, "args");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        i.d(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        i.e(strArr, "$this$hasIntersection");
        i.e(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String compare : strArr2) {
                        if (comparator.compare(str, compare) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long k(h0 h0Var) {
        i.e(h0Var, "$this$headersContentLength");
        String d2 = h0Var.f10105m.d("Content-Length");
        if (d2 != null) {
            i.e(d2, "$this$toLongOrDefault");
            try {
                return Long.parseLong(d2);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    @SafeVarargs
    public static final <T> List<T> l(T... tArr) {
        i.e(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(g.B(Arrays.copyOf(objArr, objArr.length)));
        i.d(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int m(String str) {
        i.e(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (i.g(charAt, 31) <= 0 || i.g(charAt, 127) >= 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int n(String str, int i2, int i3) {
        i.e(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final int o(String str, int i2, int i3) {
        i.e(str, "$this$indexOfLastNonAsciiWhitespace");
        int i4 = i3 - 1;
        if (i4 >= i2) {
            while (true) {
                char charAt = str.charAt(i4);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i4 == i2) {
                        break;
                    }
                    i4--;
                } else {
                    return i4 + 1;
                }
            }
        }
        return i2;
    }

    public static final String[] p(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        i.e(strArr, "$this$intersect");
        i.e(strArr2, "other");
        i.e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public static final int q(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        char c3 = 'a';
        if ('a' > c2 || 'f' < c2) {
            c3 = 'A';
            if ('A' > c2 || 'F' < c2) {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    public static final Charset r(o.g gVar, Charset charset) {
        String str;
        Charset charset2;
        Charset charset3;
        i.e(gVar, "$this$readBomAsCharset");
        i.e(charset, "default");
        int l0 = gVar.l0(d);
        if (l0 == -1) {
            return charset;
        }
        if (l0 == 0) {
            charset2 = StandardCharsets.UTF_8;
            str = "UTF_8";
        } else if (l0 == 1) {
            charset2 = StandardCharsets.UTF_16BE;
            str = "UTF_16BE";
        } else if (l0 != 2) {
            if (l0 == 3) {
                e.c0.a aVar = e.c0.a.d;
                charset3 = e.c0.a.c;
                if (charset3 == null) {
                    charset3 = Charset.forName("UTF-32BE");
                    i.d(charset3, "Charset.forName(\"UTF-32BE\")");
                    e.c0.a.c = charset3;
                }
            } else if (l0 == 4) {
                e.c0.a aVar2 = e.c0.a.d;
                charset3 = e.c0.a.f9877b;
                if (charset3 == null) {
                    charset3 = Charset.forName("UTF-32LE");
                    i.d(charset3, "Charset.forName(\"UTF-32LE\")");
                    e.c0.a.f9877b = charset3;
                }
            } else {
                throw new AssertionError();
            }
            return charset3;
        } else {
            charset2 = StandardCharsets.UTF_16LE;
            str = "UTF_16LE";
        }
        String str2 = str;
        Charset charset4 = charset2;
        i.d(charset4, str2);
        return charset4;
    }

    public static final <T> T s(Object obj, Class<T> cls, String str) {
        Object s;
        Class<Object> cls2 = Object.class;
        i.e(obj, "instance");
        i.e(cls, "fieldType");
        i.e(str, "fieldName");
        Class cls3 = obj.getClass();
        while (!i.a(cls3, cls2)) {
            try {
                Field declaredField = cls3.getDeclaredField(str);
                i.d(declaredField, "field");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (!cls.isInstance(obj2)) {
                    return null;
                }
                return cls.cast(obj2);
            } catch (NoSuchFieldException unused) {
                cls3 = cls3.getSuperclass();
                i.d(cls3, "c.superclass");
            }
        }
        if (!(!i.a(str, "delegate")) || (s = s(obj, cls2, "delegate")) == null) {
            return null;
        }
        return s(s, cls, str);
    }

    public static final int t(o.g gVar) {
        i.e(gVar, "$this$readMedium");
        return (gVar.readByte() & ExifInterface.MARKER) | ((gVar.readByte() & ExifInterface.MARKER) << 16) | ((gVar.readByte() & ExifInterface.MARKER) << 8);
    }

    public static final int u(e eVar, byte b2) {
        i.e(eVar, "$this$skipAll");
        int i2 = 0;
        while (!eVar.D() && eVar.N(0) == b2) {
            i2++;
            eVar.readByte();
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        if (r5 == androidx.recyclerview.widget.RecyclerView.FOREVER_NS) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        if (r5 != androidx.recyclerview.widget.RecyclerView.FOREVER_NS) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        r11.f().a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r11.f().d(r0 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        return r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean v(o.z r11, int r12, java.util.concurrent.TimeUnit r13) {
        /*
            java.lang.String r0 = "$this$skipAll"
            e.x.c.i.e(r11, r0)
            java.lang.String r0 = "timeUnit"
            e.x.c.i.e(r13, r0)
            long r0 = java.lang.System.nanoTime()
            o.a0 r2 = r11.f()
            boolean r2 = r2.e()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L_0x0027
            o.a0 r2 = r11.f()
            long r5 = r2.c()
            long r5 = r5 - r0
            goto L_0x0028
        L_0x0027:
            r5 = r3
        L_0x0028:
            o.a0 r2 = r11.f()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.d(r12)
            o.e r12 = new o.e     // Catch:{ InterruptedIOException -> 0x0068, all -> 0x0056 }
            r12.<init>()     // Catch:{ InterruptedIOException -> 0x0068, all -> 0x0056 }
        L_0x003e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.T(r12, r7)     // Catch:{ InterruptedIOException -> 0x0068, all -> 0x0056 }
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x0050
            long r7 = r12.f10453i     // Catch:{ InterruptedIOException -> 0x0068, all -> 0x0056 }
            r12.skip(r7)     // Catch:{ InterruptedIOException -> 0x0068, all -> 0x0056 }
            goto L_0x003e
        L_0x0050:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0075
            goto L_0x006d
        L_0x0056:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            o.a0 r11 = r11.f()
            if (r13 != 0) goto L_0x0063
            r11.a()
            goto L_0x0067
        L_0x0063:
            long r0 = r0 + r5
            r11.d(r0)
        L_0x0067:
            throw r12
        L_0x0068:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0075
        L_0x006d:
            o.a0 r11 = r11.f()
            r11.a()
            goto L_0x007d
        L_0x0075:
            o.a0 r11 = r11.f()
            long r0 = r0 + r5
            r11.d(r0)
        L_0x007d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.c.v(o.z, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final y w(List<n.m0.j.c> list) {
        i.e(list, "$this$toHeaders");
        ArrayList arrayList = new ArrayList(20);
        for (n.m0.j.c next : list) {
            h hVar = next.f10274b;
            h hVar2 = next.c;
            String y = hVar.y();
            String y2 = hVar2.y();
            i.e(y, "name");
            i.e(y2, "value");
            arrayList.add(y);
            arrayList.add(e.c0.h.N(y2).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return new y((String[]) array, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String x(n.z r4, boolean r5) {
        /*
            java.lang.String r0 = "$this$toHostHeader"
            e.x.c.i.e(r4, r0)
            java.lang.String r0 = r4.f10431e
            r1 = 0
            r2 = 2
            java.lang.String r3 = ":"
            boolean r0 = e.c0.h.d(r0, r3, r1, r2)
            if (r0 == 0) goto L_0x0020
            r0 = 91
            java.lang.StringBuilder r0 = b.e.a.a.a.v(r0)
            java.lang.String r1 = r4.f10431e
            r2 = 93
            java.lang.String r0 = b.e.a.a.a.p(r0, r1, r2)
            goto L_0x0022
        L_0x0020:
            java.lang.String r0 = r4.f10431e
        L_0x0022:
            if (r5 != 0) goto L_0x0055
            int r5 = r4.f
            java.lang.String r1 = r4.f10430b
            java.lang.String r2 = "scheme"
            e.x.c.i.e(r1, r2)
            int r2 = r1.hashCode()
            r3 = 3213448(0x310888, float:4.503E-39)
            if (r2 == r3) goto L_0x0047
            r3 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r2 == r3) goto L_0x003c
            goto L_0x0052
        L_0x003c:
            java.lang.String r2 = "https"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0052
            r1 = 443(0x1bb, float:6.21E-43)
            goto L_0x0053
        L_0x0047:
            java.lang.String r2 = "http"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0052
            r1 = 80
            goto L_0x0053
        L_0x0052:
            r1 = -1
        L_0x0053:
            if (r5 == r1) goto L_0x006b
        L_0x0055:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r0 = 58
            r5.append(r0)
            int r4 = r4.f
            r5.append(r4)
            java.lang.String r0 = r5.toString()
        L_0x006b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.c.x(n.z, boolean):java.lang.String");
    }

    public static final <T> List<T> y(List<? extends T> list) {
        i.e(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(g.a0(list));
        i.d(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int z(String str, int i2) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
                    return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }
}
