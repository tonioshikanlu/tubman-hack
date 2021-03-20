package g.a.a;

import e.v.f;
import e.x.b.p;
import e.x.c.i;
import e.x.c.k;
import g.a.o1;
import java.util.Objects;

public final class a {
    public static final q a = new q("ZERO");

    /* renamed from: b  reason: collision with root package name */
    public static final p<Object, f.a, Object> f9895b = b.f9897h;
    public static final p<o1<?>, f.a, o1<?>> c = c.f9898h;
    public static final p<u, f.a, u> d = C0146a.f8036j;

    /* renamed from: e  reason: collision with root package name */
    public static final p<u, f.a, u> f9896e = C0146a.f8035i;

    /* renamed from: g.a.a.a$a  reason: collision with other inner class name */
    /* compiled from: kotlin-style lambda group */
    public static final class C0146a extends k implements p<u, f.a, u> {

        /* renamed from: i  reason: collision with root package name */
        public static final C0146a f8035i = new C0146a(0);

        /* renamed from: j  reason: collision with root package name */
        public static final C0146a f8036j = new C0146a(1);

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ int f8037h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0146a(int i2) {
            super(2);
            this.f8037h = i2;
        }

        public final Object invoke(Object obj, Object obj2) {
            int i2 = this.f8037h;
            if (i2 == 0) {
                u uVar = (u) obj;
                f.a aVar = (f.a) obj2;
                if (aVar instanceof o1) {
                    f fVar = uVar.c;
                    Object[] objArr = uVar.a;
                    int i3 = uVar.f9918b;
                    uVar.f9918b = i3 + 1;
                    ((o1) aVar).z(fVar, objArr[i3]);
                }
                return uVar;
            } else if (i2 == 1) {
                u uVar2 = (u) obj;
                f.a aVar2 = (f.a) obj2;
                if (aVar2 instanceof o1) {
                    Object e0 = ((o1) aVar2).e0(uVar2.c);
                    Object[] objArr2 = uVar2.a;
                    int i4 = uVar2.f9918b;
                    uVar2.f9918b = i4 + 1;
                    objArr2[i4] = e0;
                }
                return uVar2;
            } else {
                throw null;
            }
        }
    }

    public static final class b extends k implements p<Object, f.a, Object> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f9897h = new b();

        public b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            f.a aVar = (f.a) obj2;
            if (!(aVar instanceof o1)) {
                return obj;
            }
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? aVar : Integer.valueOf(intValue + 1);
        }
    }

    public static final class c extends k implements p<o1<?>, f.a, o1<?>> {

        /* renamed from: h  reason: collision with root package name */
        public static final c f9898h = new c();

        public c() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            o1 o1Var = (o1) obj;
            f.a aVar = (f.a) obj2;
            if (o1Var != null) {
                return o1Var;
            }
            if (!(aVar instanceof o1)) {
                aVar = null;
            }
            return (o1) aVar;
        }
    }

    public static final void a(f fVar, Object obj) {
        if (obj != a) {
            if (obj instanceof u) {
                ((u) obj).f9918b = 0;
                fVar.fold(obj, f9896e);
                return;
            }
            Object fold = fVar.fold(null, c);
            Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((o1) fold).z(fVar, obj);
        }
    }

    public static final Object b(f fVar, Object obj) {
        if (obj == null) {
            obj = fVar.fold(0, f9895b);
            i.c(obj);
        }
        if (obj == 0) {
            return a;
        }
        return obj instanceof Integer ? fVar.fold(new u(fVar, ((Number) obj).intValue()), d) : ((o1) obj).e0(fVar);
    }
}
