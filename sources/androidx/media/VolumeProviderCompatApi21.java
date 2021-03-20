package androidx.media;

import android.media.VolumeProvider;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
public class VolumeProviderCompatApi21 {

    public interface Delegate {
        void onAdjustVolume(int i2);

        void onSetVolumeTo(int i2);
    }

    private VolumeProviderCompatApi21() {
    }

    public static Object createVolumeProvider(int i2, int i3, int i4, final Delegate delegate) {
        return new VolumeProvider(i2, i3, i4) {
            public void onAdjustVolume(int i2) {
                delegate.onAdjustVolume(i2);
            }

            public void onSetVolumeTo(int i2) {
                delegate.onSetVolumeTo(i2);
            }
        };
    }

    public static void setCurrentVolume(Object obj, int i2) {
        ((VolumeProvider) obj).setCurrentVolume(i2);
    }
}
