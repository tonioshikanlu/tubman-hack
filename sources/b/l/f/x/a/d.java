package b.l.f.x.a;

import b.l.f.a;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public final class d {
    public static final Pattern a = Pattern.compile(",");

    /* renamed from: b  reason: collision with root package name */
    public static final Set<a> f5799b;
    public static final Set<a> c;
    public static final Set<a> d;

    /* renamed from: e  reason: collision with root package name */
    public static final Set<a> f5800e;
    public static final Set<a> f;

    /* renamed from: g  reason: collision with root package name */
    public static final Set<a> f5801g;

    /* renamed from: h  reason: collision with root package name */
    public static final Set<a> f5802h;

    /* renamed from: i  reason: collision with root package name */
    public static final Map<String, Set<a>> f5803i;

    static {
        EnumSet of = EnumSet.of(a.QR_CODE);
        f5800e = of;
        EnumSet of2 = EnumSet.of(a.DATA_MATRIX);
        f = of2;
        EnumSet of3 = EnumSet.of(a.AZTEC);
        f5801g = of3;
        EnumSet of4 = EnumSet.of(a.PDF_417);
        f5802h = of4;
        EnumSet of5 = EnumSet.of(a.UPC_A, new a[]{a.UPC_E, a.EAN_13, a.EAN_8, a.RSS_14, a.RSS_EXPANDED});
        f5799b = of5;
        EnumSet of6 = EnumSet.of(a.CODE_39, a.CODE_93, a.CODE_128, a.ITF, a.CODABAR);
        c = of6;
        EnumSet copyOf = EnumSet.copyOf(of5);
        d = copyOf;
        copyOf.addAll(of6);
        HashMap hashMap = new HashMap();
        f5803i = hashMap;
        hashMap.put("ONE_D_MODE", copyOf);
        hashMap.put("PRODUCT_MODE", of5);
        hashMap.put("QR_CODE_MODE", of);
        hashMap.put("DATA_MATRIX_MODE", of2);
        hashMap.put("AZTEC_MODE", of3);
        hashMap.put("PDF417_MODE", of4);
    }
}
