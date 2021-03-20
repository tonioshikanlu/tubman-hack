package b.l.e;

import b.l.e.g0.a;
import b.l.e.g0.c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

public class j extends b0<AtomicLongArray> {
    public final /* synthetic */ b0 a;

    public j(b0 b0Var) {
        this.a = b0Var;
    }

    public Object a(a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.Y()) {
            arrayList.add(Long.valueOf(((Number) this.a.a(aVar)).longValue()));
        }
        aVar.H();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
        }
        return atomicLongArray;
    }

    public void b(c cVar, Object obj) {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        cVar.e();
        int length = atomicLongArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            this.a.b(cVar, Long.valueOf(atomicLongArray.get(i2)));
        }
        cVar.H();
    }
}
