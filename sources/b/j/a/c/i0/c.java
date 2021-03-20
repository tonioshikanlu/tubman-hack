package b.j.a.c.i0;

import b.e.a.a.a;
import java.util.ArrayList;

public final class c {
    public final c a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<?> f2161b;
    public ArrayList<j> c;

    public c(c cVar, Class<?> cls) {
        this.a = cVar;
        this.f2161b = cls;
    }

    public c(Class<?> cls) {
        this.a = null;
        this.f2161b = cls;
    }

    public String toString() {
        StringBuilder y = a.y("[ClassStack (self-refs: ");
        ArrayList<j> arrayList = this.c;
        y.append(arrayList == null ? "0" : String.valueOf(arrayList.size()));
        y.append(')');
        for (c cVar = this; cVar != null; cVar = cVar.a) {
            y.append(' ');
            y.append(cVar.f2161b.getName());
        }
        y.append(']');
        return y.toString();
    }
}
