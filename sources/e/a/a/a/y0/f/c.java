package e.a.a.a.y0.f;

import e.x.b.l;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final d f9207e = d.n("<root>");
    public static final Pattern f = Pattern.compile("\\.");

    /* renamed from: g  reason: collision with root package name */
    public static final l<String, d> f9208g = new a();
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public transient b f9209b;
    public transient c c;
    public transient d d;

    public static class a implements l<String, d> {
        public Object invoke(Object obj) {
            return d.j((String) obj);
        }
    }

    public c(String str) {
        if (str != null) {
            this.a = str;
        } else {
            a(2);
            throw null;
        }
    }

    public c(String str, b bVar) {
        if (str != null) {
            this.a = str;
            this.f9209b = bVar;
            return;
        }
        a(0);
        throw null;
    }

    public c(String str, c cVar, d dVar) {
        if (str != null) {
            this.a = str;
            this.c = cVar;
            this.d = dVar;
            return;
        }
        a(3);
        throw null;
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
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
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
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        if (i2 != 1) {
            switch (i2) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i2) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
        }
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public String b() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        a(4);
        throw null;
    }

    public c c(d dVar) {
        String str;
        if (dVar != null) {
            if (e()) {
                str = dVar.e();
            } else {
                str = this.a + "." + dVar.e();
            }
            return new c(str, this, dVar);
        }
        a(9);
        throw null;
    }

    public final void d() {
        int lastIndexOf = this.a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.d = d.j(this.a.substring(lastIndexOf + 1));
            this.c = new c(this.a.substring(0, lastIndexOf));
            return;
        }
        this.d = d.j(this.a);
        this.c = b.c.j();
    }

    public boolean e() {
        return this.a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a.equals(((c) obj).a);
    }

    public boolean f() {
        return this.f9209b != null || b().indexOf(60) < 0;
    }

    public List<d> g() {
        List<d> list;
        if (e()) {
            list = Collections.emptyList();
        } else {
            String[] split = f.split(this.a);
            l<String, d> lVar = f9208g;
            i.e(split, "$this$map");
            i.e(lVar, "transform");
            ArrayList arrayList = new ArrayList(split.length);
            for (String invoke : split) {
                arrayList.add(lVar.invoke(invoke));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        a(14);
        throw null;
    }

    public d h() {
        d dVar = this.d;
        if (dVar != null) {
            if (dVar != null) {
                return dVar;
            }
            a(10);
            throw null;
        } else if (!e()) {
            d();
            d dVar2 = this.d;
            if (dVar2 != null) {
                return dVar2;
            }
            a(11);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public b i() {
        b bVar = this.f9209b;
        if (bVar == null) {
            b bVar2 = new b(this);
            this.f9209b = bVar2;
            if (bVar2 != null) {
                return bVar2;
            }
            a(6);
            throw null;
        } else if (bVar != null) {
            return bVar;
        } else {
            a(5);
            throw null;
        }
    }

    public String toString() {
        String e2 = e() ? f9207e.e() : this.a;
        if (e2 != null) {
            return e2;
        }
        a(17);
        throw null;
    }
}
