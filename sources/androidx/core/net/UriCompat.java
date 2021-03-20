package androidx.core.net;

import android.net.Uri;
import androidx.annotation.NonNull;
import b.e.a.a.a;

public final class UriCompat {
    private UriCompat() {
    }

    @NonNull
    public static String toSafeString(@NonNull Uri uri) {
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (scheme != null) {
            if (scheme.equalsIgnoreCase("tel") || scheme.equalsIgnoreCase("sip") || scheme.equalsIgnoreCase("sms") || scheme.equalsIgnoreCase("smsto") || scheme.equalsIgnoreCase("mailto") || scheme.equalsIgnoreCase("nfc")) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(scheme);
                sb.append(':');
                if (schemeSpecificPart != null) {
                    for (int i2 = 0; i2 < schemeSpecificPart.length(); i2++) {
                        char charAt = schemeSpecificPart.charAt(i2);
                        if (!(charAt == '-' || charAt == '@' || charAt == '.')) {
                            charAt = 'x';
                        }
                        sb.append(charAt);
                    }
                }
                return sb.toString();
            } else if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https") || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                StringBuilder y = a.y("//");
                String str = "";
                y.append(uri.getHost() != null ? uri.getHost() : str);
                if (uri.getPort() != -1) {
                    StringBuilder y2 = a.y(":");
                    y2.append(uri.getPort());
                    str = y2.toString();
                }
                schemeSpecificPart = a.q(y, str, "/...");
            }
        }
        StringBuilder sb2 = new StringBuilder(64);
        if (scheme != null) {
            sb2.append(scheme);
            sb2.append(':');
        }
        if (schemeSpecificPart != null) {
            sb2.append(schemeSpecificPart);
        }
        return sb2.toString();
    }
}
