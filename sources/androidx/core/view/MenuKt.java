package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import e.b0.h;
import e.r;
import e.x.b.l;
import e.x.b.p;
import e.x.c.i;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\r\u001a\u00020\u0007*\u00020\u0000H\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0007*\u00020\u0000H\b¢\u0006\u0004\b\u000f\u0010\u000e\u001a(\u0010\u0012\u001a\u00020\n*\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0010H\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a.\u0010\u0015\u001a\u00020\n*\u00020\u00002\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0014H\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017*\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0018\u0010\u001c\u001a\u00020\u0001*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001d*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroid/view/Menu;", "", "index", "Landroid/view/MenuItem;", "get", "(Landroid/view/Menu;I)Landroid/view/MenuItem;", "item", "", "contains", "(Landroid/view/Menu;Landroid/view/MenuItem;)Z", "Le/r;", "minusAssign", "(Landroid/view/Menu;Landroid/view/MenuItem;)V", "isEmpty", "(Landroid/view/Menu;)Z", "isNotEmpty", "Lkotlin/Function1;", "action", "forEach", "(Landroid/view/Menu;Le/x/b/l;)V", "Lkotlin/Function2;", "forEachIndexed", "(Landroid/view/Menu;Le/x/b/p;)V", "", "iterator", "(Landroid/view/Menu;)Ljava/util/Iterator;", "getSize", "(Landroid/view/Menu;)I", "size", "Le/b0/h;", "getChildren", "(Landroid/view/Menu;)Le/b0/h;", "children", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class MenuKt {
    public static final boolean contains(Menu menu, MenuItem menuItem) {
        i.f(menu, "$this$contains");
        i.f(menuItem, "item");
        int size = menu.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i.a(menu.getItem(i2), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(Menu menu, l<? super MenuItem, r> lVar) {
        i.f(menu, "$this$forEach");
        i.f(lVar, "action");
        int size = menu.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = menu.getItem(i2);
            i.b(item, "getItem(index)");
            lVar.invoke(item);
        }
    }

    public static final void forEachIndexed(Menu menu, p<? super Integer, ? super MenuItem, r> pVar) {
        i.f(menu, "$this$forEachIndexed");
        i.f(pVar, "action");
        int size = menu.size();
        for (int i2 = 0; i2 < size; i2++) {
            Integer valueOf = Integer.valueOf(i2);
            MenuItem item = menu.getItem(i2);
            i.b(item, "getItem(index)");
            pVar.invoke(valueOf, item);
        }
    }

    public static final MenuItem get(Menu menu, int i2) {
        i.f(menu, "$this$get");
        MenuItem item = menu.getItem(i2);
        i.b(item, "getItem(index)");
        return item;
    }

    public static final h<MenuItem> getChildren(Menu menu) {
        i.f(menu, "$this$children");
        return new MenuKt$children$1(menu);
    }

    public static final int getSize(Menu menu) {
        i.f(menu, "$this$size");
        return menu.size();
    }

    public static final boolean isEmpty(Menu menu) {
        i.f(menu, "$this$isEmpty");
        return menu.size() == 0;
    }

    public static final boolean isNotEmpty(Menu menu) {
        i.f(menu, "$this$isNotEmpty");
        return menu.size() != 0;
    }

    public static final Iterator<MenuItem> iterator(Menu menu) {
        i.f(menu, "$this$iterator");
        return new MenuKt$iterator$1(menu);
    }

    public static final void minusAssign(Menu menu, MenuItem menuItem) {
        i.f(menu, "$this$minusAssign");
        i.f(menuItem, "item");
        menu.removeItem(menuItem.getItemId());
    }
}
