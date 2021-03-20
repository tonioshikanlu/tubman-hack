package b.j.a.b;

import b.j.a.b.s.a;

public abstract class k {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public int f1435b;

    public k() {
    }

    public k(int i2, int i3) {
        this.a = i2;
        this.f1435b = i3;
    }

    public k(k kVar) {
        this.a = kVar.a;
        this.f1435b = kVar.f1435b;
    }

    public abstract String a();

    public abstract Object b();

    public abstract k c();

    public final boolean d() {
        return this.a == 1;
    }

    public final boolean e() {
        return this.a == 2;
    }

    public final boolean f() {
        return this.a == 0;
    }

    public abstract void g(Object obj);

    public String h() {
        int i2 = this.a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? "?" : "Object" : "Array" : "root";
    }

    public String toString() {
        char c;
        StringBuilder sb = new StringBuilder(64);
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 != 1) {
                sb.append('{');
                String a2 = a();
                if (a2 != null) {
                    sb.append('\"');
                    a.a(sb, a2);
                    sb.append('\"');
                } else {
                    sb.append('?');
                }
                c = '}';
            } else {
                sb.append('[');
                int i3 = this.f1435b;
                if (i3 < 0) {
                    i3 = 0;
                }
                sb.append(i3);
                c = ']';
            }
            sb.append(c);
        } else {
            sb.append("/");
        }
        return sb.toString();
    }
}
