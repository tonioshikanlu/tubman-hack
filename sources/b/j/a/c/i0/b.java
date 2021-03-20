package b.j.a.c.i0;

import java.io.Serializable;

public final class b implements Comparable<b>, Serializable {

    /* renamed from: h  reason: collision with root package name */
    public String f2158h;

    /* renamed from: i  reason: collision with root package name */
    public Class<?> f2159i;

    /* renamed from: j  reason: collision with root package name */
    public int f2160j;

    public b() {
        this.f2159i = null;
        this.f2158h = null;
        this.f2160j = 0;
    }

    public b(Class<?> cls) {
        this.f2159i = cls;
        String name = cls.getName();
        this.f2158h = name;
        this.f2160j = name.hashCode();
    }

    public int compareTo(Object obj) {
        return this.f2158h.compareTo(((b) obj).f2158h);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == b.class) {
            return ((b) obj).f2159i == this.f2159i;
        }
        return false;
    }

    public int hashCode() {
        return this.f2160j;
    }

    public String toString() {
        return this.f2158h;
    }
}
