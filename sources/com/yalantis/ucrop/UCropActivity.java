package com.yalantis.ucrop;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.q.a.h;
import b.q.a.j.d;
import b.q.a.m.c;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class UCropActivity extends AppCompatActivity {
    public static final Bitmap.CompressFormat L = Bitmap.CompressFormat.JPEG;
    public ViewGroup A;
    public List<ViewGroup> B = new ArrayList();
    public TextView C;
    public TextView D;
    public View E;
    public Transition F;
    public Bitmap.CompressFormat G = L;
    public int H = 90;
    public int[] I = {1, 2, 3};
    public c.a J = new a();
    public final View.OnClickListener K = new b();

    /* renamed from: h  reason: collision with root package name */
    public String f7405h;

    /* renamed from: i  reason: collision with root package name */
    public int f7406i;

    /* renamed from: j  reason: collision with root package name */
    public int f7407j;

    /* renamed from: k  reason: collision with root package name */
    public int f7408k;

    /* renamed from: l  reason: collision with root package name */
    public int f7409l;
    @ColorInt

    /* renamed from: m  reason: collision with root package name */
    public int f7410m;
    @DrawableRes

    /* renamed from: n  reason: collision with root package name */
    public int f7411n;
    @DrawableRes

    /* renamed from: o  reason: collision with root package name */
    public int f7412o;

    /* renamed from: p  reason: collision with root package name */
    public int f7413p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f7414q;
    public boolean r = true;
    public UCropView s;
    public GestureCropImageView t;
    public OverlayView u;
    public ViewGroup v;
    public ViewGroup w;
    public ViewGroup x;
    public ViewGroup y;
    public ViewGroup z;

    public class a implements c.a {
        public a() {
        }

        public void a(float f) {
            TextView textView = UCropActivity.this.C;
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f°", new Object[]{Float.valueOf(f)}));
            }
        }

        public void b(float f) {
            TextView textView = UCropActivity.this.D;
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%d%%", new Object[]{Integer.valueOf((int) (f * 100.0f))}));
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            if (!view.isSelected()) {
                UCropActivity uCropActivity = UCropActivity.this;
                int id = view.getId();
                Bitmap.CompressFormat compressFormat = UCropActivity.L;
                uCropActivity.c(id);
            }
        }
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    public final void a(int i2) {
        GestureCropImageView gestureCropImageView = this.t;
        int[] iArr = this.I;
        boolean z2 = false;
        gestureCropImageView.setScaleEnabled(iArr[i2] == 3 || iArr[i2] == 1);
        GestureCropImageView gestureCropImageView2 = this.t;
        int[] iArr2 = this.I;
        if (iArr2[i2] == 3 || iArr2[i2] == 2) {
            z2 = true;
        }
        gestureCropImageView2.setRotateEnabled(z2);
    }

    public void b(Throwable th) {
        setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th));
    }

    public final void c(@IdRes int i2) {
        if (this.f7414q) {
            this.v.setSelected(i2 == R.id.state_aspect_ratio);
            this.w.setSelected(i2 == R.id.state_rotate);
            this.x.setSelected(i2 == R.id.state_scale);
            int i3 = 8;
            this.y.setVisibility(i2 == R.id.state_aspect_ratio ? 0 : 8);
            this.z.setVisibility(i2 == R.id.state_rotate ? 0 : 8);
            this.A.setVisibility(i2 == R.id.state_scale ? 0 : 8);
            TransitionManager.beginDelayedTransition((ViewGroup) findViewById(R.id.ucrop_photobox), this.F);
            this.x.findViewById(R.id.text_view_scale).setVisibility(i2 == R.id.state_scale ? 0 : 8);
            this.v.findViewById(R.id.text_view_crop).setVisibility(i2 == R.id.state_aspect_ratio ? 0 : 8);
            View findViewById = this.w.findViewById(R.id.text_view_rotate);
            if (i2 == R.id.state_rotate) {
                i3 = 0;
            }
            findViewById.setVisibility(i3);
            if (i2 == R.id.state_scale) {
                a(0);
            } else if (i2 == R.id.state_rotate) {
                a(1);
            } else {
                a(2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x052a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0531  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r26) {
        /*
            r25 = this;
            r1 = r25
            super.onCreate(r26)
            r0 = 2131427489(0x7f0b00a1, float:1.8476596E38)
            r1.setContentView((int) r0)
            android.content.Intent r0 = r25.getIntent()
            r2 = 2131034375(0x7f050107, float:1.7679266E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r1, r2)
            java.lang.String r3 = "com.yalantis.ucrop.StatusBarColor"
            int r2 = r0.getIntExtra(r3, r2)
            r1.f7407j = r2
            r2 = 2131034376(0x7f050108, float:1.7679268E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r1, r2)
            java.lang.String r3 = "com.yalantis.ucrop.ToolbarColor"
            int r2 = r0.getIntExtra(r3, r2)
            r1.f7406i = r2
            r2 = 2131034362(0x7f0500fa, float:1.767924E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r1, r2)
            java.lang.String r3 = "com.yalantis.ucrop.UcropColorControlsWidgetActive"
            int r2 = r0.getIntExtra(r3, r2)
            r1.f7408k = r2
            r2 = 2131034377(0x7f050109, float:1.767927E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r1, r2)
            java.lang.String r3 = "com.yalantis.ucrop.UcropToolbarWidgetColor"
            int r2 = r0.getIntExtra(r3, r2)
            r1.f7409l = r2
            r2 = 2131165392(0x7f0700d0, float:1.7945E38)
            java.lang.String r3 = "com.yalantis.ucrop.UcropToolbarCancelDrawable"
            int r2 = r0.getIntExtra(r3, r2)
            r1.f7411n = r2
            r2 = 2131165393(0x7f0700d1, float:1.7945002E38)
            java.lang.String r3 = "com.yalantis.ucrop.UcropToolbarCropDrawable"
            int r2 = r0.getIntExtra(r3, r2)
            r1.f7412o = r2
            java.lang.String r2 = "com.yalantis.ucrop.UcropToolbarTitleText"
            java.lang.String r2 = r0.getStringExtra(r2)
            r1.f7405h = r2
            if (r2 == 0) goto L_0x006c
            goto L_0x0077
        L_0x006c:
            android.content.res.Resources r2 = r25.getResources()
            r3 = 2131755208(0x7f1000c8, float:1.9141289E38)
            java.lang.String r2 = r2.getString(r3)
        L_0x0077:
            r1.f7405h = r2
            r2 = 2131034369(0x7f050101, float:1.7679254E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r1, r2)
            java.lang.String r3 = "com.yalantis.ucrop.UcropLogoColor"
            int r2 = r0.getIntExtra(r3, r2)
            r1.f7413p = r2
            java.lang.String r2 = "com.yalantis.ucrop.HideBottomControls"
            r3 = 0
            boolean r2 = r0.getBooleanExtra(r2, r3)
            r4 = 1
            r2 = r2 ^ r4
            r1.f7414q = r2
            r2 = 2131034365(0x7f0500fd, float:1.7679245E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r1, r2)
            java.lang.String r5 = "com.yalantis.ucrop.UcropRootViewBackgroundColor"
            int r2 = r0.getIntExtra(r5, r2)
            r1.f7410m = r2
            int r2 = r1.f7407j
            android.view.Window r5 = r25.getWindow()
            if (r5 == 0) goto L_0x00b2
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r5.addFlags(r6)
            r5.setStatusBarColor(r2)
        L_0x00b2:
            r2 = 2131231261(0x7f08021d, float:1.8078598E38)
            android.view.View r5 = r1.findViewById(r2)
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5
            int r6 = r1.f7406i
            r5.setBackgroundColor(r6)
            int r6 = r1.f7409l
            r5.setTitleTextColor((int) r6)
            r6 = 2131231262(0x7f08021e, float:1.80786E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            int r7 = r1.f7409l
            r6.setTextColor(r7)
            java.lang.String r7 = r1.f7405h
            r6.setText(r7)
            int r6 = r1.f7411n
            android.graphics.drawable.Drawable r6 = androidx.core.content.ContextCompat.getDrawable(r1, r6)
            android.graphics.drawable.Drawable r6 = r6.mutate()
            int r7 = r1.f7409l
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r6.setColorFilter(r7, r8)
            r5.setNavigationIcon((android.graphics.drawable.Drawable) r6)
            r1.setSupportActionBar(r5)
            androidx.appcompat.app.ActionBar r5 = r25.getSupportActionBar()
            if (r5 == 0) goto L_0x00f8
            r5.setDisplayShowTitleEnabled(r3)
        L_0x00f8:
            r5 = 2131231276(0x7f08022c, float:1.8078628E38)
            android.view.View r5 = r1.findViewById(r5)
            com.yalantis.ucrop.view.UCropView r5 = (com.yalantis.ucrop.view.UCropView) r5
            r1.s = r5
            com.yalantis.ucrop.view.GestureCropImageView r5 = r5.getCropImageView()
            r1.t = r5
            com.yalantis.ucrop.view.UCropView r5 = r1.s
            com.yalantis.ucrop.view.OverlayView r5 = r5.getOverlayView()
            r1.u = r5
            com.yalantis.ucrop.view.GestureCropImageView r5 = r1.t
            b.q.a.m.c$a r6 = r1.J
            r5.setTransformImageListener(r6)
            r5 = 2131230975(0x7f0800ff, float:1.8078018E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            int r6 = r1.f7413p
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r5.setColorFilter(r6, r7)
            r5 = 2131231277(0x7f08022d, float:1.807863E38)
            android.view.View r6 = r1.findViewById(r5)
            int r7 = r1.f7410m
            r6.setBackgroundColor(r7)
            boolean r6 = r1.f7414q
            if (r6 != 0) goto L_0x014b
            android.view.View r6 = r1.findViewById(r5)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
            r6.bottomMargin = r3
            android.view.View r5 = r1.findViewById(r5)
            r5.requestLayout()
        L_0x014b:
            boolean r5 = r1.f7414q
            r6 = -1
            r7 = 0
            r8 = 2
            r9 = 0
            java.lang.String r10 = "com.yalantis.ucrop.AspectRatioOptions"
            java.lang.String r11 = "com.yalantis.ucrop.AspectRatioSelectedByDefault"
            r12 = 2131231209(0x7f0801e9, float:1.8078493E38)
            r13 = 2131231207(0x7f0801e7, float:1.8078488E38)
            r14 = 2131231278(0x7f08022e, float:1.8078633E38)
            if (r5 == 0) goto L_0x0357
            android.view.View r5 = r1.findViewById(r14)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r15 = 2131230869(0x7f080095, float:1.8077803E38)
            android.view.View r5 = r5.findViewById(r15)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r5.setVisibility(r3)
            android.view.LayoutInflater r15 = android.view.LayoutInflater.from(r25)
            r14 = 2131427491(0x7f0b00a3, float:1.84766E38)
            r15.inflate(r14, r5, r4)
            androidx.transition.AutoTransition r5 = new androidx.transition.AutoTransition
            r5.<init>()
            r1.F = r5
            r14 = 50
            r5.setDuration((long) r14)
            android.view.View r5 = r1.findViewById(r13)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r1.v = r5
            android.view.View$OnClickListener r14 = r1.K
            r5.setOnClickListener(r14)
            r5 = 2131231208(0x7f0801e8, float:1.807849E38)
            android.view.View r5 = r1.findViewById(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r1.w = r5
            android.view.View$OnClickListener r14 = r1.K
            r5.setOnClickListener(r14)
            android.view.View r5 = r1.findViewById(r12)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r1.x = r5
            android.view.View$OnClickListener r14 = r1.K
            r5.setOnClickListener(r14)
            r5 = 2131230991(0x7f08010f, float:1.807805E38)
            android.view.View r14 = r1.findViewById(r5)
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            r1.y = r14
            r14 = 2131230992(0x7f080110, float:1.8078052E38)
            android.view.View r14 = r1.findViewById(r14)
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            r1.z = r14
            r14 = 2131230993(0x7f080111, float:1.8078054E38)
            android.view.View r14 = r1.findViewById(r14)
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            r1.A = r14
            int r14 = r0.getIntExtra(r11, r3)
            java.util.ArrayList r15 = r0.getParcelableArrayListExtra(r10)
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r15 == 0) goto L_0x01e5
            boolean r16 = r15.isEmpty()
            if (r16 == 0) goto L_0x0228
        L_0x01e5:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            b.q.a.j.a r14 = new b.q.a.j.a
            r14.<init>(r9, r12, r12)
            r15.add(r14)
            b.q.a.j.a r14 = new b.q.a.j.a
            r13 = 1082130432(0x40800000, float:4.0)
            r2 = 1077936128(0x40400000, float:3.0)
            r14.<init>(r9, r2, r13)
            r15.add(r14)
            b.q.a.j.a r13 = new b.q.a.j.a
            r14 = 2131755209(0x7f1000c9, float:1.914129E38)
            java.lang.String r14 = r1.getString(r14)
            java.lang.String r14 = r14.toUpperCase()
            r13.<init>(r14, r7, r7)
            r15.add(r13)
            b.q.a.j.a r13 = new b.q.a.j.a
            r14 = 1073741824(0x40000000, float:2.0)
            r13.<init>(r9, r2, r14)
            r15.add(r13)
            b.q.a.j.a r2 = new b.q.a.j.a
            r13 = 1098907648(0x41800000, float:16.0)
            r14 = 1091567616(0x41100000, float:9.0)
            r2.<init>(r9, r13, r14)
            r15.add(r2)
            r14 = r8
        L_0x0228:
            android.view.View r2 = r1.findViewById(r5)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r3, r6)
            r5.weight = r12
            java.util.Iterator r12 = r15.iterator()
        L_0x0239:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x026e
            java.lang.Object r13 = r12.next()
            b.q.a.j.a r13 = (b.q.a.j.a) r13
            android.view.LayoutInflater r15 = r25.getLayoutInflater()
            r6 = 2131427490(0x7f0b00a2, float:1.8476598E38)
            android.view.View r6 = r15.inflate(r6, r9)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r6.setLayoutParams(r5)
            android.view.View r15 = r6.getChildAt(r3)
            com.yalantis.ucrop.view.widget.AspectRatioTextView r15 = (com.yalantis.ucrop.view.widget.AspectRatioTextView) r15
            int r9 = r1.f7408k
            r15.setActiveColor(r9)
            r15.setAspectRatio(r13)
            r2.addView(r6)
            java.util.List<android.view.ViewGroup> r9 = r1.B
            r9.add(r6)
            r6 = -1
            r9 = 0
            goto L_0x0239
        L_0x026e:
            java.util.List<android.view.ViewGroup> r2 = r1.B
            java.lang.Object r2 = r2.get(r14)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.setSelected(r4)
            java.util.List<android.view.ViewGroup> r2 = r1.B
            java.util.Iterator r2 = r2.iterator()
        L_0x027f:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0294
            java.lang.Object r5 = r2.next()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            b.q.a.c r6 = new b.q.a.c
            r6.<init>(r1)
            r5.setOnClickListener(r6)
            goto L_0x027f
        L_0x0294:
            r2 = 2131231248(0x7f080210, float:1.8078572E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.C = r2
            r2 = 2131231138(0x7f0801a2, float:1.8078349E38)
            android.view.View r5 = r1.findViewById(r2)
            com.yalantis.ucrop.view.widget.HorizontalProgressWheelView r5 = (com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) r5
            b.q.a.d r6 = new b.q.a.d
            r6.<init>(r1)
            r5.setScrollingListener(r6)
            android.view.View r2 = r1.findViewById(r2)
            com.yalantis.ucrop.view.widget.HorizontalProgressWheelView r2 = (com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) r2
            int r5 = r1.f7408k
            r2.setMiddleLineColor(r5)
            r2 = 2131231299(0x7f080243, float:1.8078675E38)
            android.view.View r2 = r1.findViewById(r2)
            b.q.a.e r5 = new b.q.a.e
            r5.<init>(r1)
            r2.setOnClickListener(r5)
            r2 = 2131231300(0x7f080244, float:1.8078677E38)
            android.view.View r2 = r1.findViewById(r2)
            b.q.a.f r5 = new b.q.a.f
            r5.<init>(r1)
            r2.setOnClickListener(r5)
            int r2 = r1.f7408k
            android.widget.TextView r5 = r1.C
            if (r5 == 0) goto L_0x02e2
            r5.setTextColor(r2)
        L_0x02e2:
            r2 = 2131231249(0x7f080211, float:1.8078574E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.D = r2
            r2 = 2131231148(0x7f0801ac, float:1.8078369E38)
            android.view.View r5 = r1.findViewById(r2)
            com.yalantis.ucrop.view.widget.HorizontalProgressWheelView r5 = (com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) r5
            b.q.a.g r6 = new b.q.a.g
            r6.<init>(r1)
            r5.setScrollingListener(r6)
            android.view.View r2 = r1.findViewById(r2)
            com.yalantis.ucrop.view.widget.HorizontalProgressWheelView r2 = (com.yalantis.ucrop.view.widget.HorizontalProgressWheelView) r2
            int r5 = r1.f7408k
            r2.setMiddleLineColor(r5)
            int r2 = r1.f7408k
            android.widget.TextView r5 = r1.D
            if (r5 == 0) goto L_0x0312
            r5.setTextColor(r2)
        L_0x0312:
            r2 = 2131230978(0x7f080102, float:1.8078024E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r5 = 2131230977(0x7f080101, float:1.8078022E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r6 = 2131230976(0x7f080100, float:1.807802E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            b.q.a.l.d r9 = new b.q.a.l.d
            android.graphics.drawable.Drawable r12 = r2.getDrawable()
            int r13 = r1.f7408k
            r9.<init>(r12, r13)
            r2.setImageDrawable(r9)
            b.q.a.l.d r2 = new b.q.a.l.d
            android.graphics.drawable.Drawable r9 = r5.getDrawable()
            int r12 = r1.f7408k
            r2.<init>(r9, r12)
            r5.setImageDrawable(r2)
            b.q.a.l.d r2 = new b.q.a.l.d
            android.graphics.drawable.Drawable r5 = r6.getDrawable()
            int r9 = r1.f7408k
            r2.<init>(r5, r9)
            r6.setImageDrawable(r2)
        L_0x0357:
            java.lang.String r2 = "com.yalantis.ucrop.InputUri"
            android.os.Parcelable r2 = r0.getParcelableExtra(r2)
            r19 = r2
            android.net.Uri r19 = (android.net.Uri) r19
            java.lang.String r2 = "com.yalantis.ucrop.OutputUri"
            android.os.Parcelable r2 = r0.getParcelableExtra(r2)
            r20 = r2
            android.net.Uri r20 = (android.net.Uri) r20
            java.lang.String r2 = "com.yalantis.ucrop.CompressionFormatName"
            java.lang.String r2 = r0.getStringExtra(r2)
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L_0x037c
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.valueOf(r2)
            goto L_0x037d
        L_0x037c:
            r9 = 0
        L_0x037d:
            if (r9 != 0) goto L_0x0381
            android.graphics.Bitmap$CompressFormat r9 = L
        L_0x0381:
            r1.G = r9
            r2 = 90
            java.lang.String r5 = "com.yalantis.ucrop.CompressionQuality"
            int r2 = r0.getIntExtra(r5, r2)
            r1.H = r2
            java.lang.String r2 = "com.yalantis.ucrop.AllowedGestures"
            int[] r2 = r0.getIntArrayExtra(r2)
            r5 = 3
            if (r2 == 0) goto L_0x039b
            int r6 = r2.length
            if (r6 != r5) goto L_0x039b
            r1.I = r2
        L_0x039b:
            com.yalantis.ucrop.view.GestureCropImageView r2 = r1.t
            java.lang.String r6 = "com.yalantis.ucrop.MaxBitmapSize"
            int r6 = r0.getIntExtra(r6, r3)
            r2.setMaxBitmapSize(r6)
            com.yalantis.ucrop.view.GestureCropImageView r2 = r1.t
            r6 = 1092616192(0x41200000, float:10.0)
            java.lang.String r9 = "com.yalantis.ucrop.MaxScaleMultiplier"
            float r6 = r0.getFloatExtra(r9, r6)
            r2.setMaxScaleMultiplier(r6)
            com.yalantis.ucrop.view.GestureCropImageView r2 = r1.t
            r6 = 500(0x1f4, float:7.0E-43)
            java.lang.String r9 = "com.yalantis.ucrop.ImageToCropBoundsAnimDuration"
            int r6 = r0.getIntExtra(r9, r6)
            long r12 = (long) r6
            r2.setImageToWrapCropBoundsAnimDuration(r12)
            com.yalantis.ucrop.view.OverlayView r2 = r1.u
            java.lang.String r6 = "com.yalantis.ucrop.FreeStyleCrop"
            boolean r6 = r0.getBooleanExtra(r6, r3)
            r2.setFreestyleCropEnabled(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.u
            android.content.res.Resources r6 = r25.getResources()
            r9 = 2131034368(0x7f050100, float:1.7679252E38)
            int r6 = r6.getColor(r9)
            java.lang.String r9 = "com.yalantis.ucrop.DimmedLayerColor"
            int r6 = r0.getIntExtra(r9, r6)
            r2.setDimmedColor(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.u
            java.lang.String r6 = "com.yalantis.ucrop.CircleDimmedLayer"
            boolean r6 = r0.getBooleanExtra(r6, r3)
            r2.setCircleDimmedLayer(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.u
            java.lang.String r6 = "com.yalantis.ucrop.ShowCropFrame"
            boolean r6 = r0.getBooleanExtra(r6, r4)
            r2.setShowCropFrame(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.u
            android.content.res.Resources r6 = r25.getResources()
            r9 = 2131034366(0x7f0500fe, float:1.7679248E38)
            int r6 = r6.getColor(r9)
            java.lang.String r9 = "com.yalantis.ucrop.CropFrameColor"
            int r6 = r0.getIntExtra(r9, r6)
            r2.setCropFrameColor(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.u
            android.content.res.Resources r6 = r25.getResources()
            r9 = 2131100094(0x7f0601be, float:1.781256E38)
            int r6 = r6.getDimensionPixelSize(r9)
            java.lang.String r9 = "com.yalantis.ucrop.CropFrameStrokeWidth"
            int r6 = r0.getIntExtra(r9, r6)
            r2.setCropFrameStrokeWidth(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.u
            java.lang.String r6 = "com.yalantis.ucrop.ShowCropGrid"
            boolean r6 = r0.getBooleanExtra(r6, r4)
            r2.setShowCropGrid(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.u
            java.lang.String r6 = "com.yalantis.ucrop.CropGridRowCount"
            int r6 = r0.getIntExtra(r6, r8)
            r2.setCropGridRowCount(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.u
            java.lang.String r6 = "com.yalantis.ucrop.CropGridColumnCount"
            int r6 = r0.getIntExtra(r6, r8)
            r2.setCropGridColumnCount(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.u
            android.content.res.Resources r6 = r25.getResources()
            r8 = 2131034367(0x7f0500ff, float:1.767925E38)
            int r6 = r6.getColor(r8)
            java.lang.String r8 = "com.yalantis.ucrop.CropGridColor"
            int r6 = r0.getIntExtra(r8, r6)
            r2.setCropGridColor(r6)
            com.yalantis.ucrop.view.OverlayView r2 = r1.u
            android.content.res.Resources r6 = r25.getResources()
            r8 = 2131100095(0x7f0601bf, float:1.7812562E38)
            int r6 = r6.getDimensionPixelSize(r8)
            java.lang.String r8 = "com.yalantis.ucrop.CropGridStrokeWidth"
            int r6 = r0.getIntExtra(r8, r6)
            r2.setCropGridStrokeWidth(r6)
            java.lang.String r2 = "com.yalantis.ucrop.AspectRatioX"
            float r2 = r0.getFloatExtra(r2, r7)
            java.lang.String r6 = "com.yalantis.ucrop.AspectRatioY"
            float r6 = r0.getFloatExtra(r6, r7)
            int r8 = r0.getIntExtra(r11, r3)
            java.util.ArrayList r9 = r0.getParcelableArrayListExtra(r10)
            int r10 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x0499
            int r10 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x0499
            android.view.ViewGroup r7 = r1.v
            if (r7 == 0) goto L_0x0496
            r8 = 8
            r7.setVisibility(r8)
        L_0x0496:
            com.yalantis.ucrop.view.GestureCropImageView r7 = r1.t
            goto L_0x04b3
        L_0x0499:
            if (r9 == 0) goto L_0x04b5
            int r2 = r9.size()
            if (r8 >= r2) goto L_0x04b5
            com.yalantis.ucrop.view.GestureCropImageView r7 = r1.t
            java.lang.Object r2 = r9.get(r8)
            b.q.a.j.a r2 = (b.q.a.j.a) r2
            float r2 = r2.f6788i
            java.lang.Object r6 = r9.get(r8)
            b.q.a.j.a r6 = (b.q.a.j.a) r6
            float r6 = r6.f6789j
        L_0x04b3:
            float r2 = r2 / r6
            goto L_0x04bc
        L_0x04b5:
            com.yalantis.ucrop.view.GestureCropImageView r2 = r1.t
            r24 = r7
            r7 = r2
            r2 = r24
        L_0x04bc:
            r7.setTargetAspectRatio(r2)
            java.lang.String r2 = "com.yalantis.ucrop.MaxSizeX"
            int r2 = r0.getIntExtra(r2, r3)
            java.lang.String r6 = "com.yalantis.ucrop.MaxSizeY"
            int r0 = r0.getIntExtra(r6, r3)
            if (r2 <= 0) goto L_0x04d9
            if (r0 <= 0) goto L_0x04d9
            com.yalantis.ucrop.view.GestureCropImageView r6 = r1.t
            r6.setMaxResultImageSizeX(r2)
            com.yalantis.ucrop.view.GestureCropImageView r2 = r1.t
            r2.setMaxResultImageSizeY(r0)
        L_0x04d9:
            if (r19 == 0) goto L_0x0501
            if (r20 == 0) goto L_0x0501
            com.yalantis.ucrop.view.GestureCropImageView r0 = r1.t     // Catch:{ Exception -> 0x04ff }
            int r22 = r0.getMaxBitmapSize()     // Catch:{ Exception -> 0x04ff }
            android.content.Context r18 = r0.getContext()     // Catch:{ Exception -> 0x04ff }
            b.q.a.m.b r2 = new b.q.a.m.b     // Catch:{ Exception -> 0x04ff }
            r2.<init>(r0)     // Catch:{ Exception -> 0x04ff }
            b.q.a.k.b r0 = new b.q.a.k.b     // Catch:{ Exception -> 0x04ff }
            r17 = r0
            r21 = r22
            r23 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x04ff }
            java.util.concurrent.Executor r2 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch:{ Exception -> 0x04ff }
            java.lang.Void[] r6 = new java.lang.Void[r3]     // Catch:{ Exception -> 0x04ff }
            r0.executeOnExecutor(r2, r6)     // Catch:{ Exception -> 0x04ff }
            goto L_0x0513
        L_0x04ff:
            r0 = move-exception
            goto L_0x050d
        L_0x0501:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r2 = 2131755207(0x7f1000c7, float:1.9141287E38)
            java.lang.String r2 = r1.getString(r2)
            r0.<init>(r2)
        L_0x050d:
            r1.b(r0)
            r25.finish()
        L_0x0513:
            boolean r0 = r1.f7414q
            if (r0 == 0) goto L_0x052a
            android.view.ViewGroup r0 = r1.v
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0523
            r12 = 2131231207(0x7f0801e7, float:1.8078488E38)
            goto L_0x0526
        L_0x0523:
            r12 = 2131231209(0x7f0801e9, float:1.8078493E38)
        L_0x0526:
            r1.c(r12)
            goto L_0x052d
        L_0x052a:
            r1.a(r3)
        L_0x052d:
            android.view.View r0 = r1.E
            if (r0 != 0) goto L_0x054e
            android.view.View r0 = new android.view.View
            r0.<init>(r1)
            r1.E = r0
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r2 = -1
            r0.<init>(r2, r2)
            r2 = 2131231261(0x7f08021d, float:1.8078598E38)
            r0.addRule(r5, r2)
            android.view.View r2 = r1.E
            r2.setLayoutParams(r0)
            android.view.View r0 = r1.E
            r0.setClickable(r4)
        L_0x054e:
            r2 = 2131231278(0x7f08022e, float:1.8078633E38)
            android.view.View r0 = r1.findViewById(r2)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            android.view.View r2 = r1.E
            r0.addView(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.UCropActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ucrop_menu_activity, menu);
        MenuItem findItem = menu.findItem(R.id.menu_loader);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.f7409l, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (IllegalStateException e2) {
                Log.i("UCropActivity", String.format("%s - %s", new Object[]{e2.getMessage(), getString(R.string.ucrop_mutate_exception_hint)}));
            }
            ((Animatable) findItem.getIcon()).start();
        }
        MenuItem findItem2 = menu.findItem(R.id.menu_crop);
        Drawable drawable = ContextCompat.getDrawable(this, this.f7412o);
        if (drawable != null) {
            drawable.mutate();
            drawable.setColorFilter(this.f7409l, PorterDuff.Mode.SRC_ATOP);
            findItem2.setIcon(drawable);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menu_crop) {
            this.E.setClickable(true);
            this.r = true;
            supportInvalidateOptionsMenu();
            GestureCropImageView gestureCropImageView = this.t;
            Bitmap.CompressFormat compressFormat = this.G;
            int i2 = this.H;
            h hVar = new h(this);
            gestureCropImageView.i();
            gestureCropImageView.setImageToWrapCropBounds(false);
            new b.q.a.k.a(gestureCropImageView.getContext(), gestureCropImageView.getViewBitmap(), new d(gestureCropImageView.w, b.q.a.a.k3(gestureCropImageView.f6837h), gestureCropImageView.getCurrentScale(), gestureCropImageView.getCurrentAngle()), new b.q.a.j.b(gestureCropImageView.F, gestureCropImageView.G, compressFormat, i2, gestureCropImageView.getImageInputPath(), gestureCropImageView.getImageOutputPath(), gestureCropImageView.getExifInfo()), hVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.menu_crop).setVisible(!this.r);
        menu.findItem(R.id.menu_loader).setVisible(this.r);
        return super.onPrepareOptionsMenu(menu);
    }

    public void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.t;
        if (gestureCropImageView != null) {
            gestureCropImageView.i();
        }
    }
}
