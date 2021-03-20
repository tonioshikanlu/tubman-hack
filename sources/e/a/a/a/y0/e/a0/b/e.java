package e.a.a.a.y0.e.a0.b;

import e.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class e {

    public static final class a extends e {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final String f8765b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super((DefaultConstructorMarker) null);
            i.e(str, "name");
            i.e(str2, "desc");
            this.a = str;
            this.f8765b = str2;
        }

        public String a() {
            return this.a + ':' + this.f8765b;
        }

        public String b() {
            return this.f8765b;
        }

        public String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.a, aVar.a) && i.a(this.f8765b, aVar.f8765b);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f8765b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }
    }

    public static final class b extends e {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final String f8766b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super((DefaultConstructorMarker) null);
            i.e(str, "name");
            i.e(str2, "desc");
            this.a = str;
            this.f8766b = str2;
        }

        public String a() {
            return this.a + this.f8766b;
        }

        public String b() {
            return this.f8766b;
        }

        public String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return i.a(this.a, bVar.a) && i.a(this.f8766b, bVar.f8766b);
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f8766b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }
    }

    public e(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public final String toString() {
        return a();
    }
}
