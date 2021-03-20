package b.h.a.m.x.c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import b.a.a.n.f;
import b.h.a.m.h;
import b.h.a.m.j;
import b.h.a.m.u.k;
import b.h.a.m.u.m;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

public interface s {

    public static final class a implements s {
        public final k a;

        /* renamed from: b  reason: collision with root package name */
        public final b.h.a.m.v.c0.b f878b;
        public final List<ImageHeaderParser> c;

        public a(InputStream inputStream, List<ImageHeaderParser> list, b.h.a.m.v.c0.b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.f878b = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.c = list;
            this.a = new k(inputStream, bVar);
        }

        @Nullable
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.a.a(), (Rect) null, options);
        }

        public void b() {
            w wVar = this.a.a;
            synchronized (wVar) {
                wVar.f884j = wVar.f882h.length;
            }
        }

        public int c() {
            return f.l(this.c, this.a.a(), this.f878b);
        }

        public ImageHeaderParser.ImageType d() {
            return f.w(this.c, this.a.a(), this.f878b);
        }
    }

    @RequiresApi(21)
    public static final class b implements s {
        public final b.h.a.m.v.c0.b a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f879b;
        public final m c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, b.h.a.m.v.c0.b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.a = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f879b = list;
            this.c = new m(parcelFileDescriptor);
        }

        @Nullable
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.c.a().getFileDescriptor(), (Rect) null, options);
        }

        public void b() {
        }

        public int c() {
            return f.m(this.f879b, new j(this.c, this.a));
        }

        public ImageHeaderParser.ImageType d() {
            return f.x(this.f879b, new h(this.c, this.a));
        }
    }

    @Nullable
    Bitmap a(BitmapFactory.Options options);

    void b();

    int c();

    ImageHeaderParser.ImageType d();
}
