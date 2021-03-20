package b.j.a.c.h0.t;

import b.j.a.b.f;
import b.j.a.c.y;
import b.j.a.c.z.a;
import java.sql.Date;
import java.text.DateFormat;

@a
public class h0 extends l<Date> {
    public h0() {
        super(Date.class, (Boolean) null, (DateFormat) null);
    }

    public h0(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }

    public void f(Object obj, f fVar, y yVar) {
        long j2;
        Date date = (Date) obj;
        if (q(yVar)) {
            if (date == null) {
                j2 = 0;
            } else {
                j2 = date.getTime();
            }
            fVar.y0(j2);
        } else if (this.f2119k == null) {
            fVar.Q0(date.toString());
        } else {
            r(date, fVar, yVar);
        }
    }

    public l t(Boolean bool, DateFormat dateFormat) {
        return new h0(bool, dateFormat);
    }
}
