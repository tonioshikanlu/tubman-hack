package b.l.a.c.f.e;

import android.text.TextUtils;
import b.e.a.a.a;
import java.lang.reflect.Type;

public final class zi {
    public static Object a(String str, Type type) {
        if (type == String.class) {
            try {
                wj wjVar = new wj();
                wjVar.a(str);
                if (!TextUtils.isEmpty(wjVar.f3384h)) {
                    return wjVar.f3384h;
                }
                String valueOf = String.valueOf(str);
                throw new vg(valueOf.length() != 0 ? "No error message: ".concat(valueOf) : new String("No error message: "));
            } catch (Exception e2) {
                String valueOf2 = String.valueOf(e2.getMessage());
                throw new vg(valueOf2.length() != 0 ? "Json conversion failed! ".concat(valueOf2) : new String("Json conversion failed! "), e2);
            }
        } else if (type == Void.class) {
            return null;
        } else {
            try {
                bj bjVar = (bj) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0]);
                try {
                    bjVar.d(str);
                    return bjVar;
                } catch (Exception e3) {
                    String valueOf3 = String.valueOf(e3.getMessage());
                    throw new vg(valueOf3.length() != 0 ? "Json conversion failed! ".concat(valueOf3) : new String("Json conversion failed! "), e3);
                }
            } catch (Exception e4) {
                String valueOf4 = String.valueOf(type);
                throw new vg(a.q(new StringBuilder(valueOf4.length() + 38), "Instantiation of JsonResponse failed! ", valueOf4), e4);
            }
        }
    }
}
