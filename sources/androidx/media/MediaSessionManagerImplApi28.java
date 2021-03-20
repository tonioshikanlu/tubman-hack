package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;
import androidx.media.MediaSessionManager;

@RequiresApi(28)
public class MediaSessionManagerImplApi28 extends MediaSessionManagerImplApi21 {
    public MediaSessionManager mObject;

    public static final class RemoteUserInfoImplApi28 implements MediaSessionManager.RemoteUserInfoImpl {
        public final MediaSessionManager.RemoteUserInfo mObject;

        public RemoteUserInfoImplApi28(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.mObject = remoteUserInfo;
        }

        public RemoteUserInfoImplApi28(String str, int i2, int i3) {
            this.mObject = new MediaSessionManager.RemoteUserInfo(str, i2, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteUserInfoImplApi28)) {
                return false;
            }
            return this.mObject.equals(((RemoteUserInfoImplApi28) obj).mObject);
        }

        public String getPackageName() {
            return this.mObject.getPackageName();
        }

        public int getPid() {
            return this.mObject.getPid();
        }

        public int getUid() {
            return this.mObject.getUid();
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.mObject);
        }
    }

    public MediaSessionManagerImplApi28(Context context) {
        super(context);
        this.mObject = (android.media.session.MediaSessionManager) context.getSystemService("media_session");
    }

    public boolean isTrustedForMediaControl(MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
        if (remoteUserInfoImpl instanceof RemoteUserInfoImplApi28) {
            return this.mObject.isTrustedForMediaControl(((RemoteUserInfoImplApi28) remoteUserInfoImpl).mObject);
        }
        return false;
    }
}
