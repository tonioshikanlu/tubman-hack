package b.j.a.c.d0;

import b.j.a.b.f;
import b.j.a.b.l;
import b.j.a.b.v.b;
import b.j.a.c.h0.t.r0;
import b.j.a.c.y;
import java.nio.file.Path;

public class d extends r0<Path> {
    public d() {
        super(Path.class);
    }

    public void f(Object obj, f fVar, y yVar) {
        fVar.Q0(((Path) obj).toUri().toString());
    }

    public void g(Object obj, f fVar, y yVar, b.j.a.c.f0.f fVar2) {
        Path path = (Path) obj;
        b d = fVar2.d(path, l.VALUE_STRING);
        d.f1539b = Path.class;
        b e2 = fVar2.e(fVar, d);
        fVar.Q0(path.toUri().toString());
        fVar2.f(fVar, e2);
    }
}
