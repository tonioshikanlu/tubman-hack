package e.a.a.a.y0.n;

import e.a.a.a.y0.b.s;
import e.a.a.a.y0.m.o1.c;
import e.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class g implements b {
    public final String a;

    public static final class a extends g {

        /* renamed from: b  reason: collision with root package name */
        public static final a f9779b = new a();

        public a() {
            super("must be a member function", (DefaultConstructorMarker) null);
        }

        public boolean b(s sVar) {
            i.e(sVar, "functionDescriptor");
            return sVar.K() != null;
        }
    }

    public static final class b extends g {

        /* renamed from: b  reason: collision with root package name */
        public static final b f9780b = new b();

        public b() {
            super("must be a member or an extension function", (DefaultConstructorMarker) null);
        }

        public boolean b(s sVar) {
            i.e(sVar, "functionDescriptor");
            return (sVar.K() == null && sVar.U() == null) ? false : true;
        }
    }

    public g(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = str;
    }

    public String a(s sVar) {
        i.e(sVar, "functionDescriptor");
        return c.J(this, sVar);
    }

    public String getDescription() {
        return this.a;
    }
}
