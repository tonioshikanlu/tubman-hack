package androidx.core.os;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.ActivityChooserView;
import b.e.a.a.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

public final class LocaleListCompatWrapper implements LocaleListInterface {
    private static final Locale EN_LATN = LocaleListCompat.forLanguageTagCompat("en-Latn");
    private static final Locale LOCALE_AR_XB = new Locale("ar", "XB");
    private static final Locale LOCALE_EN_XA = new Locale("en", "XA");
    private static final Locale[] sEmptyList = new Locale[0];
    private final Locale[] mList;
    @NonNull
    private final String mStringRepresentation;

    public LocaleListCompatWrapper(@NonNull Locale... localeArr) {
        String str;
        if (localeArr.length == 0) {
            this.mList = sEmptyList;
            str = "";
        } else {
            Locale[] localeArr2 = new Locale[localeArr.length];
            HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            while (i2 < localeArr.length) {
                Locale locale = localeArr[i2];
                if (locale == null) {
                    throw new NullPointerException(a.h("list[", i2, "] is null"));
                } else if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    localeArr2[i2] = locale2;
                    toLanguageTag(sb, locale2);
                    if (i2 < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                    i2++;
                } else {
                    throw new IllegalArgumentException(a.h("list[", i2, "] is a repetition"));
                }
            }
            this.mList = localeArr2;
            str = sb.toString();
        }
        this.mStringRepresentation = str;
    }

    private Locale computeFirstMatch(Collection<String> collection, boolean z) {
        int computeFirstMatchIndex = computeFirstMatchIndex(collection, z);
        if (computeFirstMatchIndex == -1) {
            return null;
        }
        return this.mList[computeFirstMatchIndex];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r6 < Integer.MAX_VALUE) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int computeFirstMatchIndex(java.util.Collection<java.lang.String> r5, boolean r6) {
        /*
            r4 = this;
            java.util.Locale[] r0 = r4.mList
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x0008
            return r2
        L_0x0008:
            int r0 = r0.length
            if (r0 != 0) goto L_0x000d
            r5 = -1
            return r5
        L_0x000d:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L_0x001e
            java.util.Locale r6 = EN_LATN
            int r6 = r4.findFirstMatchIndex(r6)
            if (r6 != 0) goto L_0x001b
            return r2
        L_0x001b:
            if (r6 >= r0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r6 = r0
        L_0x001f:
            java.util.Iterator r5 = r5.iterator()
        L_0x0023:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x003e
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = androidx.core.os.LocaleListCompat.forLanguageTagCompat(r1)
            int r1 = r4.findFirstMatchIndex(r1)
            if (r1 != 0) goto L_0x003a
            return r2
        L_0x003a:
            if (r1 >= r6) goto L_0x0023
            r6 = r1
            goto L_0x0023
        L_0x003e:
            if (r6 != r0) goto L_0x0041
            return r2
        L_0x0041:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.os.LocaleListCompatWrapper.computeFirstMatchIndex(java.util.Collection, boolean):int");
    }

    private int findFirstMatchIndex(Locale locale) {
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.mList;
            if (i2 >= localeArr.length) {
                return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            }
            if (matchScore(locale, localeArr[i2]) > 0) {
                return i2;
            }
            i2++;
        }
    }

    private static String getLikelyScript(Locale locale) {
        String script = locale.getScript();
        return !script.isEmpty() ? script : "";
    }

    private static boolean isPseudoLocale(Locale locale) {
        return LOCALE_EN_XA.equals(locale) || LOCALE_AR_XB.equals(locale);
    }

    @IntRange(from = 0, to = 1)
    private static int matchScore(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || isPseudoLocale(locale) || isPseudoLocale(locale2)) {
            return 0;
        }
        String likelyScript = getLikelyScript(locale);
        if (!likelyScript.isEmpty()) {
            return likelyScript.equals(getLikelyScript(locale2)) ? 1 : 0;
        }
        String country = locale.getCountry();
        return (country.isEmpty() || country.equals(locale2.getCountry())) ? 1 : 0;
    }

    @VisibleForTesting
    public static void toLanguageTag(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocaleListCompatWrapper)) {
            return false;
        }
        Locale[] localeArr = ((LocaleListCompatWrapper) obj).mList;
        if (this.mList.length != localeArr.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            Locale[] localeArr2 = this.mList;
            if (i2 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i2].equals(localeArr[i2])) {
                return false;
            }
            i2++;
        }
    }

    public Locale get(int i2) {
        if (i2 >= 0) {
            Locale[] localeArr = this.mList;
            if (i2 < localeArr.length) {
                return localeArr[i2];
            }
        }
        return null;
    }

    public Locale getFirstMatch(@NonNull String[] strArr) {
        return computeFirstMatch(Arrays.asList(strArr), false);
    }

    @Nullable
    public Object getLocaleList() {
        return null;
    }

    public int hashCode() {
        int i2 = 1;
        int i3 = 0;
        while (true) {
            Locale[] localeArr = this.mList;
            if (i3 >= localeArr.length) {
                return i2;
            }
            i2 = (i2 * 31) + localeArr[i3].hashCode();
            i3++;
        }
    }

    public int indexOf(Locale locale) {
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.mList;
            if (i2 >= localeArr.length) {
                return -1;
            }
            if (localeArr[i2].equals(locale)) {
                return i2;
            }
            i2++;
        }
    }

    public boolean isEmpty() {
        return this.mList.length == 0;
    }

    public int size() {
        return this.mList.length;
    }

    public String toLanguageTags() {
        return this.mStringRepresentation;
    }

    public String toString() {
        StringBuilder y = a.y("[");
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.mList;
            if (i2 < localeArr.length) {
                y.append(localeArr[i2]);
                if (i2 < this.mList.length - 1) {
                    y.append(',');
                }
                i2++;
            } else {
                y.append("]");
                return y.toString();
            }
        }
    }
}
