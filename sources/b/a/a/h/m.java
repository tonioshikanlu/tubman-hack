package b.a.a.h;

import android.content.Context;
import android.graphics.Color;
import android.util.Base64;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import b.f.a.e;
import e.c0.a;
import e.c0.h;
import e.x.c.i;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import q.a.a;

public final class m {
    public static final String a(String str) {
        i.e(str, "$this$base64Decoded");
        byte[] decode = Base64.decode(str, 2);
        i.d(decode, "Base64.decode(this, Base64.NO_WRAP)");
        return new String(decode, a.a);
    }

    public static final String b(String str) {
        i.e(str, "$this$base64encodedUrl");
        String substring = str.substring(j(str, "/", 1, true) + 1);
        i.d(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final String c(String str) {
        i.e(str, "$this$formatToISO8601DateString");
        DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(e.c());
        i.d(dateFormat, "DateFormat.getDateFormat(appContext())");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) dateFormat).toLocalizedPattern(), Locale.getDefault());
        try {
            String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault()).format(simpleDateFormat.parse(str));
            i.d(format, "dfFinal.format(parsed)");
            return format;
        } catch (ParseException e2) {
            q.a.a.d.b("Error parsing date %s: %s", str, e2.getLocalizedMessage());
            return "";
        }
    }

    public static final String d(String str) {
        i.e(str, "$this$getBaseUrl");
        String substring = str.substring(0, k(str, "/", 5, false, 4) + 1);
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String e(String str) {
        i.e(str, "$this$getThirdTagValue");
        String substring = str.substring(k(str, ":", 2, false, 4) + 1);
        i.d(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final boolean f(String str) {
        i.e(str, "$this$isBravoDevAppId");
        return str.length() == 29 && h.A(str, "dev", true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r0 = (r0 = (r0 = (r0 = (r0 = (r0 = r0.d).f7062e).a).get(0)).f).get(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean g(java.lang.String r2) {
        /*
            java.lang.String r0 = "$this$isContainerMenu"
            e.x.c.i.e(r2, r0)
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            com.appfoundry.previewer.model.JsonApp r0 = com.appfoundry.previewer.BravoApp.f6915o
            if (r0 == 0) goto L_0x002f
            com.appfoundry.previewer.model.App r0 = r0.d
            if (r0 == 0) goto L_0x002f
            com.appfoundry.previewer.model.Data r0 = r0.f7062e
            if (r0 == 0) goto L_0x002f
            java.util.List<com.appfoundry.previewer.model.Page> r0 = r0.a
            if (r0 == 0) goto L_0x002f
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.appfoundry.previewer.model.Page r0 = (com.appfoundry.previewer.model.Page) r0
            if (r0 == 0) goto L_0x002f
            java.util.List<com.appfoundry.previewer.model.Container> r0 = r0.f
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r0.get(r1)
            com.appfoundry.previewer.model.Container r0 = (com.appfoundry.previewer.model.Container) r0
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = r0.a
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            boolean r2 = e.x.c.i.a(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.h.m.g(java.lang.String):boolean");
    }

    public static final boolean h(String str) {
        i.e(str, "$this$isValid");
        if (!i.a(str, "")) {
            String lowerCase = str.toLowerCase();
            i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (!i.a(lowerCase, "null")) {
                return true;
            }
        }
        return false;
    }

    public static final boolean i(String str) {
        i.e(str, "$this$isValidColor");
        try {
            if (!i.a(str, "")) {
                if (!h.C(str, "#", false, 2)) {
                    Color.parseColor('#' + str);
                    return true;
                }
                Color.parseColor(str);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final int j(String str, CharSequence charSequence, int i2, boolean z) {
        i.e(str, "$this$ordinalIndexOf");
        int i3 = -1;
        if (charSequence == null || i2 <= 0) {
            return i3;
        }
        if (!(charSequence.length() == 0)) {
            if (z) {
                i3 = str.length();
            }
            int i4 = 0;
            do {
                String obj = charSequence.toString();
                i3 = z ? h.p(str, obj, i3 - 1, false, 4) : h.l(str, obj, i3 + 1, false, 4);
                if (i3 < 0) {
                    return i3;
                }
                i4++;
            } while (i4 < i2);
            return i3;
        } else if (z) {
            return str.length();
        } else {
            return 0;
        }
    }

    public static /* synthetic */ int k(String str, CharSequence charSequence, int i2, boolean z, int i3) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        return j(str, charSequence, i2, z);
    }

    public static final String l(String str) {
        i.e(str, "$this$tagValue");
        int k2 = k(str, ":", 1, false, 4);
        if (k2 == -1) {
            return null;
        }
        String substring = str.substring(k2 + 1);
        i.d(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final int m(String str) {
        i.e(str, "$this$toColor");
        try {
            if (!(!i.a(str, ""))) {
                return ViewCompat.MEASURED_STATE_MASK;
            }
            if (h.C(str, "#", false, 2)) {
                return Color.parseColor(str);
            }
            return Color.parseColor('#' + str);
        } catch (Exception e2) {
            Context c = e.c();
            Toast.makeText(c, "ERROR IN COLOR: " + str, 0).show();
            Object[] objArr = {str, e2.getLocalizedMessage()};
            a.b bVar = q.a.a.d;
            bVar.a("Error parsing color: %s. Error: %s", objArr);
            bVar.b("Error parsing color: %s. Error: %s", str, e2.getLocalizedMessage());
            return ViewCompat.MEASURED_STATE_MASK;
        }
    }

    public static final String n(String str) {
        i.e(str, "$this$toTitleCase");
        StringBuilder sb = new StringBuilder(str);
        int length = sb.length();
        boolean z = true;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = sb.charAt(i2);
            boolean isWhitespace = Character.isWhitespace(charAt);
            if (z) {
                if (!isWhitespace) {
                    sb.setCharAt(i2, Character.toTitleCase(charAt));
                    z = false;
                }
            } else if (isWhitespace) {
                z = true;
            } else {
                sb.setCharAt(i2, Character.toLowerCase(charAt));
            }
        }
        return sb.toString();
    }

    public static final String o(String str) {
        i.e(str, "$this$validateText");
        String lowerCase = str.toLowerCase();
        i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
        i.e(lowerCase, "$this$base64Encoded");
        byte[] bytes = lowerCase.getBytes(e.c0.a.a);
        i.d(bytes, "(this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 2);
        i.d(encodeToString, "Base64.encodeToString(th…eArray(), Base64.NO_WRAP)");
        return i.a(encodeToString, "d2hvIGlzIGJlaGluZCBicmF2bw==") ? a("QWxiZXJ0bywgQXVyaWthLCBDaHJpc3RpbmEsIERhcmlvLCBHb256YWxvLCBMZXdpcywgTWFyaywgTWFydGEsIFBhdSwgUGVkcm8sIFRvYnksIFZpY3Rvcg==") : str;
    }
}
