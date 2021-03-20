package androidx.core.util;

import android.util.SparseLongArray;
import androidx.annotation.RequiresApi;
import e.r;
import e.t.u;
import e.t.v;
import e.x.b.a;
import e.x.b.p;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\b¢\u0006\u0004\b\u000e\u0010\u0005\u001a\u001c\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a$\u0010\u0012\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0006H\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a*\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0014\u0010\u0017\u001a\u00020\u0003*\u00020\u0000H\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0014\u0010\u0019\u001a\u00020\u0003*\u00020\u0000H\b¢\u0006\u0004\b\u0019\u0010\u0018\u001a#\u0010\u001a\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\b*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a.\u0010 \u001a\u00020\b*\u00020\u00002\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u001eH\b¢\u0006\u0004\b \u0010!\u001a\u0013\u0010#\u001a\u00020\"*\u00020\u0000H\u0007¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010&\u001a\u00020%*\u00020\u0000H\u0007¢\u0006\u0004\b&\u0010'\"\u0018\u0010*\u001a\u00020\u0001*\u00020\u00008Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroid/util/SparseLongArray;", "", "key", "", "contains", "(Landroid/util/SparseLongArray;I)Z", "", "value", "Le/r;", "set", "(Landroid/util/SparseLongArray;IJ)V", "other", "plus", "(Landroid/util/SparseLongArray;Landroid/util/SparseLongArray;)Landroid/util/SparseLongArray;", "containsKey", "containsValue", "(Landroid/util/SparseLongArray;J)Z", "defaultValue", "getOrDefault", "(Landroid/util/SparseLongArray;IJ)J", "Lkotlin/Function0;", "getOrElse", "(Landroid/util/SparseLongArray;ILe/x/b/a;)J", "isEmpty", "(Landroid/util/SparseLongArray;)Z", "isNotEmpty", "remove", "(Landroid/util/SparseLongArray;IJ)Z", "putAll", "(Landroid/util/SparseLongArray;Landroid/util/SparseLongArray;)V", "Lkotlin/Function2;", "action", "forEach", "(Landroid/util/SparseLongArray;Le/x/b/p;)V", "Le/t/u;", "keyIterator", "(Landroid/util/SparseLongArray;)Le/t/u;", "Le/t/v;", "valueIterator", "(Landroid/util/SparseLongArray;)Le/t/v;", "getSize", "(Landroid/util/SparseLongArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class SparseLongArrayKt {
    @RequiresApi(18)
    public static final boolean contains(SparseLongArray sparseLongArray, int i2) {
        i.f(sparseLongArray, "$this$contains");
        return sparseLongArray.indexOfKey(i2) >= 0;
    }

    @RequiresApi(18)
    public static final boolean containsKey(SparseLongArray sparseLongArray, int i2) {
        i.f(sparseLongArray, "$this$containsKey");
        return sparseLongArray.indexOfKey(i2) >= 0;
    }

    @RequiresApi(18)
    public static final boolean containsValue(SparseLongArray sparseLongArray, long j2) {
        i.f(sparseLongArray, "$this$containsValue");
        return sparseLongArray.indexOfValue(j2) >= 0;
    }

    @RequiresApi(18)
    public static final void forEach(SparseLongArray sparseLongArray, p<? super Integer, ? super Long, r> pVar) {
        i.f(sparseLongArray, "$this$forEach");
        i.f(pVar, "action");
        int size = sparseLongArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            pVar.invoke(Integer.valueOf(sparseLongArray.keyAt(i2)), Long.valueOf(sparseLongArray.valueAt(i2)));
        }
    }

    @RequiresApi(18)
    public static final long getOrDefault(SparseLongArray sparseLongArray, int i2, long j2) {
        i.f(sparseLongArray, "$this$getOrDefault");
        return sparseLongArray.get(i2, j2);
    }

    @RequiresApi(18)
    public static final long getOrElse(SparseLongArray sparseLongArray, int i2, a<Long> aVar) {
        i.f(sparseLongArray, "$this$getOrElse");
        i.f(aVar, "defaultValue");
        int indexOfKey = sparseLongArray.indexOfKey(i2);
        return indexOfKey >= 0 ? sparseLongArray.valueAt(indexOfKey) : aVar.e().longValue();
    }

    @RequiresApi(18)
    public static final int getSize(SparseLongArray sparseLongArray) {
        i.f(sparseLongArray, "$this$size");
        return sparseLongArray.size();
    }

    @RequiresApi(18)
    public static final boolean isEmpty(SparseLongArray sparseLongArray) {
        i.f(sparseLongArray, "$this$isEmpty");
        return sparseLongArray.size() == 0;
    }

    @RequiresApi(18)
    public static final boolean isNotEmpty(SparseLongArray sparseLongArray) {
        i.f(sparseLongArray, "$this$isNotEmpty");
        return sparseLongArray.size() != 0;
    }

    @RequiresApi(18)
    public static final u keyIterator(SparseLongArray sparseLongArray) {
        i.f(sparseLongArray, "$this$keyIterator");
        return new SparseLongArrayKt$keyIterator$1(sparseLongArray);
    }

    @RequiresApi(18)
    public static final SparseLongArray plus(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        i.f(sparseLongArray, "$this$plus");
        i.f(sparseLongArray2, "other");
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray2.size() + sparseLongArray.size());
        putAll(sparseLongArray3, sparseLongArray);
        putAll(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    @RequiresApi(18)
    public static final void putAll(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        i.f(sparseLongArray, "$this$putAll");
        i.f(sparseLongArray2, "other");
        int size = sparseLongArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i2), sparseLongArray2.valueAt(i2));
        }
    }

    @RequiresApi(18)
    public static final boolean remove(SparseLongArray sparseLongArray, int i2, long j2) {
        i.f(sparseLongArray, "$this$remove");
        int indexOfKey = sparseLongArray.indexOfKey(i2);
        if (indexOfKey < 0 || j2 != sparseLongArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(indexOfKey);
        return true;
    }

    @RequiresApi(18)
    public static final void set(SparseLongArray sparseLongArray, int i2, long j2) {
        i.f(sparseLongArray, "$this$set");
        sparseLongArray.put(i2, j2);
    }

    @RequiresApi(18)
    public static final v valueIterator(SparseLongArray sparseLongArray) {
        i.f(sparseLongArray, "$this$valueIterator");
        return new SparseLongArrayKt$valueIterator$1(sparseLongArray);
    }
}
