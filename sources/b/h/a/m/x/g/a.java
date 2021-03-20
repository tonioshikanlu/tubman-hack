package b.h.a.m.x.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import b.a.a.n.f;
import b.h.a.l.c;
import b.h.a.l.d;
import b.h.a.l.e;
import b.h.a.m.g;
import b.h.a.m.p;
import b.h.a.m.r;
import b.h.a.m.v.w;
import b.h.a.s.j;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class a implements r<ByteBuffer, c> {
    public static final C0036a f = new C0036a();

    /* renamed from: g  reason: collision with root package name */
    public static final b f895g = new b();
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ImageHeaderParser> f896b;
    public final b c;
    public final C0036a d;

    /* renamed from: e  reason: collision with root package name */
    public final b f897e;

    @VisibleForTesting
    /* renamed from: b.h.a.m.x.g.a$a  reason: collision with other inner class name */
    public static class C0036a {
    }

    @VisibleForTesting
    public static class b {
        public final Queue<d> a = new ArrayDeque(0);

        public b() {
            char[] cArr = j.a;
        }

        public synchronized void a(d dVar) {
            dVar.f553b = null;
            dVar.c = null;
            this.a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, b.h.a.m.v.c0.d dVar, b.h.a.m.v.c0.b bVar) {
        b bVar2 = f895g;
        C0036a aVar = f;
        this.a = context.getApplicationContext();
        this.f896b = list;
        this.d = aVar;
        this.f897e = new b(dVar, bVar);
        this.c = bVar2;
    }

    public static int d(c cVar, int i2, int i3) {
        int min = Math.min(cVar.f548g / i3, cVar.f / i2);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder A = b.e.a.a.a.A("Downsampling GIF, sampleSize: ", max, ", target dimens: [", i2, "x");
            A.append(i3);
            A.append("], actual dimens: [");
            A.append(cVar.f);
            A.append("x");
            A.append(cVar.f548g);
            A.append("]");
            Log.v("BufferGifDecoder", A.toString());
        }
        return max;
    }

    public w a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        d dVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        b bVar = this.c;
        synchronized (bVar) {
            d poll = bVar.a.poll();
            if (poll == null) {
                poll = new d();
            }
            dVar = poll;
            dVar.f553b = null;
            Arrays.fill(dVar.a, (byte) 0);
            dVar.c = new c();
            dVar.d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            dVar.f553b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f553b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            return c(byteBuffer, i2, i3, dVar, pVar);
        } finally {
            this.c.a(dVar);
        }
    }

    public boolean b(@NonNull Object obj, @NonNull p pVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!((Boolean) pVar.c(i.f927b)).booleanValue()) {
            if ((byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : f.x(this.f896b, new g(byteBuffer))) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final e c(ByteBuffer byteBuffer, int i2, int i3, d dVar, p pVar) {
        int i4 = b.h.a.s.f.f1014b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            c b2 = dVar.b();
            if (b2.c > 0) {
                if (b2.f546b == 0) {
                    Bitmap.Config config = pVar.c(i.a) == b.h.a.m.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    int d2 = d(b2, i2, i3);
                    C0036a aVar = this.d;
                    b bVar = this.f897e;
                    Objects.requireNonNull(aVar);
                    e eVar = new e(bVar, b2, byteBuffer, d2);
                    eVar.i(config);
                    eVar.f560k = (eVar.f560k + 1) % eVar.f561l.c;
                    Bitmap b3 = eVar.b();
                    if (b3 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            StringBuilder y = b.e.a.a.a.y("Decoded GIF from stream in ");
                            y.append(b.h.a.s.f.a(elapsedRealtimeNanos));
                            Log.v("BufferGifDecoder", y.toString());
                        }
                        return null;
                    }
                    e eVar2 = new e(new c(this.a, eVar, (b.h.a.m.x.b) b.h.a.m.x.b.f844b, i2, i3, b3));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        StringBuilder y2 = b.e.a.a.a.y("Decoded GIF from stream in ");
                        y2.append(b.h.a.s.f.a(elapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", y2.toString());
                    }
                    return eVar2;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder y3 = b.e.a.a.a.y("Decoded GIF from stream in ");
                y3.append(b.h.a.s.f.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", y3.toString());
            }
        }
    }
}
