package e.a.a.a.y0.j.w;

import e.a.a.a.y0.f.a;

public class b {
    public final String a;

    public b(String str) {
        if (str != null) {
            this.a = str;
        } else {
            a(5);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i2) {
        String str = (i2 == 3 || i2 == 6 || i2 == 7 || i2 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 3 || i2 == 6 || i2 == 7 || i2 == 8) ? 2 : 3)];
        switch (i2) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i2 == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i2 == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i2 == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i2 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i2) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 3 || i2 == 6 || i2 == 7 || i2 == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static b b(a aVar) {
        if (aVar != null) {
            e.a.a.a.y0.f.b h2 = aVar.h();
            String replace = aVar.i().b().replace('.', '$');
            if (h2.d()) {
                return new b(replace);
            }
            return new b(h2.b().replace('.', '/') + "/" + replace);
        }
        a(1);
        throw null;
    }

    public static b c(e.a.a.a.y0.f.b bVar) {
        if (bVar != null) {
            return new b(bVar.b().replace('.', '/'));
        }
        a(2);
        throw null;
    }

    public static b d(String str) {
        if (str != null) {
            return new b(str);
        }
        a(0);
        throw null;
    }

    public String e() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        a(8);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((b) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }
}
