package b.j.a.b.w;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.concurrent.ConcurrentHashMap;

public final class g extends ConcurrentHashMap<String, String> {

    /* renamed from: i  reason: collision with root package name */
    public static final g f1569i = new g();

    /* renamed from: h  reason: collision with root package name */
    public final Object f1570h = new Object();

    public g() {
        super(BaseTransientBottomBar.ANIMATION_FADE_DURATION, 0.8f, 4);
    }

    public String a(String str) {
        String str2 = (String) get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.f1570h) {
                if (size() >= 180) {
                    clear();
                }
            }
        }
        String intern = str.intern();
        put(intern, intern);
        return intern;
    }
}
