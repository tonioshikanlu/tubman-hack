package e.a.a.a.y0.d.b;

import e.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class h {

    public static final class a extends h {
        public final h a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h hVar) {
            super((DefaultConstructorMarker) null);
            i.e(hVar, "elementType");
            this.a = hVar;
        }
    }

    public static final class b extends h {
        public final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super((DefaultConstructorMarker) null);
            i.e(str, "internalName");
            this.a = str;
        }
    }

    public static final class c extends h {
        public final e.a.a.a.y0.j.w.c a;

        public c(e.a.a.a.y0.j.w.c cVar) {
            super((DefaultConstructorMarker) null);
            this.a = cVar;
        }
    }

    public h() {
    }

    public h(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public String toString() {
        return j.a.c(this);
    }
}
