package b.q.a.j;

public class c {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public int f6793b;
    public int c;

    public c(int i2, int i3, int i4) {
        this.a = i2;
        this.f6793b = i3;
        this.c = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a == cVar.a && this.f6793b == cVar.f6793b) {
            return this.c == cVar.c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a * 31) + this.f6793b) * 31) + this.c;
    }
}
