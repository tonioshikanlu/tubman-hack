package b.j.a.a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface b {

    public static class a implements Object<b> {

        /* renamed from: j  reason: collision with root package name */
        public static final a f1268j = new a((Object) null, (Boolean) null);

        /* renamed from: h  reason: collision with root package name */
        public final Object f1269h;

        /* renamed from: i  reason: collision with root package name */
        public final Boolean f1270i;

        public a(Object obj, Boolean bool) {
            this.f1269h = obj;
            this.f1270i = bool;
        }

        public static a a(Object obj, Boolean bool) {
            if ("".equals(obj)) {
                obj = null;
            }
            return obj == null && bool == null ? f1268j : new a(obj, bool);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                Boolean bool = this.f1270i;
                Boolean bool2 = aVar.f1270i;
                if (bool == null ? bool2 == null : bool.equals(bool2)) {
                    Object obj2 = this.f1269h;
                    Object obj3 = aVar.f1269h;
                    if (obj2 != null) {
                        return obj2.equals(obj3);
                    }
                    if (obj3 == null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f1269h;
            int i2 = 1;
            if (obj != null) {
                i2 = 1 + obj.hashCode();
            }
            Boolean bool = this.f1270i;
            return bool != null ? i2 + bool.hashCode() : i2;
        }

        public String toString() {
            return String.format("JacksonInject.Value(id=%s,useInput=%s)", new Object[]{this.f1269h, this.f1270i});
        }
    }

    m0 useInput() default m0.f1336j;

    String value() default "";
}
