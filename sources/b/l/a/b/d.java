package b.l.a.b;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.view.MarginLayoutParamsCompat;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class d {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public boolean[] f2571b;
    @Nullable
    public int[] c;
    @Nullable
    public long[] d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public long[] f2572e;

    public static class a {
        public List<c> a;
    }

    public d(a aVar) {
        this.a = aVar;
    }

    public final void a(List<c> list, c cVar, int i2, int i3) {
        cVar.f2565i = i3;
        Objects.requireNonNull((FlexboxLayoutManager) this.a);
        cVar.f2568l = i2;
        list.add(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        if (q(r14, r10, r13) != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b1, code lost:
        if (q(r14, r10, r13) != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0243, code lost:
        if (r1 < (r8 + r10)) goto L_0x0245;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03eb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x024a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(b.l.a.b.d.a r24, int r25, int r26, int r27, int r28, int r29, @androidx.annotation.Nullable java.util.List<b.l.a.b.c> r30) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = r26
            r3 = r29
            b.l.a.b.a r4 = r0.a
            com.google.android.flexbox.FlexboxLayoutManager r4 = (com.google.android.flexbox.FlexboxLayoutManager) r4
            boolean r4 = r4.r()
            int r5 = android.view.View.MeasureSpec.getMode(r25)
            int r6 = android.view.View.MeasureSpec.getSize(r25)
            if (r30 != 0) goto L_0x0022
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = r24
            goto L_0x0026
        L_0x0022:
            r8 = r24
            r7 = r30
        L_0x0026:
            r8.a = r7
            r8 = -1
            if (r3 != r8) goto L_0x002d
            r8 = 1
            goto L_0x002e
        L_0x002d:
            r8 = 0
        L_0x002e:
            b.l.a.b.a r9 = r0.a
            if (r4 == 0) goto L_0x0037
            int r9 = r9.getPaddingStart()
            goto L_0x003b
        L_0x0037:
            int r9 = r9.getPaddingTop()
        L_0x003b:
            b.l.a.b.a r10 = r0.a
            if (r4 == 0) goto L_0x0044
            int r10 = r10.getPaddingEnd()
            goto L_0x0048
        L_0x0044:
            int r10 = r10.getPaddingBottom()
        L_0x0048:
            b.l.a.b.a r11 = r0.a
            if (r4 == 0) goto L_0x0051
            int r11 = r11.getPaddingTop()
            goto L_0x0055
        L_0x0051:
            int r11 = r11.getPaddingStart()
        L_0x0055:
            b.l.a.b.a r12 = r0.a
            if (r4 == 0) goto L_0x005e
            int r12 = r12.getPaddingBottom()
            goto L_0x0062
        L_0x005e:
            int r12 = r12.getPaddingEnd()
        L_0x0062:
            b.l.a.b.c r13 = new b.l.a.b.c
            r13.<init>()
            r14 = r28
            r13.f2567k = r14
            int r9 = r9 + r10
            r13.a = r9
            b.l.a.b.a r10 = r0.a
            com.google.android.flexbox.FlexboxLayoutManager r10 = (com.google.android.flexbox.FlexboxLayoutManager) r10
            int r10 = r10.n()
            r16 = 0
            r17 = 0
            r28 = r8
            r15 = r16
            r8 = r17
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0082:
            if (r14 >= r10) goto L_0x0405
            b.l.a.b.a r3 = r0.a
            com.google.android.flexbox.FlexboxLayoutManager r3 = (com.google.android.flexbox.FlexboxLayoutManager) r3
            android.view.View r3 = r3.m(r14)
            if (r3 != 0) goto L_0x0097
            boolean r3 = r0.q(r14, r10, r13)
            r17 = r8
            if (r3 == 0) goto L_0x00b6
            goto L_0x00b3
        L_0x0097:
            r17 = r8
            int r8 = r3.getVisibility()
            r2 = 8
            if (r8 != r2) goto L_0x00c7
            int r2 = r13.f2562e
            int r2 = r2 + 1
            r13.f2562e = r2
            int r2 = r13.d
            int r2 = r2 + 1
            r13.d = r2
            boolean r2 = r0.q(r14, r10, r13)
            if (r2 == 0) goto L_0x00b6
        L_0x00b3:
            r0.a(r7, r13, r14, r15)
        L_0x00b6:
            r3 = r27
            r20 = r5
            r1 = r6
            r8 = r7
            r2 = r10
            r22 = r11
            r5 = r26
            r10 = r28
            r7 = r29
            goto L_0x03f2
        L_0x00c7:
            boolean r2 = r3 instanceof android.widget.CompoundButton
            if (r2 == 0) goto L_0x0107
            r2 = r3
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            android.view.ViewGroup$LayoutParams r8 = r2.getLayoutParams()
            b.l.a.b.b r8 = (b.l.a.b.b) r8
            r30 = r10
            int r10 = r8.G()
            r18 = r7
            int r7 = r8.D()
            android.graphics.drawable.Drawable r2 = androidx.core.widget.CompoundButtonCompat.getButtonDrawable(r2)
            if (r2 != 0) goto L_0x00e9
            r19 = 0
            goto L_0x00ed
        L_0x00e9:
            int r19 = r2.getMinimumWidth()
        L_0x00ed:
            if (r2 != 0) goto L_0x00f3
            r2 = -1
            r20 = 0
            goto L_0x00f8
        L_0x00f3:
            int r20 = r2.getMinimumHeight()
            r2 = -1
        L_0x00f8:
            if (r10 != r2) goto L_0x00fc
            r10 = r19
        L_0x00fc:
            r8.K(r10)
            if (r7 != r2) goto L_0x0103
            r7 = r20
        L_0x0103:
            r8.l(r7)
            goto L_0x010b
        L_0x0107:
            r18 = r7
            r30 = r10
        L_0x010b:
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            b.l.a.b.b r2 = (b.l.a.b.b) r2
            int r7 = r2.s()
            r8 = 4
            if (r7 != r8) goto L_0x0121
            java.util.List<java.lang.Integer> r7 = r13.f2566j
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r7.add(r8)
        L_0x0121:
            if (r4 == 0) goto L_0x0128
            int r7 = r2.getWidth()
            goto L_0x012c
        L_0x0128:
            int r7 = r2.getHeight()
        L_0x012c:
            float r8 = r2.p()
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0144
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 != r8) goto L_0x0144
            float r7 = (float) r6
            float r8 = r2.p()
            float r8 = r8 * r7
            int r7 = java.lang.Math.round(r8)
        L_0x0144:
            if (r4 == 0) goto L_0x0184
            b.l.a.b.a r8 = r0.a
            r10 = 1
            int r19 = r0.p(r2, r10)
            int r19 = r19 + r9
            int r10 = r0.n(r2, r10)
            int r10 = r10 + r19
            com.google.android.flexbox.FlexboxLayoutManager r8 = (com.google.android.flexbox.FlexboxLayoutManager) r8
            int r7 = r8.k(r1, r10, r7)
            b.l.a.b.a r8 = r0.a
            int r10 = r11 + r12
            r19 = r6
            r6 = 1
            int r20 = r0.o(r2, r6)
            int r20 = r20 + r10
            int r6 = r0.m(r2, r6)
            int r6 = r6 + r20
            int r6 = r6 + r15
            int r10 = r2.getHeight()
            com.google.android.flexbox.FlexboxLayoutManager r8 = (com.google.android.flexbox.FlexboxLayoutManager) r8
            r20 = r5
            r5 = r26
            int r6 = r8.j(r5, r6, r10)
            r3.measure(r7, r6)
            r0.x(r14, r7, r6, r3)
            goto L_0x01c1
        L_0x0184:
            r20 = r5
            r19 = r6
            r5 = r26
            b.l.a.b.a r6 = r0.a
            int r8 = r11 + r12
            r10 = 0
            int r21 = r0.o(r2, r10)
            int r21 = r21 + r8
            int r8 = r0.m(r2, r10)
            int r8 = r8 + r21
            int r8 = r8 + r15
            int r10 = r2.getWidth()
            com.google.android.flexbox.FlexboxLayoutManager r6 = (com.google.android.flexbox.FlexboxLayoutManager) r6
            int r6 = r6.k(r5, r8, r10)
            b.l.a.b.a r8 = r0.a
            r10 = 0
            int r21 = r0.p(r2, r10)
            int r21 = r21 + r9
            int r10 = r0.n(r2, r10)
            int r10 = r10 + r21
            com.google.android.flexbox.FlexboxLayoutManager r8 = (com.google.android.flexbox.FlexboxLayoutManager) r8
            int r7 = r8.j(r1, r10, r7)
            r3.measure(r6, r7)
            r0.x(r14, r6, r7, r3)
        L_0x01c1:
            b.l.a.b.a r6 = r0.a
            com.google.android.flexbox.FlexboxLayoutManager r6 = (com.google.android.flexbox.FlexboxLayoutManager) r6
            android.util.SparseArray<android.view.View> r6 = r6.t
            r6.put(r14, r3)
            r0.c(r3, r14)
            int r6 = r3.getMeasuredState()
            r8 = r17
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            int r8 = r13.a
            if (r4 == 0) goto L_0x01e0
            int r10 = r3.getMeasuredWidth()
            goto L_0x01e4
        L_0x01e0:
            int r10 = r3.getMeasuredHeight()
        L_0x01e4:
            int r17 = r0.p(r2, r4)
            int r17 = r17 + r10
            int r10 = r0.n(r2, r4)
            int r10 = r10 + r17
            int r17 = r18.size()
            b.l.a.b.a r1 = r0.a
            com.google.android.flexbox.FlexboxLayoutManager r1 = (com.google.android.flexbox.FlexboxLayoutManager) r1
            int r1 = r1.f7201b
            if (r1 != 0) goto L_0x01fd
            goto L_0x020c
        L_0x01fd:
            boolean r1 = r2.I()
            if (r1 == 0) goto L_0x020a
            r21 = r6
            r22 = r11
            r1 = r19
            goto L_0x0245
        L_0x020a:
            if (r20 != 0) goto L_0x0211
        L_0x020c:
            r21 = r6
            r22 = r11
            goto L_0x0222
        L_0x0211:
            b.l.a.b.a r1 = r0.a
            com.google.android.flexbox.FlexboxLayoutManager r1 = (com.google.android.flexbox.FlexboxLayoutManager) r1
            r21 = r6
            int r6 = r1.d
            r22 = r11
            r11 = -1
            if (r6 == r11) goto L_0x0225
            int r11 = r17 + 1
            if (r6 > r11) goto L_0x0225
        L_0x0222:
            r1 = r19
            goto L_0x0247
        L_0x0225:
            boolean r6 = r1.r()
            if (r6 == 0) goto L_0x0234
            int r6 = r1.getLeftDecorationWidth(r3)
            int r1 = r1.getRightDecorationWidth(r3)
            goto L_0x023c
        L_0x0234:
            int r6 = r1.getTopDecorationHeight(r3)
            int r1 = r1.getBottomDecorationHeight(r3)
        L_0x023c:
            int r1 = r1 + r6
            if (r1 <= 0) goto L_0x0240
            int r10 = r10 + r1
        L_0x0240:
            int r8 = r8 + r10
            r1 = r19
            if (r1 >= r8) goto L_0x0247
        L_0x0245:
            r6 = 1
            goto L_0x0248
        L_0x0247:
            r6 = 0
        L_0x0248:
            if (r6 == 0) goto L_0x02cf
            int r6 = r13.d
            int r8 = r13.f2562e
            int r6 = r6 - r8
            if (r6 <= 0) goto L_0x0260
            if (r14 <= 0) goto L_0x0256
            int r6 = r14 + -1
            goto L_0x0257
        L_0x0256:
            r6 = 0
        L_0x0257:
            r8 = r18
            r0.a(r8, r13, r6, r15)
            int r6 = r13.c
            int r15 = r15 + r6
            goto L_0x0262
        L_0x0260:
            r8 = r18
        L_0x0262:
            if (r4 == 0) goto L_0x0291
            int r6 = r2.getHeight()
            r10 = -1
            if (r6 != r10) goto L_0x02c0
            b.l.a.b.a r6 = r0.a
            int r10 = r6.getPaddingTop()
            b.l.a.b.a r11 = r0.a
            int r11 = r11.getPaddingBottom()
            int r11 = r11 + r10
            int r10 = r2.U()
            int r10 = r10 + r11
            int r11 = r2.L()
            int r11 = r11 + r10
            int r11 = r11 + r15
            int r10 = r2.getHeight()
            com.google.android.flexbox.FlexboxLayoutManager r6 = (com.google.android.flexbox.FlexboxLayoutManager) r6
            int r6 = r6.j(r5, r11, r10)
            r3.measure(r7, r6)
            goto L_0x02bd
        L_0x0291:
            int r6 = r2.getWidth()
            r10 = -1
            if (r6 != r10) goto L_0x02c0
            b.l.a.b.a r6 = r0.a
            int r10 = r6.getPaddingLeft()
            b.l.a.b.a r11 = r0.a
            int r11 = r11.getPaddingRight()
            int r11 = r11 + r10
            int r10 = r2.N()
            int r10 = r10 + r11
            int r11 = r2.C()
            int r11 = r11 + r10
            int r11 = r11 + r15
            int r10 = r2.getWidth()
            com.google.android.flexbox.FlexboxLayoutManager r6 = (com.google.android.flexbox.FlexboxLayoutManager) r6
            int r6 = r6.k(r5, r11, r10)
            r3.measure(r6, r7)
        L_0x02bd:
            r0.c(r3, r14)
        L_0x02c0:
            b.l.a.b.c r13 = new b.l.a.b.c
            r13.<init>()
            r6 = 1
            r13.d = r6
            r13.a = r9
            r13.f2567k = r14
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x02d9
        L_0x02cf:
            r8 = r18
            int r6 = r13.d
            int r6 = r6 + 1
            r13.d = r6
            r6 = r16
        L_0x02d9:
            boolean r7 = r13.f2569m
            float r10 = r2.n()
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x02e6
            r10 = 1
            goto L_0x02e7
        L_0x02e6:
            r10 = 0
        L_0x02e7:
            r7 = r7 | r10
            r13.f2569m = r7
            boolean r7 = r13.f2570n
            float r10 = r2.v()
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x02f6
            r10 = 1
            goto L_0x02f7
        L_0x02f6:
            r10 = 0
        L_0x02f7:
            r7 = r7 | r10
            r13.f2570n = r7
            int[] r7 = r0.c
            if (r7 == 0) goto L_0x0304
            int r10 = r8.size()
            r7[r14] = r10
        L_0x0304:
            int r7 = r13.a
            if (r4 == 0) goto L_0x030d
            int r10 = r3.getMeasuredWidth()
            goto L_0x0311
        L_0x030d:
            int r10 = r3.getMeasuredHeight()
        L_0x0311:
            int r11 = r0.p(r2, r4)
            int r11 = r11 + r10
            int r10 = r0.n(r2, r4)
            int r10 = r10 + r11
            int r10 = r10 + r7
            r13.a = r10
            float r7 = r13.f
            float r10 = r2.n()
            float r10 = r10 + r7
            r13.f = r10
            float r7 = r13.f2563g
            float r10 = r2.v()
            float r10 = r10 + r7
            r13.f2563g = r10
            b.l.a.b.a r7 = r0.a
            com.google.android.flexbox.FlexboxLayoutManager r7 = (com.google.android.flexbox.FlexboxLayoutManager) r7
            android.graphics.Rect r10 = com.google.android.flexbox.FlexboxLayoutManager.y
            r7.calculateItemDecorationsForChild(r3, r10)
            boolean r10 = r7.r()
            if (r10 == 0) goto L_0x0348
            int r10 = r7.getLeftDecorationWidth(r3)
            int r7 = r7.getRightDecorationWidth(r3)
            goto L_0x0350
        L_0x0348:
            int r10 = r7.getTopDecorationHeight(r3)
            int r7 = r7.getBottomDecorationHeight(r3)
        L_0x0350:
            int r7 = r7 + r10
            int r10 = r13.a
            int r10 = r10 + r7
            r13.a = r10
            int r10 = r13.f2561b
            int r10 = r10 + r7
            r13.f2561b = r10
            if (r4 == 0) goto L_0x0362
            int r7 = r3.getMeasuredHeight()
            goto L_0x0366
        L_0x0362:
            int r7 = r3.getMeasuredWidth()
        L_0x0366:
            int r10 = r0.o(r2, r4)
            int r10 = r10 + r7
            int r7 = r0.m(r2, r4)
            int r7 = r7 + r10
            b.l.a.b.a r10 = r0.a
            com.google.android.flexbox.FlexboxLayoutManager r10 = (com.google.android.flexbox.FlexboxLayoutManager) r10
            int r10 = r10.l(r3)
            int r10 = r10 + r7
            int r6 = java.lang.Math.max(r6, r10)
            int r7 = r13.c
            int r7 = java.lang.Math.max(r7, r6)
            r13.c = r7
            if (r4 == 0) goto L_0x03b2
            b.l.a.b.a r7 = r0.a
            com.google.android.flexbox.FlexboxLayoutManager r7 = (com.google.android.flexbox.FlexboxLayoutManager) r7
            int r7 = r7.f7201b
            r10 = 2
            if (r7 == r10) goto L_0x039c
            int r7 = r13.f2564h
            int r3 = r3.getBaseline()
            int r2 = r2.U()
            int r2 = r2 + r3
            goto L_0x03ac
        L_0x039c:
            int r7 = r13.f2564h
            int r10 = r3.getMeasuredHeight()
            int r3 = r3.getBaseline()
            int r10 = r10 - r3
            int r2 = r2.L()
            int r2 = r2 + r10
        L_0x03ac:
            int r2 = java.lang.Math.max(r7, r2)
            r13.f2564h = r2
        L_0x03b2:
            r2 = r30
            boolean r3 = r0.q(r14, r2, r13)
            if (r3 == 0) goto L_0x03c0
            r0.a(r8, r13, r14, r15)
            int r3 = r13.c
            int r15 = r15 + r3
        L_0x03c0:
            r3 = -1
            r7 = r29
            if (r7 == r3) goto L_0x03e5
            int r3 = r8.size()
            if (r3 <= 0) goto L_0x03e5
            int r3 = r8.size()
            r10 = 1
            int r3 = r3 - r10
            java.lang.Object r3 = r8.get(r3)
            b.l.a.b.c r3 = (b.l.a.b.c) r3
            int r3 = r3.f2568l
            if (r3 < r7) goto L_0x03e5
            if (r14 < r7) goto L_0x03e5
            if (r28 != 0) goto L_0x03e5
            int r3 = r13.c
            int r15 = -r3
            r3 = r27
            goto L_0x03e9
        L_0x03e5:
            r3 = r27
            r10 = r28
        L_0x03e9:
            if (r15 <= r3) goto L_0x03ee
            if (r10 == 0) goto L_0x03ee
            goto L_0x0405
        L_0x03ee:
            r16 = r6
            r17 = r21
        L_0x03f2:
            int r14 = r14 + 1
            r6 = r1
            r3 = r7
            r7 = r8
            r28 = r10
            r8 = r17
            r11 = r22
            r1 = r25
            r10 = r2
            r2 = r5
            r5 = r20
            goto L_0x0082
        L_0x0405:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.b.d.b(b.l.a.b.d$a, int, int, int, int, int, java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            b.l.a.b.b r0 = (b.l.a.b.b) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.G()
            r4 = 1
            if (r1 >= r3) goto L_0x001a
            int r1 = r0.G()
            goto L_0x0024
        L_0x001a:
            int r3 = r0.T()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.T()
        L_0x0024:
            r3 = r4
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.D()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.D()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.J()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.J()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0059
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.x(r8, r1, r0, r7)
            b.l.a.b.a r0 = r6.a
            com.google.android.flexbox.FlexboxLayoutManager r0 = (com.google.android.flexbox.FlexboxLayoutManager) r0
            android.util.SparseArray<android.view.View> r0 = r0.t
            r0.put(r8, r7)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.b.d.c(android.view.View, int):void");
    }

    public void d(List<c> list, int i2) {
        int i3 = this.c[i2];
        if (i3 == -1) {
            i3 = 0;
        }
        for (int size = list.size() - 1; size >= i3; size--) {
            list.remove(size);
        }
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (i2 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i2, length, -1);
        }
        long[] jArr = this.d;
        int length2 = jArr.length - 1;
        if (i2 > length2) {
            Arrays.fill(jArr, 0);
        } else {
            Arrays.fill(jArr, i2, length2, 0);
        }
    }

    public void e(int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int n2 = ((FlexboxLayoutManager) this.a).n();
        boolean[] zArr = this.f2571b;
        int i8 = 0;
        if (zArr == null) {
            if (n2 < 10) {
                n2 = 10;
            }
            this.f2571b = new boolean[n2];
        } else if (zArr.length < n2) {
            int length = zArr.length * 2;
            if (length >= n2) {
                n2 = length;
            }
            this.f2571b = new boolean[n2];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i4 < ((FlexboxLayoutManager) this.a).n()) {
            a aVar = this.a;
            int i9 = ((FlexboxLayoutManager) aVar).a;
            int i10 = ((FlexboxLayoutManager) aVar).a;
            if (i10 == 0 || i10 == 1) {
                int mode = View.MeasureSpec.getMode(i2);
                int size = View.MeasureSpec.getSize(i2);
                int o2 = ((FlexboxLayoutManager) this.a).o();
                if (mode != 1073741824 && o2 <= size) {
                    size = o2;
                }
                i7 = this.a.getPaddingLeft();
                i5 = this.a.getPaddingRight();
            } else if (i10 == 2 || i10 == 3) {
                int mode2 = View.MeasureSpec.getMode(i3);
                i6 = View.MeasureSpec.getSize(i3);
                if (mode2 != 1073741824) {
                    i6 = ((FlexboxLayoutManager) this.a).o();
                }
                i7 = this.a.getPaddingTop();
                i5 = this.a.getPaddingBottom();
            } else {
                throw new IllegalArgumentException(b.e.a.a.a.g("Invalid flex direction: ", i9));
            }
            int i11 = i5 + i7;
            int[] iArr = this.c;
            if (iArr != null) {
                i8 = iArr[i4];
            }
            List<c> list = ((FlexboxLayoutManager) this.a).f7203g;
            int size2 = list.size();
            while (i8 < size2) {
                c cVar = list.get(i8);
                int i12 = cVar.a;
                if (i12 < i6 && cVar.f2569m) {
                    i(i2, i3, cVar, i6, i11, false);
                } else if (i12 > i6 && cVar.f2570n) {
                    t(i2, i3, cVar, i6, i11, false);
                }
                i8++;
            }
        }
    }

    public void f(int i2) {
        int[] iArr = this.c;
        if (iArr == null) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.c = new int[i2];
        } else if (iArr.length < i2) {
            int length = iArr.length * 2;
            if (length >= i2) {
                i2 = length;
            }
            this.c = Arrays.copyOf(iArr, i2);
        }
    }

    public void g(int i2) {
        long[] jArr = this.d;
        if (jArr == null) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.d = new long[i2];
        } else if (jArr.length < i2) {
            int length = jArr.length * 2;
            if (length >= i2) {
                i2 = length;
            }
            this.d = Arrays.copyOf(jArr, i2);
        }
    }

    public void h(int i2) {
        long[] jArr = this.f2572e;
        if (jArr == null) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f2572e = new long[i2];
        } else if (jArr.length < i2) {
            int length = jArr.length * 2;
            if (length >= i2) {
                i2 = length;
            }
            this.f2572e = Arrays.copyOf(jArr, i2);
        }
    }

    public final void i(int i2, int i3, c cVar, int i4, int i5, boolean z) {
        int i6;
        int i7;
        int i8;
        double d2;
        int i9;
        double d3;
        c cVar2 = cVar;
        int i10 = i4;
        float f = cVar2.f;
        float f2 = 0.0f;
        if (f > 0.0f && i10 >= (i6 = cVar2.a)) {
            float f3 = ((float) (i10 - i6)) / f;
            cVar2.a = i5 + cVar2.f2561b;
            if (!z) {
                cVar2.c = Integer.MIN_VALUE;
            }
            int i11 = 0;
            boolean z2 = false;
            int i12 = 0;
            float f4 = 0.0f;
            while (i11 < cVar2.d) {
                int i13 = cVar2.f2567k + i11;
                View m2 = ((FlexboxLayoutManager) this.a).m(i13);
                if (m2 == null || m2.getVisibility() == 8) {
                    int i14 = i3;
                    i7 = i6;
                } else {
                    b bVar = (b) m2.getLayoutParams();
                    int i15 = ((FlexboxLayoutManager) this.a).a;
                    if (i15 == 0 || i15 == 1) {
                        int i16 = i6;
                        int i17 = i2;
                        int measuredWidth = m2.getMeasuredWidth();
                        long[] jArr = this.f2572e;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i13];
                        }
                        int measuredHeight = m2.getMeasuredHeight();
                        long[] jArr2 = this.f2572e;
                        i7 = i16;
                        if (jArr2 != null) {
                            measuredHeight = j(jArr2[i13]);
                        }
                        if (this.f2571b[i13] || bVar.n() <= 0.0f) {
                            int i18 = i3;
                        } else {
                            float n2 = (bVar.n() * f3) + ((float) measuredWidth);
                            if (i11 == cVar2.d - 1) {
                                n2 += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(n2);
                            if (round > bVar.T()) {
                                round = bVar.T();
                                this.f2571b[i13] = true;
                                cVar2.f -= bVar.n();
                                z2 = true;
                            } else {
                                float f5 = (n2 - ((float) round)) + f4;
                                double d4 = (double) f5;
                                if (d4 > 1.0d) {
                                    round++;
                                    d2 = d4 - 1.0d;
                                } else {
                                    if (d4 < -1.0d) {
                                        round--;
                                        d2 = d4 + 1.0d;
                                    }
                                    f4 = f5;
                                }
                                f5 = (float) d2;
                                f4 = f5;
                            }
                            int k2 = k(i3, bVar, cVar2.f2565i);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, BasicMeasure.EXACTLY);
                            m2.measure(makeMeasureSpec, k2);
                            int measuredWidth2 = m2.getMeasuredWidth();
                            int measuredHeight2 = m2.getMeasuredHeight();
                            x(i13, makeMeasureSpec, k2, m2);
                            ((FlexboxLayoutManager) this.a).t.put(i13, m2);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i12, ((FlexboxLayoutManager) this.a).l(m2) + bVar.L() + bVar.U() + measuredHeight);
                        cVar2.a = bVar.C() + bVar.N() + measuredWidth + cVar2.a;
                        i8 = max;
                    } else {
                        int measuredHeight3 = m2.getMeasuredHeight();
                        long[] jArr3 = this.f2572e;
                        if (jArr3 != null) {
                            measuredHeight3 = j(jArr3[i13]);
                        }
                        int measuredWidth3 = m2.getMeasuredWidth();
                        long[] jArr4 = this.f2572e;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i13];
                        }
                        if (this.f2571b[i13] || bVar.n() <= f2) {
                            i9 = i6;
                            int i19 = i2;
                        } else {
                            float n3 = (bVar.n() * f3) + ((float) measuredHeight3);
                            if (i11 == cVar2.d - 1) {
                                n3 += f4;
                                f4 = f2;
                            }
                            int round2 = Math.round(n3);
                            if (round2 > bVar.J()) {
                                round2 = bVar.J();
                                this.f2571b[i13] = true;
                                cVar2.f -= bVar.n();
                                i9 = i6;
                                z2 = true;
                            } else {
                                float f6 = (n3 - ((float) round2)) + f4;
                                i9 = i6;
                                double d5 = (double) f6;
                                if (d5 > 1.0d) {
                                    round2++;
                                    d3 = d5 - 1.0d;
                                } else if (d5 < -1.0d) {
                                    round2--;
                                    d3 = d5 + 1.0d;
                                } else {
                                    f4 = f6;
                                }
                                f4 = (float) d3;
                            }
                            int l2 = l(i2, bVar, cVar2.f2565i);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, BasicMeasure.EXACTLY);
                            m2.measure(l2, makeMeasureSpec2);
                            measuredWidth3 = m2.getMeasuredWidth();
                            int measuredHeight4 = m2.getMeasuredHeight();
                            x(i13, l2, makeMeasureSpec2, m2);
                            ((FlexboxLayoutManager) this.a).t.put(i13, m2);
                            measuredHeight3 = measuredHeight4;
                        }
                        i8 = Math.max(i12, ((FlexboxLayoutManager) this.a).l(m2) + bVar.C() + bVar.N() + measuredWidth3);
                        cVar2.a = bVar.L() + bVar.U() + measuredHeight3 + cVar2.a;
                        int i20 = i3;
                        i7 = i9;
                    }
                    cVar2.c = Math.max(cVar2.c, i8);
                    i12 = i8;
                }
                i11++;
                i6 = i7;
                f2 = 0.0f;
            }
            int i21 = i3;
            int i22 = i6;
            if (z2 && i22 != cVar2.a) {
                i(i2, i3, cVar, i4, i5, true);
            }
        }
    }

    public int j(long j2) {
        return (int) (j2 >> 32);
    }

    public final int k(int i2, b bVar, int i3) {
        int i4;
        a aVar = this.a;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) aVar;
        int j2 = flexboxLayoutManager.j(i2, bVar.L() + bVar.U() + this.a.getPaddingBottom() + aVar.getPaddingTop() + i3, bVar.getHeight());
        int size = View.MeasureSpec.getSize(j2);
        if (size > bVar.J()) {
            i4 = bVar.J();
        } else if (size >= bVar.D()) {
            return j2;
        } else {
            i4 = bVar.D();
        }
        return View.MeasureSpec.makeMeasureSpec(i4, View.MeasureSpec.getMode(j2));
    }

    public final int l(int i2, b bVar, int i3) {
        int i4;
        a aVar = this.a;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) aVar;
        int k2 = flexboxLayoutManager.k(i2, bVar.C() + bVar.N() + this.a.getPaddingRight() + aVar.getPaddingLeft() + i3, bVar.getWidth());
        int size = View.MeasureSpec.getSize(k2);
        if (size > bVar.T()) {
            i4 = bVar.T();
        } else if (size >= bVar.G()) {
            return k2;
        } else {
            i4 = bVar.G();
        }
        return View.MeasureSpec.makeMeasureSpec(i4, View.MeasureSpec.getMode(k2));
    }

    public final int m(b bVar, boolean z) {
        return z ? bVar.L() : bVar.C();
    }

    public final int n(b bVar, boolean z) {
        return z ? bVar.C() : bVar.L();
    }

    public final int o(b bVar, boolean z) {
        return z ? bVar.U() : bVar.N();
    }

    public final int p(b bVar, boolean z) {
        return z ? bVar.N() : bVar.U();
    }

    public final boolean q(int i2, int i3, c cVar) {
        return i2 == i3 - 1 && cVar.d - cVar.f2562e != 0;
    }

    public void r(View view, c cVar, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int L;
        int i11;
        b bVar = (b) view.getLayoutParams();
        int i12 = ((FlexboxLayoutManager) this.a).c;
        if (bVar.s() != -1) {
            i12 = bVar.s();
        }
        int i13 = cVar.c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    int U = ((bVar.U() + (i13 - view.getMeasuredHeight())) - bVar.L()) / 2;
                    int i14 = ((FlexboxLayoutManager) this.a).f7201b != 2 ? i3 + U : i3 - U;
                    view.layout(i2, i14, i4, view.getMeasuredHeight() + i14);
                    return;
                } else if (i12 == 3) {
                    int i15 = ((FlexboxLayoutManager) this.a).f7201b;
                    int i16 = cVar.f2564h;
                    if (i15 != 2) {
                        i11 = Math.max(i16 - view.getBaseline(), bVar.U());
                        i7 = i3 + i11;
                    } else {
                        i8 = Math.max(view.getBaseline() + (i16 - view.getMeasuredHeight()), bVar.L());
                        L = i3 - i8;
                        i6 = i5 - i8;
                        view.layout(i2, i7, i4, i6);
                    }
                } else if (i12 != 4) {
                    return;
                }
            } else if (((FlexboxLayoutManager) this.a).f7201b != 2) {
                int i17 = i3 + i13;
                i10 = (i17 - view.getMeasuredHeight()) - bVar.L();
                i9 = i17 - bVar.L();
                view.layout(i2, i10, i4, i9);
                return;
            } else {
                i7 = bVar.U() + view.getMeasuredHeight() + (i3 - i13);
                i11 = view.getMeasuredHeight() + (i5 - i13);
                i5 = bVar.U();
            }
            i6 = i5 + i11;
            view.layout(i2, i7, i4, i6);
        }
        if (((FlexboxLayoutManager) this.a).f7201b != 2) {
            i10 = bVar.U() + i3;
            i9 = bVar.U() + i5;
            view.layout(i2, i10, i4, i9);
            return;
        }
        L = i3 - bVar.L();
        i8 = bVar.L();
        i6 = i5 - i8;
        view.layout(i2, i7, i4, i6);
    }

    public void s(View view, c cVar, boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        b bVar = (b) view.getLayoutParams();
        int i8 = ((FlexboxLayoutManager) this.a).c;
        if (bVar.s() != -1) {
            i8 = bVar.s();
        }
        int i9 = cVar.c;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int marginStart = ((MarginLayoutParamsCompat.getMarginStart(marginLayoutParams) + (i9 - view.getMeasuredWidth())) - MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) / 2;
                    if (!z) {
                        i7 = i2 + marginStart;
                        i6 = i4 + marginStart;
                    } else {
                        i7 = i2 - marginStart;
                        i6 = i4 - marginStart;
                    }
                    view.layout(i7, i3, i6, i5);
                } else if (!(i8 == 3 || i8 == 4)) {
                    return;
                }
            } else if (!z) {
                i7 = ((i2 + i9) - view.getMeasuredWidth()) - bVar.C();
                i4 = (i4 + i9) - view.getMeasuredWidth();
                i6 = i4 - bVar.C();
                view.layout(i7, i3, i6, i5);
            } else {
                int N = bVar.N();
                view.layout(bVar.N() + view.getMeasuredWidth() + (i2 - i9), i3, N + view.getMeasuredWidth() + (i4 - i9), i5);
                return;
            }
        }
        if (!z) {
            view.layout(bVar.N() + i2, i3, bVar.N() + i4, i5);
            return;
        }
        i7 = i2 - bVar.C();
        i6 = i4 - bVar.C();
        view.layout(i7, i3, i6, i5);
    }

    public final void t(int i2, int i3, c cVar, int i4, int i5, boolean z) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        c cVar2 = cVar;
        int i11 = i4;
        int i12 = cVar2.a;
        float f = cVar2.f2563g;
        float f2 = 0.0f;
        if (f > 0.0f && i11 <= i12) {
            float f3 = ((float) (i12 - i11)) / f;
            cVar2.a = i5 + cVar2.f2561b;
            if (!z) {
                cVar2.c = Integer.MIN_VALUE;
            }
            int i13 = 0;
            boolean z2 = false;
            int i14 = 0;
            float f4 = 0.0f;
            while (i13 < cVar2.d) {
                int i15 = cVar2.f2567k + i13;
                View m2 = ((FlexboxLayoutManager) this.a).m(i15);
                if (m2 == null || m2.getVisibility() == 8) {
                    int i16 = i3;
                    i7 = i12;
                    i6 = i13;
                } else {
                    b bVar = (b) m2.getLayoutParams();
                    int i17 = ((FlexboxLayoutManager) this.a).a;
                    if (i17 == 0 || i17 == 1) {
                        i7 = i12;
                        int i18 = i13;
                        int i19 = i2;
                        int measuredWidth = m2.getMeasuredWidth();
                        long[] jArr = this.f2572e;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i15];
                        }
                        int measuredHeight = m2.getMeasuredHeight();
                        long[] jArr2 = this.f2572e;
                        int i20 = i18;
                        if (jArr2 != null) {
                            measuredHeight = j(jArr2[i15]);
                        }
                        if (this.f2571b[i15] || bVar.v() <= 0.0f) {
                            int i21 = i3;
                            i9 = i20;
                        } else {
                            float v = ((float) measuredWidth) - (bVar.v() * f3);
                            i9 = i20;
                            if (i9 == cVar2.d - 1) {
                                v += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(v);
                            if (round < bVar.G()) {
                                i10 = bVar.G();
                                this.f2571b[i15] = true;
                                cVar2.f2563g -= bVar.v();
                                z2 = true;
                            } else {
                                float f5 = (v - ((float) round)) + f4;
                                double d2 = (double) f5;
                                if (d2 > 1.0d) {
                                    round++;
                                    f5 -= 1.0f;
                                } else if (d2 < -1.0d) {
                                    round--;
                                    f5 += 1.0f;
                                }
                                f4 = f5;
                                i10 = round;
                            }
                            int k2 = k(i3, bVar, cVar2.f2565i);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, BasicMeasure.EXACTLY);
                            m2.measure(makeMeasureSpec, k2);
                            int measuredWidth2 = m2.getMeasuredWidth();
                            int measuredHeight2 = m2.getMeasuredHeight();
                            x(i15, makeMeasureSpec, k2, m2);
                            ((FlexboxLayoutManager) this.a).t.put(i15, m2);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i14, ((FlexboxLayoutManager) this.a).l(m2) + bVar.L() + bVar.U() + measuredHeight);
                        cVar2.a = bVar.C() + bVar.N() + measuredWidth + cVar2.a;
                        i8 = max;
                    } else {
                        int measuredHeight3 = m2.getMeasuredHeight();
                        long[] jArr3 = this.f2572e;
                        if (jArr3 != null) {
                            measuredHeight3 = j(jArr3[i15]);
                        }
                        int measuredWidth3 = m2.getMeasuredWidth();
                        long[] jArr4 = this.f2572e;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i15];
                        }
                        if (this.f2571b[i15] || bVar.v() <= f2) {
                            i7 = i12;
                            i6 = i13;
                            int i22 = i2;
                        } else {
                            float v2 = ((float) measuredHeight3) - (bVar.v() * f3);
                            if (i13 == cVar2.d - 1) {
                                v2 += f4;
                                f4 = f2;
                            }
                            int round2 = Math.round(v2);
                            if (round2 < bVar.D()) {
                                int D = bVar.D();
                                this.f2571b[i15] = true;
                                cVar2.f2563g -= bVar.v();
                                i6 = i13;
                                round2 = D;
                                z2 = true;
                                i7 = i12;
                            } else {
                                float f6 = (v2 - ((float) round2)) + f4;
                                i7 = i12;
                                i6 = i13;
                                double d3 = (double) f6;
                                if (d3 > 1.0d) {
                                    round2++;
                                    f6 -= 1.0f;
                                } else if (d3 < -1.0d) {
                                    round2--;
                                    f6 += 1.0f;
                                }
                                f4 = f6;
                            }
                            int l2 = l(i2, bVar, cVar2.f2565i);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, BasicMeasure.EXACTLY);
                            m2.measure(l2, makeMeasureSpec2);
                            measuredWidth3 = m2.getMeasuredWidth();
                            int measuredHeight4 = m2.getMeasuredHeight();
                            x(i15, l2, makeMeasureSpec2, m2);
                            ((FlexboxLayoutManager) this.a).t.put(i15, m2);
                            measuredHeight3 = measuredHeight4;
                        }
                        i8 = Math.max(i14, ((FlexboxLayoutManager) this.a).l(m2) + bVar.C() + bVar.N() + measuredWidth3);
                        cVar2.a = bVar.L() + bVar.U() + measuredHeight3 + cVar2.a;
                        int i23 = i3;
                    }
                    cVar2.c = Math.max(cVar2.c, i8);
                    i14 = i8;
                }
                i13 = i6 + 1;
                i12 = i7;
                f2 = 0.0f;
            }
            int i24 = i3;
            int i25 = i12;
            if (z2 && i25 != cVar2.a) {
                t(i2, i3, cVar, i4, i5, true);
            }
        }
    }

    public final void u(View view, int i2, int i3) {
        b bVar = (b) view.getLayoutParams();
        int min = Math.min(Math.max(((i2 - bVar.N()) - bVar.C()) - ((FlexboxLayoutManager) this.a).l(view), bVar.G()), bVar.T());
        long[] jArr = this.f2572e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? j(jArr[i3]) : view.getMeasuredHeight(), BasicMeasure.EXACTLY);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, BasicMeasure.EXACTLY);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        x(i3, makeMeasureSpec2, makeMeasureSpec, view);
        ((FlexboxLayoutManager) this.a).t.put(i3, view);
    }

    public final void v(View view, int i2, int i3) {
        b bVar = (b) view.getLayoutParams();
        int min = Math.min(Math.max(((i2 - bVar.U()) - bVar.L()) - ((FlexboxLayoutManager) this.a).l(view), bVar.D()), bVar.J());
        long[] jArr = this.f2572e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i3] : view.getMeasuredWidth(), BasicMeasure.EXACTLY);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, BasicMeasure.EXACTLY);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        x(i3, makeMeasureSpec, makeMeasureSpec2, view);
        ((FlexboxLayoutManager) this.a).t.put(i3, view);
    }

    public void w(int i2) {
        View m2;
        if (i2 < ((FlexboxLayoutManager) this.a).n()) {
            a aVar = this.a;
            int i3 = ((FlexboxLayoutManager) aVar).a;
            if (((FlexboxLayoutManager) aVar).c == 4) {
                int[] iArr = this.c;
                List<c> list = ((FlexboxLayoutManager) aVar).f7203g;
                int size = list.size();
                for (int i4 = iArr != null ? iArr[i2] : 0; i4 < size; i4++) {
                    c cVar = list.get(i4);
                    int i5 = cVar.d;
                    for (int i6 = 0; i6 < i5; i6++) {
                        int i7 = cVar.f2567k + i6;
                        if (!(i6 >= ((FlexboxLayoutManager) this.a).n() || (m2 = ((FlexboxLayoutManager) this.a).m(i7)) == null || m2.getVisibility() == 8)) {
                            b bVar = (b) m2.getLayoutParams();
                            if (bVar.s() == -1 || bVar.s() == 4) {
                                if (i3 == 0 || i3 == 1) {
                                    v(m2, cVar.c, i7);
                                } else if (i3 == 2 || i3 == 3) {
                                    u(m2, cVar.c, i7);
                                } else {
                                    throw new IllegalArgumentException(b.e.a.a.a.g("Invalid flex direction: ", i3));
                                }
                            }
                        }
                    }
                }
                return;
            }
            for (c next : ((FlexboxLayoutManager) aVar).f7203g) {
                Iterator<Integer> it = next.f2566j.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer next2 = it.next();
                        View m3 = ((FlexboxLayoutManager) this.a).m(next2.intValue());
                        if (i3 == 0 || i3 == 1) {
                            v(m3, next.c, next2.intValue());
                        } else if (i3 == 2 || i3 == 3) {
                            u(m3, next.c, next2.intValue());
                        } else {
                            throw new IllegalArgumentException(b.e.a.a.a.g("Invalid flex direction: ", i3));
                        }
                    }
                }
            }
        }
    }

    public final void x(int i2, int i3, int i4, View view) {
        long[] jArr = this.d;
        if (jArr != null) {
            jArr[i2] = (((long) i3) & 4294967295L) | (((long) i4) << 32);
        }
        long[] jArr2 = this.f2572e;
        if (jArr2 != null) {
            jArr2[i2] = (((long) view.getMeasuredWidth()) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }
}
