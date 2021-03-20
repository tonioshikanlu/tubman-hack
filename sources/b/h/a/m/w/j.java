package b.h.a.m.w;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class j implements h {

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<i>> f804b;
    public volatile Map<String, String> c;

    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final String f805b;
        public static final Map<String, List<i>> c;
        public Map<String, List<i>> a = c;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = property.charAt(i2);
                    if ((charAt <= 31 && charAt != 9) || charAt >= 127) {
                        charAt = '?';
                    }
                    sb.append(charAt);
                }
                property = sb.toString();
            }
            f805b = property;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            c = Collections.unmodifiableMap(hashMap);
        }
    }

    public static final class b implements i {
        @NonNull
        public final String a;

        public b(@NonNull String str) {
            this.a = str;
        }

        public String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("StringHeaderFactory{value='");
            y.append(this.a);
            y.append('\'');
            y.append('}');
            return y.toString();
        }
    }

    public j(Map<String, List<i>> map) {
        this.f804b = Collections.unmodifiableMap(map);
    }

    public Map<String, String> a() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.c;
    }

    public final Map<String, String> b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f804b.entrySet()) {
            List list = (List) next.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                String a2 = ((i) list.get(i2)).a();
                if (!TextUtils.isEmpty(a2)) {
                    sb.append(a2);
                    if (i2 != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(next.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f804b.equals(((j) obj).f804b);
        }
        return false;
    }

    public int hashCode() {
        return this.f804b.hashCode();
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("LazyHeaders{headers=");
        y.append(this.f804b);
        y.append('}');
        return y.toString();
    }
}
