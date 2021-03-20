package androidx.core.os;

import android.os.Environment;
import androidx.annotation.NonNull;
import java.io.File;

public final class EnvironmentCompat {
    public static final String MEDIA_UNKNOWN = "unknown";
    private static final String TAG = "EnvironmentCompat";

    private EnvironmentCompat() {
    }

    @NonNull
    public static String getStorageState(@NonNull File file) {
        return Environment.getExternalStorageState(file);
    }
}
