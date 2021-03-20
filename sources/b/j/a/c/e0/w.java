package b.j.a.c.e0;

import b.e.a.a.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class w {
    public static final Class<?>[] c = new Class[0];
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<?>[] f1956b;

    public w(String str, Class<?>[] clsArr) {
        this.a = str;
        this.f1956b = clsArr == null ? c : clsArr;
    }

    public w(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        this.a = "";
        this.f1956b = parameterTypes == null ? c : parameterTypes;
    }

    public w(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != w.class) {
            return false;
        }
        w wVar = (w) obj;
        if (!this.a.equals(wVar.a)) {
            return false;
        }
        Class<?>[] clsArr = wVar.f1956b;
        int length = this.f1956b.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (clsArr[i2] != this.f1956b[i2]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.a.hashCode() + this.f1956b.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(");
        return a.o(sb, this.f1956b.length, "-args)");
    }
}
