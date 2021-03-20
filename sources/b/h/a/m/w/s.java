package b.h.a.m.w;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import b.h.a.m.p;
import b.h.a.m.w.n;
import java.io.InputStream;

public class s<Data> implements n<Integer, Data> {
    public final n<Uri, Data> a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f823b;

    public static final class a implements o<Integer, AssetFileDescriptor> {
        public final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        public n<Integer, AssetFileDescriptor> b(r rVar) {
            return new s(this.a, rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o<Integer, ParcelFileDescriptor> {
        public final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @NonNull
        public n<Integer, ParcelFileDescriptor> b(r rVar) {
            return new s(this.a, rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements o<Integer, InputStream> {
        public final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        @NonNull
        public n<Integer, InputStream> b(r rVar) {
            return new s(this.a, rVar.b(Uri.class, InputStream.class));
        }
    }

    public static class d implements o<Integer, Uri> {
        public final Resources a;

        public d(Resources resources) {
            this.a = resources;
        }

        @NonNull
        public n<Integer, Uri> b(r rVar) {
            return new s(this.a, v.a);
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f823b = resources;
        this.a = nVar;
    }

    public n.a a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        Uri uri;
        Integer num = (Integer) obj;
        try {
            uri = Uri.parse("android.resource://" + this.f823b.getResourcePackageName(num.intValue()) + '/' + this.f823b.getResourceTypeName(num.intValue()) + '/' + this.f823b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e2) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e2);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.a.a(uri, i2, i3, pVar);
    }

    public /* bridge */ /* synthetic */ boolean b(@NonNull Object obj) {
        Integer num = (Integer) obj;
        return true;
    }
}
