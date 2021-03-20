package com.appfoundry.previewer.custom;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import androidx.core.view.ViewCompat;
import androidx.viewpager2.widget.ViewPager2;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.a.a.b.g;
import b.a.a.c;
import com.segment.analytics.integrations.BasePayload;
import e.x.c.i;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010AJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0013R\u0016\u0010'\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0013R\u0016\u0010)\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0013R\u0016\u0010+\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010\u0013R\u0018\u0010-\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0018R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u0010\u0013R\u0016\u00109\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u0010\u0013R\u0016\u0010;\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010\u0013R\u0018\u0010=\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010\"¨\u0006B"}, d2 = {"Lcom/appfoundry/previewer/custom/DotIndicator;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/animation/Animator;", "b", "(Landroid/content/Context;)Landroid/animation/Animator;", "", "orientation", "backgroundDrawableId", "animator", "Le/r;", "a", "(IILandroid/animation/Animator;)V", "", "dpValue", "c", "(F)I", "n", "I", "indicatorBackgroundResId", "l", "animatorResId", "p", "Landroid/animation/Animator;", "animatorOut", "q", "animatorIn", "k", "indicatorHeight", "r", "immediateAnimatorOut", "Landroid/view/View;", "t", "Landroid/view/View;", "currentIndicator", "i", "indicatorMargin", "w", "lastPosition", "j", "indicatorWidth", "o", "indicatorUnselectedBackgroundResId", "s", "immediateAnimatorIn", "Landroidx/viewpager2/widget/ViewPager2;", "h", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager2", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "y", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "internalPageChangeCallback", "x", "itemNumber", "v", "indicatorTint", "m", "animatorReverseResId", "u", "selectedIndicator", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class DotIndicator extends LinearLayout {

    /* renamed from: h  reason: collision with root package name */
    public ViewPager2 f7044h;

    /* renamed from: i  reason: collision with root package name */
    public int f7045i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f7046j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f7047k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f7048l;

    /* renamed from: m  reason: collision with root package name */
    public int f7049m;

    /* renamed from: n  reason: collision with root package name */
    public int f7050n;

    /* renamed from: o  reason: collision with root package name */
    public int f7051o;

    /* renamed from: p  reason: collision with root package name */
    public Animator f7052p;

    /* renamed from: q  reason: collision with root package name */
    public Animator f7053q;
    public Animator r;
    public Animator s;
    public View t;
    public View u;
    public int v;
    public int w;
    public int x;
    public final ViewPager2.OnPageChangeCallback y;

    public final class a implements Interpolator {
        public a(DotIndicator dotIndicator) {
        }

        public float getInterpolation(float f) {
            return Math.abs(1.0f - f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DotIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, BasePayload.CONTEXT_KEY);
        int i2 = R.animator.scale_alpha;
        this.f7048l = R.animator.scale_alpha;
        int i3 = R.drawable.white_dot;
        this.f7050n = R.drawable.white_dot;
        this.f7051o = R.drawable.white_dot;
        this.v = ViewCompat.MEASURED_STATE_MASK;
        this.w = -1;
        this.y = new g(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a);
            i.d(obtainStyledAttributes, "context.obtainStyledAttr…R.styleable.DotIndicator)");
            this.f7046j = obtainStyledAttributes.getDimensionPixelSize(8, -1);
            this.f7047k = obtainStyledAttributes.getDimensionPixelSize(5, -1);
            this.f7045i = obtainStyledAttributes.getDimensionPixelSize(6, -1);
            int i4 = 0;
            this.f7048l = obtainStyledAttributes.getResourceId(0, R.animator.scale_alpha);
            this.f7049m = obtainStyledAttributes.getResourceId(1, 0);
            int resourceId = obtainStyledAttributes.getResourceId(2, R.drawable.white_dot);
            this.f7050n = resourceId;
            this.f7051o = obtainStyledAttributes.getResourceId(3, resourceId);
            setOrientation(obtainStyledAttributes.getInt(7, -1) == 1 ? 1 : i4);
            int i5 = obtainStyledAttributes.getInt(4, -1);
            setGravity(i5 < 0 ? 17 : i5);
            obtainStyledAttributes.recycle();
        }
        int i6 = this.f7046j;
        this.f7046j = i6 < 0 ? c((float) 5) : i6;
        int i7 = this.f7047k;
        this.f7047k = i7 < 0 ? c((float) 5) : i7;
        int i8 = this.f7045i;
        this.f7045i = i8 < 0 ? c((float) 5) : i8;
        int i9 = this.f7048l;
        i2 = i9 != 0 ? i9 : i2;
        this.f7048l = i2;
        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i2);
        i.d(loadAnimator, "AnimatorInflater.loadAni…r(context, animatorResId)");
        this.f7052p = loadAnimator;
        Animator loadAnimator2 = AnimatorInflater.loadAnimator(context, this.f7048l);
        i.d(loadAnimator2, "AnimatorInflater.loadAni…r(context, animatorResId)");
        this.r = loadAnimator2;
        loadAnimator2.setDuration(0);
        this.f7053q = b(context);
        Animator b2 = b(context);
        this.s = b2;
        b2.setDuration(0);
        int i10 = this.f7050n;
        i3 = i10 != 0 ? i10 : i3;
        this.f7050n = i3;
        int i11 = this.f7051o;
        this.f7051o = i11 != 0 ? i11 : i3;
    }

    public final void a(int i2, @DrawableRes int i3, Animator animator) {
        if (animator != null && animator.isRunning()) {
            animator.end();
            animator.cancel();
        }
        View view = new View(getContext());
        view.setBackgroundResource(i3);
        addView(view, this.f7046j, this.f7047k);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (i2 == 0) {
            int i4 = this.f7045i;
            layoutParams2.leftMargin = i4;
            layoutParams2.rightMargin = i4;
        } else {
            int i5 = this.f7045i;
            layoutParams2.topMargin = i5;
            layoutParams2.bottomMargin = i5;
        }
        view.setLayoutParams(layoutParams2);
        if (animator != null) {
            animator.setTarget(view);
        }
        if (animator != null) {
            animator.start();
        }
    }

    public final Animator b(Context context) {
        int i2 = this.f7049m;
        if (i2 == 0) {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, this.f7048l);
            i.d(loadAnimator, "AnimatorInflater.loadAni…r(context, animatorResId)");
            loadAnimator.setInterpolator(new a(this));
            return loadAnimator;
        }
        Animator loadAnimator2 = AnimatorInflater.loadAnimator(context, i2);
        i.d(loadAnimator2, "AnimatorInflater.loadAni…xt, animatorReverseResId)");
        return loadAnimator2;
    }

    public final int c(float f) {
        Resources resources = getResources();
        i.d(resources, "resources");
        return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
    }
}
