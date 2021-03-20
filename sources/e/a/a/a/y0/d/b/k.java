package e.a.a.a.y0.d.b;

import e.a.a.a.y0.d.a.d0.g;
import e.a.a.a.y0.k.b.s;
import e.x.c.i;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

public interface k extends s {

    public static abstract class a {

        /* renamed from: e.a.a.a.y0.d.b.k$a$a  reason: collision with other inner class name */
        public static final class C0183a extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0183a)) {
                    return false;
                }
                Objects.requireNonNull((C0183a) obj);
                return i.a((Object) null, (Object) null);
            }

            public int hashCode() {
                return 0;
            }

            public String toString() {
                StringBuilder y = b.e.a.a.a.y("ClassFileContent(content=");
                y.append(Arrays.toString((byte[]) null));
                y.append(")");
                return y.toString();
            }
        }

        public static final class b extends a {
            public final l a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(l lVar) {
                super((DefaultConstructorMarker) null);
                i.e(lVar, "kotlinJvmBinaryClass");
                this.a = lVar;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof b) && i.a(this.a, ((b) obj).a);
                }
                return true;
            }

            public int hashCode() {
                l lVar = this.a;
                if (lVar != null) {
                    return lVar.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder y = b.e.a.a.a.y("KotlinClass(kotlinJvmBinaryClass=");
                y.append(this.a);
                y.append(")");
                return y.toString();
            }
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final l a() {
            b bVar = (b) (!(this instanceof b) ? null : this);
            if (bVar != null) {
                return bVar.a;
            }
            return null;
        }
    }

    a a(g gVar);

    a c(e.a.a.a.y0.f.a aVar);
}
