package b.j.a.c.b0.a0;

import b.j.a.a.k;
import b.j.a.b.i;
import b.j.a.b.l;
import b.j.a.c.j;
import b.j.a.c.j0.g;
import b.j.a.c.j0.y;
import java.lang.reflect.Constructor;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;

public class h {
    public static final HashSet<String> a = new HashSet<>();

    @b.j.a.c.z.a
    public static class a extends b<Calendar> {

        /* renamed from: m  reason: collision with root package name */
        public final Constructor<Calendar> f1673m;

        public a() {
            super(Calendar.class);
            this.f1673m = null;
        }

        public a(a aVar, DateFormat dateFormat, String str) {
            super(aVar, dateFormat, str);
            this.f1673m = aVar.f1673m;
        }

        public a(Class<? extends Calendar> cls) {
            super(cls);
            this.f1673m = g.k(cls, false);
        }

        public b c0(DateFormat dateFormat, String str) {
            return new a(this, dateFormat, str);
        }

        public Object d(i iVar, b.j.a.c.g gVar) {
            Date I = I(iVar, gVar);
            if (I == null) {
                return null;
            }
            Constructor<Calendar> constructor = this.f1673m;
            if (constructor == null) {
                Calendar instance = Calendar.getInstance(gVar.A());
                instance.setTime(I);
                return instance;
            }
            try {
                Calendar newInstance = constructor.newInstance(new Object[0]);
                newInstance.setTimeInMillis(I.getTime());
                TimeZone A = gVar.A();
                if (A != null) {
                    newInstance.setTimeZone(A);
                }
                return newInstance;
            } catch (Exception e2) {
                gVar.B(this.f1761h, I, e2);
                throw null;
            }
        }
    }

    public static abstract class b<T> extends c0<T> implements b.j.a.c.b0.i {

        /* renamed from: k  reason: collision with root package name */
        public final DateFormat f1674k;

        /* renamed from: l  reason: collision with root package name */
        public final String f1675l;

        public b(b<T> bVar, DateFormat dateFormat, String str) {
            super(bVar.f1761h);
            this.f1674k = dateFormat;
            this.f1675l = str;
        }

        public b(Class<?> cls) {
            super(cls);
            this.f1674k = null;
            this.f1675l = null;
        }

