package j.a.a.a.e.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import androidx.annotation.NonNull;

public interface d {
    boolean a();

    @NonNull
    Bitmap b(@NonNull Rect rect, int i2);

    @NonNull
    Point c(Context context, @NonNull Uri uri);

    void recycle();
}
