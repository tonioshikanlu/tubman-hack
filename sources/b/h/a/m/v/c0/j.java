package b.h.a.m.v.c0;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class j implements d {

    /* renamed from: j  reason: collision with root package name */
    public static final Bitmap.Config f638j = Bitmap.Config.ARGB_8888;
    public final k a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Bitmap.Config> f639b;
    public final a c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public long f640e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f641g;

    /* renamed from: h  reason: collision with root package name */
    public int f642h;

    /* renamed from: i  reason: collision with root package name */
    public int f643i;

    public interface a {
    }

    public static final class b implements a {
    }

    public j(long j2) {
        m mVar = new m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i2 = Build.VERSION.SDK_INT;
        hashSet.add((Object) null);
        if (i2 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j2;
        this.a = mVar;
        this.f639b = unmodifiableSet;
        this.c = new b();
    }

    @SuppressLint({"InlinedApi"})
    public void a(int i2) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i2);
        }
        if (i2 >= 40 || i2 >= 20) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "clearMemory");
            }
            i(0);
        } else if (i2 >= 20 || i2 == 15) {
            i(this.d / 2);
        }
    }

    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        i(0);
    }

    @NonNull
    public Bitmap c(int i2, int i3, Bitmap.Config config) {
        Bitmap h2 = h(i2, i3, config);
        if (h2 != null) {
            return h2;
        }
        if (config == null) {
            config = f638j;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    @NonNull
    public Bitmap d(int i2, int i3, Bitmap.Config config) {
        Bitmap h2 = h(i2, i3, config);
        if (h2 != null) {
            h2.eraseColor(0);
            return h2;
        }
        if (config == null) {
            config = f638j;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    public synchronized void e(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        Objects.requireNonNull((m) this.a);
                        if (((long) b.h.a.s.j.d(bitmap)) <= this.d) {
                            if (this.f639b.contains(bitmap.getConfig())) {
                                Objects.requireNonNull((m) this.a);
                                int d2 = b.h.a.s.j.d(bitmap);
                                ((m) this.a).f(bitmap);
                                Objects.requireNonNull((b) this.c);
                                this.f642h++;
                                this.f640e += (long) d2;
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Put bitmap in pool=");
                                    sb.append(((m) this.a).e(bitmap));
                                    Log.v("LruBitmapPool", sb.toString());
                                }
                                f();
                                i(this.d);
                                return;
                            }
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Reject bitmap from pool, bitmap: ");
                        sb2.append(((m) this.a).e(bitmap));
                        sb2.append(", is mutable: ");
                        sb2.append(bitmap.isMutable());
                        sb2.append(", is allowed config: ");
                        sb2.append(this.f639b.contains(bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb2.toString());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public final void f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            g();
        }
    }

    public final void g() {
        StringBuilder y = b.e.a.a.a.y("Hits=");
        y.append(this.f);
        y.append(", misses=");
        y.append(this.f641g);
        y.append(", puts=");
        y.append(this.f642h);
        y.append(", evictions=");
        y.append(this.f643i);
        y.append(", currentSize=");
        y.append(this.f640e);
        y.append(", maxSize=");
        y.append(this.d);
        y.append("\nStrategy=");
        y.append(this.a);
        Log.v("LruBitmapPool", y.toString());
    }

    @Nullable
    public final synchronized Bitmap h(int i2, int i3, @Nullable Bitmap.Config config) {
        Bitmap b2;
        if (Build.VERSION.SDK_INT >= 26) {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
        }
        b2 = ((m) this.a).b(i2, i3, config != null ? config : f638j);
        if (b2 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                Objects.requireNonNull((m) this.a);
                sb.append(m.c(b.h.a.s.j.c(i2, i3, config), config));
                Log.d("LruBitmapPool", sb.toString());
            }
            this.f641g++;
        } else {
            this.f++;
            long j2 = this.f640e;
            Objects.requireNonNull((m) this.a);
            this.f640e = j2 - ((long) b.h.a.s.j.d(b2));
            Objects.requireNonNull((b) this.c);
            b2.setHasAlpha(true);
            b2.setPremultiplied(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            Objects.requireNonNull((m) this.a);
            sb2.append(m.c(b.h.a.s.j.c(i2, i3, config), config));
            Log.v("LruBitmapPool", sb2.toString());
        }
        f();
        return b2;
    }

    public final synchronized void i(long j2) {
        while (this.f640e > j2) {
            m mVar = (m) this.a;
            Bitmap c2 = mVar.f647b.c();
            if (c2 != null) {
                mVar.a(Integer.valueOf(b.h.a.s.j.d(c2)), c2);
            }
            if (c2 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    g();
                }
                this.f640e = 0;
                return;
            }
            Objects.requireNonNull((b) this.c);
            long j3 = this.f640e;
            Objects.requireNonNull((m) this.a);
            this.f640e = j3 - ((long) b.h.a.s.j.d(c2));
            this.f643i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Evicting bitmap=");
                sb.append(((m) this.a).e(c2));
                Log.d("LruBitmapPool", sb.toString());
            }
            f();
            c2.recycle();
        }
    }
}
