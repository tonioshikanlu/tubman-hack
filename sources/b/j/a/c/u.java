package b.j.a.c;

import b.j.a.c.a0.g;
import b.j.a.c.e0.f;
import b.j.a.c.e0.i;
import b.j.a.c.e0.l;
import java.io.Serializable;

public class u implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final u f2308h = new b();

    /* renamed from: i  reason: collision with root package name */
    public static final u f2309i = new c();

    public static abstract class a extends u {
        public String a(g<?> gVar, l lVar, String str) {
            return e(str);
        }

        public String b(g<?> gVar, f fVar, String str) {
            return e(str);
        }

        public String c(g<?> gVar, i iVar, String str) {
            return e(str);
        }

        public String d(g<?> gVar, i iVar, String str) {
            return e(str);
        }

        public abstract String e(String str);
    }

    public static class b extends a {
        public String e(String str) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            StringBuilder sb = new StringBuilder(length * 2);
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = str.charAt(i3);
                if (i3 > 0 || charAt != '_') {
                    if (Character.isUpperCase(charAt)) {
                        if (!z && i2 > 0 && sb.charAt(i2 - 1) != '_') {
                            sb.append('_');
                            i2++;
                        }
                        charAt = Character.toLowerCase(charAt);
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(charAt);
                    i2++;
                }
            }
            return i2 > 0 ? sb.toString() : str;
        }
    }

    public static class c extends a {
        public String e(String str) {
            char charAt;
            char upperCase;
            if (str == null || str.length() == 0 || (charAt = str.charAt(0)) == (upperCase = Character.toUpperCase(charAt))) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(0, upperCase);
            return sb.toString();
        }
    }

    public String a(g<?> gVar, l lVar, String str) {
        return str;
    }

    public String b(g<?> gVar, f fVar, String str) {
        return str;
    }

    public String c(g<?> gVar, i iVar, String str) {
        return str;
    }

    public String d(g<?> gVar, i iVar, String str) {
        return str;
    }
}
