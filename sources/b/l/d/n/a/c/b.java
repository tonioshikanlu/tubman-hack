package b.l.d.n.a.c;

import b.l.a.c.f.e.am;
import b.l.a.c.i.b.k5;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class b {
    public static final Set<String> a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f4922b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"});
    public static final List<String> c = Arrays.asList(new String[]{"auto", "app", am.f2847m});
    public static final List<String> d = Arrays.asList(new String[]{"_r", "_dbg"});

    /* renamed from: e  reason: collision with root package name */
    public static final List<String> f4923e;
    public static final List<String> f = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    static {
        String[][] strArr = {k5.a, k5.f4099b};
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            i2 += strArr[i3].length;
        }
        Object[] copyOf = Arrays.copyOf(strArr[0], i2);
        int length = strArr[0].length;
        for (int i4 = 1; i4 < 2; i4++) {
            String[] strArr2 = strArr[i4];
            System.arraycopy(strArr2, 0, copyOf, length, strArr2.length);
            length += strArr2.length;
        }
        f4923e = Arrays.asList((String[]) copyOf);
    }

    public static boolean a(String str) {
        return !c.contains(str);
    }
}
