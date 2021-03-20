package androidx.core.util;

import android.util.LruCache;
import e.x.b.l;
import e.x.b.p;
import e.x.b.r;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u001a\b\u0006\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00052\u0016\b\u0006\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00072(\b\u0006\u0010\f\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00020\u000b0\tH\b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "K", "V", "", "maxSize", "Lkotlin/Function2;", "sizeOf", "Lkotlin/Function1;", "create", "Lkotlin/Function4;", "", "Le/r;", "onEntryRemoved", "Landroid/util/LruCache;", "lruCache", "(ILe/x/b/p;Le/x/b/l;Le/x/b/r;)Landroid/util/LruCache;", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class LruCacheKt {
    public static final <K, V> LruCache<K, V> lruCache(int i2, p<? super K, ? super V, Integer> pVar, l<? super K, ? extends V> lVar, r<? super Boolean, ? super K, ? super V, ? super V, e.r> rVar) {
        i.f(pVar, "sizeOf");
        i.f(lVar, "create");
        i.f(rVar, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(pVar, lVar, rVar, i2, i2);
    }

    public static /* synthetic */ LruCache lruCache$default(int i2, p pVar, l lVar, r rVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            pVar = LruCacheKt$lruCache$1.INSTANCE;
        }
        p pVar2 = pVar;
        if ((i3 & 4) != 0) {
            lVar = LruCacheKt$lruCache$2.INSTANCE;
        }
        l lVar2 = lVar;
        if ((i3 & 8) != 0) {
            rVar = LruCacheKt$lruCache$3.INSTANCE;
        }
        r rVar2 = rVar;
        i.f(pVar2, "sizeOf");
        i.f(lVar2, "create");
        i.f(rVar2, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(pVar2, lVar2, rVar2, i2, i2);
    }
}
