package b.h.a.m.w.y;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import b.a.a.n.f;
import b.h.a.m.p;
import b.h.a.m.u.p.b;
import b.h.a.m.w.n;
import b.h.a.m.w.o;
import b.h.a.m.w.r;
import b.h.a.r.b;
import java.io.InputStream;

public class c implements n<Uri, InputStream> {
    public final Context a;

    public static class a implements o<Uri, InputStream> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @NonNull
        public n<Uri, InputStream> b(r rVar) {
            return new c(this.a);
        }
    }

    public c(Context context) {
        this.a = context.getApplicationContext();
    }

    public n.a a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        Uri uri = (Uri) obj;
        if (!f.D(i2, i3)) {
            return null;
        }
        b bVar = new b(uri);
        Context context = this.a;
        return new n.a(bVar, b.h.a.m.u.p.b.c(context, uri, new b.a(context.getContentResolver())));
    }

    public boolean b(@NonNull Object obj) {
        Uri uri = (Uri) obj;
        return f.C(uri) && !uri.getPathSegments().contains("video");
    }
}
