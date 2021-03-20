package o;

import e.x.c.i;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;

public final class y extends b {

    /* renamed from: l  reason: collision with root package name */
    public final Socket f10495l;

    public y(Socket socket) {
        i.e(socket, "socket");
        this.f10495l = socket;
    }

    public IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.AssertionError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Exception} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k() {
        /*
            r5 = this;
            java.net.Socket r0 = r5.f10495l     // Catch:{ Exception -> 0x0018, AssertionError -> 0x0006 }
            r0.close()     // Catch:{ Exception -> 0x0018, AssertionError -> 0x0006 }
            goto L_0x0033
        L_0x0006:
            r0 = move-exception
            boolean r1 = e.a.a.a.y0.m.o1.c.L(r0)
            if (r1 == 0) goto L_0x0017
            java.util.logging.Logger r1 = o.p.a
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x0022
        L_0x0017:
            throw r0
        L_0x0018:
            r0 = move-exception
            java.util.logging.Logger r1 = o.p.a
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x0022:
            java.lang.String r4 = "Failed to close timed out socket "
            r3.append(r4)
            java.net.Socket r4 = r5.f10495l
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.log(r2, r3, r0)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.k():void");
    }
}
