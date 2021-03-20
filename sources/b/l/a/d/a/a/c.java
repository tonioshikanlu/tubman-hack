package b.l.a.d.a.a;

import androidx.annotation.NonNull;

public abstract class c {
    @NonNull
    public static c c(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        Boolean bool = Boolean.FALSE;
        String str = "";
        if (valueOf == null) {
            str = str.concat(" appUpdateType");
        }
        if (bool == null) {
            str = String.valueOf(str).concat(" allowAssetPackDeletion");
        }
        if (str.isEmpty()) {
            return new t(valueOf.intValue(), bool.booleanValue());
        }
        throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
    }

    public abstract boolean a();

    public abstract int b();
}
