package b.h.a.m.w;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import b.h.a.m.p;
import b.h.a.m.w.n;
import java.io.File;
import java.io.InputStream;

public class u<Data> implements n<String, Data> {
    public final n<Uri, Data> a;

    public static final class a implements o<String, AssetFileDescriptor> {
        public n<String, AssetFileDescriptor> b(@NonNull r rVar) {
            return new u(rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o<String, ParcelFileDescriptor> {
        @NonNull
        public n<String, ParcelFileDescriptor> b(@NonNull r rVar) {
            return new u(rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements o<String, InputStream> {
        @NonNull
        public n<String, InputStream> b(@NonNull r rVar) {
            return new u(rVar.b(Uri.class, InputStream.class));
        }
    }

    public u(n<Uri, Data> nVar) {
        this.a = nVar;
    }

    public n.a a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        Uri uri;
        File file;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uri = null;
        } else {
            if (str.charAt(0) == '/') {
                file = new File(str);
            } else {
                uri = Uri.parse(str);
                if (uri.getScheme() == null) {
                    file = new File(str);
                }
            }
            uri = Uri.fromFile(file);
        }
        if (uri == null || !this.a.b(uri)) {
            return null;
        }
        return this.a.a(uri, i2, i3, pVar);
    }

    public /* bridge */ /* synthetic */ boolean b(@NonNull Object obj) {
        String str = (String) obj;
        return true;
    }
}
