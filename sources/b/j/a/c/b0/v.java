package b.j.a.c.b0;

import b.j.a.b.g;
import b.j.a.b.i;
import b.j.a.c.b0.z.y;
import b.j.a.c.k;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class v extends k {

    /* renamed from: k  reason: collision with root package name */
    public y f1803k;

    /* renamed from: l  reason: collision with root package name */
    public List<w> f1804l;

    public v(i iVar, String str) {
        super(iVar, str);
        this.f1804l = new ArrayList();
    }

    public v(i iVar, String str, g gVar, y yVar) {
        super((Closeable) iVar, str, gVar);
        this.f1803k = yVar;
    }

    public String getMessage() {
        String d = d();
        if (this.f1804l == null) {
            return d;
        }
        StringBuilder sb = new StringBuilder(d);
        Iterator<w> it = this.f1804l.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append('.');
        return sb.toString();
    }
}
