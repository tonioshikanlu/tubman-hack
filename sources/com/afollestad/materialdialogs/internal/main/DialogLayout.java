package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.b.a.a;
import b.b.a.b;
import b.b.a.c;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import com.segment.analytics.integrations.BasePayload;
import e.o;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010v\u001a\u00020u\u0012\b\u0010x\u001a\u0004\u0018\u00010w¢\u0006\u0004\by\u0010zJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0011\u0010\u000bJ\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b!\u0010 R\u001c\u0010&\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R*\u0010.\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010#R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010B\u001a\u00020A8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010)R\"\u0010T\u001a\u00020M8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001c\u0010W\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bU\u0010#\u001a\u0004\bV\u0010%R$\u0010_\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010d\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b`\u0010#\u001a\u0004\ba\u0010%\"\u0004\bb\u0010cR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR*\u0010t\u001a\u00020m2\u0006\u0010'\u001a\u00020m8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010s¨\u0006{"}, d2 = {"Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "Landroid/widget/FrameLayout;", "", "color", "", "alpha", "Landroid/graphics/Paint;", "c", "(IF)Landroid/graphics/Paint;", "Le/r;", "onFinishInflate", "()V", "", "showTop", "showBottom", "b", "(ZZ)V", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "dispatchDraw", "m", "I", "getFrameMarginVerticalLess$core", "()I", "frameMarginVerticalLess", "value", "i", "Z", "getDebugMode", "()Z", "setDebugMode", "(Z)V", "debugMode", "s", "windowHeight", "Landroid/graphics/RectF;", "u", "Landroid/graphics/RectF;", "cornerRadiusRect", "Landroid/graphics/Path;", "t", "Landroid/graphics/Path;", "cornerRadiusPath", "Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "n", "Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "getTitleLayout", "()Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "setTitleLayout", "(Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;)V", "titleLayout", "Lb/b/a/b;", "dialog", "Lb/b/a/b;", "getDialog", "()Lb/b/a/b;", "setDialog", "(Lb/b/a/b;)V", "k", "Landroid/graphics/Paint;", "debugPaint", "r", "isButtonsLayoutAChild", "Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "o", "Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "getContentLayout", "()Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "setContentLayout", "(Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;)V", "contentLayout", "l", "getFrameMarginVertical$core", "frameMarginVertical", "Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "p", "Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "getButtonsLayout", "()Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "setButtonsLayout", "(Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;)V", "buttonsLayout", "h", "getMaxHeight", "setMaxHeight", "(I)V", "maxHeight", "Lb/b/a/a;", "q", "Lb/b/a/a;", "getLayoutMode", "()Lb/b/a/a;", "setLayoutMode", "(Lb/b/a/a;)V", "layoutMode", "", "j", "[F", "getCornerRadii", "()[F", "setCornerRadii", "([F)V", "cornerRadii", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, k = 1, mv = {1, 1, 15})
public final class DialogLayout extends FrameLayout {

    /* renamed from: h  reason: collision with root package name */
    public int f6870h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6871i;

    /* renamed from: j  reason: collision with root package name */
    public float[] f6872j = new float[0];

    /* renamed from: k  reason: collision with root package name */
    public Paint f6873k;

    /* renamed from: l  reason: collision with root package name */
    public final int f6874l;

    /* renamed from: m  reason: collision with root package name */
    public final int f6875m;

    /* renamed from: n  reason: collision with root package name */
    public DialogTitleLayout f6876n;

    /* renamed from: o  reason: collision with root package name */
    public DialogContentLayout f6877o;

    /* renamed from: p  reason: collision with root package name */
    public DialogActionButtonLayout f6878p;

