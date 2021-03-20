package e.a.a.a.y0.n;

import e.a.a.a.y0.b.s;
import e.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class n implements b {
    public final String a;

    public static final class a extends n {

        /* renamed from: b  reason: collision with root package name */
        public final int f9803b;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(int r3) {
            /*
                r2 = this;
                java.lang.String r0 = "must have at least "
                java.lang.String r1 = " value parameter"
                java.lang.StringBuilder r0 = b.e.a.a.a.z(r0, r3, r1)
                r1 = 1
                if (r3 <= r1) goto L_0x000e
                java.lang.String r1 = "s"
                goto L_0x0010
            L_0x000e:
                java.lang.String r1 = ""
            L_0x0010:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f9803b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.n.n.a.<init>(int):void");
        }

        public boolean b(s sVar) {
            i.e(sVar, "functionDescriptor");
            return sVar.n().size() >= this.f9803b;
        }
    }

    public static final class b extends n {

        /* renamed from: b  reason: collision with root package name */
        public final int f9804b;

        public b(int i2) {
            super(b.e.a.a.a.h("must have exactly ", i2, " value parameters"), (DefaultConstructorMarker) null);
            this.f9804b = i2;
        }

        public boolean b(s sVar) {
            i.e(sVar, "functionDescriptor");
            return sVar.n().size() == this.f9804b;
        }
    }

    public static final class c extends n {

        /* renamed from: b  reason: collision with root package name */
        public static final c f9805b = new c();

        public c() {
            super("must have no value parameters", (DefaultConstructorMarker) null);
        }

        public boolean b(s sVar) {
            i.e(sVar, "functionDescriptor");
            return sVar.n().isEmpty();
        }
    }

    public static final class d extends n {

        /* renamed from: b  reason: collision with root package name */
        public static final d f9806b = new d();

        public d() {
            super("must have a single value parameter", (DefaultConstructorMarker) null);
        }

        public boolean b(s sVar) {
            i.e(sVar, "functionDescriptor");
            return sVar.n().size() == 1;
        }
    }

    public n(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = str;
    }

    public String a(s sVar) {
        i.e(sVar, "functionDescriptor");
        return e.a.a.a.y0.m.o1.c.J(this, sVar);
    }

    public String getDescription() {
        return this.a;
    }
}
