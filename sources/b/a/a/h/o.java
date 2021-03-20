package b.a.a.h;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.motion.widget.Key;
import androidx.recyclerview.widget.RecyclerView;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.a.a.i.b;
import b.f.a.e;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.Animation;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Page;
import com.appfoundry.previewer.model.Style;
import com.google.android.material.appbar.AppBarLayout;
import e.c0.h;
import e.x.c.i;
import java.util.List;
import p.a.a.c;

public final class o {

    public static final class a implements View.OnClickListener {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ TextView f283h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ String f284i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ String f285j;

        public a(TextView textView, String str, String str2) {
            this.f283h = textView;
            this.f284i = str;
            this.f285j = str2;
        }

        public final void onClick(View view) {
            c.b().g(new b.a.a.g.o(this.f284i, this.f285j, this.f283h));
        }
    }

    public static final void a(View view, String str, Container container, Boolean bool) {
        i.e(view, "$this$addPageBackground");
        if (container != null) {
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.page_background);
            BravoApp.b bVar = BravoApp.Q;
            int i2 = BravoApp.N;
            Context context = view.getContext();
            i.d(frameLayout, "backgroundParent");
            e.c(container, context, str, frameLayout, b.a.a.n.c.t(), i2, bool, 0, false, 192);
        }
    }

    public static /* synthetic */ void b(View view, String str, Container container, Boolean bool, int i2) {
        a(view, str, container, (i2 & 4) != 0 ? Boolean.FALSE : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: android.graphics.Shader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: android.graphics.RadialGradient} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.View c(android.view.View r18, com.appfoundry.previewer.model.Style r19, int r20, int r21, int r22) {
        /*
            r9 = r18
            r10 = r19
            java.lang.String r0 = "$this$addRadialGradient"
            e.x.c.i.e(r9, r0)
            r5 = 0
            r6 = 0
            r8 = 24
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r7 = r22
            h(r1, r2, r3, r4, r5, r6, r7, r8)
            android.view.ViewGroup$LayoutParams r0 = r18.getLayoutParams()
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            java.util.Objects.requireNonNull(r0, r1)
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r1 = r20
            r2 = r21
            com.appfoundry.previewer.model.Size r0 = b.f.a.e.T(r0, r1, r2)
            java.lang.Integer r3 = r0.a
            if (r3 == 0) goto L_0x0035
            int r1 = r3.intValue()
        L_0x0035:
            java.lang.Integer r0 = r0.f7160b
            if (r0 == 0) goto L_0x003e
            int r0 = r0.intValue()
            goto L_0x003f
        L_0x003e:
            r0 = r2
        L_0x003f:
            r2 = 0
            if (r10 == 0) goto L_0x0047
            com.appfoundry.previewer.model.Coordinate r3 = b.f.a.e.G(r10, r1, r0)
            goto L_0x0048
        L_0x0047:
            r3 = r2
        L_0x0048:
            if (r10 == 0) goto L_0x004e
            e.j r2 = b.f.a.e.N(r19)
        L_0x004e:
            android.graphics.drawable.ShapeDrawable r4 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.RectShape r5 = new android.graphics.drawable.shapes.RectShape
            r5.<init>()
            r4.<init>(r5)
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x00cc
            A r7 = r2.f7906h
            int[] r7 = (int[]) r7
            int r7 = r7.length
            if (r7 != 0) goto L_0x0065
            r7 = r6
            goto L_0x0066
        L_0x0065:
            r7 = r5
        L_0x0066:
            r7 = r7 ^ r6
            if (r7 == 0) goto L_0x00cc
            B r7 = r2.f7907i
            float[] r7 = (float[]) r7
            int r7 = r7.length
            if (r7 != 0) goto L_0x0072
            r7 = r6
            goto L_0x0073
        L_0x0072:
            r7 = r5
        L_0x0073:
            r7 = r7 ^ r6
            if (r7 == 0) goto L_0x00cc
            android.graphics.Paint r7 = r4.getPaint()
            java.lang.String r8 = "gradientDrawable.paint"
            e.x.c.i.d(r7, r8)
            android.graphics.RadialGradient r8 = new android.graphics.RadialGradient     // Catch:{ Exception -> 0x00b1 }
            r11 = 0
            if (r3 == 0) goto L_0x008d
            java.lang.Float r12 = r3.a     // Catch:{ Exception -> 0x00b1 }
            if (r12 == 0) goto L_0x008d
            float r12 = r12.floatValue()     // Catch:{ Exception -> 0x00b1 }
            goto L_0x008e
        L_0x008d:
            r12 = r11
        L_0x008e:
            if (r3 == 0) goto L_0x009a
            java.lang.Float r3 = r3.f7107b     // Catch:{ Exception -> 0x00b1 }
            if (r3 == 0) goto L_0x009a
            float r3 = r3.floatValue()     // Catch:{ Exception -> 0x00b1 }
            r13 = r3
            goto L_0x009b
        L_0x009a:
            r13 = r11
        L_0x009b:
            float r14 = b.f.a.e.j(r10, r1, r0)     // Catch:{ Exception -> 0x00b1 }
            A r0 = r2.f7906h     // Catch:{ Exception -> 0x00b1 }
            r15 = r0
            int[] r15 = (int[]) r15     // Catch:{ Exception -> 0x00b1 }
            B r0 = r2.f7907i     // Catch:{ Exception -> 0x00b1 }
            r16 = r0
            float[] r16 = (float[]) r16     // Catch:{ Exception -> 0x00b1 }
            android.graphics.Shader$TileMode r17 = android.graphics.Shader.TileMode.CLAMP     // Catch:{ Exception -> 0x00b1 }
            r11 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00c6
        L_0x00b1:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r0.getLocalizedMessage()
            r1[r5] = r0
            q.a.a$b r0 = q.a.a.d
            java.lang.String r2 = "Exception with linear gradient: %s"
            r0.b(r2, r1)
            android.graphics.Shader r8 = new android.graphics.Shader
            r8.<init>()
        L_0x00c6:
            r7.setShader(r8)
            r9.setBackground(r4)
        L_0x00cc:
            if (r10 == 0) goto L_0x00e3
            boolean r0 = b.f.a.e.Y(r19)
            if (r0 != r6) goto L_0x00e3
            java.lang.Integer r0 = r10.O
            if (r0 == 0) goto L_0x00dc
            int r5 = r0.intValue()
        L_0x00dc:
            android.graphics.drawable.Drawable r0 = b.f.a.e.p(r10, r5)
            r9.setForeground(r0)
        L_0x00e3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.h.o.c(android.view.View, com.appfoundry.previewer.model.Style, int, int, int):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if ((r11 != null ? r11.f7098g : null) != null) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.appcompat.widget.Toolbar d(android.view.View r20, java.lang.String r21, com.appfoundry.previewer.model.Container r22, java.lang.Boolean r23) {
        /*
            r0 = r20
            r11 = r22
            java.lang.String r1 = "$this$addTopBar"
            e.x.c.i.e(r0, r1)
            r12 = 0
            if (r11 == 0) goto L_0x000f
            java.util.List<com.appfoundry.previewer.model.Component> r1 = r11.f
            goto L_0x0010
        L_0x000f:
            r1 = r12
        L_0x0010:
            if (r1 != 0) goto L_0x001a
            if (r11 == 0) goto L_0x0017
            com.appfoundry.previewer.model.Container r1 = r11.f7098g
            goto L_0x0018
        L_0x0017:
            r1 = r12
        L_0x0018:
            if (r1 == 0) goto L_0x0156
        L_0x001a:
            r1 = 2131231290(0x7f08023a, float:1.8078657E38)
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x0156
            r2 = 2131427465(0x7f0b0089, float:1.8476547E38)
            r1.setLayoutResource(r2)
            r1.inflate()
            r1 = 2131231265(0x7f080221, float:1.8078606E38)
            android.view.View r1 = r0.findViewById(r1)
            r13 = r1
            androidx.appcompat.widget.Toolbar r13 = (androidx.appcompat.widget.Toolbar) r13
            android.content.Context r7 = r20.getContext()
            java.lang.String r1 = "topBar"
            e.x.c.i.d(r13, r1)
            java.lang.String r2 = "$this$createToolbarLayout"
            e.x.c.i.e(r11, r2)
            e.x.c.i.e(r13, r1)
            java.lang.String r2 = r11.c
            r8 = r23
            com.appfoundry.previewer.model.Style r14 = b.a.a.n.f.t(r2, r8)
            r15 = 0
            if (r14 == 0) goto L_0x005a
            int r2 = b.f.a.e.y0(r14)
            r9 = r2
            goto L_0x005b
        L_0x005a:
            r9 = r15
        L_0x005b:
            if (r14 == 0) goto L_0x006d
            java.util.List<java.lang.String> r2 = r11.f7101j
            if (r2 == 0) goto L_0x0066
            boolean r2 = b.f.a.e.V(r2)
            goto L_0x0067
        L_0x0066:
            r2 = r15
        L_0x0067:
            int r2 = b.f.a.e.A(r14, r2)
            r10 = r2
            goto L_0x006e
        L_0x006d:
            r10 = r15
        L_0x006e:
            android.view.ViewGroup$LayoutParams r2 = r13.getLayoutParams()
            boolean r2 = r2 instanceof com.google.android.material.appbar.AppBarLayout.LayoutParams
            if (r2 == 0) goto L_0x007c
            com.google.android.material.appbar.AppBarLayout$LayoutParams r2 = new com.google.android.material.appbar.AppBarLayout$LayoutParams
            r2.<init>((int) r9, (int) r10)
            goto L_0x0089
        L_0x007c:
            android.view.ViewGroup$LayoutParams r2 = r13.getLayoutParams()
            boolean r2 = r2 instanceof android.widget.FrameLayout.LayoutParams
            if (r2 == 0) goto L_0x008c
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r9, r10)
        L_0x0089:
            r13.setLayoutParams(r2)
        L_0x008c:
            r2 = 2131231266(0x7f080222, float:1.8078608E38)
            android.view.View r2 = r13.findViewById(r2)
            r6 = r2
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r2 = 2131231090(0x7f080172, float:1.8078251E38)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r6.setTag(r2, r3)
            java.lang.String r2 = "topBarParentFrameLayout"
            e.x.c.i.d(r6, r2)
            com.appfoundry.previewer.model.Container r2 = r11.f7098g
            java.lang.String r3 = "$this$handleNotchIfFlagActive"
            e.x.c.i.e(r6, r3)
            e.x.c.i.e(r13, r1)
            b.a.a.h.h r1 = new b.a.a.h.h
            r1.<init>(r6, r13, r2)
            r6.addOnLayoutChangeListener(r1)
            r1 = r22
            r2 = r7
            r3 = r6
            r4 = r9
            r5 = r10
            r16 = r6
            r6 = r23
            b.a.a.h.e.a(r1, r2, r3, r4, r5, r6)
            r17 = 0
            r18 = 0
            r19 = 192(0xc0, float:2.69E-43)
            r3 = r21
            r4 = r16
            r5 = r9
            r6 = r10
            r7 = r23
            r8 = r17
            r9 = r18
            r10 = r19
            b.a.a.h.e.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            boolean r1 = r1 instanceof com.google.android.material.appbar.AppBarLayout.LayoutParams
            if (r1 == 0) goto L_0x0124
            if (r14 == 0) goto L_0x00e6
            java.lang.String r1 = r14.G
            goto L_0x00e7
        L_0x00e6:
            r1 = r12
        L_0x00e7:
            java.lang.String r2 = "scroll"
            boolean r1 = e.x.c.i.a(r1, r2)
            java.lang.String r2 = "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams"
            if (r1 != 0) goto L_0x0112
            if (r14 == 0) goto L_0x00f6
            java.lang.String r1 = r14.G
            goto L_0x00f7
        L_0x00f6:
            r1 = r12
        L_0x00f7:
            java.lang.String r3 = "hidescroll"
            boolean r1 = e.x.c.i.a(r1, r3)
            if (r1 == 0) goto L_0x0100
            goto L_0x0112
        L_0x0100:
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            java.util.Objects.requireNonNull(r1, r2)
            com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r1
            java.lang.String r2 = "$this$setFixedToolbarOnScroll"
            e.x.c.i.e(r1, r2)
            r1.setScrollFlags(r15)
            goto L_0x0124
        L_0x0112:
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            java.util.Objects.requireNonNull(r1, r2)
            com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r1
            java.lang.String r2 = "$this$setScrollToolbarOnScroll"
            e.x.c.i.e(r1, r2)
            r2 = 5
            r1.setScrollFlags(r2)
        L_0x0124:
            java.lang.String r1 = r11.c
            r2 = 2
            com.appfoundry.previewer.model.Style r1 = b.a.a.n.f.u(r1, r12, r2)
            if (r1 == 0) goto L_0x0135
            java.lang.Boolean r1 = r1.v
            if (r1 == 0) goto L_0x0135
            boolean r15 = r1.booleanValue()
        L_0x0135:
            r1 = 2131231219(0x7f0801f3, float:1.8078513E38)
            android.view.View r0 = r0.findViewById(r1)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r0
            if (r15 != 0) goto L_0x0155
            if (r0 == 0) goto L_0x0155
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams"
            java.util.Objects.requireNonNull(r0, r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r1 = new com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior
            r1.<init>()
            r0.setBehavior(r1)
        L_0x0155:
            return r13
        L_0x0156:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.h.o.d(android.view.View, java.lang.String, com.appfoundry.previewer.model.Container, java.lang.Boolean):androidx.appcompat.widget.Toolbar");
    }

    public static final void e(View view) {
        i.e(view, "$this$hide");
        view.setVisibility(8);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0267, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0268, code lost:
        r0.setHint(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x027d, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x027e, code lost:
        r6.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0313, code lost:
        if (r9.equals("component:input-url") != false) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0320, code lost:
        r6.setInputType(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x032d, code lost:
        if (r9.equals("component:date") != false) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x036d, code lost:
        if (r9.equals("component:input-date") != false) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x036f, code lost:
        r0 = (android.widget.EditText) r6;
        r7 = r0.getContext();
        e.x.c.i.d(r7, com.segment.analytics.integrations.BasePayload.CONTEXT_KEY);
        e.x.c.i.e(r0, "$this$transformIntoDatePicker");
        e.x.c.i.e(r7, com.segment.analytics.integrations.BasePayload.CONTEXT_KEY);
        r0.setClickable(true);
        r0.setShowSoftInputOnFocus(false);
        r0.setCursorVisible(false);
        r0.setOnFocusChangeListener(new b.a.a.h.p(r0));
        r3 = java.util.Calendar.getInstance();
        r23 = "(this as java.lang.String).toLowerCase(locale)";
        r26 = "strike";
        r0.setOnClickListener(new b.a.a.h.q(r7, new b.a.a.h.r(r0, r3), r3, (java.util.Date) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03c8, code lost:
        r6.setInputType(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0023, code lost:
        r1 = r8.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d5, code lost:
        if (r2.equals("center") != false) goto L_0x00d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x04f3  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x05cb  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x05fa  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0622  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0636  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0645  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0611 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0633 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.View f(android.widget.TextView r18, java.lang.String r19, java.lang.String r20, com.appfoundry.previewer.model.Style r21, int r22, int r23, com.appfoundry.previewer.model.Text r24, boolean r25, boolean r26, int r27, java.lang.String r28, java.util.List<com.appfoundry.previewer.model.RichText> r29, java.lang.String r30, java.lang.String r31) {
        /*
            r6 = r18
            r7 = r21
            r8 = r24
            r9 = r28
            r10 = r29
            r11 = r30
            java.lang.String r0 = "$this$setup"
            e.x.c.i.e(r6, r0)
            r0 = r18
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r25
            r5 = r27
            g(r0, r1, r2, r3, r4, r5)
            r0 = 0
            if (r8 == 0) goto L_0x002c
            java.lang.String r1 = r8.a
            if (r1 == 0) goto L_0x002c
            java.lang.String r1 = b.a.a.h.m.o(r1)
            goto L_0x002d
        L_0x002c:
            r1 = r0
        L_0x002d:
            if (r7 == 0) goto L_0x0038
            java.lang.String r2 = r7.f7168b
            if (r2 == 0) goto L_0x0038
            int r2 = b.a.a.h.m.m(r2)
            goto L_0x003a
        L_0x0038:
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x003a:
            boolean r3 = r6 instanceof android.widget.EditText
            r4 = 4
            r5 = 0
            if (r3 == 0) goto L_0x004a
            r11 = r6
            android.widget.EditText r11 = (android.widget.EditText) r11
            r11.setHint(r1)
            r6.setHintTextColor(r2)
            goto L_0x009a
        L_0x004a:
            if (r11 == 0) goto L_0x0070
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "<a href="
            r12.append(r13)
            r12.append(r11)
            r11 = 62
            r12.append(r11)
            r12.append(r1)
            java.lang.String r11 = r12.toString()
            android.text.Spanned r11 = android.text.Html.fromHtml(r11)
            r6.setText(r11)
            r6.setLinkTextColor(r2)
            goto L_0x008d
        L_0x0070:
            java.lang.String r11 = "html"
            r12 = r31
            boolean r11 = e.x.c.i.a(r12, r11)
            if (r11 == 0) goto L_0x0095
            if (r1 == 0) goto L_0x0085
            java.lang.String r11 = "”"
            java.lang.String r12 = "\""
            java.lang.String r11 = e.c0.h.w(r1, r11, r12, r5, r4)
            goto L_0x0086
        L_0x0085:
            r11 = r0
        L_0x0086:
            android.text.Spanned r11 = android.text.Html.fromHtml(r11)
            r6.setText(r11)
        L_0x008d:
            android.text.method.MovementMethod r11 = android.text.method.LinkMovementMethod.getInstance()
            r6.setMovementMethod(r11)
            goto L_0x009a
        L_0x0095:
            android.widget.TextView$BufferType r11 = android.widget.TextView.BufferType.EDITABLE
            r6.setText(r1, r11)
        L_0x009a:
            r6.setTextColor(r2)
            if (r7 == 0) goto L_0x00a2
            java.lang.String r2 = r7.f7177n
            goto L_0x00a3
        L_0x00a2:
            r2 = r0
        L_0x00a3:
            r11 = 2
            if (r2 != 0) goto L_0x00a7
            goto L_0x00d8
        L_0x00a7:
            int r12 = r2.hashCode()
            r13 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r12 == r13) goto L_0x00cf
            r4 = 3317767(0x32a007, float:4.649182E-39)
            if (r12 == r4) goto L_0x00c5
            r4 = 108511772(0x677c21c, float:4.6598146E-35)
            if (r12 == r4) goto L_0x00bb
            goto L_0x00d8
        L_0x00bb:
            java.lang.String r4 = "right"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00d8
            r4 = 3
            goto L_0x00d9
        L_0x00c5:
            java.lang.String r4 = "left"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00d8
            r4 = r11
            goto L_0x00d9
        L_0x00cf:
            java.lang.String r12 = "center"
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r4 = r5
        L_0x00d9:
            r6.setTextAlignment(r4)
            if (r7 == 0) goto L_0x00e1
            java.lang.String r2 = r7.f7179p
            goto L_0x00e2
        L_0x00e1:
            r2 = r0
        L_0x00e2:
            if (r2 != 0) goto L_0x00e5
            goto L_0x010a
        L_0x00e5:
            int r4 = r2.hashCode()
            r12 = -1704601170(0xffffffff9a65d9ae, float:-4.753193E-23)
            if (r4 == r12) goto L_0x00ff
            r12 = -1245812558(0xffffffffb5be68b2, float:-1.4186573E-6)
            if (r4 == r12) goto L_0x00f4
            goto L_0x010a
        L_0x00f4:
            java.lang.String r4 = "from-top"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x010a
            r2 = 48
            goto L_0x010c
        L_0x00ff:
            java.lang.String r4 = "from-bottom"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x010a
            r2 = 80
            goto L_0x010c
        L_0x010a:
            r2 = 16
        L_0x010c:
            if (r7 == 0) goto L_0x0111
            java.lang.String r4 = r7.f7178o
            goto L_0x0112
        L_0x0111:
            r4 = r0
        L_0x0112:
            r12 = 1
            if (r4 != 0) goto L_0x0116
            goto L_0x013d
        L_0x0116:
            int r13 = r4.hashCode()
            r14 = 34268234(0x20ae44a, float:1.0204155E-37)
            if (r13 == r14) goto L_0x0131
            r14 = 1067976249(0x3fa80639, float:1.3126899)
            if (r13 == r14) goto L_0x0125
            goto L_0x013d
        L_0x0125:
            java.lang.String r13 = "from-right"
            boolean r4 = r4.equals(r13)
            if (r4 == 0) goto L_0x013d
            r4 = 8388613(0x800005, float:1.175495E-38)
            goto L_0x013e
        L_0x0131:
            java.lang.String r13 = "from-left"
            boolean r4 = r4.equals(r13)
            if (r4 == 0) goto L_0x013d
            r4 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x013e
        L_0x013d:
            r4 = r12
        L_0x013e:
            r2 = r2 | r4
            r6.setGravity(r2)
            if (r7 == 0) goto L_0x0147
            java.lang.String r2 = r7.f7169e
            goto L_0x0148
        L_0x0147:
            r2 = r0
        L_0x0148:
            if (r2 == 0) goto L_0x0158
            b.a.a.m.a r2 = new b.a.a.m.a
            r2.<init>()
            java.lang.String r4 = r7.f7169e
            android.graphics.Typeface r2 = b.a.a.m.a.a(r2, r4, r5, r11)
            r6.setTypeface(r2)
        L_0x0158:
            r2 = 0
            if (r7 == 0) goto L_0x0164
            java.lang.Float r4 = r7.f
            if (r4 == 0) goto L_0x0164
            float r4 = r4.floatValue()
            goto L_0x0165
        L_0x0164:
            r4 = r2
        L_0x0165:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0170
            float r5 = b.a.a.n.c.r(r4)
            r6.setTextSize(r5)
        L_0x0170:
            int r5 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            r13 = 1120403456(0x42c80000, float:100.0)
            if (r5 < r11) goto L_0x019b
            if (r7 == 0) goto L_0x017d
            java.lang.Float r11 = r7.f7170g
            goto L_0x017e
        L_0x017d:
            r11 = r0
        L_0x017e:
            if (r11 == 0) goto L_0x019b
            android.text.TextPaint r11 = r18.getPaint()
            int r11 = r11.getFontMetricsInt(r0)
            java.lang.Float r14 = r7.f7170g
            float r14 = r14.floatValue()
            float r14 = b.a.a.n.c.e(r14)
            float r14 = r14 / r13
            float r14 = r14 * r4
            float r4 = (float) r11
            float r14 = r14 - r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r6.setLineSpacing(r14, r4)
        L_0x019b:
            if (r7 == 0) goto L_0x01a0
            com.appfoundry.previewer.model.Shadow r4 = r7.z
            goto L_0x01a1
        L_0x01a0:
            r4 = r0
        L_0x01a1:
            if (r4 == 0) goto L_0x01c3
            b.a.a.i.l r4 = b.f.a.e.M(r21, r22, r23)
            android.text.TextPaint r11 = r18.getPaint()
            float r14 = r4.f322e
            float r15 = r4.f
            float r13 = r4.f323g
            int r16 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r16 >= 0) goto L_0x01b6
            goto L_0x01b7
        L_0x01b6:
            r2 = r13
        L_0x01b7:
            int r4 = r4.d
            r11.setShadowLayer(r14, r15, r2, r4)
            r2 = 27
            if (r5 > r2) goto L_0x01c3
            r6.setLayerType(r12, r0)
        L_0x01c3:
            if (r26 == 0) goto L_0x01ce
            r2 = 2
            r6.setLines(r2)
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r6.setEllipsize(r2)
        L_0x01ce:
            if (r7 == 0) goto L_0x01d2
            java.lang.String r0 = r7.D
        L_0x01d2:
            java.lang.String r2 = "upper"
            java.lang.String r4 = "title"
            java.lang.String r11 = "lower"
            java.lang.String r13 = "(this as java.lang.String).toUpperCase(locale)"
            java.lang.String r14 = "(this as java.lang.String).toLowerCase(locale)"
            java.lang.String r15 = "Locale.getDefault()"
            if (r0 == 0) goto L_0x0281
            java.lang.String r0 = r7.D
            if (r0 != 0) goto L_0x01e6
            goto L_0x0281
        L_0x01e6:
            int r16 = r0.hashCode()
            switch(r16) {
                case 103164673: goto L_0x0247;
                case 110371416: goto L_0x022e;
                case 111499426: goto L_0x01fe;
                case 1229499161: goto L_0x01ef;
                default: goto L_0x01ed;
            }
        L_0x01ed:
            goto L_0x0281
        L_0x01ef:
            java.lang.String r1 = "small_caps"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0281
            java.lang.String r0 = "smcp"
            r6.setFontFeatureSettings(r0)
            goto L_0x0281
        L_0x01fe:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0281
            r6.setAllCaps(r12)
            if (r3 == 0) goto L_0x021d
            r0 = r6
            android.widget.EditText r0 = (android.widget.EditText) r0
            if (r1 == 0) goto L_0x0267
            java.util.Locale r12 = java.util.Locale.getDefault()
            e.x.c.i.d(r12, r15)
            java.lang.String r1 = r1.toUpperCase(r12)
            e.x.c.i.d(r1, r13)
            goto L_0x0268
        L_0x021d:
            if (r1 == 0) goto L_0x027d
            java.util.Locale r0 = java.util.Locale.getDefault()
            e.x.c.i.d(r0, r15)
            java.lang.String r0 = r1.toUpperCase(r0)
            e.x.c.i.d(r0, r13)
            goto L_0x027e
        L_0x022e:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0281
            if (r3 == 0) goto L_0x0240
            r0 = r6
            android.widget.EditText r0 = (android.widget.EditText) r0
            if (r1 == 0) goto L_0x0267
            java.lang.String r1 = b.a.a.h.m.n(r1)
            goto L_0x0268
        L_0x0240:
            if (r1 == 0) goto L_0x027d
            java.lang.String r0 = b.a.a.h.m.n(r1)
            goto L_0x027e
        L_0x0247:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0281
            r0 = 0
            r6.setAllCaps(r0)
            if (r3 == 0) goto L_0x026c
            r0 = r6
            android.widget.EditText r0 = (android.widget.EditText) r0
            if (r1 == 0) goto L_0x0267
            java.util.Locale r12 = java.util.Locale.getDefault()
            e.x.c.i.d(r12, r15)
            java.lang.String r1 = r1.toLowerCase(r12)
            e.x.c.i.d(r1, r14)
            goto L_0x0268
        L_0x0267:
            r1 = 0
        L_0x0268:
            r0.setHint(r1)
            goto L_0x0281
        L_0x026c:
            if (r1 == 0) goto L_0x027d
            java.util.Locale r0 = java.util.Locale.getDefault()
            e.x.c.i.d(r0, r15)
            java.lang.String r0 = r1.toLowerCase(r0)
            e.x.c.i.d(r0, r14)
            goto L_0x027e
        L_0x027d:
            r0 = 0
        L_0x027e:
            r6.setText(r0)
        L_0x0281:
            if (r7 == 0) goto L_0x0286
            java.lang.String r0 = r7.E
            goto L_0x0287
        L_0x0286:
            r0 = 0
        L_0x0287:
            java.lang.String r1 = "strike"
            java.lang.String r12 = "underline"
            r22 = r13
            r13 = 8
            if (r0 == 0) goto L_0x02b5
            java.lang.String r0 = r7.E
            boolean r0 = e.x.c.i.a(r0, r12)
            if (r0 == 0) goto L_0x02a1
            int r0 = r18.getPaintFlags()
            r0 = r0 | r13
            r16 = 16
            goto L_0x02b1
        L_0x02a1:
            java.lang.String r0 = r7.E
            boolean r0 = e.x.c.i.a(r0, r1)
            if (r0 == 0) goto L_0x02b5
            int r0 = r18.getPaintFlags()
            r16 = 16
            r0 = r0 | 16
        L_0x02b1:
            r6.setPaintFlags(r0)
            goto L_0x02b7
        L_0x02b5:
            r16 = 16
        L_0x02b7:
            if (r7 == 0) goto L_0x02bc
            java.lang.Float r0 = r7.f7171h
            goto L_0x02bd
        L_0x02bc:
            r0 = 0
        L_0x02bd:
            if (r0 == 0) goto L_0x02ce
            java.lang.Float r0 = r7.f7171h
            float r0 = r0.floatValue()
            r17 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r17
            float r13 = (float) r13
            float r0 = r0 * r13
            r6.setLetterSpacing(r0)
        L_0x02ce:
            r0 = 1
            r6.setClipToOutline(r0)
            if (r3 == 0) goto L_0x0408
            if (r7 == 0) goto L_0x02e4
            boolean r0 = b.f.a.e.Y(r21)
            if (r0 != 0) goto L_0x02e4
            r0 = r6
            android.widget.EditText r0 = (android.widget.EditText) r0
            r3 = 0
            r0.setBackground(r3)
            goto L_0x02e5
        L_0x02e4:
            r3 = 0
        L_0x02e5:
            r0 = 0
            r6.setPadding(r0, r0, r0, r0)
            r0 = 29
            if (r5 != r0) goto L_0x02f3
            r0 = r6
            android.widget.EditText r0 = (android.widget.EditText) r0
            r0.setTextCursorDrawable(r3)
        L_0x02f3:
            if (r9 == 0) goto L_0x03e5
            java.lang.String r0 = "component:input-textarea"
            boolean r0 = e.x.c.i.a(r9, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0302
            r18.setSingleLine()
        L_0x0302:
            int r0 = r28.hashCode()
            java.lang.String r3 = "context"
            switch(r0) {
                case -1794194085: goto L_0x03cc;
                case -996722468: goto L_0x03ba;
                case -568224247: goto L_0x03ab;
                case 1214732910: goto L_0x0367;
                case 1215217037: goto L_0x0330;
                case 1335671819: goto L_0x0327;
                case 1840315739: goto L_0x0316;
                case 1840317103: goto L_0x030d;
                default: goto L_0x030b;
            }
        L_0x030b:
            goto L_0x03e5
        L_0x030d:
            java.lang.String r0 = "component:input-url"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x03e5
            goto L_0x0320
        L_0x0316:
            java.lang.String r0 = "component:input-tel"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x03e5
            r16 = 3
        L_0x0320:
            r0 = r16
            r6.setInputType(r0)
            goto L_0x03e5
        L_0x0327:
            java.lang.String r0 = "component:date"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x03e5
            goto L_0x036f
        L_0x0330:
            java.lang.String r0 = "component:input-time"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x03e5
            r0 = r6
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.content.Context r7 = r0.getContext()
            e.x.c.i.d(r7, r3)
            java.lang.String r13 = "$this$transformIntoTimePicker"
            e.x.c.i.e(r0, r13)
            e.x.c.i.e(r7, r3)
            r3 = 1
            r0.setClickable(r3)
            r3 = 0
            r0.setShowSoftInputOnFocus(r3)
            r0.setCursorVisible(r3)
            b.a.a.h.s r3 = new b.a.a.h.s
            r3.<init>(r0)
            r0.setOnFocusChangeListener(r3)
            b.a.a.h.t r3 = new b.a.a.h.t
            r3.<init>(r0, r7)
            r0.setOnClickListener(r3)
            goto L_0x03e5
        L_0x0367:
            java.lang.String r0 = "component:input-date"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x03e5
        L_0x036f:
            r0 = r6
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.content.Context r7 = r0.getContext()
            e.x.c.i.d(r7, r3)
            java.lang.String r13 = "$this$transformIntoDatePicker"
            e.x.c.i.e(r0, r13)
            e.x.c.i.e(r7, r3)
            r3 = 1
            r0.setClickable(r3)
            r3 = 0
            r0.setShowSoftInputOnFocus(r3)
            r0.setCursorVisible(r3)
            b.a.a.h.p r3 = new b.a.a.h.p
            r3.<init>(r0)
            r0.setOnFocusChangeListener(r3)
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            b.a.a.h.r r13 = new b.a.a.h.r
            r13.<init>(r0, r3)
            r23 = r14
            b.a.a.h.q r14 = new b.a.a.h.q
            r26 = r1
            r1 = 0
            r14.<init>(r7, r13, r3, r1)
            r0.setOnClickListener(r14)
            goto L_0x03e9
        L_0x03ab:
            r26 = r1
            r23 = r14
            java.lang.String r0 = "component:input-number"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x03e9
            r0 = 8194(0x2002, float:1.1482E-41)
            goto L_0x03c8
        L_0x03ba:
            r26 = r1
            r23 = r14
            java.lang.String r0 = "component:input-email"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x03e9
            r0 = 32
        L_0x03c8:
            r6.setInputType(r0)
            goto L_0x03e9
        L_0x03cc:
            r26 = r1
            r23 = r14
            java.lang.String r0 = "component:input-password"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x03e9
            r0 = 129(0x81, float:1.81E-43)
            r6.setInputType(r0)
            android.text.method.PasswordTransformationMethod r0 = android.text.method.PasswordTransformationMethod.getInstance()
            r6.setTransformationMethod(r0)
            goto L_0x03e9
        L_0x03e5:
            r26 = r1
            r23 = r14
        L_0x03e9:
            r0 = 24
            if (r5 == r0) goto L_0x03fa
            r0 = 25
            if (r5 != r0) goto L_0x03f2
            goto L_0x03fa
        L_0x03f2:
            r0 = 1
            r6.setTextIsSelectable(r0)
            r6.setSelectAllOnFocus(r0)
            goto L_0x040c
        L_0x03fa:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            q.a.a$b r1 = q.a.a.d
            java.lang.String r3 = ">>>>>>>>>> IS NOUGAT"
            r1.a(r3, r0)
            r18.clearFocus()
            goto L_0x040c
        L_0x0408:
            r26 = r1
            r23 = r14
        L_0x040c:
            if (r8 != 0) goto L_0x063d
            if (r10 == 0) goto L_0x063d
            java.lang.String r0 = "$this$parseFigmaRichText"
            e.x.c.i.e(r10, r0)
            java.util.Iterator r0 = r29.iterator()
            java.lang.String r1 = ""
        L_0x041b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0439
            java.lang.Object r3 = r0.next()
            com.appfoundry.previewer.model.RichText r3 = (com.appfoundry.previewer.model.RichText) r3
            java.lang.String r5 = r3.a
            if (r5 == 0) goto L_0x041b
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r1)
            java.lang.String r3 = r3.a
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto L_0x041b
        L_0x0439:
            java.lang.String r0 = "$this$setRichText"
            e.x.c.i.e(r1, r0)
            java.lang.String r3 = "richTextList"
            e.x.c.i.e(r10, r3)
            java.util.Iterator r5 = r29.iterator()
        L_0x0447:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x04de
            java.lang.Object r7 = r5.next()
            com.appfoundry.previewer.model.RichText r7 = (com.appfoundry.previewer.model.RichText) r7
            java.lang.String r8 = r7.f7157b
            r13 = 2
            r14 = 0
            com.appfoundry.previewer.model.Style r8 = b.a.a.n.f.u(r8, r14, r13)
            if (r8 == 0) goto L_0x0460
            java.lang.String r13 = r8.D
            goto L_0x0461
        L_0x0460:
            r13 = 0
        L_0x0461:
            if (r13 == 0) goto L_0x04d8
            java.lang.String r13 = r7.a
            if (r13 == 0) goto L_0x04d8
            java.lang.String r8 = r8.D
            if (r8 != 0) goto L_0x046d
            goto L_0x04d8
        L_0x046d:
            int r13 = r8.hashCode()
            r14 = 103164673(0x6262b01, float:3.1252724E-35)
            r21 = r5
            java.lang.String r5 = "null cannot be cast to non-null type java.lang.String"
            if (r13 == r14) goto L_0x04b6
            r14 = 110371416(0x6942258, float:5.5721876E-35)
            if (r13 == r14) goto L_0x049e
            r14 = 111499426(0x6a558a2, float:6.2196336E-35)
            if (r13 == r14) goto L_0x0485
            goto L_0x04da
        L_0x0485:
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x04da
            java.lang.String r7 = r7.a
            java.util.Locale r8 = java.util.Locale.getDefault()
            e.x.c.i.d(r8, r15)
            java.util.Objects.requireNonNull(r7, r5)
            java.lang.String r5 = r7.toUpperCase(r8)
            r8 = r22
            goto L_0x04ce
        L_0x049e:
            boolean r5 = r8.equals(r4)
            if (r5 == 0) goto L_0x04da
            java.lang.String r5 = r7.a
            java.lang.String r8 = b.a.a.h.m.n(r5)
            if (r8 == 0) goto L_0x04ad
            goto L_0x04af
        L_0x04ad:
            java.lang.String r8 = r7.a
        L_0x04af:
            r7 = 4
            r13 = 0
            java.lang.String r1 = e.c0.h.w(r1, r5, r8, r13, r7)
            goto L_0x04da
        L_0x04b6:
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x04da
            java.lang.String r7 = r7.a
            java.util.Locale r8 = java.util.Locale.getDefault()
            e.x.c.i.d(r8, r15)
            java.util.Objects.requireNonNull(r7, r5)
            java.lang.String r5 = r7.toLowerCase(r8)
            r8 = r23
        L_0x04ce:
            e.x.c.i.d(r5, r8)
            r8 = 4
            r13 = 0
            java.lang.String r1 = e.c0.h.w(r1, r7, r5, r13, r8)
            goto L_0x04da
        L_0x04d8:
            r21 = r5
        L_0x04da:
            r5 = r21
            goto L_0x0447
        L_0x04de:
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r1)
            e.x.c.i.e(r2, r0)
            e.x.c.i.e(r10, r3)
            java.util.Iterator r0 = r29.iterator()
        L_0x04ed:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0615
            java.lang.Object r1 = r0.next()
            com.appfoundry.previewer.model.RichText r1 = (com.appfoundry.previewer.model.RichText) r1
            java.lang.String r3 = r1.f7157b
            r4 = 2
            r5 = 0
            com.appfoundry.previewer.model.Style r3 = b.a.a.n.f.u(r3, r5, r4)
            if (r3 == 0) goto L_0x060d
            java.lang.String r5 = r1.a
            if (r5 == 0) goto L_0x060d
            r7 = 1
            boolean r5 = e.c0.h.b(r2, r5, r7)
            if (r5 == 0) goto L_0x060d
            java.lang.String r5 = r1.a
            r8 = 0
            int r4 = e.c0.h.l(r2, r5, r8, r7, r4)
            java.lang.String r5 = r1.a
            int r5 = r5.length()
            int r5 = r5 + r4
            java.lang.String r7 = r3.f7168b
            r11 = 33
            if (r7 == 0) goto L_0x0533
            int r7 = b.a.a.h.m.m(r7)
            java.lang.String r13 = "$this$setTextColorSpan"
            e.x.c.i.e(r2, r13)
            android.text.style.ForegroundColorSpan r13 = new android.text.style.ForegroundColorSpan
            r13.<init>(r7)
            r2.setSpan(r13, r4, r5, r11)
        L_0x0533:
            java.lang.Float r7 = r3.f
            if (r7 == 0) goto L_0x054e
            float r7 = r7.floatValue()
            java.lang.String r13 = "$this$setTextSizeSpan"
            e.x.c.i.e(r2, r13)
            android.text.style.AbsoluteSizeSpan r13 = new android.text.style.AbsoluteSizeSpan
            float r7 = b.a.a.n.c.r(r7)
            int r7 = (int) r7
            r14 = 1
            r13.<init>(r7, r14)
            r2.setSpan(r13, r4, r5, r11)
        L_0x054e:
            java.lang.Boolean r7 = r3.H
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            boolean r7 = e.x.c.i.a(r7, r13)
            if (r7 == 0) goto L_0x056d
            boolean r7 = b.f.a.e.h0(r3)
            if (r7 == 0) goto L_0x056d
            java.lang.String r7 = "$this$setBoldItalicSpan"
            e.x.c.i.e(r2, r7)
            android.text.style.StyleSpan r7 = new android.text.style.StyleSpan
            r13 = 3
            r7.<init>(r13)
            r2.setSpan(r7, r4, r5, r11)
            goto L_0x0598
        L_0x056d:
            boolean r7 = b.f.a.e.h0(r3)
            if (r7 == 0) goto L_0x0582
            java.lang.String r7 = "$this$setBoldSpan"
            e.x.c.i.e(r2, r7)
            android.text.style.StyleSpan r7 = new android.text.style.StyleSpan
            r13 = 1
            r7.<init>(r13)
            r2.setSpan(r7, r4, r5, r11)
            goto L_0x0598
        L_0x0582:
            java.lang.Boolean r7 = r3.H
            boolean r7 = e.x.c.i.a(r7, r13)
            if (r7 == 0) goto L_0x0598
            java.lang.String r7 = "$this$setItalicSpan"
            e.x.c.i.e(r2, r7)
            android.text.style.StyleSpan r7 = new android.text.style.StyleSpan
            r13 = 2
            r7.<init>(r13)
            r2.setSpan(r7, r4, r5, r11)
        L_0x0598:
            java.lang.Float r7 = r3.f7171h
            if (r7 == 0) goto L_0x05c5
            float r7 = r7.floatValue()
            r13 = 0
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x05a6
            r8 = 1
        L_0x05a6:
            r7 = r8 ^ 1
            if (r7 == 0) goto L_0x05c5
            java.lang.Float r7 = r3.f7171h
            float r7 = r7.floatValue()
            java.lang.String r8 = "$this$setLetterSpacingSpan"
            e.x.c.i.e(r2, r8)
            b.a.a.b.b r8 = new b.a.a.b.b
            r13 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 / r13
            r14 = 8
            float r14 = (float) r14
            float r7 = r7 * r14
            r8.<init>(r7)
            r2.setSpan(r8, r4, r5, r11)
            goto L_0x05c7
        L_0x05c5:
            r13 = 1120403456(0x42c80000, float:100.0)
        L_0x05c7:
            java.lang.String r3 = r3.E
            if (r3 == 0) goto L_0x05f4
            java.lang.String r7 = "$this$setTextDecorationSpan"
            e.x.c.i.e(r2, r7)
            java.lang.String r7 = "textDecoration"
            e.x.c.i.e(r3, r7)
            boolean r7 = e.x.c.i.a(r3, r12)
            if (r7 == 0) goto L_0x05e3
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
            r3.<init>()
            r7 = r26
            goto L_0x05f0
        L_0x05e3:
            r7 = r26
            boolean r3 = e.x.c.i.a(r3, r7)
            if (r3 == 0) goto L_0x05f6
            android.text.style.StrikethroughSpan r3 = new android.text.style.StrikethroughSpan
            r3.<init>()
        L_0x05f0:
            r2.setSpan(r3, r4, r5, r11)
            goto L_0x05f6
        L_0x05f4:
            r7 = r26
        L_0x05f6:
            java.lang.String r1 = r1.c
            if (r1 == 0) goto L_0x0611
            java.lang.String r3 = "$this$setHyperlinkSpan"
            e.x.c.i.e(r2, r3)
            java.lang.String r3 = "url"
            e.x.c.i.e(r1, r3)
            android.text.style.URLSpan r3 = new android.text.style.URLSpan
            r3.<init>(r1)
            r2.setSpan(r3, r4, r5, r11)
            goto L_0x0611
        L_0x060d:
            r7 = r26
            r13 = 1120403456(0x42c80000, float:100.0)
        L_0x0611:
            r26 = r7
            goto L_0x04ed
        L_0x0615:
            r6.setText(r2)
            java.util.Iterator r0 = r29.iterator()
        L_0x061c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0633
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.appfoundry.previewer.model.RichText r2 = (com.appfoundry.previewer.model.RichText) r2
            java.lang.String r2 = r2.c
            if (r2 == 0) goto L_0x062f
            r2 = 1
            goto L_0x0630
        L_0x062f:
            r2 = 0
        L_0x0630:
            if (r2 == 0) goto L_0x061c
            goto L_0x0634
        L_0x0633:
            r1 = 0
        L_0x0634:
            if (r1 == 0) goto L_0x063d
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r6.setMovementMethod(r0)
        L_0x063d:
            java.lang.String r0 = "component:input-file"
            boolean r0 = e.x.c.i.a(r9, r0)
            if (r0 == 0) goto L_0x0651
            b.a.a.h.o$a r0 = new b.a.a.h.o$a
            r1 = r19
            r2 = r20
            r0.<init>(r6, r1, r2)
            r6.setOnClickListener(r0)
        L_0x0651:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.h.o.f(android.widget.TextView, java.lang.String, java.lang.String, com.appfoundry.previewer.model.Style, int, int, com.appfoundry.previewer.model.Text, boolean, boolean, int, java.lang.String, java.util.List, java.lang.String, java.lang.String):android.view.View");
    }

    public static final b g(View view, Style style, int i2, int i3, boolean z, int i4) {
        Integer num;
        i.e(view, "$this$setup");
        Float f = null;
        b l2 = e.l(style != null ? style.f7176m : null, i2, i3, z, i4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, z ? -2 : -1);
        e.z0(layoutParams, l2.c);
        view.setLayoutParams(layoutParams);
        if (style != null) {
            style.O = Integer.valueOf(l2.a);
        }
        if (style != null) {
            style.P = Integer.valueOf(l2.f308b);
        }
        if (!(view instanceof CardView)) {
            if (style != null && e.Y(style)) {
                view.setBackground(e.p(style, l2.a));
            } else if (style != null && e.W(style)) {
                String str = style.c;
                Integer valueOf = str != null ? Integer.valueOf(m.m(str)) : null;
                i.c(valueOf);
                view.setBackgroundColor(valueOf.intValue());
            }
        }
        view.setAlpha((style == null || (num = style.r) == null) ? 1.0f : ((float) num.intValue()) / 100.0f);
        if (style != null) {
            f = style.F;
        }
        if (f != null) {
            view.setRotation(style.F.floatValue());
        }
        view.setClipToOutline(true);
        return l2;
    }

    public static /* synthetic */ b h(View view, Style style, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
        return g(view, style, i2, i3, (i5 & 16) != 0 ? false : z2, (i5 & 32) != 0 ? 0 : i4);
    }

    public static final void i(View view) {
        i.e(view, "$this$setupAppBar");
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.appbar);
        if (appBarLayout != null) {
            i.e(appBarLayout, "$this$removeShadow");
            i.e(view, "parentView");
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, Key.ELEVATION, new float[]{0.1f}));
            appBarLayout.setStateListAnimator(stateListAnimator);
        }
    }

    public static final void j(View view, Page page, Float f) {
        int i2;
        i.e(view, "$this$setupWithPage");
        if (page != null) {
            i.e(page, "$this$shouldSetupTopbar");
            i.e(page, "$this$isPageModal");
            String str = page.c;
            boolean z = false;
            if (!(str != null && h.d(str, "modal", false, 2) && (i.a(page.c, "menu:modal") ^ true)) && i.a(e.D(page), Boolean.FALSE)) {
                z = true;
            }
            if (z) {
                i(view);
                d(view, page.a, page.d, Boolean.valueOf(page.x));
            }
        }
        i.e(view, "$this$addPageBackground");
        Boolean bool = null;
        if ((page != null ? page.f7130i : null) != null) {
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.page_background);
            if (e.C(page)) {
                i2 = e.n(page, view.getContext());
            } else {
                BravoApp.b bVar = BravoApp.Q;
                i2 = BravoApp.N;
            }
            int i3 = i2;
            Container container = page.f7130i;
            if (container != null) {
                Context context = view.getContext();
                String str2 = page.a;
                i.d(frameLayout, "backgroundParent");
                int t = b.a.a.n.c.t();
                if (f != null) {
                    t = (int) ((f.floatValue() * ((float) t)) / 100.0f);
                }
                e.c(container, context, str2, frameLayout, t, i3, Boolean.valueOf(page.x), 0, false, 192);
            }
        }
        i.e(view, "$this$getRecyclerView");
        View findViewById = view.findViewById(R.id.recyclerView);
        i.d(findViewById, "this.findViewById(R.id.recyclerView)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        String str3 = page != null ? page.a : null;
        List<Container> list = page != null ? page.f : null;
        Animation animation = page != null ? page.u : null;
        if (page != null) {
            bool = Boolean.valueOf(page.x);
        }
        e.C0(recyclerView, str3, list, animation, bool, false, false, f, 48);
    }

    public static /* synthetic */ void k(View view, Page page, Float f, int i2) {
        j(view, page, (i2 & 2) != 0 ? Float.valueOf(100.0f) : null);
    }

    public static final void l(View view) {
        i.e(view, "$this$show");
        view.setVisibility(0);
    }
}
