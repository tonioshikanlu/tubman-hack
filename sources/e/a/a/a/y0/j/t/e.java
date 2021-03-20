package e.a.a.a.y0.j.t;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.k0;
import e.x.c.i;
import java.util.Arrays;
import java.util.Objects;

public final class e extends r<Character> {
    public e(char c) {
        super(Character.valueOf(c));
    }

    public d0 a(w wVar) {
        i.e(wVar, "module");
        g v = wVar.v();
        Objects.requireNonNull(v);
        k0 u = v.u(e.a.a.a.y0.a.i.CHAR);
        if (u != null) {
            i.d(u, "module.builtIns.charType");
            return u;
        }
        g.a(64);
        throw null;
    }

    public String toString() {
        String str;
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Integer.valueOf(((Character) this.a).charValue());
        char charValue = ((Character) this.a).charValue();
        switch (charValue) {
            case 8:
                str = "\\b";
                break;
            case 9:
                str = "\\t";
                break;
            case 10:
                str = "\\n";
                break;
            case 12:
                str = "\\f";
                break;
            case 13:
                str = "\\r";
                break;
            default:
                byte type = (byte) Character.getType(charValue);
                if (!(type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19)) {
                    z = true;
                }
                if (!z) {
                    str = "?";
                    break;
                } else {
                    str = String.valueOf(charValue);
                    break;
                }
        }
        objArr[1] = str;
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(objArr, 2));
        i.d(format, "java.lang.String.format(this, *args)");
        return format;
    }
}
