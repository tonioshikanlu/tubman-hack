package b.j.a.c.z;

import b.j.a.a.r;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface b {

    public @interface a {
        r.a include() default r.a.NON_NULL;

        String propName() default "";

        String propNamespace() default "";

        boolean required() default false;

        String value();
    }

    /* renamed from: b.j.a.c.z.b$b  reason: collision with other inner class name */
    public @interface C0051b {
        r.a include() default r.a.NON_NULL;

        String name() default "";

        String namespace() default "";

        boolean required() default false;

        Class<?> type() default Object.class;

        Class<? extends b.j.a.c.h0.r> value();
    }

    a[] attrs() default {};

    boolean prepend() default false;

    C0051b[] props() default {};
}
