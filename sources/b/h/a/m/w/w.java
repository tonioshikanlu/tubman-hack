package b.h.a.m.w;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import b.h.a.m.p;
import b.h.a.m.u.i;
import b.h.a.m.u.o;
import b.h.a.m.w.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class w<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f825b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));
    public final c<Data> a;

    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public b.h.a.m.u.d<AssetFileDescriptor> a(Uri uri) {
            return new b.h.a.m.u.a(this.a, uri);
        }

        public n<Uri, AssetFileDescriptor> b(r rVar) {
            return new w(this);
        }
    }

    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        public final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public b.h.a.m.u.d<ParcelFileDescriptor> a(Uri uri) {
            return new i(this.a, uri);
        }

        @NonNull
        public n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new w(this);
        }
    }

    public interface c<Data> {
        b.h.a.m.u.d<Data> a(Uri uri);
    }

    public static class d implements o<Uri, InputStream>, c<InputStream> {
        public final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public b.h.a.m.u.d<InputStream> a(Uri uri) {
            return new o(this.a, uri);
        }

        @NonNull
        public n<Uri, InputStream> b(r rVar) {
            return new w(this);
        }
    }

    public w(c<Data> cVar) {
        this.a = cVar;
    }

    public n.a a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        Uri uri = (Uri) obj;
        return new n.a(new b.h.a.r.b(uri), this.a.a(uri));
    }

    public boolean b(@NonNull Object obj) {
        return f825b.contains(((Uri) obj).getScheme());
    }
}
