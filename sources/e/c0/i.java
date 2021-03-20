package e.c0;

import e.j;
import e.x.b.p;
import e.x.c.k;

public final class i extends k implements p<CharSequence, Integer, j<? extends Integer, ? extends Integer>> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ char[] f9889h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f9890i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(char[] cArr, boolean z) {
        super(2);
        this.f9889h = cArr;
        this.f9890i = z;
    }

    public Object invoke(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        e.x.c.i.e(charSequence, "$receiver");
        int m2 = h.m(charSequence, this.f9889h, intValue, this.f9890i);
        if (m2 < 0) {
            return null;
        }
        return new j(Integer.valueOf(m2), 1);
    }
}
