package b.o;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import b.o.i2;
import b.o.q4;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.Objects;

public class a0 {

    /* renamed from: p  reason: collision with root package name */
    public static final int f5992p = Color.parseColor("#00000000");

    /* renamed from: q  reason: collision with root package name */
    public static final int f5993q = Color.parseColor("#BB000000");
    public static final int r = g2.b(24);
    public static final int s = g2.b(4);
    public PopupWindow a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f5994b;
    public final Handler c = new Handler();
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f5995e;
    public double f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5996g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5997h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5998i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public q4.g f5999j;

    /* renamed from: k  reason: collision with root package name */
    public WebView f6000k;

    /* renamed from: l  reason: collision with root package name */
    public RelativeLayout f6001l;

    /* renamed from: m  reason: collision with root package name */
    public m f6002m;

    /* renamed from: n  reason: collision with root package name */
    public c f6003n;

    /* renamed from: o  reason: collision with root package name */
    public Runnable f6004o;

    public class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Activity f6005h;

        public a(Activity activity) {
            this.f6005h = activity;
        }

        public void run() {
            a0.this.d(this.f6005h);
        }
    }

    public class b implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ q4.f f6007h;

        public b(q4.f fVar) {
            this.f6007h = fVar;
        }

        public void run() {
            RelativeLayout relativeLayout;
            a0 a0Var = a0.this;
            if (!a0Var.f5996g || (relativeLayout = a0Var.f6001l) == null) {
                a0.a(a0Var);
                q4.f fVar = this.f6007h;
                if (fVar != null) {
                    fVar.a();
                    return;
                }
                return;
            }
            q4.f fVar2 = this.f6007h;
            Objects.requireNonNull(a0Var);
            a0Var.b(relativeLayout, 400, a0.f5993q, a0.f5992p, new b0(a0Var, fVar2)).start();
        }
    }

    public interface c {
    }

    public a0(@NonNull WebView webView, @NonNull q4.g gVar, int i2, double d2) {
        boolean z = false;
        this.f5997h = false;
        this.f5998i = false;
        this.f6000k = webView;
        this.f5999j = gVar;
        this.f5995e = i2;
        this.d = -1;
        this.f = Double.isNaN(d2) ? ShadowDrawableWrapper.COS_45 : d2;
        int ordinal = gVar.ordinal();
        this.f5996g = !((ordinal == 0 || ordinal == 1) ? true : z);
    }

    public static void a(a0 a0Var) {
        a0Var.h();
        c cVar = a0Var.f6003n;
        if (cVar != null) {
            t4 t4Var = (t4) cVar;
            i2.p().p(t4Var.a.d);
            t4Var.a.h();
        }
    }

    public final ValueAnimator b(View view, int i2, int i3, int i4, Animator.AnimatorListener animatorListener) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration((long) i2);
        valueAnimator.setIntValues(new int[]{i3, i4});
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.addUpdateListener(new s2(view));
        if (animatorListener != null) {
            valueAnimator.addListener(animatorListener);
        }
        return valueAnimator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.o.m.b c(int r6, b.o.q4.g r7) {
        /*
            r5 = this;
            b.o.m$b r0 = new b.o.m$b
            r0.<init>()
            int r1 = r
            r0.d = r1
            r0.f6194b = r1
            r0.f6195e = r6
            r5.g()
            int r2 = r7.ordinal()
            r3 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r3) goto L_0x0039
            r4 = 2
            if (r2 == r4) goto L_0x0028
            r6 = 3
            if (r2 == r6) goto L_0x0020
            goto L_0x0049
        L_0x0020:
            int r6 = r5.g()
            int r1 = r1 * r4
            int r6 = r6 - r1
            r0.f6195e = r6
        L_0x0028:
            int r1 = r5.g()
            int r1 = r1 / r4
            int r6 = r6 / r4
            int r1 = r1 - r6
            int r6 = s
            int r6 = r6 + r1
            r0.c = r6
            r0.f6194b = r1
            r0.a = r1
            goto L_0x0049
        L_0x0039:
            int r2 = r5.g()
            int r2 = r2 - r6
            r0.a = r2
            int r6 = s
            int r1 = r1 + r6
            goto L_0x0047
        L_0x0044:
            int r6 = s
            int r1 = r1 - r6
        L_0x0047:
            r0.c = r1
        L_0x0049:
            b.o.q4$g r6 = b.o.q4.g.TOP_BANNER
            if (r7 != r6) goto L_0x004e
            r3 = 0
        L_0x004e:
            r0.f = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.a0.c(int, b.o.q4$g):b.o.m$b");
    }

    public final void d(Activity activity) {
        LinearLayout.LayoutParams layoutParams;
        int i2;
        if (!g2.d(activity) || this.f6001l != null) {
            new Handler().postDelayed(new a(activity), 200);
            return;
        }
        this.f5994b = activity;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, this.f5995e);
        layoutParams2.addRule(13);
        if (this.f5996g) {
            layoutParams = new LinearLayout.LayoutParams(this.d, -1);
            int ordinal = this.f5999j.ordinal();
            if (ordinal == 0) {
                i2 = 49;
            } else if (ordinal == 1) {
                i2 = 81;
            } else if (ordinal == 2 || ordinal == 3) {
                i2 = 17;
            }
            layoutParams.gravity = i2;
        } else {
            layoutParams = null;
        }
        q4.g gVar = this.f5999j;
        f2.u(new x(this, layoutParams2, layoutParams, c(this.f5995e, gVar), gVar));
    }

    public void e(@Nullable q4.f fVar) {
        m mVar = this.f6002m;
        if (mVar == null) {
            i2.a(i2.k.ERROR, "No host presenter to trigger dismiss animation, counting as dismissed already", new Throwable());
            this.f6001l = null;
            this.f6002m = null;
            this.f6000k = null;
            if (fVar != null) {
                ((q4.d) fVar).a();
                return;
            }
            return;
        }
        mVar.f6192j = true;
        mVar.f6191i.smoothSlideViewTo(mVar, mVar.getLeft(), mVar.f6193k.f6197h);
        ViewCompat.postInvalidateOnAnimation(mVar);
        f(fVar);
    }

    public final void f(q4.f fVar) {
        new Handler(Looper.getMainLooper()).postDelayed(new b(fVar), (long) 600);
    }

    public final int g() {
        return g2.c(this.f5994b);
    }

    public void h() {
        i2.a(i2.k.DEBUG, "InAppMessageView removing views", (Throwable) null);
        Runnable runnable = this.f6004o;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
            this.f6004o = null;
        }
        m mVar = this.f6002m;
        if (mVar != null) {
            mVar.removeAllViews();
        }
        PopupWindow popupWindow = this.a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f6001l = null;
        this.f6002m = null;
        this.f6000k = null;
    }
}
