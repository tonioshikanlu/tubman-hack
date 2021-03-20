package androidx.appcompat.content.res;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.res.ColorStateListInflaterCompat;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
public final class AppCompatResources {
    private static final String LOG_TAG = "AppCompatResources";
    private static final ThreadLocal<TypedValue> TL_TYPED_VALUE = new ThreadLocal<>();
    private static final Object sColorStateCacheLock = new Object();
    private static final WeakHashMap<Context, SparseArray<ColorStateListCacheEntry>> sColorStateCaches = new WeakHashMap<>(0);

    public static class ColorStateListCacheEntry {
        public final Configuration configuration;
        public final ColorStateList value;

        public ColorStateListCacheEntry(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration2) {
            this.value = colorStateList;
            this.configuration = configuration2;
        }
    }

    private AppCompatResources() {
    }

    private static void addColorStateListToCache(@NonNull Context context, @ColorRes int i2, @NonNull ColorStateList colorStateList) {
        synchronized (sColorStateCacheLock) {
            WeakHashMap<Context, SparseArray<ColorStateListCacheEntry>> weakHashMap = sColorStateCaches;
            SparseArray sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i2, new ColorStateListCacheEntry(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList getCachedColorStateList(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.ColorRes int r5) {
        /*
            java.lang.Object r0 = sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<androidx.appcompat.content.res.AppCompatResources$ColorStateListCacheEntry>> r1 = sColorStateCaches     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            androidx.appcompat.content.res.AppCompatResources$ColorStateListCacheEntry r2 = (androidx.appcompat.content.res.AppCompatResources.ColorStateListCacheEntry) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.configuration     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.value     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.content.res.AppCompatResources.getCachedColorStateList(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static ColorStateList getColorStateList(@NonNull Context context, @ColorRes int i2) {
        return context.getColorStateList(i2);
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Context context, @DrawableRes int i2) {
        return ResourceManagerInternal.get().getDrawable(context, i2);
    }

    @NonNull
    private static TypedValue getTypedValue() {
        ThreadLocal<TypedValue> threadLocal = TL_TYPED_VALUE;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @Nullable
    private static ColorStateList inflateColorStateList(Context context, int i2) {
        if (isColorInt(context, i2)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return ColorStateListInflaterCompat.createFromXml(resources, resources.getXml(i2), context.getTheme());
        } catch (Exception e2) {
            Log.e(LOG_TAG, "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    private static boolean isColorInt(@NonNull Context context, @ColorRes int i2) {
        Resources resources = context.getResources();
        TypedValue typedValue = getTypedValue();
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        return i3 >= 28 && i3 <= 31;
    }
}
