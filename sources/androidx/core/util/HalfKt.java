package androidx.core.util;

import android.util.Half;
import androidx.annotation.RequiresApi;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\b¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0006H\b¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\bH\b¢\u0006\u0004\b\u0002\u0010\t¨\u0006\n"}, d2 = {"", "Landroid/util/Half;", "toHalf", "(S)Landroid/util/Half;", "", "(F)Landroid/util/Half;", "", "(D)Landroid/util/Half;", "", "(Ljava/lang/String;)Landroid/util/Half;", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class HalfKt {
    @RequiresApi(26)
    public static final Half toHalf(double d) {
        Half valueOf = Half.valueOf((float) d);
        i.b(valueOf, "Half.valueOf(this)");
        return valueOf;
    }

    @RequiresApi(26)
    public static final Half toHalf(float f) {
        Half valueOf = Half.valueOf(f);
        i.b(valueOf, "Half.valueOf(this)");
        return valueOf;
    }

    @RequiresApi(26)
    public static final Half toHalf(String str) {
        i.f(str, "$this$toHalf");
        Half valueOf = Half.valueOf(str);
        i.b(valueOf, "Half.valueOf(this)");
        return valueOf;
    }

    @RequiresApi(26)
    public static final Half toHalf(short s) {
        Half valueOf = Half.valueOf(s);
        i.b(valueOf, "Half.valueOf(this)");
        return valueOf;
    }
}
