package n;

import e.x.c.i;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public final class j {
    public final Map<String, String> a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10125b;

    public j(String str, Map<String, String> map) {
        String str2;
        i.e(str, "scheme");
        i.e(map, "authParams");
        this.f10125b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String str3 = (String) next.getKey();
            String str4 = (String) next.getValue();
            if (str3 != null) {
                Locale locale = Locale.US;
                i.d(locale, "US");
                str2 = str3.toLowerCase(locale);
                i.d(str2, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, str4);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        i.d(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.a = unmodifiableMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            return i.a(jVar.f10125b, this.f10125b) && i.a(jVar.a, this.a);
        }
    }

    public int hashCode() {
        return this.a.hashCode() + ((this.f10125b.hashCode() + 899) * 31);
    }

    public String toString() {
        return this.f10125b + " authParams=" + this.a;
    }
}
