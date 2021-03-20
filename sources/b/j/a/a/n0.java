package b.j.a.a;

import b.e.a.a.a;
import b.j.a.a.i0;
import java.util.HashMap;
import java.util.Map;

public class n0 implements l0 {
    public Map<i0.a, Object> a;

    public void a(i0.a aVar, Object obj) {
        Map<i0.a, Object> map = this.a;
        if (map == null) {
            this.a = new HashMap();
        } else if (map.containsKey(aVar)) {
            StringBuilder y = a.y("Already had POJO for id (");
            y.append(aVar.f1304j.getClass().getName());
            y.append(") [");
            y.append(aVar);
            y.append("]");
            throw new IllegalStateException(y.toString());
        }
        this.a.put(aVar, obj);
    }

    public boolean b(l0 l0Var) {
        return l0Var.getClass() == n0.class;
    }

    public Object c(i0.a aVar) {
        Map<i0.a, Object> map = this.a;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    public l0 d(Object obj) {
        return new n0();
    }
}
