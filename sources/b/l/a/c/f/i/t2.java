package b.l.a.c.f.i;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public final class t2 {
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b  reason: collision with root package name */
    public static final Uri f3751b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicBoolean f3752e = new AtomicBoolean();
    public static HashMap<String, String> f;

    /* renamed from: g  reason: collision with root package name */
    public static final HashMap<String, Boolean> f3753g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public static final HashMap<String, Integer> f3754h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    public static final HashMap<String, Long> f3755i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    public static final HashMap<String, Float> f3756j = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    public static Object f3757k;

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f3758l = new String[0];

    public static void a(Object obj, String str, String str2) {
        synchronized (t2.class) {
            if (obj == f3757k) {
                f.put(str, str2);
            }
        }
    }
}
