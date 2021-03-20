package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class CursorWindowCompat {
    private CursorWindowCompat() {
    }

    @NonNull
    public static CursorWindow create(@Nullable String str, long j2) {
        return Build.VERSION.SDK_INT >= 28 ? new CursorWindow(str, j2) : new CursorWindow(str);
    }
}
