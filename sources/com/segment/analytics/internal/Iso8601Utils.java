package com.segment.analytics.internal;

import b.e.a.a.a;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public final class Iso8601Utils {
    public static final String GMT_ID = "GMT";
    public static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone(GMT_ID);

    private static boolean checkOffset(String str, int i2, char c) {
        return i2 < str.length() && str.charAt(i2) == c;
    }

    public static String format(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TIMEZONE_Z, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(24);
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        padInt(sb, gregorianCalendar.get(14), 3);
        sb.append('Z');
        return sb.toString();
    }

    public static String formatNanos(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TIMEZONE_Z, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(30);
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        padLong(sb, date instanceof NanoDate ? ((NanoDate) date).nanos() % 1000000000 : (long) gregorianCalendar.get(14), 9);
        sb.append('Z');
        return sb.toString();
    }

    private static int indexOfNonDigit(String str, int i2) {
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt < '0' || charAt > '9') {
                return i2;
            }
            i2++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i2, int i3) {
        String num = Integer.toString(i2);
        for (int length = i3 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    private static void padLong(StringBuilder sb, long j2, int i2) {
        String l2 = Long.toString(j2);
        sb.append(l2);
        for (int length = i2 - l2.length(); length > 0; length--) {
            sb.append('0');
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c6 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException -> 0x0192 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018a A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException -> 0x0192 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date parse(java.lang.String r17) {
        /*
            r1 = r17
            r0 = 4
            r2 = 0
            int r2 = parseInt(r1, r2, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r3 = 45
            boolean r4 = checkOffset(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            if (r4 == 0) goto L_0x0011
            r0 = 5
        L_0x0011:
            int r4 = r0 + 2
            int r0 = parseInt(r1, r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            boolean r5 = checkOffset(r1, r4, r3)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            if (r5 == 0) goto L_0x001f
            int r4 = r4 + 1
        L_0x001f:
            int r5 = r4 + 2
            int r4 = parseInt(r1, r4, r5)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r6 = 84
            boolean r6 = checkOffset(r1, r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r7 = 1
            if (r6 != 0) goto L_0x003f
            int r8 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            if (r8 > r5) goto L_0x003f
            java.util.GregorianCalendar r3 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            int r0 = r0 - r7
            r3.<init>(r2, r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            java.util.Date r0 = r3.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            return r0
        L_0x003f:
            r8 = 43
            r9 = 90
            if (r6 == 0) goto L_0x00b5
            int r5 = r5 + 1
            int r6 = r5 + 2
            int r5 = parseInt(r1, r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r10 = 58
            boolean r11 = checkOffset(r1, r6, r10)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            if (r11 == 0) goto L_0x0057
            int r6 = r6 + 1
        L_0x0057:
            int r11 = r6 + 2
            int r6 = parseInt(r1, r6, r11)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            boolean r10 = checkOffset(r1, r11, r10)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            if (r10 == 0) goto L_0x0065
            int r11 = r11 + 1
        L_0x0065:
            int r10 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            if (r10 <= r11) goto L_0x00b0
            char r10 = r1.charAt(r11)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            if (r10 == r9) goto L_0x00b0
            if (r10 == r8) goto L_0x00b0
            if (r10 == r3) goto L_0x00b0
            int r3 = r11 + 2
            int r10 = parseInt(r1, r11, r3)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r11 = 59
            if (r10 <= r11) goto L_0x0084
            r12 = 63
            if (r10 >= r12) goto L_0x0084
            r10 = r11
        L_0x0084:
            r11 = 46
            boolean r11 = checkOffset(r1, r3, r11)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            if (r11 == 0) goto L_0x00ae
            int r3 = r3 + 1
            int r11 = r3 + 1
            int r11 = indexOfNonDigit(r1, r11)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            int r12 = r3 + 3
            int r12 = java.lang.Math.min(r11, r12)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            int r13 = parseInt(r1, r3, r12)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r14 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r12 = r12 - r3
            int r3 = 3 - r12
            double r7 = (double) r3     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            double r7 = java.lang.Math.pow(r14, r7)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            double r13 = (double) r13     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            double r7 = r7 * r13
            int r3 = (int) r7     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r7 = r3
            r3 = r11
            goto L_0x00c0
        L_0x00ae:
            r7 = 0
            goto L_0x00c0
        L_0x00b0:
            r3 = 0
            r7 = r6
            r6 = r5
            r5 = r11
            goto L_0x00b8
        L_0x00b5:
            r3 = 0
            r6 = 0
            r7 = 0
        L_0x00b8:
            r10 = 0
            r16 = r7
            r7 = r3
            r3 = r5
            r5 = r6
            r6 = r16
        L_0x00c0:
            int r8 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            if (r8 <= r3) goto L_0x018a
            char r8 = r1.charAt(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            if (r8 != r9) goto L_0x00ce
            goto L_0x0159
        L_0x00ce:
            r9 = 43
            if (r8 == r9) goto L_0x00f3
            r9 = 45
            if (r8 != r9) goto L_0x00d7
            goto L_0x00f3
        L_0x00d7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r2.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            java.lang.String r3 = "Invalid time zone indicator '"
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r2.append(r8)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            java.lang.String r3 = "'"
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            java.lang.String r2 = r2.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r0.<init>(r2)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
        L_0x00f3:
            java.lang.String r3 = r1.substring(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            java.lang.String r8 = "+0000"
            boolean r8 = r8.equals(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            if (r8 != 0) goto L_0x0159
            java.lang.String r8 = "+00:00"
            boolean r8 = r8.equals(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            if (r8 == 0) goto L_0x0108
            goto L_0x0159
        L_0x0108:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r8.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            java.lang.String r9 = "GMT"
            r8.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r8.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            java.lang.String r3 = r8.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            java.util.TimeZone r8 = java.util.TimeZone.getTimeZone(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            java.lang.String r9 = r8.getID()     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            boolean r11 = r9.equals(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            if (r11 != 0) goto L_0x015b
            java.lang.String r11 = ":"
            java.lang.String r13 = ""
            java.lang.String r9 = r9.replace(r11, r13)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            boolean r9 = r9.equals(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            if (r9 == 0) goto L_0x0136
            goto L_0x015b
        L_0x0136:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r2.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            java.lang.String r4 = "Mismatching time zone indicator: "
            r2.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            java.lang.String r3 = " given, resolves to "
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            java.lang.String r3 = r8.getID()     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            java.lang.String r2 = r2.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r0.<init>(r2)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
        L_0x0159:
            java.util.TimeZone r8 = TIMEZONE_Z     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
        L_0x015b:
            java.util.GregorianCalendar r3 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r3.<init>(r8)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r8 = 0
            r3.setLenient(r8)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r8 = 1
            r3.set(r8, r2)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            int r0 = r0 - r8
            r2 = 2
            r3.set(r2, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r0 = 5
            r3.set(r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r0 = 11
            r3.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r0 = 12
            r3.set(r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r0 = 13
            r3.set(r0, r10)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            r0 = 14
            r3.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            java.util.Date r0 = r3.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            return r0
        L_0x018a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            java.lang.String r2 = "No time zone indicator"
            r0.<init>(r2)     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0194, IllegalArgumentException -> 0x0192 }
        L_0x0192:
            r0 = move-exception
            goto L_0x0195
        L_0x0194:
            r0 = move-exception
        L_0x0195:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Not an RFC 3339 date: "
            java.lang.String r1 = b.e.a.a.a.m(r3, r1)
            r2.<init>(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.internal.Iso8601Utils.parse(java.lang.String):java.util.Date");
    }

    private static int parseInt(String str, int i2, int i3) {
        int i4;
        int i5;
        if (i2 < 0 || i3 > str.length() || i2 > i3) {
            throw new NumberFormatException(str);
        }
        if (i2 < i3) {
            i5 = i2 + 1;
            int digit = Character.digit(str.charAt(i2), 10);
            if (digit >= 0) {
                i4 = -digit;
            } else {
                StringBuilder y = a.y("Invalid number: ");
                y.append(str.substring(i2, i3));
                throw new NumberFormatException(y.toString());
            }
        } else {
            i4 = 0;
            i5 = i2;
        }
        while (i5 < i3) {
            int i6 = i5 + 1;
            int digit2 = Character.digit(str.charAt(i5), 10);
            if (digit2 >= 0) {
                i4 = (i4 * 10) - digit2;
                i5 = i6;
            } else {
                StringBuilder y2 = a.y("Invalid number: ");
                y2.append(str.substring(i2, i3));
                throw new NumberFormatException(y2.toString());
            }
        }
        return -i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cb A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x019f A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException -> 0x01a7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.segment.analytics.internal.NanoDate parseWithNanos(java.lang.String r17) {
        /*
            r1 = r17
            r0 = 4
            r2 = 0
            int r2 = parseInt(r1, r2, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r3 = 45
            boolean r4 = checkOffset(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            if (r4 == 0) goto L_0x0011
            r0 = 5
        L_0x0011:
            int r4 = r0 + 2
            int r0 = parseInt(r1, r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            boolean r5 = checkOffset(r1, r4, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            if (r5 == 0) goto L_0x001f
            int r4 = r4 + 1
        L_0x001f:
            int r5 = r4 + 2
            int r4 = parseInt(r1, r4, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r6 = 84
            boolean r6 = checkOffset(r1, r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r7 = 1
            if (r6 != 0) goto L_0x0044
            int r8 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            if (r8 > r5) goto L_0x0044
            java.util.GregorianCalendar r3 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            int r0 = r0 - r7
            r3.<init>(r2, r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            com.segment.analytics.internal.NanoDate r0 = new com.segment.analytics.internal.NanoDate     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            java.util.Date r2 = r3.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r0.<init>((java.util.Date) r2)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            return r0
        L_0x0044:
            r8 = 43
            r9 = 90
            if (r6 == 0) goto L_0x00ba
            int r5 = r5 + 1
            int r6 = r5 + 2
            int r5 = parseInt(r1, r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r10 = 58
            boolean r11 = checkOffset(r1, r6, r10)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            if (r11 == 0) goto L_0x005c
            int r6 = r6 + 1
        L_0x005c:
            int r11 = r6 + 2
            int r6 = parseInt(r1, r6, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            boolean r10 = checkOffset(r1, r11, r10)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            if (r10 == 0) goto L_0x006a
            int r11 = r11 + 1
        L_0x006a:
            int r10 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            if (r10 <= r11) goto L_0x00b5
            char r10 = r1.charAt(r11)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            if (r10 == r9) goto L_0x00b5
            if (r10 == r8) goto L_0x00b5
            if (r10 == r3) goto L_0x00b5
            int r3 = r11 + 2
            int r10 = parseInt(r1, r11, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r11 = 59
            if (r10 <= r11) goto L_0x0089
            r12 = 63
            if (r10 >= r12) goto L_0x0089
            r10 = r11
        L_0x0089:
            r11 = 46
            boolean r11 = checkOffset(r1, r3, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            if (r11 == 0) goto L_0x00b3
            int r3 = r3 + 1
            int r11 = r3 + 1
            int r11 = indexOfNonDigit(r1, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            int r12 = r3 + 9
            int r12 = java.lang.Math.min(r11, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            int r13 = parseInt(r1, r3, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r14 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r12 = r12 - r3
            int r3 = 9 - r12
            double r7 = (double) r3     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            double r7 = java.lang.Math.pow(r14, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            double r13 = (double) r13     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            double r7 = r7 * r13
            int r3 = (int) r7     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r7 = r3
            r3 = r11
            goto L_0x00c5
        L_0x00b3:
            r7 = 0
            goto L_0x00c5
        L_0x00b5:
            r3 = 0
            r7 = r6
            r6 = r5
            r5 = r11
            goto L_0x00bd
        L_0x00ba:
            r3 = 0
            r6 = 0
            r7 = 0
        L_0x00bd:
            r10 = 0
            r16 = r7
            r7 = r3
            r3 = r5
            r5 = r6
            r6 = r16
        L_0x00c5:
            int r8 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            if (r8 <= r3) goto L_0x019f
            char r8 = r1.charAt(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            if (r8 != r9) goto L_0x00d3
            goto L_0x015e
        L_0x00d3:
            r9 = 43
            if (r8 == r9) goto L_0x00f8
            r9 = 45
            if (r8 != r9) goto L_0x00dc
            goto L_0x00f8
        L_0x00dc:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r2.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            java.lang.String r3 = "Invalid time zone indicator '"
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r2.append(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            java.lang.String r3 = "'"
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            java.lang.String r2 = r2.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r0.<init>(r2)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
        L_0x00f8:
            java.lang.String r3 = r1.substring(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            java.lang.String r8 = "+0000"
            boolean r8 = r8.equals(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            if (r8 != 0) goto L_0x015e
            java.lang.String r8 = "+00:00"
            boolean r8 = r8.equals(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            if (r8 == 0) goto L_0x010d
            goto L_0x015e
        L_0x010d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r8.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            java.lang.String r9 = "GMT"
            r8.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r8.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            java.lang.String r3 = r8.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            java.util.TimeZone r8 = java.util.TimeZone.getTimeZone(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            java.lang.String r9 = r8.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            boolean r11 = r9.equals(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            if (r11 != 0) goto L_0x0160
            java.lang.String r11 = ":"
            java.lang.String r13 = ""
            java.lang.String r9 = r9.replace(r11, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            boolean r9 = r9.equals(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            if (r9 == 0) goto L_0x013b
            goto L_0x0160
        L_0x013b:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r2.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            java.lang.String r4 = "Mismatching time zone indicator: "
            r2.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            java.lang.String r3 = " given, resolves to "
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            java.lang.String r3 = r8.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r2.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            java.lang.String r2 = r2.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r0.<init>(r2)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
        L_0x015e:
            java.util.TimeZone r8 = TIMEZONE_Z     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
        L_0x0160:
            java.util.GregorianCalendar r3 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r3.<init>(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r8 = 0
            r3.setLenient(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r8 = 1
            r3.set(r8, r2)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            int r0 = r0 - r8
            r2 = 2
            r3.set(r2, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r0 = 5
            r3.set(r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r0 = 11
            r3.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r0 = 12
            r3.set(r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r0 = 13
            r3.set(r0, r10)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r0 = 14
            r2 = 0
            r3.set(r0, r2)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            java.util.Date r0 = r3.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            long r2 = r0.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r4
            long r4 = (long) r7     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            long r2 = r2 + r4
            com.segment.analytics.internal.NanoDate r0 = new com.segment.analytics.internal.NanoDate     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            r0.<init>((long) r2)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            return r0
        L_0x019f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            java.lang.String r2 = "No time zone indicator"
            r0.<init>(r2)     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01a9, IllegalArgumentException -> 0x01a7 }
        L_0x01a7:
            r0 = move-exception
            goto L_0x01aa
        L_0x01a9:
            r0 = move-exception
        L_0x01aa:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Not an RFC 3339 date: "
            java.lang.String r1 = b.e.a.a.a.m(r3, r1)
            r2.<init>(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.internal.Iso8601Utils.parseWithNanos(java.lang.String):com.segment.analytics.internal.NanoDate");
    }
}
