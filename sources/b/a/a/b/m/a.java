package b.a.a.b.m;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.MediaController;
import e.x.c.i;
import java.io.IOException;
import java.util.Objects;
import kotlin.Metadata;
import q.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0014\t/J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\nJ\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u001eH\u0016¢\u0006\u0004\b&\u0010 J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 J\u000f\u0010(\u001a\u00020\u001eH\u0016¢\u0006\u0004\b(\u0010 J\u000f\u0010)\u001a\u00020\"H\u0016¢\u0006\u0004\b)\u0010$J\u000f\u0010*\u001a\u00020\"H\u0016¢\u0006\u0004\b*\u0010$J\u0017\u0010-\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0006¢\u0006\u0004\b/\u0010\nJ'\u00103\u001a\u00020\u00062\u0006\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\"H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010\nJ\u0017\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u00020\"H\u0016¢\u0006\u0004\b7\u00108J'\u00109\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+2\u0006\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\"H\u0016¢\u0006\u0004\b9\u00104J\u0017\u0010:\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010=R$\u0010O\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bP\u0010=R\u0016\u0010S\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u0010=R\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006\\"}, d2 = {"Lb/a/a/b/m/a;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/widget/MediaController$MediaPlayerControl;", "Lb/a/a/b/m/a$b;", "scaleType", "Le/r;", "setScaleType", "(Lb/a/a/b/m/a$b;)V", "b", "()V", "d", "", "viewSize", "", "sx", "sy", "px", "py", "Landroid/graphics/Matrix;", "a", "(Ljava/lang/Object;FFFF)Landroid/graphics/Matrix;", "", "path", "setDataSource", "(Ljava/lang/String;)V", "Lb/a/a/b/m/a$a;", "listener", "setListener", "(Lb/a/a/b/m/a$a;)V", "", "isPlaying", "()Z", "start", "", "getCurrentPosition", "()I", "getBufferPercentage", "canPause", "canSeekBackward", "canSeekForward", "getAudioSessionId", "getDuration", "Landroid/graphics/SurfaceTexture;", "surface", "onSurfaceTextureDestroyed", "(Landroid/graphics/SurfaceTexture;)Z", "c", "surfaceTexture", "width", "height", "onSurfaceTextureAvailable", "(Landroid/graphics/SurfaceTexture;II)V", "pause", "milliseconds", "seekTo", "(I)V", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "(Landroid/graphics/SurfaceTexture;)V", "k", "Z", "mIsVideoPrepared", "p", "Lb/a/a/b/m/a$a;", "mListener", "Landroid/view/Surface;", "n", "Landroid/view/Surface;", "mSurface", "i", "mIsDataSourceSet", "Landroid/widget/ImageView;", "o", "Landroid/widget/ImageView;", "getThumbnail", "()Landroid/widget/ImageView;", "setThumbnail", "(Landroid/widget/ImageView;)V", "thumbnail", "l", "mIsPlayCalled", "j", "mIsViewAvailable", "Lb/a/a/b/m/a$c;", "m", "Lb/a/a/b/m/a$c;", "mState", "Landroid/media/MediaPlayer;", "h", "Landroid/media/MediaPlayer;", "mMediaPlayer", "app_release"}, k = 1, mv = {1, 1, 15})
public final class a extends TextureView implements TextureView.SurfaceTextureListener, MediaController.MediaPlayerControl {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ int f181q = 0;

    /* renamed from: h  reason: collision with root package name */
    public MediaPlayer f182h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f183i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f184j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f185k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f186l;

    /* renamed from: m  reason: collision with root package name */
    public c f187m;

    /* renamed from: n  reason: collision with root package name */
    public Surface f188n;

    /* renamed from: o  reason: collision with root package name */
    public ImageView f189o;

    /* renamed from: p  reason: collision with root package name */
    public C0012a f190p;

    /* renamed from: b.a.a.b.m.a$a  reason: collision with other inner class name */
    public interface C0012a {
        void a();

        void b();
    }

    public enum b {
        CENTER_CROP,
        TOP,
        BOTTOM
    }

    public enum c {
        UNINITIALIZED,
        PLAY,
        STOP,
        PAUSE,
        END
    }

