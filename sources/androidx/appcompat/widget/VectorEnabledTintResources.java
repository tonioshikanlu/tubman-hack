package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class VectorEnabledTintResources extends Resources {
    public static final int MAX_SDK_WHERE_REQUIRED = 20;
    private static boolean sCompatVectorFromResourcesEnabled = false;
    private final WeakReference<Context> mContextRef;

    public VectorEnabledTintResources(@NonNull Context context, @NonNull Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.mContextRef = new WeakReference<>(context);
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        return sCompatVectorFromResourcesEnabled;
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z) {
        sCompatVectorFromResourcesEnabled = z;
    }

    public static boolean shouldBeUsed() {
        boolean isCompatVectorFromResourcesEnabled = isCompatVectorFromResourcesEnabled();
        return false;
    }

    public Drawable getDrawable(int i2) {
        Context context = (Context) this.mContextRef.get();
        return context != null ? ResourceManagerInternal.get().onDrawableLoadedFromResources(context, this, i2) : super.getDrawable(i2);
    }

    public final Drawable superGetDrawable(int i2) {
        return super.getDrawable(i2);
    }
}
