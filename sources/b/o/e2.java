package b.o;

import androidx.annotation.NonNull;
import b.e.a.a.a;
import b.o.d2;
import b.o.i2;
import b.o.p0;
import java.util.concurrent.ConcurrentHashMap;

public class e2 {
    public p0 a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<String, Object> f6083b = new ConcurrentHashMap<>();

    public e2(p0.a aVar) {
        this.a = new p0(aVar);
    }

    public final boolean a(@NonNull Number number, @NonNull Number number2, @NonNull d2.b bVar) {
        double doubleValue = number.doubleValue();
        double doubleValue2 = number2.doubleValue();
        switch (bVar.ordinal()) {
            case 0:
                if (doubleValue2 > doubleValue) {
                    return true;
                }
                return false;
            case 1:
                if (doubleValue2 < doubleValue) {
                    return true;
                }
                return false;
            case 2:
                if (doubleValue2 == doubleValue) {
                    return true;
                }
                return false;
            case 3:
                if (doubleValue2 != doubleValue) {
                    return true;
                }
                return false;
            case 4:
                if (doubleValue2 < doubleValue || doubleValue2 == doubleValue) {
                    return true;
                }
                return false;
            case 5:
                int i2 = (doubleValue2 > doubleValue ? 1 : (doubleValue2 == doubleValue ? 0 : -1));
                if (i2 > 0 || i2 == 0) {
                    return true;
                }
                return false;
            case 6:
            case 7:
            case 8:
                i2.k kVar = i2.k.ERROR;
                StringBuilder y = a.y("Attempted to use an invalid operator with a numeric value: ");
                y.append(bVar.f6079h);
                i2.a(kVar, y.toString(), (Throwable) null);
                return false;
            default:
                return false;
        }
    }

    public final boolean b(@NonNull String str, @NonNull String str2, @NonNull d2.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 2) {
            return str.equals(str2);
        }
        if (ordinal == 3) {
            return !str.equals(str2);
        }
        i2.k kVar = i2.k.ERROR;
        StringBuilder y = a.y("Attempted to use an invalid operator for a string trigger comparison: ");
        y.append(bVar.f6079h);
        i2.a(kVar, y.toString(), (Throwable) null);
        return false;
    }
}
