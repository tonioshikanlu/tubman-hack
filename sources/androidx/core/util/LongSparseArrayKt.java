package androidx.core.util;

import android.util.LongSparseArray;
import androidx.annotation.RequiresApi;
import e.r;
import e.t.v;
import e.x.b.a;
import e.x.b.p;
import e.x.c.i;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006\u001a0\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\n¢\u0006\u0004\b\t\u0010\n\u001a4\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\f\u0010\r\u001a(\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\b¢\u0006\u0004\b\u000e\u0010\u0006\u001a(\u0010\u000f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00028\u0000H\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a6\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a \u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\b¢\u0006\u0004\b\u0019\u0010\u0018\u001a/\u0010\u001a\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010\u001c\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a:\u0010 \u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u001eH\b¢\u0006\u0004\b \u0010!\u001a\u001f\u0010#\u001a\u00020\"\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b#\u0010$\u001a%\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b&\u0010'\"$\u0010+\u001a\u00020(\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"T", "Landroid/util/LongSparseArray;", "", "key", "", "contains", "(Landroid/util/LongSparseArray;J)Z", "value", "Le/r;", "set", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)V", "other", "plus", "(Landroid/util/LongSparseArray;Landroid/util/LongSparseArray;)Landroid/util/LongSparseArray;", "containsKey", "containsValue", "(Landroid/util/LongSparseArray;Ljava/lang/Object;)Z", "defaultValue", "getOrDefault", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "getOrElse", "(Landroid/util/LongSparseArray;JLe/x/b/a;)Ljava/lang/Object;", "isEmpty", "(Landroid/util/LongSparseArray;)Z", "isNotEmpty", "remove", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Z", "putAll", "(Landroid/util/LongSparseArray;Landroid/util/LongSparseArray;)V", "Lkotlin/Function2;", "action", "forEach", "(Landroid/util/LongSparseArray;Le/x/b/p;)V", "Le/t/v;", "keyIterator", "(Landroid/util/LongSparseArray;)Le/t/v;", "", "valueIterator", "(Landroid/util/LongSparseArray;)Ljava/util/Iterator;", "", "getSize", "(Landroid/util/LongSparseArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class LongSparseArrayKt {
    @RequiresApi(16)
    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j2) {
        i.f(longSparseArray, "$this$contains");
        return longSparseArray.indexOfKey(j2) >= 0;
    }

    @RequiresApi(16)
    public static final <T> boolean containsKey(LongSparseArray<T> longSparseArray, long j2) {
        i.f(longSparseArray, "$this$containsKey");
        return longSparseArray.indexOfKey(j2) >= 0;
    }

    @RequiresApi(16)
    public static final <T> boolean containsValue(LongSparseArray<T> longSparseArray, T t) {
        i.f(longSparseArray, "$this$containsValue");
        return longSparseArray.indexOfValue(t) >= 0;
    }

    @RequiresApi(16)
    public static final <T> void forEach(LongSparseArray<T> longSparseArray, p<? super Long, ? super T, r> pVar) {
        i.f(longSparseArray, "$this$forEach");
        i.f(pVar, "action");
        int size = longSparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            pVar.invoke(Long.valueOf(longSparseArray.keyAt(i2)), longSparseArray.valueAt(i2));
        }
    }

    @RequiresApi(16)
    public static final <T> T getOrDefault(LongSparseArray<T> longSparseArray, long j2, T t) {
        i.f(longSparseArray, "$this$getOrDefault");
        T t2 = longSparseArray.get(j2);
        return t2 != null ? t2 : t;
    }

    @RequiresApi(16)
    public static final <T> T getOrElse(LongSparseArray<T> longSparseArray, long j2, a<? extends T> aVar) {
        i.f(longSparseArray, "$this$getOrElse");
        i.f(aVar, "defaultValue");
        T t = longSparseArray.get(j2);
        return t != null ? t : aVar.e();
    }

    @RequiresApi(16)
    public static final <T> int getSize(LongSparseArray<T> longSparseArray) {
        i.f(longSparseArray, "$this$size");
        return longSparseArray.size();
    }

    @RequiresApi(16)
    public static final <T> boolean isEmpty(LongSparseArray<T> longSparseArray) {
        i.f(longSparseArray, "$this$isEmpty");
        return longSparseArray.size() == 0;
    }

    @RequiresApi(16)
    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        i.f(longSparseArray, "$this$isNotEmpty");
        return longSparseArray.size() != 0;
    }

    @RequiresApi(16)
    public static final <T> v keyIterator(LongSparseArray<T> longSparseArray) {
        i.f(longSparseArray, "$this$keyIterator");
        return new LongSparseArrayKt$keyIterator$1(longSparseArray);
    }

    @RequiresApi(16)
    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        i.f(longSparseArray, "$this$plus");
        i.f(longSparseArray2, "other");
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray2.size() + longSparseArray.size());
        putAll(longSparseArray3, longSparseArray);
        putAll(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    @RequiresApi(16)
    public static final <T> void putAll(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        i.f(longSparseArray, "$this$putAll");
        i.f(longSparseArray2, "other");
        int size = longSparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            longSparseArray.put(longSparseArray2.keyAt(i2), longSparseArray2.valueAt(i2));
        }
    }

    @RequiresApi(16)
    public static final <T> boolean remove(LongSparseArray<T> longSparseArray, long j2, T t) {
        i.f(longSparseArray, "$this$remove");
        int indexOfKey = longSparseArray.indexOfKey(j2);
        if (indexOfKey < 0 || !i.a(t, longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }

    @RequiresApi(16)
    public static final <T> void set(LongSparseArray<T> longSparseArray, long j2, T t) {
        i.f(longSparseArray, "$this$set");
        longSparseArray.put(j2, t);
    }

    @RequiresApi(16)
    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        i.f(longSparseArray, "$this$valueIterator");
        return new LongSparseArrayKt$valueIterator$1(longSparseArray);
    }
}
