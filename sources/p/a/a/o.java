package p.a.a;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

public class o {
    public final Method a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadMode f10527b;
    public final Class<?> c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10528e;
    public String f;

    public o(Method method, Class<?> cls, ThreadMode threadMode, int i2, boolean z) {
        this.a = method;
        this.f10527b = threadMode;
        this.c = cls;
        this.d = i2;
        this.f10528e = z;
    }

    public final synchronized void a() {
        if (this.f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.a.getName());
            sb.append('(');
            sb.append(this.c.getName());
            this.f = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        a();
        o oVar = (o) obj;
        oVar.a();
        return this.f.equals(oVar.f);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
