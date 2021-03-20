package b.h.a.m.w;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import b.h.a.m.p;
import b.h.a.m.u.d;
import b.h.a.m.u.h;
import b.h.a.m.u.n;
import b.h.a.m.w.n;
import java.io.InputStream;

public class a<Data> implements n<Uri, Data> {
    public final AssetManager a;

    /* renamed from: b  reason: collision with root package name */
    public final C0028a<Data> f790b;

    /* renamed from: b.h.a.m.w.a$a  reason: collision with other inner class name */
    public interface C0028a<Data> {
        d<Data> a(AssetManager assetManager, String str);
    }

    public static class b implements o<Uri, ParcelFileDescriptor>, C0028a<ParcelFileDescriptor> {
        public final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        public d<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new h(assetManager, str);
        }

        @NonNull
        public n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new a(this.a, this);
        }
    }

    public static class c implements o<Uri, InputStream>, C0028a<InputStream> {
        public final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        public d<InputStream> a(AssetManager assetManager, String str) {
            return new n(assetManager, str);
        }

        @NonNull
        public n<Uri, InputStream> b(r rVar) {
            return new a(this.a, this);
        }
    }

    public a(AssetManager assetManager, C0028a<Data> aVar) {
        this.a = assetManager;
        this.f790b = aVar;
    }

    public n.a a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        Uri uri = (Uri) obj;
        return new n.a(new b.h.a.r.b(uri), this.f790b.a(this.a, uri.toString().substring(22)));
    }

    public boolean b(@NonNull Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
