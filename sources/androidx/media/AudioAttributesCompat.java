package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcelable;
import b.e.a.a.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AudioAttributesCompat implements VersionedParcelable {
    public static final String AUDIO_ATTRIBUTES_CONTENT_TYPE = "androidx.media.audio_attrs.CONTENT_TYPE";
    public static final String AUDIO_ATTRIBUTES_FLAGS = "androidx.media.audio_attrs.FLAGS";
    public static final String AUDIO_ATTRIBUTES_FRAMEWORKS = "androidx.media.audio_attrs.FRAMEWORKS";
    public static final String AUDIO_ATTRIBUTES_LEGACY_STREAM_TYPE = "androidx.media.audio_attrs.LEGACY_STREAM_TYPE";
    public static final String AUDIO_ATTRIBUTES_USAGE = "androidx.media.audio_attrs.USAGE";
    public static final int CONTENT_TYPE_MOVIE = 3;
    public static final int CONTENT_TYPE_MUSIC = 2;
    public static final int CONTENT_TYPE_SONIFICATION = 4;
    public static final int CONTENT_TYPE_SPEECH = 1;
    public static final int CONTENT_TYPE_UNKNOWN = 0;
    public static final int FLAG_ALL = 1023;
    public static final int FLAG_ALL_PUBLIC = 273;
    public static final int FLAG_AUDIBILITY_ENFORCED = 1;
    public static final int FLAG_BEACON = 8;
    public static final int FLAG_BYPASS_INTERRUPTION_POLICY = 64;
    public static final int FLAG_BYPASS_MUTE = 128;
    public static final int FLAG_DEEP_BUFFER = 512;
    public static final int FLAG_HW_AV_SYNC = 16;
    public static final int FLAG_HW_HOTWORD = 32;
    public static final int FLAG_LOW_LATENCY = 256;
    public static final int FLAG_SCO = 4;
    public static final int FLAG_SECURE = 2;
    public static final int INVALID_STREAM_TYPE = -1;
    private static final int[] SDK_USAGES = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    private static final int SUPPRESSIBLE_CALL = 2;
    private static final int SUPPRESSIBLE_NOTIFICATION = 1;
    private static final SparseIntArray SUPPRESSIBLE_USAGES;
    private static final String TAG = "AudioAttributesCompat";
    public static final int USAGE_ALARM = 4;
    public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
    public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
    public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
    public static final int USAGE_ASSISTANT = 16;
    public static final int USAGE_GAME = 14;
    public static final int USAGE_MEDIA = 1;
    public static final int USAGE_NOTIFICATION = 5;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
    public static final int USAGE_NOTIFICATION_EVENT = 10;
    public static final int USAGE_NOTIFICATION_RINGTONE = 6;
    public static final int USAGE_UNKNOWN = 0;
    private static final int USAGE_VIRTUAL_SOURCE = 15;
    public static final int USAGE_VOICE_COMMUNICATION = 2;
    public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
    public static boolean sForceLegacyBehavior;
    public AudioAttributesImpl mImpl;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface AttributeContentType {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface AttributeUsage {
    }

    public static abstract class AudioManagerHidden {
        public static final int STREAM_ACCESSIBILITY = 10;
        public static final int STREAM_BLUETOOTH_SCO = 6;
        public static final int STREAM_SYSTEM_ENFORCED = 7;
        public static final int STREAM_TTS = 9;

        private AudioManagerHidden() {
        }
    }

    public static class Builder {
        private int mContentType = 0;
        private int mFlags = 0;
        private int mLegacyStream = -1;
        private int mUsage = 0;

        public Builder() {
        }

        public Builder(AudioAttributesCompat audioAttributesCompat) {
            this.mUsage = audioAttributesCompat.getUsage();
            this.mContentType = audioAttributesCompat.getContentType();
            this.mFlags = audioAttributesCompat.getFlags();
            this.mLegacyStream = audioAttributesCompat.getRawLegacyStreamType();
        }

        public AudioAttributesCompat build() {
            AudioAttributesImpl audioAttributesImpl;
            if (!AudioAttributesCompat.sForceLegacyBehavior) {
                AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.mContentType).setFlags(this.mFlags).setUsage(this.mUsage);
                int i2 = this.mLegacyStream;
                if (i2 != -1) {
                    usage.setLegacyStreamType(i2);
                }
                audioAttributesImpl = new AudioAttributesImplApi21(usage.build(), this.mLegacyStream);
            } else {
                audioAttributesImpl = new AudioAttributesImplBase(this.mContentType, this.mFlags, this.mUsage, this.mLegacyStream);
            }
            return new AudioAttributesCompat(audioAttributesImpl);
        }

        public Builder setContentType(int i2) {
            if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                this.mContentType = i2;
            } else {
                this.mUsage = 0;
            }
            return this;
        }

        public Builder setFlags(int i2) {
            this.mFlags = (i2 & AudioAttributesCompat.FLAG_ALL) | this.mFlags;
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
            r3.mContentType = 4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
            r3.mContentType = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
            r3.mUsage = androidx.media.AudioAttributesCompat.usageForStreamType(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
            return r3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.media.AudioAttributesCompat.Builder setInternalLegacyStreamType(int r4) {
            /*
                r3 = this;
                r0 = 1
                r1 = 4
                switch(r4) {
                    case 0: goto L_0x0034;
                    case 1: goto L_0x0031;
                    case 2: goto L_0x0031;
                    case 3: goto L_0x002f;
                    case 4: goto L_0x0031;
                    case 5: goto L_0x0031;
                    case 6: goto L_0x0027;
                    case 7: goto L_0x0021;
                    case 8: goto L_0x0031;
                    case 9: goto L_0x0031;
                    case 10: goto L_0x0034;
                    default: goto L_0x0005;
                }
            L_0x0005:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Invalid stream type "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " for AudioAttributesCompat"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "AudioAttributesCompat"
                android.util.Log.e(r1, r0)
                goto L_0x0036
            L_0x0021:
                int r2 = r3.mFlags
                r0 = r0 | r2
                r3.mFlags = r0
                goto L_0x0031
            L_0x0027:
                r3.mContentType = r0
                int r0 = r3.mFlags
                r0 = r0 | r1
                r3.mFlags = r0
                goto L_0x0036
            L_0x002f:
                r0 = 2
                goto L_0x0034
            L_0x0031:
                r3.mContentType = r1
                goto L_0x0036
            L_0x0034:
                r3.mContentType = r0
            L_0x0036:
                int r4 = androidx.media.AudioAttributesCompat.usageForStreamType(r4)
                r3.mUsage = r4
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media.AudioAttributesCompat.Builder.setInternalLegacyStreamType(int):androidx.media.AudioAttributesCompat$Builder");
        }

        public Builder setLegacyStreamType(int i2) {
            if (i2 != 10) {
                this.mLegacyStream = i2;
                return setInternalLegacyStreamType(i2);
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }

        public Builder setUsage(int i2) {
            switch (i2) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                case 16:
                    if (AudioAttributesCompat.sForceLegacyBehavior || Build.VERSION.SDK_INT <= 25) {
                        i2 = 12;
                        break;
                    }
                default:
                    i2 = 0;
                    break;
            }
            this.mUsage = i2;
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        SUPPRESSIBLE_USAGES = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public AudioAttributesCompat() {
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.mImpl = audioAttributesImpl;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static AudioAttributesCompat fromBundle(Bundle bundle) {
        AudioAttributesImpl fromBundle = AudioAttributesImplApi21.fromBundle(bundle);
        if (fromBundle == null) {
            return null;
        }
        return new AudioAttributesCompat(fromBundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void setForceLegacyBehavior(boolean z) {
        sForceLegacyBehavior = z;
    }

    public static int toVolumeStreamType(boolean z, int i2, int i3) {
        if ((i2 & 1) == 1) {
            return z ? 1 : 7;
        }
        if ((i2 & 4) == 4) {
            return z ? 0 : 6;
        }
        switch (i3) {
            case 0:
                return z ? Integer.MIN_VALUE : 3;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            default:
                if (!z) {
                    return 3;
                }
                throw new IllegalArgumentException(a.h("Unknown usage value ", i3, " in audio attributes"));
        }
    }

    public static int toVolumeStreamType(boolean z, AudioAttributesCompat audioAttributesCompat) {
        return toVolumeStreamType(z, audioAttributesCompat.getFlags(), audioAttributesCompat.getUsage());
    }

    public static int usageForStreamType(int i2) {
        switch (i2) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    public static String usageToString(int i2) {
        switch (i2) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 16:
                return "USAGE_ASSISTANT";
            default:
                return a.g("unknown usage ", i2);
        }
    }

    @Nullable
    public static AudioAttributesCompat wrap(@NonNull Object obj) {
        if (sForceLegacyBehavior) {
            return null;
        }
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21((AudioAttributes) obj);
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.mImpl = audioAttributesImplApi21;
        return audioAttributesCompat;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.mImpl;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).mImpl;
        return audioAttributesImpl == null ? audioAttributesImpl2 == null : audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public int getContentType() {
        return this.mImpl.getContentType();
    }

    public int getFlags() {
        return this.mImpl.getFlags();
    }

    public int getLegacyStreamType() {
        return this.mImpl.getLegacyStreamType();
    }

    public int getRawLegacyStreamType() {
        return this.mImpl.getRawLegacyStreamType();
    }

    public int getUsage() {
        return this.mImpl.getUsage();
    }

    public int getVolumeControlStream() {
        return this.mImpl.getVolumeControlStream();
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Bundle toBundle() {
        return this.mImpl.toBundle();
    }

    public String toString() {
        return this.mImpl.toString();
    }

    @Nullable
    public Object unwrap() {
        return this.mImpl.getAudioAttributes();
    }
}
