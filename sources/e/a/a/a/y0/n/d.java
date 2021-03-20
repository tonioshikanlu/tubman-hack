package e.a.a.a.y0.n;

import e.a.a.a.y0.b.s;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.Arrays;
import java.util.Collection;

public final class d {
    public final e.a.a.a.y0.f.d a;

    /* renamed from: b  reason: collision with root package name */
    public final e.c0.d f9774b;
    public final Collection<e.a.a.a.y0.f.d> c;
    public final l<s, String> d;

    /* renamed from: e  reason: collision with root package name */
    public final b[] f9775e;

    public static final class a extends k implements l {

        /* renamed from: h  reason: collision with root package name */
        public static final a f9776h = new a();

        public a() {
            super(1);
        }

        public Object invoke(Object obj) {
            i.e((s) obj, "$receiver");
            return null;
        }
    }

    public static final class b extends k implements l {

        /* renamed from: h  reason: collision with root package name */
        public static final b f9777h = new b();

        public b() {
            super(1);
        }

        public Object invoke(Object obj) {
            i.e((s) obj, "$receiver");
            return null;
        }
    }

    public d(e.a.a.a.y0.f.d dVar, e.c0.d dVar2, Collection<e.a.a.a.y0.f.d> collection, l<? super s, String> lVar, b... bVarArr) {
        this.a = null;
        this.f9774b = dVar2;
        this.c = collection;
        this.d = lVar;
        this.f9775e = bVarArr;
    }

    public d(e.a.a.a.y0.f.d dVar, b[] bVarArr, l<? super s, String> lVar) {
        i.e(dVar, "name");
        i.e(bVarArr, "checks");
        i.e(lVar, "additionalChecks");
        this.a = dVar;
        this.f9774b = null;
        this.c = null;
        this.d = lVar;
        this.f9775e = (b[]) Arrays.copyOf(bVarArr, bVarArr.length);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e.a.a.a.y0.f.d dVar, b[] bVarArr, l lVar, int i2) {
        this(dVar, bVarArr, (l<? super s, String>) (i2 & 4) != 0 ? a.f9776h : null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(Collection<e.a.a.a.y0.f.d> collection, b[] bVarArr, l<? super s, String> lVar) {
        this((e.a.a.a.y0.f.d) null, (e.c0.d) null, collection, lVar, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        i.e(collection, "nameList");
        i.e(bVarArr, "checks");
        i.e(lVar, "additionalChecks");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Collection collection, b[] bVarArr, l lVar, int i2) {
        this((Collection<e.a.a.a.y0.f.d>) collection, bVarArr, (l<? super s, String>) (i2 & 4) != 0 ? b.f9777h : null);
    }
}
