package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.b.a.c;
import b.b.a.e.a.a;
import com.segment.analytics.integrations.BasePayload;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u00104\u001a\u000203\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0012\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0016\u0010 \u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\"\u0010*\u001a\u00020#8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00069"}, d2 = {"Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "Lb/b/a/e/a/a;", "Le/r;", "onFinishInflate", "()V", "", "b", "()Z", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "n", "I", "iconMargin", "o", "iconSize", "l", "titleMarginBottom", "k", "frameMarginVertical", "m", "frameMarginHorizontal", "Landroid/widget/TextView;", "q", "Landroid/widget/TextView;", "getTitleView$core", "()Landroid/widget/TextView;", "setTitleView$core", "(Landroid/widget/TextView;)V", "titleView", "Landroid/widget/ImageView;", "p", "Landroid/widget/ImageView;", "getIconView$core", "()Landroid/widget/ImageView;", "setIconView$core", "(Landroid/widget/ImageView;)V", "iconView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, k = 1, mv = {1, 1, 15})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DialogTitleLayout extends a {

    /* renamed from: k  reason: collision with root package name */
    public final int f6882k;

    /* renamed from: l  reason: collision with root package name */
    public final int f6883l;

    /* renamed from: m  reason: collision with root package name */
    public final int f6884m;

    /* renamed from: n  reason: collision with root package name */
    public final int f6885n;

    /* renamed from: o  reason: collision with root package name */
    public final int f6886o;

    /* renamed from: p  reason: collision with root package name */
    public ImageView f6887p;

    /* renamed from: q  reason: collision with root package name */
    public TextView f6888q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogTitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.f(context, BasePayload.CONTEXT_KEY);
        i.f(this, "$this$dimenPx");
        Context context2 = getContext();
        i.b(context2, BasePayload.CONTEXT_KEY);
        this.f6882k = context2.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_vertical);
        i.f(this, "$this$dimenPx");
        Context context3 = getContext();
        i.b(context3, BasePayload.CONTEXT_KEY);
        this.f6883l = context3.getResources().getDimensionPixelSize(R.dimen.md_dialog_title_layout_margin_bottom);
        i.f(this, "$this$dimenPx");
        Context context4 = getContext();
        i.b(context4, BasePayload.CONTEXT_KEY);
        this.f6884m = context4.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_horizontal);
        i.f(this, "$this$dimenPx");
        Context context5 = getContext();
        i.b(context5, BasePayload.CONTEXT_KEY);
        this.f6885n = context5.getResources().getDimensionPixelSize(R.dimen.md_icon_margin);
        i.f(this, "$this$dimenPx");
        Context context6 = getContext();
        i.b(context6, BasePayload.CONTEXT_KEY);
        this.f6886o = context6.getResources().getDimensionPixelSize(R.dimen.md_icon_size);
    }

    public final boolean b() {
        ImageView imageView = this.f6887p;
        if (imageView != null) {
            i.f(imageView, "$this$isNotVisible");
            if (!c.f(imageView)) {
                TextView textView = this.f6888q;
                if (textView != null) {
                    i.f(textView, "$this$isNotVisible");
                    if (!c.f(textView)) {
                        return true;
                    }
                } else {
                    i.m("titleView");
                    throw null;
                }
            }
            return false;
        }
        i.m("iconView");
        throw null;
    }

    public final ImageView getIconView$core() {
        ImageView imageView = this.f6887p;
        if (imageView != null) {
            return imageView;
        }
        i.m("iconView");
        throw null;
    }

    public final TextView getTitleView$core() {
        TextView textView = this.f6888q;
        if (textView != null) {
            return textView;
        }
        i.m("titleView");
        throw null;
    }

    public void onDraw(Canvas canvas) {
        i.f(canvas, "canvas");
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(0.0f, ((float) getMeasuredHeight()) - ((float) getDividerHeight()), (float) getMeasuredWidth(), (float) getMeasuredHeight(), a());
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.md_icon_title);
        i.b(findViewById, "findViewById(R.id.md_icon_title)");
        this.f6887p = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.md_text_title);
        i.b(findViewById2, "findViewById(R.id.md_text_title)");
        this.f6888q = (TextView) findViewById2;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        if (!b()) {
            int i10 = this.f6882k;
            int measuredHeight = getMeasuredHeight() - this.f6883l;
            int i11 = measuredHeight - ((measuredHeight - i10) / 2);
            TextView textView = this.f6888q;
            if (textView != null) {
                int measuredHeight2 = textView.getMeasuredHeight() / 2;
                int i12 = i11 - measuredHeight2;
                int i13 = measuredHeight2 + i11;
                TextView textView2 = this.f6888q;
                if (textView2 != null) {
                    i.f(textView2, "$this$additionalPaddingForFont");
                    TextPaint paint = textView2.getPaint();
                    i.b(paint, "paint");
                    Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                    float f = fontMetrics.descent - fontMetrics.ascent;
                    int measuredHeight3 = i13 + (f > ((float) textView2.getMeasuredHeight()) ? (int) (f - ((float) textView2.getMeasuredHeight())) : 0);
                    if (c.d(this)) {
                        i7 = getMeasuredWidth() - this.f6884m;
                        TextView textView3 = this.f6888q;
                        if (textView3 != null) {
                            i6 = i7 - textView3.getMeasuredWidth();
                        } else {
                            i.m("titleView");
                            throw null;
                        }
                    } else {
                        i6 = this.f6884m;
                        TextView textView4 = this.f6888q;
                        if (textView4 != null) {
                            i7 = textView4.getMeasuredWidth() + i6;
                        } else {
                            i.m("titleView");
                            throw null;
                        }
                    }
                    ImageView imageView = this.f6887p;
                    if (imageView != null) {
                        if (c.f(imageView)) {
                            ImageView imageView2 = this.f6887p;
                            if (imageView2 != null) {
                                int measuredHeight4 = imageView2.getMeasuredHeight() / 2;
                                int i14 = i11 - measuredHeight4;
                                int i15 = i11 + measuredHeight4;
                                if (c.d(this)) {
                                    ImageView imageView3 = this.f6887p;
                                    if (imageView3 != null) {
                                        i6 = i7 - imageView3.getMeasuredWidth();
                                        i9 = i6 - this.f6885n;
                                        TextView textView5 = this.f6888q;
                                        if (textView5 != null) {
                                            i8 = i9 - textView5.getMeasuredWidth();
                                        } else {
                                            i.m("titleView");
                                            throw null;
                                        }
                                    } else {
                                        i.m("iconView");
                                        throw null;
                                    }
                                } else {
                                    ImageView imageView4 = this.f6887p;
                                    if (imageView4 != null) {
                                        i7 = imageView4.getMeasuredWidth() + i6;
                                        int i16 = this.f6885n + i7;
                                        TextView textView6 = this.f6888q;
                                        if (textView6 != null) {
                                            int measuredWidth = textView6.getMeasuredWidth() + i16;
                                            i8 = i16;
                                            i9 = measuredWidth;
                                        } else {
                                            i.m("titleView");
                                            throw null;
                                        }
                                    } else {
                                        i.m("iconView");
                                        throw null;
                                    }
                                }
                                ImageView imageView5 = this.f6887p;
                                if (imageView5 != null) {
                                    imageView5.layout(i6, i14, i7, i15);
                                    i7 = i9;
                                    i6 = i8;
                                } else {
                                    i.m("iconView");
                                    throw null;
                                }
                            } else {
                                i.m("iconView");
                                throw null;
                            }
                        }
                        TextView textView7 = this.f6888q;
                        if (textView7 != null) {
                            textView7.layout(i6, i12, i7, measuredHeight3);
                        } else {
                            i.m("titleView");
                            throw null;
                        }
                    } else {
                        i.m("iconView");
                        throw null;
                    }
                } else {
                    i.m("titleView");
                    throw null;
                }
            } else {
                i.m("titleView");
                throw null;
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4 = 0;
        if (b()) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        int i5 = size - (this.f6884m * 2);
        ImageView imageView = this.f6887p;
        if (imageView != null) {
            if (c.f(imageView)) {
                ImageView imageView2 = this.f6887p;
                if (imageView2 != null) {
                    imageView2.measure(View.MeasureSpec.makeMeasureSpec(this.f6886o, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(this.f6886o, BasicMeasure.EXACTLY));
                    ImageView imageView3 = this.f6887p;
                    if (imageView3 != null) {
                        i5 -= imageView3.getMeasuredWidth() + this.f6885n;
                    } else {
                        i.m("iconView");
                        throw null;
                    }
                } else {
                    i.m("iconView");
                    throw null;
                }
            }
            TextView textView = this.f6888q;
            if (textView != null) {
                textView.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                ImageView imageView4 = this.f6887p;
                if (imageView4 != null) {
                    if (c.f(imageView4)) {
                        ImageView imageView5 = this.f6887p;
                        if (imageView5 != null) {
                            i4 = imageView5.getMeasuredHeight();
                        } else {
                            i.m("iconView");
                            throw null;
                        }
                    }
                    TextView textView2 = this.f6888q;
                    if (textView2 != null) {
                        int measuredHeight = textView2.getMeasuredHeight();
                        if (i4 < measuredHeight) {
                            i4 = measuredHeight;
                        }
                        setMeasuredDimension(size, i4 + this.f6882k + this.f6883l);
                        return;
                    }
                    i.m("titleView");
                    throw null;
                }
                i.m("iconView");
                throw null;
            }
            i.m("titleView");
            throw null;
        }
        i.m("iconView");
        throw null;
    }

    public final void setIconView$core(ImageView imageView) {
        i.f(imageView, "<set-?>");
        this.f6887p = imageView;
    }

    public final void setTitleView$core(TextView textView) {
        i.f(textView, "<set-?>");
        this.f6888q = textView;
    }
}
