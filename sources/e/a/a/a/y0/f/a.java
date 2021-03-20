package e.a.a.a.y0.f;

import e.c0.h;
import e.x.c.i;

public final class a {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public final b f9205b;
    public final boolean c;

    public a(b bVar, b bVar2, boolean z) {
        if (bVar != null) {
            this.a = bVar;
            this.f9205b = bVar2;
            this.c = z;
            return;
        }
        a(1);
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(b bVar, d dVar) {
        this(bVar, b.k(dVar), false);
        if (bVar == null) {
            a(3);
            throw null;
        } else if (dVar != null) {
        } else {
            a(4);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i2) {
        String str = (i2 == 5 || i2 == 6 || i2 == 7 || i2 == 9 || i2 == 13 || i2 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 5 || i2 == 6 || i2 == 7 || i2 == 9 || i2 == 13 || i2 == 14) ? 2 : 3)];
        switch (i2) {
            case 1:
            case 3:
                objArr[0] = "packageFqName";
                break;
            case 2:
                objArr[0] = "relativeClassName";
                break;
            case 4:
                objArr[0] = "topLevelName";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = "segment";
                break;
            case 11:
            case 12:
                objArr[0] = "string";
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i2 == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i2 == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i2 == 7) {
            objArr[1] = "getShortClassName";
        } else if (i2 == 9) {
            objArr[1] = "asSingleFqName";
        } else if (i2 == 13 || i2 == 14) {
            objArr[1] = "asString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
                break;
            case 8:
                objArr[2] = "createNestedClassId";
                break;
            case 10:
                objArr[2] = "startsWith";
                break;
            case 11:
            case 12:
                objArr[2] = "fromString";
                break;
            default:
                objArr[2] = "topLevel";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 5 || i2 == 6 || i2 == 7 || i2 == 9 || i2 == 13 || i2 == 14) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static a e(String str) {
        return f(str, false);
    }

    public static a f(String str, boolean z) {
        if (str != null) {
            String str2 = "";
            i.e(str, "$this$substringBeforeLast");
            i.e(str2, "missingDelimiterValue");
            int o2 = h.o(str, '/', 0, false, 6);
            if (o2 != -1) {
                str2 = str.substring(0, o2);
                i.d(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            return new a(new b(str2.replace('/', '.')), new b(h.G(str, '/', str)), z);
        }
        a(12);
        throw null;
    }

    public static a l(b bVar) {
        if (bVar != null) {
            return new a(bVar.e(), bVar.g());
        }
        a(0);
        throw null;
    }

    public b b() {
        if (this.a.d()) {
            b bVar = this.f9205b;
            if (bVar != null) {
                return bVar;
            }
            a(9);
            throw null;
        }
        return new b(this.a.b() + "." + this.f9205b.b());
    }

    public String c() {
        if (this.a.d()) {
            String b2 = this.f9205b.b();
            if (b2 != null) {
                return b2;
            }
            a(13);
            throw null;
        }
        String str = this.a.b().replace('.', '/') + "/" + this.f9205b.b();
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public a d(d dVar) {
        if (dVar != null) {
            return new a(h(), this.f9205b.c(dVar), this.c);
        }
        a(8);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.f9205b.equals(aVar.f9205b) && this.c == aVar.c;
    }

    public a g() {
        b e2 = this.f9205b.e();
        if (e2.d()) {
            return null;
        }
        return new a(h(), e2, this.c);
    }

    public b h() {
        b bVar = this.a;
        if (bVar != null) {
            return bVar;
        }
        a(5);
        throw null;
    }

    public int hashCode() {
        int hashCode = this.f9205b.hashCode();
        return Boolean.valueOf(this.c).hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public b i() {
        b bVar = this.f9205b;
        if (bVar != null) {
            return bVar;
        }
        a(6);
        throw null;
    }

    public d j() {
        d g2 = this.f9205b.g();
        if (g2 != null) {
            return g2;
        }
        a(7);
        throw null;
    }

    public boolean k() {
        return !this.f9205b.e().d();
    }

    public String toString() {
        if (!this.a.d()) {
            return c();
        }
        StringBuilder y = b.e.a.a.a.y("/");
        y.append(c());
        return y.toString();
    }
}
