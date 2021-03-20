package b.h.a.m.w;

import android.net.Uri;
import androidx.annotation.NonNull;
import b.h.a.m.p;
import b.h.a.m.w.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class x<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f826b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    public final n<g, Data> a;

    public static class a implements o<Uri, InputStream> {
        @NonNull
        public n<Uri, InputStream> b(r rVar) {
            return new x(rVar.b(g.class, InputStream.class));
        }
    }

    public x(n<g, Data> nVar) {
        this.a = nVar;
    }

    public n.a a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        return this.a.a(new g(((Uri) obj).toString()), i2, i3, pVar);
    }

    public boolean b(@NonNull Object obj) {
        return f826b.contains(((Uri) obj).getScheme());
    }
}
