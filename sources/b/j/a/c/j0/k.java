package b.j.a.c.j0;

import b.j.a.c.b;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class k implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final Class<Enum<?>> f2219h;

    /* renamed from: i  reason: collision with root package name */
    public final Enum<?>[] f2220i;

    /* renamed from: j  reason: collision with root package name */
    public final HashMap<String, Enum<?>> f2221j;

    /* renamed from: k  reason: collision with root package name */
    public final Enum<?> f2222k;

    public k(Class<Enum<?>> cls, Enum<?>[] enumArr, HashMap<String, Enum<?>> hashMap, Enum<?> enumR) {
        this.f2219h = cls;
        this.f2220i = enumArr;
        this.f2221j = hashMap;
        this.f2222k = enumR;
    }

    public static k b(Class<?> cls, b bVar) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        HashMap hashMap = new HashMap();
        int length = enumArr.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum enumR = enumArr[length];
            hashMap.put(enumR.toString(), enumR);
        }
        return new k(cls, enumArr, hashMap, bVar == null ? null : bVar.g(cls));
    }

    public h a() {
        int i2;
        HashMap<String, Enum<?>> hashMap = this.f2221j;
        if (hashMap.isEmpty()) {
            return h.f2215k;
        }
        int size = hashMap.size();
        if (size <= 5) {
            i2 = 8;
        } else if (size <= 12) {
            i2 = 16;
        } else {
            int i3 = 32;
            while (i3 < size + (size >> 2)) {
                i3 += i3;
            }
            i2 = i3;
        }
        int i4 = i2 - 1;
        int i5 = (i2 >> 1) + i2;
        Object[] objArr = new Object[(i5 * 2)];
        int i6 = 0;
        for (Map.Entry next : hashMap.entrySet()) {
            String str = (String) next.getKey();
            int hashCode = str.hashCode() & i4;
            int i7 = hashCode + hashCode;
            if (objArr[i7] != null) {
                i7 = ((hashCode >> 1) + i2) << 1;
                if (objArr[i7] != null) {
                    i7 = (i5 << 1) + i6;
                    i6 += 2;
                    if (i7 >= objArr.length) {
                        objArr = Arrays.copyOf(objArr, objArr.length + 4);
                    }
                }
            }
            objArr[i7] = str;
            objArr[i7 + 1] = next.getValue();
        }
        return new h(i4, i6, objArr);
    }
}
