package b.h.a.n;

import b.h.a.q.h.h;
import b.h.a.s.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public final class p implements i {

    /* renamed from: h  reason: collision with root package name */
    public final Set<h<?>> f953h = Collections.newSetFromMap(new WeakHashMap());

    public void d() {
        Iterator it = ((ArrayList) j.e(this.f953h)).iterator();
        while (it.hasNext()) {
            ((h) it.next()).d();
        }
    }

    public void j() {
        Iterator it = ((ArrayList) j.e(this.f953h)).iterator();
        while (it.hasNext()) {
            ((h) it.next()).j();
        }
    }

    public void onStart() {
        Iterator it = ((ArrayList) j.e(this.f953h)).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onStart();
        }
    }
}
