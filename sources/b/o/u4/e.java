package b.o.u4;

import b.o.i2;
import b.o.j1;
import b.o.z1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class e {
    public ConcurrentHashMap<String, a> a;

    /* renamed from: b  reason: collision with root package name */
    public c f6315b;

    public e(z1 z1Var, j1 j1Var) {
        ConcurrentHashMap<String, a> concurrentHashMap = new ConcurrentHashMap<>();
        this.a = concurrentHashMap;
        this.f6315b = new c(z1Var);
        concurrentHashMap.put(b.f, new b(this.f6315b, j1Var));
        this.a.put(d.f, new d(this.f6315b, j1Var));
    }

    public List<a> a() {
        ArrayList arrayList = new ArrayList();
        a d = d();
        if (d != null) {
            arrayList.add(d);
        }
        a c = c();
        if (c != null) {
            arrayList.add(c);
        }
        return arrayList;
    }

    public List<a> b(i2.f fVar) {
        a d;
        ArrayList arrayList = new ArrayList();
        if (fVar.equals(i2.f.APP_CLOSE)) {
            return arrayList;
        }
        if (fVar.equals(i2.f.APP_OPEN) && (d = d()) != null) {
            arrayList.add(d);
        }
        a c = c();
        if (c != null) {
            arrayList.add(c);
        }
        return arrayList;
    }

    public a c() {
        return this.a.get(b.f);
    }

    public a d() {
        return this.a.get(d.f);
    }
}
