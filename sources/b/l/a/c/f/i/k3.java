package b.l.a.c.f.i;

import android.util.Log;

public final class k3 extends o3<Double> {
    public k3(m3 m3Var, Double d) {
        super(m3Var, "measurement.test.double_flag", d);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String b2 = b();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 27 + str.length());
            sb.append("Invalid double value for ");
            sb.append(b2);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
