package androidx.core.os;

import android.content.Context;
import android.os.UserManager;
import androidx.annotation.NonNull;

public class UserManagerCompat {
    private UserManagerCompat() {
    }

    public static boolean isUserUnlocked(@NonNull Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
