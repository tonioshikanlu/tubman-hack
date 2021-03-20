package b.j.a.c.z;

import b.j.a.c.j;
import b.j.a.c.j0.j;
import b.j.a.c.o;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface c {
    Class<?> as() default Void.class;

    Class<?> builder() default Void.class;

    Class<?> contentAs() default Void.class;

    Class<? extends j> contentConverter() default j.a.class;

    Class<? extends b.j.a.c.j> contentUsing() default j.a.class;

    Class<? extends b.j.a.c.j0.j> converter() default j.a.class;

    Class<?> keyAs() default Void.class;

    Class<? extends o> keyUsing() default o.a.class;

    Class<? extends b.j.a.c.j> using() default j.a.class;
}
