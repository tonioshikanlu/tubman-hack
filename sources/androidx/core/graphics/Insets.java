package androidx.core.graphics;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import b.e.a.a.a;

public final class Insets {
    @NonNull
    public static final Insets NONE = new Insets(0, 0, 0, 0);
    public final int bottom;
    public final int left;
    public final int right;
    public final int top;

    private Insets(int i2, int i3, int i4, int i5) {
        this.left = i2;
        this.top = i3;
        this.right = i4;
        this.bottom = i5;
    }

    @NonNull
    public static Insets of(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? NONE : new Insets(i2, i3, i4, i5);
    }

    @NonNull
    public static Insets of(@NonNull Rect rect) {
        return of(rect.left, rect.top, rect.right, rect.bottom);
    }

    @RequiresApi(api = 29)
    @NonNull
    public static Insets toCompatInsets(@NonNull android.graphics.Insets insets) {
        return of(insets.left, insets.top, insets.right, insets.bottom);
    }

    @RequiresApi(api = 29)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NonNull
    @Deprecated
    public static Insets wrap(@NonNull android.graphics.Insets insets) {
        return toCompatInsets(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Insets.class != obj.getClass()) {
            return false;
        }
        Insets insets = (Insets) obj;
        return this.bottom == insets.bottom && this.left == insets.left && this.right == insets.right && this.top == insets.top;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    @RequiresApi(api = 29)
    @NonNull
    public android.graphics.Insets toPlatformInsets() {
        return android.graphics.Insets.of(this.left, this.top, this.right, this.bottom);
    }

    public String toString() {
        StringBuilder y = a.y("Insets{left=");
        y.append(this.left);
        y.append(", top=");
        y.append(this.top);
        y.append(", right=");
        y.append(this.right);
        y.append(", bottom=");
        y.append(this.bottom);
        y.append('}');
        return y.toString();
    }
}
