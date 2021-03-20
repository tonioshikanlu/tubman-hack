package b.o;

import b.e.a.a.a;
import b.o.i2;

public class v1 extends l3 {
    public final /* synthetic */ String a;

    public v1(w1 w1Var, String str) {
        this.a = str;
    }

    public void a(int i2, String str, Throwable th) {
        i2.k kVar = i2.k.ERROR;
        i2.a(kVar, "Receive receipt failed with statusCode: " + i2 + " response: " + str, (Throwable) null);
    }

    public void b(String str) {
        i2.k kVar = i2.k.DEBUG;
        StringBuilder y = a.y("Receive receipt sent for notificationID: ");
        y.append(this.a);
        i2.a(kVar, y.toString(), (Throwable) null);
    }
}
