package b.h.a.m.w;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import b.h.a.f;
import b.h.a.m.p;
import b.h.a.m.u.d;
import b.h.a.m.w.n;
import java.io.File;
import java.io.FileNotFoundException;

public final class k implements n<Uri, File> {
    public final Context a;

    public static final class a implements o<Uri, File> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @NonNull
        public n<Uri, File> b(r rVar) {
            return new k(this.a);
        }
    }

    public static class b implements d<File> {

        /* renamed from: j  reason: collision with root package name */
        public static final String[] f806j = {"_data"};

        /* renamed from: h  reason: collision with root package name */
        public final Context f807h;

        /* renamed from: i  reason: collision with root package name */
        public final Uri f808i;

        public b(Context context, Uri uri) {
            this.f807h = context;
            this.f808i = uri;
        }

        @NonNull
        public Class<File> a() {
            return File.class;
        }

        public void b() {
        }

        public void cancel() {
        }

        @NonNull
        public b.h.a.m.a e() {
            return b.h.a.m.a.LOCAL;
        }

        public void f(@NonNull f fVar, @NonNull d.a<? super File> aVar) {
            Cursor query = this.f807h.getContentResolver().query(this.f808i, f806j, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder y = b.e.a.a.a.y("Failed to find file path for: ");
                y.append(this.f808i);
                aVar.c(new FileNotFoundException(y.toString()));
                return;
            }
            aVar.d(new File(str));
        }
    }

    public k(Context context) {
        this.a = context;
    }

    public n.a a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        Uri uri = (Uri) obj;
        return new n.a(new b.h.a.r.b(uri), new b(this.a, uri));
    }

    public boolean b(@NonNull Object obj) {
        return b.a.a.n.f.C((Uri) obj);
    }
}
