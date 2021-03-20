package androidx.core.util;

import android.util.SparseBooleanArray;
import e.r;
import e.t.k;
import e.t.u;
import e.x.b.a;
import e.x.b.p;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\b¢\u0006\u0004\b\r\u0010\u0005\u001a\u001c\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u0011\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0003H\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a*\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0016\u001a\u00020\u0003*\u00020\u0000H\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0014\u0010\u0018\u001a\u00020\u0003*\u00020\u0000H\b¢\u0006\u0004\b\u0018\u0010\u0017\u001a!\u0010\u0019\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u0012\u001a\u0019\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a.\u0010\u001e\u001a\u00020\u0007*\u00020\u00002\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u001cH\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010!\u001a\u00020 *\u00020\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0011\u0010$\u001a\u00020#*\u00020\u0000¢\u0006\u0004\b$\u0010%\"\u0018\u0010(\u001a\u00020\u0001*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroid/util/SparseBooleanArray;", "", "key", "", "contains", "(Landroid/util/SparseBooleanArray;I)Z", "value", "Le/r;", "set", "(Landroid/util/SparseBooleanArray;IZ)V", "other", "plus", "(Landroid/util/SparseBooleanArray;Landroid/util/SparseBooleanArray;)Landroid/util/SparseBooleanArray;", "containsKey", "containsValue", "(Landroid/util/SparseBooleanArray;Z)Z", "defaultValue", "getOrDefault", "(Landroid/util/SparseBooleanArray;IZ)Z", "Lkotlin/Function0;", "getOrElse", "(Landroid/util/SparseBooleanArray;ILe/x/b/a;)Z", "isEmpty", "(Landroid/util/SparseBooleanArray;)Z", "isNotEmpty", "remove", "putAll", "(Landroid/util/SparseBooleanArray;Landroid/util/SparseBooleanArray;)V", "Lkotlin/Function2;", "action", "forEach", "(Landroid/util/SparseBooleanArray;Le/x/b/p;)V", "Le/t/u;", "keyIterator", "(Landroid/util/SparseBooleanArray;)Le/t/u;", "Le/t/k;", "valueIterator", "(Landroid/util/SparseBooleanArray;)Le/t/k;", "getSize", "(Landroid/util/SparseBooleanArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class SparseBooleanArrayKt {
    public static final boolean contains(SparseBooleanArray sparseBooleanArray, int i2) {
        i.f(sparseBooleanArray, "$this$contains");
        return sparseBooleanArray.indexOfKey(i2) >= 0;
    }

    public static final boolean containsKey(SparseBooleanArray sparseBooleanArray, int i2) {
        i.f(sparseBooleanArray, "$this$containsKey");
        return sparseBooleanArray.indexOfKey(i2) >= 0;
    }

    public static final boolean containsValue(SparseBooleanArray sparseBooleanArray, boolean z) {
        i.f(sparseBooleanArray, "$this$containsValue");
        return sparseBooleanArray.indexOfValue(z) >= 0;
    }

    public static final void forEach(SparseBooleanArray sparseBooleanArray, p<? super Integer, ? super Boolean, r> pVar) {
        i.f(sparseBooleanArray, "$this$forEach");
        i.f(pVar, "action");
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            pVar.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i2)), Boolean.valueOf(sparseBooleanArray.valueAt(i2)));
        }
    }

    public static final boolean getOrDefault(SparseBooleanArray sparseBooleanArray, int i2, boolean z) {
        i.f(sparseBooleanArray, "$this$getOrDefault");
        return sparseBooleanArray.get(i2, z);
    }

    public static final boolean getOrElse(SparseBooleanArray sparseBooleanArray, int i2, a<Boolean> aVar) {
        i.f(sparseBooleanArray, "$this$getOrElse");
        i.f(aVar, "defaultValue");
        int indexOfKey = sparseBooleanArray.indexOfKey(i2);
        return indexOfKey >= 0 ? sparseBooleanArray.valueAt(indexOfKey) : aVar.e().booleanValue();
    }

    public static final int getSize(SparseBooleanArray sparseBooleanArray) {
        i.f(sparseBooleanArray, "$this$size");
        return sparseBooleanArray.size();
    }

    public static final boolean isEmpty(SparseBooleanArray sparseBooleanArray) {
        i.f(sparseBooleanArray, "$this$isEmpty");
        return sparseBooleanArray.size() == 0;
    }

    public static final boolean isNotEmpty(SparseBooleanArray sparseBooleanArray) {
        i.f(sparseBooleanArray, "$this$isNotEmpty");
        return sparseBooleanArray.size() != 0;
    }

    public static final u keyIterator(SparseBooleanArray sparseBooleanArray) {
        i.f(sparseBooleanArray, "$this$keyIterator");
        return new SparseBooleanArrayKt$keyIterator$1(sparseBooleanArray);
    }

    public static final SparseBooleanArray plus(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        i.f(sparseBooleanArray, "$this$plus");
        i.f(sparseBooleanArray2, "other");
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray2.size() + sparseBooleanArray.size());
        putAll(sparseBooleanArray3, sparseBooleanArray);
        putAll(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final void putAll(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        i.f(sparseBooleanArray, "$this$putAll");
        i.f(sparseBooleanArray2, "other");
        int size = sparseBooleanArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i2), sparseBooleanArray2.valueAt(i2));
        }
    }

    public static final boolean remove(SparseBooleanArray sparseBooleanArray, int i2, boolean z) {
        i.f(sparseBooleanArray, "$this$remove");
        int indexOfKey = sparseBooleanArray.indexOfKey(i2);
        if (indexOfKey < 0 || z != sparseBooleanArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i2);
        return true;
    }

    public static final void set(SparseBooleanArray sparseBooleanArray, int i2, boolean z) {
        i.f(sparseBooleanArray, "$this$set");
        sparseBooleanArray.put(i2, z);
    }

    public static final k valueIterator(SparseBooleanArray sparseBooleanArray) {
        i.f(sparseBooleanArray, "$this$valueIterator");
        return new SparseBooleanArrayKt$valueIterator$1(sparseBooleanArray);
    }
}
