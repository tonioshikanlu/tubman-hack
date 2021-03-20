package androidx.media;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int mContentType = 0;
    public int mFlags = 0;
    public int mLegacyStream = -1;
    public int mUsage = 0;

    public AudioAttributesImplBase() {
    }

    public AudioAttributesImplBase(int i2, int i3, int i4, int i5) {
        this.mContentType = i2;
        this.mFlags = i3;
        this.mUsage = i4;
        this.mLegacyStream = i5;
    }

    public static AudioAttributesImpl fromBundle(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new AudioAttributesImplBase(bundle.getInt(AudioAttributesCompat.AUDIO_ATTRIBUTES_CONTENT_TYPE, 0), bundle.getInt(AudioAttributesCompat.AUDIO_ATTRIBUTES_FLAGS, 0), bundle.getInt(AudioAttributesCompat.AUDIO_ATTRIBUTES_USAGE, 0), bundle.getInt(AudioAttributesCompat.AUDIO_ATTRIBUTES_LEGACY_STREAM_TYPE, -1));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.mContentType == audioAttributesImplBase.getContentType() && this.mFlags == audioAttributesImplBase.getFlags() && this.mUsage == audioAttributesImplBase.getUsage() && this.mLegacyStream == audioAttributesImplBase.mLegacyStream;
    }

    public Object getAudioAttributes() {
        return null;
    }

    public int getContentType() {
        return this.mContentType;
    }

    public int getFlags() {
        int i2 = this.mFlags;
        int legacyStreamType = getLegacyStreamType();
        if (legacyStreamType == 6) {
            i2 |= 4;
        } else if (legacyStreamType == 7) {
            i2 |= 1;
        }
        return i2 & AudioAttributesCompat.FLAG_ALL_PUBLIC;
    }

    public int getLegacyStreamType() {
        int i2 = this.mLegacyStream;
        return i2 != -1 ? i2 : AudioAttributesCompat.toVolumeStreamType(false, this.mFlags, this.mUsage);
    }

    public int getRawLegacyStreamType() {
        return this.mLegacyStream;
    }

    public int getUsage() {
        return this.mUsage;
    }

    public int getVolumeControlStream() {
        return AudioAttributesCompat.toVolumeStreamType(true, this.mFlags, this.mUsage);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.mContentType), Integer.valueOf(this.mFlags), Integer.valueOf(this.mUsage), Integer.valueOf(this.mLegacyStream)});
    }

    @NonNull
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(AudioAttributesCompat.AUDIO_ATTRIBUTES_USAGE, this.mUsage);
        bundle.putInt(AudioAttributesCompat.AUDIO_ATTRIBUTES_CONTENT_TYPE, this.mContentType);
        bundle.putInt(AudioAttributesCompat.AUDIO_ATTRIBUTES_FLAGS, this.mFlags);
        int i2 = this.mLegacyStream;
        if (i2 != -1) {
            bundle.putInt(AudioAttributesCompat.AUDIO_ATTRIBUTES_LEGACY_STREAM_TYPE, i2);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.mLegacyStream != -1) {
            sb.append(" stream=");
            sb.append(this.mLegacyStream);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.usageToString(this.mUsage));
        sb.append(" content=");
        sb.append(this.mContentType);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.mFlags).toUpperCase());
        return sb.toString();
    }
}
