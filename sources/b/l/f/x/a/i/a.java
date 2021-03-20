package b.l.f.x.a.i;

import android.hardware.Camera;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

public final class a {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile(";");
    }

    public static String a(String str, Collection<String> collection, String... strArr) {
        StringBuilder C = b.e.a.a.a.C("Requesting ", str, " value from among: ");
        C.append(Arrays.toString(strArr));
        Log.i("CameraConfiguration", C.toString());
        Log.i("CameraConfiguration", "Supported " + str + " values: " + collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    Log.i("CameraConfiguration", "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    public static void b(Camera.Parameters parameters, boolean z) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String a2 = z ? a("flash mode", supportedFlashModes, "torch", "on") : a("flash mode", supportedFlashModes, "off");
        if (a2 == null) {
            return;
        }
        if (a2.equals(parameters.getFlashMode())) {
            Log.i("CameraConfiguration", "Flash mode already set to " + a2);
            return;
        }
        Log.i("CameraConfiguration", "Setting flash mode to " + a2);
        parameters.setFlashMode(a2);
    }
}
