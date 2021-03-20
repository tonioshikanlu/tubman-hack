package b.g.a.g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.e.q;
import b.l.e.v;
import java.util.Date;
import java.util.Objects;

public class c extends a {
    public final q a;

    public c(@NonNull q qVar) {
        this.a = qVar;
    }

    @Nullable
    public Date a() {
        q qVar = this.a;
        Objects.requireNonNull(qVar);
        if (!(qVar instanceof v)) {
            return null;
        }
        return new Date(Long.parseLong(this.a.p()) * 1000);
    }

    @Nullable
    public String b() {
        q qVar = this.a;
        Objects.requireNonNull(qVar);
        if (!(qVar instanceof v)) {
            return null;
        }
        return this.a.p();
    }
}
