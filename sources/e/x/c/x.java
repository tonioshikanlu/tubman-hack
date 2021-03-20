package e.x.c;

import b.e.a.a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class x {
    public final ArrayList<Object> a;

    public x(int i2) {
        this.a = new ArrayList<>(i2);
    }

    public void a(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    this.a.add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.a.add(it.next());
                }
            } else {
                StringBuilder y = a.y("Don't know how to spread ");
                y.append(obj.getClass());
                throw new UnsupportedOperationException(y.toString());
            }
        }
    }

    public int b() {
        return this.a.size();
    }
}
