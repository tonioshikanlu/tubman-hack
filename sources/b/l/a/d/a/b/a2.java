package b.l.a.d.a.b;

import b.l.a.d.a.i.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final /* synthetic */ class a2 implements c {
    public final t a;

    public a2(t tVar) {
        this.a = tVar;
    }

    public final void a(Object obj) {
        t tVar = this.a;
        List list = (List) obj;
        int a2 = tVar.f4625b.a();
        Iterator it = ((ArrayList) tVar.d()).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!list.contains(file.getName()) && t.c(file, true) != ((long) a2)) {
                t.h(file);
            }
        }
    }
}
