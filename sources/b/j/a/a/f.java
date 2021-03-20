package b.j.a.a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface f {

    public enum a {
        ANY,
        NON_PRIVATE,
        PROTECTED_AND_PUBLIC,
        PUBLIC_ONLY,
        NONE,
        DEFAULT;

        public boolean d(Member member) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return true;
            }
            if (ordinal == 1) {
                return !Modifier.isPrivate(member.getModifiers());
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return false;
                }
            } else if (Modifier.isProtected(member.getModifiers())) {
                return true;
            }
            return Modifier.isPublic(member.getModifiers());
        }
    }

    a creatorVisibility() default a.DEFAULT;

    a fieldVisibility() default a.DEFAULT;

    a getterVisibility() default a.DEFAULT;

    a isGetterVisibility() default a.DEFAULT;

    a setterVisibility() default a.DEFAULT;
}
