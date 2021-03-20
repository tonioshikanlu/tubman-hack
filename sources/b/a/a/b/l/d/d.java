package b.a.a.b.l.d;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.Key;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.appfoundry.previewer.constants.AnimationStrength;
import com.appfoundry.previewer.constants.AnimationType;
import e.t.g;
import e.x.c.i;
import java.util.List;

public final class d<T extends RecyclerView.ViewHolder> extends b<T> {

    /* renamed from: g  reason: collision with root package name */
    public Interpolator f170g;

    /* renamed from: h  reason: collision with root package name */
    public final String f171h;

    /* renamed from: i  reason: collision with root package name */
    public final String f172i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(androidx.recyclerview.widget.RecyclerView.Adapter r7, androidx.recyclerview.widget.RecyclerView r8, java.util.List r9, android.view.animation.Interpolator r10, int r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r6 = this;
            r9 = r14 & 4
            r3 = 0
            r9 = r14 & 8
            r9 = 0
            r10 = r14 & 16
            if (r10 == 0) goto L_0x000c
            r11 = 300(0x12c, float:4.2E-43)
        L_0x000c:
            r5 = r11
            r10 = r14 & 64
            if (r10 == 0) goto L_0x0013
            java.lang.String r13 = "medium"
        L_0x0013:
            java.lang.String r10 = "adapter"
            e.x.c.i.e(r7, r10)
            java.lang.String r10 = "recyclerView"
            e.x.c.i.e(r8, r10)
            java.lang.String r10 = "scaleType"
            e.x.c.i.e(r12, r10)
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f170g = r9
            r6.f171h = r12
            r6.f172i = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.b.l.d.d.<init>(androidx.recyclerview.widget.RecyclerView$Adapter, androidx.recyclerview.widget.RecyclerView, java.util.List, android.view.animation.Interpolator, int, java.lang.String, java.lang.String, int):void");
    }

    public List<Animator> a(View view) {
        i.e(view, "view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, Key.SCALE_X, new float[]{b(), 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, Key.SCALE_Y, new float[]{b(), 1.0f});
        Interpolator interpolator = this.f170g;
        if (interpolator != null) {
            i.d(ofFloat, "scaleXAnimator");
            ofFloat.setInterpolator(interpolator);
            i.d(ofFloat2, "scaleYAnimator");
            ofFloat2.setInterpolator(interpolator);
        }
        return g.B(ofFloat, ofFloat2);
    }

    public final float b() {
        if (i.a(this.f171h, AnimationType.CONTRACT)) {
            String str = this.f172i;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 99152071) {
                    if (hashCode == 102970646 && str.equals(AnimationStrength.LIGHT)) {
                        return 1.1f;
                    }
                } else if (str.equals(AnimationStrength.HEAVY)) {
                    return 1.5f;
                }
            }
            return 1.3f;
        }
        String str2 = this.f172i;
        if (str2 != null) {
            int hashCode2 = str2.hashCode();
            if (hashCode2 != 99152071) {
                if (hashCode2 == 102970646 && str2.equals(AnimationStrength.LIGHT)) {
                    return 0.9f;
                }
            } else if (str2.equals(AnimationStrength.HEAVY)) {
                return 0.5f;
            }
        }
        return 0.7f;
    }
}
