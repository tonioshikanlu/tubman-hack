package b.h.a.n;

import androidx.annotation.Nullable;
import b.e.a.a.a;
import b.h.a.q.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public class n {
    public final Set<b> a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f946b = new ArrayList();
    public boolean c;

    public boolean a(@Nullable b bVar) {
        boolean z = true;
        if (bVar == null) {
            return true;
        }
        boolean remove = this.a.remove(bVar);
        if (!this.f946b.remove(bVar) && !remove) {
            z = false;
        }
        if (z) {
            bVar.clear();
        }
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.a.size());
        sb.append(", isPaused=");
        return a.s(sb, this.c, "}");
    }
}
