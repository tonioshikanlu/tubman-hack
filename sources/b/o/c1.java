package b.o;

import b.o.i2;

public class c1 extends e1 {
    public String a() {
        return "location";
    }

    public void b(i2.p pVar) {
        if (!i2.G("promptLocation()")) {
            m2 m2Var = new m2(pVar, true);
            if (i2.c == null || i2.H()) {
                i2.a(i2.k.ERROR, "OneSignal.init has not been called. Could not prompt for location at this time - moving this operation to awaiting queue.", (Throwable) null);
                i2.d(new i2.r(m2Var));
                return;
            }
            m2Var.run();
        }
    }
}
