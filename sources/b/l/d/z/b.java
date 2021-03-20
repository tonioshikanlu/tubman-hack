package b.l.d.z;

import java.util.Locale;

public final class b extends Exception {
    public b(String str) {
        super(str);
        if (str != null) {
            str.toLowerCase(Locale.US).hashCode();
        }
    }
}
