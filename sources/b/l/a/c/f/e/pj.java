package b.l.a.c.f.e;

import b.l.a.c.b.a;
import com.google.android.gms.common.api.Status;

public final class pj extends ei {
    public final String c;
    public final /* synthetic */ sj d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pj(sj sjVar, ei eiVar, String str) {
        super(eiVar.a, eiVar.f2940b);
        this.d = sjVar;
        this.c = str;
    }

    public final void c(String str) {
        sj.d.a("onCodeSent", new Object[0]);
        rj rjVar = this.d.c.get(this.c);
        if (rjVar != null) {
            for (ei c2 : rjVar.f3258b) {
                c2.c(str);
            }
            rjVar.f3260g = true;
            rjVar.d = str;
            if (rjVar.a <= 0) {
                this.d.h(this.c);
            } else if (!rjVar.c) {
                this.d.i(this.c);
            } else if (!a.M1(rjVar.f3259e)) {
                sj.f(this.d, this.c);
            }
        }
    }

    public final void f(Status status) {
        b.l.a.c.c.n.a aVar = sj.d;
        String Z = a.Z(status.f7263i);
        String str = status.f7264j;
        StringBuilder sb = new StringBuilder(String.valueOf(Z).length() + 39 + String.valueOf(str).length());
        sb.append("SMS verification code request failed: ");
        sb.append(Z);
        sb.append(" ");
        sb.append(str);
        aVar.b(sb.toString(), new Object[0]);
        rj rjVar = this.d.c.get(this.c);
        if (rjVar != null) {
            for (ei f : rjVar.f3258b) {
                f.f(status);
            }
            this.d.e(this.c);
        }
    }
}
