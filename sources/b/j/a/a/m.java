package b.j.a.a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface m {
    Class<? extends i0<?>> generator();

    String property() default "@id";

    Class<? extends l0> resolver() default n0.class;

    Class<?> scope() default Object.class;
}
