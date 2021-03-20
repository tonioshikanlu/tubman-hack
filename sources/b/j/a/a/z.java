package b.j.a.a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface z {

    public static class a implements Object<z> {

        /* renamed from: j  reason: collision with root package name */
        public static final a f1362j;

        /* renamed from: h  reason: collision with root package name */
        public final h0 f1363h;

        /* renamed from: i  reason: collision with root package name */
        public final h0 f1364i;

        static {
            h0 h0Var = h0.DEFAULT;
            f1362j = new a(h0Var, h0Var);
        }

        public a(h0 h0Var, h0 h0Var2) {
            this.f1363h = h0Var;
            this.f1364i = h0Var2;
        }

        public h0 a() {
            h0 h0Var = this.f1364i;
            if (h0Var == h0.DEFAULT) {
                return null;
            }
            return h0Var;
        }

        public h0 b() {
            h0 h0Var = this.f1363h;
            if (h0Var == h0.DEFAULT) {
                return null;
            }
            return h0Var;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.f1363h == this.f1363h && aVar.f1364i == this.f1364i;
        }

        public int hashCode() {
            return this.f1363h.ordinal() + (this.f1364i.ordinal() << 2);
        }

        public String toString() {
            return String.format("JsonSetter.Value(valueNulls=%s,contentNulls=%s)", new Object[]{this.f1363h, this.f1364i});
        }
    }

    h0 contentNulls() default h0.DEFAULT;

    h0 nulls() default h0.DEFAULT;

    String value() default "";
}
