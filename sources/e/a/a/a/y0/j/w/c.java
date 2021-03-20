package e.a.a.a.y0.j.w;

import androidx.exifinterface.media.ExifInterface;
import b.e.a.a.a;
import e.a.a.a.y0.a.i;
import e.a.a.a.y0.f.b;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public enum c {
    BOOLEAN(i.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(i.CHAR, "char", "C", "java.lang.Character"),
    BYTE(i.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(i.SHORT, "short", ExifInterface.LATITUDE_SOUTH, "java.lang.Short"),
    INT(i.INT, "int", "I", "java.lang.Integer"),
    FLOAT(i.FLOAT, "float", "F", "java.lang.Float"),
    LONG(i.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(i.DOUBLE, "double", "D", "java.lang.Double");
    
    public static final Set<b> t = null;
    public static final Map<String, c> u = null;
    public static final Map<i, c> v = null;
    public static final Map<String, c> w = null;

    /* renamed from: h  reason: collision with root package name */
    public final i f9432h;

    /* renamed from: i  reason: collision with root package name */
    public final String f9433i;

    /* renamed from: j  reason: collision with root package name */
    public final String f9434j;

    /* renamed from: k  reason: collision with root package name */
    public final b f9435k;

    /* access modifiers changed from: public */
    static {
        int i2;
        t = new HashSet();
        u = new HashMap();
        v = new EnumMap(i.class);
        w = new HashMap();
        c[] values = values();
        while (i2 < 8) {
            c cVar = values[i2];
            t.add(cVar.m());
            Map<String, c> map = u;
            String str = cVar.f9433i;
            if (str != null) {
                map.put(str, cVar);
                v.put(cVar.l(), cVar);
                w.put(cVar.j(), cVar);
                i2++;
            } else {
                d(11);
                throw null;
            }
        }
    }

    /* access modifiers changed from: public */
    c(i iVar, String str, String str2, String str3) {
        if (iVar != null) {
            this.f9432h = iVar;
            this.f9433i = str;
            this.f9434j = str2;
            this.f9435k = new b(str3);
            return;
        }
        d(6);
        throw null;
    }

    public static c e(String str) {
        c cVar = u.get(str);
        if (cVar != null) {
            return cVar;
        }
        throw new AssertionError(a.m("Non-primitive type name passed: ", str));
    }

    public static c h(i iVar) {
        c cVar = v.get(iVar);
        if (cVar != null) {
            return cVar;
        }
        d(4);
        throw null;
    }

    public String j() {
        String str = this.f9434j;
        if (str != null) {
            return str;
        }
        d(12);
        throw null;
    }

    public i l() {
        i iVar = this.f9432h;
        if (iVar != null) {
            return iVar;
        }
        d(10);
        throw null;
    }

    public b m() {
        b bVar = this.f9435k;
        if (bVar != null) {
            return bVar;
        }
        d(13);
        throw null;
    }
}
