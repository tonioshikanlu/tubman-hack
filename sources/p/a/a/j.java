package p.a.a;

import java.util.ArrayList;
import java.util.List;

public final class j {
    public static final List<j> d = new ArrayList();
    public Object a;

    /* renamed from: b  reason: collision with root package name */
    public q f10524b;
    public j c;

    public j(Object obj, q qVar) {
        this.a = obj;
        this.f10524b = qVar;
    }

    public static j a(q qVar, Object obj) {
        List<j> list = d;
        synchronized (list) {
            int size = list.size();
            if (size <= 0) {
                return new j(obj, qVar);
            }
            j remove = list.remove(size - 1);
            remove.a = obj;
            remove.f10524b = qVar;
            remove.c = null;
            return remove;
        }
    }
}
