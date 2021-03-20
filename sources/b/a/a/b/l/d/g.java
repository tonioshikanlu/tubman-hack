package b.a.a.b.l.d;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public final class g<T extends RecyclerView.ViewHolder> extends b<T> {

    /* renamed from: g  reason: collision with root package name */
    public Interpolator f179g;

    /* renamed from: h  reason: collision with root package name */
    public final String f180h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(androidx.recyclerview.widget.RecyclerView.Adapter r7, androidx.recyclerview.widget.RecyclerView r8, java.util.List r9, android.view.animation.Interpolator r10, int r11, java.lang.String r12, int r13) {
        /*
            r6 = this;
            r9 = r13 & 4
            r3 = 0
            r9 = r13 & 8
            r9 = 0
            r10 = r13 & 16
            if (r10 == 0) goto L_0x000c
            r11 = 300(0x12c, float:4.2E-43)
        L_0x000c:
            r5 = r11
            r10 = r13 & 32
            if (r10 == 0) goto L_0x0013
            java.lang.String r12 = "medium"
        L_0x0013:
            java.lang.String r10 = "adapter"
            e.x.c.i.e(r7, r10)
            java.lang.String r10 = "recyclerView"
            e.x.c.i.e(r8, r10)
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f179g = r9
            r6.f180h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.b.l.d.g.<init>(androidx.recyclerview.widget.RecyclerView$Adapter, androidx.recyclerview.widget.RecyclerView, java.util.List, android.view.animation.Interpolator, int, java.lang.String, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<android.animation.Animator> a(android.view.View r5) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            e.x.c.i.e(r5, r0)
            r0 = 2
            float[] r0 = new float[r0]
            java.lang.String r1 = r4.f180h
            if (r1 != 0) goto L_0x000d
            goto L_0x0032
        L_0x000d:
            int r2 = r1.hashCode()
            r3 = 99152071(0x5e8f0c7, float:2.1905623E-35)
            if (r2 == r3) goto L_0x0027
            r3 = 102970646(0x6233516, float:3.0695894E-35)
            if (r2 == r3) goto L_0x001c
            goto L_0x0032
        L_0x001c:
            java.lang.String r2 = "light"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0032
            r1 = 1110704128(0x42340000, float:45.0)
            goto L_0x0034
        L_0x0027:
            java.lang.String r2 = "heavy"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0032
            r1 = 1127481344(0x43340000, float:180.0)
            goto L_0x0034
        L_0x0032:
            r1 = 1119092736(0x42b40000, float:90.0)
        L_0x0034:
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r2 = 0
            r0[r1] = r2
            java.lang.String r1 = "rotation"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r1, r0)
            java.lang.String r0 = "ObjectAnimator.ofFloat(v…TION, getSpinAngle(), 0f)"
            e.x.c.i.d(r5, r0)
            android.view.animation.Interpolator r0 = r4.f179g
            if (r0 == 0) goto L_0x004d
            r5.setInterpolator(r0)
        L_0x004d:
            java.util.List r5 = b.q.a.a.l2(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.b.l.d.g.a(android.view.View):java.util.List");
    }
}
