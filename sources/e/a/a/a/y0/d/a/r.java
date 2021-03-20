package e.a.a.a.y0.d.a;

import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.o;
import e.a.a.a.y0.b.y;
import e.a.a.a.y0.b.y0;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.j.g;
import e.a.a.a.y0.j.y.o.d;

public class r {
    public static final z0 a = new a("package", false);

    /* renamed from: b  reason: collision with root package name */
    public static final z0 f8576b = new b("protected_static", true);
    public static final z0 c = new c("protected_and_package", true);

    public static class a extends z0 {
        public a(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void e(int i2) {
            String str = (i2 == 3 || i2 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i2 == 3 || i2 == 5) ? 2 : 3)];
            if (i2 == 1) {
                objArr[0] = "from";
            } else if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        objArr[0] = "classDescriptor";
                    } else if (i2 != 5) {
                        objArr[0] = "what";
                    }
                }
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$1";
            } else {
                objArr[0] = "visibility";
            }
            if (i2 == 3) {
                objArr[1] = "normalize";
            } else if (i2 != 5) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$1";
            } else {
                objArr[1] = "effectiveVisibility";
            }
            if (i2 == 2) {
                objArr[2] = "compareTo";
            } else if (i2 != 3) {
                if (i2 == 4) {
                    objArr[2] = "effectiveVisibility";
                } else if (i2 != 5) {
                    objArr[2] = "isVisible";
                }
            }
            String format = String.format(str, objArr);
            throw ((i2 == 3 || i2 == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public Integer a(z0 z0Var) {
            if (z0Var != null) {
                return Integer.valueOf(this == z0Var ? 0 : y0.e(z0Var) ? 1 : -1);
            }
            e(2);
            throw null;
        }

        public String b() {
            return "public/*package*/";
        }

        public boolean c(d dVar, o oVar, k kVar) {
            if (oVar == null) {
                e(0);
                throw null;
            } else if (kVar != null) {
                return r.c(oVar, kVar);
            } else {
                e(1);
                throw null;
            }
        }

        public z0 d() {
            z0 z0Var = y0.c;
            if (z0Var != null) {
                return z0Var;
            }
            e(3);
            throw null;
        }
    }

    public static class b extends z0 {
        public b(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void e(int i2) {
            String str = i2 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i2 != 2 ? 3 : 2)];
            if (i2 == 1) {
                objArr[0] = "from";
            } else if (i2 != 2) {
                objArr[0] = "what";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$2";
            }
            if (i2 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$2";
            } else {
                objArr[1] = "normalize";
            }
            if (i2 != 2) {
                objArr[2] = "isVisible";
            }
            String format = String.format(str, objArr);
            throw (i2 != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public String b() {
            return "protected/*protected static*/";
        }

        public boolean c(d dVar, o oVar, k kVar) {
            if (oVar == null) {
                e(0);
                throw null;
            } else if (kVar != null) {
                return r.b(dVar, oVar, kVar);
            } else {
                e(1);
                throw null;
            }
        }

        public z0 d() {
            z0 z0Var = y0.c;
            if (z0Var != null) {
                return z0Var;
            }
            e(2);
            throw null;
        }
    }

    public static class c extends z0 {
        public c(String str, boolean z) {
            super(str, z);
        }

        public static /* synthetic */ void e(int i2) {
            String str = i2 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i2 != 3 ? 3 : 2)];
            if (i2 == 1) {
                objArr[0] = "from";
            } else if (i2 == 2) {
                objArr[0] = "visibility";
            } else if (i2 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$3";
            }
            if (i2 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$3";
            } else {
                objArr[1] = "normalize";
            }
            if (i2 == 2) {
                objArr[2] = "compareTo";
            } else if (i2 != 3) {
                objArr[2] = "isVisible";
            }
            String format = String.format(str, objArr);
            throw (i2 != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public Integer a(z0 z0Var) {
            int i2;
            if (z0Var != null) {
                if (this == z0Var) {
                    i2 = 0;
                } else if (z0Var == y0.d) {
                    return null;
                } else {
                    i2 = y0.e(z0Var) ? 1 : -1;
                }
                return Integer.valueOf(i2);
            }
            e(2);
            throw null;
        }

        public String b() {
            return "protected/*protected and package*/";
        }

        public boolean c(d dVar, o oVar, k kVar) {
            if (oVar == null) {
                e(0);
                throw null;
            } else if (kVar != null) {
                return r.b(dVar, oVar, kVar);
            } else {
                e(1);
                throw null;
            }
        }

        public z0 d() {
            z0 z0Var = y0.c;
            if (z0Var != null) {
                return z0Var;
            }
            e(3);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[3];
        if (i2 == 1) {
            objArr[0] = "from";
        } else if (i2 == 2) {
            objArr[0] = "first";
        } else if (i2 != 3) {
            objArr[0] = "what";
        } else {
            objArr[0] = "second";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities";
        if (i2 == 2 || i2 == 3) {
            objArr[2] = "areInSamePackage";
        } else {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(d dVar, o oVar, k kVar) {
        if (oVar == null) {
            a(0);
            throw null;
        } else if (kVar == null) {
            a(1);
            throw null;
        } else if (c(g.A(oVar), kVar)) {
            return true;
        } else {
            return y0.c.c(dVar, oVar, kVar);
        }
    }

    public static boolean c(k kVar, k kVar2) {
        Class<y> cls = y.class;
        if (kVar == null) {
            a(2);
            throw null;
        } else if (kVar2 != null) {
            y yVar = (y) g.k(kVar, cls, false);
            y yVar2 = (y) g.k(kVar2, cls, false);
            return (yVar2 == null || yVar == null || !yVar.e().equals(yVar2.e())) ? false : true;
        } else {
            a(3);
            throw null;
        }
    }
}
