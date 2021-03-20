package b.j.a.b;

import b.e.a.a.a;
import java.io.IOException;

public class j extends IOException {

    /* renamed from: h  reason: collision with root package name */
    public g f1434h;

    public j(String str) {
        super(str);
    }

    public j(String str, g gVar) {
        super(str);
        this.f1434h = gVar;
    }

    public j(String str, g gVar, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this.f1434h = gVar;
    }

    public String a() {
        return null;
    }

    public String b() {
        return super.getMessage();
    }

    public Object c() {
        return null;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        g gVar = this.f1434h;
        String a = a();
        if (gVar == null && a == null) {
            return message;
        }
        StringBuilder x = a.x(100, message);
        if (a != null) {
            x.append(a);
        }
        if (gVar != null) {
            x.append(10);
            x.append(" at ");
            x.append(gVar.toString());
        }
        return x.toString();
    }

    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public j(String str, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this.f1434h = null;
    }
}
