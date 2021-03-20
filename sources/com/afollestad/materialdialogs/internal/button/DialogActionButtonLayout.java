package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatCheckBox;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.b.a.c;
import b.b.a.d;
import b.b.a.f.b;
import com.segment.analytics.integrations.BasePayload;
import e.o;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010<\u001a\u00020;\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b?\u0010@J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0019\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u0017R\"\u0010)\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0017R\"\u00102\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0017R(\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u00109¨\u0006A"}, d2 = {"Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "Lb/b/a/e/a/a;", "Le/r;", "onFinishInflate", "()V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "n", "I", "checkBoxPromptMarginVertical", "o", "checkBoxPromptMarginHorizontal", "", "Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "getVisibleButtons", "()[Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "visibleButtons", "m", "buttonFrameSpecHeight", "Landroidx/appcompat/widget/AppCompatCheckBox;", "r", "Landroidx/appcompat/widget/AppCompatCheckBox;", "getCheckBoxPrompt", "()Landroidx/appcompat/widget/AppCompatCheckBox;", "setCheckBoxPrompt", "(Landroidx/appcompat/widget/AppCompatCheckBox;)V", "checkBoxPrompt", "l", "buttonFramePaddingNeutral", "p", "Z", "getStackButtons$core", "()Z", "setStackButtons$core", "(Z)V", "stackButtons", "k", "buttonFramePadding", "q", "[Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "getActionButtons", "setActionButtons", "([Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;)V", "actionButtons", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, k = 1, mv = {1, 1, 15})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DialogActionButtonLayout extends b.b.a.e.a.a {

    /* renamed from: k  reason: collision with root package name */
    public final int f6859k;

    /* renamed from: l  reason: collision with root package name */
    public final int f6860l;

    /* renamed from: m  reason: collision with root package name */
    public final int f6861m;

    /* renamed from: n  reason: collision with root package name */
    public final int f6862n;

    /* renamed from: o  reason: collision with root package name */
    public final int f6863o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6864p;

    /* renamed from: q  reason: collision with root package name */
    public DialogActionButton[] f6865q;
    public AppCompatCheckBox r;

    public static final class a implements View.OnClickListener {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ DialogActionButtonLayout f6866h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ d f6867i;

        public a(DialogActionButtonLayout dialogActionButtonLayout, d dVar) {
            this.f6866h = dialogActionButtonLayout;
            this.f6867i = dVar;
        }

        public final void onClick(View view) {
            this.f6866h.getDialog();
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogActionButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.f(context, BasePayload.CONTEXT_KEY);
        b bVar = b.a;
        this.f6859k = bVar.a(this, R.dimen.md_action_button_frame_padding) - bVar.a(this, R.dimen.md_action_button_inset_horizontal);
        this.f6860l = bVar.a(this, R.dimen.md_action_button_frame_padding_neutral);
        this.f6861m = bVar.a(this, R.dimen.md_action_button_frame_spec_height);
        this.f6862n = bVar.a(this, R.dimen.md_checkbox_prompt_margin_vertical);
        this.f6863o = bVar.a(this, R.dimen.md_checkbox_prompt_margin_horizontal);
    }

    public final DialogActionButton[] getActionButtons() {
        DialogActionButton[] dialogActionButtonArr = this.f6865q;
        if (dialogActionButtonArr != null) {
            return dialogActionButtonArr;
        }
        i.m("actionButtons");
        throw null;
    }

    public final AppCompatCheckBox getCheckBoxPrompt() {
        AppCompatCheckBox appCompatCheckBox = this.r;
        if (appCompatCheckBox != null) {
            return appCompatCheckBox;
        }
        i.m("checkBoxPrompt");
        throw null;
    }

    public final boolean getStackButtons$core() {
        return this.f6864p;
    }

    public final DialogActionButton[] getVisibleButtons() {
        DialogActionButton[] dialogActionButtonArr = this.f6865q;
        if (dialogActionButtonArr != null) {
            ArrayList arrayList = new ArrayList();
            for (DialogActionButton dialogActionButton : dialogActionButtonArr) {
                if (c.f(dialogActionButton)) {
                    arrayList.add(dialogActionButton);
                }
            }
            Object[] array = arrayList.toArray(new DialogActionButton[0]);
            if (array != null) {
                return (DialogActionButton[]) array;
            }
            throw new o("null cannot be cast to non-null type kotlin.Array<T>");
        }
        i.m("actionButtons");
        throw null;
    }

    public void onDraw(Canvas canvas) {
        i.f(canvas, "canvas");
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getDividerHeight(), a());
        }
    }

    public void onFinishInflate() {
        d dVar;
        super.onFinishInflate();
        View findViewById = findViewById(R.id.md_button_positive);
        i.b(findViewById, "findViewById(R.id.md_button_positive)");
        View findViewById2 = findViewById(R.id.md_button_negative);
        i.b(findViewById2, "findViewById(R.id.md_button_negative)");
        View findViewById3 = findViewById(R.id.md_button_neutral);
        i.b(findViewById3, "findViewById(R.id.md_button_neutral)");
        this.f6865q = new DialogActionButton[]{(DialogActionButton) findViewById, (DialogActionButton) findViewById2, (DialogActionButton) findViewById3};
        View findViewById4 = findViewById(R.id.md_checkbox_prompt);
        i.b(findViewById4, "findViewById(R.id.md_checkbox_prompt)");
        this.r = (AppCompatCheckBox) findViewById4;
        DialogActionButton[] dialogActionButtonArr = this.f6865q;
        if (dialogActionButtonArr != null) {
            int length = dialogActionButtonArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                DialogActionButton dialogActionButton = dialogActionButtonArr[i2];
                if (i2 == 0) {
                    dVar = d.POSITIVE;
                } else if (i2 == 1) {
                    dVar = d.NEGATIVE;
                } else if (i2 == 2) {
                    dVar = d.NEUTRAL;
                } else {
                    throw new IndexOutOfBoundsException(i2 + " is not an action button index.");
                }
                dialogActionButton.setOnClickListener(new a(this, dVar));
            }
            return;
        }
        i.m("actionButtons");
        throw null;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        List<DialogActionButton> list;
        int i6;
        int i7;
        int i8;
        AppCompatCheckBox appCompatCheckBox;
        if (c.g(this)) {
            AppCompatCheckBox appCompatCheckBox2 = this.r;
            if (appCompatCheckBox2 != null) {
                if (c.f(appCompatCheckBox2)) {
                    if (c.d(this)) {
                        i8 = getMeasuredWidth() - this.f6863o;
                        i7 = this.f6862n;
                        AppCompatCheckBox appCompatCheckBox3 = this.r;
                        if (appCompatCheckBox3 != null) {
                            i6 = i8 - appCompatCheckBox3.getMeasuredWidth();
                            appCompatCheckBox = this.r;
                            if (appCompatCheckBox == null) {
                                i.m("checkBoxPrompt");
                                throw null;
                            }
                        } else {
                            i.m("checkBoxPrompt");
                            throw null;
                        }
                    } else {
                        i6 = this.f6863o;
                        i7 = this.f6862n;
                        AppCompatCheckBox appCompatCheckBox4 = this.r;
                        if (appCompatCheckBox4 != null) {
                            i8 = appCompatCheckBox4.getMeasuredWidth() + i6;
                            appCompatCheckBox = this.r;
                            if (appCompatCheckBox == null) {
                                i.m("checkBoxPrompt");
                                throw null;
                            }
                        } else {
                            i.m("checkBoxPrompt");
                            throw null;
                        }
                    }
                    int measuredHeight = appCompatCheckBox.getMeasuredHeight() + i7;
                    AppCompatCheckBox appCompatCheckBox5 = this.r;
                    if (appCompatCheckBox5 != null) {
                        appCompatCheckBox5.layout(i6, i7, i8, measuredHeight);
                    } else {
                        i.m("checkBoxPrompt");
                        throw null;
                    }
                }
                boolean z2 = true;
                if (this.f6864p) {
                    int i9 = this.f6859k;
                    int measuredWidth = getMeasuredWidth() - this.f6859k;
                    int measuredHeight2 = getMeasuredHeight();
                    DialogActionButton[] visibleButtons = getVisibleButtons();
                    i.e(visibleButtons, "$this$reversed");
                    if (visibleButtons.length != 0) {
                        z2 = false;
                    }
                    if (z2) {
                        list = e.t.o.f7934h;
                    } else {
                        list = b.q.a.a.h3(visibleButtons);
                        i.e(list, "$this$reverse");
                        Collections.reverse(list);
                    }
                    for (DialogActionButton layout : list) {
                        int i10 = measuredHeight2 - this.f6861m;
                        layout.layout(i9, i10, measuredWidth, measuredHeight2);
                        measuredHeight2 = i10;
                    }
                    return;
                }
                int measuredHeight3 = getMeasuredHeight() - this.f6861m;
                int measuredHeight4 = getMeasuredHeight();
                if (c.d(this)) {
                    DialogActionButton[] dialogActionButtonArr = this.f6865q;
                    if (dialogActionButtonArr != null) {
                        if (c.f(dialogActionButtonArr[2])) {
                            DialogActionButton[] dialogActionButtonArr2 = this.f6865q;
                            if (dialogActionButtonArr2 != null) {
                                DialogActionButton dialogActionButton = dialogActionButtonArr2[2];
                                int measuredWidth2 = getMeasuredWidth() - this.f6860l;
                                dialogActionButton.layout(measuredWidth2 - dialogActionButton.getMeasuredWidth(), measuredHeight3, measuredWidth2, measuredHeight4);
                            } else {
                                i.m("actionButtons");
                                throw null;
                            }
                        }
                        int i11 = this.f6859k;
                        DialogActionButton[] dialogActionButtonArr3 = this.f6865q;
                        if (dialogActionButtonArr3 != null) {
                            if (c.f(dialogActionButtonArr3[0])) {
                                DialogActionButton[] dialogActionButtonArr4 = this.f6865q;
                                if (dialogActionButtonArr4 != null) {
                                    DialogActionButton dialogActionButton2 = dialogActionButtonArr4[0];
                                    int measuredWidth3 = dialogActionButton2.getMeasuredWidth() + i11;
                                    dialogActionButton2.layout(i11, measuredHeight3, measuredWidth3, measuredHeight4);
                                    i11 = measuredWidth3;
                                } else {
                                    i.m("actionButtons");
                                    throw null;
                                }
                            }
                            DialogActionButton[] dialogActionButtonArr5 = this.f6865q;
                            if (dialogActionButtonArr5 == null) {
                                i.m("actionButtons");
                                throw null;
                            } else if (c.f(dialogActionButtonArr5[1])) {
                                DialogActionButton[] dialogActionButtonArr6 = this.f6865q;
                                if (dialogActionButtonArr6 != null) {
                                    DialogActionButton dialogActionButton3 = dialogActionButtonArr6[1];
                                    dialogActionButton3.layout(i11, measuredHeight3, dialogActionButton3.getMeasuredWidth() + i11, measuredHeight4);
                                    return;
                                }
                                i.m("actionButtons");
                                throw null;
                            }
                        } else {
                            i.m("actionButtons");
                            throw null;
                        }
                    } else {
                        i.m("actionButtons");
                        throw null;
                    }
                } else {
                    DialogActionButton[] dialogActionButtonArr7 = this.f6865q;
                    if (dialogActionButtonArr7 != null) {
                        if (c.f(dialogActionButtonArr7[2])) {
                            DialogActionButton[] dialogActionButtonArr8 = this.f6865q;
                            if (dialogActionButtonArr8 != null) {
                                DialogActionButton dialogActionButton4 = dialogActionButtonArr8[2];
                                int i12 = this.f6860l;
                                dialogActionButton4.layout(i12, measuredHeight3, dialogActionButton4.getMeasuredWidth() + i12, measuredHeight4);
                            } else {
                                i.m("actionButtons");
                                throw null;
                            }
                        }
                        int measuredWidth4 = getMeasuredWidth() - this.f6859k;
                        DialogActionButton[] dialogActionButtonArr9 = this.f6865q;
                        if (dialogActionButtonArr9 != null) {
                            if (c.f(dialogActionButtonArr9[0])) {
                                DialogActionButton[] dialogActionButtonArr10 = this.f6865q;
                                if (dialogActionButtonArr10 != null) {
                                    DialogActionButton dialogActionButton5 = dialogActionButtonArr10[0];
                                    int measuredWidth5 = measuredWidth4 - dialogActionButton5.getMeasuredWidth();
                                    dialogActionButton5.layout(measuredWidth5, measuredHeight3, measuredWidth4, measuredHeight4);
                                    measuredWidth4 = measuredWidth5;
                                } else {
                                    i.m("actionButtons");
                                    throw null;
                                }
                            }
                            DialogActionButton[] dialogActionButtonArr11 = this.f6865q;
                            if (dialogActionButtonArr11 == null) {
                                i.m("actionButtons");
                                throw null;
                            } else if (c.f(dialogActionButtonArr11[1])) {
                                DialogActionButton[] dialogActionButtonArr12 = this.f6865q;
                                if (dialogActionButtonArr12 != null) {
                                    DialogActionButton dialogActionButton6 = dialogActionButtonArr12[1];
                                    dialogActionButton6.layout(measuredWidth4 - dialogActionButton6.getMeasuredWidth(), measuredHeight3, measuredWidth4, measuredHeight4);
                                    return;
                                }
                                i.m("actionButtons");
                                throw null;
                            }
                        } else {
                            i.m("actionButtons");
                            throw null;
                        }
                    } else {
                        i.m("actionButtons");
                        throw null;
                    }
                }
            } else {
                i.m("checkBoxPrompt");
                throw null;
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        if (!c.g(this)) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        AppCompatCheckBox appCompatCheckBox = this.r;
        if (appCompatCheckBox != null) {
            if (c.f(appCompatCheckBox)) {
                int i4 = size - (this.f6863o * 2);
                AppCompatCheckBox appCompatCheckBox2 = this.r;
                if (appCompatCheckBox2 == null) {
                    i.m("checkBoxPrompt");
                    throw null;
                }
                appCompatCheckBox2.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            getDialog();
            throw null;
        }
        i.m("checkBoxPrompt");
        throw null;
    }

    public final void setActionButtons(DialogActionButton[] dialogActionButtonArr) {
        i.f(dialogActionButtonArr, "<set-?>");
        this.f6865q = dialogActionButtonArr;
    }

    public final void setCheckBoxPrompt(AppCompatCheckBox appCompatCheckBox) {
        i.f(appCompatCheckBox, "<set-?>");
        this.r = appCompatCheckBox;
    }

    public final void setStackButtons$core(boolean z) {
        this.f6864p = z;
    }
}
