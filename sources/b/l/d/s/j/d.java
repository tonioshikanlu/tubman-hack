package b.l.d.s.j;

import androidx.annotation.NonNull;
import b.l.d.s.a;
import java.io.Writer;

public class d implements a {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    public void a(@NonNull Object obj, @NonNull Writer writer) {
        e eVar = this.a;
        f fVar = new f(writer, eVar.a, eVar.f5291b, eVar.c, eVar.d);
        fVar.g(obj, false);
        fVar.i();
        fVar.f5292b.flush();
    }
}
