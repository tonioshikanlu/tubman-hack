package androidx.core.util;

import android.util.SparseIntArray;
import e.r;
import e.t.u;
import e.x.b.a;
import e.x.b.p;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\n¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\b¢\u0006\u0004\b\r\u0010\u0005\u001a\u001c\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\b¢\u0006\u0004\b\u000e\u0010\u0005\u001a$\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a*\u0010\u0013\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0003*\u00020\u0000H\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0014\u0010\u0017\u001a\u00020\u0003*\u00020\u0000H\b¢\u0006\u0004\b\u0017\u0010\u0016\u001a!\u0010\u0018\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a.\u0010\u001e\u001a\u00020\u0007*\u00020\u00002\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u001cH\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010!\u001a\u00020 *\u00020\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0011\u0010#\u001a\u00020 *\u00020\u0000¢\u0006\u0004\b#\u0010\"\"\u0018\u0010&\u001a\u00020\u0001*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroid/util/SparseIntArray;", "", "key", "", "contains", "(Landroid/util/SparseIntArray;I)Z", "value", "Le/r;", "set", "(Landroid/util/SparseIntArray;II)V", "other", "plus", "(Landroid/util/SparseIntArray;Landroid/util/SparseIntArray;)Landroid/util/SparseIntArray;", "containsKey", "containsValue", "defaultValue", "getOrDefault", "(Landroid/util/SparseIntArray;II)I", "Lkotlin/Function0;", "getOrElse", "(Landroid/util/SparseIntArray;ILe/x/b/a;)I", "isEmpty", "(Landroid/util/SparseIntArray;)Z", "isNotEmpty", "remove", "(Landroid/util/SparseIntArray;II)Z", "putAll", "(Landroid/util/SparseIntArray;Landroid/util/SparseIntArray;)V", "Lkotlin/Function2;", "action", "forEach", "(Landroid/util/SparseIntArray;Le/x/b/p;)V", "Le/t/u;", "keyIterator", "(Landroid/util/SparseIntArray;)Le/t/u;", "valueIterator", "getSize", "(Landroid/util/SparseIntArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class SparseIntArrayKt {
    public static final boolean contains(SparseIntArray sparseIntArray, int i2) {
        i.f(sparseIntArray, "$this$contains");
        return sparseIntArray.indexOfKey(i2) >= 0;
    }

    public static final boolean containsKey(SparseIntArray sparseIntArray, int i2) {
        i.f(sparseIntArray, "$this$containsKey");
        return sparseIntArray.indexOfKey(i2) >= 0;
    }

    public static final boolean containsValue(SparseIntArray sparseIntArray, int i2) {
        i.f(sparseIntArray, "$this$containsValue");
        return sparseIntArray.indexOfValue(i2) >= 0;
    }

    public static final void forEach(SparseIntArray sparseIntArray, p<? super Integer, ? super Integer, r> pVar) {
        i.f(sparseIntArray, "$this$forEach");
        i.f(pVar, "action");
        int size = sparseIntArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            pVar.invoke(Integer.valueOf(sparseIntArray.keyAt(i2)), Integer.valueOf(sparseIntArray.valueAt(i2)));
        }
    }

    public static final int getOrDefault(SparseIntArray sparseIntArray, int i2, int i3) {
        i.f(sparseIntArray, "$this$getOrDefault");
        return sparseIntArray.get(i2, i3);
    }

    public static final int getOrElse(SparseIntArray sparseIntArray, int i2, a<Integer> aVar) {
        i.f(sparseIntArray, "$this$getOrElse");
        i.f(aVar, "defaultValue");
        int indexOfKey = sparseIntArray.indexOfKey(i2);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : aVar.e().intValue();
    }

    public static final int getSize(SparseIntArray sparseIntArray) {
        i.f(sparseIntArray, "$this$size");
        return sparseIntArray.size();
    }

    public static final boolean isEmpty(SparseIntArray sparseIntArray) {
        i.f(sparseIntArray, "$this$isEmpty");
        return sparseIntArray.size() == 0;
    }

    public static final boolean isNotEmpty(SparseIntArray sparseIntArray) {
        i.f(sparseIntArray, "$this$isNotEmpty");
        return sparseIntArray.size() != 0;
    }

    public static final u keyIterator(SparseIntArray sparseIntArray) {
        i.f(sparseIntArray, "$this$keyIterator");
        return new SparseIntArrayKt$keyIterator$1(sparseIntArray);
    }

    public static final SparseIntArray plus(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        i.f(sparseIntArray, "$this$plus");
        i.f(sparseIntArray2, "other");
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray2.size() + sparseIntArray.size());
        putAll(sparseIntArray3, sparseIntArray);
        putAll(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    public static final void putAll(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        i.f(sparseIntArray, "$this$putAll");
        i.f(sparseIntArray2, "other");
        int size = sparseIntArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i2), sparseIntArray2.valueAt(i2));
        }
    }

    public static final boolean remove(SparseIntArray sparseIntArray, int i2, int i3) {
        i.f(sparseIntArray, "$this$remove");
        int indexOfKey = sparseIntArray.indexOfKey(i2);
        if (indexOfKey < 0 || i3 != sparseIntArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(indexOfKey);
        return true;
    }

    public static final void set(SparseIntArray sparseIntArray, int i2, int i3) {
        i.f(sparseIntArray, "$this$set");
        sparseIntArray.put(i2, i3);
    }

    public static final u valueIterator(SparseIntArray sparseIntArray) {
        i.f(sparseIntArray, "$this$valueIterator");
        return new SparseIntArrayKt$valueIterator$1(sparseIntArray);
    }
}
