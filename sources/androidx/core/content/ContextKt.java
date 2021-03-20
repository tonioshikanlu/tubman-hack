package androidx.core.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.StyleRes;
import e.r;
import e.x.b.l;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\"\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\b¢\u0006\u0004\b\u0003\u0010\u0004\u001aP\u0010\u0010\u001a\u00020\u000e*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a:\u0010\u0010\u001a\u00020\u000e*\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\b¢\u0006\u0004\b\u0010\u0010\u0013¨\u0006\u0014"}, d2 = {"", "T", "Landroid/content/Context;", "getSystemService", "(Landroid/content/Context;)Ljava/lang/Object;", "Landroid/util/AttributeSet;", "set", "", "attrs", "", "defStyleAttr", "defStyleRes", "Lkotlin/Function1;", "Landroid/content/res/TypedArray;", "Le/r;", "block", "withStyledAttributes", "(Landroid/content/Context;Landroid/util/AttributeSet;[IIILe/x/b/l;)V", "resourceId", "(Landroid/content/Context;I[ILe/x/b/l;)V", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class ContextKt {
    public static final /* synthetic */ <T> T getSystemService(Context context) {
        i.f(context, "$this$getSystemService");
        i.i();
        throw null;
    }

    public static final void withStyledAttributes(Context context, @StyleRes int i2, int[] iArr, l<? super TypedArray, r> lVar) {
        i.f(context, "$this$withStyledAttributes");
        i.f(iArr, "attrs");
        i.f(lVar, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, iArr);
        lVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static final void withStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, @AttrRes int i2, @StyleRes int i3, l<? super TypedArray, r> lVar) {
        i.f(context, "$this$withStyledAttributes");
        i.f(iArr, "attrs");
        i.f(lVar, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
        lVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void withStyledAttributes$default(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            attributeSet = null;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        i.f(context, "$this$withStyledAttributes");
        i.f(iArr, "attrs");
        i.f(lVar, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
        lVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
