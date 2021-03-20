package b.h.a.m.x;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import b.h.a.m.b;
import b.h.a.m.o;
import b.h.a.m.p;
import b.h.a.m.q;
import b.h.a.m.r;
import b.h.a.m.v.w;
import b.h.a.m.x.c.d;
import b.h.a.m.x.c.e;
import b.h.a.m.x.c.l;
import b.h.a.m.x.c.m;

@RequiresApi(api = 28)
public abstract class a<T> implements r<ImageDecoder.Source, T> {
    public final b.h.a.m.x.c.r a = b.h.a.m.x.c.r.a();

    /* renamed from: b.h.a.m.x.a$a  reason: collision with other inner class name */
    public class C0033a implements ImageDecoder.OnHeaderDecodedListener {
        public final /* synthetic */ int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f841b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ b d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ l f842e;
        public final /* synthetic */ q f;

        /* renamed from: b.h.a.m.x.a$a$a  reason: collision with other inner class name */
        public class C0034a implements ImageDecoder.OnPartialImageListener {
            public C0034a(C0033a aVar) {
            }

            public boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public C0033a(int i2, int i3, boolean z, b bVar, l lVar, q qVar) {
            this.a = i2;
            this.f841b = i3;
            this.c = z;
            this.d = bVar;
            this.f842e = lVar;
            this.f = qVar;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            ColorSpace.Named named;
            boolean z = false;
            if (a.this.a.b(this.a, this.f841b, this.c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.d == b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0034a(this));
            Size size = imageInfo.getSize();
            int i2 = this.a;
            if (i2 == Integer.MIN_VALUE) {
                i2 = size.getWidth();
            }
            int i3 = this.f841b;
            if (i3 == Integer.MIN_VALUE) {
                i3 = size.getHeight();
            }
            float b2 = this.f842e.b(size.getWidth(), size.getHeight(), i2, i3);
            int round = Math.round(((float) size.getWidth()) * b2);
            int round2 = Math.round(((float) size.getHeight()) * b2);
            if (Log.isLoggable("ImageDecoder", 2)) {
                StringBuilder y = b.e.a.a.a.y("Resizing from [");
                y.append(size.getWidth());
                y.append("x");
                y.append(size.getHeight());
                y.append("] to [");
                y.append(round);
                y.append("x");
                y.append(round2);
                y.append("] scaleFactor: ");
                y.append(b2);
                Log.v("ImageDecoder", y.toString());
            }
            imageDecoder.setTargetSize(round, round2);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                if (this.f == q.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                if (z) {
                    named = ColorSpace.Named.DISPLAY_P3;
                    imageDecoder.setTargetColorSpace(ColorSpace.get(named));
                }
            } else if (i4 < 26) {
                return;
            }
            named = ColorSpace.Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }

    public /* bridge */ /* synthetic */ boolean b(@NonNull Object obj, @NonNull p pVar) {
        ImageDecoder.Source source = (ImageDecoder.Source) obj;
        return true;
    }

    @Nullable
    /* renamed from: c */
    public final w<T> a(@NonNull ImageDecoder.Source source, int i2, int i3, @NonNull p pVar) {
        b bVar = (b) pVar.c(m.f);
        l lVar = (l) pVar.c(l.f);
        o oVar = m.f866i;
        boolean z = pVar.c(oVar) != null && ((Boolean) pVar.c(oVar)).booleanValue();
        d dVar = (d) this;
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new C0033a(i2, i3, z, bVar, lVar, (q) pVar.c(m.f864g)));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder y = b.e.a.a.a.y("Decoded [");
            y.append(decodeBitmap.getWidth());
            y.append("x");
            y.append(decodeBitmap.getHeight());
            y.append("] for [");
            y.append(i2);
            y.append("x");
            y.append(i3);
            y.append("]");
            Log.v("BitmapImageDecoder", y.toString());
        }
        return new e(decodeBitmap, dVar.f852b);
    }
}
