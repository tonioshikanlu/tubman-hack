package b.l.a.c.f.e;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class r0 extends z0 {
    public r0(int i2) {
        super(i2);
    }

    public final void a() {
        if (!this.f3433k) {
            for (int i2 = 0; i2 < b(); i2++) {
                Map.Entry c = c(i2);
                if (((jn) c.getKey()).c()) {
                    c.setValue(Collections.unmodifiableList((List) c.getValue()));
                }
            }
            for (Map.Entry entry : this.f3432j.isEmpty() ? u0.f3317b : this.f3432j.entrySet()) {
                if (((jn) entry.getKey()).c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
