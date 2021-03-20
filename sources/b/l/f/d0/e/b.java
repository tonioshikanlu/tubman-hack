package b.l.f.d0.e;

import b.l.f.d0.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class b {
    public final Map<Integer, Integer> a = new HashMap();

    public int[] a() {
        ArrayList arrayList = new ArrayList();
        int i2 = -1;
        for (Map.Entry next : this.a.entrySet()) {
            if (((Integer) next.getValue()).intValue() > i2) {
                i2 = ((Integer) next.getValue()).intValue();
                arrayList.clear();
            } else if (((Integer) next.getValue()).intValue() != i2) {
            }
            arrayList.add(next.getKey());
        }
        return a.b(arrayList);
    }

    public void b(int i2) {
        Integer num = this.a.get(Integer.valueOf(i2));
        if (num == null) {
            num = 0;
        }
        this.a.put(Integer.valueOf(i2), Integer.valueOf(num.intValue() + 1));
    }
}
