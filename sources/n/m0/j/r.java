package n.m0.j;

import e.x.c.i;
import java.util.List;
import o.e;
import o.g;

public final class r implements s {
    public boolean a(int i2, List<c> list) {
        i.e(list, "requestHeaders");
        return true;
    }

    public boolean b(int i2, List<c> list, boolean z) {
        i.e(list, "responseHeaders");
        return true;
    }

    public void c(int i2, b bVar) {
        i.e(bVar, "errorCode");
    }

    public boolean d(int i2, g gVar, int i3, boolean z) {
        i.e(gVar, "source");
        ((e) gVar).skip((long) i3);
        return true;
    }
}
