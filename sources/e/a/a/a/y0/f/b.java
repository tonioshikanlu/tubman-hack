package e.a.a.a.y0.f;

import java.util.List;
import java.util.Objects;

public final class b {
    public static final b c = new b("");
    public final c a;

    /* renamed from: b  reason: collision with root package name */
    public transient b f9206b;

    public b(c cVar) {
        this.a = cVar;
    }

    public b(c cVar, b bVar) {
        this.a = cVar;
        this.f9206b = bVar;
    }

    public b(String str) {
        if (str != null) {
            this.a = new c(str, this);
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        Throwable th;
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i2) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public static b k(d dVar) {
        if (dVar == null) {
            a(13);
            throw null;
        } else if (dVar != null) {
            return new b(new c(dVar.e(), c.j(), dVar));
        } else {
            c.a(16);
            throw null;
        }
    }

    public String b() {
        String b2 = this.a.b();
        if (b2 != null) {
            return b2;
        }
        a(4);
        throw null;
    }

    public b c(d dVar) {
        if (dVar != null) {
            return new b(this.a.c(dVar), this);
        }
        a(8);
        throw null;
    }

    public boolean d() {
        return this.a.e();
    }

    public b e() {
        b bVar = this.f9206b;
        if (bVar != null) {
            if (bVar != null) {
                return bVar;
            }
            a(6);
            throw null;
        } else if (!d()) {
            c cVar = this.a;
            c cVar2 = cVar.c;
            if (cVar2 == null) {
                if (!cVar.e()) {
                    cVar.d();
                    cVar2 = cVar.c;
                    if (cVar2 == null) {
                        c.a(8);
                        throw null;
                    }
                } else {
                    throw new IllegalStateException("root");
                }
            }
            b bVar2 = new b(cVar2);
            this.f9206b = bVar2;
            if (bVar2 != null) {
                return bVar2;
            }
            a(7);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a.equals(((b) obj).a);
    }

    public List<d> f() {
        List<d> g2 = this.a.g();
        if (g2 != null) {
            return g2;
        }
        a(11);
        throw null;
    }

    public d g() {
        d h2 = this.a.h();
        if (h2 != null) {
            return h2;
        }
        a(9);
        throw null;
    }

    public d h() {
        d dVar;
        c cVar = this.a;
        if (cVar.e()) {
            dVar = c.f9207e;
            if (dVar == null) {
                c.a(12);
                throw null;
            }
        } else {
            dVar = cVar.h();
            if (dVar == null) {
                c.a(13);
                throw null;
            }
        }
        return dVar;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean i(d dVar) {
        if (dVar != null) {
            c cVar = this.a;
            Objects.requireNonNull(cVar);
            if (dVar == null) {
                c.a(15);
                throw null;
            } else if (cVar.e()) {
                return false;
            } else {
                int indexOf = cVar.a.indexOf(46);
                String str = cVar.a;
                String e2 = dVar.e();
                if (indexOf == -1) {
                    indexOf = cVar.a.length();
                }
                return str.regionMatches(0, e2, 0, indexOf);
            }
        } else {
            a(12);
            throw null;
        }
    }

    public c j() {
        c cVar = this.a;
        if (cVar != null) {
            return cVar;
        }
        a(5);
        throw null;
    }

    public String toString() {
        return this.a.toString();
    }
}
