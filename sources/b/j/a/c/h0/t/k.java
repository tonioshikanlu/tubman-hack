package b.j.a.c.h0.t;

import b.j.a.b.f;
import b.j.a.c.y;
import b.j.a.c.z.a;
import java.text.DateFormat;
import java.util.Date;

@a
public class k extends l<Date> {

    /* renamed from: m  reason: collision with root package name */
    public static final k f2117m = new k();

    public k() {
        super(Date.class, (Boolean) null, (DateFormat) null);
    }

    public k(Boolean bool, DateFormat dateFormat) {
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
            return;
        }
        r(date, fVar, yVar);
    }

    public l t(Boolean bool, DateFormat dateFormat) {
        return new k(bool, dateFormat);
    }
}
