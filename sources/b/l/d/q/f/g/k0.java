package b.l.d.q.f.g;

import android.content.Context;
import androidx.annotation.NonNull;
import b.l.a.a.e.a;
import b.l.a.a.f.a;
import b.l.a.a.f.b;
import b.l.a.a.f.h;
import b.l.a.a.f.i;
import b.l.a.a.f.j;
import b.l.a.a.f.k;
import b.l.a.a.f.q.e;
import b.l.d.q.f.h.b;
import b.l.d.q.f.i.v;
import b.l.d.q.f.k.g;
import b.l.d.q.f.k.h;
import b.l.d.q.f.l.c;
import b.l.d.q.f.m.f;
import b.l.d.q.f.n.d;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

public class k0 {
    public final y a;

    /* renamed from: b  reason: collision with root package name */
    public final g f5095b;
    public final c c;
    public final b d;

    /* renamed from: e  reason: collision with root package name */
    public final m0 f5096e;

    public k0(y yVar, g gVar, c cVar, b bVar, m0 m0Var) {
        this.a = yVar;
        this.f5095b = gVar;
        this.c = cVar;
        this.d = bVar;
        this.f5096e = m0Var;
    }

    public static k0 a(Context context, f0 f0Var, h hVar, a aVar, b bVar, m0 m0Var, d dVar, f fVar) {
        File file = new File(new File(hVar.a.getFilesDir(), ".com.google.firebase.crashlytics").getPath());
        Context context2 = context;
        f0 f0Var2 = f0Var;
        a aVar2 = aVar;
        y yVar = new y(context, f0Var, aVar, dVar);
        g gVar = new g(file, fVar);
        b.l.d.q.f.i.x.h hVar2 = c.f5268b;
        k.b(context);
        k a2 = k.a();
        a aVar3 = new a(c.c, c.d);
        Objects.requireNonNull(a2);
        Set<T> unmodifiableSet = Collections.unmodifiableSet(a.f);
        h.a a3 = b.l.a.a.f.h.a();
        a3.b("cct");
        b.C0054b bVar2 = (b.C0054b) a3;
        bVar2.f2471b = aVar3.b();
        b.l.a.a.f.h a4 = bVar2.a();
        b.l.a.a.a aVar4 = new b.l.a.a.a("json");
        b.l.a.a.c<v, byte[]> cVar = c.f5269e;
        if (unmodifiableSet.contains(aVar4)) {
            return new k0(yVar, gVar, new c(new i(a4, "FIREBASE_CRASHLYTICS_REPORT", aVar4, cVar, a2), cVar), bVar, m0Var);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{aVar4, unmodifiableSet}));
    }

    @NonNull
    public List<String> b() {
        List<File> b2 = g.b(this.f5095b.f5265b);
        Collections.sort(b2, g.f5263j);
        ArrayList arrayList = new ArrayList();
        for (File name : b2) {
            arrayList.add(name.getName());
        }
        return arrayList;
    }

    public b.l.a.c.k.h<Void> c(@NonNull Executor executor) {
        g gVar = this.f5095b;
        List<File> c2 = gVar.c();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(((ArrayList) c2).size());
        Iterator it = ((ArrayList) gVar.c()).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                arrayList.add(new b(g.f5262i.f(g.h(file)), file.getName()));
            } catch (IOException e2) {
                b.l.d.q.f.b bVar = b.l.d.q.f.b.a;
                bVar.c("Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            z zVar = (z) it2.next();
            c cVar = this.c;
            Objects.requireNonNull(cVar);
            v a2 = zVar.a();
            b.l.a.c.k.i iVar = new b.l.a.c.k.i();
            b.l.a.a.d<v> dVar = cVar.a;
            b.l.a.a.b bVar2 = b.l.a.a.b.HIGHEST;
            Objects.requireNonNull(a2, "Null payload");
            b.l.d.q.f.l.a aVar = new b.l.d.q.f.l.a(iVar, zVar);
            i iVar2 = (i) dVar;
            j jVar = iVar2.f2486e;
            b.l.a.a.f.h hVar = iVar2.a;
            Objects.requireNonNull(hVar, "Null transportContext");
            String str = iVar2.f2485b;
            Objects.requireNonNull(str, "Null transportName");
            b.l.a.a.c<T, byte[]> cVar2 = iVar2.d;
            Objects.requireNonNull(cVar2, "Null transformer");
            b.l.a.a.a aVar2 = iVar2.c;
            Objects.requireNonNull(aVar2, "Null encoding");
            k kVar = (k) jVar;
            e eVar = kVar.c;
            h.a a3 = b.l.a.a.f.h.a();
            a3.b(hVar.b());
            a3.c(bVar2);
            b.C0054b bVar3 = (b.C0054b) a3;
            bVar3.f2471b = hVar.c();
            b.l.a.a.f.h a4 = bVar3.a();
            a.b bVar4 = new a.b();
            bVar4.f = new HashMap();
            bVar4.e(kVar.a.a());
            bVar4.g(kVar.f2488b.a());
            bVar4.f(str);
            b.l.d.q.f.l.b bVar5 = (b.l.d.q.f.l.b) cVar2;
            bVar4.d(new b.l.a.a.f.d(aVar2, c.f5268b.g(a2).getBytes(Charset.forName("UTF-8"))));
            bVar4.f2468b = null;
            eVar.a(a4, bVar4.b(), aVar);
            arrayList2.add(iVar.a.g(executor, new i0(this)));
        }
        return b.l.a.c.b.a.D0(arrayList2);
    }
}
