package n.m0.i;

import e.c0.h;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.y;
import o.g;

public final class a {
    public long a = ((long) 262144);

    /* renamed from: b  reason: collision with root package name */
    public final g f10241b;

    public a(g gVar) {
        i.e(gVar, "source");
        this.f10241b = gVar;
    }

    public final y a() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String b2 = b();
            if (b2.length() == 0) {
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                return new y((String[]) array, (DefaultConstructorMarker) null);
            }
            i.e(b2, "line");
            int k2 = h.k(b2, ':', 1, false, 4);
            if (k2 != -1) {
                String substring = b2.substring(0, k2);
                i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                b2 = b2.substring(k2 + 1);
                i.d(b2, "(this as java.lang.String).substring(startIndex)");
                i.e(substring, "name");
                i.e(b2, "value");
                arrayList.add(substring);
            } else {
                if (b2.charAt(0) == ':') {
                    b2 = b2.substring(1);
                    i.d(b2, "(this as java.lang.String).substring(startIndex)");
                }
                i.e("", "name");
                i.e(b2, "value");
                arrayList.add("");
            }
            arrayList.add(h.N(b2).toString());
        }
    }

    public final String b() {
        String U = this.f10241b.U(this.a);
        this.a -= (long) U.length();
        return U;
    }
}
