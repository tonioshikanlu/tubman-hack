package h.a.b.b;

import android.media.browse.MediaBrowser;
import androidx.annotation.NonNull;
import h.a.b.b.c;
import java.util.List;

public class d<T extends c> extends MediaBrowser.SubscriptionCallback {
    public final T a;

    public d(T t) {
        this.a = t;
    }

    public void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list) {
        this.a.c(str, list);
    }

    public void onError(@NonNull String str) {
        this.a.d(str);
    }
}
