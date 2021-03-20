package b.b.a.f;

import android.content.Context;
import android.view.View;
import androidx.annotation.DimenRes;
import androidx.annotation.RestrictTo;
import com.segment.analytics.integrations.BasePayload;
import e.x.c.i;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class b {
    public static final b a = new b();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <T extends View> int a(T t, @DimenRes int i2) {
        i.f(t, "$this$dimenPx");
        Context context = t.getContext();
        i.b(context, BasePayload.CONTEXT_KEY);
        return context.getResources().getDimensionPixelSize(i2);
    }
}
