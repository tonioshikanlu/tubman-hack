package b.l.a.c.c.m;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import b.l.a.c.c.f;
import b.l.a.c.c.l.a;
import java.util.Objects;

public class m {
    public final SparseIntArray a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    public f f2802b;

    public m(@NonNull f fVar) {
        Objects.requireNonNull(fVar, "null reference");
        this.f2802b = fVar;
    }

    public int a(@NonNull Context context, @NonNull a.f fVar) {
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(fVar, "null reference");
        int i2 = 0;
        if (!fVar.m()) {
            return 0;
        }
        int n2 = fVar.n();
        int i3 = this.a.get(n2, -1);
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.a.size()) {
                i2 = i3;
                break;
            }
            int keyAt = this.a.keyAt(i4);
            if (keyAt > n2 && this.a.get(keyAt) == 0) {
                break;
            }
            i4++;
        }
        if (i2 == -1) {
            i2 = this.f2802b.b(context, n2);
        }
        this.a.put(n2, i2);
        return i2;
    }
}
