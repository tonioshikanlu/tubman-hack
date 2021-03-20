package e.a.a.a.y0.a;

import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.x;
import e.a.a.a.y0.j.y.i;
import e.a.l;
import e.f;
import e.g;
import e.x.c.k;
import e.x.c.q;
import e.x.c.v;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class j {
    public static final /* synthetic */ l[] d;

    /* renamed from: e  reason: collision with root package name */
    public static final b f7679e = new b((DefaultConstructorMarker) null);
    public final f a;

    /* renamed from: b  reason: collision with root package name */
    public final a f7680b = new a(1);
    public final x c;

    public static final class a {
        public a(int i2) {
        }
    }

    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class c extends k implements e.x.b.a<i> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ w f7681h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(w wVar) {
            super(0);
            this.f7681h = wVar;
        }

        public Object e() {
            return this.f7681h.o0(k.a).z();
        }
    }

    static {
        Class<j> cls = j.class;
        d = new l[]{v.c(new q(v.a(cls), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), v.c(new q(v.a(cls), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), v.c(new q(v.a(cls), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), v.c(new q(v.a(cls), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), v.c(new q(v.a(cls), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), v.c(new q(v.a(cls), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), v.c(new q(v.a(cls), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), v.c(new q(v.a(cls), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};
    }

    public j(w wVar, x xVar) {
        e.x.c.i.e(wVar, "module");
        e.x.c.i.e(xVar, "notFoundClasses");
        this.c = xVar;
        this.a = b.q.a.a.g2(g.PUBLICATION, new c(wVar));
    }
}
