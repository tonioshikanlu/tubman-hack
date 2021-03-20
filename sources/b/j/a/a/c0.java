package b.j.a.a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface c0 {

    public enum a {
        PROPERTY,
        WRAPPER_OBJECT,
        WRAPPER_ARRAY,
        EXTERNAL_PROPERTY,
        EXISTING_PROPERTY
    }

    public enum b {
        NONE((String) null),
        CLASS("@class"),
        MINIMAL_CLASS("@c"),
        NAME("@type"),
        f1281m((String) null);
        

        /* renamed from: h  reason: collision with root package name */
        public final String f1283h;

        /* access modifiers changed from: public */
        b(String str) {
            this.f1283h = str;
        }
    }

    @Deprecated
    public static abstract class c {
    }

    Class<?> defaultImpl() default c0.class;

    a include() default a.PROPERTY;

    String property() default "";

    b use();

    boolean visible() default false;
}
