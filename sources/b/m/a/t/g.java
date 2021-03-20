package b.m.a.t;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;

public class g {
    public SurfaceHolder a;

    /* renamed from: b  reason: collision with root package name */
    public SurfaceTexture f5970b;

    public g(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f5970b = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }

    public g(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.a = surfaceHolder;
            return;
        }
        throw new IllegalArgumentException("surfaceHolder may not be null");
    }
}
