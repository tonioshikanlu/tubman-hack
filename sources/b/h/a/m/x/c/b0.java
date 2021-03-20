package b.h.a.m.x.c;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import b.h.a.m.o;
import b.h.a.m.p;
import b.h.a.m.r;
import b.h.a.m.v.w;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Objects;

public class b0<T> implements r<T, Bitmap> {
    public static final o<Long> d = new o<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e  reason: collision with root package name */
    public static final o<Integer> f848e = new o<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());
    public static final e f = new e();
    public final f<T> a;

    /* renamed from: b  reason: collision with root package name */
    public final b.h.a.m.v.c0.d f849b;
    public final e c;

    public class a implements o.b<Long> {
        public final ByteBuffer a = ByteBuffer.allocate(8);

        public void a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
            Long l2 = (Long) obj;
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l2.longValue()).array());
            }
        }
    }

    public class b implements o.b<Integer> {
        public final ByteBuffer a = ByteBuffer.allocate(4);

        public void a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
            Integer num = (Integer) obj;
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.a) {
                    this.a.position(0);
                    messageDigest.update(this.a.putInt(num.intValue()).array());
                }
            }
        }
    }

    public static final class c implements f<AssetFileDescriptor> {
        public c(a aVar) {
        }

        public void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    @RequiresApi(23)
    public static final class d implements f<ByteBuffer> {
        public void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(new c0(this, (ByteBuffer) obj));
        }
    }

    @VisibleForTesting
    public static class e {
    }

    @VisibleForTesting
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    public static final class g implements f<ParcelFileDescriptor> {
        public void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }
    }

    public b0(b.h.a.m.v.c0.d dVar, f<T> fVar) {
        e eVar = f;
        this.f849b = dVar;
        this.a = fVar;
        this.c = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, b.h.a.m.x.c.l r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L_0x0060
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L_0x0060
            if (r14 == r0) goto L_0x0060
            b.h.a.m.x.c.l r0 = b.h.a.m.x.c.l.d
            if (r15 == r0) goto L_0x0060
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch:{ all -> 0x0051 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0051 }
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch:{ all -> 0x0051 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0051 }
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch:{ all -> 0x0051 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0051 }
            r3 = 90
            if (r2 == r3) goto L_0x0036
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L_0x0039
        L_0x0036:
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x0039:
            float r13 = r15.b(r0, r1, r13, r14)     // Catch:{ all -> 0x0051 }
            float r14 = (float) r0     // Catch:{ all -> 0x0051 }
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch:{ all -> 0x0051 }
            float r14 = (float) r1     // Catch:{ all -> 0x0051 }
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch:{ all -> 0x0051 }
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = r2.getScaledFrameAtTime(r3, r5, r6, r7)     // Catch:{ all -> 0x0051 }
            goto L_0x0061
        L_0x0051:
            r13 = move-exception
            r14 = 3
            java.lang.String r15 = "VideoDecoder"
            boolean r14 = android.util.Log.isLoggable(r15, r14)
            if (r14 == 0) goto L_0x0060
            java.lang.String r14 = "Exception trying to decode frame on oreo+"
            android.util.Log.d(r15, r14, r13)
        L_0x0060:
            r13 = 0
        L_0x0061:
            if (r13 != 0) goto L_0x0067
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L_0x0067:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.m.x.c.b0.c(android.media.MediaMetadataRetriever, long, int, int, int, b.h.a.m.x.c.l):android.graphics.Bitmap");
    }

    public w<Bitmap> a(@NonNull T t, int i2, int i3, @NonNull p pVar) {
        long longValue = ((Long) pVar.c(d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) pVar.c(f848e);
            if (num == null) {
                num = 2;
            }
            l lVar = (l) pVar.c(l.f);
            if (lVar == null) {
                lVar = l.f859e;
            }
            l lVar2 = lVar;
            Objects.requireNonNull(this.c);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.a.a(mediaMetadataRetriever, t);
                Bitmap c2 = c(mediaMetadataRetriever, longValue, num.intValue(), i2, i3, lVar2);
                mediaMetadataRetriever.release();
                return e.c(c2, this.f849b);
            } catch (RuntimeException e2) {
                throw new IOException(e2);
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException(b.e.a.a.a.j("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
    }

    public boolean b(@NonNull T t, @NonNull p pVar) {
        return true;
    }
}
