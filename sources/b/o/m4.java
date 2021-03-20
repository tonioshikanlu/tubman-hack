package b.o;

import b.o.i2;

public class m4 extends l3 {
    public final /* synthetic */ l4 a;

    public m4(l4 l4Var) {
        this.a = l4Var;
    }

    public void a(int i2, String str, Throwable th) {
        i2.k kVar = i2.k.WARN;
        i2.a(kVar, "Failed last request. statusCode: " + i2 + "\nresponse: " + str, (Throwable) null);
        if (l4.a(this.a, i2, str, "already logged out of email")) {
            l4.b(this.a);
        } else if (l4.a(this.a, i2, str, "not a valid device_type")) {
            l4.c(this.a);
        } else {
            l4.d(this.a, i2);
        }
    }

    public void b(String str) {
        l4.b(this.a);
    }
}
