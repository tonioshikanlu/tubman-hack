package androidx.media;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActivityChooserView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MediaBrowserCompatUtils {
    private MediaBrowserCompatUtils() {
    }

    public static boolean areSameOptions(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle2 == null ? bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }

    public static boolean hasDuplicatedItems(Bundle bundle, Bundle bundle2) {
        int i2;
        int i3;
        int i4;
        int i5 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i6 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE", -1);
        int i7 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        int i8 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        int i9 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        if (i5 == -1 || i7 == -1) {
            i2 = Integer.MAX_VALUE;
            i3 = 0;
        } else {
            i3 = i5 * i7;
            i2 = (i7 + i3) - 1;
        }
        if (i6 == -1 || i8 == -1) {
            i4 = 0;
        } else {
            i4 = i6 * i8;
            i9 = (i8 + i4) - 1;
        }
        return i2 >= i4 && i9 >= i3;
    }
}
