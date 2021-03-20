package b.l.c.a;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class c {
    public static String a(String str, Object... objArr) {
        int indexOf;
        String str2;
        String valueOf = String.valueOf(str);
        int i2 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i3 = 0; i3 < objArr.length; i3++) {
                Object obj = objArr[i3];
                try {
                    str2 = String.valueOf(obj);
                } catch (Exception e2) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str3, e2);
                    str2 = "<" + str3 + " threw " + e2.getClass().getName() + ">";
                }
                objArr[i3] = str2;
            }
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i4 = 0;
        while (i2 < objArr.length && (indexOf = valueOf.indexOf("%s", i4)) != -1) {
            sb.append(valueOf, i4, indexOf);
            sb.append(objArr[i2]);
            i4 = indexOf + 2;
            i2++;
        }
        sb.append(valueOf, i4, valueOf.length());
        if (i2 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
