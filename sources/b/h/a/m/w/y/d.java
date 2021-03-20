package b.h.a.m.w.y;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.a.a.n.f;
import b.h.a.m.p;
import b.h.a.m.u.p.b;
import b.h.a.m.w.n;
import b.h.a.m.w.o;
import b.h.a.m.w.r;
import b.h.a.m.x.c.b0;
import b.h.a.r.b;
import java.io.InputStream;

public class d implements n<Uri, InputStream> {
    public final Context a;

    public static class a implements o<Uri, InputStream> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @NonNull
        public n<Uri, InputStream> b(r rVar) {
            return new d(this.a);
        }
    }

    public d(Context context) {
        this.a = context.getApplicationContext();
    }

    @Nullable
    public n.a a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        Uri uri = (Uri) obj;
        if (f.D(i2, i3)) {
            Long l2 = (Long) pVar.c(b0.d);
            if (l2 != null && l2.longValue() == -1) {
                b bVar = new b(uri);
                Context context = this.a;
                return new n.a(bVar, b.h.a.m.u.p.b.c(context, uri, new b.C0020b(context.getContentResolver())));
            }
        }
        return null;
    }

    public boolean b(@NonNull Object obj) {
        Uri uri = (Uri) obj;
        return f.C(uri) && uri.getPathSegments().contains("video");
    }
}
