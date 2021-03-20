package e.a.a.a.y0.d.a;

import e.a.a.a.y0.d.a.d0.g;
import e.a.a.a.y0.d.a.d0.t;
import e.a.a.a.y0.f.b;
import e.x.c.i;
import java.util.Arrays;
import java.util.Set;

public interface n {

    public static final class a {
        public final e.a.a.a.y0.f.a a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f8575b;
        public final g c;

        public a(e.a.a.a.y0.f.a aVar, byte[] bArr, g gVar, int i2) {
            int i3 = i2 & 2;
            gVar = (i2 & 4) != 0 ? null : gVar;
            i.e(aVar, "classId");
            this.a = aVar;
            this.f8575b = null;
            this.c = gVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.a, aVar.a) && i.a(this.f8575b, aVar.f8575b) && i.a(this.c, aVar.c);
        }

        public int hashCode() {
            e.a.a.a.y0.f.a aVar = this.a;
            int i2 = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            byte[] bArr = this.f8575b;
            int hashCode2 = (hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
            g gVar = this.c;
            if (gVar != null) {
                i2 = gVar.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("Request(classId=");
            y.append(this.a);
            y.append(", previouslyFoundClassFileContent=");
            y.append(Arrays.toString(this.f8575b));
            y.append(", outerClass=");
            y.append(this.c);
            y.append(")");
            return y.toString();
        }
    }

    t a(b bVar);

    g b(a aVar);

    Set<String> c(b bVar);
}
