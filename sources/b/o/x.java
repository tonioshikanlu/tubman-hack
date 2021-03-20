package b.o;

import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import b.o.m;
import b.o.q4;

public class x implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ RelativeLayout.LayoutParams f6346h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ LinearLayout.LayoutParams f6347i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ m.b f6348j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ q4.g f6349k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ a0 f6350l;

    public x(a0 a0Var, RelativeLayout.LayoutParams layoutParams, LinearLayout.LayoutParams layoutParams2, m.b bVar, q4.g gVar) {
        this.f6350l = a0Var;
        this.f6346h = layoutParams;
        this.f6347i = layoutParams2;
        this.f6348j = bVar;
        this.f6349k = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r25 = this;
            r1 = r25
            b.o.a0 r0 = r1.f6350l
            android.webkit.WebView r0 = r0.f6000k
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            android.widget.RelativeLayout$LayoutParams r2 = r1.f6346h
            r0.setLayoutParams(r2)
            b.o.a0 r0 = r1.f6350l
            android.app.Activity r0 = r0.f5994b
            android.content.Context r0 = r0.getApplicationContext()
            b.o.a0 r2 = r1.f6350l
            android.widget.LinearLayout$LayoutParams r3 = r1.f6347i
            b.o.m$b r4 = r1.f6348j
            java.util.Objects.requireNonNull(r2)
            b.o.m r5 = new b.o.m
            r5.<init>(r0)
            r2.f6002m = r5
            if (r3 == 0) goto L_0x002b
            r5.setLayoutParams(r3)
        L_0x002b:
            b.o.m r3 = r2.f6002m
            r3.a(r4)
            b.o.m r3 = r2.f6002m
            b.o.y r4 = new b.o.y
            r4.<init>(r2)
            r3.f6190h = r4
            android.webkit.WebView r3 = r2.f6000k
            android.view.ViewParent r3 = r3.getParent()
            if (r3 == 0) goto L_0x004c
            android.webkit.WebView r3 = r2.f6000k
            android.view.ViewParent r3 = r3.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r3.removeAllViews()
        L_0x004c:
            androidx.cardview.widget.CardView r3 = new androidx.cardview.widget.CardView
            r3.<init>(r0)
            b.o.q4$g r4 = r2.f5999j
            b.o.q4$g r5 = b.o.q4.g.FULL_SCREEN
            r6 = -2
            r7 = -1
            if (r4 != r5) goto L_0x005b
            r4 = r7
            goto L_0x005c
        L_0x005b:
            r4 = r6
        L_0x005c:
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams
            r5.<init>(r7, r4)
            r4 = 13
            r5.addRule(r4)
            r3.setLayoutParams(r5)
            r4 = 5
            int r4 = b.o.g2.b(r4)
            float r4 = (float) r4
            r3.setCardElevation(r4)
            r4 = 8
            int r4 = b.o.g2.b(r4)
            float r4 = (float) r4
            r3.setRadius(r4)
            r4 = 0
            r3.setClipChildren(r4)
            r3.setClipToPadding(r4)
            r3.setPreventCornerOverlap(r4)
            java.lang.String r5 = "IN_APP_MESSAGE_CARD_VIEW_TAG"
            r3.setTag(r5)
            android.webkit.WebView r8 = r2.f6000k
            r3.addView(r8)
            b.o.m r8 = r2.f6002m
            int r9 = b.o.a0.r
            r8.setPadding(r9, r9, r9, r9)
            b.o.m r8 = r2.f6002m
            r8.setClipChildren(r4)
            b.o.m r8 = r2.f6002m
            r8.setClipToPadding(r4)
            b.o.m r2 = r2.f6002m
            r2.addView(r3)
            b.o.a0 r2 = r1.f6350l
            java.util.Objects.requireNonNull(r2)
            android.widget.RelativeLayout r3 = new android.widget.RelativeLayout
            r3.<init>(r0)
            r2.f6001l = r3
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r4)
            r3.setBackgroundDrawable(r0)
            android.widget.RelativeLayout r0 = r2.f6001l
            r0.setClipChildren(r4)
            android.widget.RelativeLayout r0 = r2.f6001l
            r0.setClipToPadding(r4)
            android.widget.RelativeLayout r0 = r2.f6001l
            b.o.m r2 = r2.f6002m
            r0.addView(r2)
            b.o.a0 r0 = r1.f6350l
            android.widget.RelativeLayout r2 = r0.f6001l
            android.widget.PopupWindow r3 = new android.widget.PopupWindow
            boolean r8 = r0.f5996g
            if (r8 == 0) goto L_0x00d7
            r10 = r7
            goto L_0x00d9
        L_0x00d7:
            int r10 = r0.d
        L_0x00d9:
            if (r8 == 0) goto L_0x00dc
            r6 = r7
        L_0x00dc:
            r3.<init>(r2, r10, r6)
            r0.a = r3
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>(r4)
            r3.setBackgroundDrawable(r2)
            android.widget.PopupWindow r2 = r0.a
            r3 = 1
            r2.setTouchable(r3)
            boolean r2 = r0.f5996g
            if (r2 != 0) goto L_0x0104
            b.o.q4$g r2 = r0.f5999j
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x0101
            if (r2 == r3) goto L_0x00fe
            goto L_0x0104
        L_0x00fe:
            r2 = 81
            goto L_0x0105
        L_0x0101:
            r2 = 49
            goto L_0x0105
        L_0x0104:
            r2 = r4
        L_0x0105:
            android.widget.PopupWindow r6 = r0.a
            r7 = 1003(0x3eb, float:1.406E-42)
            androidx.core.widget.PopupWindowCompat.setWindowLayoutType(r6, r7)
            android.widget.PopupWindow r6 = r0.a
            android.app.Activity r0 = r0.f5994b
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.View r0 = r0.getRootView()
            r6.showAtLocation(r0, r2, r4, r4)
            b.o.a0 r10 = r1.f6350l
            b.o.a0$c r0 = r10.f6003n
            if (r0 == 0) goto L_0x0227
            b.o.q4$g r0 = r1.f6349k
            b.o.m r2 = r10.f6002m
            android.widget.RelativeLayout r11 = r10.f6001l
            android.view.View r4 = r2.findViewWithTag(r5)
            androidx.cardview.widget.CardView r4 = (androidx.cardview.widget.CardView) r4
            int r0 = r0.ordinal()
            r5 = 0
            r6 = 1000(0x3e8, float:1.401E-42)
            r7 = 4620693217682128896(0x4020000000000000, double:8.0)
            r12 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            if (r0 == 0) goto L_0x01a3
            if (r0 == r3) goto L_0x0183
            r3 = 2
            if (r0 == r3) goto L_0x014b
            r3 = 3
            if (r0 == r3) goto L_0x014b
            goto L_0x01c3
        L_0x014b:
            r15 = 0
            b.o.u2 r0 = new b.o.u2
            r0.<init>(r12, r7)
            android.view.animation.ScaleAnimation r3 = new android.view.animation.ScaleAnimation
            r17 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 1
            r22 = 1056964608(0x3f000000, float:0.5)
            r23 = 1
            r24 = 1056964608(0x3f000000, float:0.5)
            r16 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            long r4 = (long) r6
            r3.setDuration(r4)
            r3.setInterpolator(r0)
            r2.setAnimation(r3)
            r12 = 400(0x190, float:5.6E-43)
            int r13 = b.o.a0.f5992p
            int r14 = b.o.a0.f5993q
            android.animation.ValueAnimator r0 = r10.b(r11, r12, r13, r14, r15)
            r3.start()
            r0.start()
            goto L_0x01c3
        L_0x0183:
            android.webkit.WebView r0 = r10.f6000k
            int r0 = r0.getHeight()
            int r0 = r0 + r9
            float r0 = (float) r0
            b.o.u2 r2 = new b.o.u2
            r2.<init>(r12, r7)
            android.view.animation.TranslateAnimation r3 = new android.view.animation.TranslateAnimation
            r3.<init>(r5, r5, r0, r5)
            long r5 = (long) r6
            r3.setDuration(r5)
            r3.setInterpolator(r2)
            r4.setAnimation(r3)
            r3.start()
            goto L_0x01c3
        L_0x01a3:
            android.webkit.WebView r0 = r10.f6000k
            int r0 = r0.getHeight()
            int r0 = -r0
            int r0 = r0 - r9
            float r0 = (float) r0
            b.o.u2 r2 = new b.o.u2
            r2.<init>(r12, r7)
            android.view.animation.TranslateAnimation r3 = new android.view.animation.TranslateAnimation
            r3.<init>(r5, r5, r0, r5)
            long r5 = (long) r6
            r3.setDuration(r5)
            r3.setInterpolator(r2)
            r4.setAnimation(r3)
            r3.start()
        L_0x01c3:
            b.o.a0 r0 = r1.f6350l
            b.o.a0$c r0 = r0.f6003n
            b.o.t4 r0 = (b.o.t4) r0
            java.util.Objects.requireNonNull(r0)
            b.o.u0 r2 = b.o.i2.p()
            b.o.q4 r0 = r0.a
            b.o.s0 r0 = r0.d
            java.util.Objects.requireNonNull(r2)
            boolean r3 = r0.f6278k
            if (r3 == 0) goto L_0x01dc
            goto L_0x0227
        L_0x01dc:
            java.util.Set<java.lang.String> r3 = r2.f
            java.lang.String r4 = r0.a
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x01e7
            goto L_0x0227
        L_0x01e7:
            java.util.Set<java.lang.String> r3 = r2.f
            java.lang.String r4 = r0.a
            r3.add(r4)
            java.lang.String r3 = b.o.u0.x(r0)
            if (r3 != 0) goto L_0x01f5
            goto L_0x0227
        L_0x01f5:
            b.o.v0 r4 = new b.o.v0     // Catch:{ JSONException -> 0x021b }
            r4.<init>(r2, r3)     // Catch:{ JSONException -> 0x021b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x021b }
            r3.<init>()     // Catch:{ JSONException -> 0x021b }
            java.lang.String r5 = "in_app_messages/"
            r3.append(r5)     // Catch:{ JSONException -> 0x021b }
            java.lang.String r5 = r0.a     // Catch:{ JSONException -> 0x021b }
            r3.append(r5)     // Catch:{ JSONException -> 0x021b }
            java.lang.String r5 = "/impression"
            r3.append(r5)     // Catch:{ JSONException -> 0x021b }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x021b }
            b.o.w0 r5 = new b.o.w0     // Catch:{ JSONException -> 0x021b }
            r5.<init>(r2, r0)     // Catch:{ JSONException -> 0x021b }
            b.l.f.x.a.g.a0(r3, r4, r5)     // Catch:{ JSONException -> 0x021b }
            goto L_0x0227
        L_0x021b:
            r0 = move-exception
            r0.printStackTrace()
            b.o.i2$k r0 = b.o.i2.k.ERROR
            r2 = 0
            java.lang.String r3 = "Unable to execute in-app message impression HTTP request due to invalid JSON"
            b.o.i2.a(r0, r3, r2)
        L_0x0227:
            b.o.a0 r0 = r1.f6350l
            double r2 = r0.f
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0232
            goto L_0x0247
        L_0x0232:
            java.lang.Runnable r4 = r0.f6004o
            if (r4 == 0) goto L_0x0237
            goto L_0x0247
        L_0x0237:
            b.o.z r4 = new b.o.z
            r4.<init>(r0)
            r0.f6004o = r4
            android.os.Handler r0 = r0.c
            long r2 = (long) r2
            r5 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r5
            r0.postDelayed(r4, r2)
        L_0x0247:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.x.run():void");
    }
}