    public static final class d implements MediaPlayer.OnVideoSizeChangedListener {
        public final /* synthetic */ a a;

        public d(a aVar) {
            this.a = aVar;
        }

        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
            a aVar = this.a;
            int i4 = a.f181q;
            Objects.requireNonNull(aVar);
            if (i2 != 0 && i3 != 0) {
                float width = (float) aVar.getWidth();
                float f = width / ((float) i2);
                float height = (float) aVar.getHeight();
                float f2 = height / ((float) i3);
                float max = Math.max(f, f2);
                aVar.setTransform(aVar.a(max / f, max / f2, width / 2.0f, height / 2.0f));
            }
        }
    }

    public static final class e implements MediaPlayer.OnCompletionListener {
        public final /* synthetic */ a a;

        public e(a aVar) {
            this.a = aVar;
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            this.a.f187m = c.END;
            q.a.a.d.a("Video has ended.", new Object[0]);
            C0012a aVar = this.a.f190p;
            if (aVar != null && aVar != null) {
                aVar.b();
            }
        }
    }

    public static final class f implements MediaPlayer.OnPreparedListener {
        public final /* synthetic */ a a;

        public f(a aVar) {
            this.a = aVar;
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            a.b bVar = q.a.a.d;
            bVar.a("MEDIAPLAYER PREPARED", new Object[0]);
            a aVar = this.a;
            aVar.f185k = true;
            if (aVar.f186l && aVar.f184j) {
                bVar.a("Player is prepared and play() was called.", new Object[0]);
                this.a.c();
            }
            C0012a aVar2 = this.a.f190p;
            if (!(aVar2 == null || aVar2 == null)) {
                aVar2.a();
            }
            ImageView thumbnail = this.a.getThumbnail();
            if (thumbnail != null && (animate = thumbnail.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(1000)) != null) {
                duration.start();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
        /*
            r0 = this;
            r2 = r4 & 2
            r2 = 0
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0008
            r3 = 0
        L_0x0008:
            java.lang.String r4 = "context"
            e.x.c.i.e(r1, r4)
            r0.<init>(r1, r2, r3)
            r0.b()
            b.a.a.b.m.a$b r1 = b.a.a.b.m.a.b.CENTER_CROP
            r0.setScaleType(r1)
            r0.setSurfaceTextureListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.b.m.a.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    private final void setScaleType(b bVar) {
    }

    public final Matrix a(float f2, float f3, float f4, float f5) {
        Matrix matrix = new Matrix();
        matrix.setScale(f2, f3, f4, f5);
        return matrix;
    }

    public final void b() {
        MediaPlayer mediaPlayer = this.f182h;
        if (mediaPlayer == null) {
            this.f182h = new MediaPlayer();
        } else if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
        this.f185k = false;
        this.f186l = false;
        this.f187m = c.UNINITIALIZED;
    }

    public final void c() {
        if (!this.f183i) {
            q.a.a.d.a("play() was called but data source was not set.", new Object[0]);
            return;
        }
        this.f186l = true;
        if (!this.f185k) {
            q.a.a.d.a("play() was called but video is not prepared yet, waiting.", new Object[0]);
        } else if (!this.f184j) {
            q.a.a.d.a("play() was called but view is not available yet, waiting.", new Object[0]);
        } else {
            c cVar = this.f187m;
            c cVar2 = c.PLAY;
            if (cVar == cVar2) {
                q.a.a.d.a("play() was called but video is already playing.", new Object[0]);
            } else if (cVar == c.PAUSE) {
                q.a.a.d.a("play() was called but video is paused, resuming.", new Object[0]);
                this.f187m = cVar2;
                MediaPlayer mediaPlayer = this.f182h;
                if (mediaPlayer != null) {
                    mediaPlayer.start();
                }
            } else if (cVar == c.END || cVar == c.STOP) {
                q.a.a.d.a("play() was called but video already ended, starting over.", new Object[0]);
                this.f187m = cVar2;
                MediaPlayer mediaPlayer2 = this.f182h;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.seekTo(0);
                }
                MediaPlayer mediaPlayer3 = this.f182h;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.start();
                }
            } else {
                this.f187m = cVar2;
                MediaPlayer mediaPlayer4 = this.f182h;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.start();
                }
            }
        }
    }

    public boolean canPause() {
        return true;
    }

    public boolean canSeekBackward() {
        return false;
    }

    public boolean canSeekForward() {
        return false;
    }

    public final void d() {
        try {
            MediaPlayer mediaPlayer = this.f182h;
            if (mediaPlayer != null) {
                mediaPlayer.setLooping(true);
            }
            MediaPlayer mediaPlayer2 = this.f182h;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setOnVideoSizeChangedListener(new d(this));
            }
            MediaPlayer mediaPlayer3 = this.f182h;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setOnCompletionListener(new e(this));
            }
            MediaPlayer mediaPlayer4 = this.f182h;
            if (mediaPlayer4 != null) {
                mediaPlayer4.prepareAsync();
            }
            MediaPlayer mediaPlayer5 = this.f182h;
            if (mediaPlayer5 != null) {
                mediaPlayer5.setOnPreparedListener(new f(this));
            }
        } catch (IllegalArgumentException e2) {
            q.a.a.d.b("IllegalArgumentException %s", e2.getMessage());
        } catch (SecurityException e3) {
            q.a.a.d.b("SecurityException %s", e3.getMessage());
        } catch (IllegalStateException e4) {
            q.a.a.d.b("IllegalStateException %s", e4.toString());
        }
    }

    public int getAudioSessionId() {
        return 0;
    }

    public int getBufferPercentage() {
        MediaPlayer mediaPlayer = this.f182h;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentPosition() {
        return 0;
    }

    public int getDuration() {
        MediaPlayer mediaPlayer = this.f182h;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration();
        }
        return 0;
    }

    public final ImageView getThumbnail() {
        return this.f189o;
    }

    public boolean isPlaying() {
        return this.f187m == c.PLAY;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        i.e(surfaceTexture, "surfaceTexture");
        Surface surface = new Surface(surfaceTexture);
        this.f188n = surface;
        MediaPlayer mediaPlayer = this.f182h;
        if (mediaPlayer != null) {
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(surface);
            }
            this.f184j = true;
            if (this.f183i && this.f186l && this.f185k) {
                c();
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        i.e(surfaceTexture, "surface");
        Surface surface = this.f188n;
        if (surface != null) {
            if (surface != null) {
                surface.release();
            }
            this.f188n = null;
        }
        AsyncTask.execute(new b(this));
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        i.e(surfaceTexture, "surface");
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        i.e(surfaceTexture, "surface");
    }

    public void pause() {
        MediaPlayer mediaPlayer;
        c cVar = this.f187m;
        c cVar2 = c.PAUSE;
        if (cVar == cVar2) {
            q.a.a.d.a("pause() was called but video already paused.", new Object[0]);
        } else if (cVar == c.STOP) {
            q.a.a.d.a("pause() was called but video already stopped.", new Object[0]);
        } else if (cVar == c.END) {
            q.a.a.d.a("pause() was called but video already ended.", new Object[0]);
        } else {
            this.f187m = cVar2;
            MediaPlayer mediaPlayer2 = this.f182h;
            if (mediaPlayer2 != null && mediaPlayer2.isPlaying() && (mediaPlayer = this.f182h) != null) {
                mediaPlayer.pause();
            }
        }
    }

    public void seekTo(int i2) {
        MediaPlayer mediaPlayer = this.f182h;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(i2);
        }
    }

    public final void setDataSource(String str) {
        b();
        try {
            MediaPlayer mediaPlayer = this.f182h;
            if (mediaPlayer != null) {
                mediaPlayer.setDataSource(str);
            }
            MediaPlayer mediaPlayer2 = this.f182h;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setVolume(0.0f, 0.0f);
            }
            this.f183i = true;
            d();
        } catch (IOException e2) {
            q.a.a.d.b("Error %s", e2.getLocalizedMessage());
        }
    }

    public final void setListener(C0012a aVar) {
        i.e(aVar, "listener");
        this.f190p = aVar;
    }

    public final void setThumbnail(ImageView imageView) {
        this.f189o = imageView;
    }

    public void start() {
        c();
    }
}
