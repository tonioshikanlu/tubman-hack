package b.l.f.x.a.i.b;

import android.hardware.Camera;
import android.util.Log;

public final class a {
    public static final String a = "b.l.f.x.a.i.b.a";

    public static int a(int i2) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(a, "No cameras!");
            return -1;
        }
        boolean z = i2 >= 0;
        if (!z) {
            i2 = 0;
            while (i2 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i2, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i2++;
            }
        }
        return i2 < numberOfCameras ? i2 : z ? -1 : 0;
    }
}
