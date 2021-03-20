package n.m0.g;

import e.x.c.i;
import java.io.IOException;

public final class l extends RuntimeException {

    /* renamed from: h  reason: collision with root package name */
    public IOException f10220h;

    /* renamed from: i  reason: collision with root package name */
    public final IOException f10221i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(IOException iOException) {
        super(iOException);
        i.e(iOException, "firstConnectException");
        this.f10221i = iOException;
        this.f10220h = iOException;
    }
}
