package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.core.util.Pair;

public final class PaintCompat {
    private static final String EM_STRING = "m";
    private static final String TOFU_STRING = "󟿽";
    private static final ThreadLocal<Pair<Rect, Rect>> sRectThreadLocal = new ThreadLocal<>();

    private PaintCompat() {
    }

    public static boolean hasGlyph(@NonNull Paint paint, @NonNull String str) {
        return paint.hasGlyph(str);
    }

    private static Pair<Rect, Rect> obtainEmptyRects() {
        ThreadLocal<Pair<Rect, Rect>> threadLocal = sRectThreadLocal;
        Pair<Rect, Rect> pair = threadLocal.get();
        if (pair == null) {
            Pair<Rect, Rect> pair2 = new Pair<>(new Rect(), new Rect());
            threadLocal.set(pair2);
            return pair2;
        }
        ((Rect) pair.first).setEmpty();
        ((Rect) pair.second).setEmpty();
        return pair;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.graphics.BlendMode} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.graphics.Xfermode] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean setBlendMode(@androidx.annotation.NonNull android.graphics.Paint r4, @androidx.annotation.Nullable androidx.core.graphics.BlendModeCompat r5) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 29
            if (r0 < r3) goto L_0x0012
            if (r5 == 0) goto L_0x000e
            android.graphics.BlendMode r2 = androidx.core.graphics.BlendModeUtils.obtainBlendModeFromCompat(r5)
        L_0x000e:
            r4.setBlendMode(r2)
            return r1
        L_0x0012:
            if (r5 == 0) goto L_0x0027
            android.graphics.PorterDuff$Mode r5 = androidx.core.graphics.BlendModeUtils.obtainPorterDuffFromCompat(r5)
            if (r5 == 0) goto L_0x001f
            android.graphics.PorterDuffXfermode r2 = new android.graphics.PorterDuffXfermode
            r2.<init>(r5)
        L_0x001f:
            r4.setXfermode(r2)
            if (r5 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            return r1
        L_0x0027:
            r4.setXfermode(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.PaintCompat.setBlendMode(android.graphics.Paint, androidx.core.graphics.BlendModeCompat):boolean");
    }
}
