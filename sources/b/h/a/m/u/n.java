package b.h.a.m.u;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.InputStream;

public class n extends b<InputStream> {
    public n(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void c(Object obj) {
        ((InputStream) obj).close();
    }

    public Object d(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
