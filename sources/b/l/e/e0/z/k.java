package b.l.e.e0.z;

import b.l.e.b0;
import b.l.e.c0;
import b.l.e.g0.b;
import b.l.e.g0.c;
import b.l.e.y;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class k extends b0<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final c0 f5481b = new a();
    public final DateFormat a = new SimpleDateFormat("MMM d, yyyy");

    public class a implements c0 {
        public <T> b0<T> a(b.l.e.k kVar, b.l.e.f0.a<T> aVar) {
            if (aVar.a == Date.class) {
                return new k();
            }
            return null;
        }
    }

    public Object a(b.l.e.g0.a aVar) {
        Date date;
        synchronized (this) {
            if (aVar.v0() == b.NULL) {
                aVar.r0();
                date = null;
            } else {
                try {
                    date = new Date(this.a.parse(aVar.t0()).getTime());
                } catch (ParseException e2) {
                    throw new y((Throwable) e2);
                }
            }
        }
        return date;
    }

    public void b(c cVar, Object obj) {
        Date date = (Date) obj;
        synchronized (this) {
            cVar.q0(date == null ? null : this.a.format(date));
        }
    }
}
