package b.l.f.x.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.util.Log;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import java.io.IOException;

public final class c {
    public static final String c = "c";
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5798b = true;

    public class a implements MediaPlayer.OnCompletionListener {
        public a(c cVar) {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }

    public class b implements MediaPlayer.OnErrorListener {
        public b(c cVar) {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
            String str = c.c;
            Log.w(str, "Failed to beep " + i2 + ", " + i3);
            mediaPlayer.stop();
            mediaPlayer.release();
            return true;
        }
    }

    public c(Activity activity) {
        activity.setVolumeControlStream(3);
        this.a = activity.getApplicationContext();
    }

    public MediaPlayer a() {
        AssetFileDescriptor openRawResourceFd;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(new a(this));
        mediaPlayer.setOnErrorListener(new b(this));
        try {
            openRawResourceFd = this.a.getResources().openRawResourceFd(R.raw.zxing_beep);
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setVolume(0.1f, 0.1f);
            mediaPlayer.prepare();
            mediaPlayer.start();
            return mediaPlayer;
        } catch (IOException e2) {
            Log.w(c, e2);
            mediaPlayer.release();
            return null;
        } catch (Throwable th) {
            openRawResourceFd.close();
            throw th;
        }
    }
}
