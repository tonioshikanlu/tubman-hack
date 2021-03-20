package androidx.core.util;

import android.util.SparseArray;
import e.x.c.z.a;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00018\u00008\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"androidx/core/util/SparseArrayKt$valueIterator$1", "", "", "hasNext", "()Z", "kotlin.jvm.PlatformType", "next", "()Ljava/lang/Object;", "", "index", "I", "getIndex", "()I", "setIndex", "(I)V", "core-ktx_release"}, k = 1, mv = {1, 1, 15})
public final class SparseArrayKt$valueIterator$1 implements Iterator<T>, a {
    public final /* synthetic */ SparseArray $this_valueIterator;
    private int index;

    public SparseArrayKt$valueIterator$1(SparseArray<T> sparseArray) {
        this.$this_valueIterator = sparseArray;
    }

    public final int getIndex() {
        return this.index;
    }

    public boolean hasNext() {
        return this.index < this.$this_valueIterator.size();
    }

    public T next() {
        SparseArray sparseArray = this.$this_valueIterator;
        int i2 = this.index;
        this.index = i2 + 1;
        return sparseArray.valueAt(i2);
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i2) {
        this.index = i2;
    }
}
