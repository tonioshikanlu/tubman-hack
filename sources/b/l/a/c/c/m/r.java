package b.l.a.c.c.m;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class r {
    public final List<String> a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Object f2805b;

    public r(Object obj, q0 q0Var) {
        Objects.requireNonNull(obj, "null reference");
        this.f2805b = obj;
    }

    public final r a(String str, @Nullable Object obj) {
        List<String> list = this.a;
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(valueOf.length() + str.length() + 1);
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        list.add(sb.toString());
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.f2805b.getClass().getSimpleName());
        sb.append('{');
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(this.a.get(i2));
            if (i2 < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
