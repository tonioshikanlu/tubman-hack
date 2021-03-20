package androidx.core.os;

import android.content.res.Configuration;
import androidx.annotation.NonNull;

public final class ConfigurationCompat {
    private ConfigurationCompat() {
    }

    @NonNull
    public static LocaleListCompat getLocales(@NonNull Configuration configuration) {
        return LocaleListCompat.wrap(configuration.getLocales());
    }
}
