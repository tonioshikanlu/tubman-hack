package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import b.e.a.a.a;
import e.b0.h;
import e.r;
import e.x.b.l;
import e.x.b.p;
import e.x.c.i;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0004\b\r\u0010\f\u001a\u0014\u0010\u000e\u001a\u00020\u0007*\u00020\u0000H\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0007*\u00020\u0000H\b¢\u0006\u0004\b\u0010\u0010\u000f\u001a(\u0010\u0013\u001a\u00020\n*\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0011H\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a.\u0010\u0016\u001a\u00020\n*\u00020\u00002\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0015H\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018*\u00020\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001e\u0010\u001d\u001a\u00020\n*\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u0001H\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a<\u0010#\u001a\u00020\n*\u00020\u001b2\b\b\u0003\u0010\u001f\u001a\u00020\u00012\b\b\u0003\u0010 \u001a\u00020\u00012\b\b\u0003\u0010!\u001a\u00020\u00012\b\b\u0003\u0010\"\u001a\u00020\u0001H\b¢\u0006\u0004\b#\u0010$\u001a<\u0010'\u001a\u00020\n*\u00020\u001b2\b\b\u0003\u0010%\u001a\u00020\u00012\b\b\u0003\u0010 \u001a\u00020\u00012\b\b\u0003\u0010&\u001a\u00020\u00012\b\b\u0003\u0010\"\u001a\u00020\u0001H\b¢\u0006\u0004\b'\u0010$\"\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030(*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u0018\u0010\u001c\u001a\u00020\u0001*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Landroid/view/ViewGroup;", "", "index", "Landroid/view/View;", "get", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "view", "", "contains", "(Landroid/view/ViewGroup;Landroid/view/View;)Z", "Le/r;", "plusAssign", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "minusAssign", "isEmpty", "(Landroid/view/ViewGroup;)Z", "isNotEmpty", "Lkotlin/Function1;", "action", "forEach", "(Landroid/view/ViewGroup;Le/x/b/l;)V", "Lkotlin/Function2;", "forEachIndexed", "(Landroid/view/ViewGroup;Le/x/b/p;)V", "", "iterator", "(Landroid/view/ViewGroup;)Ljava/util/Iterator;", "Landroid/view/ViewGroup$MarginLayoutParams;", "size", "setMargins", "(Landroid/view/ViewGroup$MarginLayoutParams;I)V", "left", "top", "right", "bottom", "updateMargins", "(Landroid/view/ViewGroup$MarginLayoutParams;IIII)V", "start", "end", "updateMarginsRelative", "Le/b0/h;", "getChildren", "(Landroid/view/ViewGroup;)Le/b0/h;", "children", "getSize", "(Landroid/view/ViewGroup;)I", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class ViewGroupKt {
    public static final boolean contains(ViewGroup viewGroup, View view) {
        i.f(viewGroup, "$this$contains");
        i.f(view, "view");
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void forEach(ViewGroup viewGroup, l<? super View, r> lVar) {
        i.f(viewGroup, "$this$forEach");
        i.f(lVar, "action");
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            i.b(childAt, "getChildAt(index)");
            lVar.invoke(childAt);
        }
    }

    public static final void forEachIndexed(ViewGroup viewGroup, p<? super Integer, ? super View, r> pVar) {
        i.f(viewGroup, "$this$forEachIndexed");
        i.f(pVar, "action");
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            Integer valueOf = Integer.valueOf(i2);
            View childAt = viewGroup.getChildAt(i2);
            i.b(childAt, "getChildAt(index)");
            pVar.invoke(valueOf, childAt);
        }
    }

    public static final View get(ViewGroup viewGroup, int i2) {
        i.f(viewGroup, "$this$get");
        View childAt = viewGroup.getChildAt(i2);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder z = a.z("Index: ", i2, ", Size: ");
        z.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(z.toString());
    }

    public static final h<View> getChildren(ViewGroup viewGroup) {
        i.f(viewGroup, "$this$children");
        return new ViewGroupKt$children$1(viewGroup);
    }

    public static final int getSize(ViewGroup viewGroup) {
        i.f(viewGroup, "$this$size");
        return viewGroup.getChildCount();
    }

    public static final boolean isEmpty(ViewGroup viewGroup) {
        i.f(viewGroup, "$this$isEmpty");
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean isNotEmpty(ViewGroup viewGroup) {
        i.f(viewGroup, "$this$isNotEmpty");
        return viewGroup.getChildCount() != 0;
    }

    public static final Iterator<View> iterator(ViewGroup viewGroup) {
        i.f(viewGroup, "$this$iterator");
        return new ViewGroupKt$iterator$1(viewGroup);
    }

    public static final void minusAssign(ViewGroup viewGroup, View view) {
        i.f(viewGroup, "$this$minusAssign");
        i.f(view, "view");
        viewGroup.removeView(view);
    }

    public static final void plusAssign(ViewGroup viewGroup, View view) {
        i.f(viewGroup, "$this$plusAssign");
        i.f(view, "view");
        viewGroup.addView(view);
    }

    public static final void setMargins(ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i2) {
        i.f(marginLayoutParams, "$this$setMargins");
        marginLayoutParams.setMargins(i2, i2, i2, i2);
    }

    public static final void updateMargins(ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i2, @Px int i3, @Px int i4, @Px int i5) {
        i.f(marginLayoutParams, "$this$updateMargins");
        marginLayoutParams.setMargins(i2, i3, i4, i5);
    }

    public static /* synthetic */ void updateMargins$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = marginLayoutParams.leftMargin;
        }
        if ((i6 & 2) != 0) {
            i3 = marginLayoutParams.topMargin;
        }
        if ((i6 & 4) != 0) {
            i4 = marginLayoutParams.rightMargin;
        }
        if ((i6 & 8) != 0) {
            i5 = marginLayoutParams.bottomMargin;
        }
        i.f(marginLayoutParams, "$this$updateMargins");
        marginLayoutParams.setMargins(i2, i3, i4, i5);
    }

    @RequiresApi(17)
    public static final void updateMarginsRelative(ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i2, @Px int i3, @Px int i4, @Px int i5) {
        i.f(marginLayoutParams, "$this$updateMarginsRelative");
        marginLayoutParams.setMarginStart(i2);
        marginLayoutParams.topMargin = i3;
        marginLayoutParams.setMarginEnd(i4);
        marginLayoutParams.bottomMargin = i5;
    }

    public static /* synthetic */ void updateMarginsRelative$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = marginLayoutParams.getMarginStart();
        }
        if ((i6 & 2) != 0) {
            i3 = marginLayoutParams.topMargin;
        }
        if ((i6 & 4) != 0) {
            i4 = marginLayoutParams.getMarginEnd();
        }
        if ((i6 & 8) != 0) {
            i5 = marginLayoutParams.bottomMargin;
        }
        i.f(marginLayoutParams, "$this$updateMarginsRelative");
        marginLayoutParams.setMarginStart(i2);
        marginLayoutParams.topMargin = i3;
        marginLayoutParams.setMarginEnd(i4);
        marginLayoutParams.bottomMargin = i5;
    }
}
