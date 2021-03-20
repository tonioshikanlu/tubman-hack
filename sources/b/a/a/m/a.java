package b.a.a.m;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import b.f.a.e;
import e.x.c.i;
import java.util.Hashtable;

public final class a {
    public final Hashtable<String, Typeface> a = new Hashtable<>();

    public static Typeface a(a aVar, String str, int i2, int i3) {
        Typeface typeface;
        StringBuilder sb;
        AssetManager assetManager;
        boolean z = false;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        Typeface typeface2 = aVar.a.get(str);
        if (typeface2 == null) {
            if (str != null) {
                try {
                    if (i.a(str, "01DZ4603S1A99S0MKRX805Z15F") || i.a(str, "01DZ4603RX0X7SJMZFXAMWZQ4T")) {
                        z = true;
                    }
                } catch (Exception unused) {
                    return null;
                }
            }
            if (z) {
                assetManager = e.c().getAssets();
                sb = new StringBuilder();
                sb.append("fonts/");
                sb.append(str);
                sb.append(".otf");
            } else if (i2 == 1) {
                assetManager = e.c().getAssets();
                sb = new StringBuilder();
                sb.append("fonts/");
                sb.append(str);
            } else {
                typeface = Typeface.createFromFile(e.C() + str);
                typeface2 = typeface;
                aVar.a.put(str, typeface2);
            }
            typeface = Typeface.createFromAsset(assetManager, sb.toString());
            typeface2 = typeface;
            aVar.a.put(str, typeface2);
        }
        return typeface2;
    }
}
