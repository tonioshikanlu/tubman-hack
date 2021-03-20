package b.b.a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import androidx.annotation.RestrictTo;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import e.c0.h;
import e.x.c.i;

public final class c {
    public static final float a(View view, int i2) {
        i.f(view, "$this$dp");
        Resources resources = view.getResources();
        i.b(resources, "resources");
        return TypedValue.applyDimension(1, (float) i2, resources.getDisplayMetrics());
    }

    public static final int b(Context context, int i2) {
        i.e(context, "$this$getAttrId");
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return -1;
        }
        return typedValue.resourceId;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r1 = (r1 = r1.getResources()).getConfiguration();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean c(android.content.Context r1) {
        /*
            r0 = 1
            if (r1 == 0) goto L_0x0014
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L_0x0014
            android.content.res.Configuration r1 = r1.getConfiguration()
            if (r1 == 0) goto L_0x0014
            int r1 = r1.orientation
            if (r1 != r0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.c.c(android.content.Context):boolean");
    }

    public static final <T extends View> boolean d(T t) {
        i.f(t, "$this$isRtl");
        Resources resources = t.getResources();
        i.b(resources, "resources");
        Configuration configuration = resources.getConfiguration();
        i.b(configuration, "resources.configuration");
        return configuration.getLayoutDirection() == 1;
    }

    public static final boolean e(Context context) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return false;
        }
        return resources.getBoolean(R.bool.super_bottom_sheet_isTablet);
    }

    public static final <T extends View> boolean f(T t) {
        i.f(t, "$this$isVisible");
        if (t instanceof Button) {
            Button button = (Button) t;
            if (button.getVisibility() != 0) {
                return false;
            }
            CharSequence text = button.getText();
            i.b(text, "this.text");
            if (!(!h.n(h.N(text)))) {
                return false;
            }
        } else if (t.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean g(DialogActionButtonLayout dialogActionButtonLayout) {
        if (dialogActionButtonLayout == null) {
            return false;
        }
        return ((dialogActionButtonLayout.getVisibleButtons().length == 0) ^ true) || f(dialogActionButtonLayout.getCheckBoxPrompt());
    }
}
