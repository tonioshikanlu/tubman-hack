package b.h.a.m.w.y;

import android.net.Uri;
import androidx.annotation.NonNull;
import b.h.a.m.p;
import b.h.a.m.w.g;
import b.h.a.m.w.n;
import b.h.a.m.w.o;
import b.h.a.m.w.r;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class b implements n<Uri, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f828b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    public final n<g, InputStream> a;

    public static class a implements o<Uri, InputStream> {
        @NonNull
        public n<Uri, InputStream> b(r rVar) {
            return new b(rVar.b(g.class, InputStream.class));
        }
    }

    public b(n<g, InputStream> nVar) {
        this.a = nVar;
    }

    public n.a a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        return this.a.a(new g(((Uri) obj).toString()), i2, i3, pVar);
    }

    public boolean b(@NonNull Object obj) {
        return f828b.contains(((Uri) obj).getScheme());
    }
}
