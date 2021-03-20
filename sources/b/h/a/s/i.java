package b.h.a.s;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.e.a.a.a;

public class i {
    public Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f1017b;
    public Class<?> c;

    public i() {
    }

    public i(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.a = cls;
        this.f1017b = cls2;
        this.c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.f1017b.equals(iVar.f1017b) && j.b(this.c, iVar.c);
    }

    public int hashCode() {
        int hashCode = (this.f1017b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class<?> cls = this.c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = a.y("MultiClassKey{first=");
        y.append(this.a);
        y.append(", second=");
        y.append(this.f1017b);
        y.append('}');
        return y.toString();
    }
}
