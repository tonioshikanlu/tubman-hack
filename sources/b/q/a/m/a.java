package b.q.a.m;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import b.q.a.i.c;
import b.q.a.m.c;
import com.yalantis.ucrop.UCropActivity;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class a extends c {
    public c A;
    public Runnable B;
    public Runnable C;
    public float D;
    public float E;
    public int F;
    public int G;
    public long H;
    public final RectF w;
    public final Matrix x;
    public float y;
    public float z;

    /* renamed from: b.q.a.m.a$a  reason: collision with other inner class name */
    public static class C0119a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final WeakReference<a> f6820h;

        /* renamed from: i  reason: collision with root package name */
        public final long f6821i;

        /* renamed from: j  reason: collision with root package name */
        public final long f6822j = System.currentTimeMillis();

        /* renamed from: k  reason: collision with root package name */
        public final float f6823k;

        /* renamed from: l  reason: collision with root package name */
        public final float f6824l;

        /* renamed from: m  reason: collision with root package name */
        public final float f6825m;

        /* renamed from: n  reason: collision with root package name */
        public final float f6826n;

        /* renamed from: o  reason: collision with root package name */
        public final float f6827o;

        /* renamed from: p  reason: collision with root package name */
        public final float f6828p;

        /* renamed from: q  reason: collision with root package name */
        public final boolean f6829q;

        public C0119a(a aVar, long j2, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
            this.f6820h = new WeakReference<>(aVar);
            this.f6821i = j2;
            this.f6823k = f;
            this.f6824l = f2;
            this.f6825m = f3;
            this.f6826n = f4;
            this.f6827o = f5;
            this.f6828p = f6;
            this.f6829q = z;
        }

        public void run() {
            a aVar = (a) this.f6820h.get();
            if (aVar != null) {
                float min = (float) Math.min(this.f6821i, System.currentTimeMillis() - this.f6822j);
                float f = this.f6825m;
                float f2 = (float) this.f6821i;
                float f3 = (min / f2) - 1.0f;
                float f4 = (f3 * f3 * f3) + 1.0f;
                float f5 = (f * f4) + 0.0f;
                float f6 = (f4 * this.f6826n) + 0.0f;
                float h0 = b.q.a.a.h0(min, 0.0f, this.f6828p, f2);
                if (min < ((float) this.f6821i)) {
                    float[] fArr = aVar.f6838i;
                    aVar.g(f5 - (fArr[0] - this.f6823k), f6 - (fArr[1] - this.f6824l));
                    if (!this.f6829q) {
                        aVar.l(this.f6827o + h0, aVar.w.centerX(), aVar.w.centerY());
                    }
                    if (!aVar.j(aVar.f6837h)) {
                        aVar.post(this);
                    }
                }
            }
        }
    }

    public static class b implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final WeakReference<a> f6830h;

        /* renamed from: i  reason: collision with root package name */
        public final long f6831i;

        /* renamed from: j  reason: collision with root package name */
        public final long f6832j = System.currentTimeMillis();

        /* renamed from: k  reason: collision with root package name */
        public final float f6833k;

        /* renamed from: l  reason: collision with root package name */
        public final float f6834l;

        /* renamed from: m  reason: collision with root package name */
        public final float f6835m;

        /* renamed from: n  reason: collision with root package name */
        public final float f6836n;

        public b(a aVar, long j2, float f, float f2, float f3, float f4) {
            this.f6830h = new WeakReference<>(aVar);
            this.f6831i = j2;
            this.f6833k = f;
            this.f6834l = f2;
            this.f6835m = f3;
            this.f6836n = f4;
        }

        public void run() {
            a aVar = (a) this.f6830h.get();
            if (aVar != null) {
                float min = (float) Math.min(this.f6831i, System.currentTimeMillis() - this.f6832j);
                float h0 = b.q.a.a.h0(min, 0.0f, this.f6834l, (float) this.f6831i);
                if (min < ((float) this.f6831i)) {
                    aVar.l(this.f6833k + h0, this.f6835m, this.f6836n);
                    aVar.post(this);
                    return;
                }
                aVar.setImageToWrapCropBounds(true);
            }
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.w = new RectF();
        this.x = new Matrix();
        this.z = 10.0f;
        this.C = null;
        this.F = 0;
        this.G = 0;
        this.H = 500;
    }

    public void d() {
        super.d();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            if (this.y == 0.0f) {
                this.y = intrinsicWidth / intrinsicHeight;
            }
            int i2 = this.f6841l;
            float f = (float) i2;
            float f2 = this.y;
            int i3 = (int) (f / f2);
            int i4 = this.f6842m;
            if (i3 > i4) {
                float f3 = (float) i4;
                int i5 = (int) (f2 * f3);
                int i6 = (i2 - i5) / 2;
                this.w.set((float) i6, 0.0f, (float) (i5 + i6), f3);
            } else {
                int i7 = (i4 - i3) / 2;
                this.w.set(0.0f, (float) i7, f, (float) (i3 + i7));
            }
            h(intrinsicWidth, intrinsicHeight);
            float width = this.w.width();
            float height = this.w.height();
            float max = Math.max(this.w.width() / intrinsicWidth, this.w.height() / intrinsicHeight);
            RectF rectF = this.w;
            float f4 = ((height - (intrinsicHeight * max)) / 2.0f) + rectF.top;
            this.f6840k.reset();
            this.f6840k.postScale(max, max);
            this.f6840k.postTranslate(((width - (intrinsicWidth * max)) / 2.0f) + rectF.left, f4);
            setImageMatrix(this.f6840k);
            c cVar = this.A;
            if (cVar != null) {
                ((d) cVar).a.f7427i.setTargetAspectRatio(this.y);
            }
            c.a aVar = this.f6843n;
            if (aVar != null) {
                ((UCropActivity.a) aVar).b(getCurrentScale());
                ((UCropActivity.a) this.f6843n).a(getCurrentAngle());
            }
        }
    }

    public void f(float f, float f2, float f3) {
        if ((f > 1.0f && getCurrentScale() * f <= getMaxScale()) || (f < 1.0f && getCurrentScale() * f >= getMinScale())) {
            super.f(f, f2, f3);
        }
    }

    @Nullable
    public b.q.a.i.c getCropBoundsChangeListener() {
        return this.A;
    }

    public float getMaxScale() {
        return this.D;
    }

    public float getMinScale() {
        return this.E;
    }

    public float getTargetAspectRatio() {
        return this.y;
    }

    public final void h(float f, float f2) {
        float min = Math.min(Math.min(this.w.width() / f, this.w.width() / f2), Math.min(this.w.height() / f2, this.w.height() / f));
        this.E = min;
        this.D = min * this.z;
    }

    public void i() {
        removeCallbacks(this.B);
        removeCallbacks(this.C);
    }

    public boolean j(float[] fArr) {
        this.x.reset();
        this.x.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.x.mapPoints(copyOf);
        float[] F0 = b.q.a.a.F0(this.w);
        this.x.mapPoints(F0);
        return b.q.a.a.k3(copyOf).contains(b.q.a.a.k3(F0));
    }

    public void k(float f) {
        e(f, this.w.centerX(), this.w.centerY());
    }

    public void l(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            f(f / getCurrentScale(), f2, f3);
        }
    }

    public void setCropBoundsChangeListener(@Nullable b.q.a.i.c cVar) {
        this.A = cVar;
    }

    public void setCropRect(RectF rectF) {
        this.y = rectF.width() / rectF.height();
        this.w.set(rectF.left - ((float) getPaddingLeft()), rectF.top - ((float) getPaddingTop()), rectF.right - ((float) getPaddingRight()), rectF.bottom - ((float) getPaddingBottom()));
        Drawable drawable = getDrawable();
        if (drawable != null) {
            h((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        }
        setImageToWrapCropBounds(true);
    }

    public void setImageToWrapCropBounds(boolean z2) {
        float f;
        boolean z3;
        float f2;
        float f3;
        float f4;
        if (this.r && !j(this.f6837h)) {
            float[] fArr = this.f6838i;
            float f5 = fArr[0];
            float f6 = fArr[1];
            float currentScale = getCurrentScale();
            float centerX = this.w.centerX() - f5;
            float centerY = this.w.centerY() - f6;
            this.x.reset();
            this.x.setTranslate(centerX, centerY);
            float[] fArr2 = this.f6837h;
            float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
            this.x.mapPoints(copyOf);
            boolean j2 = j(copyOf);
            if (j2) {
                this.x.reset();
                this.x.setRotate(-getCurrentAngle());
                float[] fArr3 = this.f6837h;
                float[] copyOf2 = Arrays.copyOf(fArr3, fArr3.length);
                float[] F0 = b.q.a.a.F0(this.w);
                this.x.mapPoints(copyOf2);
                this.x.mapPoints(F0);
                RectF k3 = b.q.a.a.k3(copyOf2);
                RectF k32 = b.q.a.a.k3(F0);
                float f7 = k3.left - k32.left;
                float f8 = k3.top - k32.top;
                float f9 = k3.right - k32.right;
                float f10 = k3.bottom - k32.bottom;
                float[] fArr4 = new float[4];
                if (f7 <= 0.0f) {
                    f7 = 0.0f;
                }
                fArr4[0] = f7;
                if (f8 <= 0.0f) {
                    f8 = 0.0f;
                }
                fArr4[1] = f8;
                if (f9 >= 0.0f) {
                    f9 = 0.0f;
                }
                fArr4[2] = f9;
                if (f10 >= 0.0f) {
                    f10 = 0.0f;
                }
                fArr4[3] = f10;
                this.x.reset();
                this.x.setRotate(getCurrentAngle());
                this.x.mapPoints(fArr4);
                f3 = -(fArr4[1] + fArr4[3]);
                f2 = 0.0f;
                f = currentScale;
                z3 = j2;
                f4 = -(fArr4[0] + fArr4[2]);
            } else {
                RectF rectF = new RectF(this.w);
                this.x.reset();
                this.x.setRotate(getCurrentAngle());
                this.x.mapRect(rectF);
                float[] fArr5 = this.f6837h;
                z3 = j2;
                f = currentScale;
                float[] fArr6 = {(float) Math.sqrt(Math.pow((double) (fArr5[1] - fArr5[3]), 2.0d) + Math.pow((double) (fArr5[0] - fArr5[2]), 2.0d)), (float) Math.sqrt(Math.pow((double) (fArr5[3] - fArr5[5]), 2.0d) + Math.pow((double) (fArr5[2] - fArr5[4]), 2.0d))};
                f4 = centerX;
                f2 = (Math.max(rectF.width() / fArr6[0], rectF.height() / fArr6[1]) * f) - f;
                f3 = centerY;
            }
            if (z2) {
                C0119a aVar = new C0119a(this, this.H, f5, f6, f4, f3, f, f2, z3);
                this.B = aVar;
                post(aVar);
                return;
            }
            g(f4, f3);
            if (!z3) {
                l(f + f2, this.w.centerX(), this.w.centerY());
            }
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(@IntRange(from = 100) long j2) {
        if (j2 > 0) {
            this.H = j2;
            return;
        }
        throw new IllegalArgumentException("Animation duration cannot be negative value.");
    }

    public void setMaxResultImageSizeX(@IntRange(from = 10) int i2) {
        this.F = i2;
    }

    public void setMaxResultImageSizeY(@IntRange(from = 10) int i2) {
        this.G = i2;
    }

    public void setMaxScaleMultiplier(float f) {
        this.z = f;
    }

    public void setTargetAspectRatio(float f) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            this.y = f;
            return;
        }
        if (f == 0.0f) {
            f = ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
        }
        this.y = f;
        b.q.a.i.c cVar = this.A;
        if (cVar != null) {
            ((d) cVar).a.f7427i.setTargetAspectRatio(f);
        }
    }
}
