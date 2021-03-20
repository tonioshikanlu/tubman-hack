package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.segment.analytics.integrations.BasePayload;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "Landroidx/appcompat/widget/AppCompatButton;", "", "enabled", "Le/r;", "setEnabled", "(Z)V", "", "h", "I", "enabledColor", "i", "disabledColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, k = 1, mv = {1, 1, 15})
public final class DialogActionButton extends AppCompatButton {

    /* renamed from: h  reason: collision with root package name */
    public int f6857h;

    /* renamed from: i  reason: collision with root package name */
    public int f6858i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.f(context, BasePayload.CONTEXT_KEY);
        setClickable(true);
        setFocusable(true);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setTextColor(z ? this.f6857h : this.f6858i);
    }
}