    /* renamed from: q  reason: collision with root package name */
    public a f6879q;
    public boolean r;
    public int s;
    public final Path t;
    public final RectF u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.f(context, BasePayload.CONTEXT_KEY);
        i.f(this, "$this$dimenPx");
        Context context2 = getContext();
        i.b(context2, BasePayload.CONTEXT_KEY);
        this.f6874l = context2.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_vertical);
        i.f(this, "$this$dimenPx");
        Context context3 = getContext();
        i.b(context3, BasePayload.CONTEXT_KEY);
        this.f6875m = context3.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_vertical_less);
        this.f6879q = a.WRAP_CONTENT;
        this.r = true;
        this.s = -1;
        this.t = new Path();
        this.u = new RectF();
    }

    public static void a(DialogLayout dialogLayout, Canvas canvas, int i2, float f, float f2, int i3) {
        if ((i3 & 2) != 0) {
            f = (float) dialogLayout.getMeasuredHeight();
        }
        float f3 = f;
        canvas.drawLine(0.0f, f3, (float) dialogLayout.getMeasuredWidth(), (i3 & 4) != 0 ? f3 : f2, dialogLayout.c(i2, 1.0f));
    }

    public static void d(DialogLayout dialogLayout, Canvas canvas, int i2, float f, float f2, int i3) {
        canvas.drawLine(f, 0.0f, (i3 & 4) != 0 ? f : f2, (float) dialogLayout.getMeasuredHeight(), dialogLayout.c(i2, 1.0f));
    }

    public final void b(boolean z, boolean z2) {
        DialogTitleLayout dialogTitleLayout = this.f6876n;
        if (dialogTitleLayout != null) {
            dialogTitleLayout.setDrawDivider(z);
            DialogActionButtonLayout dialogActionButtonLayout = this.f6878p;
            if (dialogActionButtonLayout != null) {
                dialogActionButtonLayout.setDrawDivider(z2);
                return;
            }
            return;
        }
        i.m("titleLayout");
        throw null;
    }

    public final Paint c(int i2, float f) {
        if (this.f6873k == null) {
            Paint paint = new Paint();
            paint.setStrokeWidth(c.a(this, 1));
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            this.f6873k = paint;
        }
        Paint paint2 = this.f6873k;
        if (paint2 != null) {
            paint2.setColor(i2);
            setAlpha(f);
            return paint2;
        }
        i.l();
        throw null;
    }

    public void dispatchDraw(Canvas canvas) {
        i.f(canvas, "canvas");
        if (!(this.f6872j.length == 0)) {
            canvas.clipPath(this.t);
        }
        super.dispatchDraw(canvas);
    }

    public final DialogActionButtonLayout getButtonsLayout() {
        return this.f6878p;
    }

    public final DialogContentLayout getContentLayout() {
        DialogContentLayout dialogContentLayout = this.f6877o;
        if (dialogContentLayout != null) {
            return dialogContentLayout;
        }
        i.m("contentLayout");
        throw null;
    }

    public final float[] getCornerRadii() {
        return this.f6872j;
    }

    public final boolean getDebugMode() {
        return this.f6871i;
    }

    public final b getDialog() {
        i.m("dialog");
        throw null;
    }

    public final int getFrameMarginVertical$core() {
        return this.f6874l;
    }

    public final int getFrameMarginVerticalLess$core() {
        return this.f6875m;
    }

    public final a getLayoutMode() {
        return this.f6879q;
    }

    public final int getMaxHeight() {
        return this.f6870h;
    }

    public final DialogTitleLayout getTitleLayout() {
        DialogTitleLayout dialogTitleLayout = this.f6876n;
        if (dialogTitleLayout != null) {
            return dialogTitleLayout;
        }
        i.m("titleLayout");
        throw null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object systemService = getContext().getSystemService("window");
        if (systemService != null) {
            WindowManager windowManager = (WindowManager) systemService;
            i.f(windowManager, "$this$getWidthAndHeight");
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            this.s = Integer.valueOf(point.y).intValue();
            return;
        }
        throw new o("null cannot be cast to non-null type android.view.WindowManager");
    }

    public void onDraw(Canvas canvas) {
        float f;
        int i2;
        i.f(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f6871i) {
            Canvas canvas2 = canvas;
            d(this, canvas2, -16776961, c.a(this, 24), 0.0f, 4);
            a(this, canvas2, -16776961, c.a(this, 24), 0.0f, 4);
            d(this, canvas, -16776961, ((float) getMeasuredWidth()) - c.a(this, 24), 0.0f, 4);
            DialogTitleLayout dialogTitleLayout = this.f6876n;
            if (dialogTitleLayout != null) {
                if (c.f(dialogTitleLayout)) {
                    DialogTitleLayout dialogTitleLayout2 = this.f6876n;
                    if (dialogTitleLayout2 != null) {
                        a(this, canvas, SupportMenu.CATEGORY_MASK, (float) dialogTitleLayout2.getBottom(), 0.0f, 4);
                    } else {
                        i.m("titleLayout");
                        throw null;
                    }
                }
                DialogContentLayout dialogContentLayout = this.f6877o;
                if (dialogContentLayout != null) {
                    if (c.f(dialogContentLayout)) {
                        DialogContentLayout dialogContentLayout2 = this.f6877o;
                        if (dialogContentLayout2 != null) {
                            a(this, canvas, InputDeviceCompat.SOURCE_ANY, (float) dialogContentLayout2.getTop(), 0.0f, 4);
                        } else {
                            i.m("contentLayout");
                            throw null;
                        }
                    }
                    if (c.g(this.f6878p)) {
                        int i3 = -16711681;
                        d(this, canvas, -16711681, c.d(this) ? c.a(this, 8) : ((float) getMeasuredWidth()) - c.a(this, 8), 0.0f, 4);
                        DialogActionButtonLayout dialogActionButtonLayout = this.f6878p;
                        float f2 = 0.4f;
                        int i4 = 0;
                        if (dialogActionButtonLayout == null || !dialogActionButtonLayout.getStackButtons$core()) {
                            DialogActionButtonLayout dialogActionButtonLayout2 = this.f6878p;
                            if (dialogActionButtonLayout2 != null) {
                                DialogActionButton[] visibleButtons = dialogActionButtonLayout2.getVisibleButtons();
                                int length = visibleButtons.length;
                                while (i4 < length) {
                                    DialogActionButton dialogActionButton = visibleButtons[i4];
                                    DialogActionButtonLayout dialogActionButtonLayout3 = this.f6878p;
                                    if (dialogActionButtonLayout3 != null) {
                                        float a = c.a(this, 8) + ((float) dialogActionButtonLayout3.getTop()) + ((float) dialogActionButton.getTop());
                                        DialogActionButtonLayout dialogActionButtonLayout4 = this.f6878p;
                                        if (dialogActionButtonLayout4 != null) {
                                            canvas.drawRect(c.a(this, 4) + ((float) dialogActionButton.getLeft()), a, ((float) dialogActionButton.getRight()) - c.a(this, 4), ((float) dialogActionButtonLayout4.getBottom()) - c.a(this, 8), c(-16711681, 0.4f));
                                            i4++;
                                        } else {
                                            i.l();
                                            throw null;
                                        }
                                    } else {
                                        i.l();
                                        throw null;
                                    }
                                }
                                DialogActionButtonLayout dialogActionButtonLayout5 = this.f6878p;
                                if (dialogActionButtonLayout5 != null) {
                                    a(this, canvas, -65281, (float) dialogActionButtonLayout5.getTop(), 0.0f, 4);
                                    float measuredHeight = ((float) getMeasuredHeight()) - (c.a(this, 52) - c.a(this, 8));
                                    float measuredHeight2 = ((float) getMeasuredHeight()) - c.a(this, 8);
                                    Canvas canvas3 = canvas;
                                    a(this, canvas3, SupportMenu.CATEGORY_MASK, measuredHeight, 0.0f, 4);
                                    a(this, canvas3, SupportMenu.CATEGORY_MASK, measuredHeight2, 0.0f, 4);
                                    i2 = -16776961;
                                    f = measuredHeight - c.a(this, 8);
                                } else {
                                    i.l();
                                    throw null;
                                }
                            } else {
                                return;
                            }
                        } else {
                            DialogActionButtonLayout dialogActionButtonLayout6 = this.f6878p;
                            if (dialogActionButtonLayout6 != null) {
                                float a2 = c.a(this, 8) + ((float) dialogActionButtonLayout6.getTop());
                                DialogActionButtonLayout dialogActionButtonLayout7 = this.f6878p;
                                if (dialogActionButtonLayout7 != null) {
                                    DialogActionButton[] visibleButtons2 = dialogActionButtonLayout7.getVisibleButtons();
                                    int length2 = visibleButtons2.length;
                                    float f3 = a2;
                                    while (i4 < length2) {
                                        DialogActionButton dialogActionButton2 = visibleButtons2[i4];
                                        float a3 = c.a(this, 36) + f3;
                                        canvas.drawRect((float) dialogActionButton2.getLeft(), f3, ((float) getMeasuredWidth()) - c.a(this, 8), a3, c(i3, f2));
                                        f3 = c.a(this, 16) + a3;
                                        i4++;
                                        i3 = i3;
                                        f2 = 0.4f;
                                    }
                                    DialogActionButtonLayout dialogActionButtonLayout8 = this.f6878p;
                                    if (dialogActionButtonLayout8 != null) {
                                        a(this, canvas, -16776961, (float) dialogActionButtonLayout8.getTop(), 0.0f, 4);
                                        DialogActionButtonLayout dialogActionButtonLayout9 = this.f6878p;
                                        if (dialogActionButtonLayout9 != null) {
                                            float a4 = c.a(this, 8) + ((float) dialogActionButtonLayout9.getTop());
                                            float measuredHeight3 = ((float) getMeasuredHeight()) - c.a(this, 8);
                                            i2 = -65536;
                                            a(this, canvas, SupportMenu.CATEGORY_MASK, a4, 0.0f, 4);
                                            f = measuredHeight3;
                                        } else {
                                            i.l();
                                            throw null;
                                        }
                                    } else {
                                        i.l();
                                        throw null;
                                    }
                                } else {
                                    i.l();
                                    throw null;
                                }
                            } else {
                                i.l();
                                throw null;
                            }
                        }
                        a(this, canvas, i2, f, 0.0f, 4);
                        return;
                    }
                    return;
                }
                i.m("contentLayout");
                throw null;
            }
            i.m("titleLayout");
            throw null;
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.md_title_layout);
        i.b(findViewById, "findViewById(R.id.md_title_layout)");
        this.f6876n = (DialogTitleLayout) findViewById;
        View findViewById2 = findViewById(R.id.md_content_layout);
        i.b(findViewById2, "findViewById(R.id.md_content_layout)");
        this.f6877o = (DialogContentLayout) findViewById2;
        this.f6878p = (DialogActionButtonLayout) findViewById(R.id.md_button_layout);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int measuredWidth = getMeasuredWidth();
        DialogTitleLayout dialogTitleLayout = this.f6876n;
        if (dialogTitleLayout != null) {
            int measuredHeight = dialogTitleLayout.getMeasuredHeight();
            DialogTitleLayout dialogTitleLayout2 = this.f6876n;
            if (dialogTitleLayout2 != null) {
                dialogTitleLayout2.layout(0, 0, measuredWidth, measuredHeight);
                if (this.r) {
                    int measuredHeight2 = getMeasuredHeight();
                    DialogActionButtonLayout dialogActionButtonLayout = this.f6878p;
                    i6 = measuredHeight2 - (dialogActionButtonLayout != null ? dialogActionButtonLayout.getMeasuredHeight() : 0);
                    if (c.g(this.f6878p)) {
                        int measuredWidth2 = getMeasuredWidth();
                        int measuredHeight3 = getMeasuredHeight();
                        DialogActionButtonLayout dialogActionButtonLayout2 = this.f6878p;
                        if (dialogActionButtonLayout2 != null) {
                            dialogActionButtonLayout2.layout(0, i6, measuredWidth2, measuredHeight3);
                        } else {
                            i.l();
                            throw null;
                        }
                    }
                } else {
                    i6 = getMeasuredHeight();
                }
                int measuredWidth3 = getMeasuredWidth();
                DialogContentLayout dialogContentLayout = this.f6877o;
                if (dialogContentLayout != null) {
                    dialogContentLayout.layout(0, measuredHeight, measuredWidth3, i6);
                } else {
                    i.m("contentLayout");
                    throw null;
                }
            } else {
                i.m("titleLayout");
                throw null;
            }
        } else {
            i.m("titleLayout");
            throw null;
        }
    }

    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int i4 = this.f6870h;
        if (1 <= i4 && size2 > i4) {
            size2 = i4;
        }
        DialogTitleLayout dialogTitleLayout = this.f6876n;
        if (dialogTitleLayout != null) {
            boolean z = false;
            dialogTitleLayout.measure(View.MeasureSpec.makeMeasureSpec(size, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (c.g(this.f6878p)) {
                DialogActionButtonLayout dialogActionButtonLayout = this.f6878p;
                if (dialogActionButtonLayout != null) {
                    dialogActionButtonLayout.measure(View.MeasureSpec.makeMeasureSpec(size, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(0, 0));
                } else {
                    i.l();
                    throw null;
                }
            }
            DialogTitleLayout dialogTitleLayout2 = this.f6876n;
            if (dialogTitleLayout2 != null) {
                int measuredHeight = dialogTitleLayout2.getMeasuredHeight();
                DialogActionButtonLayout dialogActionButtonLayout2 = this.f6878p;
                int measuredHeight2 = size2 - (measuredHeight + (dialogActionButtonLayout2 != null ? dialogActionButtonLayout2.getMeasuredHeight() : 0));
                DialogContentLayout dialogContentLayout = this.f6877o;
                if (dialogContentLayout != null) {
                    dialogContentLayout.measure(View.MeasureSpec.makeMeasureSpec(size, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(measuredHeight2, Integer.MIN_VALUE));
                    if (this.f6879q == a.WRAP_CONTENT) {
                        DialogTitleLayout dialogTitleLayout3 = this.f6876n;
                        if (dialogTitleLayout3 != null) {
                            int measuredHeight3 = dialogTitleLayout3.getMeasuredHeight();
                            DialogContentLayout dialogContentLayout2 = this.f6877o;
                            if (dialogContentLayout2 != null) {
                                int measuredHeight4 = dialogContentLayout2.getMeasuredHeight() + measuredHeight3;
                                DialogActionButtonLayout dialogActionButtonLayout3 = this.f6878p;
                                setMeasuredDimension(size, measuredHeight4 + (dialogActionButtonLayout3 != null ? dialogActionButtonLayout3.getMeasuredHeight() : 0));
                            } else {
                                i.m("contentLayout");
                                throw null;
                            }
                        } else {
                            i.m("titleLayout");
                            throw null;
                        }
                    } else {
                        setMeasuredDimension(size, this.s);
                    }
                    if (this.f6872j.length == 0) {
                        z = true;
                    }
                    if (!z) {
                        RectF rectF = this.u;
                        rectF.left = 0.0f;
                        rectF.top = 0.0f;
                        rectF.right = (float) getMeasuredWidth();
                        rectF.bottom = (float) getMeasuredHeight();
                        this.t.addRoundRect(this.u, this.f6872j, Path.Direction.CW);
                        return;
                    }
                    return;
                }
                i.m("contentLayout");
                throw null;
            }
            i.m("titleLayout");
            throw null;
        }
        i.m("titleLayout");
        throw null;
    }

    public final void setButtonsLayout(DialogActionButtonLayout dialogActionButtonLayout) {
        this.f6878p = dialogActionButtonLayout;
    }

    public final void setContentLayout(DialogContentLayout dialogContentLayout) {
        i.f(dialogContentLayout, "<set-?>");
        this.f6877o = dialogContentLayout;
    }

    public final void setCornerRadii(float[] fArr) {
        i.f(fArr, "value");
        this.f6872j = fArr;
        if (!this.t.isEmpty()) {
            this.t.reset();
        }
        invalidate();
    }

    public final void setDebugMode(boolean z) {
        this.f6871i = z;
        setWillNotDraw(!z);
    }

    public final void setDialog(b bVar) {
        i.f(bVar, "<set-?>");
    }

    public final void setLayoutMode(a aVar) {
        i.f(aVar, "<set-?>");
        this.f6879q = aVar;
    }

    public final void setMaxHeight(int i2) {
        this.f6870h = i2;
    }

    public final void setTitleLayout(DialogTitleLayout dialogTitleLayout) {
        i.f(dialogTitleLayout, "<set-?>");
        this.f6876n = dialogTitleLayout;
    }
}
