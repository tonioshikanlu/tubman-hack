package b.l.e.e0.z;

import b.l.e.b0;
import b.l.e.c0;
import b.l.e.g0.b;
import b.l.e.g0.c;
import b.l.e.k;
import b.l.e.y;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class l extends b0<Time> {

    /* renamed from: b  reason: collision with root package name */
    public static final c0 f5482b = new a();
    public final DateFormat a = new SimpleDateFormat("hh:mm:ss a");

    public class a implements c0 {
        public <T> b0<T> a(k kVar, b.l.e.f0.a<T> aVar) {
            if (aVar.a == Time.class) {
                return new l();
            }
            return null;
        }
    }

    public Object a(b.l.e.g0.a aVar) {
        synchronized (this) {
            if (aVar.v0() == b.NULL) {
                aVar.r0();
                return null;
            }
            try {
                Time time = new Time(this.a.parse(aVar.t0()).getTime());
                return time;
            } catch (ParseException e2) {
                throw new y((Throwable) e2);
            }
        }
    }

    public void b(c cVar, Object obj) {
        Time time = (Time) obj;
        synchronized (this) {
            cVar.q0(time == null ? null : this.a.format(time));
        }
    }
}
