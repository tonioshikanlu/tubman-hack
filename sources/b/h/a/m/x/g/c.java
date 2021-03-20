package b.h.a.m.x.g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import b.a.a.n.f;
import b.h.a.m.t;
import b.h.a.m.x.g.g;
import java.util.ArrayList;
import java.util.List;

public class c extends Drawable implements g.b, Animatable, Animatable2Compat {

    /* renamed from: h  reason: collision with root package name */
    public final a f899h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f900i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f901j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f902k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f903l = true;

    /* renamed from: m  reason: collision with root package name */
    public int f904m;

    /* renamed from: n  reason: collision with root package name */
    public int f905n = -1;

    /* renamed from: o  reason: collision with root package name */
    public boolean f906o;

    /* renamed from: p  reason: collision with root package name */
    public Paint f907p;

    /* renamed from: q  reason: collision with root package name */
    public Rect f908q;
    public List<Animatable2Compat.AnimationCallback> r;

    public static final class a extends Drawable.ConstantState {
        @VisibleForTesting
        public final g a;

        public a(g gVar) {
            this.a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @NonNull
        public Drawable newDrawable() {
            return new c(this);
        }

        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c(Context context, b.h.a.l.a aVar, t<Bitmap> tVar, int i2, int i3, Bitmap bitmap) {
        a aVar2 = new a(new g(b.h.a.c.b(context), aVar, i2, i3, tVar, bitmap));
        this.f899h = aVar2;
    }

    public void a() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        g gVar = this.f899h.a;
        g.a aVar = gVar.f914i;
        if ((aVar != null ? aVar.f924l : -1) == gVar.a.d() - 1) {
            this.f904m++;
        }
        int i2 = this.f905n;
        if (i2 != -1 && this.f904m >= i2) {
            List<Animatable2Compat.AnimationCallback> list = this.r;
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    this.r.get(i3).onAnimationEnd(this);
                }
            }
            stop();
        }
    }

    public Bitmap b() {
        return this.f899h.a.f917l;
    }

    public final Paint c() {
        if (this.f907p == null) {
            this.f907p = new Paint(2);
        }
        return this.f907p;
    }

    public void clearAnimationCallbacks() {
        List<Animatable2Compat.AnimationCallback> list = this.r;
        if (list != null) {
            list.clear();
        }
    }

    public final void d() {
        f.b(!this.f902k, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f899h.a.a.d() != 1) {
            if (!this.f900i) {
                this.f900i = true;
                g gVar = this.f899h.a;
                if (gVar.f915j) {
                    throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
                } else if (!gVar.c.contains(this)) {
                    boolean isEmpty = gVar.c.isEmpty();
                    gVar.c.add(this);
                    if (isEmpty && !gVar.f) {
                        gVar.f = true;
                        gVar.f915j = false;
                        gVar.a();
                    }
                } else {
                    throw new IllegalStateException("Cannot subscribe twice in a row");
                }
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap;
        if (!this.f902k) {
            if (this.f906o) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.f908q == null) {
                    this.f908q = new Rect();
                }
                Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f908q);
                this.f906o = false;
            }
            g gVar = this.f899h.a;
            g.a aVar = gVar.f914i;
            if (aVar != null) {
                bitmap = aVar.f926n;
            } else {
                bitmap = gVar.f917l;
            }
            if (this.f908q == null) {
                this.f908q = new Rect();
            }
            canvas.drawBitmap(bitmap, (Rect) null, this.f908q, c());
        }
    }

    public final void e() {
        this.f900i = false;
        g gVar = this.f899h.a;
        gVar.c.remove(this);
        if (gVar.c.isEmpty()) {
            gVar.f = false;
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f899h;
    }

    public int getIntrinsicHeight() {
        return this.f899h.a.f922q;
    }

    public int getIntrinsicWidth() {
        return this.f899h.a.f921p;
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.f900i;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f906o = true;
    }

    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback != null) {
            if (this.r == null) {
                this.r = new ArrayList();
            }
            this.r.add(animationCallback);
        }
    }

    public void setAlpha(int i2) {
        c().setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        c().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        f.b(!this.f902k, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f903l = z;
        if (!z) {
            e();
        } else if (this.f901j) {
            d();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f901j = true;
        this.f904m = 0;
        if (this.f903l) {
            d();
        }
    }

    public void stop() {
        this.f901j = false;
        e();
    }

    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        List<Animatable2Compat.AnimationCallback> list = this.r;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    public c(a aVar) {
        this.f899h = aVar;
    }
}
