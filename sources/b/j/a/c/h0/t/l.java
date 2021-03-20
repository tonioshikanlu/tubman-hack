package b.j.a.c.h0.t;

import b.j.a.a.k;
import b.j.a.b.f;
import b.j.a.c.a0.a;
import b.j.a.c.d;
import b.j.a.c.h0.i;
import b.j.a.c.n;
import b.j.a.c.x;
import b.j.a.c.y;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class l<T> extends r0<T> implements i {

    /* renamed from: j  reason: collision with root package name */
    public final Boolean f2118j;

    /* renamed from: k  reason: collision with root package name */
    public final DateFormat f2119k;

    /* renamed from: l  reason: collision with root package name */
    public final AtomicReference<DateFormat> f2120l;

    public l(Class<T> cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        this.f2118j = bool;
        this.f2119k = dateFormat;
        this.f2120l = dateFormat == null ? null : new AtomicReference<>();
    }

    public n<?> a(y yVar, d dVar) {
        Locale locale;
        TimeZone timeZone;
        Boolean bool = Boolean.FALSE;
        k.d l2 = l(yVar, dVar, this.f2137h);
        if (l2 == null) {
            return this;
        }
        k.c cVar = l2.f1327i;
        if (cVar.d()) {
            return t(Boolean.TRUE, (DateFormat) null);
        }
        String str = l2.f1326h;
        boolean z = true;
        if (str != null && str.length() > 0) {
            if (l2.d()) {
                locale = l2.f1328j;
            } else {
                locale = yVar.f2320h.f1609i.f1592n;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(l2.f1326h, locale);
            if (l2.e()) {
                timeZone = l2.c();
            } else {
                timeZone = yVar.f2320h.f1609i.f1593o;
                if (timeZone == null) {
                    timeZone = a.f1585q;
                }
            }
            simpleDateFormat.setTimeZone(timeZone);
            return t(bool, simpleDateFormat);
        }
        boolean d = l2.d();
        boolean e2 = l2.e();
        boolean z2 = cVar == k.c.STRING;
        if (!d && !e2 && !z2) {
            return this;
        }
        DateFormat dateFormat = yVar.f2320h.f1609i.f1591m;
        if (dateFormat instanceof b.j.a.c.j0.y) {
            b.j.a.c.j0.y yVar2 = (b.j.a.c.j0.y) dateFormat;
            if (l2.d()) {
                yVar2 = yVar2.j(l2.f1328j);
            }
            if (l2.e()) {
                yVar2 = yVar2.k(l2.c());
            }
            return t(bool, yVar2);
        }
        if (!(dateFormat instanceof SimpleDateFormat)) {
            yVar.m(this.f2137h, String.format("Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", new Object[]{dateFormat.getClass().getName()}));
        }
        SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) dateFormat;
        SimpleDateFormat simpleDateFormat3 = d ? new SimpleDateFormat(simpleDateFormat2.toPattern(), l2.f1328j) : (SimpleDateFormat) simpleDateFormat2.clone();
        TimeZone c = l2.c();
        if (c == null || c.equals(simpleDateFormat3.getTimeZone())) {
            z = false;
        }
        if (z) {
            simpleDateFormat3.setTimeZone(c);
        }
        return t(bool, simpleDateFormat3);
    }

    public boolean d(y yVar, T t) {
        return false;
    }

    public boolean q(y yVar) {
        Boolean bool = this.f2118j;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f2119k != null) {
            return false;
        }
        if (yVar != null) {
            return yVar.K(x.WRITE_DATES_AS_TIMESTAMPS);
        }
        throw new IllegalArgumentException(b.e.a.a.a.d(this.f2137h, b.e.a.a.a.y("Null SerializerProvider passed for ")));
    }

    public void r(Date date, f fVar, y yVar) {
        if (this.f2119k == null) {
            Objects.requireNonNull(yVar);
            if (yVar.K(x.WRITE_DATES_AS_TIMESTAMPS)) {
                fVar.y0(date.getTime());
            } else {
                fVar.Q0(yVar.r().format(date));
            }
        } else {
            DateFormat andSet = this.f2120l.getAndSet((Object) null);
            if (andSet == null) {
                andSet = (DateFormat) this.f2119k.clone();
            }
            fVar.Q0(andSet.format(date));
            this.f2120l.compareAndSet((Object) null, andSet);
        }
    }

    public abstract l<T> t(Boolean bool, DateFormat dateFormat);
}
