package b.l.b.a.d;

import com.segment.analytics.internal.Iso8601Utils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Pattern;

public final class i implements Serializable {

    /* renamed from: k  reason: collision with root package name */
    public static final TimeZone f4806k = TimeZone.getTimeZone(Iso8601Utils.GMT_ID);

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f4807l = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d{1,9})?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");

    /* renamed from: h  reason: collision with root package name */
    public final long f4808h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f4809i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4810j;

    public i(boolean z, long j2, Integer num) {
        this.f4809i = z;
        this.f4808h = j2;
        this.f4810j = z ? 0 : num == null ? TimeZone.getDefault().getOffset(j2) / 60000 : num.intValue();
    }

    public static void a(StringBuilder sb, int i2, int i3) {
        if (i2 < 0) {
            sb.append('-');
            i2 = -i2;
        }
        int i4 = i2;
        while (i4 > 0) {
            i4 /= 10;
            i3--;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            sb.append('0');
        }
        if (i2 != 0) {
            sb.append(i2);
        }
    }

    public String b() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f4806k);
        gregorianCalendar.setTimeInMillis((((long) this.f4810j) * 60000) + this.f4808h);
        a(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        a(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        a(sb, gregorianCalendar.get(5), 2);
        if (!this.f4809i) {
            sb.append('T');
            a(sb, gregorianCalendar.get(11), 2);
            sb.append(':');
            a(sb, gregorianCalendar.get(12), 2);
            sb.append(':');
            a(sb, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb.append('.');
                a(sb, gregorianCalendar.get(14), 3);
            }
            int i2 = this.f4810j;
            if (i2 == 0) {
                sb.append('Z');
            } else {
                if (i2 > 0) {
                    sb.append('+');
                } else {
                    sb.append('-');
                    i2 = -i2;
                }
                a(sb, i2 / 60, 2);
                sb.append(':');
                a(sb, i2 % 60, 2);
            }
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f4809i == iVar.f4809i && this.f4808h == iVar.f4808h && this.f4810j == iVar.f4810j;
    }

    public int hashCode() {
        long[] jArr = new long[3];
        jArr[0] = this.f4808h;
        jArr[1] = this.f4809i ? 1 : 0;
        jArr[2] = (long) this.f4810j;
        return Arrays.hashCode(jArr);
    }

    public String toString() {
        return b();
    }
}
