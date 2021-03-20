package androidx.core.util;

import android.util.SparseBooleanArray;
import e.t.u;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/core/util/SparseBooleanArrayKt$keyIterator$1", "Le/t/u;", "", "hasNext", "()Z", "", "nextInt", "()I", "index", "I", "getIndex", "setIndex", "(I)V", "core-ktx_release"}, k = 1, mv = {1, 1, 15})
public final class SparseBooleanArrayKt$keyIterator$1 extends u {
    public final /* synthetic */ SparseBooleanArray $this_keyIterator;
    private int index;

    public SparseBooleanArrayKt$keyIterator$1(SparseBooleanArray sparseBooleanArray) {
        this.$this_keyIterator = sparseBooleanArray;
    }

    public final int getIndex() {
        return this.index;
    }

    public boolean hasNext() {
        return this.index < this.$this_keyIterator.size();
    }

    public int nextInt() {
        SparseBooleanArray sparseBooleanArray = this.$this_keyIterator;
        int i2 = this.index;
        this.index = i2 + 1;
        return sparseBooleanArray.keyAt(i2);
    }

    public final void setIndex(int i2) {
        this.index = i2;
    }
}
