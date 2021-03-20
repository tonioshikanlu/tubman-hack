package b.l.d.u;

import androidx.annotation.NonNull;

public interface f {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: h  reason: collision with root package name */
        public final int f5300h;

        /* access modifiers changed from: public */
        a(int i2) {
            this.f5300h = i2;
        }
    }

    @NonNull
    a a(@NonNull String str);
}
