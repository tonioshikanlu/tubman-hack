package b.o.u4.f;

import androidx.annotation.NonNull;

public enum c {
    DIRECT,
    INDIRECT,
    UNATTRIBUTED,
    DISABLED;

    @NonNull
    public static c d(String str) {
        c cVar = UNATTRIBUTED;
        if (str != null && !str.isEmpty()) {
            c[] values = values();
            for (int i2 = 0; i2 < 4; i2++) {
                c cVar2 = values[i2];
                if (cVar2.name().equalsIgnoreCase(str)) {
                    return cVar2;
                }
            }
        }
        return cVar;
    }

    public boolean e() {
        return h() || j();
    }

    public boolean h() {
        return equals(DIRECT);
    }

    public boolean j() {
        return equals(INDIRECT);
    }
}
