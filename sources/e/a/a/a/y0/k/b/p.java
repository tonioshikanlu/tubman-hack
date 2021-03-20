package e.a.a.a.y0.k.b;

import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.e;
import java.util.List;

public interface p {
    public static final p a = new a();

    public static class a implements p {
        public static /* synthetic */ void c(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i2 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public void a(e eVar, List<String> list) {
            if (eVar == null) {
                c(0);
                throw null;
            }
        }

        public void b(b bVar) {
            if (bVar == null) {
                c(2);
                throw null;
            }
        }
    }

    void a(e eVar, List<String> list);

    void b(b bVar);
}
