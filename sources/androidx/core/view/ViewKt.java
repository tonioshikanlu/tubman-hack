package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import e.o;
import e.r;
import e.x.b.a;
import e.x.b.l;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\u001a*\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0006\u0010\u0005\u001a*\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\n\u0010\u0005\u001a*\u0010\u000b\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u000b\u0010\u0005\u001a<\u0010\u0011\u001a\u00020\u0002*\u00020\u00002\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\f2\b\b\u0003\u0010\u0010\u001a\u00020\fH\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a<\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\b\b\u0003\u0010\u0013\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\f2\b\b\u0003\u0010\u0014\u001a\u00020\f2\b\b\u0003\u0010\u0010\u001a\u00020\fH\b¢\u0006\u0004\b\u0015\u0010\u0012\u001a\u001e\u0010\u0017\u001a\u00020\u0002*\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\fH\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a,\u0010\u001d\u001a\u00020\u001c*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a,\u0010\u001f\u001a\u00020\u001c*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\b¢\u0006\u0004\b\u001f\u0010\u001e\u001a\u001b\u0010#\u001a\u00020\"*\u00020\u00002\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$\u001a(\u0010'\u001a\u00020\u0002*\u00020\u00002\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b'\u0010\u0005\u001a4\u0010'\u001a\u00020\u0002\"\n\b\u0000\u0010(\u0018\u0001*\u00020%*\u00020\u00002\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b)\u0010\u0005\"\u0018\u0010,\u001a\u00020\f*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b*\u0010+\"*\u0010/\u001a\u00020-*\u00020\u00002\u0006\u0010.\u001a\u00020-8Æ\u0002@Æ\u0002X\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102\"*\u00103\u001a\u00020-*\u00020\u00002\u0006\u0010.\u001a\u00020-8Æ\u0002@Æ\u0002X\u000e¢\u0006\f\u001a\u0004\b3\u00100\"\u0004\b4\u00102\"\u0018\u00106\u001a\u00020\f*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b5\u0010+\"\u0018\u00108\u001a\u00020\f*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b7\u0010+\"\u0018\u0010:\u001a\u00020\f*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b9\u0010+\"*\u0010;\u001a\u00020-*\u00020\u00002\u0006\u0010.\u001a\u00020-8Æ\u0002@Æ\u0002X\u000e¢\u0006\f\u001a\u0004\b;\u00100\"\u0004\b<\u00102\"\u0018\u0010>\u001a\u00020\f*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b=\u0010+\"\u0018\u0010@\u001a\u00020\f*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b?\u0010+¨\u0006A"}, d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Le/r;", "action", "doOnNextLayout", "(Landroid/view/View;Le/x/b/l;)V", "doOnLayout", "Landroidx/core/view/OneShotPreDrawListener;", "doOnPreDraw", "(Landroid/view/View;Le/x/b/l;)Landroidx/core/view/OneShotPreDrawListener;", "doOnAttach", "doOnDetach", "", "start", "top", "end", "bottom", "updatePaddingRelative", "(Landroid/view/View;IIII)V", "left", "right", "updatePadding", "size", "setPadding", "(Landroid/view/View;I)V", "", "delayInMillis", "Lkotlin/Function0;", "Ljava/lang/Runnable;", "postDelayed", "(Landroid/view/View;JLe/x/b/a;)Ljava/lang/Runnable;", "postOnAnimationDelayed", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "drawToBitmap", "(Landroid/view/View;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "Landroid/view/ViewGroup$LayoutParams;", "block", "updateLayoutParams", "T", "updateLayoutParamsTyped", "getMarginRight", "(Landroid/view/View;)I", "marginRight", "", "value", "isInvisible", "(Landroid/view/View;)Z", "setInvisible", "(Landroid/view/View;Z)V", "isGone", "setGone", "getMarginBottom", "marginBottom", "getMarginStart", "marginStart", "getMarginEnd", "marginEnd", "isVisible", "setVisible", "getMarginLeft", "marginLeft", "getMarginTop", "marginTop", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class ViewKt {
    public static final void doOnAttach(View view, l<? super View, r> lVar) {
        i.f(view, "$this$doOnAttach");
        i.f(lVar, "action");
        if (ViewCompat.isAttachedToWindow(view)) {
            lVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new ViewKt$doOnAttach$1(view, lVar));
        }
    }

    public static final void doOnDetach(View view, l<? super View, r> lVar) {
        i.f(view, "$this$doOnDetach");
        i.f(lVar, "action");
        if (!ViewCompat.isAttachedToWindow(view)) {
            lVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new ViewKt$doOnDetach$1(view, lVar));
        }
    }

    public static final void doOnLayout(View view, l<? super View, r> lVar) {
        i.f(view, "$this$doOnLayout");
        i.f(lVar, "action");
        if (!ViewCompat.isLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new ViewKt$doOnLayout$$inlined$doOnNextLayout$1(lVar));
        } else {
            lVar.invoke(view);
        }
    }

    public static final void doOnNextLayout(View view, l<? super View, r> lVar) {
        i.f(view, "$this$doOnNextLayout");
        i.f(lVar, "action");
        view.addOnLayoutChangeListener(new ViewKt$doOnNextLayout$1(lVar));
    }

    public static final OneShotPreDrawListener doOnPreDraw(View view, l<? super View, r> lVar) {
        i.f(view, "$this$doOnPreDraw");
        i.f(lVar, "action");
        OneShotPreDrawListener add = OneShotPreDrawListener.add(view, new ViewKt$doOnPreDraw$1(view, lVar));
        i.b(add, "OneShotPreDrawListener.add(this) { action(this) }");
        return add;
    }

    public static final Bitmap drawToBitmap(View view, Bitmap.Config config) {
        i.f(view, "$this$drawToBitmap");
        i.f(config, "config");
        if (ViewCompat.isLaidOut(view)) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
            i.b(createBitmap, "Bitmap.createBitmap(width, height, config)");
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-((float) view.getScrollX()), -((float) view.getScrollY()));
            view.draw(canvas);
            return createBitmap;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }

    public static /* synthetic */ Bitmap drawToBitmap$default(View view, Bitmap.Config config, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return drawToBitmap(view, config);
    }

    public static final int getMarginBottom(View view) {
        i.f(view, "$this$marginBottom");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int getMarginEnd(View view) {
        i.f(view, "$this$marginEnd");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int getMarginLeft(View view) {
        i.f(view, "$this$marginLeft");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int getMarginRight(View view) {
        i.f(view, "$this$marginRight");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int getMarginStart(View view) {
        i.f(view, "$this$marginStart");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int getMarginTop(View view) {
        i.f(view, "$this$marginTop");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean isGone(View view) {
        i.f(view, "$this$isGone");
        return view.getVisibility() == 8;
    }

    public static final boolean isInvisible(View view) {
        i.f(view, "$this$isInvisible");
        return view.getVisibility() == 4;
    }

    public static final boolean isVisible(View view) {
        i.f(view, "$this$isVisible");
        return view.getVisibility() == 0;
    }

    public static final Runnable postDelayed(View view, long j2, a<r> aVar) {
        i.f(view, "$this$postDelayed");
        i.f(aVar, "action");
        ViewKt$postDelayed$runnable$1 viewKt$postDelayed$runnable$1 = new ViewKt$postDelayed$runnable$1(aVar);
        view.postDelayed(viewKt$postDelayed$runnable$1, j2);
        return viewKt$postDelayed$runnable$1;
    }

    @RequiresApi(16)
    public static final Runnable postOnAnimationDelayed(View view, long j2, a<r> aVar) {
        i.f(view, "$this$postOnAnimationDelayed");
        i.f(aVar, "action");
        ViewKt$postOnAnimationDelayed$runnable$1 viewKt$postOnAnimationDelayed$runnable$1 = new ViewKt$postOnAnimationDelayed$runnable$1(aVar);
        view.postOnAnimationDelayed(viewKt$postOnAnimationDelayed$runnable$1, j2);
        return viewKt$postOnAnimationDelayed$runnable$1;
    }

    public static final void setGone(View view, boolean z) {
        i.f(view, "$this$isGone");
        view.setVisibility(z ? 8 : 0);
    }

    public static final void setInvisible(View view, boolean z) {
        i.f(view, "$this$isInvisible");
        view.setVisibility(z ? 4 : 0);
    }

    public static final void setPadding(View view, @Px int i2) {
        i.f(view, "$this$setPadding");
        view.setPadding(i2, i2, i2, i2);
    }

    public static final void setVisible(View view, boolean z) {
        i.f(view, "$this$isVisible");
        view.setVisibility(z ? 0 : 8);
    }

    public static final void updateLayoutParams(View view, l<? super ViewGroup.LayoutParams, r> lVar) {
        i.f(view, "$this$updateLayoutParams");
        i.f(lVar, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            lVar.invoke(layoutParams);
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new o("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void updateLayoutParamsTyped(View view, l<? super T, r> lVar) {
        i.f(view, "$this$updateLayoutParams");
        i.f(lVar, "block");
        view.getLayoutParams();
        i.i();
        throw null;
    }

    public static final void updatePadding(View view, @Px int i2, @Px int i3, @Px int i4, @Px int i5) {
        i.f(view, "$this$updatePadding");
        view.setPadding(i2, i3, i4, i5);
    }

    public static /* synthetic */ void updatePadding$default(View view, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = view.getPaddingLeft();
        }
        if ((i6 & 2) != 0) {
            i3 = view.getPaddingTop();
        }
        if ((i6 & 4) != 0) {
            i4 = view.getPaddingRight();
        }
        if ((i6 & 8) != 0) {
            i5 = view.getPaddingBottom();
        }
        i.f(view, "$this$updatePadding");
        view.setPadding(i2, i3, i4, i5);
    }

    @RequiresApi(17)
    public static final void updatePaddingRelative(View view, @Px int i2, @Px int i3, @Px int i4, @Px int i5) {
        i.f(view, "$this$updatePaddingRelative");
        view.setPaddingRelative(i2, i3, i4, i5);
    }

    public static /* synthetic */ void updatePaddingRelative$default(View view, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = view.getPaddingStart();
        }
        if ((i6 & 2) != 0) {
            i3 = view.getPaddingTop();
        }
        if ((i6 & 4) != 0) {
            i4 = view.getPaddingEnd();
        }
        if ((i6 & 8) != 0) {
            i5 = view.getPaddingBottom();
        }
        i.f(view, "$this$updatePaddingRelative");
        view.setPaddingRelative(i2, i3, i4, i5);
    }
}
