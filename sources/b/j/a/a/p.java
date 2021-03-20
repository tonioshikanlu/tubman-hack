package b.j.a.a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.Set;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface p {

    public static class a implements Object<p> {

        /* renamed from: m  reason: collision with root package name */
        public static final a f1338m = new a(Collections.emptySet(), false, false, false, true);

        /* renamed from: h  reason: collision with root package name */
        public final Set<String> f1339h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f1340i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f1341j;

        /* renamed from: k  reason: collision with root package name */
        public final boolean f1342k;

        /* renamed from: l  reason: collision with root package name */
        public final boolean f1343l;

        public a(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            this.f1339h = set == null ? Collections.emptySet() : set;
            this.f1340i = z;
            this.f1341j = z2;
            this.f1342k = z3;
            this.f1343l = z4;
        }

        public static boolean a(a aVar, a aVar2) {
            return aVar.f1340i == aVar2.f1340i && aVar.f1343l == aVar2.f1343l && aVar.f1341j == aVar2.f1341j && aVar.f1342k == aVar2.f1342k && aVar.f1339h.equals(aVar2.f1339h);
        }

        public static a b(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            a aVar = f1338m;
            if (z == aVar.f1340i && z2 == aVar.f1341j && z3 == aVar.f1342k && z4 == aVar.f1343l && (set == null || set.size() == 0)) {
                return aVar;
            }
            return new a(set, z, z2, z3, z4);
        }

        public Set<String> c() {
            return this.f1342k ? Collections.emptySet() : this.f1339h;
        }

        public Set<String> d() {
            return this.f1341j ? Collections.emptySet() : this.f1339h;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            return obj.getClass() == a.class && a(this, (a) obj);
        }

        public int hashCode() {
            return this.f1339h.size() + (this.f1340i ? 1 : -3) + (this.f1341j ? 3 : -7) + (this.f1342k ? 7 : -11) + (this.f1343l ? 11 : -13);
        }

        public String toString() {
            return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", new Object[]{this.f1339h, Boolean.valueOf(this.f1340i), Boolean.valueOf(this.f1341j), Boolean.valueOf(this.f1342k), Boolean.valueOf(this.f1343l)});
        }
    }

    boolean allowGetters() default false;

    boolean allowSetters() default false;

    boolean ignoreUnknown() default false;

    String[] value() default {};
}
