package b.j.a.c.j0;

import androidx.core.app.NotificationManagerCompat;
import com.google.android.material.datepicker.UtcDates;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class y extends DateFormat {

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f2245n = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f2246o = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");

    /* renamed from: p  reason: collision with root package name */
    public static final String[] f2247p = {"yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};

    /* renamed from: q  reason: collision with root package name */
    public static final TimeZone f2248q;
    public static final Locale r;
    public static final DateFormat s;
    public static final DateFormat t;
    public static final y u = new y();
    public static final Calendar v;

    /* renamed from: h  reason: collision with root package name */
    public transient TimeZone f2249h;

    /* renamed from: i  reason: collision with root package name */
    public final Locale f2250i;

    /* renamed from: j  reason: collision with root package name */
    public Boolean f2251j;

    /* renamed from: k  reason: collision with root package name */
    public transient Calendar f2252k;

    /* renamed from: l  reason: collision with root package name */
    public transient DateFormat f2253l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2254m;

    static {
        try {
            TimeZone timeZone = TimeZone.getTimeZone(UtcDates.UTC);
            f2248q = timeZone;
            Locale locale = Locale.US;
            r = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
            s = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", locale);
            t = simpleDateFormat2;
            simpleDateFormat2.setTimeZone(timeZone);
            v = new GregorianCalendar(timeZone, locale);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public y() {
        this.f2254m = false;
        this.f2250i = r;
    }

    public y(TimeZone timeZone, Locale locale, Boolean bool, boolean z) {
        this.f2254m = false;
        this.f2249h = timeZone;
        this.f2250i = locale;
        this.f2251j = bool;
        this.f2254m = z;
    }

    public static int b(String str, int i2) {
        return (str.charAt(i2 + 1) - '0') + ((str.charAt(i2) - '0') * 10);
    }

    public static int c(String str, int i2) {
        int charAt = ((str.charAt(i2 + 1) - '0') * 100) + ((str.charAt(i2) - '0') * 1000);
        return (str.charAt(i2 + 3) - '0') + ((str.charAt(i2 + 2) - '0') * 10) + charAt;
    }

    public static void g(StringBuffer stringBuffer, int i2) {
        int i3 = i2 / 10;
        if (i3 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i3 + 48));
            i2 -= i3 * 10;
        }
        stringBuffer.append((char) (i2 + 48));
    }

    public static void h(StringBuffer stringBuffer, int i2) {
        int i3 = i2 / 100;
        if (i3 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            if (i3 > 99) {
                stringBuffer.append(i3);
            } else {
                g(stringBuffer, i3);
            }
            i2 -= i3 * 100;
        }
        g(stringBuffer, i2);
    }

    public Calendar a(TimeZone timeZone) {
        Calendar calendar = this.f2252k;
        if (calendar == null) {
            calendar = (Calendar) v.clone();
            this.f2252k = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    public Object clone() {
        return new y(this.f2249h, this.f2250i, this.f2251j, this.f2254m);
    }

    public Date d(String str) {
        char c;
        String str2;
        int i2;
        String str3 = str;
        int length = str.length();
        TimeZone timeZone = f2248q;
        if (!(this.f2249h == null || 'Z' == str3.charAt(length - 1))) {
            timeZone = this.f2249h;
        }
        Calendar a = a(timeZone);
        a.clear();
        int i3 = 0;
        if (length > 10) {
            Matcher matcher = f2246o.matcher(str3);
            if (matcher.matches()) {
                int start = matcher.start(2);
                int end = matcher.end(2);
                int i4 = end - start;
                if (i4 > 1) {
                    int b2 = b(str3, start + 1) * 3600;
                    if (i4 >= 5) {
                        b2 += b(str3, end - 2) * 60;
                    }
                    a.set(15, str3.charAt(start) == '-' ? b2 * NotificationManagerCompat.IMPORTANCE_UNSPECIFIED : b2 * 1000);
                    a.set(16, 0);
                }
                int c2 = c(str3, 0);
                int b3 = b(str3, 5) - 1;
                Matcher matcher2 = matcher;
                a.set(c2, b3, b(str3, 8), b(str3, 11), b(str3, 14), (length <= 16 || str3.charAt(16) != ':') ? 0 : b(str3, 17));
                int start2 = matcher2.start(1) + 1;
                int end2 = matcher2.end(1);
                if (start2 < end2 && (i2 = end2 - start2) != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3 || i2 <= 9) {
                                i3 = 0 + (str3.charAt(start2 + 2) - '0');
                            } else {
                                throw new ParseException(String.format("Cannot parse date \"%s\": invalid fractional seconds '%s'; can use at most 9 digits", new Object[]{str3, matcher2.group(1).substring(1)}), start2);
                            }
                        }
                        i3 += (str3.charAt(start2 + 1) - '0') * 10;
                    }
                    i3 += (str3.charAt(start2) - '0') * 100;
                }
                a.set(14, i3);
                return a.getTime();
            }
            c = 1;
            str2 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
        } else if (f2245n.matcher(str3).matches()) {
            a.set(c(str3, 0), b(str3, 5) - 1, b(str3, 8), 0, 0, 0);
            a.set(14, 0);
            return a.getTime();
        } else {
            str2 = "yyyy-MM-dd";
            c = 1;
        }
        Object[] objArr = new Object[3];
        objArr[0] = str3;
        objArr[c] = str2;
        objArr[2] = this.f2251j;
        throw new ParseException(String.format("Cannot parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)", objArr), 0);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        if (r5 < 0) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009f, code lost:
        if (r0 == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e5, code lost:
        if (r1 != null) goto L_0x00e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Date f(java.lang.String r8, java.text.ParsePosition r9) {
        /*
            r7 = this;
            int r0 = r8.length()
            r1 = 7
            r2 = 45
            r3 = 1
            r4 = 0
            if (r0 < r1) goto L_0x0034
            char r0 = r8.charAt(r4)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 3
            char r0 = r8.charAt(r0)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 4
            char r0 = r8.charAt(r0)
            if (r0 != r2) goto L_0x0034
            r0 = 5
            char r0 = r8.charAt(r0)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x0034
            r0 = r3
            goto L_0x0035
        L_0x0034:
            r0 = r4
        L_0x0035:
            if (r0 == 0) goto L_0x0058
            java.util.Date r8 = r7.d(r8)     // Catch:{ IllegalArgumentException -> 0x003c }
            return r8
        L_0x003c:
            r0 = move-exception
            java.text.ParseException r1 = new java.text.ParseException
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r8
            java.lang.String r8 = r0.getMessage()
            r2[r3] = r8
            java.lang.String r8 = "Cannot parse date \"%s\", problem: %s"
            java.lang.String r8 = java.lang.String.format(r8, r2)
            int r9 = r9.getErrorIndex()
            r1.<init>(r8, r9)
            throw r1
        L_0x0058:
            int r0 = r8.length()
        L_0x005c:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0070
            char r1 = r8.charAt(r0)
            r5 = 48
            if (r1 < r5) goto L_0x006c
            r5 = 57
            if (r1 <= r5) goto L_0x005c
        L_0x006c:
            if (r0 > 0) goto L_0x0070
            if (r1 == r2) goto L_0x005c
        L_0x0070:
            if (r0 >= 0) goto L_0x00bf
            char r0 = r8.charAt(r4)
            if (r0 == r2) goto L_0x00a1
            java.lang.String r0 = b.j.a.b.s.f.f1479b
            int r1 = r0.length()
            int r2 = r8.length()
            if (r2 >= r1) goto L_0x0085
            goto L_0x0098
        L_0x0085:
            if (r2 <= r1) goto L_0x0088
            goto L_0x009a
        L_0x0088:
            r2 = r4
        L_0x0089:
            if (r2 >= r1) goto L_0x0098
            char r5 = r8.charAt(r2)
            char r6 = r0.charAt(r2)
            int r5 = r5 - r6
            if (r5 == 0) goto L_0x009c
            if (r5 >= 0) goto L_0x009a
        L_0x0098:
            r0 = r3
            goto L_0x009f
        L_0x009a:
            r0 = r4
            goto L_0x009f
        L_0x009c:
            int r2 = r2 + 1
            goto L_0x0089
        L_0x009f:
            if (r0 == 0) goto L_0x00bf
        L_0x00a1:
            long r8 = b.j.a.b.s.f.f(r8)     // Catch:{ NumberFormatException -> 0x00ab }
            java.util.Date r0 = new java.util.Date
            r0.<init>(r8)
            return r0
        L_0x00ab:
            java.text.ParseException r0 = new java.text.ParseException
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r8
            java.lang.String r8 = "Timestamp value %s out of 64-bit value range"
            java.lang.String r8 = java.lang.String.format(r8, r1)
            int r9 = r9.getErrorIndex()
            r0.<init>(r8, r9)
            throw r0
        L_0x00bf:
            java.text.DateFormat r0 = r7.f2253l
            if (r0 != 0) goto L_0x00f5
            java.text.DateFormat r0 = s
            java.util.TimeZone r1 = r7.f2249h
            java.util.Locale r2 = r7.f2250i
            java.lang.Boolean r3 = r7.f2251j
            java.util.Locale r4 = r
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x00df
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r4 = "EEE, dd MMM yyyy HH:mm:ss zzz"
            r0.<init>(r4, r2)
            if (r1 != 0) goto L_0x00e7
            java.util.TimeZone r1 = f2248q
            goto L_0x00e7
        L_0x00df:
            java.lang.Object r0 = r0.clone()
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            if (r1 == 0) goto L_0x00ea
        L_0x00e7:
            r0.setTimeZone(r1)
        L_0x00ea:
            if (r3 == 0) goto L_0x00f3
            boolean r1 = r3.booleanValue()
            r0.setLenient(r1)
        L_0x00f3:
            r7.f2253l = r0
        L_0x00f5:
            java.text.DateFormat r0 = r7.f2253l
            java.util.Date r8 = r0.parse(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.j0.y.f(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this.f2249h;
        if (timeZone == null) {
            timeZone = f2248q;
        }
        Calendar a = a(timeZone);
        a.setTime(date);
        int i2 = a.get(1);
        char c = '+';
        if (a.get(0) != 0) {
            if (i2 > 9999) {
                stringBuffer.append('+');
            }
            h(stringBuffer, i2);
        } else if (i2 == 1) {
            stringBuffer.append("+0000");
        } else {
            stringBuffer.append('-');
            h(stringBuffer, i2 - 1);
        }
        stringBuffer.append('-');
        g(stringBuffer, a.get(2) + 1);
        stringBuffer.append('-');
        g(stringBuffer, a.get(5));
        stringBuffer.append('T');
        g(stringBuffer, a.get(11));
        stringBuffer.append(':');
        g(stringBuffer, a.get(12));
        stringBuffer.append(':');
        g(stringBuffer, a.get(13));
        stringBuffer.append('.');
        int i3 = a.get(14);
        int i4 = i3 / 100;
        if (i4 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i4 + 48));
            i3 -= i4 * 100;
        }
        g(stringBuffer, i3);
        int offset = timeZone.getOffset(a.getTimeInMillis());
        if (offset != 0) {
            int i5 = offset / 60000;
            int abs = Math.abs(i5 / 60);
            int abs2 = Math.abs(i5 % 60);
            if (offset < 0) {
                c = '-';
            }
            stringBuffer.append(c);
            g(stringBuffer, abs);
            if (this.f2254m) {
                stringBuffer.append(':');
            }
            g(stringBuffer, abs2);
        } else if (this.f2254m) {
            stringBuffer.append("+00:00");
        } else {
            stringBuffer.append("+0000");
        }
        return stringBuffer;
    }

    public TimeZone getTimeZone() {
        return this.f2249h;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public y i(Boolean bool) {
        Boolean bool2 = this.f2251j;
        if (bool == bool2 || bool.equals(bool2)) {
            return this;
        }
        return new y(this.f2249h, this.f2250i, bool, this.f2254m);
    }

    public boolean isLenient() {
        Boolean bool = this.f2251j;
        return bool == null || bool.booleanValue();
    }

    public y j(Locale locale) {
        return locale.equals(this.f2250i) ? this : new y(this.f2249h, locale, this.f2251j, this.f2254m);
    }

    public y k(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = f2248q;
        }
        TimeZone timeZone2 = this.f2249h;
        return (timeZone == timeZone2 || timeZone.equals(timeZone2)) ? this : new y(timeZone, this.f2250i, this.f2251j, this.f2254m);
    }

    public Date parse(String str) {
        String trim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date f = f(trim, parsePosition);
        if (f != null) {
            return f;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : f2247p) {
            if (sb.length() > 0) {
                sb.append("\", \"");
            } else {
                sb.append('\"');
            }
            sb.append(str2);
        }
        sb.append('\"');
        throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", new Object[]{trim, sb.toString()}), parsePosition.getErrorIndex());
    }

    public Date parse(String str, ParsePosition parsePosition) {
        try {
            return f(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }

    public void setLenient(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Boolean bool = this.f2251j;
        if (!(valueOf == bool || (valueOf != null && valueOf.equals(bool)))) {
            this.f2251j = valueOf;
            this.f2253l = null;
        }
    }

    public void setTimeZone(TimeZone timeZone) {
        if (!timeZone.equals(this.f2249h)) {
            this.f2253l = null;
            this.f2249h = timeZone;
        }
    }

    public String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", new Object[]{y.class.getName(), this.f2249h, this.f2250i, this.f2251j});
    }
}
