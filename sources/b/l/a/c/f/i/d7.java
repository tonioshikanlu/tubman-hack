package b.l.a.c.f.i;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class d7 extends k7 {
    public d7(int i2) {
        super(i2);
    }

    public final void a() {
        if (!this.f3637k) {
            for (int i2 = 0; i2 < b(); i2++) {
                Map.Entry c = c(i2);
                if (((g5) c.getKey()).c()) {
                    c.setValue(Collections.unmodifiableList((List) c.getValue()));
                }
            }
            for (Map.Entry entry : this.f3636j.isEmpty() ? g7.f3571b : this.f3636j.entrySet()) {
                if (((g5) entry.getKey()).c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
