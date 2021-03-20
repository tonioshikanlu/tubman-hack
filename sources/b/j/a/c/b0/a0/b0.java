package b.j.a.c.b0.a0;

import b.j.a.c.b0.a0.a0;
import b.j.a.c.b0.q;
import b.j.a.c.c;
import b.j.a.c.f;
import b.j.a.c.i;
import b.j.a.c.j0.g;
import b.j.a.c.o;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public class b0 implements q, Serializable {
    public o a(i iVar, f fVar, c cVar) {
        a0.e eVar;
        int i2;
        Class<?> cls = iVar.f2152h;
        if (cls.isPrimitive()) {
            cls = g.H(cls);
        }
        Class<Object> cls2 = Object.class;
        Class<String> cls3 = String.class;
        if (cls == cls3 || cls == cls2 || cls == CharSequence.class) {
            if (cls == cls3) {
                eVar = a0.e.f1642k;
            } else if (cls != cls2) {
                return new a0.e(cls);
            } else {
                eVar = a0.e.f1643l;
            }
            return eVar;
        }
        if (cls == UUID.class) {
            i2 = 12;
        } else if (cls == Integer.class) {
            i2 = 5;
        } else if (cls == Long.class) {
            i2 = 6;
        } else if (cls == Date.class) {
            i2 = 10;
        } else if (cls == Calendar.class) {
            i2 = 11;
        } else if (cls == Boolean.class) {
            i2 = 1;
        } else if (cls == Byte.class) {
            i2 = 2;
        } else if (cls == Character.class) {
            i2 = 4;
        } else if (cls == Short.class) {
            i2 = 3;
        } else if (cls == Float.class) {
            i2 = 7;
        } else if (cls == Double.class) {
            i2 = 8;
        } else if (cls == URI.class) {
            i2 = 13;
        } else if (cls == URL.class) {
            i2 = 14;
        } else if (cls == Class.class) {
            i2 = 15;
        } else if (cls == Locale.class) {
            return new a0(9, cls, m.f0(Locale.class));
        } else {
            if (cls == Currency.class) {
                return new a0(16, cls, m.f0(Currency.class));
            }
            if (cls != byte[].class) {
                return null;
            }
            i2 = 17;
        }
        return new a0(i2, cls);
    }
}
