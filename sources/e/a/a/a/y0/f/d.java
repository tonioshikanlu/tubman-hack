package e.a.a.a.y0.f;

import b.e.a.a.a;

public final class d implements Comparable<d> {

    /* renamed from: h  reason: collision with root package name */
    public final String f9210h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f9211i;

    public d(String str, boolean z) {
        if (str != null) {
            this.f9210h = str;
            this.f9211i = z;
            return;
        }
        d(0);
        throw null;
    }

    public static /* synthetic */ void d(int i2) {
        String str = (i2 == 1 || i2 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 1 || i2 == 2) ? 2 : 3)];
        if (i2 == 1 || i2 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i2 == 1) {
            objArr[1] = "asString";
        } else if (i2 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[1] = "getIdentifier";
        }
        switch (i2) {
            case 1:
            case 2:
                break;
            case 3:
                objArr[2] = "identifier";
                break;
            case 4:
                objArr[2] = "isValidIdentifier";
                break;
            case 5:
                objArr[2] = "special";
                break;
            case 6:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 1 || i2 == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static d j(String str) {
        if (str != null) {
            return str.startsWith("<") ? n(str) : l(str);
        }
        d(6);
        throw null;
    }

    public static d l(String str) {
        if (str != null) {
            return new d(str, false);
        }
        d(3);
        throw null;
    }

    public static boolean m(String str) {
        if (str == null) {
            d(4);
            throw null;
        } else if (str.isEmpty() || str.startsWith("<")) {
            return false;
        } else {
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (charAt == '.' || charAt == '/' || charAt == '\\') {
                    return false;
                }
            }
            return true;
        }
    }

    public static d n(String str) {
        if (str == null) {
            d(5);
            throw null;
        } else if (str.startsWith("<")) {
            return new d(str, true);
        } else {
            throw new IllegalArgumentException(a.m("special name must start with '<': ", str));
        }
    }

    public int compareTo(Object obj) {
        return this.f9210h.compareTo(((d) obj).f9210h);
    }

    public String e() {
        String str = this.f9210h;
        if (str != null) {
            return str;
        }
        d(1);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f9211i == dVar.f9211i && this.f9210h.equals(dVar.f9210h);
    }

    public String h() {
        if (!this.f9211i) {
            String e2 = e();
            if (e2 != null) {
                return e2;
            }
            d(2);
            throw null;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    public int hashCode() {
        return (this.f9210h.hashCode() * 31) + (this.f9211i ? 1 : 0);
    }

    public String toString() {
        return this.f9210h;
    }
}
