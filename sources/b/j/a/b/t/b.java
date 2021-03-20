package b.j.a.b.t;

import java.util.HashSet;

public class b {
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    public String f1502b;
    public String c;
    public HashSet<String> d;

    public b(Object obj) {
        this.a = obj;
    }

    public b a() {
        return new b(this.a);
    }

    public boolean b(String str) {
        String str2 = this.f1502b;
        if (str2 == null) {
            this.f1502b = str;
            return false;
        } else if (str.equals(str2)) {
            return true;
        } else {
            String str3 = this.c;
            if (str3 == null) {
                this.c = str;
                return false;
            } else if (str.equals(str3)) {
                return true;
            } else {
                if (this.d == null) {
                    HashSet<String> hashSet = new HashSet<>(16);
                    this.d = hashSet;
                    hashSet.add(this.f1502b);
                    this.d.add(this.c);
                }
                return !this.d.add(str);
            }
        }
    }

    public void c() {
        this.f1502b = null;
        this.c = null;
        this.d = null;
    }
}
