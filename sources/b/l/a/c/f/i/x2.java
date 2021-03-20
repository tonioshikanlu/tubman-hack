package b.l.a.c.f.i;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import b.l.a.c.b.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class x2 {
    @GuardedBy("ConfigurationContentLoader.class")

    /* renamed from: g  reason: collision with root package name */
    public static final Map<Uri, x2> f3804g = new ArrayMap();

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f3805h = {"key", "value"};
    public final ContentResolver a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f3806b;
    public final ContentObserver c;
    public final Object d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public volatile Map<String, String> f3807e;
    @GuardedBy("this")
    public final List<y2> f = new ArrayList();

    public x2(ContentResolver contentResolver, Uri uri) {
        w2 w2Var = new w2(this);
        this.c = w2Var;
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.a = contentResolver;
        this.f3806b = uri;
        contentResolver.registerContentObserver(uri, false, w2Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b.l.a.c.f.i.x2 a(android.content.ContentResolver r4, android.net.Uri r5) {
        /*
            java.lang.Class<b.l.a.c.f.i.x2> r0 = b.l.a.c.f.i.x2.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, b.l.a.c.f.i.x2> r1 = f3804g     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0018 }
            b.l.a.c.f.i.x2 r2 = (b.l.a.c.f.i.x2) r2     // Catch:{ all -> 0x0018 }
            if (r2 != 0) goto L_0x0016
            b.l.a.c.f.i.x2 r3 = new b.l.a.c.f.i.x2     // Catch:{ SecurityException -> 0x0016 }
            r3.<init>(r4, r5)     // Catch:{ SecurityException -> 0x0016 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0015 }
        L_0x0015:
            r2 = r3
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r2
        L_0x0018:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.x2.a(android.content.ContentResolver, android.net.Uri):b.l.a.c.f.i.x2");
    }

    public static synchronized void c() {
        synchronized (x2.class) {
            for (x2 next : f3804g.values()) {
                next.a.unregisterContentObserver(next.c);
            }
            f3804g.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    public final Map<String, String> b() {
        Map<String, String> map;
        Map<String, String> map2 = this.f3807e;
        if (map2 == null) {
            synchronized (this.d) {
                map2 = this.f3807e;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) a.Y0(new v2(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        try {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.f3807e = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }
}
