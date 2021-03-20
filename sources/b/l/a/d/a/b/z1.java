package b.l.a.d.a.b;

import b.l.a.d.a.i.r;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final /* synthetic */ class z1 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final c2 f4654h;

    public z1(c2 c2Var) {
        this.f4654h = c2Var;
    }

    public final void run() {
        c2 c2Var = this.f4654h;
        n2 a = c2Var.f4494b.a();
        t tVar = c2Var.a;
        Objects.requireNonNull(tVar);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            Iterator it = ((ArrayList) tVar.d()).iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                b i2 = tVar.i(file.getName());
                if (i2 != null) {
                    hashMap2.put(file.getName(), i2);
                }
            }
        } catch (IOException e2) {
            t.c.b(6, "Could not process directory while scanning installed packs: %s", new Object[]{e2});
        }
        for (String str : hashMap2.keySet()) {
            hashMap.put(str, Long.valueOf(tVar.s(str)));
        }
        r<List<String>> e3 = a.e(hashMap);
        t tVar2 = c2Var.a;
        tVar2.getClass();
        e3.c(c2Var.d.a(), new a2(tVar2));
        e3.b(c2Var.d.a(), b2.a);
    }
}
