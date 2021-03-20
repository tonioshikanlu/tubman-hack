package androidx.core.util;

import android.util.SparseBooleanArray;
import e.t.k;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/core/util/SparseBooleanArrayKt$valueIterator$1", "Le/t/k;", "", "hasNext", "()Z", "nextBoolean", "", "index", "I", "getIndex", "()I", "setIndex", "(I)V", "core-ktx_release"}, k = 1, mv = {1, 1, 15})
public final class SparseBooleanArrayKt$valueIterator$1 extends k {
    public final /* synthetic */ SparseBooleanArray $this_valueIterator;
    private int index;

    public SparseBooleanArrayKt$valueIterator$1(SparseBooleanArray sparseBooleanArray) {
        this.$this_valueIterator = sparseBooleanArray;
    }

    public final int getIndex() {
        return this.index;
    }

    public boolean hasNext() {
        return this.index < this.$this_valueIterator.size();
    }

    public boolean nextBoolean() {
        SparseBooleanArray sparseBooleanArray = this.$this_valueIterator;
        int i2 = this.index;
        this.index = i2 + 1;
        return sparseBooleanArray.valueAt(i2);
    }

    public final void setIndex(int i2) {
        this.index = i2;
    }
}
