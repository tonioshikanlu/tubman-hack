package b.l.a.c.f.e;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class uj {
    public static final Map<String, tj> a = new ArrayMap();

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, WeakReference<dj>> f3332b = new ArrayMap();

    @NonNull
    public static String a(String str) {
        tj tjVar;
        Map<String, tj> map = a;
        synchronized (map) {
            tjVar = map.get(str);
        }
        if (tjVar == null) {
            return String.valueOf("https://").concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
        }
        throw null;
    }
}
