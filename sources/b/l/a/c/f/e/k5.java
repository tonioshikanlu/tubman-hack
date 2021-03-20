package b.l.a.c.f.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.CharConversionException;
import java.io.FileNotFoundException;

public final class k5 {
    public final SharedPreferences a;

    public k5(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.a = str == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str, 0);
    }

    public final byte[] a() {
        try {
            String string = this.a.getString("GenericIdpKeyset", (String) null);
            if (string == null) {
                throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", new Object[]{"GenericIdpKeyset"}));
            } else if (string.length() % 2 == 0) {
                int length = string.length() / 2;
                byte[] bArr = new byte[length];
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 + i2;
                    int digit = Character.digit(string.charAt(i3), 16);
                    int digit2 = Character.digit(string.charAt(i3 + 1), 16);
                    if (digit == -1 || digit2 == -1) {
                        throw new IllegalArgumentException("input is not hexadecimal");
                    }
                    bArr[i2] = (byte) ((digit * 16) + digit2);
                }
                return bArr;
            } else {
                throw new IllegalArgumentException("Expected a string of even length");
            }
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{"GenericIdpKeyset"}));
        }
    }
}
