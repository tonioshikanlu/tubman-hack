package b.a.a.b;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import androidx.annotation.NonNull;
import b.h.a.m.m;
import b.h.a.m.v.c0.d;
import b.h.a.s.j;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class f extends b.h.a.m.x.c.f {
    public static final byte[] d = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(m.a);

    /* renamed from: e  reason: collision with root package name */
    public static final Set<String> f156e;
    public static final Lock f;

    /* renamed from: b  reason: collision with root package name */
    public float f157b;
    public float[] c;

    public static final class a implements Lock {
        public void lock() {
        }

        public void lockInterruptibly() {
        }

        @NonNull
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public boolean tryLock(long j2, @NonNull TimeUnit timeUnit) {
            return true;
        }

        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f156e = hashSet;
        f = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new a();
    }

    public f(float f2) {
        b.a.a.n.f.b(f2 > 0.0f, "commonRadius must be greater than 0.");
        this.f157b = f2;
    }

    public f(float[] fArr) {
        this.c = fArr;
    }

    public static Bitmap d(@NonNull d dVar, @NonNull Bitmap bitmap) {
        Bitmap.Config e2 = e(bitmap);
        if (e2.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap d2 = dVar.d(bitmap.getWidth(), bitmap.getHeight(), e2);
        new Canvas(d2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return d2;
    }

    public static Bitmap.Config e(@NonNull Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    public void b(@NonNull MessageDigest messageDigest) {
        float f2;
        ByteBuffer byteBuffer;
        messageDigest.update(d);
        if (this.c != null) {
            byteBuffer = ByteBuffer.allocate(4);
            f2 = this.c[0];
        } else {
            byteBuffer = ByteBuffer.allocate(4);
            f2 = this.f157b;
        }
        messageDigest.update(byteBuffer.putFloat(f2).array());
    }

    public Bitmap c(@NonNull d dVar, @NonNull Bitmap bitmap, int i2, int i3) {
        Bitmap bitmap2;
        float[] fArr = this.c;
        if (fArr != null) {
            Bitmap.Config e2 = e(bitmap);
            Bitmap d2 = d(dVar, bitmap);
            bitmap2 = dVar.d(d2.getWidth(), d2.getHeight(), e2);
            bitmap2.setHasAlpha(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(d2, tileMode, tileMode);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShader(bitmapShader);
            RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap2.getWidth(), (float) bitmap2.getHeight());
            Lock lock = f;
            lock.lock();
            try {
                Canvas canvas = new Canvas(bitmap2);
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                Path path = new Path();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
                canvas.setBitmap((Bitmap) null);
                lock.unlock();
                if (!d2.equals(bitmap)) {
                    dVar.e(d2);
                }
            } catch (Throwable th) {
                f.unlock();
                throw th;
            }
        } else {
            float f2 = this.f157b;
            b.a.a.n.f.b(f2 > 0.0f, "roundingRadius must be greater than 0.");
            Bitmap.Config e3 = e(bitmap);
            Bitmap d3 = d(dVar, bitmap);
            bitmap2 = dVar.d(d3.getWidth(), d3.getHeight(), e3);
            bitmap2.setHasAlpha(true);
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(d3, tileMode2, tileMode2);
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setShader(bitmapShader2);
            RectF rectF2 = new RectF(0.0f, 0.0f, (float) bitmap2.getWidth(), (float) bitmap2.getHeight());
            Lock lock2 = f;
            lock2.lock();
            try {
                Canvas canvas2 = new Canvas(bitmap2);
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas2.drawRoundRect(rectF2, f2, f2, paint2);
                canvas2.setBitmap((Bitmap) null);
                lock2.unlock();
                if (!d3.equals(bitmap)) {
                    dVar.e(d3);
                }
            } catch (Throwable th2) {
                f.unlock();
                throw th2;
            }
        }
        return bitmap2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        float[] fArr = this.c;
        if (fArr != null) {
            if (fArr != fVar.c) {
                return false;
            }
        } else if (this.f157b != fVar.f157b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        float[] fArr = this.c;
        return (j.f(fArr != null ? fArr[0] : this.f157b) * 31) - 569625254;
    }
}
