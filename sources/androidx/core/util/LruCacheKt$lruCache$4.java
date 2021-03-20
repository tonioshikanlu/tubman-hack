package androidx.core.util;

import android.util.LruCache;
import e.x.b.l;
import e.x.b.p;
import e.x.b.r;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\f\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/core/util/LruCacheKt$lruCache$4", "Landroid/util/LruCache;", "key", "value", "", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "create", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "evicted", "oldValue", "newValue", "Le/r;", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "core-ktx_release"}, k = 1, mv = {1, 1, 15})
public final class LruCacheKt$lruCache$4 extends LruCache<K, V> {
    public final /* synthetic */ l $create;
    public final /* synthetic */ int $maxSize;
    public final /* synthetic */ r $onEntryRemoved;
    public final /* synthetic */ p $sizeOf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LruCacheKt$lruCache$4(p pVar, l lVar, r rVar, int i2, int i3) {
        super(i3);
        this.$sizeOf = pVar;
        this.$create = lVar;
        this.$onEntryRemoved = rVar;
        this.$maxSize = i2;
    }

    public V create(K k2) {
        i.f(k2, "key");
        return this.$create.invoke(k2);
    }

    public void entryRemoved(boolean z, K k2, V v, V v2) {
        i.f(k2, "key");
        i.f(v, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z), k2, v, v2);
    }

    public int sizeOf(K k2, V v) {
        i.f(k2, "key");
        i.f(v, "value");
        return ((Number) this.$sizeOf.invoke(k2, v)).intValue();
    }
}
