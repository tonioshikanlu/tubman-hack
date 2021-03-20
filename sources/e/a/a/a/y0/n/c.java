package e.a.a.a.y0.n;

import e.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class c {
    public final boolean a;

    public static final class a extends c {

        /* renamed from: b  reason: collision with root package name */
        public static final a f9772b = new a();

        public a() {
            super(false, (DefaultConstructorMarker) null);
        }
    }

    public static final class b extends c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(false, (DefaultConstructorMarker) null);
            i.e(str, "error");
        }
    }

    /* renamed from: e.a.a.a.y0.n.c$c  reason: collision with other inner class name */
    public static final class C0227c extends c {

        /* renamed from: b  reason: collision with root package name */
        public static final C0227c f9773b = new C0227c();

        public C0227c() {
            super(true, (DefaultConstructorMarker) null);
        }
    }

    public c(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = z;
    }
}
