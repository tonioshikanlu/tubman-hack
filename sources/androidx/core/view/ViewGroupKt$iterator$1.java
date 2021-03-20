package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/core/view/ViewGroupKt$iterator$1", "", "Landroid/view/View;", "", "hasNext", "()Z", "next", "()Landroid/view/View;", "Le/r;", "remove", "()V", "", "index", "I", "core-ktx_release"}, k = 1, mv = {1, 1, 15})
public final class ViewGroupKt$iterator$1 implements Iterator<View>, Object {
    public final /* synthetic */ ViewGroup $this_iterator;
    private int index;

    public ViewGroupKt$iterator$1(ViewGroup viewGroup) {
        this.$this_iterator = viewGroup;
    }

    public boolean hasNext() {
        return this.index < this.$this_iterator.getChildCount();
    }

    public View next() {
        ViewGroup viewGroup = this.$this_iterator;
        int i2 = this.index;
        this.index = i2 + 1;
        View childAt = viewGroup.getChildAt(i2);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    public void remove() {
        ViewGroup viewGroup = this.$this_iterator;
        int i2 = this.index - 1;
        this.index = i2;
        viewGroup.removeViewAt(i2);
    }
}
