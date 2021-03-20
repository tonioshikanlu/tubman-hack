package androidx.core.text;

import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import e.x.c.i;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljava/util/Locale;", "", "getLayoutDirection", "(Ljava/util/Locale;)I", "layoutDirection", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class LocaleKt {
    @RequiresApi(17)
    public static final int getLayoutDirection(Locale locale) {
        i.f(locale, "$this$layoutDirection");
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
