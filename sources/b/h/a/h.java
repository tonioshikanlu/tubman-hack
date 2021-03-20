package b.h.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.m.v.k;
import b.h.a.n.n;
import b.h.a.q.b;
import b.h.a.q.c;
import b.h.a.q.d;
import b.h.a.q.e;
import b.h.a.q.g;
import b.h.a.q.h.i;
import b.h.a.s.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public class h<TranscodeType> extends b.h.a.q.a<h<TranscodeType>> implements Cloneable {
    public final Context H;
    public final i I;
    public final Class<TranscodeType> J;
    public final e K;
    @NonNull
    public j<?, ? super TranscodeType> L;
    @Nullable
    public Object M;
    @Nullable
    public List<d<TranscodeType>> N;
    public boolean O = true;
    public boolean P;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f504b;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|(2:1|2)|3|5|6|7|8|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(3:27|28|30)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|8|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0015 */
        static {
            /*
                b.h.a.f.values()
                r0 = 4
                int[] r1 = new int[r0]
                f504b = r1
                r2 = 1
                r3 = 3
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x000c }
            L_0x000c:
                r1 = 2
                int[] r4 = f504b     // Catch:{ NoSuchFieldError -> 0x0011 }
                r4[r1] = r1     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r4 = f504b     // Catch:{ NoSuchFieldError -> 0x0015 }
                r4[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                int[] r4 = f504b     // Catch:{ NoSuchFieldError -> 0x001a }
                r5 = 0
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x001a }
            L_0x001a:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r2 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x003f }
                android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x003f }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x005f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x005f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006a }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x006a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0076 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0076 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0076 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0076 }
            L_0x0076:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.h.a.h.a.<clinit>():void");
        }
    }

    static {
        e eVar = (e) ((e) ((e) new e().g(k.f717b)).p(f.LOW)).t(true);
    }

    @SuppressLint({"CheckResult"})
    public h(@NonNull c cVar, i iVar, Class<TranscodeType> cls, Context context) {
        e eVar;
        this.I = iVar;
        this.J = cls;
        this.H = context;
        e eVar2 = iVar.f505h.f469j;
        j<?, ?> jVar = eVar2.f.get(cls);
        if (jVar == null) {
            for (Map.Entry next : eVar2.f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    jVar = (j) next.getValue();
                }
            }
        }
        this.L = jVar == null ? e.f486k : jVar;
        this.K = cVar.f469j;
        for (d<Object> z : iVar.f514q) {
            z(z);
        }
        synchronized (iVar) {
            eVar = iVar.r;
        }
        a(eVar);
    }

    @CheckResult
    @NonNull
    /* renamed from: A */
    public h<TranscodeType> a(@NonNull b.h.a.q.a<?> aVar) {
        Objects.requireNonNull(aVar, "Argument must not be null");
        return (h) super.a(aVar);
    }

    public final b B(Object obj, b.h.a.q.h.h<TranscodeType> hVar, @Nullable d<TranscodeType> dVar, @Nullable c cVar, j<?, ? super TranscodeType> jVar, f fVar, int i2, int i3, b.h.a.q.a<?> aVar, Executor executor) {
        return I(obj, hVar, dVar, aVar, (c) null, jVar, fVar, i2, i3, executor);
    }

    @CheckResult
    /* renamed from: C */
    public h<TranscodeType> d() {
        h<TranscodeType> hVar = (h) super.clone();
        hVar.L = hVar.L.a();
        return hVar;
    }

    public final <Y extends b.h.a.q.h.h<TranscodeType>> Y D(@NonNull Y y, @Nullable d<TranscodeType> dVar, b.h.a.q.a<?> aVar, Executor executor) {
        Y y2 = y;
        b.h.a.q.a<?> aVar2 = aVar;
        Objects.requireNonNull(y, "Argument must not be null");
        if (this.P) {
            b B = B(new Object(), y, dVar, (c) null, this.L, aVar2.f963k, aVar2.r, aVar2.f969q, aVar, executor);
            b f = y.f();
            g gVar = (g) B;
            if (gVar.i(f)) {
                if (!(!aVar2.f968p && f.c())) {
                    Objects.requireNonNull(f, "Argument must not be null");
                    if (!f.isRunning()) {
                        f.a();
                    }
                    return y2;
                }
            }
            this.I.n(y);
            y.i(B);
            i iVar = this.I;
            synchronized (iVar) {
                iVar.f510m.f953h.add(y);
                n nVar = iVar.f508k;
                nVar.a.add(B);
                if (!nVar.c) {
                    gVar.a();
                } else {
                    gVar.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    nVar.f946b.add(B);
                }
            }
            return y2;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    @NonNull
    public i<ImageView, TranscodeType> E(@NonNull ImageView imageView) {
        b.h.a.q.a aVar;
        i<ImageView, TranscodeType> iVar;
        j.a();
        if (!b.h.a.q.a.i(this.f960h, 2048) && this.u && imageView.getScaleType() != null) {
            switch (a.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = d().k();
                    break;
                case 2:
                case 6:
                    aVar = d().l();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = d().m();
                    break;
            }
        }
        aVar = this;
        e eVar = this.K;
        Class<TranscodeType> cls = this.J;
        Objects.requireNonNull(eVar.c);
        if (Bitmap.class.equals(cls)) {
            iVar = new b.h.a.q.h.b(imageView);
        } else if (Drawable.class.isAssignableFrom(cls)) {
            iVar = new b.h.a.q.h.d(imageView);
        } else {
            throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
        }
        D(iVar, (d) null, aVar, b.h.a.s.e.a);
        return iVar;
    }

    @CheckResult
    @NonNull
    public h<TranscodeType> F(@Nullable Object obj) {
        this.M = obj;
        this.P = true;
        return this;
    }

    @CheckResult
    @NonNull
    public h<TranscodeType> G(@Nullable String str) {
        this.M = str;
        this.P = true;
        return this;
    }

    public final b I(Object obj, b.h.a.q.h.h<TranscodeType> hVar, d<TranscodeType> dVar, b.h.a.q.a<?> aVar, c cVar, j<?, ? super TranscodeType> jVar, f fVar, int i2, int i3, Executor executor) {
        Context context = this.H;
        e eVar = this.K;
        return new g(context, eVar, obj, this.M, this.J, aVar, i2, i3, fVar, hVar, dVar, this.N, cVar, eVar.f489g, jVar.f517h, executor);
    }

    @CheckResult
    @NonNull
    public h<TranscodeType> J(@NonNull j<?, ? super TranscodeType> jVar) {
        Objects.requireNonNull(jVar, "Argument must not be null");
        this.L = jVar;
        this.O = false;
        return this;
    }

    @CheckResult
    @NonNull
    public h<TranscodeType> z(@Nullable d<TranscodeType> dVar) {
        if (dVar != null) {
            if (this.N == null) {
                this.N = new ArrayList();
            }
            this.N.add(dVar);
        }
        return this;
    }
}
