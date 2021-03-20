package b.j.a.c.j0;

import java.io.Serializable;

public abstract class r {

    /* renamed from: h  reason: collision with root package name */
    public static final r f2232h = new b();

    public static class a extends r implements Serializable {

        /* renamed from: i  reason: collision with root package name */
        public final r f2233i;

        /* renamed from: j  reason: collision with root package name */
        public final r f2234j;

        public a(r rVar, r rVar2) {
            this.f2233i = rVar;
            this.f2234j = rVar2;
        }

        public String a(String str) {
            return this.f2233i.a(this.f2234j.a(str));
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("[ChainedTransformer(");
            y.append(this.f2233i);
            y.append(", ");
            y.append(this.f2234j);
            y.append(")]");
            return y.toString();
        }
    }

    public static final class b extends r implements Serializable {
        public String a(String str) {
            return str;
        }
    }

    public abstract String a(String str);
}
