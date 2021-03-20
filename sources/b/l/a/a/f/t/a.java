package b.l.a.a.f.t;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import b.l.a.a.b;
import java.util.EnumMap;

public final class a {
    public static SparseArray<b> a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public static EnumMap<b, Integer> f2560b;

    static {
        EnumMap<b, Integer> enumMap = new EnumMap<>(b.class);
        f2560b = enumMap;
        enumMap.put(b.DEFAULT, 0);
        f2560b.put(b.VERY_LOW, 1);
        f2560b.put(b.HIGHEST, 2);
        for (b next : f2560b.keySet()) {
            a.append(f2560b.get(next).intValue(), next);
        }
    }

    public static int a(@NonNull b bVar) {
        Integer num = f2560b.get(bVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + bVar);
    }

    @NonNull
    public static b b(int i2) {
        b bVar = a.get(i2);
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException(b.e.a.a.a.g("Unknown Priority for value ", i2));
    }
}
