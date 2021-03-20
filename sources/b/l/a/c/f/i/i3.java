package b.l.a.c.f.i;

import android.util.Log;

public final class i3 extends o3<Long> {
    public i3(m3 m3Var, String str, Long l2) {
        super(m3Var, str, l2);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String b2 = b();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 25 + str.length());
            sb.append("Invalid long value for ");
            sb.append(b2);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
