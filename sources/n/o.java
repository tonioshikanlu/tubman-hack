package n;

import androidx.recyclerview.widget.RecyclerView;
import e.c0.h;
import e.x.c.i;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.m0.c;
import n.m0.h.c;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

public final class o {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f10410j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f10411k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f10412l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f10413m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: n  reason: collision with root package name */
    public static final o f10414n = null;
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10415b;
    public final long c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f10416e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10417g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10418h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f10419i;

    public o(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = str;
        this.f10415b = str2;
        this.c = j2;
        this.d = str3;
        this.f10416e = str4;
        this.f = z;
        this.f10417g = z2;
        this.f10418h = z3;
        this.f10419i = z4;
    }

    public static final int a(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            boolean z2 = true;
            if ((charAt >= ' ' || charAt == 9) && charAt < 127 && (('0' > charAt || '9' < charAt) && (('a' > charAt || 'z' < charAt) && (('A' > charAt || 'Z' < charAt) && charAt != ':')))) {
                z2 = false;
            }
            if (z2 == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final long b(String str, int i2, int i3) {
        int a2 = a(str, i2, i3, false);
        Matcher matcher = f10413m.matcher(str);
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        while (a2 < i3) {
            int a3 = a(str, a2 + 1, i3, true);
            matcher.region(a2, a3);
            if (i5 == -1 && matcher.usePattern(f10413m).matches()) {
                String group = matcher.group(1);
                i.d(group, "matcher.group(1)");
                i5 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                i.d(group2, "matcher.group(2)");
                i8 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                i.d(group3, "matcher.group(3)");
                i9 = Integer.parseInt(group3);
            } else if (i6 != -1 || !matcher.usePattern(f10412l).matches()) {
                if (i7 == -1) {
                    Pattern pattern = f10411k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group4 = matcher.group(1);
                        i.d(group4, "matcher.group(1)");
                        Locale locale = Locale.US;
                        i.d(locale, "Locale.US");
                        String lowerCase = group4.toLowerCase(locale);
                        i.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        i.d(pattern2, "MONTH_PATTERN.pattern()");
                        i7 = h.l(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i4 == -1 && matcher.usePattern(f10410j).matches()) {
                    String group5 = matcher.group(1);
                    i.d(group5, "matcher.group(1)");
                    i4 = Integer.parseInt(group5);
                }
            } else {
                String group6 = matcher.group(1);
                i.d(group6, "matcher.group(1)");
                i6 = Integer.parseInt(group6);
            }
            a2 = a(str, a3 + 1, i3, false);
        }
        if (70 <= i4 && 99 >= i4) {
            i4 += 1900;
        }
        if (i4 >= 0 && 69 >= i4) {
            i4 += RecyclerView.MAX_SCROLL_DURATION;
        }
        if (i4 >= 1601) {
            if (i7 != -1) {
                if (1 <= i6 && 31 >= i6) {
                    if (i5 >= 0 && 23 >= i5) {
                        if (i8 >= 0 && 59 >= i8) {
                            if (i9 >= 0 && 59 >= i9) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(c.f10151e);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i4);
                                gregorianCalendar.set(2, i7 - 1);
                                gregorianCalendar.set(5, i6);
                                gregorianCalendar.set(11, i5);
                                gregorianCalendar.set(12, i8);
                                gregorianCalendar.set(13, i9);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final long c(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e2) {
            i.e("-?\\d+", "pattern");
            Pattern compile = Pattern.compile("-?\\d+");
            i.d(compile, "Pattern.compile(pattern)");
            i.e(compile, "nativePattern");
            i.e(str, "input");
            if (!compile.matcher(str).matches()) {
                throw e2;
            } else if (h.C(str, "-", false, 2)) {
                return Long.MIN_VALUE;
            } else {
                return RecyclerView.FOREVER_NS;
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            return i.a(oVar.a, this.a) && i.a(oVar.f10415b, this.f10415b) && oVar.c == this.c && i.a(oVar.d, this.d) && i.a(oVar.f10416e, this.f10416e) && oVar.f == this.f && oVar.f10417g == this.f10417g && oVar.f10418h == this.f10418h && oVar.f10419i == this.f10419i;
        }
    }

    @IgnoreJRERequirement
    public int hashCode() {
        int hashCode = this.f10415b.hashCode();
        int hashCode2 = Long.hashCode(this.c);
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.f10416e.hashCode();
        int hashCode5 = Boolean.hashCode(this.f);
        int hashCode6 = Boolean.hashCode(this.f10417g);
        int hashCode7 = Boolean.hashCode(this.f10418h);
        return Boolean.hashCode(this.f10419i) + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.f10415b);
        if (this.f10418h) {
            if (this.c == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb.append("; expires=");
                Date date = new Date(this.c);
                c.a aVar = n.m0.h.c.a;
                i.e(date, "$this$toHttpDateString");
                str = ((DateFormat) n.m0.h.c.a.get()).format(date);
                i.d(str, "STANDARD_DATE_FORMAT.get().format(this)");
            }
            sb.append(str);
        }
        if (!this.f10419i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f10416e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.f10417g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        i.d(sb2, "toString()");
        return sb2;
    }
}
