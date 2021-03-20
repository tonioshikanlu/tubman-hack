package b.j.a.c.h0.t;

import b.j.a.b.f;
import b.j.a.c.y;
import b.j.a.c.z.a;
import java.text.DateFormat;
import java.util.Calendar;

@a
public class h extends l<Calendar> {

    /* renamed from: m  reason: collision with root package name */
    public static final h f2115m = new h();

    public h() {
        super(Calendar.class, (Boolean) null, (DateFormat) null);
    }

    public h(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }

    public void f(Object obj, f fVar, y yVar) {
        long j2;
        Calendar calendar = (Calendar) obj;
        if (q(yVar)) {
            if (calendar == null) {
                j2 = 0;
            } else {
                j2 = calendar.getTimeInMillis();
            }
            fVar.y0(j2);
            return;
        }
        r(calendar.getTime(), fVar, yVar);
    }

    public l t(Boolean bool, DateFormat dateFormat) {
        return new h(bool, dateFormat);
    }
}
