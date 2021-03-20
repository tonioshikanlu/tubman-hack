package b.n.a.a.e;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import b.h.a.m.p;
import b.l.f.x.a.g;
import java.io.IOException;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class f extends h<Uri> {
    public final Resources a;

    public f(@NonNull Context context) {
        this.a = context.getResources();
    }

    public boolean b(@NonNull Object obj, @NonNull p pVar) {
        Uri uri = (Uri) obj;
        Resources resources = this.a;
        if (!"android.resource".equals(uri.getScheme())) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return "raw".equals(pathSegments.get(0));
        }
        if (pathSegments.size() != 1) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(pathSegments.get(0));
            return parseInt != 0 && "raw".equals(resources.getResourceTypeName(parseInt));
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public int d(@NonNull Object obj) {
        try {
            return g.C(this.a.openRawResourceFd(g.A(this.a, (Uri) obj)).getFileDescriptor());
        } catch (Resources.NotFoundException e2) {
            throw new IOException(e2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.i.a.f e(@androidx.annotation.NonNull java.lang.Object r1, int r2, int r3, @androidx.annotation.NonNull b.h.a.m.p r4) {
        /*
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            android.content.res.Resources r2 = r0.a     // Catch:{ h -> 0x001f }
            int r1 = b.l.f.x.a.g.A(r2, r1)     // Catch:{ h -> 0x001f }
            b.i.a.i r3 = new b.i.a.i     // Catch:{ h -> 0x001f }
            r3.<init>()     // Catch:{ h -> 0x001f }
            java.io.InputStream r1 = r2.openRawResource(r1)     // Catch:{ h -> 0x001f }
            r2 = 1
            b.i.a.f r2 = r3.h(r1, r2)     // Catch:{ all -> 0x001a }
            r1.close()     // Catch:{ IOException -> 0x0019 }
        L_0x0019:
            return r2
        L_0x001a:
            r2 = move-exception
            r1.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            throw r2     // Catch:{ h -> 0x001f }
        L_0x001f:
            r1 = move-exception
            b.n.a.a.e.i r2 = new b.n.a.a.e.i
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.n.a.a.e.f.e(java.lang.Object, int, int, b.h.a.m.p):b.i.a.f");
    }
}
