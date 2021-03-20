package e.c0;

import b.q.a.a;
import e.a.a.a.y0.m.o1.c;
import e.a0.b;
import e.a0.d;
import e.a0.e;
import e.b0.q;
import e.b0.s;
import e.t.g;
import e.x.b.l;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class h extends f {
    public static final boolean A(String str, String str2, boolean z) {
        i.e(str, "$this$startsWith");
        i.e(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return r(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean B(String str, String str2, int i2, boolean z, int i3) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        return z(str, str2, i2, z);
    }

    public static /* synthetic */ boolean C(String str, String str2, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return A(str, str2, z);
    }

    public static final String D(CharSequence charSequence, d dVar) {
        i.e(charSequence, "$this$substring");
        i.e(dVar, "range");
        return charSequence.subSequence(dVar.getStart().intValue(), dVar.getEndInclusive().intValue() + 1).toString();
    }

    public static final String E(String str, String str2, String str3) {
        i.e(str, "$this$substringAfter");
        i.e(str2, "delimiter");
        i.e(str3, "missingDelimiterValue");
        int l2 = l(str, str2, 0, false, 6);
        if (l2 == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + l2, str.length());
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String F(String str, String str2, String str3, int i2) {
        return E(str, str2, (i2 & 2) != 0 ? str : null);
    }

    public static final String G(String str, char c, String str2) {
        i.e(str, "$this$substringAfterLast");
        i.e(str2, "missingDelimiterValue");
        int o2 = o(str, c, 0, false, 6);
        if (o2 == -1) {
            return str2;
        }
        String substring = str.substring(o2 + 1, str.length());
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String H(String str, char c, String str2, int i2) {
        return G(str, c, (i2 & 2) != 0 ? str : null);
    }

    public static String I(String str, char c, String str2, int i2) {
        String str3 = (i2 & 2) != 0 ? str : null;
        i.e(str, "$this$substringBefore");
        i.e(str3, "missingDelimiterValue");
        int k2 = k(str, c, 0, false, 6);
        if (k2 == -1) {
            return str3;
        }
        String substring = str.substring(0, k2);
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static String J(String str, String str2, String str3, int i2) {
        String str4 = (i2 & 2) != 0 ? str : null;
        i.e(str, "$this$substringBefore");
        i.e(str2, "delimiter");
        i.e(str4, "missingDelimiterValue");
        int l2 = l(str, str2, 0, false, 6);
        if (l2 == -1) {
            return str4;
        }
        String substring = str.substring(0, l2);
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final Integer K(String str) {
        i.e(str, "$this$toIntOrNull");
        return L(str, 10);
    }

    public static final Integer L(String str, int i2) {
        int i3;
        int i4;
        i.e(str, "$this$toIntOrNull");
        c.q(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char charAt = str.charAt(0);
        int i6 = -2147483647;
        boolean z = true;
        if (i.g(charAt, 48) >= 0) {
            i3 = 0;
            z = false;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i6 = Integer.MIN_VALUE;
                i3 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                i3 = 1;
                z = false;
            }
        }
        int i7 = -59652323;
        while (i3 < length) {
            int digit = Character.digit(str.charAt(i3), i2);
            if (digit < 0) {
                return null;
            }
            if ((i5 < i7 && (i7 != -59652323 || i5 < (i7 = i6 / i2))) || (i4 = i5 * i2) < i6 + digit) {
                return null;
            }
            i5 = i4 - digit;
            i3++;
        }
        if (!z) {
            i5 = -i5;
        }
        return Integer.valueOf(i5);
    }

    public static final Long M(String str, int i2) {
        String str2 = str;
        int i3 = i2;
        i.e(str2, "$this$toLongOrNull");
        c.q(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str2.charAt(0);
        long j2 = -9223372036854775807L;
        boolean z = true;
        if (i.g(charAt, 48) >= 0) {
            z = false;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                j2 = Long.MIN_VALUE;
                i4 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
                i4 = 1;
            }
        }
        long j3 = 0;
        long j4 = -256204778801521550L;
        long j5 = -256204778801521550L;
        while (i4 < length) {
            int digit = Character.digit(str2.charAt(i4), i3);
            if (digit < 0) {
                return null;
            }
            if (j3 < j5) {
                if (j5 == j4) {
                    j5 = j2 / ((long) i3);
                    if (j3 < j5) {
                    }
                }
                return null;
            }
            long j6 = j3 * ((long) i3);
            long j7 = (long) digit;
            if (j6 < j2 + j7) {
                return null;
            }
            j3 = j6 - j7;
            i4++;
            j4 = -256204778801521550L;
        }
        if (!z) {
            j3 = -j3;
        }
        return Long.valueOf(j3);
    }

    public static final CharSequence N(CharSequence charSequence) {
        i.e(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean R = c.R(charSequence.charAt(!z ? i2 : length));
            if (!z) {
                if (!R) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!R) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String O(java.lang.String r13, java.lang.String r14, int r15) {
        /*
            r14 = r15 & 1
            r15 = 0
            if (r14 == 0) goto L_0x0008
            java.lang.String r14 = "|"
            goto L_0x0009
        L_0x0008:
            r14 = r15
        L_0x0009:
            java.lang.String r0 = "$this$trimMargin"
            e.x.c.i.e(r13, r0)
            java.lang.String r0 = "marginPrefix"
            e.x.c.i.e(r14, r0)
            java.lang.String r1 = "$this$replaceIndentByMargin"
            e.x.c.i.e(r13, r1)
            java.lang.String r1 = ""
            java.lang.String r2 = "newIndent"
            e.x.c.i.e(r1, r2)
            e.x.c.i.e(r14, r0)
            boolean r0 = n(r14)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = "$this$lines"
            e.x.c.i.e(r13, r0)
            java.lang.String r0 = "$this$lineSequence"
            e.x.c.i.e(r13, r0)
            java.lang.String r0 = "\r\n"
            java.lang.String r1 = "\n"
            java.lang.String r2 = "\r"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            r1 = 6
            r2 = 0
            e.b0.h r0 = y(r13, r0, r2, r2, r1)
            java.util.List r0 = e.b0.s.j(r0)
            int r13 = r13.length()
            int r1 = r0.size()
            int r1 = r1 * r2
            int r1 = r1 + r13
            e.c0.g r13 = e.c0.g.f9888h
            int r3 = e.t.g.s(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
            r5 = r2
        L_0x0062:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x00c5
            java.lang.Object r6 = r0.next()
            int r7 = r5 + 1
            if (r5 < 0) goto L_0x00c1
            java.lang.String r6 = (java.lang.String) r6
            if (r5 == 0) goto L_0x0076
            if (r5 != r3) goto L_0x007e
        L_0x0076:
            boolean r5 = n(r6)
            if (r5 == 0) goto L_0x007e
            r6 = r15
            goto L_0x00ba
        L_0x007e:
            int r5 = r6.length()
            r8 = r2
        L_0x0083:
            r9 = -1
            if (r8 >= r5) goto L_0x0096
            char r10 = r6.charAt(r8)
            boolean r10 = e.a.a.a.y0.m.o1.c.R(r10)
            r10 = r10 ^ 1
            if (r10 == 0) goto L_0x0093
            goto L_0x0097
        L_0x0093:
            int r8 = r8 + 1
            goto L_0x0083
        L_0x0096:
            r8 = r9
        L_0x0097:
            if (r8 != r9) goto L_0x009a
            goto L_0x00b0
        L_0x009a:
            r5 = 4
            boolean r5 = B(r6, r14, r8, r2, r5)
            if (r5 == 0) goto L_0x00b0
            int r5 = r14.length()
            int r5 = r5 + r8
            java.lang.String r5 = r6.substring(r5)
            java.lang.String r8 = "(this as java.lang.String).substring(startIndex)"
            e.x.c.i.d(r5, r8)
            goto L_0x00b1
        L_0x00b0:
            r5 = r15
        L_0x00b1:
            if (r5 == 0) goto L_0x00ba
            java.lang.Object r5 = r13.invoke(r5)
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
        L_0x00ba:
            if (r6 == 0) goto L_0x00bf
            r4.add(r6)
        L_0x00bf:
            r5 = r7
            goto L_0x0062
        L_0x00c1:
            e.t.g.S()
            throw r15
        L_0x00c5:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r1)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 124(0x7c, float:1.74E-43)
            java.lang.String r6 = "\n"
            r5 = r13
            e.t.g.v(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            e.x.c.i.d(r13, r14)
            return r13
        L_0x00e1:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "marginPrefix must be non-blank string."
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c0.h.O(java.lang.String, java.lang.String, int):java.lang.String");
    }

    public static final String a(String str) {
        i.e(str, "$this$capitalize");
        Locale locale = Locale.getDefault();
        i.d(locale, "Locale.getDefault()");
        i.e(str, "$this$capitalize");
        i.e(locale, "locale");
        if (!(str.length() > 0)) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        if (titleCase != Character.toUpperCase(charAt)) {
            sb.append(titleCase);
        } else {
            String substring = str.substring(0, 1);
            i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String upperCase = substring.toUpperCase(locale);
            i.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            sb.append(upperCase);
        }
        String substring2 = str.substring(1);
        i.d(substring2, "(this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final boolean b(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        i.e(charSequence, "$this$contains");
        i.e(charSequence2, "other");
        if (!(charSequence2 instanceof String)) {
            if (j(charSequence, charSequence2, 0, charSequence.length(), z, false, 16) >= 0) {
                return true;
            }
        } else if (l(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean c(CharSequence charSequence, char c, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        i.e(charSequence, "$this$contains");
        return k(charSequence, c, 0, z, 2) >= 0;
    }

    public static /* synthetic */ boolean d(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return b(charSequence, charSequence2, z);
    }

    public static boolean e(String str, String str2, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        i.e(str, "$this$endsWith");
        i.e(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return r(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static final boolean f(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final int g(CharSequence charSequence) {
        i.e(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    public static final int h(CharSequence charSequence, String str, int i2, boolean z) {
        i.e(charSequence, "$this$indexOf");
        i.e(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i2);
        }
        return j(charSequence, str, i2, charSequence.length(), z, false, 16);
    }

    public static final int i(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2) {
        b bVar;
        if (!z2) {
            if (i2 < 0) {
                i2 = 0;
            }
            int length = charSequence.length();
            if (i3 > length) {
                i3 = length;
            }
            bVar = new d(i2, i3);
        } else {
            int g2 = g(charSequence);
            if (i2 > g2) {
                i2 = g2;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            bVar = e.b(i2, i3);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i4 = bVar.f7883h;
            int i5 = bVar.f7884i;
            int i6 = bVar.f7885j;
            if (i6 >= 0) {
                if (i4 > i5) {
                    return -1;
                }
            } else if (i4 < i5) {
                return -1;
            }
            while (true) {
                if (s(charSequence2, 0, charSequence, i4, charSequence2.length(), z)) {
                    return i4;
                }
                if (i4 == i5) {
                    return -1;
                }
                i4 += i6;
            }
        } else {
            int i7 = bVar.f7883h;
            int i8 = bVar.f7884i;
            int i9 = bVar.f7885j;
            if (i9 >= 0) {
                if (i7 > i8) {
                    return -1;
                }
            } else if (i7 < i8) {
                return -1;
            }
            while (true) {
                if (r((String) charSequence2, 0, (String) charSequence, i7, charSequence2.length(), z)) {
                    return i7;
                }
                if (i7 == i8) {
                    return -1;
                }
                i7 += i9;
            }
        }
    }

    public static /* synthetic */ int j(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2, int i4) {
        if ((i4 & 16) != 0) {
            z2 = false;
        }
        return i(charSequence, charSequence2, i2, i3, z, z2);
    }

    public static int k(CharSequence charSequence, char c, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        i.e(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i2);
        }
        return m(charSequence, new char[]{c}, i2, z);
    }

    public static /* synthetic */ int l(CharSequence charSequence, String str, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return h(charSequence, str, i2, z);
    }

    public static final int m(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        boolean z2;
        i.e(charSequence, "$this$indexOfAny");
        i.e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i2 < 0) {
                i2 = 0;
            }
            int g2 = g(charSequence);
            if (i2 > g2) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(i2);
                int length = cArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z2 = false;
                        break;
                    } else if (c.y(cArr[i3], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z2) {
                    return i2;
                }
                if (i2 == g2) {
                    return -1;
                }
                i2++;
            }
        } else {
            return ((String) charSequence).indexOf(a.T2(cArr), i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean n(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "$this$isBlank"
            e.x.c.i.e(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "$this$indices"
            e.x.c.i.e(r4, r0)
            e.a0.d r0 = new e.a0.d
            int r3 = r4.length()
            int r3 = r3 + -1
            r0.<init>(r1, r3)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x002b
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x002b
            goto L_0x0049
        L_0x002b:
            java.util.Iterator r0 = r0.iterator()
        L_0x002f:
            r3 = r0
            e.a0.c r3 = (e.a0.c) r3
            boolean r3 = r3.f7887i
            if (r3 == 0) goto L_0x0049
            r3 = r0
            e.t.u r3 = (e.t.u) r3
            int r3 = r3.nextInt()
            char r3 = r4.charAt(r3)
            boolean r3 = e.a.a.a.y0.m.o1.c.R(r3)
            if (r3 != 0) goto L_0x002f
            r4 = r1
            goto L_0x004a
        L_0x0049:
            r4 = r2
        L_0x004a:
            if (r4 == 0) goto L_0x004d
        L_0x004c:
            r1 = r2
        L_0x004d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c0.h.n(java.lang.CharSequence):boolean");
    }

    public static int o(CharSequence charSequence, char c, int i2, boolean z, int i3) {
        boolean z2;
        if ((i3 & 2) != 0) {
            i2 = g(charSequence);
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        i.e(charSequence, "$this$lastIndexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i2);
        }
        char[] cArr = {c};
        i.e(charSequence, "$this$lastIndexOfAny");
        i.e(cArr, "chars");
        if (z || !(charSequence instanceof String)) {
            int g2 = g(charSequence);
            if (i2 > g2) {
                i2 = g2;
            }
            while (i2 >= 0) {
                char charAt = charSequence.charAt(i2);
                int i4 = 0;
                while (true) {
                    if (i4 >= 1) {
                        z2 = false;
                        break;
                    } else if (c.y(cArr[i4], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (z2) {
                    return i2;
                }
                i2--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(a.T2(cArr), i2);
    }

    public static int p(CharSequence charSequence, String str, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = g(charSequence);
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        i.e(charSequence, "$this$lastIndexOf");
        i.e(str, "string");
        return (z2 || !(charSequence instanceof String)) ? i(charSequence, str, i4, 0, z2, true) : ((String) charSequence).lastIndexOf(str, i4);
    }

    public static e.b0.h q(CharSequence charSequence, char[] cArr, int i2, boolean z, int i3, int i4) {
        boolean z2 = false;
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        if (i3 >= 0) {
            z2 = true;
        }
        if (z2) {
            return new b(charSequence, i2, i3, new i(cArr, z));
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i3 + '.').toString());
    }

    public static final boolean r(String str, int i2, String str2, int i3, int i4, boolean z) {
        i.e(str, "$this$regionMatches");
        i.e(str2, "other");
        return !z ? str.regionMatches(i2, str2, i3, i4) : str.regionMatches(z, i2, str2, i3, i4);
    }

    public static final boolean s(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z) {
        i.e(charSequence, "$this$regionMatchesImpl");
        i.e(charSequence2, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > charSequence2.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!c.y(charSequence.charAt(i2 + i5), charSequence2.charAt(i3 + i5), z)) {
                return false;
            }
        }
        return true;
    }

    public static final String t(String str, CharSequence charSequence) {
        i.e(str, "$this$removePrefix");
        i.e(charSequence, "prefix");
        i.e(str, "$this$startsWith");
        i.e(charSequence, "prefix");
        if (!C(str, (String) charSequence, false, 2)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        i.d(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final String u(CharSequence charSequence, int i2) {
        i.e(charSequence, "$this$repeat");
        int i3 = 1;
        if (i2 >= 0) {
            if (i2 != 0) {
                if (i2 == 1) {
                    return charSequence.toString();
                }
                int length = charSequence.length();
                if (length != 0) {
                    if (length != 1) {
                        StringBuilder sb = new StringBuilder(charSequence.length() * i2);
                        if (1 <= i2) {
                            while (true) {
                                sb.append(charSequence);
                                if (i3 == i2) {
                                    break;
                                }
                                i3++;
                            }
                        }
                        String sb2 = sb.toString();
                        i.d(sb2, "sb.toString()");
                        return sb2;
                    }
                    char charAt = charSequence.charAt(0);
                    char[] cArr = new char[i2];
                    for (int i4 = 0; i4 < i2; i4++) {
                        cArr[i4] = charAt;
                    }
                    return new String(cArr);
                }
            }
            return "";
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i2 + '.').toString());
    }

    public static String v(String str, char c, char c2, boolean z, int i2) {
        boolean z2 = (i2 & 4) != 0 ? false : z;
        i.e(str, "$this$replace");
        if (!z2) {
            String replace = str.replace(c, c2);
            i.d(replace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            return replace;
        }
        char[] cArr = {c};
        i.e(str, "$this$splitToSequence");
        i.e(cArr, "delimiters");
        return s.f(s.g(q(str, cArr, 0, z2, 0, 2), new l(str)), String.valueOf(c2), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
    }

    public static String w(String str, String str2, String str3, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        i.e(str, "$this$replace");
        i.e(str2, "oldValue");
        i.e(str3, "newValue");
        return s.f(y(str, new String[]{str2}, z, 0, 4), str3, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
    }

    public static List x(CharSequence charSequence, char[] cArr, boolean z, int i2, int i3) {
        int i4 = 0;
        boolean z2 = (i3 & 2) != 0 ? false : z;
        int i5 = (i3 & 4) != 0 ? 0 : i2;
        i.e(charSequence, "$this$split");
        i.e(cArr, "delimiters");
        int i6 = 10;
        boolean z3 = true;
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            if (i5 >= 0) {
                int h2 = h(charSequence, valueOf, 0, z2);
                if (h2 == -1 || i5 == 1) {
                    return a.l2(charSequence.toString());
                }
                if (i5 <= 0) {
                    z3 = false;
                }
                if (z3 && i5 <= 10) {
                    i6 = i5;
                }
                ArrayList arrayList = new ArrayList(i6);
                do {
                    arrayList.add(charSequence.subSequence(i4, h2).toString());
                    i4 = valueOf.length() + h2;
                    if ((z3 && arrayList.size() == i5 - 1) || (h2 = h(charSequence, valueOf, i4, z2)) == -1) {
                        arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
                    }
                    arrayList.add(charSequence.subSequence(i4, h2).toString());
                    i4 = valueOf.length() + h2;
                    break;
                } while ((h2 = h(charSequence, valueOf, i4, z2)) == -1);
                arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
                return arrayList;
            }
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i5 + '.').toString());
        }
        e.b0.h q2 = q(charSequence, cArr, 0, z2, i5, 2);
        i.e(q2, "$this$asIterable");
        q qVar = new q(q2);
        ArrayList arrayList2 = new ArrayList(a.C(qVar, 10));
        Iterator it = qVar.iterator();
        while (it.hasNext()) {
            arrayList2.add(D(charSequence, (d) it.next()));
        }
        return arrayList2;
    }

    public static e.b0.h y(CharSequence charSequence, String[] strArr, boolean z, int i2, int i3) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        i.e(charSequence, "$this$splitToSequence");
        i.e(strArr, "delimiters");
        if (i2 >= 0) {
            return s.g(new b(charSequence, 0, i2, new j(g.c(strArr), z)), new k(charSequence));
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
    }

    public static final boolean z(String str, String str2, int i2, boolean z) {
        i.e(str, "$this$startsWith");
        i.e(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i2);
        }
        return r(str, i2, str2, 0, str2.length(), z);
    }
}
