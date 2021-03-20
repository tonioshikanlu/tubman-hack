package e.a.a.a.y0.d.b;

import androidx.exifinterface.media.ExifInterface;
import b.e.a.a.a;
import e.a.a.a.y0.d.b.h;
import e.a.a.a.y0.j.w.b;
import e.a.a.a.y0.j.w.c;
import e.x.c.i;

public final class j implements i<h> {
    public static final j a = new j();

    public Object d(Object obj) {
        c cVar;
        h hVar = (h) obj;
        i.e(hVar, "possiblyPrimitiveType");
        if (!(hVar instanceof h.c) || (cVar = ((h.c) hVar).a) == null) {
            return hVar;
        }
        b c = b.c(cVar.m());
        i.d(c, "JvmClassName.byFqNameWit…mitiveType.wrapperFqName)");
        String e2 = c.e();
        i.d(e2, "JvmClassName.byFqNameWit…apperFqName).internalName");
        return b(e2);
    }

    public Object e() {
        return b("java/lang/Class");
    }

    /* renamed from: f */
    public h a(String str) {
        c cVar;
        i.e(str, "representation");
        str.length();
        char charAt = str.charAt(0);
        c[] values = c.values();
        int i2 = 0;
        while (true) {
            if (i2 >= 8) {
                cVar = null;
                break;
            }
            cVar = values[i2];
            if (cVar.j().charAt(0) == charAt) {
                break;
            }
            i2++;
        }
        if (cVar != null) {
            return new h.c(cVar);
        }
        if (charAt == 'V') {
            return new h.c((c) null);
        }
        if (charAt != '[') {
            if (charAt == 'L') {
                i.e(str, "$this$endsWith");
                if (str.length() > 0) {
                    boolean y = e.a.a.a.y0.m.o1.c.y(str.charAt(e.c0.h.g(str)), ';', false);
                }
            }
            String substring = str.substring(1, str.length() - 1);
            i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return new h.b(substring);
        }
        String substring2 = str.substring(1);
        i.d(substring2, "(this as java.lang.String).substring(startIndex)");
        return new h.a(a(substring2));
    }

    /* renamed from: g */
    public h.b b(String str) {
        i.e(str, "internalName");
        return new h.b(str);
    }

    /* renamed from: h */
    public String c(h hVar) {
        String str;
        StringBuilder sb;
        String str2;
        i.e(hVar, "type");
        if (hVar instanceof h.a) {
            sb = a.y("[");
            str = c(((h.a) hVar).a);
        } else if (hVar instanceof h.c) {
            c cVar = ((h.c) hVar).a;
            if (cVar == null || (str2 = cVar.j()) == null) {
                str2 = ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
            }
            i.d(str2, "type.jvmPrimitiveType?.desc ?: \"V\"");
            return str2;
        } else if (hVar instanceof h.b) {
            sb = a.y("L");
            sb.append(((h.b) hVar).a);
            str = ";";
        } else {
            throw new e.h();
        }
        sb.append(str);
        return sb.toString();
    }
}
