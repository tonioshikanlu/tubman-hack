package e.a.a.a.y0.m;

import e.a.a.a.y0.b.a1.c;
import e.a.a.a.y0.b.q0;
import e.a.a.a.y0.b.r0;
import e.x.c.i;

public interface u0 {

    public static final class a implements u0 {
        public static final a a = new a();

        public void a(c cVar) {
            i.e(cVar, "annotation");
        }

        public void b(q0 q0Var, r0 r0Var, d0 d0Var) {
            i.e(q0Var, "typeAlias");
            i.e(d0Var, "substitutedArgument");
        }

        public void c(q0 q0Var) {
            i.e(q0Var, "typeAlias");
        }

        public void d(d0 d0Var, d0 d0Var2, d0 d0Var3, r0 r0Var) {
            i.e(d0Var, "bound");
            i.e(d0Var2, "unsubstitutedArgument");
            i.e(d0Var3, "argument");
            i.e(r0Var, "typeParameter");
        }
    }

    void a(c cVar);

    void b(q0 q0Var, r0 r0Var, d0 d0Var);

    void c(q0 q0Var);

    void d(d0 d0Var, d0 d0Var2, d0 d0Var3, r0 r0Var);
}
