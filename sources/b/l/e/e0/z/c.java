package b.l.e.e0.z;

import b.l.e.b0;
import b.l.e.c0;
import b.l.e.e0.p;
import b.l.e.k;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class c extends b0<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final c0 f5464b = new a();
    public final List<DateFormat> a;

    public class a implements c0 {
        public <T> b0<T> a(k kVar, b.l.e.f0.a<T> aVar) {
            if (aVar.a == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (p.a >= 9) {
            arrayList.add(b.l.a.c.b.a.a0(2, 2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3 = b.l.e.e0.z.u.a.b(r3, new java.text.ParsePosition(0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(b.l.e.g0.a r3) {
        /*
            r2 = this;
            b.l.e.g0.b r0 = r3.v0()
            b.l.e.g0.b r1 = b.l.e.g0.b.NULL
            if (r0 != r1) goto L_0x000d
            r3.r0()
            r3 = 0
            goto L_0x0034
        L_0x000d:
            java.lang.String r3 = r3.t0()
            monitor-enter(r2)
            java.util.List<java.text.DateFormat> r0 = r2.a     // Catch:{ all -> 0x003c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x003c }
        L_0x0018:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x003c }
            java.text.DateFormat r1 = (java.text.DateFormat) r1     // Catch:{ all -> 0x003c }
            java.util.Date r3 = r1.parse(r3)     // Catch:{ ParseException -> 0x0018 }
            goto L_0x0033
        L_0x0029:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch:{ ParseException -> 0x0035 }
            r1 = 0
            r0.<init>(r1)     // Catch:{ ParseException -> 0x0035 }
            java.util.Date r3 = b.l.e.e0.z.u.a.b(r3, r0)     // Catch:{ ParseException -> 0x0035 }
        L_0x0033:
            monitor-exit(r2)
        L_0x0034:
            return r3
        L_0x0035:
            r0 = move-exception
            b.l.e.y r1 = new b.l.e.y     // Catch:{ all -> 0x003c }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x003c }
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.e.e0.z.c.a(b.l.e.g0.a):java.lang.Object");
    }

    public void b(b.l.e.g0.c cVar, Object obj) {
        Date date = (Date) obj;
        synchronized (this) {
            if (date == null) {
                cVar.Y();
            } else {
                cVar.q0(this.a.get(0).format(date));
            }
        }
    }
}
