package b.l.d.q.f.i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.d.q.f.i.v;

public final class d extends v.c {
    public final w<v.c.a> a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5207b;

    public d(w wVar, String str, a aVar) {
        this.a = wVar;
        this.f5207b = str;
    }

    @NonNull
    public w<v.c.a> a() {
        return this.a;
    }

    @Nullable
    public String b() {
        return this.f5207b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.c)) {
            return false;
        }
        v.c cVar = (v.c) obj;
        if (this.a.equals(cVar.a())) {
            String str = this.f5207b;
            String b2 = cVar.b();
            if (str == null) {
                if (b2 == null) {
                    return true;
                }
            } else if (str.equals(b2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.f5207b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("FilesPayload{files=");
        y.append(this.a);
        y.append(", orgId=");
        return b.e.a.a.a.q(y, this.f5207b, "}");
    }
}