        public Date I(i iVar, b.j.a.c.g gVar) {
            Date parse;
            if (this.f1674k == null || !iVar.L0(l.VALUE_STRING)) {
                return super.I(iVar, gVar);
            }
            String trim = iVar.x0().trim();
            if (trim.length() == 0) {
                return null;
            }
            synchronized (this.f1674k) {
                try {
                    parse = this.f1674k.parse(trim);
                } catch (ParseException unused) {
                    gVar.L(this.f1761h, trim, "expected format \"%s\"", this.f1675l);
                    throw null;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return parse;
        }

        public j<?> a(b.j.a.c.g gVar, b.j.a.c.d dVar) {
            y yVar;
            y yVar2;
            Locale locale;
            Locale locale2;
            k.d Y = Y(gVar, dVar, this.f1761h);
            if (Y != null) {
                TimeZone c = Y.c();
                Boolean bool = Y.f1330l;
                String str = Y.f1326h;
                if (str != null && str.length() > 0) {
                    String str2 = Y.f1326h;
                    if (Y.d()) {
                        locale2 = Y.f1328j;
                    } else {
                        locale2 = gVar.f1993j.f1609i.f1592n;
                    }
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, locale2);
                    if (c == null) {
                        c = gVar.A();
                    }
                    simpleDateFormat.setTimeZone(c);
                    if (bool != null) {
                        simpleDateFormat.setLenient(bool.booleanValue());
                    }
                    return c0(simpleDateFormat, str2);
                } else if (c != null) {
                    DateFormat dateFormat = gVar.f1993j.f1609i.f1591m;
                    if (dateFormat.getClass() == y.class) {
                        if (Y.d()) {
                            locale = Y.f1328j;
                        } else {
                            locale = gVar.f1993j.f1609i.f1592n;
                        }
                        y j2 = ((y) dateFormat).k(c).j(locale);
                        yVar2 = j2;
                        if (bool != null) {
                            yVar2 = j2.i(bool);
                        }
                    } else {
                        DateFormat dateFormat2 = (DateFormat) dateFormat.clone();
                        dateFormat2.setTimeZone(c);
                        yVar2 = dateFormat2;
                        if (bool != null) {
                            dateFormat2.setLenient(bool.booleanValue());
                            yVar2 = dateFormat2;
                        }
                    }
                    return c0(yVar2, this.f1675l);
                } else if (bool != null) {
                    DateFormat dateFormat3 = gVar.f1993j.f1609i.f1591m;
                    String str3 = this.f1675l;
                    if (dateFormat3.getClass() == y.class) {
                        y i2 = ((y) dateFormat3).i(bool);
                        StringBuilder sb = new StringBuilder(100);
                        sb.append("[one of: '");
                        sb.append("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
                        sb.append("', '");
                        sb.append("EEE, dd MMM yyyy HH:mm:ss zzz");
                        sb.append("' (");
                        str3 = b.e.a.a.a.q(sb, Boolean.FALSE.equals(i2.f2251j) ? "strict" : "lenient", ")]");
                        yVar = i2;
                    } else {
                        DateFormat dateFormat4 = (DateFormat) dateFormat3.clone();
                        dateFormat4.setLenient(bool.booleanValue());
                        boolean z = dateFormat4 instanceof SimpleDateFormat;
                        yVar = dateFormat4;
                        if (z) {
                            ((SimpleDateFormat) dateFormat4).toPattern();
                            yVar = dateFormat4;
                        }
                    }
                    if (str3 == null) {
                        str3 = "[unknown]";
                    }
                    return c0(yVar, str3);
                }
            }
            return this;
        }

        public abstract b<T> c0(DateFormat dateFormat, String str);
    }

    @b.j.a.c.z.a
    public static class c extends b<Date> {

        /* renamed from: m  reason: collision with root package name */
        public static final c f1676m = new c();

        public c() {
            super(Date.class);
        }

        public c(c cVar, DateFormat dateFormat, String str) {
            super(cVar, dateFormat, str);
        }

        public b c0(DateFormat dateFormat, String str) {
            return new c(this, dateFormat, str);
        }

        public Object d(i iVar, b.j.a.c.g gVar) {
            return I(iVar, gVar);
        }
    }

    public static class d extends b<java.sql.Date> {
        public d() {
            super(java.sql.Date.class);
        }

        public d(d dVar, DateFormat dateFormat, String str) {
            super(dVar, dateFormat, str);
        }

        public b c0(DateFormat dateFormat, String str) {
            return new d(this, dateFormat, str);
        }

        public Object d(i iVar, b.j.a.c.g gVar) {
            Date I = I(iVar, gVar);
            if (I == null) {
                return null;
            }
            return new java.sql.Date(I.getTime());
        }
    }

    public static class e extends b<Timestamp> {
        public e() {
            super(Timestamp.class);
        }

        public e(e eVar, DateFormat dateFormat, String str) {
            super(eVar, dateFormat, str);
        }

        public b c0(DateFormat dateFormat, String str) {
            return new e(this, dateFormat, str);
        }

        public Object d(i iVar, b.j.a.c.g gVar) {
            Date I = I(iVar, gVar);
            if (I == null) {
                return null;
            }
            return new Timestamp(I.getTime());
        }
    }

    static {
        Class[] clsArr = {Calendar.class, GregorianCalendar.class, java.sql.Date.class, Date.class, Timestamp.class};
        for (int i2 = 0; i2 < 5; i2++) {
            a.add(clsArr[i2].getName());
        }
    }
}
