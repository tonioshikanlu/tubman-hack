package b.m.a;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

public class c implements TextureView.SurfaceTextureListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ d f5892h;

    public c(d dVar) {
        this.f5892h = dVar;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        d dVar = this.f5892h;
        dVar.w = new r(i2, i3);
        dVar.h();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        d dVar = this.f5892h;
        dVar.w = new r(i2, i3);
        dVar.h();
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
