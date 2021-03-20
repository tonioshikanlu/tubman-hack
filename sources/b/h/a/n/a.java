package b.h.a.n;

import androidx.annotation.NonNull;
import b.h.a.s.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public class a implements h {
    public final Set<i> a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public boolean f932b;
    public boolean c;

    public void a(@NonNull i iVar) {
        this.a.add(iVar);
        if (this.c) {
            iVar.j();
        } else if (this.f932b) {
            iVar.onStart();
        } else {
            iVar.d();
        }
    }

    public void b(@NonNull i iVar) {
        this.a.remove(iVar);
    }

    public void c() {
        this.c = true;
        Iterator it = ((ArrayList) j.e(this.a)).iterator();
        while (it.hasNext()) {
            ((i) it.next()).j();
        }
    }

    public void d() {
        this.f932b = true;
        Iterator it = ((ArrayList) j.e(this.a)).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStart();
        }
    }

    public void e() {
        this.f932b = false;
        Iterator it = ((ArrayList) j.e(this.a)).iterator();
        while (it.hasNext()) {
            ((i) it.next()).d();
        }
    }
}
