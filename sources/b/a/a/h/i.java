package b.a.a.h;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.appfoundry.previewer.model.Component;

public final class i implements View.OnTouchListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f269h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Component f270i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Context f271j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f272k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f273l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f274m;

    public i(FrameLayout frameLayout, Component component, Context context, String str, int i2, int i3) {
        this.f269h = frameLayout;
        this.f270i = component;
        this.f271j = context;
        this.f272k = str;
        this.f273l = i2;
        this.f274m = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        r5 = (r5 = r5.f7163b).a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r19, android.view.MotionEvent r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "event"
            r3 = r20
            e.x.c.i.d(r3, r2)
            int r2 = r20.getAction()
            r4 = 2
            java.lang.String r5 = "null cannot be cast to non-null type android.widget.FrameLayout"
            r6 = 1
            r7 = 0
            if (r2 != 0) goto L_0x006c
            java.util.Objects.requireNonNull(r1, r5)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            int r1 = r1.getChildCount()
            com.appfoundry.previewer.model.Component r2 = r0.f270i
            java.util.List<com.appfoundry.previewer.model.Component> r2 = r2.f7091m
            e.x.c.i.c(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x002a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0063
            java.lang.Object r3 = r2.next()
            r8 = r3
            com.appfoundry.previewer.model.Component r8 = (com.appfoundry.previewer.model.Component) r8
            android.widget.FrameLayout r3 = r0.f269h
            android.content.Context r9 = r0.f271j
            java.lang.String r10 = r0.f272k
            com.appfoundry.previewer.model.States r5 = r8.f7090l
            if (r5 == 0) goto L_0x004c
            com.appfoundry.previewer.model.State r5 = r5.f7163b
            if (r5 == 0) goto L_0x004c
            com.appfoundry.previewer.model.Override r5 = r5.a
            if (r5 == 0) goto L_0x004c
            java.lang.String r5 = r5.a
            goto L_0x004d
        L_0x004c:
            r5 = r7
        L_0x004d:
            com.appfoundry.previewer.model.Style r11 = b.a.a.n.f.u(r5, r7, r4)
            int r12 = r0.f273l
            int r13 = r0.f274m
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 224(0xe0, float:3.14E-43)
            android.view.View r5 = b.a.a.h.e.p(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3.addView(r5)
            goto L_0x002a
        L_0x0063:
            com.appfoundry.previewer.model.Component r2 = r0.f270i
            com.appfoundry.previewer.model.States r2 = r2.f7090l
            if (r2 == 0) goto L_0x00c9
            java.lang.String r3 = "pressed"
            goto L_0x00c7
        L_0x006c:
            int r2 = r20.getAction()
            if (r2 != r6) goto L_0x00cf
            java.util.Objects.requireNonNull(r1, r5)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            int r1 = r1.getChildCount()
            com.appfoundry.previewer.model.Component r2 = r0.f270i
            java.util.List<com.appfoundry.previewer.model.Component> r2 = r2.f7091m
            e.x.c.i.c(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0086:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00bf
            java.lang.Object r3 = r2.next()
            r8 = r3
            com.appfoundry.previewer.model.Component r8 = (com.appfoundry.previewer.model.Component) r8
            android.widget.FrameLayout r3 = r0.f269h
            android.content.Context r9 = r0.f271j
            java.lang.String r10 = r0.f272k
            com.appfoundry.previewer.model.States r5 = r8.f7090l
            if (r5 == 0) goto L_0x00a8
            com.appfoundry.previewer.model.State r5 = r5.a
            if (r5 == 0) goto L_0x00a8
            com.appfoundry.previewer.model.Override r5 = r5.a
            if (r5 == 0) goto L_0x00a8
            java.lang.String r5 = r5.a
            goto L_0x00a9
        L_0x00a8:
            r5 = r7
        L_0x00a9:
            com.appfoundry.previewer.model.Style r11 = b.a.a.n.f.u(r5, r7, r4)
            int r12 = r0.f273l
            int r13 = r0.f274m
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 224(0xe0, float:3.14E-43)
            android.view.View r5 = b.a.a.h.e.p(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3.addView(r5)
            goto L_0x0086
        L_0x00bf:
            com.appfoundry.previewer.model.Component r2 = r0.f270i
            com.appfoundry.previewer.model.States r2 = r2.f7090l
            if (r2 == 0) goto L_0x00c9
            java.lang.String r3 = "default"
        L_0x00c7:
            r2.f7165g = r3
        L_0x00c9:
            android.widget.FrameLayout r2 = r0.f269h
            r3 = 0
            r2.removeViews(r3, r1)
        L_0x00cf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.h.i.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
