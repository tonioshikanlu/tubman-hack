package h.a.b.b;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.NonNull;
import h.a.b.b.e;
import java.util.List;

public class f<T extends e> extends d<T> {
    public f(T t) {
        super(t);
    }

    public void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list, @NonNull Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((e) this.a).a(str, list, bundle);
    }

    public void onError(@NonNull String str, @NonNull Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((e) this.a).b(str, bundle);
    }
}
