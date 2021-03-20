package b.a.a.b.l.d;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.Key;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import b.a.a.n.c;
import b.q.a.a;
import com.appfoundry.previewer.constants.AnimationStrength;
import e.x.c.i;
import java.util.List;

public final class e<T extends RecyclerView.ViewHolder> extends b<T> {

    /* renamed from: g  reason: collision with root package name */
    public Interpolator f173g;

    /* renamed from: h  reason: collision with root package name */
    public final String f174h;

    /* renamed from: i  reason: collision with root package name */
    public final String f175i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(androidx.recyclerview.widget.RecyclerView.Adapter r7, androidx.recyclerview.widget.RecyclerView r8, java.util.List r9, android.view.animation.Interpolator r10, java.lang.String r11, int r12, java.lang.String r13, int r14) {
        /*
            r6 = this;
            r9 = r14 & 4
            r3 = 0
            r9 = r14 & 8
            r9 = 0
            r10 = r14 & 32
            if (r10 == 0) goto L_0x000c
            r12 = 300(0x12c, float:4.2E-43)
        L_0x000c:
            r5 = r12
            r10 = r14 & 64
            if (r10 == 0) goto L_0x0013
            java.lang.String r13 = "medium"
        L_0x0013:
            java.lang.String r10 = "adapter"
            e.x.c.i.e(r7, r10)
            java.lang.String r10 = "recyclerView"
            e.x.c.i.e(r8, r10)
            java.lang.String r10 = "slideType"
            e.x.c.i.e(r11, r10)
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f173g = r9
            r6.f174h = r11
            r6.f175i = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.b.l.d.e.<init>(androidx.recyclerview.widget.RecyclerView$Adapter, androidx.recyclerview.widget.RecyclerView, java.util.List, android.view.animation.Interpolator, java.lang.String, int, java.lang.String, int):void");
    }

    public List<Animator> a(View view) {
        float f;
        i.e(view, "view");
        float[] fArr = new float[2];
        if (i.a(this.f174h, "right")) {
            String str = this.f175i;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 99152071) {
                    if (hashCode == 102970646 && str.equals(AnimationStrength.LIGHT)) {
                        f = -10.0f;
                    }
                } else if (str.equals(AnimationStrength.HEAVY)) {
                    f = -50.0f;
                }
            }
            f = -30.0f;
        } else {
            String str2 = this.f175i;
            if (str2 != null) {
                int hashCode2 = str2.hashCode();
                if (hashCode2 != 99152071) {
                    if (hashCode2 == 102970646 && str2.equals(AnimationStrength.LIGHT)) {
                        f = 10.0f;
                    }
                } else if (str2.equals(AnimationStrength.HEAVY)) {
                    f = 50.0f;
                }
            }
            f = 30.0f;
        }
        fArr[0] = c.d() * f;
        fArr[1] = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, Key.TRANSLATION_X, fArr);
        i.d(ofFloat, "ObjectAnimator.ofFloat(v…) * displayDensity(), 0f)");
        Interpolator interpolator = this.f173g;
        if (interpolator != null) {
            ofFloat.setInterpolator(interpolator);
        }
        return a.l2(ofFloat);
    }
}
