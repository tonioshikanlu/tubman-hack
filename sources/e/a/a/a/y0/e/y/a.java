package e.a.a.a.y0.e.y;

import e.a0.c;
import e.a0.d;
import e.t.f;
import e.t.g;
import e.t.u;
import e.x.c.i;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a extends e.a.a.a.y0.e.z.a {
    public static final a f = new a(1, 0, 7);

    /* renamed from: g  reason: collision with root package name */
    public static final C0202a f9174g = new C0202a((DefaultConstructorMarker) null);

    /* renamed from: e.a.a.a.y0.e.y.a$a  reason: collision with other inner class name */
    public static final class C0202a {
        public C0202a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final a a(InputStream inputStream) {
            i.e(inputStream, "stream");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            d dVar = new d(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(b.q.a.a.C(dVar, 10));
            Iterator it = dVar.iterator();
            while (((c) it).f7887i) {
                ((u) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] V = g.V(arrayList);
            return new a(Arrays.copyOf(V, V.length));
        }
    }

    static {
        int[] iArr = new int[0];
        i.e(iArr, "numbers");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        i.e(copyOf, "numbers");
        Integer Y0 = b.q.a.a.Y0(copyOf, 0);
        if (Y0 != null) {
            Y0.intValue();
        }
        Integer Y02 = b.q.a.a.Y0(copyOf, 1);
        if (Y02 != null) {
            Y02.intValue();
        }
        Integer Y03 = b.q.a.a.Y0(copyOf, 2);
        if (Y03 != null) {
            Y03.intValue();
        }
        if (copyOf.length > 3) {
            i.e(copyOf, "$this$asList");
            g.W(new f(copyOf).subList(3, copyOf.length));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        i.e(iArr, "numbers");
    }
}
