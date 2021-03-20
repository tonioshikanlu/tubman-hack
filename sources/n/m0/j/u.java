package n.m0.j;

import e.x.c.i;
import java.io.IOException;

public final class u extends IOException {

    /* renamed from: h  reason: collision with root package name */
    public final b f10376h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(b bVar) {
        super("stream was reset: " + bVar);
        i.e(bVar, "errorCode");
        this.f10376h = bVar;
    }
}
