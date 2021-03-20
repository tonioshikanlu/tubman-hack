package b.j.a.c.z;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface e {

    public static class a {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2330b;

        public a(e eVar) {
            String buildMethodName = eVar.buildMethodName();
            String withPrefix = eVar.withPrefix();
            this.a = buildMethodName;
            this.f2330b = withPrefix;
        }
    }

    String buildMethodName() default "build";

    String withPrefix() default "with";
}
