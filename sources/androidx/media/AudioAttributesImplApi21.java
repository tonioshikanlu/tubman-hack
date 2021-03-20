package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import b.e.a.a.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(21)
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    private static final String TAG = "AudioAttributesCompat21";
    public static Method sAudioAttributesToLegacyStreamType;
    public AudioAttributes mAudioAttributes;
    public int mLegacyStreamType;

    public AudioAttributesImplApi21() {
        this.mLegacyStreamType = -1;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i2) {
        this.mLegacyStreamType = -1;
        this.mAudioAttributes = audioAttributes;
        this.mLegacyStreamType = i2;
    }

    public static AudioAttributesImpl fromBundle(Bundle bundle) {
        AudioAttributes audioAttributes;
        if (bundle == null || (audioAttributes = (AudioAttributes) bundle.getParcelable(AudioAttributesCompat.AUDIO_ATTRIBUTES_FRAMEWORKS)) == null) {
            return null;
        }
        return new AudioAttributesImplApi21(audioAttributes, bundle.getInt(AudioAttributesCompat.AUDIO_ATTRIBUTES_LEGACY_STREAM_TYPE, -1));
    }

    public static Method getAudioAttributesToLegacyStreamTypeMethod() {
        try {
            if (sAudioAttributesToLegacyStreamType == null) {
                sAudioAttributesToLegacyStreamType = AudioAttributes.class.getMethod("toLegacyStreamType", new Class[]{AudioAttributes.class});
            }
            return sAudioAttributesToLegacyStreamType;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.mAudioAttributes.equals(((AudioAttributesImplApi21) obj).mAudioAttributes);
    }

    public Object getAudioAttributes() {
        return this.mAudioAttributes;
    }

    public int getContentType() {
        return this.mAudioAttributes.getContentType();
    }

    public int getFlags() {
        return this.mAudioAttributes.getFlags();
    }

    public int getLegacyStreamType() {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.mLegacyStreamType;
        if (i3 != -1) {
            return i3;
        }
        Method audioAttributesToLegacyStreamTypeMethod = getAudioAttributesToLegacyStreamTypeMethod();
        if (audioAttributesToLegacyStreamTypeMethod == null) {
            Log.w(TAG, "No AudioAttributes#toLegacyStreamType() on API: " + i2);
            return -1;
        }
        try {
            return ((Integer) audioAttributesToLegacyStreamTypeMethod.invoke((Object) null, new Object[]{this.mAudioAttributes})).intValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            Log.w(TAG, "getLegacyStreamType() failed on API: " + i2, e2);
            return -1;
        }
    }

    public int getRawLegacyStreamType() {
        return this.mLegacyStreamType;
    }

    public int getUsage() {
        return this.mAudioAttributes.getUsage();
    }

    public int getVolumeControlStream() {
        return Build.VERSION.SDK_INT >= 26 ? this.mAudioAttributes.getVolumeControlStream() : AudioAttributesCompat.toVolumeStreamType(true, getFlags(), getUsage());
    }

    public int hashCode() {
        return this.mAudioAttributes.hashCode();
    }

    @NonNull
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(AudioAttributesCompat.AUDIO_ATTRIBUTES_FRAMEWORKS, this.mAudioAttributes);
        int i2 = this.mLegacyStreamType;
        if (i2 != -1) {
            bundle.putInt(AudioAttributesCompat.AUDIO_ATTRIBUTES_LEGACY_STREAM_TYPE, i2);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder y = a.y("AudioAttributesCompat: audioattributes=");
        y.append(this.mAudioAttributes);
        return y.toString();
    }
}
