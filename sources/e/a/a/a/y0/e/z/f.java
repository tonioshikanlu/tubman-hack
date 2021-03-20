package e.a.a.a.y0.e.z;

import e.a.a.a.y0.e.v;
import e.b;
import e.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class f {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final v.d f9200b;
    public final b c;
    public final Integer d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9201e;

    public static final class a {
        public static final a d = new a(256, 256, 256);

        /* renamed from: e  reason: collision with root package name */
        public static final C0204a f9202e = new C0204a((DefaultConstructorMarker) null);
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9203b;
        public final int c;

        /* renamed from: e.a.a.a.y0.e.z.f$a$a  reason: collision with other inner class name */
        public static final class C0204a {
            public C0204a(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public a(int i2, int i3, int i4) {
            this.a = i2;
            this.f9203b = i3;
            this.c = i4;
        }

        public a(int i2, int i3, int i4, int i5) {
            i4 = (i5 & 4) != 0 ? 0 : i4;
            this.a = i2;
            this.f9203b = i3;
            this.c = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.f9203b == aVar.f9203b && this.c == aVar.c;
        }

        public int hashCode() {
            return (((this.a * 31) + this.f9203b) * 31) + this.c;
        }

        public String toString() {
            int i2;
            StringBuilder sb;
            if (this.c == 0) {
                sb = new StringBuilder();
                sb.append(this.a);
                sb.append('.');
                i2 = this.f9203b;
            } else {
                sb = new StringBuilder();
                sb.append(this.a);
                sb.append('.');
                sb.append(this.f9203b);
                sb.append('.');
                i2 = this.c;
            }
            sb.append(i2);
            return sb.toString();
        }
    }

    public f(a aVar, v.d dVar, b bVar, Integer num, String str) {
        i.e(aVar, "version");
        i.e(dVar, "kind");
        i.e(bVar, "level");
        this.a = aVar;
        this.f9200b = dVar;
        this.c = bVar;
        this.d = num;
        this.f9201e = str;
    }

    public String toString() {
        String str;
        StringBuilder y = b.e.a.a.a.y("since ");
        y.append(this.a);
        y.append(' ');
        y.append(this.c);
        String str2 = "";
        if (this.d != null) {
            StringBuilder y2 = b.e.a.a.a.y(" error ");
            y2.append(this.d);
            str = y2.toString();
        } else {
            str = str2;
        }
        y.append(str);
        if (this.f9201e != null) {
            StringBuilder y3 = b.e.a.a.a.y(": ");
            y3.append(this.f9201e);
            str2 = y3.toString();
        }
        y.append(str2);
        return y.toString();
    }
}
